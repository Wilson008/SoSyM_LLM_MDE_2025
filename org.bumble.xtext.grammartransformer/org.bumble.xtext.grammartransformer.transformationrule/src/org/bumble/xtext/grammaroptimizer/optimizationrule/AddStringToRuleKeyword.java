/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add String To Rule Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getTargetAttribute <em>Target Attribute</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getAddedString <em>Added String</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#isIsHead <em>Is Head</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddStringToRuleKeyword()
 * @model
 * @generated
 */
public interface AddStringToRuleKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute</em>' attribute.
	 * @see #setTargetAttribute(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddStringToRuleKeyword_TargetAttribute()
	 * @model
	 * @generated
	 */
	String getTargetAttribute();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getTargetAttribute <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute</em>' attribute.
	 * @see #getTargetAttribute()
	 * @generated
	 */
	void setTargetAttribute(String value);

	/**
	 * Returns the value of the '<em><b>Added String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Added String</em>' attribute.
	 * @see #setAddedString(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddStringToRuleKeyword_AddedString()
	 * @model
	 * @generated
	 */
	String getAddedString();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getAddedString <em>Added String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Added String</em>' attribute.
	 * @see #getAddedString()
	 * @generated
	 */
	void setAddedString(String value);

	/**
	 * Returns the value of the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Head</em>' attribute.
	 * @see #setIsHead(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddStringToRuleKeyword_IsHead()
	 * @model
	 * @generated
	 */
	boolean isIsHead();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#isIsHead <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Head</em>' attribute.
	 * @see #isIsHead()
	 * @generated
	 */
	void setIsHead(boolean value);

} // AddStringToRuleKeyword
