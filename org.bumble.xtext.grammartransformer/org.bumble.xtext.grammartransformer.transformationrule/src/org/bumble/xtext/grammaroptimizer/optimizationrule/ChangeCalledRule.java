/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Called Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getCurrentCalledRule <em>Current Called Rule</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getNewCalledRule <em>New Called Rule</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeCalledRule()
 * @model
 * @generated
 */
public interface ChangeCalledRule extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Current Called Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Called Rule</em>' attribute.
	 * @see #setCurrentCalledRule(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeCalledRule_CurrentCalledRule()
	 * @model
	 * @generated
	 */
	String getCurrentCalledRule();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getCurrentCalledRule <em>Current Called Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Called Rule</em>' attribute.
	 * @see #getCurrentCalledRule()
	 * @generated
	 */
	void setCurrentCalledRule(String value);

	/**
	 * Returns the value of the '<em><b>New Called Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Called Rule</em>' attribute.
	 * @see #setNewCalledRule(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeCalledRule_NewCalledRule()
	 * @model
	 * @generated
	 */
	String getNewCalledRule();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getNewCalledRule <em>New Called Rule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Called Rule</em>' attribute.
	 * @see #getNewCalledRule()
	 * @generated
	 */
	void setNewCalledRule(String value);

} // ChangeCalledRule
