/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Called Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleImpl#getCurrentCalledRule <em>Current Called Rule</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleImpl#getNewCalledRule <em>New Called Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeCalledRuleImpl extends OptimizationRuleImpl implements ChangeCalledRule {
	/**
	 * The default value of the '{@link #getCurrentCalledRule() <em>Current Called Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCalledRule()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_CALLED_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentCalledRule() <em>Current Called Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentCalledRule()
	 * @generated
	 * @ordered
	 */
	protected String currentCalledRule = CURRENT_CALLED_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewCalledRule() <em>New Called Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewCalledRule()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_CALLED_RULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewCalledRule() <em>New Called Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewCalledRule()
	 * @generated
	 * @ordered
	 */
	protected String newCalledRule = NEW_CALLED_RULE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeCalledRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_CALLED_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentCalledRule() {
		return currentCalledRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentCalledRule(String newCurrentCalledRule) {
		String oldCurrentCalledRule = currentCalledRule;
		currentCalledRule = newCurrentCalledRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_CALLED_RULE__CURRENT_CALLED_RULE, oldCurrentCalledRule, currentCalledRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewCalledRule() {
		return newCalledRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewCalledRule(String newNewCalledRule) {
		String oldNewCalledRule = newCalledRule;
		newCalledRule = newNewCalledRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_CALLED_RULE__NEW_CALLED_RULE, oldNewCalledRule, newCalledRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_CALLED_RULE__CURRENT_CALLED_RULE:
				return getCurrentCalledRule();
			case OptimizationrulePackage.CHANGE_CALLED_RULE__NEW_CALLED_RULE:
				return getNewCalledRule();
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
			case OptimizationrulePackage.CHANGE_CALLED_RULE__CURRENT_CALLED_RULE:
				setCurrentCalledRule((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_CALLED_RULE__NEW_CALLED_RULE:
				setNewCalledRule((String)newValue);
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
			case OptimizationrulePackage.CHANGE_CALLED_RULE__CURRENT_CALLED_RULE:
				setCurrentCalledRule(CURRENT_CALLED_RULE_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_CALLED_RULE__NEW_CALLED_RULE:
				setNewCalledRule(NEW_CALLED_RULE_EDEFAULT);
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
			case OptimizationrulePackage.CHANGE_CALLED_RULE__CURRENT_CALLED_RULE:
				return CURRENT_CALLED_RULE_EDEFAULT == null ? currentCalledRule != null : !CURRENT_CALLED_RULE_EDEFAULT.equals(currentCalledRule);
			case OptimizationrulePackage.CHANGE_CALLED_RULE__NEW_CALLED_RULE:
				return NEW_CALLED_RULE_EDEFAULT == null ? newCalledRule != null : !NEW_CALLED_RULE_EDEFAULT.equals(newCalledRule);
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
		result.append(" (currentCalledRule: ");
		result.append(currentCalledRule);
		result.append(", newCalledRule: ");
		result.append(newCalledRule);
		result.append(')');
		return result.toString();
	}
	
	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() != null && rule.getName().equals(grammarRule)) {
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					if (RegexHelper.doesStringExist(lineContent, currentCalledRule)) {
						lineContent = lineContent.replaceAll(currentCalledRule, newCalledRule);
						line.setLineContent(lineContent);
						break;
					}
				}
				break;
			}
		}
	}

} //ChangeCalledRuleImpl
