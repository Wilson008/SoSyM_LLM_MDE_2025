/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBooleanAttrToSpecialPattern;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change Boolean Attr To Special Patten</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChangeBooleanAttrToSpecialPatternImpl extends OptimizationRuleImpl implements ChangeBooleanAttrToSpecialPattern {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeBooleanAttrToSpecialPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN;
	}

	public void apply() {
		if (attrName == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) 
					continue;
			}
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				
				if (line.getAttrName().equals(attrName)) {
					String lineContent = line.getLineContent();
					int whitespaceNumInHead = StringHelper.getWhitespaceNumAtHead(lineContent);
					lineContent = attrName + "?=\'" + attrName + "\'";
					lineContent = StringHelper.setWhitespaceToString(lineContent, whitespaceNumInHead);
					line.setLineContent(lineContent);
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //ChangeBooleanAttrToSpecialPattenImpl
