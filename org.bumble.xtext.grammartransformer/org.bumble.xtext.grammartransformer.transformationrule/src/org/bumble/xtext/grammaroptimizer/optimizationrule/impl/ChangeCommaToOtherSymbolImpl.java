/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Comma To Other Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl#getNewSymbol <em>New Symbol</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeCommaToOtherSymbolImpl extends OptimizationRuleImpl implements ChangeCommaToOtherSymbol {
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
	protected ChangeCommaToOtherSymbolImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_COMMA_TO_OTHER_SYMBOL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL, oldNewSymbol, newSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL:
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
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL:
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
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL:
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
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL:
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
		result.append(" (newSymbol: ");
		result.append(newSymbol);
		result.append(')');
		return result.toString();
	}
	
	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() != null && rule.getName().equals(grammarRule)) {
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					if (RegexHelper.doesStringExist(lineContent, attrName)) {
						if (RegexHelper.doesStringExist(newSymbol, "\\w+"))
							lineContent = lineContent.replaceAll("\"\\,\"", "'" + newSymbol + "'");
						else 
							lineContent = lineContent.replaceAll("\\,", newSymbol);
						line.setLineContent(lineContent);
						break;
					}
				}
				break;
			}
		}
	}

} //ChangeCommaToOtherSymbolImpl
