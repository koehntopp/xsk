/*
 * Copyright (c) 2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
package com.sap.xsk.hdb.ds.processors.hdbprocedure;

import static java.text.MessageFormat.format;

import com.sap.xsk.hdb.ds.model.hdbprocedure.XSKDataStructureHDBProcedureModel;
import com.sap.xsk.hdb.ds.processors.AbstractXSKProcessor;
import com.sap.xsk.utils.XSKCommonsConstants;
import com.sap.xsk.utils.XSKCommonsUtils;
import com.sap.xsk.utils.XSKConstants;
import java.sql.Connection;
import java.sql.SQLException;
import org.eclipse.dirigible.database.sql.DatabaseArtifactTypes;
import org.eclipse.dirigible.database.sql.ISqlDialect;
import org.eclipse.dirigible.database.sql.SqlFactory;
import org.eclipse.dirigible.database.sql.dialects.hana.HanaSqlDialect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HDBProcedureDropProcessor extends AbstractXSKProcessor<XSKDataStructureHDBProcedureModel> {

  private static final Logger logger = LoggerFactory.getLogger(HDBProcedureDropProcessor.class);

  public void execute(Connection connection, XSKDataStructureHDBProcedureModel hdbProcedure)
      throws SQLException {
    logger.info("Processing Drop Procedure: " + hdbProcedure.getName());
    String procedureNameWithoutSchema = XSKCommonsUtils.extractArtifactNameWhenSchemaIsProvided(hdbProcedure.getName())[1];
    hdbProcedure.setSchema(XSKCommonsUtils.extractArtifactNameWhenSchemaIsProvided(hdbProcedure.getName())[0]);

    if (SqlFactory.getNative(connection).exists(connection, procedureNameWithoutSchema, DatabaseArtifactTypes.PROCEDURE)) {
      ISqlDialect dialect = SqlFactory.deriveDialect(connection);
      if (!(dialect.getClass().equals(HanaSqlDialect.class))) {
        String errorMessage = String.format("Procedures are not supported for %s", dialect.getDatabaseName(connection));
        XSKCommonsUtils.logProcessorErrors(errorMessage, XSKCommonsConstants.PROCESSOR_ERROR, hdbProcedure.getLocation(), XSKCommonsConstants.HDB_PROCEDURE_PARSER);
        throw new IllegalStateException(errorMessage);
      } else {
        String sql = XSKConstants.XSK_HDBPROCEDURE_DROP + hdbProcedure.getName();
        try {
          executeSql(sql, connection);
        } catch (SQLException ex) {
          XSKCommonsUtils.logProcessorErrors(ex.getMessage(), XSKCommonsConstants.PROCESSOR_ERROR, hdbProcedure.getLocation(), XSKCommonsConstants.HDB_PROCEDURE_PARSER);
        }
      }
    } else {
      logger.warn(format("Procedure [{0}] does not exists during the drop process", hdbProcedure.getName()));
    }
  }
}
