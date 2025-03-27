/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Copy Attr ATo Attr B</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrA <em>Attr A</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrB <em>Attr B</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#isIsFront <em>Is Front</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getCopyAttrAToAttrB()
 * @model
 * @generated
 */
public interface CopyAttrAToAttrB extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr A</em>' attribute.
	 * @see #setAttrA(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getCopyAttrAToAttrB_AttrA()
	 * @model
	 * @generated
	 */
	String getAttrA();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrA <em>Attr A</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr A</em>' attribute.
	 * @see #getAttrA()
	 * @generated
	 */
	void setAttrA(String value);

	/**
	 * Returns the value of the '<em><b>Attr B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr B</em>' attribute.
	 * @see #setAttrB(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getCopyAttrAToAttrB_AttrB()
	 * @model
	 * @generated
	 */
	String getAttrB();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrB <em>Attr B</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr B</em>' attribute.
	 * @see #getAttrB()
	 * @generated
	 */
	void setAttrB(String value);

	/**
	 * Returns the value of the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Front</em>' attribute.
	 * @see #setIsFront(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getCopyAttrAToAttrB_IsFront()
	 * @model
	 * @generated
	 */
	boolean isIsFront();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#isIsFront <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Front</em>' attribute.
	 * @see #isIsFront()
	 * @generated
	 */
	void setIsFront(boolean value);

} // CopyAttrAToAttrB
