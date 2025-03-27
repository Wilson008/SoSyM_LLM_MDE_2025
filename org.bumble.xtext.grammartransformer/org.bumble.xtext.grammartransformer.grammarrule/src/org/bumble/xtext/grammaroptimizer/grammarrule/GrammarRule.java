/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getName <em>Name</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getLines <em>Lines</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getGrammarRule()
 * @model
 * @generated
 */
public interface GrammarRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getGrammarRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Lines</b></em>' containment reference list.
	 * The list contents are of type {@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lines</em>' containment reference list.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getGrammarRule_Lines()
	 * @model containment="true"
	 * @generated
	 */
	EList<LineEntry> getLines();

} // GrammarRule
