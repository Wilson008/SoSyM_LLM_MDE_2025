/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSquareBracketToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeToSingleElementOrBracedList;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBooleanAttrToSpecialPattern;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToAngle;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToParentheses;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert0toStarTo0toStaror1toStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1ToStarTo1;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToPlus;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToTwo;
import org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB;
import org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY;
import org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationruleFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInAttribute;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class OptimizationrulePackageImpl extends EPackageImpl implements OptimizationrulePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optimizationRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeBracesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addKeywordToAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convert1toStarToStarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convert1toStarToPlusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOptionalAttrToOrRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeXStarAttrKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeCommaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convert1ToStarTo1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeRuleCallEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addKeywordAfterKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeTypeOfAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addParenthesesToAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeParenthesesInAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeAttributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAttrLineContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renameRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeAttributeKeywordsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeOptionalityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeBracesToParenthesesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeBracesToSquareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeBracesToAngleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeOutermostBracesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convert1toStarTo1orStarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeBracesExceptOutermostEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeCertainTypeFromAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeRuleContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeCalledRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeCommaToOtherSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass moveAttrToAfterRuleKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addStringToRuleKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOptionalityToAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeImportEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAlternativeKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOptionalityToKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addBracesToAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordUpperToLowerCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSquareBracketToAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOptionalityToOutermostBracesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSymbolToAttrEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addPrimitiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSymbolToRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addKeywordToLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addParenthesesWithoutQuotesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOptionalityToSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSymbolToLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSymbolWithoutQuoteToLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeABtoBABEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyAttrAToAttrBEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyXfromStarToYEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convert1toStarToTwoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAToOptionalAorAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addTerminalRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addOptionalityToLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addBracesToLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addParenthesesWithoutQuoteToRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAlternativeSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeABToABorBAEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addSymbolWithoutQuoteToKeywordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAttributeMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeBooleanAttrToSpecialPatternEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAttributeToSingleElementOrBracedListEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeReturnsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAlternativeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAToAorSymbolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addAlternativeSubClassToAbstractClassEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addBracesToRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeLiteralFromEnumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass convert0toStarTo0toStaror1toStarEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addCallToOtherRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAstPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum scopeKeyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiplicityKeyEEnum = null;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private OptimizationrulePackageImpl() {
		super(eNS_URI, OptimizationruleFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link OptimizationrulePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static OptimizationrulePackage init() {
		if (isInited) return (OptimizationrulePackage)EPackage.Registry.INSTANCE.getEPackage(OptimizationrulePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredOptimizationrulePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		OptimizationrulePackageImpl theOptimizationrulePackage = registeredOptimizationrulePackage instanceof OptimizationrulePackageImpl ? (OptimizationrulePackageImpl)registeredOptimizationrulePackage : new OptimizationrulePackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GrammarrulePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theOptimizationrulePackage.createPackageContents();

		// Initialize created meta-data
		theOptimizationrulePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theOptimizationrulePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(OptimizationrulePackage.eNS_URI, theOptimizationrulePackage);
		return theOptimizationrulePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptimizationRule() {
		return optimizationRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptimizationRule_Grammar() {
		return (EReference)optimizationRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimizationRule_GrammarRule() {
		return (EAttribute)optimizationRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptimizationRule_AttrName() {
		return (EAttribute)optimizationRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOptimizationRule__Apply() {
		return optimizationRuleEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveBraces() {
		return removeBracesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveBraces_TargetAttribute() {
		return (EAttribute)removeBracesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveBraces_ExcludedGrammarRule() {
		return (EAttribute)removeBracesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddKeywordToAttr() {
		return addKeywordToAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordToAttr_NewKeyword() {
		return (EAttribute)addKeywordToAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordToAttr_IsHead() {
		return (EAttribute)addKeywordToAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveKeyword() {
		return removeKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveKeyword_KeywordName() {
		return (EAttribute)removeKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveKeyword_TargetAttribute() {
		return (EAttribute)removeKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameKeyword() {
		return renameKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameKeyword_CurrentKeyword() {
		return (EAttribute)renameKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameKeyword_NewKeyword() {
		return (EAttribute)renameKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameKeyword_TargetAttribute() {
		return (EAttribute)renameKeywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert1toStarToStar() {
		return convert1toStarToStarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert1toStarToPlus() {
		return convert1toStarToPlusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeOptionalAttrToOrRelation() {
		return changeOptionalAttrToOrRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOptionalAttrToOrRelation_IsAll() {
		return (EAttribute)changeOptionalAttrToOrRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOptionalAttrToOrRelation_StartAttr() {
		return (EAttribute)changeOptionalAttrToOrRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOptionalAttrToOrRelation_EndAttr() {
		return (EAttribute)changeOptionalAttrToOrRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeOptionalAttrToOrRelation_ExcludedGrammarRule() {
		return (EAttribute)changeOptionalAttrToOrRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveXStarAttrKeyword() {
		return removeXStarAttrKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveXStarAttrKeyword_Attributes() {
		return (EAttribute)removeXStarAttrKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveComma() {
		return removeCommaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveComma_Attributes() {
		return (EAttribute)removeCommaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveLine() {
		return moveLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveLine_Source() {
		return (EAttribute)moveLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveLine_Target() {
		return (EAttribute)moveLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveLine_IsHead() {
		return (EAttribute)moveLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveRule() {
		return removeRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert1ToStarTo1() {
		return convert1ToStarTo1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveRuleCall() {
		return removeRuleCallEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveRuleCall_CalledRuleName() {
		return (EAttribute)removeRuleCallEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddKeywordAfterKeyword() {
		return addKeywordAfterKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordAfterKeyword_NewKeyword() {
		return (EAttribute)addKeywordAfterKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordAfterKeyword_CurrentKeyword() {
		return (EAttribute)addKeywordAfterKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeTypeOfAttr() {
		return changeTypeOfAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeTypeOfAttr_CurrentType() {
		return (EAttribute)changeTypeOfAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeTypeOfAttr_NewType() {
		return (EAttribute)changeTypeOfAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddParenthesesToAttr() {
		return addParenthesesToAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveParenthesesInAttribute() {
		return removeParenthesesInAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddImport() {
		return addImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddImport_NewImport() {
		return (EAttribute)addImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddImport_NickName() {
		return (EAttribute)addImportEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAttribute() {
		return removeAttributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAttrLineContent() {
		return changeAttrLineContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttrLineContent_NewLineContent() {
		return (EAttribute)changeAttrLineContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRenameRule() {
		return renameRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameRule_CurrentName() {
		return (EAttribute)renameRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameRule_NewName() {
		return (EAttribute)renameRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAttributeKeywords() {
		return removeAttributeKeywordsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveOptionality() {
		return removeOptionalityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeBracesToParentheses() {
		return changeBracesToParenthesesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeBracesToSquare() {
		return changeBracesToSquareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeBracesToAngle() {
		return changeBracesToAngleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveOutermostBraces() {
		return removeOutermostBracesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert1toStarTo1orStar() {
		return convert1toStarTo1orStarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveBracesExceptOutermost() {
		return removeBracesExceptOutermostEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveCertainTypeFromAttr() {
		return removeCertainTypeFromAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveCertainTypeFromAttr_Type() {
		return (EAttribute)removeCertainTypeFromAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeRuleContent() {
		return changeRuleContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeRuleContent_NewContent() {
		return (EAttribute)changeRuleContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeCalledRule() {
		return changeCalledRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCalledRule_CurrentCalledRule() {
		return (EAttribute)changeCalledRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCalledRule_NewCalledRule() {
		return (EAttribute)changeCalledRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeCommaToOtherSymbol() {
		return changeCommaToOtherSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeCommaToOtherSymbol_NewSymbol() {
		return (EAttribute)changeCommaToOtherSymbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMoveAttrToAfterRuleKeyword() {
		return moveAttrToAfterRuleKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMoveAttrToAfterRuleKeyword_MovedLine() {
		return (EAttribute)moveAttrToAfterRuleKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddStringToRuleKeyword() {
		return addStringToRuleKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStringToRuleKeyword_TargetAttribute() {
		return (EAttribute)addStringToRuleKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStringToRuleKeyword_AddedString() {
		return (EAttribute)addStringToRuleKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddStringToRuleKeyword_IsHead() {
		return (EAttribute)addStringToRuleKeywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOptionalityToAttr() {
		return addOptionalityToAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveImport() {
		return removeImportEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveImport_Import() {
		return (EAttribute)removeImportEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAlternativeKeyword() {
		return addAlternativeKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeKeyword_CurrentKeyword() {
		return (EAttribute)addAlternativeKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeKeyword_NewKeyword() {
		return (EAttribute)addAlternativeKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOptionalityToKeyword() {
		return addOptionalityToKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddOptionalityToKeyword_Keyword() {
		return (EAttribute)addOptionalityToKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddBracesToAttr() {
		return addBracesToAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordUpperToLowerCase() {
		return keywordUpperToLowerCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordUpperToLowerCase_Keyword() {
		return (EAttribute)keywordUpperToLowerCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSquareBracketToAttr() {
		return addSquareBracketToAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOptionalityToOutermostBraces() {
		return addOptionalityToOutermostBracesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddOptionalityToOutermostBraces_Multiplicity() {
		return (EAttribute)addOptionalityToOutermostBracesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSymbolToAttr() {
		return addSymbolToAttrEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_NewSymbol() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_IgnoredAttributes() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_IsHead() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_OnlyCommonRule() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_OnlyUpperBoundOne() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddPrimitiveType() {
		return addPrimitiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimitiveType_Metaclass() {
		return (EAttribute)addPrimitiveTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimitiveType_Body() {
		return (EAttribute)addPrimitiveTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddPrimitiveType_Annotation() {
		return (EAttribute)addPrimitiveTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSymbolToRule() {
		return addSymbolToRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToRule_Symbol() {
		return (EAttribute)addSymbolToRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToRule_BInside() {
		return (EAttribute)addSymbolToRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddKeywordToLine() {
		return addKeywordToLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordToLine_NewKeyword() {
		return (EAttribute)addKeywordToLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordToLine_IsHead() {
		return (EAttribute)addKeywordToLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddParenthesesWithoutQuotes() {
		return addParenthesesWithoutQuotesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddParenthesesWithoutQuotes_Keyword() {
		return (EAttribute)addParenthesesWithoutQuotesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddParenthesesWithoutQuotes_Scope() {
		return (EAttribute)addParenthesesWithoutQuotesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddParenthesesWithoutQuotes_Multiplicity() {
		return (EAttribute)addParenthesesWithoutQuotesEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOptionalityToSymbol() {
		return addOptionalityToSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddOptionalityToSymbol_TargetSymbol() {
		return (EAttribute)addOptionalityToSymbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSymbolToLine() {
		return addSymbolToLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToLine_NewSymbol() {
		return (EAttribute)addSymbolToLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToLine_IsFront() {
		return (EAttribute)addSymbolToLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSymbolWithoutQuoteToLine() {
		return addSymbolWithoutQuoteToLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolWithoutQuoteToLine_NewSymbol() {
		return (EAttribute)addSymbolWithoutQuoteToLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolWithoutQuoteToLine_IsFront() {
		return (EAttribute)addSymbolWithoutQuoteToLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeABtoBAB() {
		return changeABtoBABEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeABtoBAB_AttrA() {
		return (EAttribute)changeABtoBABEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeABtoBAB_AttrB() {
		return (EAttribute)changeABtoBABEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyAttrAToAttrB() {
		return copyAttrAToAttrBEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyAttrAToAttrB_AttrA() {
		return (EAttribute)copyAttrAToAttrBEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyAttrAToAttrB_AttrB() {
		return (EAttribute)copyAttrAToAttrBEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyAttrAToAttrB_IsFront() {
		return (EAttribute)copyAttrAToAttrBEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyXfromStarToY() {
		return copyXfromStarToYEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyXfromStarToY_AttrInX() {
		return (EAttribute)copyXfromStarToYEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyXfromStarToY_AttrInY() {
		return (EAttribute)copyXfromStarToYEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyXfromStarToY_IsFront() {
		return (EAttribute)copyXfromStarToYEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert1toStarToTwo() {
		return convert1toStarToTwoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAToOptionalAorA() {
		return changeAToOptionalAorAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddTerminalRule() {
		return addTerminalRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddTerminalRule_Body() {
		return (EAttribute)addTerminalRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddTerminalRule_Annotation() {
		return (EAttribute)addTerminalRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOptionalityToLine() {
		return addOptionalityToLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddBracesToLine() {
		return addBracesToLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddParenthesesWithoutQuoteToRule() {
		return addParenthesesWithoutQuoteToRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddParenthesesWithoutQuoteToRule_Multiplicity() {
		return (EAttribute)addParenthesesWithoutQuoteToRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAlternativeSymbol() {
		return addAlternativeSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeSymbol_CurrentSymbol() {
		return (EAttribute)addAlternativeSymbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeSymbol_NewSymbol() {
		return (EAttribute)addAlternativeSymbolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeABToABorBA() {
		return changeABToABorBAEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeABToABorBA_AttrA() {
		return (EAttribute)changeABToABorBAEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeABToABorBA_AttrB() {
		return (EAttribute)changeABToABorBAEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddSymbolWithoutQuoteToKeyword() {
		return addSymbolWithoutQuoteToKeywordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolWithoutQuoteToKeyword_Keyword() {
		return (EAttribute)addSymbolWithoutQuoteToKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolWithoutQuoteToKeyword_Symbol() {
		return (EAttribute)addSymbolWithoutQuoteToKeywordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolWithoutQuoteToKeyword_IsFront() {
		return (EAttribute)addSymbolWithoutQuoteToKeywordEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAttributeMultiplicity() {
		return changeAttributeMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeMultiplicity_StartAttr() {
		return (EAttribute)changeAttributeMultiplicityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeMultiplicity_EndAttr() {
		return (EAttribute)changeAttributeMultiplicityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeMultiplicity_Multiplicity() {
		return (EAttribute)changeAttributeMultiplicityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeBooleanAttrToSpecialPattern() {
		return changeBooleanAttrToSpecialPatternEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAttributeToSingleElementOrBracedList() {
		return changeAttributeToSingleElementOrBracedListEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeReturns() {
		return changeReturnsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeReturns_NewReturns() {
		return (EAttribute)changeReturnsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAlternativeValue() {
		return addAlternativeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeValue_IsEnum() {
		return (EAttribute)addAlternativeValueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeValue_NewValue() {
		return (EAttribute)addAlternativeValueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAToAorSymbol() {
		return changeAToAorSymbolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAToAorSymbol_Symbol() {
		return (EAttribute)changeAToAorSymbolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddAlternativeSubClassToAbstractClass() {
		return addAlternativeSubClassToAbstractClassEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddAlternativeSubClassToAbstractClass_NewAlternativeSubClass() {
		return (EAttribute)addAlternativeSubClassToAbstractClassEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddBracesToRule() {
		return addBracesToRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveLiteralFromEnum() {
		return removeLiteralFromEnumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveLiteralFromEnum_LiteralName() {
		return (EAttribute)removeLiteralFromEnumEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConvert0toStarTo0toStaror1toStar() {
		return convert0toStarTo0toStaror1toStarEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveAction() {
		return removeActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddCallToOtherRule() {
		return addCallToOtherRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddCallToOtherRule_NameOfOtherClass() {
		return (EAttribute)addCallToOtherRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddCallToOtherRule_CallRequired() {
		return (EAttribute)addCallToOtherRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAstProperty() {
		return setAstPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAstProperty_ClassName() {
		return (EAttribute)setAstPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAstProperty_PropertyName() {
		return (EAttribute)setAstPropertyEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAstProperty_PropertyValue() {
		return (EAttribute)setAstPropertyEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAstProperty_Multi() {
		return (EAttribute)setAstPropertyEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getScopeKey() {
		return scopeKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiplicityKey() {
		return multiplicityKeyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationruleFactory getOptimizationruleFactory() {
		return (OptimizationruleFactory)getEFactoryInstance();
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
		optimizationRuleEClass = createEClass(OPTIMIZATION_RULE);
		createEReference(optimizationRuleEClass, OPTIMIZATION_RULE__GRAMMAR);
		createEAttribute(optimizationRuleEClass, OPTIMIZATION_RULE__GRAMMAR_RULE);
		createEAttribute(optimizationRuleEClass, OPTIMIZATION_RULE__ATTR_NAME);
		createEOperation(optimizationRuleEClass, OPTIMIZATION_RULE___APPLY);

		removeBracesEClass = createEClass(REMOVE_BRACES);
		createEAttribute(removeBracesEClass, REMOVE_BRACES__TARGET_ATTRIBUTE);
		createEAttribute(removeBracesEClass, REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE);

		addKeywordToAttrEClass = createEClass(ADD_KEYWORD_TO_ATTR);
		createEAttribute(addKeywordToAttrEClass, ADD_KEYWORD_TO_ATTR__NEW_KEYWORD);
		createEAttribute(addKeywordToAttrEClass, ADD_KEYWORD_TO_ATTR__IS_HEAD);

		removeKeywordEClass = createEClass(REMOVE_KEYWORD);
		createEAttribute(removeKeywordEClass, REMOVE_KEYWORD__KEYWORD_NAME);
		createEAttribute(removeKeywordEClass, REMOVE_KEYWORD__TARGET_ATTRIBUTE);

		renameKeywordEClass = createEClass(RENAME_KEYWORD);
		createEAttribute(renameKeywordEClass, RENAME_KEYWORD__CURRENT_KEYWORD);
		createEAttribute(renameKeywordEClass, RENAME_KEYWORD__NEW_KEYWORD);
		createEAttribute(renameKeywordEClass, RENAME_KEYWORD__TARGET_ATTRIBUTE);

		convert1toStarToStarEClass = createEClass(CONVERT1TO_STAR_TO_STAR);

		convert1toStarToPlusEClass = createEClass(CONVERT1TO_STAR_TO_PLUS);

		changeOptionalAttrToOrRelationEClass = createEClass(CHANGE_OPTIONAL_ATTR_TO_OR_RELATION);
		createEAttribute(changeOptionalAttrToOrRelationEClass, CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL);
		createEAttribute(changeOptionalAttrToOrRelationEClass, CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR);
		createEAttribute(changeOptionalAttrToOrRelationEClass, CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR);
		createEAttribute(changeOptionalAttrToOrRelationEClass, CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE);

		removeXStarAttrKeywordEClass = createEClass(REMOVE_XSTAR_ATTR_KEYWORD);
		createEAttribute(removeXStarAttrKeywordEClass, REMOVE_XSTAR_ATTR_KEYWORD__ATTRIBUTES);

		removeCommaEClass = createEClass(REMOVE_COMMA);
		createEAttribute(removeCommaEClass, REMOVE_COMMA__ATTRIBUTES);

		moveLineEClass = createEClass(MOVE_LINE);
		createEAttribute(moveLineEClass, MOVE_LINE__SOURCE);
		createEAttribute(moveLineEClass, MOVE_LINE__TARGET);
		createEAttribute(moveLineEClass, MOVE_LINE__IS_HEAD);

		removeRuleEClass = createEClass(REMOVE_RULE);

		convert1ToStarTo1EClass = createEClass(CONVERT1_TO_STAR_TO1);

		removeRuleCallEClass = createEClass(REMOVE_RULE_CALL);
		createEAttribute(removeRuleCallEClass, REMOVE_RULE_CALL__CALLED_RULE_NAME);

		addKeywordAfterKeywordEClass = createEClass(ADD_KEYWORD_AFTER_KEYWORD);
		createEAttribute(addKeywordAfterKeywordEClass, ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD);
		createEAttribute(addKeywordAfterKeywordEClass, ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD);

		changeTypeOfAttrEClass = createEClass(CHANGE_TYPE_OF_ATTR);
		createEAttribute(changeTypeOfAttrEClass, CHANGE_TYPE_OF_ATTR__CURRENT_TYPE);
		createEAttribute(changeTypeOfAttrEClass, CHANGE_TYPE_OF_ATTR__NEW_TYPE);

		addParenthesesToAttrEClass = createEClass(ADD_PARENTHESES_TO_ATTR);

		removeParenthesesInAttributeEClass = createEClass(REMOVE_PARENTHESES_IN_ATTRIBUTE);

		addImportEClass = createEClass(ADD_IMPORT);
		createEAttribute(addImportEClass, ADD_IMPORT__NEW_IMPORT);
		createEAttribute(addImportEClass, ADD_IMPORT__NICK_NAME);

		removeAttributeEClass = createEClass(REMOVE_ATTRIBUTE);

		changeAttrLineContentEClass = createEClass(CHANGE_ATTR_LINE_CONTENT);
		createEAttribute(changeAttrLineContentEClass, CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT);

		renameRuleEClass = createEClass(RENAME_RULE);
		createEAttribute(renameRuleEClass, RENAME_RULE__CURRENT_NAME);
		createEAttribute(renameRuleEClass, RENAME_RULE__NEW_NAME);

		removeAttributeKeywordsEClass = createEClass(REMOVE_ATTRIBUTE_KEYWORDS);

		removeOptionalityEClass = createEClass(REMOVE_OPTIONALITY);

		changeBracesToParenthesesEClass = createEClass(CHANGE_BRACES_TO_PARENTHESES);

		changeBracesToSquareEClass = createEClass(CHANGE_BRACES_TO_SQUARE);

		changeBracesToAngleEClass = createEClass(CHANGE_BRACES_TO_ANGLE);

		removeOutermostBracesEClass = createEClass(REMOVE_OUTERMOST_BRACES);

		convert1toStarTo1orStarEClass = createEClass(CONVERT1TO_STAR_TO1OR_STAR);

		removeBracesExceptOutermostEClass = createEClass(REMOVE_BRACES_EXCEPT_OUTERMOST);

		removeCertainTypeFromAttrEClass = createEClass(REMOVE_CERTAIN_TYPE_FROM_ATTR);
		createEAttribute(removeCertainTypeFromAttrEClass, REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE);

		changeRuleContentEClass = createEClass(CHANGE_RULE_CONTENT);
		createEAttribute(changeRuleContentEClass, CHANGE_RULE_CONTENT__NEW_CONTENT);

		changeCalledRuleEClass = createEClass(CHANGE_CALLED_RULE);
		createEAttribute(changeCalledRuleEClass, CHANGE_CALLED_RULE__CURRENT_CALLED_RULE);
		createEAttribute(changeCalledRuleEClass, CHANGE_CALLED_RULE__NEW_CALLED_RULE);

		changeCommaToOtherSymbolEClass = createEClass(CHANGE_COMMA_TO_OTHER_SYMBOL);
		createEAttribute(changeCommaToOtherSymbolEClass, CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL);

		moveAttrToAfterRuleKeywordEClass = createEClass(MOVE_ATTR_TO_AFTER_RULE_KEYWORD);
		createEAttribute(moveAttrToAfterRuleKeywordEClass, MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE);

		addStringToRuleKeywordEClass = createEClass(ADD_STRING_TO_RULE_KEYWORD);
		createEAttribute(addStringToRuleKeywordEClass, ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE);
		createEAttribute(addStringToRuleKeywordEClass, ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING);
		createEAttribute(addStringToRuleKeywordEClass, ADD_STRING_TO_RULE_KEYWORD__IS_HEAD);

		addOptionalityToAttrEClass = createEClass(ADD_OPTIONALITY_TO_ATTR);

		removeImportEClass = createEClass(REMOVE_IMPORT);
		createEAttribute(removeImportEClass, REMOVE_IMPORT__IMPORT);

		addAlternativeKeywordEClass = createEClass(ADD_ALTERNATIVE_KEYWORD);
		createEAttribute(addAlternativeKeywordEClass, ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD);
		createEAttribute(addAlternativeKeywordEClass, ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD);

		addOptionalityToKeywordEClass = createEClass(ADD_OPTIONALITY_TO_KEYWORD);
		createEAttribute(addOptionalityToKeywordEClass, ADD_OPTIONALITY_TO_KEYWORD__KEYWORD);

		addBracesToAttrEClass = createEClass(ADD_BRACES_TO_ATTR);

		keywordUpperToLowerCaseEClass = createEClass(KEYWORD_UPPER_TO_LOWER_CASE);
		createEAttribute(keywordUpperToLowerCaseEClass, KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD);

		addSquareBracketToAttrEClass = createEClass(ADD_SQUARE_BRACKET_TO_ATTR);

		addOptionalityToOutermostBracesEClass = createEClass(ADD_OPTIONALITY_TO_OUTERMOST_BRACES);
		createEAttribute(addOptionalityToOutermostBracesEClass, ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY);

		addSymbolToAttrEClass = createEClass(ADD_SYMBOL_TO_ATTR);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__NEW_SYMBOL);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__IS_HEAD);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE);

		addPrimitiveTypeEClass = createEClass(ADD_PRIMITIVE_TYPE);
		createEAttribute(addPrimitiveTypeEClass, ADD_PRIMITIVE_TYPE__METACLASS);
		createEAttribute(addPrimitiveTypeEClass, ADD_PRIMITIVE_TYPE__BODY);
		createEAttribute(addPrimitiveTypeEClass, ADD_PRIMITIVE_TYPE__ANNOTATION);

		addSymbolToRuleEClass = createEClass(ADD_SYMBOL_TO_RULE);
		createEAttribute(addSymbolToRuleEClass, ADD_SYMBOL_TO_RULE__SYMBOL);
		createEAttribute(addSymbolToRuleEClass, ADD_SYMBOL_TO_RULE__BINSIDE);

		addKeywordToLineEClass = createEClass(ADD_KEYWORD_TO_LINE);
		createEAttribute(addKeywordToLineEClass, ADD_KEYWORD_TO_LINE__NEW_KEYWORD);
		createEAttribute(addKeywordToLineEClass, ADD_KEYWORD_TO_LINE__IS_HEAD);

		addParenthesesWithoutQuotesEClass = createEClass(ADD_PARENTHESES_WITHOUT_QUOTES);
		createEAttribute(addParenthesesWithoutQuotesEClass, ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD);
		createEAttribute(addParenthesesWithoutQuotesEClass, ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE);
		createEAttribute(addParenthesesWithoutQuotesEClass, ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY);

		addOptionalityToSymbolEClass = createEClass(ADD_OPTIONALITY_TO_SYMBOL);
		createEAttribute(addOptionalityToSymbolEClass, ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL);

		addSymbolToLineEClass = createEClass(ADD_SYMBOL_TO_LINE);
		createEAttribute(addSymbolToLineEClass, ADD_SYMBOL_TO_LINE__NEW_SYMBOL);
		createEAttribute(addSymbolToLineEClass, ADD_SYMBOL_TO_LINE__IS_FRONT);

		addSymbolWithoutQuoteToLineEClass = createEClass(ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE);
		createEAttribute(addSymbolWithoutQuoteToLineEClass, ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL);
		createEAttribute(addSymbolWithoutQuoteToLineEClass, ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT);

		changeABtoBABEClass = createEClass(CHANGE_ABTO_BAB);
		createEAttribute(changeABtoBABEClass, CHANGE_ABTO_BAB__ATTR_A);
		createEAttribute(changeABtoBABEClass, CHANGE_ABTO_BAB__ATTR_B);

		copyAttrAToAttrBEClass = createEClass(COPY_ATTR_ATO_ATTR_B);
		createEAttribute(copyAttrAToAttrBEClass, COPY_ATTR_ATO_ATTR_B__ATTR_A);
		createEAttribute(copyAttrAToAttrBEClass, COPY_ATTR_ATO_ATTR_B__ATTR_B);
		createEAttribute(copyAttrAToAttrBEClass, COPY_ATTR_ATO_ATTR_B__IS_FRONT);

		copyXfromStarToYEClass = createEClass(COPY_XFROM_STAR_TO_Y);
		createEAttribute(copyXfromStarToYEClass, COPY_XFROM_STAR_TO_Y__ATTR_IN_X);
		createEAttribute(copyXfromStarToYEClass, COPY_XFROM_STAR_TO_Y__ATTR_IN_Y);
		createEAttribute(copyXfromStarToYEClass, COPY_XFROM_STAR_TO_Y__IS_FRONT);

		convert1toStarToTwoEClass = createEClass(CONVERT1TO_STAR_TO_TWO);

		changeAToOptionalAorAEClass = createEClass(CHANGE_ATO_OPTIONAL_AOR_A);

		addTerminalRuleEClass = createEClass(ADD_TERMINAL_RULE);
		createEAttribute(addTerminalRuleEClass, ADD_TERMINAL_RULE__BODY);
		createEAttribute(addTerminalRuleEClass, ADD_TERMINAL_RULE__ANNOTATION);

		addOptionalityToLineEClass = createEClass(ADD_OPTIONALITY_TO_LINE);

		addBracesToLineEClass = createEClass(ADD_BRACES_TO_LINE);

		addParenthesesWithoutQuoteToRuleEClass = createEClass(ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE);
		createEAttribute(addParenthesesWithoutQuoteToRuleEClass, ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY);

		addAlternativeSymbolEClass = createEClass(ADD_ALTERNATIVE_SYMBOL);
		createEAttribute(addAlternativeSymbolEClass, ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL);
		createEAttribute(addAlternativeSymbolEClass, ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL);

		changeABToABorBAEClass = createEClass(CHANGE_AB_TO_ABOR_BA);
		createEAttribute(changeABToABorBAEClass, CHANGE_AB_TO_ABOR_BA__ATTR_A);
		createEAttribute(changeABToABorBAEClass, CHANGE_AB_TO_ABOR_BA__ATTR_B);

		addSymbolWithoutQuoteToKeywordEClass = createEClass(ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD);
		createEAttribute(addSymbolWithoutQuoteToKeywordEClass, ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD);
		createEAttribute(addSymbolWithoutQuoteToKeywordEClass, ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL);
		createEAttribute(addSymbolWithoutQuoteToKeywordEClass, ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT);

		changeAttributeMultiplicityEClass = createEClass(CHANGE_ATTRIBUTE_MULTIPLICITY);
		createEAttribute(changeAttributeMultiplicityEClass, CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR);
		createEAttribute(changeAttributeMultiplicityEClass, CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR);
		createEAttribute(changeAttributeMultiplicityEClass, CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY);

		changeBooleanAttrToSpecialPatternEClass = createEClass(CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN);

		changeAttributeToSingleElementOrBracedListEClass = createEClass(CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST);

		changeReturnsEClass = createEClass(CHANGE_RETURNS);
		createEAttribute(changeReturnsEClass, CHANGE_RETURNS__NEW_RETURNS);

		addAlternativeValueEClass = createEClass(ADD_ALTERNATIVE_VALUE);
		createEAttribute(addAlternativeValueEClass, ADD_ALTERNATIVE_VALUE__IS_ENUM);
		createEAttribute(addAlternativeValueEClass, ADD_ALTERNATIVE_VALUE__NEW_VALUE);

		changeAToAorSymbolEClass = createEClass(CHANGE_ATO_AOR_SYMBOL);
		createEAttribute(changeAToAorSymbolEClass, CHANGE_ATO_AOR_SYMBOL__SYMBOL);

		addAlternativeSubClassToAbstractClassEClass = createEClass(ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS);
		createEAttribute(addAlternativeSubClassToAbstractClassEClass, ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS);

		addBracesToRuleEClass = createEClass(ADD_BRACES_TO_RULE);

		removeLiteralFromEnumEClass = createEClass(REMOVE_LITERAL_FROM_ENUM);
		createEAttribute(removeLiteralFromEnumEClass, REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME);

		convert0toStarTo0toStaror1toStarEClass = createEClass(CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR);

		removeActionEClass = createEClass(REMOVE_ACTION);

		addCallToOtherRuleEClass = createEClass(ADD_CALL_TO_OTHER_RULE);
		createEAttribute(addCallToOtherRuleEClass, ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS);
		createEAttribute(addCallToOtherRuleEClass, ADD_CALL_TO_OTHER_RULE__CALL_REQUIRED);

		setAstPropertyEClass = createEClass(SET_AST_PROPERTY);
		createEAttribute(setAstPropertyEClass, SET_AST_PROPERTY__CLASS_NAME);
		createEAttribute(setAstPropertyEClass, SET_AST_PROPERTY__PROPERTY_NAME);
		createEAttribute(setAstPropertyEClass, SET_AST_PROPERTY__PROPERTY_VALUE);
		createEAttribute(setAstPropertyEClass, SET_AST_PROPERTY__MULTI);

		// Create enums
		scopeKeyEEnum = createEEnum(SCOPE_KEY);
		multiplicityKeyEEnum = createEEnum(MULTIPLICITY_KEY);
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

		// Obtain other dependent packages
		GrammarrulePackage theGrammarrulePackage = (GrammarrulePackage)EPackage.Registry.INSTANCE.getEPackage(GrammarrulePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		removeBracesEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		removeKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		renameKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		convert1toStarToStarEClass.getESuperTypes().add(this.getOptimizationRule());
		convert1toStarToPlusEClass.getESuperTypes().add(this.getOptimizationRule());
		changeOptionalAttrToOrRelationEClass.getESuperTypes().add(this.getOptimizationRule());
		removeXStarAttrKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		removeCommaEClass.getESuperTypes().add(this.getOptimizationRule());
		moveLineEClass.getESuperTypes().add(this.getOptimizationRule());
		removeRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		convert1ToStarTo1EClass.getESuperTypes().add(this.getOptimizationRule());
		removeRuleCallEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordAfterKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		changeTypeOfAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addParenthesesToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		removeParenthesesInAttributeEClass.getESuperTypes().add(this.getOptimizationRule());
		addImportEClass.getESuperTypes().add(this.getOptimizationRule());
		removeAttributeEClass.getESuperTypes().add(this.getOptimizationRule());
		changeAttrLineContentEClass.getESuperTypes().add(this.getOptimizationRule());
		renameRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		removeAttributeKeywordsEClass.getESuperTypes().add(this.getOptimizationRule());
		removeOptionalityEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBracesToParenthesesEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBracesToSquareEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBracesToAngleEClass.getESuperTypes().add(this.getOptimizationRule());
		removeOutermostBracesEClass.getESuperTypes().add(this.getOptimizationRule());
		convert1toStarTo1orStarEClass.getESuperTypes().add(this.getOptimizationRule());
		removeBracesExceptOutermostEClass.getESuperTypes().add(this.getOptimizationRule());
		removeCertainTypeFromAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		changeRuleContentEClass.getESuperTypes().add(this.getOptimizationRule());
		changeCalledRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		changeCommaToOtherSymbolEClass.getESuperTypes().add(this.getOptimizationRule());
		moveAttrToAfterRuleKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addStringToRuleKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		removeImportEClass.getESuperTypes().add(this.getOptimizationRule());
		addAlternativeKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addBracesToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		keywordUpperToLowerCaseEClass.getESuperTypes().add(this.getOptimizationRule());
		addSquareBracketToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToOutermostBracesEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addPrimitiveTypeEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolToRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordToLineEClass.getESuperTypes().add(this.getOptimizationRule());
		addParenthesesWithoutQuotesEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToSymbolEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolToLineEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolWithoutQuoteToLineEClass.getESuperTypes().add(this.getOptimizationRule());
		changeABtoBABEClass.getESuperTypes().add(this.getOptimizationRule());
		copyAttrAToAttrBEClass.getESuperTypes().add(this.getOptimizationRule());
		copyXfromStarToYEClass.getESuperTypes().add(this.getOptimizationRule());
		convert1toStarToTwoEClass.getESuperTypes().add(this.getOptimizationRule());
		changeAToOptionalAorAEClass.getESuperTypes().add(this.getOptimizationRule());
		addTerminalRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToLineEClass.getESuperTypes().add(this.getOptimizationRule());
		addBracesToLineEClass.getESuperTypes().add(this.getOptimizationRule());
		addParenthesesWithoutQuoteToRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		addAlternativeSymbolEClass.getESuperTypes().add(this.getOptimizationRule());
		changeABToABorBAEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolWithoutQuoteToKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		changeAttributeMultiplicityEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBooleanAttrToSpecialPatternEClass.getESuperTypes().add(this.getOptimizationRule());
		changeAttributeToSingleElementOrBracedListEClass.getESuperTypes().add(this.getOptimizationRule());
		changeReturnsEClass.getESuperTypes().add(this.getOptimizationRule());
		addAlternativeValueEClass.getESuperTypes().add(this.getOptimizationRule());
		changeAToAorSymbolEClass.getESuperTypes().add(this.getOptimizationRule());
		addAlternativeSubClassToAbstractClassEClass.getESuperTypes().add(this.getOptimizationRule());
		addBracesToRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		removeLiteralFromEnumEClass.getESuperTypes().add(this.getOptimizationRule());
		convert0toStarTo0toStaror1toStarEClass.getESuperTypes().add(this.getOptimizationRule());
		removeActionEClass.getESuperTypes().add(this.getOptimizationRule());
		addCallToOtherRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		setAstPropertyEClass.getESuperTypes().add(this.getOptimizationRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(optimizationRuleEClass, OptimizationRule.class, "OptimizationRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimizationRule_Grammar(), theGrammarrulePackage.getGrammar(), null, "grammar", null, 0, 1, OptimizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationRule_GrammarRule(), ecorePackage.getEString(), "grammarRule", null, 0, 1, OptimizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationRule_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OptimizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOptimizationRule__Apply(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeBracesEClass, RemoveBraces.class, "RemoveBraces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveBraces_TargetAttribute(), ecorePackage.getEString(), "targetAttribute", null, 0, 1, RemoveBraces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveBraces_ExcludedGrammarRule(), ecorePackage.getEString(), "excludedGrammarRule", null, 0, -1, RemoveBraces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addKeywordToAttrEClass, AddKeywordToAttr.class, "AddKeywordToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddKeywordToAttr_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, AddKeywordToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddKeywordToAttr_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddKeywordToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeKeywordEClass, RemoveKeyword.class, "RemoveKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveKeyword_KeywordName(), ecorePackage.getEString(), "keywordName", null, 0, 1, RemoveKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveKeyword_TargetAttribute(), ecorePackage.getEString(), "targetAttribute", null, 0, 1, RemoveKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameKeywordEClass, RenameKeyword.class, "RenameKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameKeyword_CurrentKeyword(), ecorePackage.getEString(), "currentKeyword", null, 0, 1, RenameKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameKeyword_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, RenameKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameKeyword_TargetAttribute(), ecorePackage.getEString(), "targetAttribute", null, 0, 1, RenameKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convert1toStarToStarEClass, Convert1toStarToStar.class, "Convert1toStarToStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convert1toStarToPlusEClass, Convert1toStarToPlus.class, "Convert1toStarToPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeOptionalAttrToOrRelationEClass, ChangeOptionalAttrToOrRelation.class, "ChangeOptionalAttrToOrRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeOptionalAttrToOrRelation_IsAll(), ecorePackage.getEBoolean(), "isAll", null, 0, 1, ChangeOptionalAttrToOrRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOptionalAttrToOrRelation_StartAttr(), ecorePackage.getEString(), "startAttr", null, 0, 1, ChangeOptionalAttrToOrRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOptionalAttrToOrRelation_EndAttr(), ecorePackage.getEString(), "endAttr", null, 0, 1, ChangeOptionalAttrToOrRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeOptionalAttrToOrRelation_ExcludedGrammarRule(), ecorePackage.getEString(), "excludedGrammarRule", null, 0, -1, ChangeOptionalAttrToOrRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeXStarAttrKeywordEClass, RemoveXStarAttrKeyword.class, "RemoveXStarAttrKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveXStarAttrKeyword_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, RemoveXStarAttrKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeCommaEClass, RemoveComma.class, "RemoveComma", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveComma_Attributes(), ecorePackage.getEString(), "attributes", null, 0, -1, RemoveComma.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveLineEClass, MoveLine.class, "MoveLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveLine_Source(), ecorePackage.getEString(), "source", null, 0, 1, MoveLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveLine_Target(), ecorePackage.getEString(), "target", null, 0, 1, MoveLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMoveLine_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, MoveLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeRuleEClass, RemoveRule.class, "RemoveRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convert1ToStarTo1EClass, Convert1ToStarTo1.class, "Convert1ToStarTo1", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeRuleCallEClass, RemoveRuleCall.class, "RemoveRuleCall", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveRuleCall_CalledRuleName(), ecorePackage.getEString(), "calledRuleName", null, 0, 1, RemoveRuleCall.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addKeywordAfterKeywordEClass, AddKeywordAfterKeyword.class, "AddKeywordAfterKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddKeywordAfterKeyword_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, AddKeywordAfterKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddKeywordAfterKeyword_CurrentKeyword(), ecorePackage.getEString(), "currentKeyword", null, 0, 1, AddKeywordAfterKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeTypeOfAttrEClass, ChangeTypeOfAttr.class, "ChangeTypeOfAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeTypeOfAttr_CurrentType(), ecorePackage.getEString(), "currentType", null, 0, 1, ChangeTypeOfAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeTypeOfAttr_NewType(), ecorePackage.getEString(), "newType", null, 0, 1, ChangeTypeOfAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addParenthesesToAttrEClass, AddParenthesesToAttr.class, "AddParenthesesToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeParenthesesInAttributeEClass, RemoveParenthesesInAttribute.class, "RemoveParenthesesInAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addImportEClass, AddImport.class, "AddImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddImport_NewImport(), ecorePackage.getEString(), "newImport", null, 0, 1, AddImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddImport_NickName(), ecorePackage.getEString(), "nickName", null, 0, 1, AddImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeAttributeEClass, RemoveAttribute.class, "RemoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeAttrLineContentEClass, ChangeAttrLineContent.class, "ChangeAttrLineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeAttrLineContent_NewLineContent(), ecorePackage.getEString(), "newLineContent", null, 0, 1, ChangeAttrLineContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(renameRuleEClass, RenameRule.class, "RenameRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRenameRule_CurrentName(), ecorePackage.getEString(), "currentName", null, 0, 1, RenameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRenameRule_NewName(), ecorePackage.getEString(), "newName", null, 0, 1, RenameRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeAttributeKeywordsEClass, RemoveAttributeKeywords.class, "RemoveAttributeKeywords", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeOptionalityEClass, RemoveOptionality.class, "RemoveOptionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeBracesToParenthesesEClass, ChangeBracesToParentheses.class, "ChangeBracesToParentheses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeBracesToSquareEClass, ChangeBracesToSquare.class, "ChangeBracesToSquare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeBracesToAngleEClass, ChangeBracesToAngle.class, "ChangeBracesToAngle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeOutermostBracesEClass, RemoveOutermostBraces.class, "RemoveOutermostBraces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convert1toStarTo1orStarEClass, Convert1toStarTo1orStar.class, "Convert1toStarTo1orStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeBracesExceptOutermostEClass, RemoveBracesExceptOutermost.class, "RemoveBracesExceptOutermost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeCertainTypeFromAttrEClass, RemoveCertainTypeFromAttr.class, "RemoveCertainTypeFromAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveCertainTypeFromAttr_Type(), ecorePackage.getEString(), "type", null, 0, 1, RemoveCertainTypeFromAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRuleContentEClass, ChangeRuleContent.class, "ChangeRuleContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeRuleContent_NewContent(), ecorePackage.getEString(), "newContent", null, 0, 1, ChangeRuleContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeCalledRuleEClass, ChangeCalledRule.class, "ChangeCalledRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeCalledRule_CurrentCalledRule(), ecorePackage.getEString(), "currentCalledRule", null, 0, 1, ChangeCalledRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeCalledRule_NewCalledRule(), ecorePackage.getEString(), "newCalledRule", null, 0, 1, ChangeCalledRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeCommaToOtherSymbolEClass, ChangeCommaToOtherSymbol.class, "ChangeCommaToOtherSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeCommaToOtherSymbol_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, ChangeCommaToOtherSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveAttrToAfterRuleKeywordEClass, MoveAttrToAfterRuleKeyword.class, "MoveAttrToAfterRuleKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveAttrToAfterRuleKeyword_MovedLine(), ecorePackage.getEString(), "movedLine", null, 0, 1, MoveAttrToAfterRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addStringToRuleKeywordEClass, AddStringToRuleKeyword.class, "AddStringToRuleKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddStringToRuleKeyword_TargetAttribute(), ecorePackage.getEString(), "targetAttribute", null, 0, 1, AddStringToRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddStringToRuleKeyword_AddedString(), ecorePackage.getEString(), "addedString", null, 0, 1, AddStringToRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddStringToRuleKeyword_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddStringToRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOptionalityToAttrEClass, AddOptionalityToAttr.class, "AddOptionalityToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeImportEClass, RemoveImport.class, "RemoveImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveImport_Import(), ecorePackage.getEString(), "import", null, 0, 1, RemoveImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAlternativeKeywordEClass, AddAlternativeKeyword.class, "AddAlternativeKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddAlternativeKeyword_CurrentKeyword(), ecorePackage.getEString(), "currentKeyword", null, 0, 1, AddAlternativeKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddAlternativeKeyword_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, AddAlternativeKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOptionalityToKeywordEClass, AddOptionalityToKeyword.class, "AddOptionalityToKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddOptionalityToKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, AddOptionalityToKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addBracesToAttrEClass, AddBracesToAttr.class, "AddBracesToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keywordUpperToLowerCaseEClass, KeywordUpperToLowerCase.class, "KeywordUpperToLowerCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywordUpperToLowerCase_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, KeywordUpperToLowerCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSquareBracketToAttrEClass, AddSquareBracketToAttr.class, "AddSquareBracketToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addOptionalityToOutermostBracesEClass, AddOptionalityToOutermostBraces.class, "AddOptionalityToOutermostBraces", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddOptionalityToOutermostBraces_Multiplicity(), this.getMultiplicityKey(), "multiplicity", null, 0, 1, AddOptionalityToOutermostBraces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSymbolToAttrEClass, AddSymbolToAttr.class, "AddSymbolToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolToAttr_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_IgnoredAttributes(), ecorePackage.getEString(), "ignoredAttributes", null, 0, -1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_OnlyCommonRule(), ecorePackage.getEBoolean(), "onlyCommonRule", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_OnlyUpperBoundOne(), ecorePackage.getEBoolean(), "onlyUpperBoundOne", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addPrimitiveTypeEClass, AddPrimitiveType.class, "AddPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddPrimitiveType_Metaclass(), ecorePackage.getEString(), "metaclass", null, 0, 1, AddPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimitiveType_Body(), ecorePackage.getEString(), "body", null, 0, 1, AddPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddPrimitiveType_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, AddPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSymbolToRuleEClass, AddSymbolToRule.class, "AddSymbolToRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolToRule_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, AddSymbolToRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToRule_BInside(), ecorePackage.getEString(), "bInside", null, 0, 1, AddSymbolToRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addKeywordToLineEClass, AddKeywordToLine.class, "AddKeywordToLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddKeywordToLine_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, AddKeywordToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddKeywordToLine_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddKeywordToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addParenthesesWithoutQuotesEClass, AddParenthesesWithoutQuotes.class, "AddParenthesesWithoutQuotes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddParenthesesWithoutQuotes_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, AddParenthesesWithoutQuotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddParenthesesWithoutQuotes_Scope(), this.getScopeKey(), "scope", null, 0, 1, AddParenthesesWithoutQuotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddParenthesesWithoutQuotes_Multiplicity(), this.getMultiplicityKey(), "multiplicity", null, 0, 1, AddParenthesesWithoutQuotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOptionalityToSymbolEClass, AddOptionalityToSymbol.class, "AddOptionalityToSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddOptionalityToSymbol_TargetSymbol(), ecorePackage.getEString(), "targetSymbol", null, 0, 1, AddOptionalityToSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSymbolToLineEClass, AddSymbolToLine.class, "AddSymbolToLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolToLine_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, AddSymbolToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToLine_IsFront(), ecorePackage.getEBoolean(), "isFront", null, 0, 1, AddSymbolToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSymbolWithoutQuoteToLineEClass, AddSymbolWithoutQuoteToLine.class, "AddSymbolWithoutQuoteToLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolWithoutQuoteToLine_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, AddSymbolWithoutQuoteToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolWithoutQuoteToLine_IsFront(), ecorePackage.getEBoolean(), "isFront", null, 0, 1, AddSymbolWithoutQuoteToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeABtoBABEClass, ChangeABtoBAB.class, "ChangeABtoBAB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeABtoBAB_AttrA(), ecorePackage.getEString(), "attrA", null, 0, 1, ChangeABtoBAB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeABtoBAB_AttrB(), ecorePackage.getEString(), "attrB", null, 0, 1, ChangeABtoBAB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyAttrAToAttrBEClass, CopyAttrAToAttrB.class, "CopyAttrAToAttrB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyAttrAToAttrB_AttrA(), ecorePackage.getEString(), "attrA", null, 0, 1, CopyAttrAToAttrB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyAttrAToAttrB_AttrB(), ecorePackage.getEString(), "attrB", null, 0, 1, CopyAttrAToAttrB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyAttrAToAttrB_IsFront(), ecorePackage.getEBoolean(), "isFront", null, 0, 1, CopyAttrAToAttrB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyXfromStarToYEClass, CopyXfromStarToY.class, "CopyXfromStarToY", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyXfromStarToY_AttrInX(), ecorePackage.getEString(), "attrInX", null, 0, 1, CopyXfromStarToY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyXfromStarToY_AttrInY(), ecorePackage.getEString(), "attrInY", null, 0, 1, CopyXfromStarToY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyXfromStarToY_IsFront(), ecorePackage.getEBoolean(), "isFront", null, 0, 1, CopyXfromStarToY.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convert1toStarToTwoEClass, Convert1toStarToTwo.class, "Convert1toStarToTwo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeAToOptionalAorAEClass, ChangeAToOptionalAorA.class, "ChangeAToOptionalAorA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addTerminalRuleEClass, AddTerminalRule.class, "AddTerminalRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddTerminalRule_Body(), ecorePackage.getEString(), "body", null, 0, 1, AddTerminalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddTerminalRule_Annotation(), ecorePackage.getEString(), "annotation", null, 0, 1, AddTerminalRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOptionalityToLineEClass, AddOptionalityToLine.class, "AddOptionalityToLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addBracesToLineEClass, AddBracesToLine.class, "AddBracesToLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addParenthesesWithoutQuoteToRuleEClass, AddParenthesesWithoutQuoteToRule.class, "AddParenthesesWithoutQuoteToRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddParenthesesWithoutQuoteToRule_Multiplicity(), this.getMultiplicityKey(), "multiplicity", null, 0, 1, AddParenthesesWithoutQuoteToRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAlternativeSymbolEClass, AddAlternativeSymbol.class, "AddAlternativeSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddAlternativeSymbol_CurrentSymbol(), ecorePackage.getEString(), "currentSymbol", null, 0, 1, AddAlternativeSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddAlternativeSymbol_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, AddAlternativeSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeABToABorBAEClass, ChangeABToABorBA.class, "ChangeABToABorBA", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeABToABorBA_AttrA(), ecorePackage.getEString(), "attrA", null, 0, 1, ChangeABToABorBA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeABToABorBA_AttrB(), ecorePackage.getEString(), "attrB", null, 0, 1, ChangeABToABorBA.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSymbolWithoutQuoteToKeywordEClass, AddSymbolWithoutQuoteToKeyword.class, "AddSymbolWithoutQuoteToKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolWithoutQuoteToKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, AddSymbolWithoutQuoteToKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolWithoutQuoteToKeyword_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, AddSymbolWithoutQuoteToKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolWithoutQuoteToKeyword_IsFront(), ecorePackage.getEBoolean(), "isFront", null, 0, 1, AddSymbolWithoutQuoteToKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeAttributeMultiplicityEClass, ChangeAttributeMultiplicity.class, "ChangeAttributeMultiplicity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeAttributeMultiplicity_StartAttr(), ecorePackage.getEString(), "startAttr", null, 0, 1, ChangeAttributeMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeAttributeMultiplicity_EndAttr(), ecorePackage.getEString(), "endAttr", null, 0, 1, ChangeAttributeMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeAttributeMultiplicity_Multiplicity(), this.getMultiplicityKey(), "multiplicity", null, 0, 1, ChangeAttributeMultiplicity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeBooleanAttrToSpecialPatternEClass, ChangeBooleanAttrToSpecialPattern.class, "ChangeBooleanAttrToSpecialPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeAttributeToSingleElementOrBracedListEClass, ChangeAttributeToSingleElementOrBracedList.class, "ChangeAttributeToSingleElementOrBracedList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeReturnsEClass, ChangeReturns.class, "ChangeReturns", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeReturns_NewReturns(), ecorePackage.getEString(), "newReturns", null, 0, 1, ChangeReturns.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAlternativeValueEClass, AddAlternativeValue.class, "AddAlternativeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddAlternativeValue_IsEnum(), ecorePackage.getEBoolean(), "isEnum", null, 0, 1, AddAlternativeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddAlternativeValue_NewValue(), ecorePackage.getEString(), "newValue", null, 0, -1, AddAlternativeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeAToAorSymbolEClass, ChangeAToAorSymbol.class, "ChangeAToAorSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeAToAorSymbol_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, ChangeAToAorSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addAlternativeSubClassToAbstractClassEClass, AddAlternativeSubClassToAbstractClass.class, "AddAlternativeSubClassToAbstractClass", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddAlternativeSubClassToAbstractClass_NewAlternativeSubClass(), ecorePackage.getEString(), "newAlternativeSubClass", null, 0, 1, AddAlternativeSubClassToAbstractClass.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addBracesToRuleEClass, AddBracesToRule.class, "AddBracesToRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeLiteralFromEnumEClass, RemoveLiteralFromEnum.class, "RemoveLiteralFromEnum", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveLiteralFromEnum_LiteralName(), ecorePackage.getEString(), "literalName", null, 0, 1, RemoveLiteralFromEnum.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convert0toStarTo0toStaror1toStarEClass, Convert0toStarTo0toStaror1toStar.class, "Convert0toStarTo0toStaror1toStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeActionEClass, RemoveAction.class, "RemoveAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addCallToOtherRuleEClass, AddCallToOtherRule.class, "AddCallToOtherRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddCallToOtherRule_NameOfOtherClass(), ecorePackage.getEString(), "nameOfOtherClass", null, 1, 1, AddCallToOtherRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddCallToOtherRule_CallRequired(), ecorePackage.getEBoolean(), "callRequired", null, 0, 1, AddCallToOtherRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(setAstPropertyEClass, SetAstProperty.class, "SetAstProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSetAstProperty_ClassName(), ecorePackage.getEString(), "className", null, 1, 1, SetAstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetAstProperty_PropertyName(), ecorePackage.getEString(), "propertyName", null, 1, 1, SetAstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetAstProperty_PropertyValue(), ecorePackage.getEString(), "propertyValue", null, 1, 1, SetAstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSetAstProperty_Multi(), ecorePackage.getEBoolean(), "multi", null, 1, 1, SetAstProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scopeKeyEEnum, ScopeKey.class, "ScopeKey");
		addEEnumLiteral(scopeKeyEEnum, ScopeKey.SINGLEKEWORD);
		addEEnumLiteral(scopeKeyEEnum, ScopeKey.SINGLELINE);
		addEEnumLiteral(scopeKeyEEnum, ScopeKey.MULTILINES);

		initEEnum(multiplicityKeyEEnum, MultiplicityKey.class, "MultiplicityKey");
		addEEnumLiteral(multiplicityKeyEEnum, MultiplicityKey.PACKAGE_ONLY);
		addEEnumLiteral(multiplicityKeyEEnum, MultiplicityKey.MULTIPLICITY_OPTIONAL);
		addEEnumLiteral(multiplicityKeyEEnum, MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		addEEnumLiteral(multiplicityKeyEEnum, MultiplicityKey.MULTIPLICITY_ONE_OR_MORE);

		// Create resource
		createResource(eNS_URI);
	}

} //OptimizationrulePackageImpl
