/**
 * generated by Xtext 2.18.0
 */
package com.sap.xsk.models.xsodata.xsOData.impl;

import com.sap.xsk.models.xsodata.xsOData.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class XsODataFactoryImpl extends EFactoryImpl implements XsODataFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static XsODataFactory init()
  {
    try
    {
      XsODataFactory theXsODataFactory = (XsODataFactory)EPackage.Registry.INSTANCE.getEFactory(XsODataPackage.eNS_URI);
      if (theXsODataFactory != null)
      {
        return theXsODataFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new XsODataFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsODataFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case XsODataPackage.XSO_DATA: return createXSOData();
      case XsODataPackage.TYPE: return createType();
      case XsODataPackage.SERVICE: return createService();
      case XsODataPackage.ENTITY: return createEntity();
      case XsODataPackage.NAVIGATION: return createNavigation();
      case XsODataPackage.ASSOCIATION: return createAssociation();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XSOData createXSOData()
  {
    XSODataImpl xsoData = new XSODataImpl();
    return xsoData;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Service createService()
  {
    ServiceImpl service = new ServiceImpl();
    return service;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Entity createEntity()
  {
    EntityImpl entity = new EntityImpl();
    return entity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Navigation createNavigation()
  {
    NavigationImpl navigation = new NavigationImpl();
    return navigation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Association createAssociation()
  {
    AssociationImpl association = new AssociationImpl();
    return association;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XsODataPackage getXsODataPackage()
  {
    return (XsODataPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static XsODataPackage getPackage()
  {
    return XsODataPackage.eINSTANCE;
  }

} //XsODataFactoryImpl
