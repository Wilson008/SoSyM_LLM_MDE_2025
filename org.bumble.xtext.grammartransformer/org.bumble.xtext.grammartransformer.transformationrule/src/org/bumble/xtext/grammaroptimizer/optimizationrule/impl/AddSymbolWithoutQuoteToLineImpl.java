/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Symbol Without Quote To Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToLineImpl#getNewSymbol <em>New Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToLineImpl#isIsFront <em>Is Front</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSymbolWithoutQuoteToLineImpl extends OptimizationRuleImpl implements AddSymbolWithoutQuoteToLine {
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
	 * The default value of the '{@link #isIsFront() <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFront()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FRONT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsFront() <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFront()
	 * @generated
	 * @ordered
	 */
	protected boolean isFront = IS_FRONT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSymbolWithoutQuoteToLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL, oldNewSymbol, newSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFront() {
		return isFront;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFront(boolean newIsFront) {
		boolean oldIsFront = isFront;
		isFront = newIsFront;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT, oldIsFront, isFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL:
				return getNewSymbol();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT:
				return isIsFront();
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
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL:
				setNewSymbol((String)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT:
				setIsFront((Boolean)newValue);
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
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL:
				setNewSymbol(NEW_SYMBOL_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT:
				setIsFront(IS_FRONT_EDEFAULT);
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
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL:
				return NEW_SYMBOL_EDEFAULT == null ? newSymbol != null : !NEW_SYMBOL_EDEFAULT.equals(newSymbol);
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT:
				return isFront != IS_FRONT_EDEFAULT;
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
		result.append(", isFront: ");
		result.append(isFront);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (newSymbol == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				
				if (!line.getAttrName().equals(attrName))
					continue;
				
				String lineContent = line.getLineContent();
				
				if (isFront) {
					int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(lineContent);
					String coreLineContent = lineContent.stripLeading();
					lineContent = newSymbol + coreLineContent;
					lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhiteSpace);
				}
				else {
					lineContent = lineContent + newSymbol;
				}
				
				line.setLineContent(lineContent);
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //AddSymbolWithoutQuoteToLineImpl
