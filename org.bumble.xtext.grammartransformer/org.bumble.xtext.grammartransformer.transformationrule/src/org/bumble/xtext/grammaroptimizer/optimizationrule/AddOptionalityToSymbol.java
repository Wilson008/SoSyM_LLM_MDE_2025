/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Optionality To Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol#getTargetSymbol <em>Target Symbol</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToSymbol()
 * @model
 * @generated
 */
public interface AddOptionalityToSymbol extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Target Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Symbol</em>' attribute.
	 * @see #setTargetSymbol(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToSymbol_TargetSymbol()
	 * @model
	 * @generated
	 */
	String getTargetSymbol();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol#getTargetSymbol <em>Target Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Symbol</em>' attribute.
	 * @see #getTargetSymbol()
	 * @generated
	 */
	void setTargetSymbol(String value);

} // AddOptionalityToSymbol
