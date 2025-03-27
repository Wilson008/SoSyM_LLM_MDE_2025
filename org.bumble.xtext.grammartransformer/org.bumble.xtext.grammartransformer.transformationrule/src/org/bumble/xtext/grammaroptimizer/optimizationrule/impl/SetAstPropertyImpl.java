/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Ast Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl#getClassName <em>Class Name</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl#getPropertyName <em>Property Name</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl#getPropertyValue <em>Property Value</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl#isMulti <em>Multi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetAstPropertyImpl extends OptimizationRuleImpl implements SetAstProperty {
	/**
	 * The default value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassName() <em>Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassName()
	 * @generated
	 * @ordered
	 */
	protected String className = CLASS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyName() <em>Property Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyName()
	 * @generated
	 * @ordered
	 */
	protected String propertyName = PROPERTY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected static final String PROPERTY_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPropertyValue() <em>Property Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPropertyValue()
	 * @generated
	 * @ordered
	 */
	protected String propertyValue = PROPERTY_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MULTI_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMulti() <em>Multi</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMulti()
	 * @generated
	 * @ordered
	 */
	protected boolean multi = MULTI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetAstPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.SET_AST_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassName(String newClassName) {
		String oldClassName = className;
		className = newClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.SET_AST_PROPERTY__CLASS_NAME, oldClassName, className));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyName(String newPropertyName) {
		String oldPropertyName = propertyName;
		propertyName = newPropertyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_NAME, oldPropertyName, propertyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPropertyValue() {
		return propertyValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPropertyValue(String newPropertyValue) {
		String oldPropertyValue = propertyValue;
		propertyValue = newPropertyValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_VALUE, oldPropertyValue, propertyValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMulti() {
		return multi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMulti(boolean newMulti) {
		boolean oldMulti = multi;
		multi = newMulti;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.SET_AST_PROPERTY__MULTI, oldMulti, multi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.SET_AST_PROPERTY__CLASS_NAME:
				return getClassName();
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_NAME:
				return getPropertyName();
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_VALUE:
				return getPropertyValue();
			case OptimizationrulePackage.SET_AST_PROPERTY__MULTI:
				return isMulti();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.SET_AST_PROPERTY__CLASS_NAME:
				setClassName((String)newValue);
				return;
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_NAME:
				setPropertyName((String)newValue);
				return;
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_VALUE:
				setPropertyValue((String)newValue);
				return;
			case OptimizationrulePackage.SET_AST_PROPERTY__MULTI:
				setMulti((Boolean)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.SET_AST_PROPERTY__CLASS_NAME:
				setClassName(CLASS_NAME_EDEFAULT);
				return;
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_NAME:
				setPropertyName(PROPERTY_NAME_EDEFAULT);
				return;
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_VALUE:
				setPropertyValue(PROPERTY_VALUE_EDEFAULT);
				return;
			case OptimizationrulePackage.SET_AST_PROPERTY__MULTI:
				setMulti(MULTI_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.SET_AST_PROPERTY__CLASS_NAME:
				return CLASS_NAME_EDEFAULT == null ? className != null : !CLASS_NAME_EDEFAULT.equals(className);
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_NAME:
				return PROPERTY_NAME_EDEFAULT == null ? propertyName != null : !PROPERTY_NAME_EDEFAULT.equals(propertyName);
			case OptimizationrulePackage.SET_AST_PROPERTY__PROPERTY_VALUE:
				return PROPERTY_VALUE_EDEFAULT == null ? propertyValue != null : !PROPERTY_VALUE_EDEFAULT.equals(propertyValue);
			case OptimizationrulePackage.SET_AST_PROPERTY__MULTI:
				return multi != MULTI_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (className: ");
		result.append(className);
		result.append(", propertyName: ");
		result.append(propertyName);
		result.append(", propertyValue: ");
		result.append(propertyValue);
		result.append(", multi: ");
		result.append(multi);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (className == null || className.isEmpty() ||
			propertyName == null || propertyName.isEmpty() ||
			propertyValue == null || propertyValue.isEmpty() ||
			grammarRule == null || grammarRule.isEmpty()) 
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, "\\{" + grammarRule + "\\}")) {
					if (multi)
						lineContent = "    {" + className + "." + propertyName + "+=" + propertyValue + "}";
					else
						lineContent = "    {" + className + "." + propertyName + "=" + propertyValue + "}";
					line.setLineContent(lineContent);
					return;
				}
			}
		}
	}
} //SetAstPropertyImpl
