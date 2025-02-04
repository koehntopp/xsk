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

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SpatialPredicate.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SpatialPredicate"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="CONTAINS"/&gt;
 *     &lt;enumeration value="COVERED_BY"/&gt;
 *     &lt;enumeration value="COVERS"/&gt;
 *     &lt;enumeration value="CROSSES"/&gt;
 *     &lt;enumeration value="DISJOINT"/&gt;
 *     &lt;enumeration value="EQUALS"/&gt;
 *     &lt;enumeration value="INTERSECTS"/&gt;
 *     &lt;enumeration value="OVERLAPS"/&gt;
 *     &lt;enumeration value="RELATE"/&gt;
 *     &lt;enumeration value="TOUCHES"/&gt;
 *     &lt;enumeration value="WITHIN"/&gt;
 *     &lt;enumeration value="WITHIN_DISTANCE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 */
@XmlType(name = "SpatialPredicate")
@XmlEnum
public enum SpatialPredicate {


  /**
   * Contains tests if a geometry value spatially contains another geometry value.
   */
  CONTAINS,

  /**
   * Tests if a geometry value is spatially covered by another geometry value.
   */
  COVERED_BY,

  /**
   * Tests if a geometry value spatially covers another geometry value.
   */
  COVERS,

  /**
   * Tests if a geometry value crosses another geometry value.
   */
  CROSSES,

  /**
   * Test if a geometry value is spatially disjoint from another value.
   */
  DISJOINT,

  /**
   * Tests if an ST_Geometry value is spatially equal to another ST_Geometry value.
   */
  EQUALS,

  /**
   * Test if a geometry value spatially intersects another value.
   */
  INTERSECTS,

  /**
   * Tests if a geometry value overlaps another geometry value.
   */
  OVERLAPS,

  /**
   * Tests if a geometry value is spatially related to another geometry value as specified by the intersection matrix.
   * The ST_Relate method uses a 9-character string from the Dimensionally Extended 9 Intersection Model (DE-9IM)
   * see http://en.wikipedia.org/wiki/DE-9IM to describe the pair-wise relationship between two spatial data items.
   * For example, the ST_Relate method determines if an intersection occurs between the geometries, and the geometry
   * of the resulting intersection, if it exists.
   */
  RELATE,

  /**
   * Tests if a geometry value spatially touches another geometry value.
   */
  TOUCHES,

  /**
   * Tests if a geometry value is spatially contained within another geometry value.
   */
  WITHIN,

  /**
   * Test if two geometries are within a specified distance of each other.
   */
  WITHIN_DISTANCE;

  public static SpatialPredicate fromValue(String v) {
    return valueOf(v);
  }

  public String value() {
    return name();
  }

}
