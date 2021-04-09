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


package com.sap.ndb.bimodelcalculation;

import com.sap.ndb.basemodelbase.EmptyUnionBehavior;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Input complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Input"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="mapping" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}AbstractAttributeMapping" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="node" use="required" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}BIName" /&gt;
 *       &lt;attribute name="mapAll" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="emptyUnionBehavior" type="{http://www.sap.com/ndb/BaseModelBase.ecore}EmptyUnionBehavior" /&gt;
 *       &lt;attribute name="outputName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="tableParameterName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="type" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}BIName" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Input", propOrder = {
    "mapping"
})
public class Input {

  protected List<AbstractAttributeMapping> mapping;
  @XmlAttribute(name = "node", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String node;
  @XmlAttribute(name = "mapAll")
  protected Boolean mapAll;
  @XmlAttribute(name = "emptyUnionBehavior")
  protected EmptyUnionBehavior emptyUnionBehavior;
  @XmlAttribute(name = "outputName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String outputName;
  @XmlAttribute(name = "tableParameterName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String tableParameterName;
  @XmlAttribute(name = "type")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String type;

  /**
   * Gets the value of the mapping property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the mapping property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMapping().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link AbstractAttributeMapping }
   */
  public List<AbstractAttributeMapping> getMapping() {
    if (mapping == null) {
      mapping = new ArrayList<AbstractAttributeMapping>();
    }
    return this.mapping;
  }

  /**
   * Gets the value of the node property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getNode() {
    return node;
  }

  /**
   * Sets the value of the node property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setNode(String value) {
    this.node = value;
  }

  /**
   * Gets the value of the mapAll property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isMapAll() {
    return mapAll;
  }

  /**
   * Sets the value of the mapAll property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setMapAll(Boolean value) {
    this.mapAll = value;
  }

  /**
   * Gets the value of the emptyUnionBehavior property.
   *
   * @return possible object is
   * {@link EmptyUnionBehavior }
   */
  public EmptyUnionBehavior getEmptyUnionBehavior() {
    return emptyUnionBehavior;
  }

  /**
   * Sets the value of the emptyUnionBehavior property.
   *
   * @param value allowed object is
   *              {@link EmptyUnionBehavior }
   */
  public void setEmptyUnionBehavior(EmptyUnionBehavior value) {
    this.emptyUnionBehavior = value;
  }

  /**
   * Gets the value of the outputName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOutputName() {
    return outputName;
  }

  /**
   * Sets the value of the outputName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOutputName(String value) {
    this.outputName = value;
  }

  /**
   * Gets the value of the tableParameterName property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getTableParameterName() {
    return tableParameterName;
  }

  /**
   * Sets the value of the tableParameterName property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setTableParameterName(String value) {
    this.tableParameterName = value;
  }

  /**
   * Gets the value of the type property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getType() {
    return type;
  }

  /**
   * Sets the value of the type property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setType(String value) {
    this.type = value;
  }

}
