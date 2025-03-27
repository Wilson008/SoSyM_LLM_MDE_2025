/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Alternative Sub Class To Abstract Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSubClassToAbstractClassImpl#getNewAlternativeSubClass <em>New Alternative Sub Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddAlternativeSubClassToAbstractClassImpl extends OptimizationRuleImpl implements AddAlternativeSubClassToAbstractClass {
	/**
	 * The default value of the '{@link #getNewAlternativeSubClass() <em>New Alternative Sub Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAlternativeSubClass()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_ALTERNATIVE_SUB_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewAlternativeSubClass() <em>New Alternative Sub Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewAlternativeSubClass()
	 * @generated
	 * @ordered
	 */
	protected String newAlternativeSubClass = NEW_ALTERNATIVE_SUB_CLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddAlternativeSubClassToAbstractClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewAlternativeSubClass() {
		return newAlternativeSubClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewAlternativeSubClass(String newNewAlternativeSubClass) {
		String oldNewAlternativeSubClass = newAlternativeSubClass;
		newAlternativeSubClass = newNewAlternativeSubClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS, oldNewAlternativeSubClass, newAlternativeSubClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS:
				return getNewAlternativeSubClass();
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS:
				setNewAlternativeSubClass((String)newValue);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS:
				setNewAlternativeSubClass(NEW_ALTERNATIVE_SUB_CLASS_EDEFAULT);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS:
				return NEW_ALTERNATIVE_SUB_CLASS_EDEFAULT == null ? newAlternativeSubClass != null : !NEW_ALTERNATIVE_SUB_CLASS_EDEFAULT.equals(newAlternativeSubClass);
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
		result.append(" (newAlternativeSubClass: ");
		result.append(newAlternativeSubClass);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		if (newAlternativeSubClass == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty())
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			

			
			int subClassLineNo = -1;
			// judge if the action exists
			if (RegexHelper.doesActionExist(rule)) {
				subClassLineNo = 2;
				if (rule.getLines().size() < 3)
					continue;
			}
			else {
				subClassLineNo = 1;
				
				if (rule.getLines().size() < 2)
					continue;
			}
			
			String lineContent = rule.getLines().get(subClassLineNo).getLineContent();
			
			if (RegexHelper.doesStringExist(lineContent, newAlternativeSubClass))
				break;
			
			if (RegexHelper.doesStringExist(lineContent, "\\;")) {
				if (RegexHelper.doesStringExist(lineContent, "\\w+")) {
					lineContent = lineContent.replaceAll("\\;", " | " + newAlternativeSubClass + ";");
				}
				else {
					lineContent = lineContent.replaceAll("\\;", newAlternativeSubClass + ";");
				}
			}
			else {
				if (RegexHelper.doesStringExist(lineContent, "\\w+")) {
					lineContent += " | " + newAlternativeSubClass;
				}
				else {
					lineContent += newAlternativeSubClass;
				}
			}
			
			rule.getLines().get(subClassLineNo).setLineContent(lineContent);
			break;
		}
	}
} //AddAlternativeSubClassToAbstractClassImpl
