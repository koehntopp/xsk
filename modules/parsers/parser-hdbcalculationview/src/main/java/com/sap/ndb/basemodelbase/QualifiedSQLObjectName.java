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
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.basemodelbase;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Type for referencing an SQL object by schema name and (column) object name
 *
 *
 * <p>Java class for QualifiedSQLObjectName complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="QualifiedSQLObjectName"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BaseModelBase.ecore}SchemaMappingBasedObject"&gt;
 *       &lt;attribute name="columnObjectName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="concatenatedName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="sqlName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualifiedSQLObjectName")
@XmlSeeAlso({
    QualifiedColumnObjectName.class
})
public class QualifiedSQLObjectName
    extends SchemaMappingBasedObject {

  @XmlAttribute(name = "columnObjectName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String columnObjectName;
  @XmlAttribute(name = "concatenatedName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String concatenatedName;
  @XmlAttribute(name = "sqlName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String sqlName;

  /**
   * Gets the value of the columnObjectName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getColumnObjectName() {
    return columnObjectName;
  }

  /**
   * Sets the value of the columnObjectName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setColumnObjectName(String value) {
    this.columnObjectName = value;
  }

  /**
   * Gets the value of the concatenatedName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getConcatenatedName() {
    return concatenatedName;
  }

  /**
   * Sets the value of the concatenatedName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setConcatenatedName(String value) {
    this.concatenatedName = value;
  }

  /**
   * Gets the value of the sqlName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getSqlName() {
    return sqlName;
  }

  /**
   * Sets the value of the sqlName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setSqlName(String value) {
    this.sqlName = value;
  }

}
