/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Optionality To Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddOptionalityToLineImpl extends OptimizationRuleImpl implements AddOptionalityToLine {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOptionalityToLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_OPTIONALITY_TO_LINE;
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
				
				String lineContent = line.getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!line.getAttrName().equals(attrName))					
						continue;
				}
				
				int numOfWhitespace = StringHelper.getWhitespaceNumAtHead(lineContent);
				String coreContent = lineContent.stripLeading();
				lineContent = "(" + coreContent + ")?";
				lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhitespace);
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
} //AddOptionalityToLineImpl
