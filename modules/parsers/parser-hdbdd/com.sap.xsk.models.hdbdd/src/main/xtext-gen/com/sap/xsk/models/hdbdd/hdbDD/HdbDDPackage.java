/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.hdbDD;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.sap.xsk.models.hdbdd.hdbDD.HdbDDFactory
 * @model kind="package"
 * @generated
 */
public interface HdbDDPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "hdbDD";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.sap.com/xsk/models/hdbdd/HdbDD";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "hdbDD";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  HdbDDPackage eINSTANCE = com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl.init();

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDImpl <em>Hdb DD</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getHdbDD()
   * @generated
   */
  int HDB_DD = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDB_DD__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Hdb DD</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HDB_DD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.TypeImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.NamespaceImpl <em>Namespace</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.NamespaceImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getNamespace()
   * @generated
   */
  int NAMESPACE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Namespace</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAMESPACE_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.SchemaImpl <em>Schema</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.SchemaImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getSchema()
   * @generated
   */
  int SCHEMA = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA__NAME = TYPE__NAME;

  /**
   * The number of structural features of the '<em>Schema</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCHEMA_FEATURE_COUNT = TYPE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.ContextImpl <em>Context</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.ContextImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getContext()
   * @generated
   */
  int CONTEXT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__NAME = TYPE__NAME;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__TYPES = TYPE_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Entities</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT__ENTITIES = TYPE_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Context</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_FEATURE_COUNT = TYPE_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.TypeDefinitionImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getTypeDefinition()
   * @generated
   */
  int TYPE_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__FIELD_TYPE = 1;

  /**
   * The feature id for the '<em><b>Field Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION__FIELD_LENGTH = 2;

  /**
   * The number of structural features of the '<em>Type Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_DEFINITION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.EntityImpl <em>Entity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.EntityImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getEntity()
   * @generated
   */
  int ENTITY = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Fields</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY__FIELDS = 1;

  /**
   * The number of structural features of the '<em>Entity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ENTITY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldImpl <em>Field</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getField()
   * @generated
   */
  int FIELD = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD__NAME = 0;

  /**
   * The number of structural features of the '<em>Field</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl <em>Field Primitive</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getFieldPrimitive()
   * @generated
   */
  int FIELD_PRIMITIVE = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PRIMITIVE__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PRIMITIVE__KEY = FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PRIMITIVE__FIELD_TYPE = FIELD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PRIMITIVE__FIELD_LENGTH = FIELD_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Field Predefined Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE = FIELD_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Field Primitive</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PRIMITIVE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldTypeImpl <em>Field Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldTypeImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getFieldType()
   * @generated
   */
  int FIELD_TYPE = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__KEY = FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Predefined Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE__FIELD_PREDEFINED_TYPE = FIELD_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Field Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_TYPE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl <em>Field Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl
   * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getFieldReference()
   * @generated
   */
  int FIELD_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REFERENCE__NAME = FIELD__NAME;

  /**
   * The feature id for the '<em><b>Reference Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REFERENCE__REFERENCE_TYPE = FIELD_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Field Reference Entity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REFERENCE__FIELD_REFERENCE_ENTITY = FIELD_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field Reference Entity Local Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID = FIELD_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Field Reference Entity Foreign Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID = FIELD_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Field Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_REFERENCE_FEATURE_COUNT = FIELD_FEATURE_COUNT + 4;


  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.HdbDD <em>Hdb DD</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hdb DD</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.HdbDD
   * @generated
   */
  EClass getHdbDD();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbdd.hdbDD.HdbDD#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.HdbDD#getElements()
   * @see #getHdbDD()
   * @generated
   */
  EReference getHdbDD_Elements();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.Namespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Namespace</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Namespace
   * @generated
   */
  EClass getNamespace();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.Schema <em>Schema</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Schema</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Schema
   * @generated
   */
  EClass getSchema();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.Context <em>Context</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Context
   * @generated
   */
  EClass getContext();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbdd.hdbDD.Context#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Context#getTypes()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Types();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbdd.hdbDD.Context#getEntities <em>Entities</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Entities</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Context#getEntities()
   * @see #getContext()
   * @generated
   */
  EReference getContext_Entities();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition <em>Type Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Definition</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition
   * @generated
   */
  EClass getTypeDefinition();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition#getName()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition#getFieldType()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_FieldType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition#getFieldLength <em>Field Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Length</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.TypeDefinition#getFieldLength()
   * @see #getTypeDefinition()
   * @generated
   */
  EAttribute getTypeDefinition_FieldLength();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.Entity <em>Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Entity</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Entity
   * @generated
   */
  EClass getEntity();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.Entity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Entity#getName()
   * @see #getEntity()
   * @generated
   */
  EAttribute getEntity_Name();

  /**
   * Returns the meta object for the containment reference list '{@link com.sap.xsk.models.hdbdd.hdbDD.Entity#getFields <em>Fields</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Fields</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Entity#getFields()
   * @see #getEntity()
   * @generated
   */
  EReference getEntity_Fields();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.Field <em>Field</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Field
   * @generated
   */
  EClass getField();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.Field#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.Field#getName()
   * @see #getField()
   * @generated
   */
  EAttribute getField_Name();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive <em>Field Primitive</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Primitive</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive
   * @generated
   */
  EClass getFieldPrimitive();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#isKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#isKey()
   * @see #getFieldPrimitive()
   * @generated
   */
  EAttribute getFieldPrimitive_Key();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#getFieldType()
   * @see #getFieldPrimitive()
   * @generated
   */
  EAttribute getFieldPrimitive_FieldType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#getFieldLength <em>Field Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Length</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#getFieldLength()
   * @see #getFieldPrimitive()
   * @generated
   */
  EAttribute getFieldPrimitive_FieldLength();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#getFieldPredefinedType <em>Field Predefined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Predefined Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldPrimitive#getFieldPredefinedType()
   * @see #getFieldPrimitive()
   * @generated
   */
  EAttribute getFieldPrimitive_FieldPredefinedType();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldType
   * @generated
   */
  EClass getFieldType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldType#isKey <em>Key</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Key</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldType#isKey()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_Key();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldType#getFieldPredefinedType <em>Field Predefined Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Predefined Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldType#getFieldPredefinedType()
   * @see #getFieldType()
   * @generated
   */
  EAttribute getFieldType_FieldPredefinedType();

  /**
   * Returns the meta object for class '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldReference <em>Field Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Reference</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldReference
   * @generated
   */
  EClass getFieldReference();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Type</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getReferenceType()
   * @see #getFieldReference()
   * @generated
   */
  EAttribute getFieldReference_ReferenceType();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getFieldReferenceEntity <em>Field Reference Entity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Reference Entity</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getFieldReferenceEntity()
   * @see #getFieldReference()
   * @generated
   */
  EAttribute getFieldReference_FieldReferenceEntity();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getFieldReferenceEntityLocalId <em>Field Reference Entity Local Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Reference Entity Local Id</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getFieldReferenceEntityLocalId()
   * @see #getFieldReference()
   * @generated
   */
  EAttribute getFieldReference_FieldReferenceEntityLocalId();

  /**
   * Returns the meta object for the attribute '{@link com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getFieldReferenceEntityForeignId <em>Field Reference Entity Foreign Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Field Reference Entity Foreign Id</em>'.
   * @see com.sap.xsk.models.hdbdd.hdbDD.FieldReference#getFieldReferenceEntityForeignId()
   * @see #getFieldReference()
   * @generated
   */
  EAttribute getFieldReference_FieldReferenceEntityForeignId();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  HdbDDFactory getHdbDDFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDImpl <em>Hdb DD</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getHdbDD()
     * @generated
     */
    EClass HDB_DD = eINSTANCE.getHdbDD();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HDB_DD__ELEMENTS = eINSTANCE.getHdbDD_Elements();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.TypeImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.NamespaceImpl <em>Namespace</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.NamespaceImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getNamespace()
     * @generated
     */
    EClass NAMESPACE = eINSTANCE.getNamespace();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.SchemaImpl <em>Schema</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.SchemaImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getSchema()
     * @generated
     */
    EClass SCHEMA = eINSTANCE.getSchema();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.ContextImpl <em>Context</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.ContextImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getContext()
     * @generated
     */
    EClass CONTEXT = eINSTANCE.getContext();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__TYPES = eINSTANCE.getContext_Types();

    /**
     * The meta object literal for the '<em><b>Entities</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTEXT__ENTITIES = eINSTANCE.getContext_Entities();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.TypeDefinitionImpl <em>Type Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.TypeDefinitionImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getTypeDefinition()
     * @generated
     */
    EClass TYPE_DEFINITION = eINSTANCE.getTypeDefinition();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__NAME = eINSTANCE.getTypeDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__FIELD_TYPE = eINSTANCE.getTypeDefinition_FieldType();

    /**
     * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE_DEFINITION__FIELD_LENGTH = eINSTANCE.getTypeDefinition_FieldLength();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.EntityImpl <em>Entity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.EntityImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getEntity()
     * @generated
     */
    EClass ENTITY = eINSTANCE.getEntity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ENTITY__NAME = eINSTANCE.getEntity_Name();

    /**
     * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ENTITY__FIELDS = eINSTANCE.getEntity_Fields();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldImpl <em>Field</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getField()
     * @generated
     */
    EClass FIELD = eINSTANCE.getField();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD__NAME = eINSTANCE.getField_Name();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl <em>Field Primitive</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldPrimitiveImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getFieldPrimitive()
     * @generated
     */
    EClass FIELD_PRIMITIVE = eINSTANCE.getFieldPrimitive();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_PRIMITIVE__KEY = eINSTANCE.getFieldPrimitive_Key();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_PRIMITIVE__FIELD_TYPE = eINSTANCE.getFieldPrimitive_FieldType();

    /**
     * The meta object literal for the '<em><b>Field Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_PRIMITIVE__FIELD_LENGTH = eINSTANCE.getFieldPrimitive_FieldLength();

    /**
     * The meta object literal for the '<em><b>Field Predefined Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_PRIMITIVE__FIELD_PREDEFINED_TYPE = eINSTANCE.getFieldPrimitive_FieldPredefinedType();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldTypeImpl <em>Field Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldTypeImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getFieldType()
     * @generated
     */
    EClass FIELD_TYPE = eINSTANCE.getFieldType();

    /**
     * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__KEY = eINSTANCE.getFieldType_Key();

    /**
     * The meta object literal for the '<em><b>Field Predefined Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_TYPE__FIELD_PREDEFINED_TYPE = eINSTANCE.getFieldType_FieldPredefinedType();

    /**
     * The meta object literal for the '{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl <em>Field Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl
     * @see com.sap.xsk.models.hdbdd.hdbDD.impl.HdbDDPackageImpl#getFieldReference()
     * @generated
     */
    EClass FIELD_REFERENCE = eINSTANCE.getFieldReference();

    /**
     * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_REFERENCE__REFERENCE_TYPE = eINSTANCE.getFieldReference_ReferenceType();

    /**
     * The meta object literal for the '<em><b>Field Reference Entity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_REFERENCE__FIELD_REFERENCE_ENTITY = eINSTANCE.getFieldReference_FieldReferenceEntity();

    /**
     * The meta object literal for the '<em><b>Field Reference Entity Local Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID = eINSTANCE.getFieldReference_FieldReferenceEntityLocalId();

    /**
     * The meta object literal for the '<em><b>Field Reference Entity Foreign Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID = eINSTANCE.getFieldReference_FieldReferenceEntityForeignId();

  }

} //HdbDDPackage
