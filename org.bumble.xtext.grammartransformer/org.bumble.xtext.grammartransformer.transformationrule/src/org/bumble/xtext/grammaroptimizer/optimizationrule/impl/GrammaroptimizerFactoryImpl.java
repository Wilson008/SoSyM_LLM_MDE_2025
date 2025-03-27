/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword;
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
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation;
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
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule;
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
public class GrammaroptimizerFactoryImpl extends EFactoryImpl implements GrammaroptimizerFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammaroptimizerFactory init() {
		try {
			GrammaroptimizerFactory theGrammaroptimizerFactory = (GrammaroptimizerFactory)EPackage.Registry.INSTANCE.getEFactory(GrammaroptimizerPackage.eNS_URI);
			if (theGrammaroptimizerFactory != null) {
				return theGrammaroptimizerFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammaroptimizerFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammaroptimizerFactoryImpl() {
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
			case GrammaroptimizerPackage.REMOVE_BRACKET: return createRemoveBraces();
			case GrammaroptimizerPackage.ADD_KEYWORD_TO_ATTR: return createAddKeywordToAttr();
			case GrammaroptimizerPackage.REMOVE_KEYWORD: return createRemoveKeyword();
			case GrammaroptimizerPackage.RENAME_KEYWORD: return createRenameKeyword();
			case GrammaroptimizerPackage.CONVERT1TO_STAR_TO_STAR: return createConvert1toStarToStar();
			case GrammaroptimizerPackage.CONVERT1TO_STAR_TO_PLUS: return createConvert1toStarToPlus();
			case GrammaroptimizerPackage.REMOVE_XSTAR_ATTR_KEYWORD: return createRemoveXStarAttrKeyword();
			case GrammaroptimizerPackage.REMOVE_COMMA: return createRemoveComma();
			case GrammaroptimizerPackage.MOVE_LINE: return createMoveLine();
			case GrammaroptimizerPackage.REMOVE_RULE: return createRemoveRule();
			case GrammaroptimizerPackage.CONVERT1_TO_STAR_TO1: return createConvert1ToStarTo1();
			case GrammaroptimizerPackage.REMOVE_RULE_CALL: return createRemoveRuleCall();
			case GrammaroptimizerPackage.ADD_ALTERNATIVE_KEYWORD: return createAddAlternativeKeyword();
			case GrammaroptimizerPackage.CHANGE_TYPE_OF_ATTR: return createChangeTypeOfAttr();
			case GrammaroptimizerPackage.ADD_PARENTHESES_TO_ATTR: return createAddParenthesesToAttr();
			case GrammaroptimizerPackage.REMOVE_PARENTHESES_IN_SPECIFIED_ATTR: return createRemoveParenthesesInSpecifiedAttr();
			case GrammaroptimizerPackage.ADD_IMPORT: return createAddImport();
			case GrammaroptimizerPackage.REMOVE_ATTRIBUTE: return createRemoveAttribute();
			case GrammaroptimizerPackage.CHANGE_ATTR_LINE_CONTENT: return createChangeAttrLineContent();
			case GrammaroptimizerPackage.RENAME_RULE: return createRenameRule();
			case GrammaroptimizerPackage.REMOVE_KEYWORDS_OF_ALL_ATTRS: return createRemoveKeywordsOfAllAttrs();
			case GrammaroptimizerPackage.REMOVE_OPTIONALITY: return createRemoveOptionality();
			case GrammaroptimizerPackage.CHANGE_BRACKET_TO_PARENTHESES: return createChangeBracesToParentheses();
			case GrammaroptimizerPackage.CHANGE_BRACKET_TO_SQUARE: return createChangeBracesToSquare();
			case GrammaroptimizerPackage.CHANGE_BRACKET_TO_ANGLE: return createChangeBracesToAngle();
			case GrammaroptimizerPackage.REMOVE_OUTER_MOST_BRACKET: return createRemoveOutermostBraces();
			case GrammaroptimizerPackage.CONVERT1TO_STAR_TO1OR_STAR: return createConvert1toStarTo1orStar();
			case GrammaroptimizerPackage.REMOVE_BRACKET_EXCEPT_OUTERMOST: return createRemoveBracesExceptOutermost();
			case GrammaroptimizerPackage.REMOVE_CERTAIN_TYPE_FROM_ATTR: return createRemoveCertainTypeFromAttr();
			case GrammaroptimizerPackage.CHANGE_RULE_CONTENT: return createChangeRuleContent();
			case GrammaroptimizerPackage.CHANGE_CALLED_RULE: return createChangeCalledRule();
			case GrammaroptimizerPackage.CHANGE_COMMA_TO_OTHER_SYMBOL: return createChangeCommaToOtherSymbol();
			case GrammaroptimizerPackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD: return createMoveAttrToAfterRuleKeyword();
			case GrammaroptimizerPackage.ADD_STRING_TO_RULE_KEYWORD: return createAddStringToRuleKeyword();
			case GrammaroptimizerPackage.ADD_OPTIONALITY_TO_ATTR: return createAddOptionalityToAttr();
			case GrammaroptimizerPackage.REMOVE_IMPORT: return createRemoveImport();
			case GrammaroptimizerPackage.ADD_KEYWORD_AFTER_KEYWORD: return createAddKeywordAfterKeyword();
			case GrammaroptimizerPackage.ADD_OPTIONALITY_TO_KEYWORD: return createAddOptionalityToKeyword();
			case GrammaroptimizerPackage.ADD_BRACKET_TO_ATTR: return createAddBracesToAttr();
			case GrammaroptimizerPackage.KEYWORD_UPPER_TO_LOWER_CASE: return createKeywordUpperToLowerCase();
			case GrammaroptimizerPackage.ADD_SQUARE_BRACKET_TO_ATTR: return createAddSquareBracketToAttr();
			case GrammaroptimizerPackage.ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET: return createAddOptionalityToOutermostBraces();
			case GrammaroptimizerPackage.ADD_SYMBOL_TO_ATTR: return createAddSymbolToAttr();
			case GrammaroptimizerPackage.ADD_PRIMITIVE_TYPE: return createAddPrimitiveType();
			case GrammaroptimizerPackage.ADD_SYMBOL_TO_RULE: return createAddSymbolToRule();
			case GrammaroptimizerPackage.ADD_KEYWORD_TO_LINE: return createAddKeywordToLine();
			case GrammaroptimizerPackage.ADD_PARENTHESES_WITHOUT_QUOTES: return createAddParenthesesWithoutQuotes();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBraces createRemoveBraces() {
		RemoveBracesImpl removeBracket = new RemoveBracesImpl();
		return removeBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordToAttr createAddKeywordToAttr() {
		AddKeywordToAttrImpl addKeywordToAttr = new AddKeywordToAttrImpl();
		return addKeywordToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveKeyword createRemoveKeyword() {
		RemoveKeywordImpl removeKeyword = new RemoveKeywordImpl();
		return removeKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameKeyword createRenameKeyword() {
		RenameKeywordImpl renameKeyword = new RenameKeywordImpl();
		return renameKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarToStar createConvert1toStarToStar() {
		Convert1toStarToStarImpl convert1toStarToStar = new Convert1toStarToStarImpl();
		return convert1toStarToStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarToPlus createConvert1toStarToPlus() {
		Convert1toStarToPlusImpl convert1toStarToPlus = new Convert1toStarToPlusImpl();
		return convert1toStarToPlus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveXStarAttrKeyword createRemoveXStarAttrKeyword() {
		RemoveXStarAttrKeywordImpl removeXStarAttrKeyword = new RemoveXStarAttrKeywordImpl();
		return removeXStarAttrKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveComma createRemoveComma() {
		RemoveCommaImpl removeComma = new RemoveCommaImpl();
		return removeComma;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveLine createMoveLine() {
		MoveLineImpl moveLine = new MoveLineImpl();
		return moveLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRule createRemoveRule() {
		RemoveRuleImpl removeRule = new RemoveRuleImpl();
		return removeRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1ToStarTo1 createConvert1ToStarTo1() {
		Convert1ToStarTo1Impl convert1ToStarTo1 = new Convert1ToStarTo1Impl();
		return convert1ToStarTo1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveRuleCall createRemoveRuleCall() {
		RemoveRuleCallImpl removeRuleCalling = new RemoveRuleCallImpl();
		return removeRuleCalling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeKeyword createAddAlternativeKeyword() {
		AddAlternativeKeywordImpl addAlternativeKeyword = new AddAlternativeKeywordImpl();
		return addAlternativeKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeTypeOfAttr createChangeTypeOfAttr() {
		ChangeTypeOfAttrImpl changeTypeOfAttr = new ChangeTypeOfAttrImpl();
		return changeTypeOfAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddParenthesesToAttr createAddParenthesesToAttr() {
		AddParenthesesToAttrImpl addParenthesesToAttr = new AddParenthesesToAttrImpl();
		return addParenthesesToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveParenthesesInAttribute createRemoveParenthesesInSpecifiedAttr() {
		RemoveParenthesesInAttribute removeParenthesesInSpecifiedAttr = new RemoveParenthesesInAttributeImpl();
		return removeParenthesesInSpecifiedAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddImport createAddImport() {
		AddImportImpl addImport = new AddImportImpl();
		return addImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttribute createRemoveAttribute() {
		RemoveAttributeImpl removeAttribute = new RemoveAttributeImpl();
		return removeAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttrLineContent createChangeAttrLineContent() {
		ChangeAttrLineContentImpl changeAttrLineContent = new ChangeAttrLineContentImpl();
		return changeAttrLineContent;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttributeKeywords createRemoveKeywordsOfAllAttrs() {
		RemoveAttributeKeywordsImpl removeKeywordsOfAllAttrs = new RemoveAttributeKeywordsImpl();
		return removeKeywordsOfAllAttrs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveOptionality createRemoveOptionality() {
		RemoveOptionalityImpl removeOptionality = new RemoveOptionalityImpl();
		return removeOptionality;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracesToParentheses createChangeBracesToParentheses() {
		ChangeBracesToParenthesesImpl changeBracketToParentheses = new ChangeBracesToParenthesesImpl();
		return changeBracketToParentheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracesToSquare createChangeBracesToSquare() {
		ChangeBracesToSquareImpl changeBracketToSquare = new ChangeBracesToSquareImpl();
		return changeBracketToSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracesToAngle createChangeBracesToAngle() {
		ChangeBracesToAngleImpl changeBracketToAngle = new ChangeBracesToAngleImpl();
		return changeBracketToAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveOutermostBraces createRemoveOutermostBraces() {
		RemoveOutermostBracesImpl removeOutermostBracket = new RemoveOutermostBracesImpl();
		return removeOutermostBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarTo1orStar createConvert1toStarTo1orStar() {
		Convert1toStarTo1orStarImpl convert1toStarTo1orStar = new Convert1toStarTo1orStarImpl();
		return convert1toStarTo1orStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBracesExceptOutermost createRemoveBracesExceptOutermost() {
		RemoveBracesExceptOutermostImpl removeBracketExceptOutermost = new RemoveBracesExceptOutermostImpl();
		return removeBracketExceptOutermost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveCertainTypeFromAttr createRemoveCertainTypeFromAttr() {
		RemoveCertainTypeFromAttrImpl removeCertainTypeFromAttr = new RemoveCertainTypeFromAttrImpl();
		return removeCertainTypeFromAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeRuleContent createChangeRuleContent() {
		ChangeRuleContentImpl changeRuleContent = new ChangeRuleContentImpl();
		return changeRuleContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCalledRule createChangeCalledRule() {
		ChangeCalledRuleImpl changeCalledRule = new ChangeCalledRuleImpl();
		return changeCalledRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeCommaToOtherSymbol createChangeCommaToOtherSymbol() {
		ChangeCommaToOtherSymbolImpl changeCommaToOtherSymbol = new ChangeCommaToOtherSymbolImpl();
		return changeCommaToOtherSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MoveAttrToAfterRuleKeyword createMoveAttrToAfterRuleKeyword() {
		MoveAttrToAfterRuleKeywordImpl moveAttrToAfterRuleKeyword = new MoveAttrToAfterRuleKeywordImpl();
		return moveAttrToAfterRuleKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddStringToRuleKeyword createAddStringToRuleKeyword() {
		AddStringToRuleKeywordImpl addStringToRuleKeyword = new AddStringToRuleKeywordImpl();
		return addStringToRuleKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToAttr createAddOptionalityToAttr() {
		AddOptionalityToAttrImpl addOptionalityToAttr = new AddOptionalityToAttrImpl();
		return addOptionalityToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveImport createRemoveImport() {
		RemoveImportImpl removeImport = new RemoveImportImpl();
		return removeImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordAfterKeyword createAddKeywordAfterKeyword() {
		AddKeywordAfterKeywordImpl addKeywordAfterKeyword = new AddKeywordAfterKeywordImpl();
		return addKeywordAfterKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToKeyword createAddOptionalityToKeyword() {
		AddOptionalityToKeywordImpl addOptionalityToKeyword = new AddOptionalityToKeywordImpl();
		return addOptionalityToKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBracesToAttr createAddBracesToAttr() {
		AddBracesToAttrImpl addBracketToAttr = new AddBracesToAttrImpl();
		return addBracketToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordUpperToLowerCase createKeywordUpperToLowerCase() {
		KeywordUpperToLowerCaseImpl keywordUpperToLowerCase = new KeywordUpperToLowerCaseImpl();
		return keywordUpperToLowerCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSquareBracketToAttr createAddSquareBracketToAttr() {
		AddSquareBracketToAttrImpl addSquareBracketToAttr = new AddSquareBracketToAttrImpl();
		return addSquareBracketToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToOutermostBraces createAddOptionalityToOutermostBraces() {
		AddOptionalityToOutermostBracesImpl addOptionalityToOutermostBracket = new AddOptionalityToOutermostBracesImpl();
		return addOptionalityToOutermostBracket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolToAttr createAddSymbolToAttr() {
		AddSymbolToAttrImpl addSymbolToAttr = new AddSymbolToAttrImpl();
		return addSymbolToAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddPrimitiveType createAddPrimitiveType() {
		AddPrimitiveTypeImpl addPrimitiveType = new AddPrimitiveTypeImpl();
		return addPrimitiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolToRule createAddSymbolToRule() {
		AddSymbolToRuleImpl addSymbolToRule = new AddSymbolToRuleImpl();
		return addSymbolToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddKeywordToLine createAddKeywordToLine() {
		AddKeywordToLineImpl addKeywordToLine = new AddKeywordToLineImpl();
		return addKeywordToLine;
	}
	public GrammaroptimizerPackage getGrammaroptimizerPackage() {
		return (GrammaroptimizerPackage)getEPackage();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddParenthesesWithoutQuotes createAddParenthesesWithoutQuotes() {
		AddParenthesesWithoutQuotesImpl addParenthesesWithoutQuotes = new AddParenthesesWithoutQuotesImpl();
		return addParenthesesWithoutQuotes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammaroptimizerPackage getPackage() {
		return GrammaroptimizerPackage.eINSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RenameRule createRenameRule() {
		RenameRuleImpl renameRule = new RenameRuleImpl();
		return renameRule;
	}

	@Override
	public ChangeOptionalAttrToOrRelation createChangeOptionalAttrToOrRelation() {
		ChangeOptionalAttrToOrRelationImpl changeOptionalAttrToOrRelation = new ChangeOptionalAttrToOrRelationImpl();
		return changeOptionalAttrToOrRelation;
	}

} //GrammaroptimizerFactoryImpl
