/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Add Symbol Without Quote To Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#getNewSymbol <em>New Symbol</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#isIsFront <em>Is Front</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolWithoutQuoteToLine()
 * @model
 * @generated
 */
public interface AddSymbolWithoutQuoteToLine extends OptimizationRule {
	/**
	 * Returns the value of the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>New Symbol</em>' attribute.
	 * @see #setNewSymbol(String)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolWithoutQuoteToLine_NewSymbol()
	 * @model
	 * @generated
	 */
	String getNewSymbol();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#getNewSymbol <em>New Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>New Symbol</em>' attribute.
	 * @see #getNewSymbol()
	 * @generated
	 */
	void setNewSymbol(String value);

	/**
	 * Returns the value of the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Front</em>' attribute.
	 * @see #setIsFront(boolean)
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#getAddSymbolWithoutQuoteToLine_IsFront()
	 * @model
	 * @generated
	 */
	boolean isIsFront();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#isIsFront <em>Is Front</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Front</em>' attribute.
	 * @see #isIsFront()
	 * @generated
	 */
	void setIsFront(boolean value);

} // AddSymbolWithoutQuoteToLine
