/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSquareBracketToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToAngle;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToParentheses;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1ToStarTo1;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToPlus;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerPackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInAttribute;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
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
public class GrammaroptimizerPackageImpl extends EPackageImpl implements GrammaroptimizerPackage {
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
	private EClass removeBracketEClass = null;

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
	private EClass addKeywordToRuleEClass = null;

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
	private EClass addAlternativeKeyword = null;

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
	private EClass removeParenthesesInSpecifiedAttrEClass = null;

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
	private EClass removeKeywordsOfAllAttrsEClass = null;

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
	private EClass changeBracketToParenthesesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeBracketToSquareEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeBracketToAngleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeOutermostBracketEClass = null;

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
	private EClass removeBracketExceptOutermostEClass = null;

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
	private EClass addOptionalityToCommaEClass = null;

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
	private EClass addKeywordAfterKeywordEClass = null;

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
	private EClass addBracketToAttrEClass = null;

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
	private EClass keywordLowerToUpperCaseEClass = null;

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
	private EClass addOptionalityToOutermostBracketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeOutermostBracketToParenthesisEClass = null;

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
	private EEnum scopeKeyEEnum = null;
	
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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GrammaroptimizerPackageImpl() {
		super(eNS_URI, GrammaroptimizerFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GrammaroptimizerPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GrammaroptimizerPackage init() {
		if (isInited) return (GrammaroptimizerPackage)EPackage.Registry.INSTANCE.getEPackage(GrammaroptimizerPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGrammaroptimizerPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GrammaroptimizerPackageImpl theGrammaroptimizerPackage = registeredGrammaroptimizerPackage instanceof GrammaroptimizerPackageImpl ? (GrammaroptimizerPackageImpl)registeredGrammaroptimizerPackage : new GrammaroptimizerPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		GrammarrulePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGrammaroptimizerPackage.createPackageContents();

		// Initialize created meta-data
		theGrammaroptimizerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theGrammaroptimizerPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GrammaroptimizerPackage.eNS_URI, theGrammaroptimizerPackage);
		return theGrammaroptimizerPackage;
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
	public EAttribute getOptimizationRule_GrammarRuleName() {
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
	public EClass getRemoveBracket() {
		return removeBracketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveBracket_OnlyExistAttr() {
		return (EAttribute)removeBracketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveBracket_ExcludedGrammarRule() {
		return (EAttribute)removeBracketEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getAddKeywordToAttr_OnlyExistAttr() {
		return (EAttribute)addKeywordToAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddKeywordToRule() {
		return addKeywordToRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordToRule_NewKeyword() {
		return (EAttribute)addKeywordToRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordToRule_IsHead() {
		return (EAttribute)addKeywordToRuleEClass.getEStructuralFeatures().get(1);
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
	public EAttribute getRemoveKeyword_OnlyExistAttr() {
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
	public EAttribute getRenameKeyword_CurrentKeywordName() {
		return (EAttribute)renameKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRenameKeyword_NewKeywordName() {
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
	public EClass getAddAlternativeKeyword() {
		return addAlternativeKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertKeywordAfterExistingKeyword_NewKeyword() {
		return (EAttribute)addAlternativeKeyword.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsertKeywordAfterExistingKeyword_ExistingKeyword() {
		return (EAttribute)addAlternativeKeyword.getEStructuralFeatures().get(1);
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
	public EAttribute getChangeTypeOfAttr_OldTypeName() {
		return (EAttribute)changeTypeOfAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeTypeOfAttr_NewTypeName() {
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
	public EClass getRemoveParenthesesInSpecifiedAttr() {
		return removeParenthesesInSpecifiedAttrEClass;
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
	public EAttribute getAddImport_ImportString() {
		return (EAttribute)addImportEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getRenameRule_OldName() {
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
	public EClass getRemoveKeywordsOfAllAttrs() {
		return removeKeywordsOfAllAttrsEClass;
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
	public EClass getChangeBracketToParentheses() {
		return changeBracketToParenthesesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeBracketToSquare() {
		return changeBracketToSquareEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeBracketToAngle() {
		return changeBracketToAngleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveOutermostBracket() {
		return removeOutermostBracketEClass;
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
	public EClass getRemoveBracketExceptOutermost() {
		return removeBracketExceptOutermostEClass;
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
	public EAttribute getRemoveCertainTypeFromAttr_TypeName() {
		return (EAttribute)removeCertainTypeFromAttrEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddOptionalityToComma() {
		return addOptionalityToCommaEClass;
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
	public EAttribute getChangeCalledRule_NewCalledRuleName() {
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
	public EAttribute getAddStringToRuleKeyword_OnlyExistAttr() {
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
	public EAttribute getRemoveImport_ImportString() {
		return (EAttribute)removeImportEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAddKeywordAfterKeyword_ExistingKeyword() {
		return (EAttribute)addKeywordAfterKeywordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddKeywordAfterKeyword_NewKeyword() {
		return (EAttribute)addKeywordAfterKeywordEClass.getEStructuralFeatures().get(1);
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
	public EClass getAddBracketToAttr() {
		return addBracketToAttrEClass;
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
	public EClass getKeywordLowerToUpperCase() {
		return keywordLowerToUpperCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordLowerToUpperCase_Keyword() {
		return (EAttribute)keywordLowerToUpperCaseEClass.getEStructuralFeatures().get(0);
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
	public EClass getAddOptionalityToOutermostBracket() {
		return addOptionalityToOutermostBracketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeOutermostBracketToParenthesis() {
		return changeOutermostBracketToParenthesisEClass;
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
	public EAttribute getAddSymbolToAttr_AvoidAttrs() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_OnlyCommonRule() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddSymbolToAttr_OnlyUpperBoundOne() {
		return (EAttribute)addSymbolToAttrEClass.getEStructuralFeatures().get(3);
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
	public EAttribute getAddPrimitiveType_PrimitiveType() {
		return (EAttribute)addPrimitiveTypeEClass.getEStructuralFeatures().get(0);
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
	public EAttribute getAddParenthesesWithoutQuotes_Line() {
		return (EAttribute)addParenthesesWithoutQuotesEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddParenthesesWithoutQuotes_Scope() {
		return (EAttribute)addParenthesesWithoutQuotesEClass.getEStructuralFeatures().get(2);
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
	public GrammaroptimizerFactory getGrammaroptimizerFactory() {
		return (GrammaroptimizerFactory)getEFactoryInstance();
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
		createEAttribute(optimizationRuleEClass, OPTIMIZATION_RULE__GRAMMAR_RULE_NAME);
		createEAttribute(optimizationRuleEClass, OPTIMIZATION_RULE__ATTR_NAME);
		createEOperation(optimizationRuleEClass, OPTIMIZATION_RULE___APPLY);

		removeBracketEClass = createEClass(REMOVE_BRACKET);
		createEAttribute(removeBracketEClass, REMOVE_BRACKET__ONLY_EXIST_ATTR);
		createEAttribute(removeBracketEClass, REMOVE_BRACKET__EXCLUDED_GRAMMAR_RULE);

		addKeywordToAttrEClass = createEClass(ADD_KEYWORD_TO_ATTR);
		createEAttribute(addKeywordToAttrEClass, ADD_KEYWORD_TO_ATTR__NEW_KEYWORD);
		createEAttribute(addKeywordToAttrEClass, ADD_KEYWORD_TO_ATTR__IS_HEAD);
		createEAttribute(addKeywordToAttrEClass, ADD_KEYWORD_TO_ATTR__ONLY_EXIST_ATTR);

		addKeywordToRuleEClass = createEClass(ADD_KEYWORD_TO_RULE);
		createEAttribute(addKeywordToRuleEClass, ADD_KEYWORD_TO_RULE__NEW_KEYWORD);
		createEAttribute(addKeywordToRuleEClass, ADD_KEYWORD_TO_RULE__IS_HEAD);

		removeKeywordEClass = createEClass(REMOVE_KEYWORD);
		createEAttribute(removeKeywordEClass, REMOVE_KEYWORD__KEYWORD_NAME);
		createEAttribute(removeKeywordEClass, REMOVE_KEYWORD__ONLY_EXIST_ATTR);

		renameKeywordEClass = createEClass(RENAME_KEYWORD);
		createEAttribute(renameKeywordEClass, RENAME_KEYWORD__CURRENT_KEYWORD_NAME);
		createEAttribute(renameKeywordEClass, RENAME_KEYWORD__NEW_KEYWORD_NAME);
		createEAttribute(renameKeywordEClass, RENAME_KEYWORD__TARGET_ATTRIBUTE);

		convert1toStarToStarEClass = createEClass(CONVERT1TO_STAR_TO_STAR);

		convert1toStarToPlusEClass = createEClass(CONVERT1TO_STAR_TO_PLUS);

		changeOptionalAttrToOrRelationEClass = createEClass(CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE);

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

		addAlternativeKeyword = createEClass(ADD_ALTERNATIVE_KEYWORD);
		createEAttribute(addAlternativeKeyword, ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD);
		createEAttribute(addAlternativeKeyword, ADD_ALTERNATIVE_KEYWORD__EXISTING_KEYWORD);

		changeTypeOfAttrEClass = createEClass(CHANGE_TYPE_OF_ATTR);
		createEAttribute(changeTypeOfAttrEClass, CHANGE_TYPE_OF_ATTR__OLD_TYPE_NAME);
		createEAttribute(changeTypeOfAttrEClass, CHANGE_TYPE_OF_ATTR__NEW_TYPE_NAME);

		addParenthesesToAttrEClass = createEClass(ADD_PARENTHESES_TO_ATTR);

		removeParenthesesInSpecifiedAttrEClass = createEClass(REMOVE_PARENTHESES_IN_SPECIFIED_ATTR);

		addImportEClass = createEClass(ADD_IMPORT);
		createEAttribute(addImportEClass, ADD_IMPORT__IMPORT_STRING);

		removeAttributeEClass = createEClass(REMOVE_ATTRIBUTE);

		changeAttrLineContentEClass = createEClass(CHANGE_ATTR_LINE_CONTENT);
		createEAttribute(changeAttrLineContentEClass, CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT);

		renameRuleEClass = createEClass(RENAME_RULE);
		createEAttribute(renameRuleEClass, RENAME_RULE__OLD_NAME);
		createEAttribute(renameRuleEClass, RENAME_RULE__NEW_NAME);

		removeKeywordsOfAllAttrsEClass = createEClass(REMOVE_KEYWORDS_OF_ALL_ATTRS);

		removeOptionalityEClass = createEClass(REMOVE_OPTIONALITY);

		changeBracketToParenthesesEClass = createEClass(CHANGE_BRACKET_TO_PARENTHESES);

		changeBracketToSquareEClass = createEClass(CHANGE_BRACKET_TO_SQUARE);

		changeBracketToAngleEClass = createEClass(CHANGE_BRACKET_TO_ANGLE);

		removeOutermostBracketEClass = createEClass(REMOVE_OUTER_MOST_BRACKET);

		convert1toStarTo1orStarEClass = createEClass(CONVERT1TO_STAR_TO1OR_STAR);

		removeBracketExceptOutermostEClass = createEClass(REMOVE_BRACKET_EXCEPT_OUTERMOST);

		removeCertainTypeFromAttrEClass = createEClass(REMOVE_CERTAIN_TYPE_FROM_ATTR);
		createEAttribute(removeCertainTypeFromAttrEClass, REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE_NAME);

		addOptionalityToCommaEClass = createEClass(ADD_OPTIONALITY_TO_COMMA);

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
		createEAttribute(addStringToRuleKeywordEClass, ADD_STRING_TO_RULE_KEYWORD__ONLY_EXIST_ATTR);
		createEAttribute(addStringToRuleKeywordEClass, ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING);
		createEAttribute(addStringToRuleKeywordEClass, ADD_STRING_TO_RULE_KEYWORD__IS_HEAD);

		addOptionalityToAttrEClass = createEClass(ADD_OPTIONALITY_TO_ATTR);

		removeImportEClass = createEClass(REMOVE_IMPORT);
		createEAttribute(removeImportEClass, REMOVE_IMPORT__IMPORT_STRING);

		addKeywordAfterKeywordEClass = createEClass(ADD_KEYWORD_AFTER_KEYWORD);
		createEAttribute(addKeywordAfterKeywordEClass, ADD_KEYWORD_AFTER_KEYWORD__EXISTING_KEYWORD);
		createEAttribute(addKeywordAfterKeywordEClass, ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD);

		addOptionalityToKeywordEClass = createEClass(ADD_OPTIONALITY_TO_KEYWORD);
		createEAttribute(addOptionalityToKeywordEClass, ADD_OPTIONALITY_TO_KEYWORD__KEYWORD);

		addBracketToAttrEClass = createEClass(ADD_BRACKET_TO_ATTR);

		keywordUpperToLowerCaseEClass = createEClass(KEYWORD_UPPER_TO_LOWER_CASE);
		createEAttribute(keywordUpperToLowerCaseEClass, KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD);

		keywordLowerToUpperCaseEClass = createEClass(KEYWORD_LOWER_TO_UPPER_CASE);
		createEAttribute(keywordLowerToUpperCaseEClass, KEYWORD_LOWER_TO_UPPER_CASE__KEYWORD);

		addSquareBracketToAttrEClass = createEClass(ADD_SQUARE_BRACKET_TO_ATTR);

		addOptionalityToOutermostBracketEClass = createEClass(ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET);

		changeOutermostBracketToParenthesisEClass = createEClass(CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS);

		addSymbolToAttrEClass = createEClass(ADD_SYMBOL_TO_ATTR);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__NEW_SYMBOL);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__AVOID_ATTRS);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE);
		createEAttribute(addSymbolToAttrEClass, ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE);

		addPrimitiveTypeEClass = createEClass(ADD_PRIMITIVE_TYPE);
		createEAttribute(addPrimitiveTypeEClass, ADD_PRIMITIVE_TYPE__PRIMITIVE_TYPE);

		addSymbolToRuleEClass = createEClass(ADD_SYMBOL_TO_RULE);
		createEAttribute(addSymbolToRuleEClass, ADD_SYMBOL_TO_RULE__SYMBOL);

		addKeywordToLineEClass = createEClass(ADD_KEYWORD_TO_LINE);
		createEAttribute(addKeywordToLineEClass, ADD_KEYWORD_TO_LINE__NEW_KEYWORD);
		createEAttribute(addKeywordToLineEClass, ADD_KEYWORD_TO_LINE__IS_HEAD);
		
		addParenthesesWithoutQuotesEClass = createEClass(ADD_PARENTHESES_WITHOUT_QUOTES);
		createEAttribute(addParenthesesWithoutQuotesEClass, ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD);
		createEAttribute(addParenthesesWithoutQuotesEClass, ADD_PARENTHESES_WITHOUT_QUOTES__LINE);
		createEAttribute(addParenthesesWithoutQuotesEClass, ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE);

		// Create enums
		scopeKeyEEnum = createEEnum(SCOPE_KEY);
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
		removeBracketEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordToRuleEClass.getESuperTypes().add(this.getOptimizationRule());
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
		addAlternativeKeyword.getESuperTypes().add(this.getOptimizationRule());
		changeTypeOfAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addParenthesesToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		removeParenthesesInSpecifiedAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addImportEClass.getESuperTypes().add(this.getOptimizationRule());
		removeAttributeEClass.getESuperTypes().add(this.getOptimizationRule());
		changeAttrLineContentEClass.getESuperTypes().add(this.getOptimizationRule());
		renameRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		removeKeywordsOfAllAttrsEClass.getESuperTypes().add(this.getOptimizationRule());
		removeOptionalityEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBracketToParenthesesEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBracketToSquareEClass.getESuperTypes().add(this.getOptimizationRule());
		changeBracketToAngleEClass.getESuperTypes().add(this.getOptimizationRule());
		removeOutermostBracketEClass.getESuperTypes().add(this.getOptimizationRule());
		convert1toStarTo1orStarEClass.getESuperTypes().add(this.getOptimizationRule());
		removeBracketExceptOutermostEClass.getESuperTypes().add(this.getOptimizationRule());
		removeCertainTypeFromAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToCommaEClass.getESuperTypes().add(this.getOptimizationRule());
		changeRuleContentEClass.getESuperTypes().add(this.getOptimizationRule());
		changeCalledRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		changeCommaToOtherSymbolEClass.getESuperTypes().add(this.getOptimizationRule());
		moveAttrToAfterRuleKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addStringToRuleKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		removeImportEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordAfterKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToKeywordEClass.getESuperTypes().add(this.getOptimizationRule());
		addBracketToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		keywordUpperToLowerCaseEClass.getESuperTypes().add(this.getOptimizationRule());
		keywordLowerToUpperCaseEClass.getESuperTypes().add(this.getOptimizationRule());
		addSquareBracketToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addOptionalityToOutermostBracketEClass.getESuperTypes().add(this.getOptimizationRule());
		changeOutermostBracketToParenthesisEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolToAttrEClass.getESuperTypes().add(this.getOptimizationRule());
		addPrimitiveTypeEClass.getESuperTypes().add(this.getOptimizationRule());
		addSymbolToRuleEClass.getESuperTypes().add(this.getOptimizationRule());
		addKeywordToLineEClass.getESuperTypes().add(this.getOptimizationRule());
		addParenthesesWithoutQuotesEClass.getESuperTypes().add(this.getOptimizationRule());

		// Initialize classes, features, and operations; add parameters
		initEClass(optimizationRuleEClass, OptimizationRule.class, "OptimizationRule", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOptimizationRule_Grammar(), theGrammarrulePackage.getGrammar(), null, "grammar", null, 0, 1, OptimizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationRule_GrammarRuleName(), ecorePackage.getEString(), "grammarRuleName", null, 0, 1, OptimizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOptimizationRule_AttrName(), ecorePackage.getEString(), "attrName", null, 0, 1, OptimizationRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getOptimizationRule__Apply(), null, "apply", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(removeBracketEClass, RemoveBraces.class, "RemoveBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveBracket_OnlyExistAttr(), ecorePackage.getEString(), "onlyExistAttr", null, 0, 1, RemoveBraces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveBracket_ExcludedGrammarRule(), ecorePackage.getEString(), "excludedGrammarRule", null, 0, -1, RemoveBraces.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addKeywordToAttrEClass, AddKeywordToAttr.class, "AddKeywordToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddKeywordToAttr_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, AddKeywordToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddKeywordToAttr_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddKeywordToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddKeywordToAttr_OnlyExistAttr(), ecorePackage.getEString(), "onlyExistAttr", null, 0, 1, AddKeywordToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeKeywordEClass, RemoveKeyword.class, "RemoveKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveKeyword_KeywordName(), ecorePackage.getEString(), "keywordName", null, 0, 1, RemoveKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRemoveKeyword_OnlyExistAttr(), ecorePackage.getEString(), "onlyExistAttr", null, 0, 1, RemoveKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(convert1toStarToStarEClass, Convert1toStarToStar.class, "Convert1toStarToStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convert1toStarToPlusEClass, Convert1toStarToPlus.class, "Convert1toStarToPlus", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeOptionalAttrToOrRelationEClass, ChangeOptionalAttrToOrRelationImpl.class, "ChangeOptionalAttrToOrRelationImpl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

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

		initEClass(changeTypeOfAttrEClass, ChangeTypeOfAttr.class, "ChangeTypeOfAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeTypeOfAttr_OldTypeName(), ecorePackage.getEString(), "oldTypeName", null, 0, 1, ChangeTypeOfAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChangeTypeOfAttr_NewTypeName(), ecorePackage.getEString(), "newTypeName", null, 0, 1, ChangeTypeOfAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addParenthesesToAttrEClass, AddParenthesesToAttr.class, "AddParenthesesToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeParenthesesInSpecifiedAttrEClass, RemoveParenthesesInAttribute.class, "RemoveParenthesesInSpecifiedAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addImportEClass, AddImport.class, "AddImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddImport_ImportString(), ecorePackage.getEString(), "importString", null, 0, 1, AddImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeAttributeEClass, RemoveAttribute.class, "RemoveAttribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeAttrLineContentEClass, ChangeAttrLineContent.class, "ChangeAttrLineContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeAttrLineContent_NewLineContent(), ecorePackage.getEString(), "newLineContent", null, 0, 1, ChangeAttrLineContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(removeKeywordsOfAllAttrsEClass, RemoveAttributeKeywords.class, "RemoveKeywordsOfAllAttrs", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeOptionalityEClass, RemoveOptionality.class, "RemoveOptionality", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeBracketToParenthesesEClass, ChangeBracesToParentheses.class, "ChangeBracketToParentheses", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeBracketToSquareEClass, ChangeBracesToSquare.class, "ChangeBracketToSquare", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(changeBracketToAngleEClass, ChangeBracesToAngle.class, "ChangeBracketToAngle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeOutermostBracketEClass, RemoveOutermostBraces.class, "RemoveOutermostBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(convert1toStarTo1orStarEClass, Convert1toStarTo1orStar.class, "Convert1toStarTo1orStar", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeBracketExceptOutermostEClass, RemoveBracesExceptOutermost.class, "RemoveBracketExceptOutermost", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeCertainTypeFromAttrEClass, RemoveCertainTypeFromAttr.class, "RemoveCertainTypeFromAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveCertainTypeFromAttr_TypeName(), ecorePackage.getEString(), "typeName", null, 0, 1, RemoveCertainTypeFromAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeRuleContentEClass, ChangeRuleContent.class, "ChangeRuleContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeRuleContent_NewContent(), ecorePackage.getEString(), "newContent", null, 0, 1, ChangeRuleContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(changeCommaToOtherSymbolEClass, ChangeCommaToOtherSymbol.class, "ChangeCommaToOtherSymbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getChangeCommaToOtherSymbol_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, ChangeCommaToOtherSymbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(moveAttrToAfterRuleKeywordEClass, MoveAttrToAfterRuleKeyword.class, "MoveAttrToAfterRuleKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMoveAttrToAfterRuleKeyword_MovedLine(), ecorePackage.getEString(), "movedLine", null, 0, 1, MoveAttrToAfterRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addStringToRuleKeywordEClass, AddStringToRuleKeyword.class, "AddStringToRuleKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddStringToRuleKeyword_OnlyExistAttr(), ecorePackage.getEString(), "onlyExistAttr", null, 0, 1, AddStringToRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddStringToRuleKeyword_AddedString(), ecorePackage.getEString(), "addedString", null, 0, 1, AddStringToRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddStringToRuleKeyword_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddStringToRuleKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOptionalityToAttrEClass, AddOptionalityToAttr.class, "AddOptionalityToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(removeImportEClass, RemoveImport.class, "RemoveImport", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRemoveImport_ImportString(), ecorePackage.getEString(), "importString", null, 0, 1, RemoveImport.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addOptionalityToKeywordEClass, AddOptionalityToKeyword.class, "AddOptionalityToKeyword", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddOptionalityToKeyword_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, AddOptionalityToKeyword.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addBracketToAttrEClass, AddBracesToAttr.class, "AddBracketToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(keywordUpperToLowerCaseEClass, KeywordUpperToLowerCase.class, "KeywordUpperToLowerCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywordUpperToLowerCase_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, KeywordUpperToLowerCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSquareBracketToAttrEClass, AddSquareBracketToAttr.class, "AddSquareBracketToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addOptionalityToOutermostBracketEClass, AddOptionalityToOutermostBraces.class, "AddOptionalityToOutermostBracket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(addSymbolToAttrEClass, AddSymbolToAttr.class, "AddSymbolToAttr", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolToAttr_NewSymbol(), ecorePackage.getEString(), "newSymbol", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_AvoidAttrs(), ecorePackage.getEString(), "avoidAttrs", null, 0, -1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_OnlyCommonRule(), ecorePackage.getEBoolean(), "onlyCommonRule", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddSymbolToAttr_OnlyUpperBoundOne(), ecorePackage.getEBoolean(), "onlyUpperBoundOne", null, 0, 1, AddSymbolToAttr.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addPrimitiveTypeEClass, AddPrimitiveType.class, "AddPrimitiveType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddPrimitiveType_PrimitiveType(), ecorePackage.getEString(), "primitiveType", null, 0, 1, AddPrimitiveType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addSymbolToRuleEClass, AddSymbolToRule.class, "AddSymbolToRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddSymbolToRule_Symbol(), ecorePackage.getEString(), "symbol", null, 0, 1, AddSymbolToRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addKeywordToLineEClass, AddKeywordToLine.class, "AddKeywordToLine", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddKeywordToLine_NewKeyword(), ecorePackage.getEString(), "newKeyword", null, 0, 1, AddKeywordToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddKeywordToLine_IsHead(), ecorePackage.getEBoolean(), "isHead", null, 0, 1, AddKeywordToLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addParenthesesWithoutQuotesEClass, AddParenthesesWithoutQuotes.class, "AddParenthesesWithoutQuotes", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddParenthesesWithoutQuotes_Keyword(), ecorePackage.getEString(), "keyword", null, 0, 1, AddParenthesesWithoutQuotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddParenthesesWithoutQuotes_Line(), ecorePackage.getEString(), "line", null, 0, -1, AddParenthesesWithoutQuotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddParenthesesWithoutQuotes_Scope(), this.getScopeKey(), "scope", null, 0, 1, AddParenthesesWithoutQuotes.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(scopeKeyEEnum, ScopeKey.class, "ScopeKey");
		addEEnumLiteral(scopeKeyEEnum, ScopeKey.SINGLEKEWORD);
		addEEnumLiteral(scopeKeyEEnum, ScopeKey.SINGLELINE);
		addEEnumLiteral(scopeKeyEEnum, ScopeKey.MULTILINES);
		
		// Create resource
		createResource(eNS_URI);
	}

} //GrammaroptimizerPackageImpl
