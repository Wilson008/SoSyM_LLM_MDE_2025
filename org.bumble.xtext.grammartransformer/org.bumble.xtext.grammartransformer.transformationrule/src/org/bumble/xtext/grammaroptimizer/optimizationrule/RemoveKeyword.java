/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getKeywordName <em>Keyword Name</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveKeyword()
 * @model
 * @generated
 */
public interface RemoveKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Keyword Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keyword Name</em>' attribute.
	 * @see #setKeywordName(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveKeyword_KeywordName()
	 * @model
	 * @generated
	 */
	String getKeywordName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getKeywordName <em>Keyword Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Keyword Name</em>' attribute.
	 * @see #getKeywordName()
	 * @generated
	 */
	void setKeywordName(String value);

	/**
	 * Returns the value of the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute</em>' attribute.
	 * @see #setTargetAttribute(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveKeyword_TargetAttribute()
	 * @model
	 * @generated
	 */
	String getTargetAttribute();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getTargetAttribute <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute</em>' attribute.
	 * @see #getTargetAttribute()
	 * @generated
	 */
	void setTargetAttribute(String value);

} // RemoveKeyword
