/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToTwo;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert1to Star To Two</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Convert1toStarToTwoImpl extends OptimizationRuleImpl implements Convert1toStarToTwo {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Convert1toStarToTwoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CONVERT1TO_STAR_TO_TWO;
	}

	/** 
	 * apply a change from X 0...* to X 1...2 on a specified scope
	 * we specify scope by the parameters grammarRule and attrName
	 */
	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammar.getRules().get(i).getName().equals(grammarRule)) {
					continue;
				}
			}
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
				
				if (attrName == null || attrName.isEmpty()) {
					
					if (!RegexHelper.doesStringExist(lineContent, "\\+="))
						continue;
					
					String X = StringHelper.getX2(lineContent);
					String X0toStar = StringHelper.constructX0toStar(X);
					// String XStar = "(" + X + ")*";
					// typespec+=TypeSpec ',' typespec+=TypeSpec
					String XTwo = X + "','" + X;
					lineContent = lineContent.replaceAll( X0toStar, XTwo);
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
				}
				else {
					if (grammar.getRules().get(i).getLines().get(j).getAttrName() == null)
						continue;
					if (!grammar.getRules().get(i).getLines().get(j).getAttrName().equals(attrName))
						continue;
					
					String X = StringHelper.getX(lineContent, attrName);
					String X0toStar = StringHelper.constructX0toStar(X);
					//String XStar = "(" + X + ")*";
					String XTwo = X + "','" + X;
					lineContent = lineContent.replaceAll( X0toStar, XTwo);
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
					break;
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //Convert1toStarToTwoImpl
