/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarruleFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarrulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammarrule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://grammarrule/DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammarrule";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarrulePackage eINSTANCE = org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarImpl
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULES = 0;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl <em>Grammar Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl#getGrammarRule()
	 * @generated
	 */
	int GRAMMAR_RULE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_RULE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_RULE__LINES = 1;

	/**
	 * The number of structural features of the '<em>Grammar Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_RULE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Grammar Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl <em>Line Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl#getLineEntry()
	 * @generated
	 */
	int LINE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>Line Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY__LINE_CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY__ATTR_NAME = 1;

	/**
	 * The number of structural features of the '<em>Line Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Line Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINE_ENTRY_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.grammarrule.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bumble.xtext.grammaroptimizer.grammarrule.Grammar#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.Grammar#getRules()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Rules();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule <em>Grammar Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule
	 * @generated
	 */
	EClass getGrammarRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getName()
	 * @see #getGrammarRule()
	 * @generated
	 */
	EAttribute getGrammarRule_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getLines <em>Lines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lines</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule#getLines()
	 * @see #getGrammarRule()
	 * @generated
	 */
	EReference getGrammarRule_Lines();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry <em>Line Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Line Entry</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry
	 * @generated
	 */
	EClass getLineEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getLineContent <em>Line Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line Content</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getLineContent()
	 * @see #getLineEntry()
	 * @generated
	 */
	EAttribute getLineEntry_LineContent();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry#getAttrName()
	 * @see #getLineEntry()
	 * @generated
	 */
	EAttribute getLineEntry_AttrName();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarruleFactory getGrammarruleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarImpl
		 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__RULES = eINSTANCE.getGrammar_Rules();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl <em>Grammar Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl#getGrammarRule()
		 * @generated
		 */
		EClass GRAMMAR_RULE = eINSTANCE.getGrammarRule();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GRAMMAR_RULE__NAME = eINSTANCE.getGrammarRule_Name();

		/**
		 * The meta object literal for the '<em><b>Lines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR_RULE__LINES = eINSTANCE.getGrammarRule_Lines();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl <em>Line Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl
		 * @see org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarrulePackageImpl#getLineEntry()
		 * @generated
		 */
		EClass LINE_ENTRY = eINSTANCE.getLineEntry();

		/**
		 * The meta object literal for the '<em><b>Line Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ENTRY__LINE_CONTENT = eINSTANCE.getLineEntry_LineContent();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINE_ENTRY__ATTR_NAME = eINSTANCE.getLineEntry_AttrName();

	}

} //GrammarrulePackage
