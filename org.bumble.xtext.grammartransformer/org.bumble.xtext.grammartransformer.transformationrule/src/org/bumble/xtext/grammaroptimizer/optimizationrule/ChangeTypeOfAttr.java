/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Change Type Of Attr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getCurrentType <em>Current Type</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getNewType <em>New Type</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeTypeOfAttr()
 * @model
 * @generated
 */
public interface ChangeTypeOfAttr extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Current Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Type</em>' attribute.
	 * @see #setCurrentType(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeTypeOfAttr_CurrentType()
	 * @model
	 * @generated
	 */
	String getCurrentType();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getCurrentType <em>Current Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Type</em>' attribute.
	 * @see #getCurrentType()
	 * @generated
	 */
	void setCurrentType(String value);

	/**
	 * Returns the value of the '<em><b>New Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Type</em>' attribute.
	 * @see #setNewType(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getChangeTypeOfAttr_NewType()
	 * @model
	 * @generated
	 */
	String getNewType();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getNewType <em>New Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Type</em>' attribute.
	 * @see #getNewType()
	 * @generated
	 */
	void setNewType(String value);

} // ChangeTypeOfAttr
