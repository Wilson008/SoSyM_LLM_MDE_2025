/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Remove Literal From Enum</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum#getLiteralName <em>Literal Name</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveLiteralFromEnum()
 * @model
 * @generated
 */
public interface RemoveLiteralFromEnum extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Literal Name</em>' attribute.
	 * @see #setLiteralName(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getRemoveLiteralFromEnum_LiteralName()
	 * @model
	 * @generated
	 */
	String getLiteralName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum#getLiteralName <em>Literal Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Literal Name</em>' attribute.
	 * @see #getLiteralName()
	 * @generated
	 */
	void setLiteralName(String value);

} // RemoveLiteralFromEnum
