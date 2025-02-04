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


package com.sap.ndb.datamodelhierarchy;

import com.sap.ndb.basemodelbase.LevelType;
import com.sap.ndb.basemodelbase.SortDirection;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for Level complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="Level"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;attribute name="element" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="levelType" type="{http://www.sap.com/ndb/BaseModelBase.ecore}LevelType" /&gt;
 *       &lt;attribute name="orderElement" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="sortDirection" type="{http://www.sap.com/ndb/BaseModelBase.ecore}SortDirection" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Level")
public class Level {

  @XmlAttribute(name = "element", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String element;
  @XmlAttribute(name = "levelType")
  protected LevelType levelType;
  @XmlAttribute(name = "orderElement")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String orderElement;
  @XmlAttribute(name = "sortDirection")
  protected SortDirection sortDirection;

  /**
   * Gets the value of the element property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getElement() {
    return element;
  }

  /**
   * Sets the value of the element property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setElement(String value) {
    this.element = value;
  }

  /**
   * Gets the value of the levelType property.
   *
   * @return possible object is
   * {@link LevelType }
   */
  public LevelType getLevelType() {
    return levelType;
  }

  /**
   * Sets the value of the levelType property.
   *
   * @param value allowed object is
   *              {@link LevelType }
   */
  public void setLevelType(LevelType value) {
    this.levelType = value;
  }

  /**
   * Gets the value of the orderElement property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getOrderElement() {
    return orderElement;
  }

  /**
   * Sets the value of the orderElement property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setOrderElement(String value) {
    this.orderElement = value;
  }

  /**
   * Gets the value of the sortDirection property.
   *
   * @return possible object is
   * {@link SortDirection }
   */
  public SortDirection getSortDirection() {
    return sortDirection;
  }

  /**
   * Sets the value of the sortDirection property.
   *
   * @param value allowed object is
   *              {@link SortDirection }
   */
  public void setSortDirection(SortDirection value) {
    this.sortDirection = value;
  }

}
