/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Rule Call</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall#getCalledRuleName <em>Called Rule Name</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveRuleCall()
 * @model
 * @generated
 */
public interface RemoveRuleCall extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Called Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Called Rule Name</em>' attribute.
	 * @see #setCalledRuleName(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveRuleCall_CalledRuleName()
	 * @model
	 * @generated
	 */
	String getCalledRuleName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall#getCalledRuleName <em>Called Rule Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Called Rule Name</em>' attribute.
	 * @see #getCalledRuleName()
	 * @generated
	 */
	void setCalledRuleName(String value);

} // RemoveRuleCall
