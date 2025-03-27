/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Alternative Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#isIsEnum <em>Is Enum</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#getNewValue <em>New Value</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeValue()
 * @model
 * @generated
 */
public interface AddAlternativeValue extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Is Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Enum</em>' attribute.
	 * @see #setIsEnum(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeValue_IsEnum()
	 * @model
	 * @generated
	 */
	boolean isIsEnum();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#isIsEnum <em>Is Enum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Enum</em>' attribute.
	 * @see #isIsEnum()
	 * @generated
	 */
	void setIsEnum(boolean value);

	/**
	 * Returns the value of the '<em><b>New Value</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Value</em>' attribute list.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeValue_NewValue()
	 * @model
	 * @generated
	 */
	EList<String> getNewValue();

} // AddAlternativeValue
