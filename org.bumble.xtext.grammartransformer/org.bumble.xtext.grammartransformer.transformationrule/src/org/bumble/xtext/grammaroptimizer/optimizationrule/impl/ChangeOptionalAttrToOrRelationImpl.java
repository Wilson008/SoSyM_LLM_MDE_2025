/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.Collection;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Optional Attr To Or Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl#isIsAll <em>Is All</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl#getStartAttr <em>Start Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl#getEndAttr <em>End Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeOptionalAttrToOrRelationImpl extends OptimizationRuleImpl implements ChangeOptionalAttrToOrRelation {
	/**
	 * The default value of the '{@link #isIsAll() <em>Is All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ALL_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isIsAll() <em>Is All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAll()
	 * @generated
	 * @ordered
	 */
	protected boolean isAll = IS_ALL_EDEFAULT;
	/**
	 * The default value of the '{@link #getStartAttr() <em>Start Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String START_ATTR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getStartAttr() <em>Start Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAttr()
	 * @generated
	 * @ordered
	 */
	protected String startAttr = START_ATTR_EDEFAULT;
	/**
	 * The default value of the '{@link #getEndAttr() <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String END_ATTR_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEndAttr() <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAttr()
	 * @generated
	 * @ordered
	 */
	protected String endAttr = END_ATTR_EDEFAULT;
	/**
	 * The cached value of the '{@link #getExcludedGrammarRule() <em>Excluded Grammar Rule</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExcludedGrammarRule()
	 * @generated
	 * @ordered
	 */
	protected EList<String> excludedGrammarRule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeOptionalAttrToOrRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAll() {
		return isAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAll(boolean newIsAll) {
		boolean oldIsAll = isAll;
		isAll = newIsAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL, oldIsAll, isAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartAttr() {
		return startAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAttr(String newStartAttr) {
		String oldStartAttr = startAttr;
		startAttr = newStartAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR, oldStartAttr, startAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndAttr() {
		return endAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAttr(String newEndAttr) {
		String oldEndAttr = endAttr;
		endAttr = newEndAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR, oldEndAttr, endAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExcludedGrammarRule() {
		if (excludedGrammarRule == null) {
			excludedGrammarRule = new EDataTypeUniqueEList<String>(String.class, this, OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE);
		}
		return excludedGrammarRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL:
				return isIsAll();
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR:
				return getStartAttr();
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR:
				return getEndAttr();
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE:
				return getExcludedGrammarRule();
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
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL:
				setIsAll((Boolean)newValue);
				return;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR:
				setStartAttr((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR:
				setEndAttr((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE:
				getExcludedGrammarRule().clear();
				getExcludedGrammarRule().addAll((Collection<? extends String>)newValue);
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
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL:
				setIsAll(IS_ALL_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR:
				setStartAttr(START_ATTR_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR:
				setEndAttr(END_ATTR_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE:
				getExcludedGrammarRule().clear();
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
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL:
				return isAll != IS_ALL_EDEFAULT;
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR:
				return START_ATTR_EDEFAULT == null ? startAttr != null : !START_ATTR_EDEFAULT.equals(startAttr);
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR:
				return END_ATTR_EDEFAULT == null ? endAttr != null : !END_ATTR_EDEFAULT.equals(endAttr);
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE:
				return excludedGrammarRule != null && !excludedGrammarRule.isEmpty();
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
		result.append(" (isAll: ");
		result.append(isAll);
		result.append(", startAttr: ");
		result.append(startAttr);
		result.append(", endAttr: ");
		result.append(endAttr);
		result.append(", excludedGrammarRule: ");
		result.append(excludedGrammarRule);
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
			
			if (null != excludedGrammarRule) {
				boolean isAvoid = false;
				
				for (String excludedRuleName : excludedGrammarRule) {
					if (excludedRuleName.equals(rule.getName())) {
						isAvoid = true;
						break;
					}
				}
				
				if (isAvoid)
					continue;
			}
			
			if (isAll) {
				// if all the attributes are optional
				if (RegexHelper.areAttributesOptional(rule)) {
					// remove "()?" for all the attributes
					RemoveOptionality removeOptionality = GrammaroptimizerFactory.eINSTANCE.createRemoveOptionality();
					removeOptionality.setGrammar(grammar);
					removeOptionality.setGrammarRule(rule.getName());				
					removeOptionality.setAttrName(null);
					removeOptionality.apply();
					
					// add an "|" between attributes
					RegexHelper.addOperatorSymbolBetweenAttrs(rule, "|");
				}
			}
			else {
				if (startAttr == null || startAttr.isEmpty() || 
						endAttr == null || endAttr.isEmpty()) 
					return;
				int attrANo = -1;
				int attrBNo = -1;
				for (int i = 0; i < rule.getLines().size(); i++) {
					if (rule.getLines().get(i).getAttrName() == null)
						continue;
					
					if (rule.getLines().get(i).getAttrName().equals(startAttr)) {
						attrANo = i;
						continue;
					}
					
					if (rule.getLines().get(i).getAttrName().equals(endAttr)) {
						attrBNo = i;
						continue;
					}
					
					if (attrANo >= 0 && attrBNo >= 0)
						break;
				}
				
				if (attrANo > attrBNo)
					break;
				
				if (attrANo < 0 || attrBNo < 0)
					break;
				
				for (int j = attrANo; j <= attrBNo; j++) {
					RemoveOptionality removeOptionality = GrammaroptimizerFactory.eINSTANCE.createRemoveOptionality();
					removeOptionality.setGrammar(grammar);
					removeOptionality.setGrammarRule(rule.getName());
					if (rule.getLines().get(j).getAttrName() == null)
						continue;
					removeOptionality.setAttrName(rule.getLines().get(j).getAttrName());
					removeOptionality.apply();
					
					if (j != attrBNo && RegexHelper.doesStringExist(rule.getLines().get(j).getLineContent(), "(\\w)")) {
						String lineContent = rule.getLines().get(j).getLineContent();
						rule.getLines().get(j).setLineContent(lineContent + " |");
					}
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //ChangeOptionalAttrToOrRelationImpl
