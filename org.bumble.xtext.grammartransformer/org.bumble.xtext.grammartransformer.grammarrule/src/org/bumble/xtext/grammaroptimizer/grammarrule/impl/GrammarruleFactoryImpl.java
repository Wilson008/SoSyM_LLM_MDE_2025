/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.*;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarruleFactoryImpl extends EFactoryImpl implements GrammarruleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarruleFactory init() {
		try {
			GrammarruleFactory theGrammarruleFactory = (GrammarruleFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarrulePackage.eNS_URI);
			if (theGrammarruleFactory != null) {
				return theGrammarruleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarruleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarruleFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrammarrulePackage.GRAMMAR: return createGrammar();
			case GrammarrulePackage.GRAMMAR_RULE: return createGrammarRule();
			case GrammarrulePackage.LINE_ENTRY: return createLineEntry();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarRule createGrammarRule() {
		GrammarRuleImpl grammarRule = new GrammarRuleImpl();
		return grammarRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LineEntry createLineEntry() {
		LineEntryImpl lineEntry = new LineEntryImpl();
		return lineEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarrulePackage getGrammarrulePackage() {
		return (GrammarrulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarrulePackage getPackage() {
		return GrammarrulePackage.eINSTANCE;
	}

} //GrammarruleFactoryImpl
