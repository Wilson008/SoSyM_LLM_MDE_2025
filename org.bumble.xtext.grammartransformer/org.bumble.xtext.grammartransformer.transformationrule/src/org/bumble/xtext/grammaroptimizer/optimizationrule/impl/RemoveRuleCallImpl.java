/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Rule Call</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl#getCalledRuleName <em>Called Rule Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveRuleCallImpl extends OptimizationRuleImpl implements RemoveRuleCall {
	/**
	 * The default value of the '{@link #getCalledRuleName() <em>Called Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledRuleName()
	 * @generated
	 * @ordered
	 */
	protected static final String CALLED_RULE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCalledRuleName() <em>Called Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCalledRuleName()
	 * @generated
	 * @ordered
	 */
	protected String calledRuleName = CALLED_RULE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveRuleCallImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_RULE_CALL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCalledRuleName() {
		return calledRuleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCalledRuleName(String newCalledRuleName) {
		String oldCalledRuleName = calledRuleName;
		calledRuleName = newCalledRuleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.REMOVE_RULE_CALL__CALLED_RULE_NAME, oldCalledRuleName, calledRuleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.REMOVE_RULE_CALL__CALLED_RULE_NAME:
				return getCalledRuleName();
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
			case OptimizationrulePackage.REMOVE_RULE_CALL__CALLED_RULE_NAME:
				setCalledRuleName((String)newValue);
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
			case OptimizationrulePackage.REMOVE_RULE_CALL__CALLED_RULE_NAME:
				setCalledRuleName(CALLED_RULE_NAME_EDEFAULT);
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
			case OptimizationrulePackage.REMOVE_RULE_CALL__CALLED_RULE_NAME:
				return CALLED_RULE_NAME_EDEFAULT == null ? calledRuleName != null : !CALLED_RULE_NAME_EDEFAULT.equals(calledRuleName);
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
		result.append(" (calledRuleName: ");
		result.append(calledRuleName);
		result.append(')');
		return result.toString();
	}
	
	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			for (LineEntry lineEntry : rule.getLines()) {
				if (!RegexHelper.doesStringExist(lineEntry.getLineContent(), calledRuleName))
					continue;
				
				String lineContent = lineEntry.getLineContent();

				if (RegexHelper.doesStringExist(lineContent, calledRuleName + "\\s+\\|") && 
						!RegexHelper.doesStringExist(lineContent, "\\w+" + calledRuleName + "\\s+\\|")) {
					lineContent = lineContent.replaceAll("\\s+" + calledRuleName + "\\s+\\|", " ");
					lineEntry.setLineContent(lineContent);
					break;
				}
				
				if (RegexHelper.doesStringExist(lineContent, "\\|\\s+" + calledRuleName + "\\s+")) {
					lineContent = lineContent.replaceAll( "\\|\\s+" + calledRuleName + "\\s+", " ");
					lineEntry.setLineContent(lineContent);
					break;
				}
				
				if (RegexHelper.doesStringExist(lineContent, "\\|\\s+" + calledRuleName + "\\;")) {
					lineContent = lineContent.replaceAll( "\\|\\s+" + calledRuleName + "\\;", ";");
					lineEntry.setLineContent(lineContent);
					break;
				}
				
				// if only one rule is called in the current rule, then just remove it
				// and there should be somewhere to remove the current as well
				if (!RegexHelper.doesStringExist(lineContent, "\\w*.*" + calledRuleName)
						&& RegexHelper.doesStringExist(lineContent, calledRuleName + ".*\\w*")) {
					lineContent = lineContent.replaceAll( calledRuleName, "");
					lineEntry.setLineContent(lineContent);
					break;
				}
			}
			break;
		}
	}

} //RemoveRuleCallImpl
