/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Bracket To Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddBracesToRuleImpl extends OptimizationRuleImpl implements AddBracesToRule {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddBracesToRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_BRACES_TO_RULE;
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			int lineCount = rule.getLines().size();
			
			if (lineCount >= 2) {
				String secondLineContent = rule.getLines().get(1).getLineContent();
				int numOfWhitespaceIn2nd = StringHelper.getWhitespaceNumAtHead(secondLineContent);
				String coreContentIn2nd = secondLineContent.stripLeading();
				secondLineContent = "'{'" + coreContentIn2nd;
				secondLineContent = StringHelper.setWhitespaceToString(secondLineContent, numOfWhitespaceIn2nd);
				rule.getLines().get(1).setLineContent(secondLineContent);
				
				String lastLineContent = rule.getLines().get(lineCount - 1).getLineContent();
				
				// if at least one English letter exist in the last line
				if (RegexHelper.doesStringExist(lastLineContent, "(\\w*)")) {
					Pattern pattern = Pattern.compile("(\\w*)\\;");
					String coreLastLineContent = RegexHelper.getTargetString(lastLineContent, pattern);
					
					if (coreLastLineContent != null) {
						lastLineContent = lastLineContent.replaceAll("\\;", "'}';");
					}
				}
				else {
					lastLineContent = lastLineContent.replaceAll("\\;", "'}';");
				}
				
				rule.getLines().get(lineCount - 1).setLineContent(lastLineContent);
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddBracketToRuleImpl
