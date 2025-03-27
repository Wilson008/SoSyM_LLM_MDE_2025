/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Symbol To Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl#getBInside <em>BInside</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSymbolToRuleImpl extends OptimizationRuleImpl implements AddSymbolToRule {
	/**
	 * The default value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSymbol() <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSymbol()
	 * @generated
	 * @ordered
	 */
	protected String symbol = SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBInside() <em>BInside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBInside()
	 * @generated
	 * @ordered
	 */
	protected static final String BINSIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBInside() <em>BInside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBInside()
	 * @generated
	 * @ordered
	 */
	protected String bInside = BINSIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSymbolToRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_SYMBOL_TO_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSymbol() {
		return symbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSymbol(String newSymbol) {
		String oldSymbol = symbol;
		symbol = newSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_TO_RULE__SYMBOL, oldSymbol, symbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBInside() {
		return bInside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBInside(String newBInside) {
		String oldBInside = bInside;
		bInside = newBInside;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_TO_RULE__BINSIDE, oldBInside, bInside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__SYMBOL:
				return getSymbol();
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__BINSIDE:
				return getBInside();
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
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__SYMBOL:
				setSymbol((String)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__BINSIDE:
				setBInside((String)newValue);
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
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__BINSIDE:
				setBInside(BINSIDE_EDEFAULT);
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
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE__BINSIDE:
				return BINSIDE_EDEFAULT == null ? bInside != null : !BINSIDE_EDEFAULT.equals(bInside);
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
		result.append(" (symbol: ");
		result.append(symbol);
		result.append(", bInside: ");
		result.append(bInside);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (symbol == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammarRule.equals(rule.getName())) {
					continue;
				}
			}
			
			int lineCount = rule.getLines().size();
			if (lineCount <= 1)
				break;
			
			for (int i = lineCount -1; i > 0; i--) {
				String lineContent = rule.getLines().get(i).getLineContent();
				if (RegexHelper.doesStringExist(lineContent, "\\;")) {
					if (bInside != null && bInside.equals("IN") && RegexHelper.doesStringExist(lineContent, "\\)\\?")) {
						lineContent = lineContent.replaceAll("\\)\\?.*\\;", " '" + symbol + "')?" + ";");
					}
					else if (bInside != null && bInside.equals("OUT") && RegexHelper.doesStringExist(lineContent, "\\)\\?")) {
						lineContent = lineContent.replaceAll("\\)\\?.*\\;", ")? '" + symbol + "'" + ";");
					}
					else {
						lineContent = lineContent.replaceAll("\\;", " '" + symbol + "' " + ";");						
					}
					rule.getLines().get(lineCount - 1).setLineContent(lineContent);
					break;
				}
			}			
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddSymbolToRuleImpl
