/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage
 * @generated
 */
public interface GrammarruleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarruleFactory eINSTANCE = org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarruleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Grammar</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammar</em>'.
	 * @generated
	 */
	Grammar createGrammar();

	/**
	 * Returns a new object of class '<em>Grammar Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Grammar Rule</em>'.
	 * @generated
	 */
	GrammarRule createGrammarRule();

	/**
	 * Returns a new object of class '<em>Line Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Line Entry</em>'.
	 * @generated
	 */
	LineEntry createLineEntry();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	GrammarrulePackage getGrammarrulePackage();

} //GrammarruleFactory
