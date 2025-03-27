/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.optimizationrule.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class OptimizationruleFactoryImpl extends EFactoryImpl implements OptimizationruleFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OptimizationruleFactory init() {
		try {
			OptimizationruleFactory theOptimizationruleFactory = (OptimizationruleFactory)EPackage.Registry.INSTANCE.getEFactory(OptimizationrulePackage.eNS_URI);
			if (theOptimizationruleFactory != null) {
				return theOptimizationruleFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new OptimizationruleFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationruleFactoryImpl() {
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
			case OptimizationrulePackage.REMOVE_BRACES: return createRemoveBraces();
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR: return createAddKeywordToAttr();
			case OptimizationrulePackage.REMOVE_KEYWORD: return createRemoveKeyword();
			case OptimizationrulePackage.RENAME_KEYWORD: return createRenameKeyword();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_STAR: return createConvert1toStarToStar();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_PLUS: return createConvert1toStarToPlus();
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION: return createChangeOptionalAttrToOrRelation();
			case OptimizationrulePackage.REMOVE_XSTAR_ATTR_KEYWORD: return createRemoveXStarAttrKeyword();
			case OptimizationrulePackage.REMOVE_COMMA: return createRemoveComma();
			case OptimizationrulePackage.MOVE_LINE: return createMoveLine();
			case OptimizationrulePackage.REMOVE_RULE: return createRemoveRule();
			case OptimizationrulePackage.CONVERT1_TO_STAR_TO1: return createConvert1ToStarTo1();
			case OptimizationrulePackage.REMOVE_RULE_CALL: return createRemoveRuleCall();
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD: return createAddKeywordAfterKeyword();
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR: return createChangeTypeOfAttr();
			case OptimizationrulePackage.ADD_PARENTHESES_TO_ATTR: return createAddParenthesesToAttr();
			case OptimizationrulePackage.REMOVE_PARENTHESES_IN_ATTRIBUTE: return createRemoveParenthesesInAttribute();
			case OptimizationrulePackage.ADD_IMPORT: return createAddImport();
			case OptimizationrulePackage.REMOVE_ATTRIBUTE: return createRemoveAttribute();
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT: return createChangeAttrLineContent();
			case OptimizationrulePackage.RENAME_RULE: return createRenameRule();
			case OptimizationrulePackage.REMOVE_ATTRIBUTE_KEYWORDS: return createRemoveAttributeKeywords();
			case OptimizationrulePackage.REMOVE_OPTIONALITY: return createRemoveOptionality();
			case OptimizationrulePackage.CHANGE_BRACES_TO_PARENTHESES: return createChangeBracesToParentheses();
			case OptimizationrulePackage.CHANGE_BRACES_TO_SQUARE: return createChangeBracesToSquare();
			case OptimizationrulePackage.CHANGE_BRACES_TO_ANGLE: return createChangeBracesToAngle();
			case OptimizationrulePackage.REMOVE_OUTERMOST_BRACES: return createRemoveOutermostBraces();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO1OR_STAR: return createConvert1toStarTo1orStar();
			case OptimizationrulePackage.REMOVE_BRACES_EXCEPT_OUTERMOST: return createRemoveBracesExceptOutermost();
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR: return createRemoveCertainTypeFromAttr();
			case OptimizationrulePackage.CHANGE_RULE_CONTENT: return createChangeRuleContent();
			case OptimizationrulePackage.CHANGE_CALLED_RULE: return createChangeCalledRule();
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL: return createChangeCommaToOtherSymbol();
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD: return createMoveAttrToAfterRuleKeyword();
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD: return createAddStringToRuleKeyword();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_ATTR: return createAddOptionalityToAttr();
			case OptimizationrulePackage.REMOVE_IMPORT: return createRemoveImport();
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD: return createAddAlternativeKeyword();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_KEYWORD: return createAddOptionalityToKeyword();
			case OptimizationrulePackage.ADD_BRACES_TO_ATTR: return createAddBracesToAttr();
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE: return createKeywordUpperToLowerCase();
			case OptimizationrulePackage.ADD_SQUARE_BRACKET_TO_ATTR: return createAddSquareBracketToAttr();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES: return createAddOptionalityToOutermostBraces();
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR: return createAddSymbolToAttr();
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE: return createAddPrimitiveType();
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE: return createAddSymbolToRule();
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE: return createAddKeywordToLine();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES: return createAddParenthesesWithoutQuotes();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL: return createAddOptionalityToSymbol();
			case OptimizationrulePackage.ADD_SYMBOL_TO_LINE: return createAddSymbolToLine();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE: return createAddSymbolWithoutQuoteToLine();
			case OptimizationrulePackage.CHANGE_ABTO_BAB: return createChangeABtoBAB();
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B: return createCopyAttrAToAttrB();
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y: return createCopyXfromStarToY();
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_TWO: return createConvert1toStarToTwo();
			case OptimizationrulePackage.CHANGE_ATO_OPTIONAL_AOR_A: return createChangeAToOptionalAorA();
			case OptimizationrulePackage.ADD_TERMINAL_RULE: return createAddTerminalRule();
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_LINE: return createAddOptionalityToLine();
			case OptimizationrulePackage.ADD_BRACES_TO_LINE: return createAddBracesToLine();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE: return createAddParenthesesWithoutQuoteToRule();
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL: return createAddAlternativeSymbol();
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA: return createChangeABToABorBA();
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD: return createAddSymbolWithoutQuoteToKeyword();
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY: return createChangeAttributeMultiplicity();
			case OptimizationrulePackage.CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN: return createChangeBooleanAttrToSpecialPattern();
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST: return createChangeAttributeToSingleElementOrBracedList();
			case OptimizationrulePackage.CHANGE_RETURNS: return createChangeReturns();
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE: return createAddAlternativeValue();
			case OptimizationrulePackage.CHANGE_ATO_AOR_SYMBOL: return createChangeAToAorSymbol();
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS: return createAddAlternativeSubClassToAbstractClass();
			case OptimizationrulePackage.ADD_BRACES_TO_RULE: return createAddBracesToRule();
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM: return createRemoveLiteralFromEnum();
			case OptimizationrulePackage.CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR: return createConvert0toStarTo0toStaror1toStar();
			case OptimizationrulePackage.REMOVE_ACTION: return createRemoveAction();
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE: return createAddCallToOtherRule();
			case OptimizationrulePackage.SET_AST_PROPERTY: return createSetAstProperty();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case OptimizationrulePackage.SCOPE_KEY:
				return createScopeKeyFromString(eDataType, initialValue);
			case OptimizationrulePackage.MULTIPLICITY_KEY:
				return createMultiplicityKeyFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case OptimizationrulePackage.SCOPE_KEY:
				return convertScopeKeyToString(eDataType, instanceValue);
			case OptimizationrulePackage.MULTIPLICITY_KEY:
				return convertMultiplicityKeyToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveBraces createRemoveBraces() {
		RemoveBracesImpl removeBraces = new RemoveBracesImpl();
		return removeBraces;
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
	public ChangeOptionalAttrToOrRelation createChangeOptionalAttrToOrRelation() {
		ChangeOptionalAttrToOrRelationImpl changeOptionalAttrToOrRelation = new ChangeOptionalAttrToOrRelationImpl();
		return changeOptionalAttrToOrRelation;
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
		RemoveRuleCallImpl removeRuleCall = new RemoveRuleCallImpl();
		return removeRuleCall;
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
	public RemoveParenthesesInAttribute createRemoveParenthesesInAttribute() {
		RemoveParenthesesInAttributeImpl removeParenthesesInAttribute = new RemoveParenthesesInAttributeImpl();
		return removeParenthesesInAttribute;
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
	public RenameRule createRenameRule() {
		RenameRuleImpl renameRule = new RenameRuleImpl();
		return renameRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAttributeKeywords createRemoveAttributeKeywords() {
		RemoveAttributeKeywordsImpl removeAttributeKeywords = new RemoveAttributeKeywordsImpl();
		return removeAttributeKeywords;
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
		ChangeBracesToParenthesesImpl changeBracesToParentheses = new ChangeBracesToParenthesesImpl();
		return changeBracesToParentheses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracesToSquare createChangeBracesToSquare() {
		ChangeBracesToSquareImpl changeBracesToSquare = new ChangeBracesToSquareImpl();
		return changeBracesToSquare;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBracesToAngle createChangeBracesToAngle() {
		ChangeBracesToAngleImpl changeBracesToAngle = new ChangeBracesToAngleImpl();
		return changeBracesToAngle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveOutermostBraces createRemoveOutermostBraces() {
		RemoveOutermostBracesImpl removeOutermostBraces = new RemoveOutermostBracesImpl();
		return removeOutermostBraces;
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
		RemoveBracesExceptOutermostImpl removeBracesExceptOutermost = new RemoveBracesExceptOutermostImpl();
		return removeBracesExceptOutermost;
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
	public AddAlternativeKeyword createAddAlternativeKeyword() {
		AddAlternativeKeywordImpl addAlternativeKeyword = new AddAlternativeKeywordImpl();
		return addAlternativeKeyword;
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
		AddBracesToAttrImpl addBracesToAttr = new AddBracesToAttrImpl();
		return addBracesToAttr;
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
		AddOptionalityToOutermostBracesImpl addOptionalityToOutermostBraces = new AddOptionalityToOutermostBracesImpl();
		return addOptionalityToOutermostBraces;
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
	 * @generated
	 */
	public AddOptionalityToSymbol createAddOptionalityToSymbol() {
		AddOptionalityToSymbolImpl addOptionalityToSymbol = new AddOptionalityToSymbolImpl();
		return addOptionalityToSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolToLine createAddSymbolToLine() {
		AddSymbolToLineImpl addSymbolToLine = new AddSymbolToLineImpl();
		return addSymbolToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolWithoutQuoteToLine createAddSymbolWithoutQuoteToLine() {
		AddSymbolWithoutQuoteToLineImpl addSymbolWithoutQuoteToLine = new AddSymbolWithoutQuoteToLineImpl();
		return addSymbolWithoutQuoteToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeABtoBAB createChangeABtoBAB() {
		ChangeABtoBABImpl changeABtoBAB = new ChangeABtoBABImpl();
		return changeABtoBAB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyAttrAToAttrB createCopyAttrAToAttrB() {
		CopyAttrAToAttrBImpl copyAttrAToAttrB = new CopyAttrAToAttrBImpl();
		return copyAttrAToAttrB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyXfromStarToY createCopyXfromStarToY() {
		CopyXfromStarToYImpl copyXfromStarToY = new CopyXfromStarToYImpl();
		return copyXfromStarToY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert1toStarToTwo createConvert1toStarToTwo() {
		Convert1toStarToTwoImpl convert1toStarToTwo = new Convert1toStarToTwoImpl();
		return convert1toStarToTwo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAToOptionalAorA createChangeAToOptionalAorA() {
		ChangeAToOptionalAorAImpl changeAToOptionalAorA = new ChangeAToOptionalAorAImpl();
		return changeAToOptionalAorA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddTerminalRule createAddTerminalRule() {
		AddTerminalRuleImpl addTerminalRule = new AddTerminalRuleImpl();
		return addTerminalRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddOptionalityToLine createAddOptionalityToLine() {
		AddOptionalityToLineImpl addOptionalityToLine = new AddOptionalityToLineImpl();
		return addOptionalityToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBracesToLine createAddBracesToLine() {
		AddBracesToLineImpl addBracesToLine = new AddBracesToLineImpl();
		return addBracesToLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddParenthesesWithoutQuoteToRule createAddParenthesesWithoutQuoteToRule() {
		AddParenthesesWithoutQuoteToRuleImpl addParenthesesWithoutQuoteToRule = new AddParenthesesWithoutQuoteToRuleImpl();
		return addParenthesesWithoutQuoteToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeSymbol createAddAlternativeSymbol() {
		AddAlternativeSymbolImpl addAlternativeSymbol = new AddAlternativeSymbolImpl();
		return addAlternativeSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeABToABorBA createChangeABToABorBA() {
		ChangeABToABorBAImpl changeABToABorBA = new ChangeABToABorBAImpl();
		return changeABToABorBA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddSymbolWithoutQuoteToKeyword createAddSymbolWithoutQuoteToKeyword() {
		AddSymbolWithoutQuoteToKeywordImpl addSymbolWithoutQuoteToKeyword = new AddSymbolWithoutQuoteToKeywordImpl();
		return addSymbolWithoutQuoteToKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeMultiplicity createChangeAttributeMultiplicity() {
		ChangeAttributeMultiplicityImpl changeAttributeMultiplicity = new ChangeAttributeMultiplicityImpl();
		return changeAttributeMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeBooleanAttrToSpecialPattern createChangeBooleanAttrToSpecialPattern() {
		ChangeBooleanAttrToSpecialPatternImpl changeBooleanAttrToSpecialPattern = new ChangeBooleanAttrToSpecialPatternImpl();
		return changeBooleanAttrToSpecialPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeToSingleElementOrBracedList createChangeAttributeToSingleElementOrBracedList() {
		ChangeAttributeToSingleElementOrBracedListImpl changeAttributeToSingleElementOrBracedList = new ChangeAttributeToSingleElementOrBracedListImpl();
		return changeAttributeToSingleElementOrBracedList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeReturns createChangeReturns() {
		ChangeReturnsImpl changeReturns = new ChangeReturnsImpl();
		return changeReturns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeValue createAddAlternativeValue() {
		AddAlternativeValueImpl addAlternativeValue = new AddAlternativeValueImpl();
		return addAlternativeValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAToAorSymbol createChangeAToAorSymbol() {
		ChangeAToAorSymbolImpl changeAToAorSymbol = new ChangeAToAorSymbolImpl();
		return changeAToAorSymbol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddAlternativeSubClassToAbstractClass createAddAlternativeSubClassToAbstractClass() {
		AddAlternativeSubClassToAbstractClassImpl addAlternativeSubClassToAbstractClass = new AddAlternativeSubClassToAbstractClassImpl();
		return addAlternativeSubClassToAbstractClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddBracesToRule createAddBracesToRule() {
		AddBracesToRuleImpl addBracesToRule = new AddBracesToRuleImpl();
		return addBracesToRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveLiteralFromEnum createRemoveLiteralFromEnum() {
		RemoveLiteralFromEnumImpl removeLiteralFromEnum = new RemoveLiteralFromEnumImpl();
		return removeLiteralFromEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Convert0toStarTo0toStaror1toStar createConvert0toStarTo0toStaror1toStar() {
		Convert0toStarTo0toStaror1toStarImpl convert0toStarTo0toStaror1toStar = new Convert0toStarTo0toStaror1toStarImpl();
		return convert0toStarTo0toStaror1toStar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveAction createRemoveAction() {
		RemoveActionImpl removeAction = new RemoveActionImpl();
		return removeAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddCallToOtherRule createAddCallToOtherRule() {
		AddCallToOtherRuleImpl addCallToOtherRule = new AddCallToOtherRuleImpl();
		return addCallToOtherRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAstProperty createSetAstProperty() {
		SetAstPropertyImpl setAstProperty = new SetAstPropertyImpl();
		return setAstProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeKey createScopeKeyFromString(EDataType eDataType, String initialValue) {
		ScopeKey result = ScopeKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertScopeKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKey createMultiplicityKeyFromString(EDataType eDataType, String initialValue) {
		MultiplicityKey result = MultiplicityKey.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultiplicityKeyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationrulePackage getOptimizationrulePackage() {
		return (OptimizationrulePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static OptimizationrulePackage getPackage() {
		return OptimizationrulePackage.eINSTANCE;
	}

} //OptimizationruleFactoryImpl
