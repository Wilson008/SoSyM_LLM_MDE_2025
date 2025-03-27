/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Alternative Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getCurrentKeyword <em>Current Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getNewKeyword <em>New Keyword</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeKeyword()
 * @model
 * @generated
 */
public interface AddAlternativeKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Current Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Keyword</em>' attribute.
	 * @see #setCurrentKeyword(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeKeyword_CurrentKeyword()
	 * @model
	 * @generated
	 */
	String getCurrentKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getCurrentKeyword <em>Current Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Keyword</em>' attribute.
	 * @see #getCurrentKeyword()
	 * @generated
	 */
	void setCurrentKeyword(String value);

	/**
	 * Returns the value of the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Keyword</em>' attribute.
	 * @see #setNewKeyword(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeKeyword_NewKeyword()
	 * @model
	 * @generated
	 */
	String getNewKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getNewKeyword <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Keyword</em>' attribute.
	 * @see #getNewKeyword()
	 * @generated
	 */
	void setNewKeyword(String value);

} // AddAlternativeKeyword
