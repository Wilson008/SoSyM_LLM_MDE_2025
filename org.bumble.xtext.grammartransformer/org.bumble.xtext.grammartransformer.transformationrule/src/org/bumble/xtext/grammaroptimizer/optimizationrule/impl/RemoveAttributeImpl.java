package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
/**
 */

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveAttributeImpl extends OptimizationRuleImpl implements RemoveAttribute {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveAttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_ATTRIBUTE;
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
				if (line.getAttrName() != null) {
					if (line.getAttrName().equals(attrName)) {
						rule.getLines().remove(line);
						break;
					}
				}
				else
				{
					if (RegexHelper.doesStringExist(line.getLineContent(), attrName)) {
						rule.getLines().remove(line);
						break;
					}
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //RemoveAttributeImpl
