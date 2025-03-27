/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Optionality To Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword#getKeyword <em>Keyword</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToKeyword()
 * @model
 * @generated
 */
public interface AddOptionalityToKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword</em>' attribute.
	 * @see #setKeyword(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToKeyword_Keyword()
	 * @model
	 * @generated
	 */
	String getKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword#getKeyword <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword</em>' attribute.
	 * @see #getKeyword()
	 * @generated
	 */
	void setKeyword(String value);

} // AddOptionalityToKeyword
