/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.Collection;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Bracket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl#getTargetAttribute <em>Target Attribute</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveBracesImpl extends OptimizationRuleImpl implements RemoveBraces {
	/**
	 * The default value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_ATTRIBUTE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTargetAttribute() <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetAttribute()
	 * @generated
	 * @ordered
	 */
	protected String targetAttribute = TARGET_ATTRIBUTE_EDEFAULT;

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
	protected RemoveBracesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_BRACES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTargetAttribute() {
		return targetAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetAttribute(String newTargetAttribute) {
		String oldTargetAttribute = targetAttribute;
		targetAttribute = newTargetAttribute;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.REMOVE_BRACES__TARGET_ATTRIBUTE, oldTargetAttribute, targetAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getExcludedGrammarRule() {
		if (excludedGrammarRule == null) {
			excludedGrammarRule = new EDataTypeUniqueEList<String>(String.class, this, OptimizationrulePackage.REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE);
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
			case OptimizationrulePackage.REMOVE_BRACES__TARGET_ATTRIBUTE:
				return getTargetAttribute();
			case OptimizationrulePackage.REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE:
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
			case OptimizationrulePackage.REMOVE_BRACES__TARGET_ATTRIBUTE:
				setTargetAttribute((String)newValue);
				return;
			case OptimizationrulePackage.REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE:
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
			case OptimizationrulePackage.REMOVE_BRACES__TARGET_ATTRIBUTE:
				setTargetAttribute(TARGET_ATTRIBUTE_EDEFAULT);
				return;
			case OptimizationrulePackage.REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE:
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
			case OptimizationrulePackage.REMOVE_BRACES__TARGET_ATTRIBUTE:
				return TARGET_ATTRIBUTE_EDEFAULT == null ? targetAttribute != null : !TARGET_ATTRIBUTE_EDEFAULT.equals(targetAttribute);
			case OptimizationrulePackage.REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE:
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
		result.append(" (targetAttribute: ");
		result.append(targetAttribute);
		result.append(", excludedGrammarRule: ");
		result.append(excludedGrammarRule);
		result.append(')');
		return result.toString();
	}

	/**
	 * This method removes all the brackets with a specified scope
	 */
	public void apply() {
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			// if a grammar rule is specified, then remove the brackets
			// only from the specified grammar rule
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			if (targetAttribute != null && !targetAttribute.isEmpty()) {
				if (!RegexHelper.doesAttributeExist(rule, targetAttribute)) {
					continue;
				}
			}
			
			if (excludedGrammarRule != null) {
				boolean isAvoid = false;
				
				for (String ruleName : excludedGrammarRule) {
					if (rule.getName().equals(ruleName))
					{
						isAvoid = true;
						break;
					}
				}
				
				if (isAvoid)
					continue;
			}
			
			String regexForLeftBracket = "([\'])([{])([\'])";
			String regexForRightBracket = "([\'])([}])([\'])";

			for (LineEntry line : rule.getLines()) {
				String strTemp = line.getLineContent();
				
				// if an attribute is specified, then remove the brackets
				// only from that attribute
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(strTemp, attrName + "\\+*=")) {
						continue;
					}
				}

				strTemp = strTemp.replaceAll(regexForLeftBracket, "");

				line.setLineContent(strTemp.replaceAll(regexForRightBracket, ""));
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}

} //RemoveBracketImpl
