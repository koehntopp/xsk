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

import com.sap.ndb.bimodelconversion.CurrencyConversion;
import com.sap.ndb.bimodelconversion.UnitConversion;
import com.sap.ndb.bimodelcube.AggregationType;
import com.sap.ndb.sqlcoremodelaccesscontrol.ValueFilter;
import com.sap.ndb.sqlcoremodeldatatypes.PrimitiveTypeSQL;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Models an attribute on a view inside the scenario. It has less features as the attribute in the logical model.
 * The data type is already defined here because it is needed for script based nodes it should be empty (is ignored)
 * for viewAttributes in union, join and projection nodes
 *
 *
 * <p>Java class for ViewAttribute complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ViewAttribute"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="filter" type="{http://www.sap.com/ndb/SQLCoreModelAccessControl.ecore}ValueFilter" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice minOccurs="0"&gt;
 *           &lt;element name="currencyConversion" type="{http://www.sap.com/ndb/BiModelConversion.ecore}CurrencyConversion"/&gt;
 *           &lt;element name="unitConversion" type="{http://www.sap.com/ndb/BiModelConversion.ecore}UnitConversion" minOccurs="0"/&gt;
 *           &lt;element name="conversionReference" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" use="required" type="{http://www.sap.com/ndb/BiModelCalculation.ecore}ViewAttributeName" /&gt;
 *       &lt;attribute name="isMeasure" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="aggregationType" type="{http://www.sap.com/ndb/BiModelCube.ecore}AggregationType" /&gt;
 *       &lt;attribute name="order" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Order" /&gt;
 *       &lt;attribute name="keepFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="transparentFilter" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="hidden" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="datatype" type="{http://www.sap.com/ndb/SQLCoreModelDataTypes.ecore}PrimitiveTypeSQL" /&gt;
 *       &lt;attribute name="length" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="scale" type="{http://www.w3.org/2001/XMLSchema}short" /&gt;
 *       &lt;attribute name="replaceNull" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="replaceNullBy" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ViewAttribute", propOrder = {
    "filter",
    "currencyConversion",
    "unitConversion",
    "conversionReference"
})
@XmlSeeAlso({
    CalculatedViewAttribute.class,
    RestrictedViewAttribute.class
})
public class ViewAttribute {

  protected List<ValueFilter> filter;
  protected CurrencyConversion currencyConversion;
  protected UnitConversion unitConversion;
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected String conversionReference;
  @XmlAttribute(name = "id", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String id;
  @XmlAttribute(name = "isMeasure")
  protected Boolean isMeasure;
  @XmlAttribute(name = "aggregationType")
  protected AggregationType aggregationType;
  @XmlAttribute(name = "order")
  protected Integer order;
  @XmlAttribute(name = "keepFlag")
  protected Boolean keepFlag;
  @XmlAttribute(name = "transparentFilter")
  protected Boolean transparentFilter;
  @XmlAttribute(name = "hidden")
  protected Boolean hidden;
  @XmlAttribute(name = "datatype")
  protected PrimitiveTypeSQL datatype;
  @XmlAttribute(name = "length")
  protected Short length;
  @XmlAttribute(name = "scale")
  protected Short scale;
  @XmlAttribute(name = "replaceNull")
  protected Boolean replaceNull;
  @XmlAttribute(name = "replaceNullBy")
  protected String replaceNullBy;

  /**
   * Gets the value of the filter property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the filter property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getFilter().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link ValueFilter }
   */
  public List<ValueFilter> getFilter() {
    if (filter == null) {
      filter = new ArrayList<ValueFilter>();
    }
    return this.filter;
  }

  /**
   * Gets the value of the currencyConversion property.
   *
   * @return possible object is
   * {@link CurrencyConversion }
   */
  public CurrencyConversion getCurrencyConversion() {
    return currencyConversion;
  }

  /**
   * Sets the value of the currencyConversion property.
   *
   * @param value allowed object is
   *              {@link CurrencyConversion }
   */
  public void setCurrencyConversion(CurrencyConversion value) {
    this.currencyConversion = value;
  }

  /**
   * Gets the value of the unitConversion property.
   *
   * @return possible object is
   * {@link UnitConversion }
   */
  public UnitConversion getUnitConversion() {
    return unitConversion;
  }

  /**
   * Sets the value of the unitConversion property.
   *
   * @param value allowed object is
   *              {@link UnitConversion }
   */
  public void setUnitConversion(UnitConversion value) {
    this.unitConversion = value;
  }

  /**
   * Gets the value of the conversionReference property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getConversionReference() {
    return conversionReference;
  }

  /**
   * Sets the value of the conversionReference property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setConversionReference(String value) {
    this.conversionReference = value;
  }

  /**
   * Gets the value of the id property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getId() {
    return id;
  }

  /**
   * Sets the value of the id property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setId(String value) {
    this.id = value;
  }

  /**
   * Gets the value of the isMeasure property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isIsMeasure() {
    return isMeasure;
  }

  /**
   * Sets the value of the isMeasure property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setIsMeasure(Boolean value) {
    this.isMeasure = value;
  }

  /**
   * Gets the value of the aggregationType property.
   *
   * @return possible object is
   * {@link AggregationType }
   */
  public AggregationType getAggregationType() {
    return aggregationType;
  }

  /**
   * Sets the value of the aggregationType property.
   *
   * @param value allowed object is
   *              {@link AggregationType }
   */
  public void setAggregationType(AggregationType value) {
    this.aggregationType = value;
  }

  /**
   * Gets the value of the order property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getOrder() {
    return order;
  }

  /**
   * Sets the value of the order property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setOrder(Integer value) {
    this.order = value;
  }

  /**
   * Gets the value of the keepFlag property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isKeepFlag() {
    return keepFlag;
  }

  /**
   * Sets the value of the keepFlag property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setKeepFlag(Boolean value) {
    this.keepFlag = value;
  }

  /**
   * Gets the value of the transparentFilter property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isTransparentFilter() {
    return transparentFilter;
  }

  /**
   * Sets the value of the transparentFilter property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setTransparentFilter(Boolean value) {
    this.transparentFilter = value;
  }

  /**
   * Gets the value of the hidden property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isHidden() {
    return hidden;
  }

  /**
   * Sets the value of the hidden property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setHidden(Boolean value) {
    this.hidden = value;
  }

  /**
   * Gets the value of the datatype property.
   *
   * @return possible object is
   * {@link PrimitiveTypeSQL }
   */
  public PrimitiveTypeSQL getDatatype() {
    return datatype;
  }

  /**
   * Sets the value of the datatype property.
   *
   * @param value allowed object is
   *              {@link PrimitiveTypeSQL }
   */
  public void setDatatype(PrimitiveTypeSQL value) {
    this.datatype = value;
  }

  /**
   * Gets the value of the length property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getLength() {
    return length;
  }

  /**
   * Sets the value of the length property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setLength(Short value) {
    this.length = value;
  }

  /**
   * Gets the value of the scale property.
   *
   * @return possible object is
   * {@link Short }
   */
  public Short getScale() {
    return scale;
  }

  /**
   * Sets the value of the scale property.
   *
   * @param value allowed object is
   *              {@link Short }
   */
  public void setScale(Short value) {
    this.scale = value;
  }

  /**
   * Gets the value of the replaceNull property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isReplaceNull() {
    return replaceNull;
  }

  /**
   * Sets the value of the replaceNull property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setReplaceNull(Boolean value) {
    this.replaceNull = value;
  }

  /**
   * Gets the value of the replaceNullBy property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getReplaceNullBy() {
    return replaceNullBy;
  }

  /**
   * Sets the value of the replaceNullBy property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setReplaceNullBy(String value) {
    this.replaceNullBy = value;
  }

}
