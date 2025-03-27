/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Alternative Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSymbolImpl#getCurrentSymbol <em>Current Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSymbolImpl#getNewSymbol <em>New Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddAlternativeSymbolImpl extends OptimizationRuleImpl implements AddAlternativeSymbol {
	/**
	 * The default value of the '{@link #getCurrentSymbol() <em>Current Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String CURRENT_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCurrentSymbol() <em>Current Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCurrentSymbol()
	 * @generated
	 * @ordered
	 */
	protected String currentSymbol = CURRENT_SYMBOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getNewSymbol() <em>New Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSymbol()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_SYMBOL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewSymbol() <em>New Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewSymbol()
	 * @generated
	 * @ordered
	 */
	protected String newSymbol = NEW_SYMBOL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddAlternativeSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_ALTERNATIVE_SYMBOL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCurrentSymbol() {
		return currentSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentSymbol(String newCurrentSymbol) {
		String oldCurrentSymbol = currentSymbol;
		currentSymbol = newCurrentSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL, oldCurrentSymbol, currentSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewSymbol() {
		return newSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewSymbol(String newNewSymbol) {
		String oldNewSymbol = newSymbol;
		newSymbol = newNewSymbol;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL, oldNewSymbol, newSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL:
				return getCurrentSymbol();
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL:
				return getNewSymbol();
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL:
				setCurrentSymbol((String)newValue);
				return;
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL:
				setNewSymbol((String)newValue);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL:
				setCurrentSymbol(CURRENT_SYMBOL_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL:
				setNewSymbol(NEW_SYMBOL_EDEFAULT);
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
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL:
				return CURRENT_SYMBOL_EDEFAULT == null ? currentSymbol != null : !CURRENT_SYMBOL_EDEFAULT.equals(currentSymbol);
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL:
				return NEW_SYMBOL_EDEFAULT == null ? newSymbol != null : !NEW_SYMBOL_EDEFAULT.equals(newSymbol);
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
		result.append(" (currentSymbol: ");
		result.append(currentSymbol);
		result.append(", newSymbol: ");
		result.append(newSymbol);
		result.append(')');
		return result.toString();
	}

	// Add a new keyword (e.g. 'B') to an existing keyword (e.g. 'A'), so then it will be 'A' | 'B'
	public void apply() {
		if (currentSymbol == null || currentSymbol.isEmpty() || newSymbol == null || newSymbol.isEmpty())
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) 
					continue;
			}
			
			String strExistingKeyword = "\'\\" + currentSymbol + "\'";
			String strNewKeyword = "'" + currentSymbol + "' | '" + newSymbol + "'";
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, strExistingKeyword)) {
					lineContent = lineContent.replaceAll(strExistingKeyword, strNewKeyword);
					line.setLineContent(lineContent);
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddAlternativeSymbolImpl
