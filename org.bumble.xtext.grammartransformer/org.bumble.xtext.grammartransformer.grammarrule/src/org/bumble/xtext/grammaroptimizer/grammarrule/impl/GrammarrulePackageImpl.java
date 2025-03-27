/**
 */
package org.bumble.xtext.grammaroptimizer.grammarrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarruleFactory;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarrulePackageImpl extends EPackageImpl implements GrammarrulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass grammarRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lineEntryEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammarrulePackageImpl() {
		super(eNS_URI, GrammarruleFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GrammarrulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammarrulePackage init() {
		if (isInited) return (GrammarrulePackage)EPackage.Registry.INSTANCE.getEPackage(GrammarrulePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGrammarrulePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GrammarrulePackageImpl theGrammarrulePackage = registeredGrammarrulePackage instanceof GrammarrulePackageImpl ? (GrammarrulePackageImpl)registeredGrammarrulePackage : new GrammarrulePackageImpl();

		isInited = true;

		// Create package meta-data objects
		theGrammarrulePackage.createPackageContents();

		// Initialize created meta-data
		theGrammarrulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammarrulePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammarrulePackage.eNS_URI, theGrammarrulePackage);
		return theGrammarrulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrammar() {
		return grammarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammar_Rules() {
		return (EReference)grammarEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGrammarRule() {
		return grammarRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGrammarRule_Name() {
		return (EAttribute)grammarRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGrammarRule_Lines() {
		return (EReference)grammarRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLineEntry() {
		return lineEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineEntry_LineContent() {
		return (EAttribute)lineEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLineEntry_AttrName() {
		return (EAttribute)lineEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarruleFactory getGrammarruleFactory() {
		return (GrammarruleFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		grammarEClass = createEClass(GRAMMAR);
		createEReference(grammarEClass, GRAMMAR__RULES);

		grammarRuleEClass = createEClass(GRAMMAR_RULE);
		createEAttribute(grammarRuleEClass, GRAMMAR_RULE__NAME);
		createEReference(grammarRuleEClass, GRAMMAR_RULE__LINES);

		lineEntryEClass = createEClass(LINE_ENTRY);
		createEAttribute(lineEntryEClass, LINE_ENTRY__LINE_CONTENT);
		createEAttribute(lineEntryEClass, LINE_ENTRY__ATTR_NAME);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(grammarEClass, Grammar.class, "Grammar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGrammar_Rules(), this.getGrammarRule(), null, "rules", null, 0, -1, Grammar.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(grammarRuleEClass, GrammarRule.class, "GrammarRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getGrammarRule_Name(), ecorePackage.getEString(), "name", null, 0, 1, GrammarRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getGrammarRule_Lines(), this.getLineEntry(), null, "lines", null, 0, -1, GrammarRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lineEntryEClass, LineEntry.class, "LineEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLineEntry_LineContent(), ecorePackage.getEString(), "lineContent", null, 0, 1, LineEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLineEntry_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, LineEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //GrammarrulePackageImpl
