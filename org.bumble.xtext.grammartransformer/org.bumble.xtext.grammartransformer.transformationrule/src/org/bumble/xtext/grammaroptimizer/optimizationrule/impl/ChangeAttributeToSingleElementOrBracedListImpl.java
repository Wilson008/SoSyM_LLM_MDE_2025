/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeToSingleElementOrBracedList;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Change ATo ASemi Or AWith Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ChangeAttributeToSingleElementOrBracedListImpl extends OptimizationRuleImpl implements ChangeAttributeToSingleElementOrBracedList {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ChangeAttributeToSingleElementOrBracedListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST;
	}

	// change A to A ';' | '{' A '}' 
	public void apply() {
		if (attrName == null || attrName.isEmpty())
			return;
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty())
				continue;
			
			if (!rule.getName().equals(grammarRule))
				continue;
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null || line.getAttrName().isEmpty())
					continue;
				
				if (!line.getAttrName().equals(attrName))
					continue;
				
				String lineContent = line.getLineContent();
				String coreContent = lineContent.stripLeading();
				int whiteSpaceNum = StringHelper.getWhitespaceNumAtHead(lineContent);
				lineContent = coreContent + " ';' | '{' " + coreContent + " '}'";
				lineContent = StringHelper.setWhitespaceToString(lineContent, whiteSpaceNum);
				line.setLineContent(lineContent);
				break;
			}
			
			break;
		}
	}
} //ChangeAToASemiOrAWithBracketImpl
