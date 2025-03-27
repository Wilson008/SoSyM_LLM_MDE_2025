/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Keyword To Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#getNewKeyword <em>New Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#isIsHead <em>Is Head</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddKeywordToAttr()
 * @model
 * @generated
 */
public interface AddKeywordToAttr extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Keyword</em>' attribute.
	 * @see #setNewKeyword(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddKeywordToAttr_NewKeyword()
	 * @model
	 * @generated
	 */
	String getNewKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#getNewKeyword <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Keyword</em>' attribute.
	 * @see #getNewKeyword()
	 * @generated
	 */
	void setNewKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Head</em>' attribute.
	 * @see #setIsHead(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddKeywordToAttr_IsHead()
	 * @model
	 * @generated
	 */
	boolean isIsHead();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#isIsHead <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Head</em>' attribute.
	 * @see #isIsHead()
	 * @generated
	 */
	void setIsHead(boolean value);

} // AddKeywordToAttr
