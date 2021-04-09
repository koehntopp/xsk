/*
 * Copyright (c) 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License, v2.0
 * which accompanies this distribution, and is available at
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * SPDX-FileCopyrightText: 2019-2021 SAP SE or an SAP affiliate company and XSK contributors
 * SPDX-License-Identifier: Apache-2.0
 */
//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.11.26 at 10:54:28 AM EET 
//


package com.sap.ndb.datamodeltype;

import com.sap.ndb.datamodelfilter.ValueFilter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Models select option like filters on one element. Several valueFilters are combined by OR
 *
 *
 * <p>Java class for ElementFilter complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ElementFilter"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="valueFilter" type="{http://www.sap.com/ndb/DataModelFilter.ecore}ValueFilter" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="elementName" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="enableFunctions" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ElementFilter", propOrder = {
    "valueFilter"
})
public class ElementFilter {

  @XmlElement(required = true)
  protected List<ValueFilter> valueFilter;
  @XmlAttribute(name = "elementName", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String elementName;
  @XmlAttribute(name = "enableFunctions")
  protected Boolean enableFunctions;

  /**
   * Gets the value of the valueFilter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the valueFilter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getValueFilter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ValueFilter }
   */
  public List<ValueFilter> getValueFilter() {
    if (valueFilter == null) {
      valueFilter = new ArrayList<ValueFilter>();
    }
    return this.valueFilter;
  }

  /**
   * Gets the value of the elementName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getElementName() {
    return elementName;
  }

  /**
   * Sets the value of the elementName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setElementName(String value) {
    this.elementName = value;
  }

  /**
   * Gets the value of the enableFunctions property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isEnableFunctions() {
    return enableFunctions;
  }

  /**
   * Sets the value of the enableFunctions property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setEnableFunctions(Boolean value) {
    this.enableFunctions = value;
  }

}
