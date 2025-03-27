/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Optionality To Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToSymbolImpl#getTargetSymbol <em>Target Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddOptionalityToSymbolImpl extends OptimizationRuleImpl implements AddOptionalityToSymbol {
	/**
	 * The default value of the '{@link #getTargetSymbol() <em>Target Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetSymbol() <em>Target Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetSymbol()
	 * @generated
	 * @ordered
	 */
	protected String targetSymbol = TARGET_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOptionalityToSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_OPTIONALITY_TO_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetSymbol() {
		return targetSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetSymbol(String newTargetSymbol) {
		String oldTargetSymbol = targetSymbol;
		targetSymbol = newTargetSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL, oldTargetSymbol, targetSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL:
				return getTargetSymbol();
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL:
				setTargetSymbol((String)newValue);
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL:
				setTargetSymbol(TARGET_SYMBOL_EDEFAULT);
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
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL:
				return TARGET_SYMBOL_EDEFAULT == null ? targetSymbol != null : !TARGET_SYMBOL_EDEFAULT.equals(targetSymbol);
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
		result.append(" (targetSymbol: ");
		result.append(targetSymbol);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineContent, attrName)) {
						continue;
					}
				}
				
				String regexWithDoubleQuotes = "\"\\" + targetSymbol + "\"";
				String regexWithSingleQuotes = "\'\\" + targetSymbol + "\'";
				String replacementWithDoubleQuotes = "(\"" + targetSymbol + "\")?";
				String replacementWithSingleQuotes = "(\'" + targetSymbol + "\')?";
				
				if (RegexHelper.doesStringExist(lineContent, regexWithDoubleQuotes)) {
					lineContent = lineContent.replaceAll(regexWithDoubleQuotes, replacementWithDoubleQuotes);
					line.setLineContent(lineContent);
				}
				else if (RegexHelper.doesStringExist(lineContent, regexWithSingleQuotes)) {
					lineContent = lineContent.replaceAll(regexWithSingleQuotes, replacementWithSingleQuotes);
					line.setLineContent(lineContent);
				}
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //AddOptionalityToSymbolImpl
