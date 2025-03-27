/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Bracket To Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddBracesToLineImpl extends OptimizationRuleImpl implements AddBracesToLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddBracesToLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_BRACES_TO_LINE;
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
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!attrName.equals(line.getAttrName()))
						continue;
				}
				
				String lineContent = line.getLineContent();
				int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(lineContent);
				String coreContent = lineContent.stripLeading();
				lineContent = "'{'" + coreContent + "'}'";
				lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhiteSpace);
				line.setLineContent(lineContent);
				
				if (attrName != null && !attrName.isEmpty()) {
					break;
				}
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddBracketToLineImpl
