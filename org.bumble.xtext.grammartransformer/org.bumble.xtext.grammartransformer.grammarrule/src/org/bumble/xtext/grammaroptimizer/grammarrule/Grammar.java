/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grammar</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.grammarrule.Grammar#getRules <em>Rules</em>}</li>
 * </ul>
 *
 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getGrammar()
 * @model
 * @generated
 */
public interface Grammar extends EObject {
	/**
	 * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
	 * The list contents are of type {@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rules</em>' containment reference list.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#getGrammar_Rules()
	 * @model containment="true"
	 * @generated
	 */
	EList<GrammarRule> getRules();

} // Grammar
