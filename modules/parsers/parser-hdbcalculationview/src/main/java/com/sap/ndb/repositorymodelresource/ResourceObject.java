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


package com.sap.ndb.repositorymodelresource;

import com.sap.ndb.basemodelbase.Descriptions;
import com.sap.ndb.bimodeldatafoundation.BIResource;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Father object for EMF resources stored in the HANA repository
 *
 * <p>Java class for ResourceObject complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="ResourceObject"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AbstractRepositoryObject"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptions" type="{http://www.sap.com/ndb/BaseModelBase.ecore}Descriptions" minOccurs="0"/&gt;
 *         &lt;element name="metadata" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}ResourceMetadata" minOccurs="0"/&gt;
 *         &lt;element name="requiredResources" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}RepositoryUri" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="requiredSQLObjects" type="{http://www.w3.org/2001/XMLSchema}anyURI" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="id" type="{http://www.sap.com/ndb/RepositoryModelResource.ecore}AlphanumericName" /&gt;
 *       &lt;attribute name="deprecated" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourceObject", propOrder = {
    "descriptions",
    "metadata",
    "requiredResources",
    "requiredSQLObjects"
})
@XmlSeeAlso({
    BIResource.class
})
public abstract class ResourceObject
    extends AbstractRepositoryObject {

  protected Descriptions descriptions;
  protected ResourceMetadata metadata;
  @XmlElement(nillable = true)
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  @XmlSchemaType(name = "token")
  protected List<String> requiredResources;
  @XmlSchemaType(name = "anyURI")
  protected List<String> requiredSQLObjects;
  @XmlAttribute(name = "id")
  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
  protected String id;
  @XmlAttribute(name = "deprecated")
  protected Boolean deprecated;

  /**
   * Gets the value of the descriptions property.
   *
   * @return possible object is
   * {@link Descriptions }
   */
  public Descriptions getDescriptions() {
    return descriptions;
  }

  /**
   * Sets the value of the descriptions property.
   *
   * @param value allowed object is
   *              {@link Descriptions }
   */
  public void setDescriptions(Descriptions value) {
    this.descriptions = value;
  }

  /**
   * Gets the value of the metadata property.
   *
   * @return possible object is
   * {@link ResourceMetadata }
   */
  public ResourceMetadata getMetadata() {
    return metadata;
  }

  /**
   * Sets the value of the metadata property.
   *
   * @param value allowed object is
   *              {@link ResourceMetadata }
   */
  public void setMetadata(ResourceMetadata value) {
    this.metadata = value;
  }

  /**
   * Gets the value of the requiredResources property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the requiredResources property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRequiredResources().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getRequiredResources() {
    if (requiredResources == null) {
      requiredResources = new ArrayList<String>();
    }
    return this.requiredResources;
  }

  /**
   * Gets the value of the requiredSQLObjects property.
   *
   * <p>
   * This accessor method returns a reference to the live list,
   * not a snapshot. Therefore any modification you make to the
   * returned list will be present inside the JAXB object.
   * This is why there is not a <CODE>set</CODE> method for the requiredSQLObjects property.
   *
   * <p>
   * For example, to add a new item, do as follows:
   * <pre>
   *    getRequiredSQLObjects().add(newItem);
   * </pre>
   *
   *
   * <p>
   * Objects of the following type(s) are allowed in the list
   * {@link String }
   */
  public List<String> getRequiredSQLObjects() {
    if (requiredSQLObjects == null) {
      requiredSQLObjects = new ArrayList<String>();
    }
    return this.requiredSQLObjects;
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
   * Gets the value of the deprecated property.
   *
   * @return possible object is
   * {@link Boolean }
   */
  public Boolean isDeprecated() {
    return deprecated;
  }

  /**
   * Sets the value of the deprecated property.
   *
   * @param value allowed object is
   *              {@link Boolean }
   */
  public void setDeprecated(Boolean value) {
    this.deprecated = value;
  }

}
