/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Call To Other Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#getNameOfOtherClass <em>Name Of Other Class</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#isCallRequired <em>Call Required</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddCallToOtherRule()
 * @model
 * @generated
 */
public interface AddCallToOtherRule extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Name Of Other Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name Of Other Class</em>' attribute.
	 * @see #setNameOfOtherClass(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddCallToOtherRule_NameOfOtherClass()
	 * @model required="true"
	 * @generated
	 */
	String getNameOfOtherClass();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#getNameOfOtherClass <em>Name Of Other Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name Of Other Class</em>' attribute.
	 * @see #getNameOfOtherClass()
	 * @generated
	 */
	void setNameOfOtherClass(String value);

	/**
	 * Returns the value of the '<em><b>Call Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Call Required</em>' attribute.
	 * @see #setCallRequired(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddCallToOtherRule_CallRequired()
	 * @model
	 * @generated
	 */
	boolean isCallRequired();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#isCallRequired <em>Call Required</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Call Required</em>' attribute.
	 * @see #isCallRequired()
	 * @generated
	 */
	void setCallRequired(boolean value);

} // AddCallToOtherRule
