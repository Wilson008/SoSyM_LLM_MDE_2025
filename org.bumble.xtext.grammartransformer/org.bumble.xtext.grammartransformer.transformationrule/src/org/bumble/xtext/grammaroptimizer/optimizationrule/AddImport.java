/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNewImport <em>New Import</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNickName <em>Nick Name</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddImport()
 * @model
 * @generated
 */
public interface AddImport extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>New Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Import</em>' attribute.
	 * @see #setNewImport(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddImport_NewImport()
	 * @model
	 * @generated
	 */
	String getNewImport();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNewImport <em>New Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Import</em>' attribute.
	 * @see #getNewImport()
	 * @generated
	 */
	void setNewImport(String value);

	/**
	 * Returns the value of the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nick Name</em>' attribute.
	 * @see #setNickName(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddImport_NickName()
	 * @model
	 * @generated
	 */
	String getNickName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNickName <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nick Name</em>' attribute.
	 * @see #getNickName()
	 * @generated
	 */
	void setNickName(String value);

} // AddImport
