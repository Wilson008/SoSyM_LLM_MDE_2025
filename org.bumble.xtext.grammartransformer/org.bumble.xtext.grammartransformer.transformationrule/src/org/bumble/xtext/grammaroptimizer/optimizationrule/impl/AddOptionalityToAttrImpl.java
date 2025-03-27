/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Optionality To Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AddOptionalityToAttrImpl extends OptimizationRuleImpl implements AddOptionalityToAttr {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddOptionalityToAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_OPTIONALITY_TO_ATTR;
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule))
					continue;
			}
			
			// if an attribute contains a += symbol, then I call it X here
			boolean isX = false;
			String X = "";
			String Y = "";
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();
				
				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineContent, attrName)) {
						continue;
					}
					
					if (RegexHelper.doesStringExist(lineContent, "\\+\\=")) {
						isX = true;
						X = StringHelper.getX(lineContent, attrName);
					}
					else {
						isX = false;
						Y = "(" + attrName + "\\?*\\=\\s*\'*\\w*[\\s\\S+]*\'*)";
					}
				}
				else {
					if (RegexHelper.doesStringExist(lineContent, "\\+\\=")) {
						isX = true;
						X = StringHelper.getX2(lineContent);
					}
					else {
						isX = false;
						Y = "(\\w*\\?*\\=\\s*\'*\\w*[\\s\\S+]*\'*)";
					}					
				}
				
				if (isX) {
					// get the X or X ("," X)* or X* part
					String X0toStarRegex = StringHelper.constructX0toStar(X);
					String X0toPlusRegex = StringHelper.constructX0toPlus(X);
					String XRegex = StringHelper.constructXRegex(X);
					String XStarRegex = "\\(" + XRegex + "\\)\\*";
					
					if (RegexHelper.doesStringExist(lineContent, X0toStarRegex)) {
						Pattern pattern = Pattern.compile(X0toStarRegex);
						String realX0toStar = RegexHelper.getTargetString(lineContent, pattern);
						lineContent = lineContent.replaceAll(X0toStarRegex, "(" + realX0toStar + ")?");
					}
					else if (RegexHelper.doesStringExist(lineContent, X0toPlusRegex)) {
						Pattern pattern = Pattern.compile(X0toPlusRegex);
						String realX0toPlus= RegexHelper.getTargetString(lineContent, pattern);
						lineContent = lineContent.replaceAll(X0toPlusRegex, "(" + realX0toPlus + ")?");
					}
					else if (RegexHelper.doesStringExist(lineContent, XStarRegex)) {
						Pattern pattern = Pattern.compile(XStarRegex);
						String realXStar = RegexHelper.getTargetString(lineContent, pattern);
						lineContent = lineContent.replaceAll(XStarRegex, "(" + realXStar + ")?");
					}
					else if (RegexHelper.doesStringExist(lineContent, XRegex)) {
						Pattern pattern = Pattern.compile(XRegex);
						lineContent = lineContent.replaceAll(XRegex, "(" + X + ")?");
					}
				}
				else {
					if (RegexHelper.doesStringExist(lineContent, Y)) {
						Pattern pattern = Pattern.compile(Y);
						String realY = RegexHelper.getTargetString(lineContent, pattern);
						lineContent = lineContent.replaceAll(Y, "(" + realY + ")?");
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
} //AddOptionalityToAttrImpl
