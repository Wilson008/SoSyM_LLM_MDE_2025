/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rename Keyword</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getCurrentKeyword <em>Current Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getNewKeyword <em>New Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getTargetAttribute <em>Target Attribute</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRenameKeyword()
 * @model
 * @generated
 */
public interface RenameKeyword extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Current Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Keyword</em>' attribute.
	 * @see #setCurrentKeyword(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRenameKeyword_CurrentKeyword()
	 * @model
	 * @generated
	 */
	String getCurrentKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getCurrentKeyword <em>Current Keyword</em>}' attribute.
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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRenameKeyword_NewKeyword()
	 * @model
	 * @generated
	 */
	String getNewKeyword();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getNewKeyword <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Keyword</em>' attribute.
	 * @see #getNewKeyword()
	 * @generated
	 */
	void setNewKeyword(String value);

	/**
	 * Returns the value of the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Attribute</em>' attribute.
	 * @see #setTargetAttribute(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRenameKeyword_TargetAttribute()
	 * @model
	 * @generated
	 */
	String getTargetAttribute();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getTargetAttribute <em>Target Attribute</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Attribute</em>' attribute.
	 * @see #getTargetAttribute()
	 * @generated
	 */
	void setTargetAttribute(String value);

} // RenameKeyword
