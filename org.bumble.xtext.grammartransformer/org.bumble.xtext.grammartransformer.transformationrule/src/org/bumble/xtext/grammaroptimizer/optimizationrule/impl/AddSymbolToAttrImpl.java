/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.Collection;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr;
//import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerPackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Symbol To Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl#getNewSymbol <em>New Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl#getIgnoredAttributes <em>Ignored Attributes</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl#isIsHead <em>Is Head</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl#isOnlyCommonRule <em>Only Common Rule</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl#isOnlyUpperBoundOne <em>Only Upper Bound One</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddSymbolToAttrImpl extends OptimizationRuleImpl implements AddSymbolToAttr {
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
	 * The cached value of the '{@link #getIgnoredAttributes() <em>Ignored Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIgnoredAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> ignoredAttributes;

	/**
	 * The default value of the '{@link #isIsHead() <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHead() <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHead()
	 * @generated
	 * @ordered
	 */
	protected boolean isHead = IS_HEAD_EDEFAULT;
	
	/**
	 * The default value of the '{@link #isOnlyCommonRule() <em>Only Common Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyCommonRule()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_COMMON_RULE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyCommonRule() <em>Only Common Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyCommonRule()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyCommonRule = ONLY_COMMON_RULE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOnlyUpperBoundOne() <em>Only Upper Bound One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyUpperBoundOne()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ONLY_UPPER_BOUND_ONE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOnlyUpperBoundOne() <em>Only Upper Bound One</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOnlyUpperBoundOne()
	 * @generated
	 * @ordered
	 */
	protected boolean onlyUpperBoundOne = ONLY_UPPER_BOUND_ONE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddSymbolToAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_SYMBOL_TO_ATTR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__NEW_SYMBOL, oldNewSymbol, newSymbol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getIgnoredAttributes() {
		if (ignoredAttributes == null) {
			ignoredAttributes = new EDataTypeUniqueEList<String>(String.class, this, OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES);
		}
		return ignoredAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHead() {
		return isHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHead(boolean newIsHead) {
		boolean oldIsHead = isHead;
		isHead = newIsHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IS_HEAD, oldIsHead, isHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyCommonRule() {
		return onlyCommonRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyCommonRule(boolean newOnlyCommonRule) {
		boolean oldOnlyCommonRule = onlyCommonRule;
		onlyCommonRule = newOnlyCommonRule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE, oldOnlyCommonRule, onlyCommonRule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOnlyUpperBoundOne() {
		return onlyUpperBoundOne;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOnlyUpperBoundOne(boolean newOnlyUpperBoundOne) {
		boolean oldOnlyUpperBoundOne = onlyUpperBoundOne;
		onlyUpperBoundOne = newOnlyUpperBoundOne;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE, oldOnlyUpperBoundOne, onlyUpperBoundOne));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__NEW_SYMBOL:
				return getNewSymbol();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES:
				return getIgnoredAttributes();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IS_HEAD:
				return isIsHead();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE:
				return isOnlyCommonRule();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE:
				return isOnlyUpperBoundOne();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__NEW_SYMBOL:
				setNewSymbol((String)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES:
				getIgnoredAttributes().clear();
				getIgnoredAttributes().addAll((Collection<? extends String>)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IS_HEAD:
				setIsHead((Boolean)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE:
				setOnlyCommonRule((Boolean)newValue);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE:
				setOnlyUpperBoundOne((Boolean)newValue);
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
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__NEW_SYMBOL:
				setNewSymbol(NEW_SYMBOL_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES:
				getIgnoredAttributes().clear();
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IS_HEAD:
				setIsHead(IS_HEAD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE:
				setOnlyCommonRule(ONLY_COMMON_RULE_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE:
				setOnlyUpperBoundOne(ONLY_UPPER_BOUND_ONE_EDEFAULT);
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
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__NEW_SYMBOL:
				return NEW_SYMBOL_EDEFAULT == null ? newSymbol != null : !NEW_SYMBOL_EDEFAULT.equals(newSymbol);
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES:
				return ignoredAttributes != null && !ignoredAttributes.isEmpty();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__IS_HEAD:
				return isHead != IS_HEAD_EDEFAULT;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE:
				return onlyCommonRule != ONLY_COMMON_RULE_EDEFAULT;
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE:
				return onlyUpperBoundOne != ONLY_UPPER_BOUND_ONE_EDEFAULT;
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
		result.append(", ignoredAttributes: ");
		result.append(ignoredAttributes);
		result.append(", isHead: ");
		result.append(isHead);
		result.append(", onlyCommonRule: ");
		result.append(onlyCommonRule);
		result.append(", onlyUpperBoundOne: ");
		result.append(onlyUpperBoundOne);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (newSymbol == null || newSymbol.isEmpty())
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammarRule.equals(rule.getName()))
					continue;
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (onlyCommonRule) {
					if (RegexHelper.doesStringExist(lineContent, "enum"))
						break;
					if (RegexHelper.doesStringExist(lineContent, "terminal"))
						break;
				}
				
				if (!RegexHelper.doesStringExist(lineContent, "\\="))
					continue;
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!line.getAttrName().equals(attrName)) {
						continue;
					}
				}		

				if (onlyUpperBoundOne) {
					if (RegexHelper.doesStringExist(lineContent, "\\+\\="))
						continue;
				}
				
				
				if (null != ignoredAttributes) {
					boolean needAvoid = false;
					for (String attrTemp : ignoredAttributes) {
						if (line.getAttrName().equals(attrTemp)) {
							needAvoid = true;
							break;
						}
					}
					
					if (needAvoid) 
						continue;
				}
				
				if (isHead) {
					String regex = "";
					if (RegexHelper.doesStringExist(lineContent, "\\(")) {
						regex = "\\(\\s*" + "\'\\" + newSymbol + "\'";
						if (!RegexHelper.doesStringExist(lineContent, regex)) {
							lineContent = lineContent.replaceAll("\\(", "('" + newSymbol + "'");
						}
					}
					else {
						lineContent = "'" + newSymbol + "' " + lineContent; 
					}										
				}
				else {
					String regex = "";
					if (RegexHelper.doesStringExist(lineContent, "\\)")) {
						regex = "\'\\" + newSymbol + "\'" + "\\s*\\)";
						if (!RegexHelper.doesStringExist(lineContent, regex)) {
							lineContent = lineContent.replaceAll("\\)", " '" + newSymbol + "')");
						}
					}
					else {
						regex = "\\+*\\=.*\\w.*" + "\'\\" + newSymbol + "\'";
						if (!RegexHelper.doesStringExist(lineContent, regex)) {
							lineContent += " '" + newSymbol + "' ";
						}					
					}
				}
				
				line.setLineContent(lineContent);
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddSymbolToAttrImpl
