/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Returns</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeReturnsImpl#getNewReturns <em>New Returns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeReturnsImpl extends OptimizationRuleImpl implements ChangeReturns {
	/**
	 * The default value of the '{@link #getNewReturns() <em>New Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewReturns()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_RETURNS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewReturns() <em>New Returns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewReturns()
	 * @generated
	 * @ordered
	 */
	protected String newReturns = NEW_RETURNS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeReturnsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_RETURNS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewReturns() {
		return newReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewReturns(String newNewReturns) {
		String oldNewReturns = newReturns;
		newReturns = newNewReturns;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_RETURNS__NEW_RETURNS, oldNewReturns, newReturns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_RETURNS__NEW_RETURNS:
				return getNewReturns();
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
			case OptimizationrulePackage.CHANGE_RETURNS__NEW_RETURNS:
				setNewReturns((String)newValue);
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
			case OptimizationrulePackage.CHANGE_RETURNS__NEW_RETURNS:
				setNewReturns(NEW_RETURNS_EDEFAULT);
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
			case OptimizationrulePackage.CHANGE_RETURNS__NEW_RETURNS:
				return NEW_RETURNS_EDEFAULT == null ? newReturns != null : !NEW_RETURNS_EDEFAULT.equals(newReturns);
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
		result.append(" (newReturns: ");
		result.append(newReturns);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty())
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			LineEntry firstLine = rule.getLines().get(0);
			String lineContent = firstLine.getLineContent();
			if (RegexHelper.doesStringExist(lineContent, "returns")) {
				int whiteSpaceNum = StringHelper.getWhitespaceNumAtHead(lineContent);
				lineContent = grammarRule + " returns " + newReturns + ":";
				lineContent = StringHelper.setWhitespaceToString(lineContent, whiteSpaceNum);
				firstLine.setLineContent(lineContent);
			}
			
			break;
		}
	}
} //ChangeReturnsImpl
