/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Optionality To Outermost Bracket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToOutermostBraces()
 * @model
 * @generated
 */
public interface AddOptionalityToOutermostBraces extends OptimizationRule {

	/**
	 * Returns the value of the '<em><b>Multiplicity</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiplicity</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
	 * @see #setMultiplicity(MultiplicityKey)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddOptionalityToOutermostBraces_Multiplicity()
	 * @model
	 * @generated
	 */
	MultiplicityKey getMultiplicity();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces#getMultiplicity <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiplicity</em>' attribute.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
	 * @see #getMultiplicity()
	 * @generated
	 */
	void setMultiplicity(MultiplicityKey value);
} // AddOptionalityToOutermostBracket
