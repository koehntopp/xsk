/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.xsOData.impl;

import com.sap.xsk.models.xsodata.xsOData.Entity;
import com.sap.xsk.models.xsodata.xsOData.Navigation;
import com.sap.xsk.models.xsodata.xsOData.XsODataPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getNavigates <em>Navigates</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getCreateEvents <em>Create Events</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getDeleteUsing <em>Delete Using</em>}</li>
 *   <li>{@link com.sap.xsk.models.xsodata.xsOData.impl.EntityImpl#getUpdate <em>Update</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity
{
  /**
   * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected static final String NAMESPACE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected String namespace = NAMESPACE_EDEFAULT;

  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The cached value of the '{@link #getNavigates() <em>Navigates</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNavigates()
   * @generated
   * @ordered
   */
  protected EList<Navigation> navigates;

  /**
   * The cached value of the '{@link #getCreateEvents() <em>Create Events</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCreateEvents()
   * @generated
   * @ordered
   */
  protected EList<String> createEvents;

  /**
   * The cached value of the '{@link #getDeleteUsing() <em>Delete Using</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeleteUsing()
   * @generated
   * @ordered
   */
  protected EList<String> deleteUsing;

  /**
   * The cached value of the '{@link #getUpdate() <em>Update</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUpdate()
   * @generated
   * @ordered
   */
  protected EList<String> update;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EntityImpl()
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
    return XsODataPackage.Literals.ENTITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(String newNamespace)
  {
    String oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsODataPackage.ENTITY__NAMESPACE, oldNamespace, namespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsODataPackage.ENTITY__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, XsODataPackage.ENTITY__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Navigation> getNavigates()
  {
    if (navigates == null)
    {
      navigates = new EObjectContainmentEList<Navigation>(Navigation.class, this, XsODataPackage.ENTITY__NAVIGATES);
    }
    return navigates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getCreateEvents()
  {
    if (createEvents == null)
    {
      createEvents = new EDataTypeEList<String>(String.class, this, XsODataPackage.ENTITY__CREATE_EVENTS);
    }
    return createEvents;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDeleteUsing()
  {
    if (deleteUsing == null)
    {
      deleteUsing = new EDataTypeEList<String>(String.class, this, XsODataPackage.ENTITY__DELETE_USING);
    }
    return deleteUsing;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getUpdate()
  {
    if (update == null)
    {
      update = new EDataTypeEList<String>(String.class, this, XsODataPackage.ENTITY__UPDATE);
    }
    return update;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case XsODataPackage.ENTITY__NAVIGATES:
        return ((InternalEList<?>)getNavigates()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case XsODataPackage.ENTITY__NAMESPACE:
        return getNamespace();
      case XsODataPackage.ENTITY__NAME:
        return getName();
      case XsODataPackage.ENTITY__ALIAS:
        return getAlias();
      case XsODataPackage.ENTITY__NAVIGATES:
        return getNavigates();
      case XsODataPackage.ENTITY__CREATE_EVENTS:
        return getCreateEvents();
      case XsODataPackage.ENTITY__DELETE_USING:
        return getDeleteUsing();
      case XsODataPackage.ENTITY__UPDATE:
        return getUpdate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case XsODataPackage.ENTITY__NAMESPACE:
        setNamespace((String)newValue);
        return;
      case XsODataPackage.ENTITY__NAME:
        setName((String)newValue);
        return;
      case XsODataPackage.ENTITY__ALIAS:
        setAlias((String)newValue);
        return;
      case XsODataPackage.ENTITY__NAVIGATES:
        getNavigates().clear();
        getNavigates().addAll((Collection<? extends Navigation>)newValue);
        return;
      case XsODataPackage.ENTITY__CREATE_EVENTS:
        getCreateEvents().clear();
        getCreateEvents().addAll((Collection<? extends String>)newValue);
        return;
      case XsODataPackage.ENTITY__DELETE_USING:
        getDeleteUsing().clear();
        getDeleteUsing().addAll((Collection<? extends String>)newValue);
        return;
      case XsODataPackage.ENTITY__UPDATE:
        getUpdate().clear();
        getUpdate().addAll((Collection<? extends String>)newValue);
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
      case XsODataPackage.ENTITY__NAMESPACE:
        setNamespace(NAMESPACE_EDEFAULT);
        return;
      case XsODataPackage.ENTITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case XsODataPackage.ENTITY__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case XsODataPackage.ENTITY__NAVIGATES:
        getNavigates().clear();
        return;
      case XsODataPackage.ENTITY__CREATE_EVENTS:
        getCreateEvents().clear();
        return;
      case XsODataPackage.ENTITY__DELETE_USING:
        getDeleteUsing().clear();
        return;
      case XsODataPackage.ENTITY__UPDATE:
        getUpdate().clear();
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
      case XsODataPackage.ENTITY__NAMESPACE:
        return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
      case XsODataPackage.ENTITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case XsODataPackage.ENTITY__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case XsODataPackage.ENTITY__NAVIGATES:
        return navigates != null && !navigates.isEmpty();
      case XsODataPackage.ENTITY__CREATE_EVENTS:
        return createEvents != null && !createEvents.isEmpty();
      case XsODataPackage.ENTITY__DELETE_USING:
        return deleteUsing != null && !deleteUsing.isEmpty();
      case XsODataPackage.ENTITY__UPDATE:
        return update != null && !update.isEmpty();
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
    result.append(" (namespace: ");
    result.append(namespace);
    result.append(", name: ");
    result.append(name);
    result.append(", alias: ");
    result.append(alias);
    result.append(", createEvents: ");
    result.append(createEvents);
    result.append(", deleteUsing: ");
    result.append(deleteUsing);
    result.append(", update: ");
    result.append(update);
    result.append(')');
    return result.toString();
  }

} //EntityImpl
