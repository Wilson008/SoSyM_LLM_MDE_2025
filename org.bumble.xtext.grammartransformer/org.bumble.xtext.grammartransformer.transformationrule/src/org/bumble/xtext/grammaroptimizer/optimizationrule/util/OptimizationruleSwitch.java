/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.util;

import org.bumble.xtext.grammaroptimizer.optimizationrule.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage
 * @generated
 */
public class OptimizationruleSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static OptimizationrulePackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptimizationruleSwitch() {
		if (modelPackage == null) {
			modelPackage = OptimizationrulePackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case OptimizationrulePackage.OPTIMIZATION_RULE: {
				OptimizationRule optimizationRule = (OptimizationRule)theEObject;
				T result = caseOptimizationRule(optimizationRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_BRACES: {
				RemoveBraces removeBraces = (RemoveBraces)theEObject;
				T result = caseRemoveBraces(removeBraces);
				if (result == null) result = caseOptimizationRule(removeBraces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR: {
				AddKeywordToAttr addKeywordToAttr = (AddKeywordToAttr)theEObject;
				T result = caseAddKeywordToAttr(addKeywordToAttr);
				if (result == null) result = caseOptimizationRule(addKeywordToAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_KEYWORD: {
				RemoveKeyword removeKeyword = (RemoveKeyword)theEObject;
				T result = caseRemoveKeyword(removeKeyword);
				if (result == null) result = caseOptimizationRule(removeKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.RENAME_KEYWORD: {
				RenameKeyword renameKeyword = (RenameKeyword)theEObject;
				T result = caseRenameKeyword(renameKeyword);
				if (result == null) result = caseOptimizationRule(renameKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_STAR: {
				Convert1toStarToStar convert1toStarToStar = (Convert1toStarToStar)theEObject;
				T result = caseConvert1toStarToStar(convert1toStarToStar);
				if (result == null) result = caseOptimizationRule(convert1toStarToStar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_PLUS: {
				Convert1toStarToPlus convert1toStarToPlus = (Convert1toStarToPlus)theEObject;
				T result = caseConvert1toStarToPlus(convert1toStarToPlus);
				if (result == null) result = caseOptimizationRule(convert1toStarToPlus);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_OPTIONAL_ATTR_TO_OR_RELATION: {
				ChangeOptionalAttrToOrRelation changeOptionalAttrToOrRelation = (ChangeOptionalAttrToOrRelation)theEObject;
				T result = caseChangeOptionalAttrToOrRelation(changeOptionalAttrToOrRelation);
				if (result == null) result = caseOptimizationRule(changeOptionalAttrToOrRelation);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_XSTAR_ATTR_KEYWORD: {
				RemoveXStarAttrKeyword removeXStarAttrKeyword = (RemoveXStarAttrKeyword)theEObject;
				T result = caseRemoveXStarAttrKeyword(removeXStarAttrKeyword);
				if (result == null) result = caseOptimizationRule(removeXStarAttrKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_COMMA: {
				RemoveComma removeComma = (RemoveComma)theEObject;
				T result = caseRemoveComma(removeComma);
				if (result == null) result = caseOptimizationRule(removeComma);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.MOVE_LINE: {
				MoveLine moveLine = (MoveLine)theEObject;
				T result = caseMoveLine(moveLine);
				if (result == null) result = caseOptimizationRule(moveLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_RULE: {
				RemoveRule removeRule = (RemoveRule)theEObject;
				T result = caseRemoveRule(removeRule);
				if (result == null) result = caseOptimizationRule(removeRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CONVERT1_TO_STAR_TO1: {
				Convert1ToStarTo1 convert1ToStarTo1 = (Convert1ToStarTo1)theEObject;
				T result = caseConvert1ToStarTo1(convert1ToStarTo1);
				if (result == null) result = caseOptimizationRule(convert1ToStarTo1);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_RULE_CALL: {
				RemoveRuleCall removeRuleCall = (RemoveRuleCall)theEObject;
				T result = caseRemoveRuleCall(removeRuleCall);
				if (result == null) result = caseOptimizationRule(removeRuleCall);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_KEYWORD_AFTER_KEYWORD: {
				AddKeywordAfterKeyword addKeywordAfterKeyword = (AddKeywordAfterKeyword)theEObject;
				T result = caseAddKeywordAfterKeyword(addKeywordAfterKeyword);
				if (result == null) result = caseOptimizationRule(addKeywordAfterKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_TYPE_OF_ATTR: {
				ChangeTypeOfAttr changeTypeOfAttr = (ChangeTypeOfAttr)theEObject;
				T result = caseChangeTypeOfAttr(changeTypeOfAttr);
				if (result == null) result = caseOptimizationRule(changeTypeOfAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_PARENTHESES_TO_ATTR: {
				AddParenthesesToAttr addParenthesesToAttr = (AddParenthesesToAttr)theEObject;
				T result = caseAddParenthesesToAttr(addParenthesesToAttr);
				if (result == null) result = caseOptimizationRule(addParenthesesToAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_PARENTHESES_IN_ATTRIBUTE: {
				RemoveParenthesesInAttribute removeParenthesesInAttribute = (RemoveParenthesesInAttribute)theEObject;
				T result = caseRemoveParenthesesInAttribute(removeParenthesesInAttribute);
				if (result == null) result = caseOptimizationRule(removeParenthesesInAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_IMPORT: {
				AddImport addImport = (AddImport)theEObject;
				T result = caseAddImport(addImport);
				if (result == null) result = caseOptimizationRule(addImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_ATTRIBUTE: {
				RemoveAttribute removeAttribute = (RemoveAttribute)theEObject;
				T result = caseRemoveAttribute(removeAttribute);
				if (result == null) result = caseOptimizationRule(removeAttribute);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_ATTR_LINE_CONTENT: {
				ChangeAttrLineContent changeAttrLineContent = (ChangeAttrLineContent)theEObject;
				T result = caseChangeAttrLineContent(changeAttrLineContent);
				if (result == null) result = caseOptimizationRule(changeAttrLineContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.RENAME_RULE: {
				RenameRule renameRule = (RenameRule)theEObject;
				T result = caseRenameRule(renameRule);
				if (result == null) result = caseOptimizationRule(renameRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_ATTRIBUTE_KEYWORDS: {
				RemoveAttributeKeywords removeAttributeKeywords = (RemoveAttributeKeywords)theEObject;
				T result = caseRemoveAttributeKeywords(removeAttributeKeywords);
				if (result == null) result = caseOptimizationRule(removeAttributeKeywords);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_OPTIONALITY: {
				RemoveOptionality removeOptionality = (RemoveOptionality)theEObject;
				T result = caseRemoveOptionality(removeOptionality);
				if (result == null) result = caseOptimizationRule(removeOptionality);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_BRACES_TO_PARENTHESES: {
				ChangeBracesToParentheses changeBracesToParentheses = (ChangeBracesToParentheses)theEObject;
				T result = caseChangeBracesToParentheses(changeBracesToParentheses);
				if (result == null) result = caseOptimizationRule(changeBracesToParentheses);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_BRACES_TO_SQUARE: {
				ChangeBracesToSquare changeBracesToSquare = (ChangeBracesToSquare)theEObject;
				T result = caseChangeBracesToSquare(changeBracesToSquare);
				if (result == null) result = caseOptimizationRule(changeBracesToSquare);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_BRACES_TO_ANGLE: {
				ChangeBracesToAngle changeBracesToAngle = (ChangeBracesToAngle)theEObject;
				T result = caseChangeBracesToAngle(changeBracesToAngle);
				if (result == null) result = caseOptimizationRule(changeBracesToAngle);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_OUTERMOST_BRACES: {
				RemoveOutermostBraces removeOutermostBraces = (RemoveOutermostBraces)theEObject;
				T result = caseRemoveOutermostBraces(removeOutermostBraces);
				if (result == null) result = caseOptimizationRule(removeOutermostBraces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CONVERT1TO_STAR_TO1OR_STAR: {
				Convert1toStarTo1orStar convert1toStarTo1orStar = (Convert1toStarTo1orStar)theEObject;
				T result = caseConvert1toStarTo1orStar(convert1toStarTo1orStar);
				if (result == null) result = caseOptimizationRule(convert1toStarTo1orStar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_BRACES_EXCEPT_OUTERMOST: {
				RemoveBracesExceptOutermost removeBracesExceptOutermost = (RemoveBracesExceptOutermost)theEObject;
				T result = caseRemoveBracesExceptOutermost(removeBracesExceptOutermost);
				if (result == null) result = caseOptimizationRule(removeBracesExceptOutermost);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_CERTAIN_TYPE_FROM_ATTR: {
				RemoveCertainTypeFromAttr removeCertainTypeFromAttr = (RemoveCertainTypeFromAttr)theEObject;
				T result = caseRemoveCertainTypeFromAttr(removeCertainTypeFromAttr);
				if (result == null) result = caseOptimizationRule(removeCertainTypeFromAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_RULE_CONTENT: {
				ChangeRuleContent changeRuleContent = (ChangeRuleContent)theEObject;
				T result = caseChangeRuleContent(changeRuleContent);
				if (result == null) result = caseOptimizationRule(changeRuleContent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_CALLED_RULE: {
				ChangeCalledRule changeCalledRule = (ChangeCalledRule)theEObject;
				T result = caseChangeCalledRule(changeCalledRule);
				if (result == null) result = caseOptimizationRule(changeCalledRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_COMMA_TO_OTHER_SYMBOL: {
				ChangeCommaToOtherSymbol changeCommaToOtherSymbol = (ChangeCommaToOtherSymbol)theEObject;
				T result = caseChangeCommaToOtherSymbol(changeCommaToOtherSymbol);
				if (result == null) result = caseOptimizationRule(changeCommaToOtherSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD: {
				MoveAttrToAfterRuleKeyword moveAttrToAfterRuleKeyword = (MoveAttrToAfterRuleKeyword)theEObject;
				T result = caseMoveAttrToAfterRuleKeyword(moveAttrToAfterRuleKeyword);
				if (result == null) result = caseOptimizationRule(moveAttrToAfterRuleKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_STRING_TO_RULE_KEYWORD: {
				AddStringToRuleKeyword addStringToRuleKeyword = (AddStringToRuleKeyword)theEObject;
				T result = caseAddStringToRuleKeyword(addStringToRuleKeyword);
				if (result == null) result = caseOptimizationRule(addStringToRuleKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_ATTR: {
				AddOptionalityToAttr addOptionalityToAttr = (AddOptionalityToAttr)theEObject;
				T result = caseAddOptionalityToAttr(addOptionalityToAttr);
				if (result == null) result = caseOptimizationRule(addOptionalityToAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_IMPORT: {
				RemoveImport removeImport = (RemoveImport)theEObject;
				T result = caseRemoveImport(removeImport);
				if (result == null) result = caseOptimizationRule(removeImport);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_ALTERNATIVE_KEYWORD: {
				AddAlternativeKeyword addAlternativeKeyword = (AddAlternativeKeyword)theEObject;
				T result = caseAddAlternativeKeyword(addAlternativeKeyword);
				if (result == null) result = caseOptimizationRule(addAlternativeKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_KEYWORD: {
				AddOptionalityToKeyword addOptionalityToKeyword = (AddOptionalityToKeyword)theEObject;
				T result = caseAddOptionalityToKeyword(addOptionalityToKeyword);
				if (result == null) result = caseOptimizationRule(addOptionalityToKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_BRACES_TO_ATTR: {
				AddBracesToAttr addBracesToAttr = (AddBracesToAttr)theEObject;
				T result = caseAddBracesToAttr(addBracesToAttr);
				if (result == null) result = caseOptimizationRule(addBracesToAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.KEYWORD_UPPER_TO_LOWER_CASE: {
				KeywordUpperToLowerCase keywordUpperToLowerCase = (KeywordUpperToLowerCase)theEObject;
				T result = caseKeywordUpperToLowerCase(keywordUpperToLowerCase);
				if (result == null) result = caseOptimizationRule(keywordUpperToLowerCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_SQUARE_BRACKET_TO_ATTR: {
				AddSquareBracketToAttr addSquareBracketToAttr = (AddSquareBracketToAttr)theEObject;
				T result = caseAddSquareBracketToAttr(addSquareBracketToAttr);
				if (result == null) result = caseOptimizationRule(addSquareBracketToAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_OUTERMOST_BRACES: {
				AddOptionalityToOutermostBraces addOptionalityToOutermostBraces = (AddOptionalityToOutermostBraces)theEObject;
				T result = caseAddOptionalityToOutermostBraces(addOptionalityToOutermostBraces);
				if (result == null) result = caseOptimizationRule(addOptionalityToOutermostBraces);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_SYMBOL_TO_ATTR: {
				AddSymbolToAttr addSymbolToAttr = (AddSymbolToAttr)theEObject;
				T result = caseAddSymbolToAttr(addSymbolToAttr);
				if (result == null) result = caseOptimizationRule(addSymbolToAttr);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE: {
				AddPrimitiveType addPrimitiveType = (AddPrimitiveType)theEObject;
				T result = caseAddPrimitiveType(addPrimitiveType);
				if (result == null) result = caseOptimizationRule(addPrimitiveType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_SYMBOL_TO_RULE: {
				AddSymbolToRule addSymbolToRule = (AddSymbolToRule)theEObject;
				T result = caseAddSymbolToRule(addSymbolToRule);
				if (result == null) result = caseOptimizationRule(addSymbolToRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE: {
				AddKeywordToLine addKeywordToLine = (AddKeywordToLine)theEObject;
				T result = caseAddKeywordToLine(addKeywordToLine);
				if (result == null) result = caseOptimizationRule(addKeywordToLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES: {
				AddParenthesesWithoutQuotes addParenthesesWithoutQuotes = (AddParenthesesWithoutQuotes)theEObject;
				T result = caseAddParenthesesWithoutQuotes(addParenthesesWithoutQuotes);
				if (result == null) result = caseOptimizationRule(addParenthesesWithoutQuotes);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_SYMBOL: {
				AddOptionalityToSymbol addOptionalityToSymbol = (AddOptionalityToSymbol)theEObject;
				T result = caseAddOptionalityToSymbol(addOptionalityToSymbol);
				if (result == null) result = caseOptimizationRule(addOptionalityToSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_SYMBOL_TO_LINE: {
				AddSymbolToLine addSymbolToLine = (AddSymbolToLine)theEObject;
				T result = caseAddSymbolToLine(addSymbolToLine);
				if (result == null) result = caseOptimizationRule(addSymbolToLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE: {
				AddSymbolWithoutQuoteToLine addSymbolWithoutQuoteToLine = (AddSymbolWithoutQuoteToLine)theEObject;
				T result = caseAddSymbolWithoutQuoteToLine(addSymbolWithoutQuoteToLine);
				if (result == null) result = caseOptimizationRule(addSymbolWithoutQuoteToLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_ABTO_BAB: {
				ChangeABtoBAB changeABtoBAB = (ChangeABtoBAB)theEObject;
				T result = caseChangeABtoBAB(changeABtoBAB);
				if (result == null) result = caseOptimizationRule(changeABtoBAB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.COPY_ATTR_ATO_ATTR_B: {
				CopyAttrAToAttrB copyAttrAToAttrB = (CopyAttrAToAttrB)theEObject;
				T result = caseCopyAttrAToAttrB(copyAttrAToAttrB);
				if (result == null) result = caseOptimizationRule(copyAttrAToAttrB);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.COPY_XFROM_STAR_TO_Y: {
				CopyXfromStarToY copyXfromStarToY = (CopyXfromStarToY)theEObject;
				T result = caseCopyXfromStarToY(copyXfromStarToY);
				if (result == null) result = caseOptimizationRule(copyXfromStarToY);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CONVERT1TO_STAR_TO_TWO: {
				Convert1toStarToTwo convert1toStarToTwo = (Convert1toStarToTwo)theEObject;
				T result = caseConvert1toStarToTwo(convert1toStarToTwo);
				if (result == null) result = caseOptimizationRule(convert1toStarToTwo);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_ATO_OPTIONAL_AOR_A: {
				ChangeAToOptionalAorA changeAToOptionalAorA = (ChangeAToOptionalAorA)theEObject;
				T result = caseChangeAToOptionalAorA(changeAToOptionalAorA);
				if (result == null) result = caseOptimizationRule(changeAToOptionalAorA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_TERMINAL_RULE: {
				AddTerminalRule addTerminalRule = (AddTerminalRule)theEObject;
				T result = caseAddTerminalRule(addTerminalRule);
				if (result == null) result = caseOptimizationRule(addTerminalRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_OPTIONALITY_TO_LINE: {
				AddOptionalityToLine addOptionalityToLine = (AddOptionalityToLine)theEObject;
				T result = caseAddOptionalityToLine(addOptionalityToLine);
				if (result == null) result = caseOptimizationRule(addOptionalityToLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_BRACES_TO_LINE: {
				AddBracesToLine addBracesToLine = (AddBracesToLine)theEObject;
				T result = caseAddBracesToLine(addBracesToLine);
				if (result == null) result = caseOptimizationRule(addBracesToLine);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE: {
				AddParenthesesWithoutQuoteToRule addParenthesesWithoutQuoteToRule = (AddParenthesesWithoutQuoteToRule)theEObject;
				T result = caseAddParenthesesWithoutQuoteToRule(addParenthesesWithoutQuoteToRule);
				if (result == null) result = caseOptimizationRule(addParenthesesWithoutQuoteToRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_ALTERNATIVE_SYMBOL: {
				AddAlternativeSymbol addAlternativeSymbol = (AddAlternativeSymbol)theEObject;
				T result = caseAddAlternativeSymbol(addAlternativeSymbol);
				if (result == null) result = caseOptimizationRule(addAlternativeSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_AB_TO_ABOR_BA: {
				ChangeABToABorBA changeABToABorBA = (ChangeABToABorBA)theEObject;
				T result = caseChangeABToABorBA(changeABToABorBA);
				if (result == null) result = caseOptimizationRule(changeABToABorBA);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD: {
				AddSymbolWithoutQuoteToKeyword addSymbolWithoutQuoteToKeyword = (AddSymbolWithoutQuoteToKeyword)theEObject;
				T result = caseAddSymbolWithoutQuoteToKeyword(addSymbolWithoutQuoteToKeyword);
				if (result == null) result = caseOptimizationRule(addSymbolWithoutQuoteToKeyword);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY: {
				ChangeAttributeMultiplicity changeAttributeMultiplicity = (ChangeAttributeMultiplicity)theEObject;
				T result = caseChangeAttributeMultiplicity(changeAttributeMultiplicity);
				if (result == null) result = caseOptimizationRule(changeAttributeMultiplicity);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN: {
				ChangeBooleanAttrToSpecialPattern changeBooleanAttrToSpecialPattern = (ChangeBooleanAttrToSpecialPattern)theEObject;
				T result = caseChangeBooleanAttrToSpecialPattern(changeBooleanAttrToSpecialPattern);
				if (result == null) result = caseOptimizationRule(changeBooleanAttrToSpecialPattern);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST: {
				ChangeAttributeToSingleElementOrBracedList changeAttributeToSingleElementOrBracedList = (ChangeAttributeToSingleElementOrBracedList)theEObject;
				T result = caseChangeAttributeToSingleElementOrBracedList(changeAttributeToSingleElementOrBracedList);
				if (result == null) result = caseOptimizationRule(changeAttributeToSingleElementOrBracedList);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_RETURNS: {
				ChangeReturns changeReturns = (ChangeReturns)theEObject;
				T result = caseChangeReturns(changeReturns);
				if (result == null) result = caseOptimizationRule(changeReturns);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_ALTERNATIVE_VALUE: {
				AddAlternativeValue addAlternativeValue = (AddAlternativeValue)theEObject;
				T result = caseAddAlternativeValue(addAlternativeValue);
				if (result == null) result = caseOptimizationRule(addAlternativeValue);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CHANGE_ATO_AOR_SYMBOL: {
				ChangeAToAorSymbol changeAToAorSymbol = (ChangeAToAorSymbol)theEObject;
				T result = caseChangeAToAorSymbol(changeAToAorSymbol);
				if (result == null) result = caseOptimizationRule(changeAToAorSymbol);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS: {
				AddAlternativeSubClassToAbstractClass addAlternativeSubClassToAbstractClass = (AddAlternativeSubClassToAbstractClass)theEObject;
				T result = caseAddAlternativeSubClassToAbstractClass(addAlternativeSubClassToAbstractClass);
				if (result == null) result = caseOptimizationRule(addAlternativeSubClassToAbstractClass);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_BRACES_TO_RULE: {
				AddBracesToRule addBracesToRule = (AddBracesToRule)theEObject;
				T result = caseAddBracesToRule(addBracesToRule);
				if (result == null) result = caseOptimizationRule(addBracesToRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_LITERAL_FROM_ENUM: {
				RemoveLiteralFromEnum removeLiteralFromEnum = (RemoveLiteralFromEnum)theEObject;
				T result = caseRemoveLiteralFromEnum(removeLiteralFromEnum);
				if (result == null) result = caseOptimizationRule(removeLiteralFromEnum);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR: {
				Convert0toStarTo0toStaror1toStar convert0toStarTo0toStaror1toStar = (Convert0toStarTo0toStaror1toStar)theEObject;
				T result = caseConvert0toStarTo0toStaror1toStar(convert0toStarTo0toStaror1toStar);
				if (result == null) result = caseOptimizationRule(convert0toStarTo0toStaror1toStar);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.REMOVE_ACTION: {
				RemoveAction removeAction = (RemoveAction)theEObject;
				T result = caseRemoveAction(removeAction);
				if (result == null) result = caseOptimizationRule(removeAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.ADD_CALL_TO_OTHER_RULE: {
				AddCallToOtherRule addCallToOtherRule = (AddCallToOtherRule)theEObject;
				T result = caseAddCallToOtherRule(addCallToOtherRule);
				if (result == null) result = caseOptimizationRule(addCallToOtherRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case OptimizationrulePackage.SET_AST_PROPERTY: {
				SetAstProperty setAstProperty = (SetAstProperty)theEObject;
				T result = caseSetAstProperty(setAstProperty);
				if (result == null) result = caseOptimizationRule(setAstProperty);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Optimization Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Optimization Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptimizationRule(OptimizationRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Braces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Braces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveBraces(RemoveBraces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Keyword To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Keyword To Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddKeywordToAttr(AddKeywordToAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveKeyword(RemoveKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameKeyword(RenameKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert1to Star To Star</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert1to Star To Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert1toStarToStar(Convert1toStarToStar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert1to Star To Plus</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert1to Star To Plus</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert1toStarToPlus(Convert1toStarToPlus object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Optional Attr To Or Relation</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Optional Attr To Or Relation</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeOptionalAttrToOrRelation(ChangeOptionalAttrToOrRelation object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove XStar Attr Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove XStar Attr Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveXStarAttrKeyword(RemoveXStarAttrKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Comma</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Comma</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveComma(RemoveComma object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveLine(MoveLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveRule(RemoveRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert1 To Star To1</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert1 To Star To1</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert1ToStarTo1(Convert1ToStarTo1 object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Rule Call</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Rule Call</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveRuleCall(RemoveRuleCall object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Keyword After Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Keyword After Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddKeywordAfterKeyword(AddKeywordAfterKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Type Of Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Type Of Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeTypeOfAttr(ChangeTypeOfAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Parentheses To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Parentheses To Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddParenthesesToAttr(AddParenthesesToAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Parentheses In Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Parentheses In Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveParenthesesInAttribute(RemoveParenthesesInAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddImport(AddImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Attribute</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAttribute(RemoveAttribute object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Attr Line Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Attr Line Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAttrLineContent(ChangeAttrLineContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Rename Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Rename Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRenameRule(RenameRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Attribute Keywords</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Attribute Keywords</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAttributeKeywords(RemoveAttributeKeywords object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Optionality</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Optionality</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveOptionality(RemoveOptionality object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Braces To Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Braces To Parentheses</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeBracesToParentheses(ChangeBracesToParentheses object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Braces To Square</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Braces To Square</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeBracesToSquare(ChangeBracesToSquare object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Braces To Angle</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Braces To Angle</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeBracesToAngle(ChangeBracesToAngle object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Outermost Braces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Outermost Braces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveOutermostBraces(RemoveOutermostBraces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert1to Star To1or Star</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert1to Star To1or Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert1toStarTo1orStar(Convert1toStarTo1orStar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Braces Except Outermost</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Braces Except Outermost</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveBracesExceptOutermost(RemoveBracesExceptOutermost object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Certain Type From Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Certain Type From Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveCertainTypeFromAttr(RemoveCertainTypeFromAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Rule Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Rule Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeRuleContent(ChangeRuleContent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Called Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Called Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeCalledRule(ChangeCalledRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Comma To Other Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Comma To Other Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeCommaToOtherSymbol(ChangeCommaToOtherSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Move Attr To After Rule Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Move Attr To After Rule Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMoveAttrToAfterRuleKeyword(MoveAttrToAfterRuleKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add String To Rule Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add String To Rule Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddStringToRuleKeyword(AddStringToRuleKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Optionality To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Optionality To Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddOptionalityToAttr(AddOptionalityToAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Import</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Import</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveImport(RemoveImport object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alternative Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alternative Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAlternativeKeyword(AddAlternativeKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Optionality To Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Optionality To Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddOptionalityToKeyword(AddOptionalityToKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Braces To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Braces To Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddBracesToAttr(AddBracesToAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keyword Upper To Lower Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keyword Upper To Lower Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordUpperToLowerCase(KeywordUpperToLowerCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Square Bracket To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Square Bracket To Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSquareBracketToAttr(AddSquareBracketToAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Optionality To Outermost Braces</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Optionality To Outermost Braces</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddOptionalityToOutermostBraces(AddOptionalityToOutermostBraces object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Symbol To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Symbol To Attr</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSymbolToAttr(AddSymbolToAttr object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Primitive Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddPrimitiveType(AddPrimitiveType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Symbol To Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Symbol To Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSymbolToRule(AddSymbolToRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Keyword To Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Keyword To Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddKeywordToLine(AddKeywordToLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Parentheses Without Quotes</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Parentheses Without Quotes</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddParenthesesWithoutQuotes(AddParenthesesWithoutQuotes object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Optionality To Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Optionality To Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddOptionalityToSymbol(AddOptionalityToSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Symbol To Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Symbol To Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSymbolToLine(AddSymbolToLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Symbol Without Quote To Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Symbol Without Quote To Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSymbolWithoutQuoteToLine(AddSymbolWithoutQuoteToLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change ABto BAB</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change ABto BAB</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeABtoBAB(ChangeABtoBAB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Attr ATo Attr B</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Attr ATo Attr B</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyAttrAToAttrB(CopyAttrAToAttrB object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copy Xfrom Star To Y</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copy Xfrom Star To Y</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyXfromStarToY(CopyXfromStarToY object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert1to Star To Two</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert1to Star To Two</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert1toStarToTwo(Convert1toStarToTwo object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change ATo Optional Aor A</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change ATo Optional Aor A</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAToOptionalAorA(ChangeAToOptionalAorA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Terminal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Terminal Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddTerminalRule(AddTerminalRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Optionality To Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Optionality To Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddOptionalityToLine(AddOptionalityToLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Braces To Line</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Braces To Line</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddBracesToLine(AddBracesToLine object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Parentheses Without Quote To Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Parentheses Without Quote To Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddParenthesesWithoutQuoteToRule(AddParenthesesWithoutQuoteToRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alternative Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alternative Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAlternativeSymbol(AddAlternativeSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change AB To ABor BA</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change AB To ABor BA</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeABToABorBA(ChangeABToABorBA object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Symbol Without Quote To Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Symbol Without Quote To Keyword</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddSymbolWithoutQuoteToKeyword(AddSymbolWithoutQuoteToKeyword object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Attribute Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Attribute Multiplicity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAttributeMultiplicity(ChangeAttributeMultiplicity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Boolean Attr To Special Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Boolean Attr To Special Pattern</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeBooleanAttrToSpecialPattern(ChangeBooleanAttrToSpecialPattern object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Attribute To Single Element Or Braced List</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Attribute To Single Element Or Braced List</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAttributeToSingleElementOrBracedList(ChangeAttributeToSingleElementOrBracedList object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change Returns</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change Returns</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeReturns(ChangeReturns object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alternative Value</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alternative Value</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAlternativeValue(AddAlternativeValue object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Change ATo Aor Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Change ATo Aor Symbol</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChangeAToAorSymbol(ChangeAToAorSymbol object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Alternative Sub Class To Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Alternative Sub Class To Abstract Class</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddAlternativeSubClassToAbstractClass(AddAlternativeSubClassToAbstractClass object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Braces To Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Braces To Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddBracesToRule(AddBracesToRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Literal From Enum</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Literal From Enum</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveLiteralFromEnum(RemoveLiteralFromEnum object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Convert0to Star To0to Staror1to Star</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Convert0to Star To0to Staror1to Star</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConvert0toStarTo0toStaror1toStar(Convert0toStarTo0toStaror1toStar object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Remove Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Remove Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRemoveAction(RemoveAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Add Call To Other Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Add Call To Other Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddCallToOtherRule(AddCallToOtherRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Ast Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Ast Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetAstProperty(SetAstProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //OptimizationruleSwitch
