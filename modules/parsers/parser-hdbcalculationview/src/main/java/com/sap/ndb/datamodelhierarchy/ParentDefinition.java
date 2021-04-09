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


package com.sap.ndb.datamodelhierarchy;

import com.sap.ndb.datamodeltype.UDFParameter;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Defines the reference to the element of the entities' key to link a child instance to a parent instance.
 * Example: in an entity containing Employee attributes the	annotation is used at the Manager element Object
 * references in the attributes because it might point to a column coming in via a selectAll input
 *
 *
 * <p>Java class for ParentDefinition complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ParentDefinition"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="rootNode" type="{http://www.sap.com/ndb/DataModelType.ecore}UDFParameter" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="element" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="parent" use="required" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}Identifier" /&gt;
 *       &lt;attribute name="stepParentNodeID" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ParentDefinition", propOrder = {
    "rootNode"
})
public class ParentDefinition {

  protected UDFParameter rootNode;
  @XmlAttribute(name = "element", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String element;
  @XmlAttribute(name = "parent", required = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String parent;
  @XmlAttribute(name = "stepParentNodeID")
  protected String stepParentNodeID;

  /**
   * Gets the value of the rootNode property.
   *
   * @return possible object is
   * {@link UDFParameter }
   */
  public UDFParameter getRootNode() {
    return rootNode;
  }

  /**
   * Sets the value of the rootNode property.
   *
   * @param value allowed object is
   *              {@link UDFParameter }
   */
  public void setRootNode(UDFParameter value) {
    this.rootNode = value;
  }

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
   * Gets the value of the parent property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getParent() {
    return parent;
  }

  /**
   * Sets the value of the parent property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setParent(String value) {
    this.parent = value;
  }

  /**
   * Gets the value of the stepParentNodeID property.
   *
   * @return possible object is
   * {@link String }
   */
  public String getStepParentNodeID() {
    return stepParentNodeID;
  }

  /**
   * Sets the value of the stepParentNodeID property.
   *
   * @param value allowed object is
   *              {@link String }
   */
  public void setStepParentNodeID(String value) {
    this.stepParentNodeID = value;
  }

}
