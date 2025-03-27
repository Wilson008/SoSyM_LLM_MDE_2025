/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Alternative Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getCurrentSymbol <em>Current Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getNewSymbol <em>New Symbol</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeSymbol()
 * @model
 * @generated
 */
public interface AddAlternativeSymbol extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>Current Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Current Symbol</em>' attribute.
	 * @see #setCurrentSymbol(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeSymbol_CurrentSymbol()
	 * @model
	 * @generated
	 */
	String getCurrentSymbol();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getCurrentSymbol <em>Current Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Current Symbol</em>' attribute.
	 * @see #getCurrentSymbol()
	 * @generated
	 */
	void setCurrentSymbol(String value);

	/**
	 * Returns the value of the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Symbol</em>' attribute.
	 * @see #setNewSymbol(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddAlternativeSymbol_NewSymbol()
	 * @model
	 * @generated
	 */
	String getNewSymbol();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getNewSymbol <em>New Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Symbol</em>' attribute.
	 * @see #getNewSymbol()
	 * @generated
	 */
	void setNewSymbol(String value);

} // AddAlternativeSymbol
