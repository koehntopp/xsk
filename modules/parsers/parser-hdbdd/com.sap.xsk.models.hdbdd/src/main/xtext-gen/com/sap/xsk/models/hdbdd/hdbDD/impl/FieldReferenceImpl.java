/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.hdbdd.hdbDD.impl;

import com.sap.xsk.models.hdbdd.hdbDD.FieldReference;
import com.sap.xsk.models.hdbdd.hdbDD.HdbDDPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Field Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl#getFieldReferenceEntity <em>Field Reference Entity</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl#getFieldReferenceEntityLocalId <em>Field Reference Entity Local Id</em>}</li>
 *   <li>{@link com.sap.xsk.models.hdbdd.hdbDD.impl.FieldReferenceImpl#getFieldReferenceEntityForeignId <em>Field Reference Entity Foreign Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FieldReferenceImpl extends FieldImpl implements FieldReference
{
  /**
   * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected String referenceType = REFERENCE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldReferenceEntity() <em>Field Reference Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldReferenceEntity()
   * @generated
   * @ordered
   */
  protected static final String FIELD_REFERENCE_ENTITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldReferenceEntity() <em>Field Reference Entity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldReferenceEntity()
   * @generated
   * @ordered
   */
  protected String fieldReferenceEntity = FIELD_REFERENCE_ENTITY_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldReferenceEntityLocalId() <em>Field Reference Entity Local Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldReferenceEntityLocalId()
   * @generated
   * @ordered
   */
  protected static final String FIELD_REFERENCE_ENTITY_LOCAL_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldReferenceEntityLocalId() <em>Field Reference Entity Local Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldReferenceEntityLocalId()
   * @generated
   * @ordered
   */
  protected String fieldReferenceEntityLocalId = FIELD_REFERENCE_ENTITY_LOCAL_ID_EDEFAULT;

  /**
   * The default value of the '{@link #getFieldReferenceEntityForeignId() <em>Field Reference Entity Foreign Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldReferenceEntityForeignId()
   * @generated
   * @ordered
   */
  protected static final String FIELD_REFERENCE_ENTITY_FOREIGN_ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFieldReferenceEntityForeignId() <em>Field Reference Entity Foreign Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFieldReferenceEntityForeignId()
   * @generated
   * @ordered
   */
  protected String fieldReferenceEntityForeignId = FIELD_REFERENCE_ENTITY_FOREIGN_ID_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected FieldReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return HdbDDPackage.Literals.FIELD_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferenceType()
  {
    return referenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceType(String newReferenceType)
  {
    String oldReferenceType = referenceType;
    referenceType = newReferenceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldReferenceEntity()
  {
    return fieldReferenceEntity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldReferenceEntity(String newFieldReferenceEntity)
  {
    String oldFieldReferenceEntity = fieldReferenceEntity;
    fieldReferenceEntity = newFieldReferenceEntity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY, oldFieldReferenceEntity, fieldReferenceEntity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldReferenceEntityLocalId()
  {
    return fieldReferenceEntityLocalId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldReferenceEntityLocalId(String newFieldReferenceEntityLocalId)
  {
    String oldFieldReferenceEntityLocalId = fieldReferenceEntityLocalId;
    fieldReferenceEntityLocalId = newFieldReferenceEntityLocalId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID, oldFieldReferenceEntityLocalId, fieldReferenceEntityLocalId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFieldReferenceEntityForeignId()
  {
    return fieldReferenceEntityForeignId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFieldReferenceEntityForeignId(String newFieldReferenceEntityForeignId)
  {
    String oldFieldReferenceEntityForeignId = fieldReferenceEntityForeignId;
    fieldReferenceEntityForeignId = newFieldReferenceEntityForeignId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID, oldFieldReferenceEntityForeignId, fieldReferenceEntityForeignId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case HdbDDPackage.FIELD_REFERENCE__REFERENCE_TYPE:
        return getReferenceType();
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY:
        return getFieldReferenceEntity();
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID:
        return getFieldReferenceEntityLocalId();
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID:
        return getFieldReferenceEntityForeignId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case HdbDDPackage.FIELD_REFERENCE__REFERENCE_TYPE:
        setReferenceType((String)newValue);
        return;
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY:
        setFieldReferenceEntity((String)newValue);
        return;
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID:
        setFieldReferenceEntityLocalId((String)newValue);
        return;
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID:
        setFieldReferenceEntityForeignId((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case HdbDDPackage.FIELD_REFERENCE__REFERENCE_TYPE:
        setReferenceType(REFERENCE_TYPE_EDEFAULT);
        return;
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY:
        setFieldReferenceEntity(FIELD_REFERENCE_ENTITY_EDEFAULT);
        return;
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID:
        setFieldReferenceEntityLocalId(FIELD_REFERENCE_ENTITY_LOCAL_ID_EDEFAULT);
        return;
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID:
        setFieldReferenceEntityForeignId(FIELD_REFERENCE_ENTITY_FOREIGN_ID_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case HdbDDPackage.FIELD_REFERENCE__REFERENCE_TYPE:
        return REFERENCE_TYPE_EDEFAULT == null ? referenceType != null : !REFERENCE_TYPE_EDEFAULT.equals(referenceType);
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY:
        return FIELD_REFERENCE_ENTITY_EDEFAULT == null ? fieldReferenceEntity != null : !FIELD_REFERENCE_ENTITY_EDEFAULT.equals(fieldReferenceEntity);
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_LOCAL_ID:
        return FIELD_REFERENCE_ENTITY_LOCAL_ID_EDEFAULT == null ? fieldReferenceEntityLocalId != null : !FIELD_REFERENCE_ENTITY_LOCAL_ID_EDEFAULT.equals(fieldReferenceEntityLocalId);
      case HdbDDPackage.FIELD_REFERENCE__FIELD_REFERENCE_ENTITY_FOREIGN_ID:
        return FIELD_REFERENCE_ENTITY_FOREIGN_ID_EDEFAULT == null ? fieldReferenceEntityForeignId != null : !FIELD_REFERENCE_ENTITY_FOREIGN_ID_EDEFAULT.equals(fieldReferenceEntityForeignId);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (referenceType: ");
    result.append(referenceType);
    result.append(", fieldReferenceEntity: ");
    result.append(fieldReferenceEntity);
    result.append(", fieldReferenceEntityLocalId: ");
    result.append(fieldReferenceEntityLocalId);
    result.append(", fieldReferenceEntityForeignId: ");
    result.append(fieldReferenceEntityForeignId);
    result.append(')');
    return result.toString();
  }

} //FieldReferenceImpl
