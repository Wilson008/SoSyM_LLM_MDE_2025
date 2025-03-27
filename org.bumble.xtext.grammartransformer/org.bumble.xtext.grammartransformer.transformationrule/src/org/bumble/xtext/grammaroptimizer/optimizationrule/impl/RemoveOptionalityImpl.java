/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Optionality</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class RemoveOptionalityImpl extends OptimizationRuleImpl implements RemoveOptionality {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveOptionalityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_OPTIONALITY;
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
			
			for (LineEntry lineEntry : rule.getLines()) {
				if (lineEntry.getAttrName() == null)
					continue;
				
				String lineContent = lineEntry.getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, "terminal"))
					break;
				
				if (attrName != null && !attrName.isEmpty()) {
					if (lineEntry.getAttrName().equals(attrName)) {
						Pattern pattern = Pattern.compile("\\((.*" + attrName + ".*?)\\)\\?");
						String X = RegexHelper.getTargetString(lineContent, pattern);
						lineContent = lineContent.replaceAll("\\((.*" + attrName + ".*?)\\)\\?", X);
						lineEntry.setLineContent(lineContent);
						break;
					}
				}
				else {
					if (!RegexHelper.doesStringExist(lineContent, "\\((.*?)\\)\\?"))
						continue;
					
					Pattern pattern = Pattern.compile("\\((.*?)\\)\\?");
					String X = RegexHelper.getTargetString(lineContent, pattern);
					lineContent = lineContent.replaceAll( "\\((.*?)\\)\\?", X);
					lineEntry.setLineContent(lineContent);	
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //RemoveOptionalityImpl
