/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Convert1to Star To Star</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class Convert1toStarToStarImpl extends OptimizationRuleImpl implements Convert1toStarToStar {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Convert1toStarToStarImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CONVERT1TO_STAR_TO_STAR;
	}

	/** 
	 * apply a change from X 0...* to X* on a specified scope
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
					String XStar = "(" + X + ")*";
					lineContent = lineContent.replaceAll( X0toStar, XStar);
					grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
				}
				else {
					if (!RegexHelper.doesStringExist(lineContent, attrName + ".*\\=")) {
						continue;
					}
					
					if (RegexHelper.doesStringExist(lineContent, attrName)) {
						String X = StringHelper.getX(lineContent, attrName);
						String X0toStar = StringHelper.constructX0toStar(X);
						String XStar = "(" + X + ")*";
						lineContent = lineContent.replaceAll( X0toStar, XStar);
						grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
						break;
					}
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //Convert1toStarToStarImpl
