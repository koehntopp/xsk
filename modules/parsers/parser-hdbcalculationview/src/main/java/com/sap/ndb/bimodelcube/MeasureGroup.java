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


package com.sap.ndb.bimodelcube;

import com.sap.ndb.bimodeldatafoundation.Layout;
import com.sap.ndb.bimodeldatafoundation.LogicalJoins;
import com.sap.ndb.bimodeldatafoundation.LogicalObject;
import com.sap.ndb.datamodeltype.ExpressionLanguage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for MeasureGroup complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="MeasureGroup"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}LogicalObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="baseMeasures" type="{http://www.sap.com/ndb/BiModelCube.ecore}BaseMeasures" minOccurs="0"/&gt;
 *         &lt;element name="calculatedMeasures" type="{http://www.sap.com/ndb/BiModelCube.ecore}CalculatedMeasures" minOccurs="0"/&gt;
 *         &lt;element name="restrictedMeasures" type="{http://www.sap.com/ndb/BiModelCube.ecore}RestrictedMeasures" minOccurs="0"/&gt;
 *         &lt;element name="measures" type="{http://www.sap.com/ndb/BiModelCube.ecore}Measure" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="localDimensions" type="{http://www.sap.com/ndb/BiModelCube.ecore}LocalDimensions" minOccurs="0"/&gt;
 *         &lt;element name="sharedDimensions" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}LogicalJoins" minOccurs="0"/&gt;
 *         &lt;element name="sortAttributes" type="{http://www.sap.com/ndb/BiModelCube.ecore}SortAttributes" minOccurs="0"/&gt;
 *         &lt;element name="filter" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Expression" minOccurs="0"/&gt;
 *         &lt;element name="layout" type="{http://www.sap.com/ndb/BiModelDataFoundation.ecore}Layout" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="outputName" type="{http://www.sap.com/ndb/BaseModelBase.ecore}DbName" /&gt;
 *       &lt;attribute name="filterExpressionLanguage" type="{http://www.sap.com/ndb/DataModelType.ecore}ExpressionLanguage" /&gt;
 *       &lt;attribute name="ignoreMultipleOutputsForFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeasureGroup", propOrder = {
    "baseMeasures",
    "calculatedMeasures",
    "restrictedMeasures",
    "measures",
    "localDimensions",
    "sharedDimensions",
    "sortAttributes",
    "filter",
    "layout"
})
public class MeasureGroup
    extends LogicalObject {

  protected BaseMeasures baseMeasures;
  protected CalculatedMeasures calculatedMeasures;
  protected RestrictedMeasures restrictedMeasures;
  protected List<Measure> measures;
  protected LocalDimensions localDimensions;
  protected LogicalJoins sharedDimensions;
  protected SortAttributes sortAttributes;
  protected String filter;
  protected Layout layout;
  @XmlAttribute(name = "outputName")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String outputName;
  @XmlAttribute(name = "filterExpressionLanguage")
  protected ExpressionLanguage filterExpressionLanguage;
  @XmlAttribute(name = "ignoreMultipleOutputsForFilter")
  protected Boolean ignoreMultipleOutputsForFilter;

  /**
   * Gets the value of the baseMeasures property.
   *
   * @return possible object is
   * {@link BaseMeasures }
   */
  public BaseMeasures getBaseMeasures() {
    return baseMeasures;
  }

  /**
   * Sets the value of the baseMeasures property.
   *
   * @param value allowed object is
   *              {@link BaseMeasures }
   */
  public void setBaseMeasures(BaseMeasures value) {
    this.baseMeasures = value;
  }

  /**
   * Gets the value of the calculatedMeasures property.
   *
   * @return possible object is
   * {@link CalculatedMeasures }
   */
  public CalculatedMeasures getCalculatedMeasures() {
    return calculatedMeasures;
  }

  /**
   * Sets the value of the calculatedMeasures property.
   *
   * @param value allowed object is
   *              {@link CalculatedMeasures }
   */
  public void setCalculatedMeasures(CalculatedMeasures value) {
    this.calculatedMeasures = value;
  }

  /**
   * Gets the value of the restrictedMeasures property.
   *
   * @return possible object is
   * {@link RestrictedMeasures }
   */
  public RestrictedMeasures getRestrictedMeasures() {
    return restrictedMeasures;
  }

  /**
   * Sets the value of the restrictedMeasures property.
   *
   * @param value allowed object is
   *              {@link RestrictedMeasures }
   */
  public void setRestrictedMeasures(RestrictedMeasures value) {
    this.restrictedMeasures = value;
  }

  /**
   * Gets the value of the measures property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the measures property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getMeasures().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link Measure }
   */
  public List<Measure> getMeasures() {
    if (measures == null) {
      measures = new ArrayList<Measure>();
    }
    return this.measures;
  }

  /**
   * Gets the value of the localDimensions property.
   *
   * @return possible object is
   * {@link LocalDimensions }
   */
  public LocalDimensions getLocalDimensions() {
    return localDimensions;
  }

  /**
   * Sets the value of the localDimensions property.
   *
   * @param value allowed object is
   *              {@link LocalDimensions }
   */
  public void setLocalDimensions(LocalDimensions value) {
    this.localDimensions = value;
  }

  /**
   * Gets the value of the sharedDimensions property.
   *
   * @return possible object is
   * {@link LogicalJoins }
   */
  public LogicalJoins getSharedDimensions() {
    return sharedDimensions;
  }

  /**
   * Sets the value of the sharedDimensions property.
   *
   * @param value allowed object is
   *              {@link LogicalJoins }
   */
  public void setSharedDimensions(LogicalJoins value) {
    this.sharedDimensions = value;
  }

  /**
   * Gets the value of the sortAttributes property.
   *
   * @return possible object is
   * {@link SortAttributes }
   */
  public SortAttributes getSortAttributes() {
    return sortAttributes;
  }

  /**
   * Sets the value of the sortAttributes property.
   *
   * @param value allowed object is
   *              {@link SortAttributes }
   */
  public void setSortAttributes(SortAttributes value) {
    this.sortAttributes = value;
  }

  /**
   * Gets the value of the filter property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getFilter() {
    return filter;
  }

  /**
   * Sets the value of the filter property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setFilter(String value) {
    this.filter = value;
  }

  /**
   * Gets the value of the layout property.
   *
   * @return possible object is
   * {@link Layout }
   */
  public Layout getLayout() {
    return layout;
  }

  /**
   * Sets the value of the layout property.
   *
   * @param value allowed object is
   *              {@link Layout }
   */
  public void setLayout(Layout value) {
    this.layout = value;
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
   * Gets the value of the filterExpressionLanguage property.
   *
   * @return possible object is
   * {@link ExpressionLanguage }
   */
  public ExpressionLanguage getFilterExpressionLanguage() {
    return filterExpressionLanguage;
  }

  /**
   * Sets the value of the filterExpressionLanguage property.
   *
   * @param value allowed object is
   *              {@link ExpressionLanguage }
   */
  public void setFilterExpressionLanguage(ExpressionLanguage value) {
    this.filterExpressionLanguage = value;
  }

  /**
   * Gets the value of the ignoreMultipleOutputsForFilter property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIgnoreMultipleOutputsForFilter() {
    return ignoreMultipleOutputsForFilter;
  }

  /**
   * Sets the value of the ignoreMultipleOutputsForFilter property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIgnoreMultipleOutputsForFilter(Boolean value) {
    this.ignoreMultipleOutputsForFilter = value;
  }

}
