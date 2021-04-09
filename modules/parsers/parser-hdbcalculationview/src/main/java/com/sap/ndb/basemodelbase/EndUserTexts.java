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


package com.sap.ndb.basemodelbase;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EndUserTexts complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="EndUserTexts"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="localizedLabel" type="{http://www.sap.com/ndb/BaseModelBase.ecore}LocalizedText" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="comment" type="{http://www.sap.com/ndb/BaseModelBase.ecore}CommentProperties" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="label" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="labelMaxLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="quickInfo" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="quickInfoMaxLength" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
 *       &lt;attribute name="documentation" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EndUserTexts", propOrder = {
    "localizedLabel",
    "comment"
})
public class EndUserTexts {

  protected List<LocalizedText> localizedLabel;
  protected CommentProperties comment;
  @XmlAttribute(name = "label")
  protected String label;
  @XmlAttribute(name = "labelMaxLength")
  protected Integer labelMaxLength;
  @XmlAttribute(name = "quickInfo")
  protected String quickInfo;
  @XmlAttribute(name = "quickInfoMaxLength")
  protected Integer quickInfoMaxLength;
  @XmlAttribute(name = "documentation")
  protected Boolean documentation;

  /**
   * Gets the value of the localizedLabel property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the localizedLabel property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getLocalizedLabel().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link LocalizedText }
   */
  public List<LocalizedText> getLocalizedLabel() {
    if (localizedLabel == null) {
      localizedLabel = new ArrayList<LocalizedText>();
    }
    return this.localizedLabel;
  }

  /**
   * Gets the value of the comment property.
   *
   * @return possible object is
   * {@link CommentProperties }
   */
  public CommentProperties getComment() {
    return comment;
  }

  /**
   * Sets the value of the comment property.
   *
   * @param value allowed object is
   *              {@link CommentProperties }
   */
  public void setComment(CommentProperties value) {
    this.comment = value;
  }

  /**
   * Gets the value of the label property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getLabel() {
    return label;
  }

  /**
   * Sets the value of the label property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setLabel(String value) {
    this.label = value;
  }

  /**
   * Gets the value of the labelMaxLength property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getLabelMaxLength() {
    return labelMaxLength;
  }

  /**
   * Sets the value of the labelMaxLength property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setLabelMaxLength(Integer value) {
    this.labelMaxLength = value;
  }

  /**
   * Gets the value of the quickInfo property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getQuickInfo() {
    return quickInfo;
  }

  /**
   * Sets the value of the quickInfo property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setQuickInfo(String value) {
    this.quickInfo = value;
  }

  /**
   * Gets the value of the quickInfoMaxLength property.
   *
   * @return possible object is
   * {@link Integer }
   */
  public Integer getQuickInfoMaxLength() {
    return quickInfoMaxLength;
  }

  /**
   * Sets the value of the quickInfoMaxLength property.
   *
   * @param value allowed object is
   *              {@link Integer }
   */
  public void setQuickInfoMaxLength(Integer value) {
    this.quickInfoMaxLength = value;
  }

  /**
   * Gets the value of the documentation property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isDocumentation() {
    return documentation;
  }

  /**
   * Sets the value of the documentation property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setDocumentation(Boolean value) {
    this.documentation = value;
  }

}
