/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getTargetAttribute <em>Target Attribute</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveBraces()
 * @model
 * @generated
 */
public interface RemoveBraces extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute</em>' attribute.
	 * @see #setTargetAttribute(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveBraces_TargetAttribute()
	 * @model
	 * @generated
	 */
	String getTargetAttribute();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getTargetAttribute <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute</em>' attribute.
	 * @see #getTargetAttribute()
	 * @generated
	 */
	void setTargetAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Excluded Grammar Rule</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Excluded Grammar Rule</em>' attribute list.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveBraces_ExcludedGrammarRule()
	 * @model
	 * @generated
	 */
	EList<String> getExcludedGrammarRule();
} // RemoveBracket
