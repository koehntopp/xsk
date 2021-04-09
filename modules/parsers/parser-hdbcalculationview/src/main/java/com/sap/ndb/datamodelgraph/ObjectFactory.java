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


package com.sap.ndb.datamodelgraph;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.sap.ndb.datamodelgraph package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {


  /**
   * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sap.ndb.datamodelgraph
   */
  public ObjectFactory() {
  }

  /**
   * Create an instance of {@link PatternMatching }
   */
  public PatternMatching createPatternMatching() {
    return new PatternMatching();
  }

  /**
   * Create an instance of {@link ScriptPatternMatching }
   */
  public ScriptPatternMatching createScriptPatternMatching() {
    return new ScriptPatternMatching();
  }

  /**
   * Create an instance of {@link VertexVariable }
   */
  public VertexVariable createVertexVariable() {
    return new VertexVariable();
  }

  /**
   * Create an instance of {@link EdgeVariable }
   */
  public EdgeVariable createEdgeVariable() {
    return new EdgeVariable();
  }

  /**
   * Create an instance of {@link PathVariable }
   */
  public PathVariable createPathVariable() {
    return new PathVariable();
  }

  /**
   * Create an instance of {@link VariableElement }
   */
  public VariableElement createVariableElement() {
    return new VariableElement();
  }

  /**
   * Create an instance of {@link GraphVariableOrderBy }
   */
  public GraphVariableOrderBy createGraphVariableOrderBy() {
    return new GraphVariableOrderBy();
  }

  /**
   * Create an instance of {@link GraphVariableMapping }
   */
  public GraphVariableMapping createGraphVariableMapping() {
    return new GraphVariableMapping();
  }

  /**
   * Create an instance of {@link CompoundOperation }
   */
  public CompoundOperation createCompoundOperation() {
    return new CompoundOperation();
  }

  /**
   * Create an instance of {@link PredicateOperation }
   */
  public PredicateOperation createPredicateOperation() {
    return new PredicateOperation();
  }

  /**
   * Create an instance of {@link Argument }
   */
  public Argument createArgument() {
    return new Argument();
  }

  /**
   * Create an instance of {@link ConstantArgument }
   */
  public ConstantArgument createConstantArgument() {
    return new ConstantArgument();
  }

  /**
   * Create an instance of {@link ParameterArgument }
   */
  public ParameterArgument createParameterArgument() {
    return new ParameterArgument();
  }

  /**
   * Create an instance of {@link GetNeighborhoodParameterization }
   */
  public GetNeighborhoodParameterization createGetNeighborhoodParameterization() {
    return new GetNeighborhoodParameterization();
  }

  /**
   * Create an instance of {@link GetShortestPathsParameterization }
   */
  public GetShortestPathsParameterization createGetShortestPathsParameterization() {
    return new GetShortestPathsParameterization();
  }

  /**
   * Create an instance of {@link GetShortestPathParameterization }
   */
  public GetShortestPathParameterization createGetShortestPathParameterization() {
    return new GetShortestPathParameterization();
  }

  /**
   * Create an instance of {@link GetStronglyConnectedComponents }
   */
  public GetStronglyConnectedComponents createGetStronglyConnectedComponents() {
    return new GetStronglyConnectedComponents();
  }

}
