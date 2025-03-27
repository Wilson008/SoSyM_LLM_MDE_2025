/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove XStar Attr Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveXStarAttrKeyword()
 * @model
 * @generated
 */
public interface RemoveXStarAttrKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' attribute list.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveXStarAttrKeyword_Attributes()
	 * @model
	 * @generated
	 */
	EList<String> getAttributes();
} // RemoveXStarAttrKeyword
