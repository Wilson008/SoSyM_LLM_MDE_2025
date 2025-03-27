/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Symbol Without Quote To Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl#getSymbol <em>Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl#isIsFront <em>Is Front</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSymbolWithoutQuoteToKeywordImpl extends OptimizationRuleImpl implements AddSymbolWithoutQuoteToKeyword {
	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

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
	protected AddSymbolWithoutQuoteToKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD, oldKeyword, keyword));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL, oldSymbol, symbol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT, oldIsFront, isFront));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD:
				return getKeyword();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL:
				return getSymbol();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT:
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
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD:
				setKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL:
				setSymbol((String)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT:
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
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL:
				setSymbol(SYMBOL_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT:
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
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL:
				return SYMBOL_EDEFAULT == null ? symbol != null : !SYMBOL_EDEFAULT.equals(symbol);
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT:
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
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(", symbol: ");
		result.append(symbol);
		result.append(", isFront: ");
		result.append(isFront);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) 
					continue;
			}
			
			String strExistingKeyword = "\'" + keyword + "\'";
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!line.getAttrName().equals(attrName))
						continue;
				}
				
				String lineContent = line.getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, strExistingKeyword)) {
					if (isFront) 
						lineContent = lineContent.replaceAll(strExistingKeyword, symbol + strExistingKeyword);
					else
						lineContent = lineContent.replaceAll(strExistingKeyword, strExistingKeyword + symbol);
					
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
} //AddSymbolWithoutQuoteToKeywordImpl
