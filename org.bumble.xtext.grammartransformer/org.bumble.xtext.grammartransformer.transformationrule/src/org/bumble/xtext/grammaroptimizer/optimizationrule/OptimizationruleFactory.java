/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage
 * @generated
 */
public interface OptimizationruleFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptimizationruleFactory eINSTANCE = org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationruleFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Remove Braces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Braces</em>'.
	 * @generated
	 */
	RemoveBraces createRemoveBraces();

	/**
	 * Returns a new object of class '<em>Add Keyword To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Keyword To Attr</em>'.
	 * @generated
	 */
	AddKeywordToAttr createAddKeywordToAttr();

	/**
	 * Returns a new object of class '<em>Remove Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Keyword</em>'.
	 * @generated
	 */
	RemoveKeyword createRemoveKeyword();

	/**
	 * Returns a new object of class '<em>Rename Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Keyword</em>'.
	 * @generated
	 */
	RenameKeyword createRenameKeyword();

	/**
	 * Returns a new object of class '<em>Convert1to Star To Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert1to Star To Star</em>'.
	 * @generated
	 */
	Convert1toStarToStar createConvert1toStarToStar();

	/**
	 * Returns a new object of class '<em>Convert1to Star To Plus</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert1to Star To Plus</em>'.
	 * @generated
	 */
	Convert1toStarToPlus createConvert1toStarToPlus();

	/**
	 * Returns a new object of class '<em>Change Optional Attr To Or Relation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Optional Attr To Or Relation</em>'.
	 * @generated
	 */
	ChangeOptionalAttrToOrRelation createChangeOptionalAttrToOrRelation();

	/**
	 * Returns a new object of class '<em>Remove XStar Attr Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove XStar Attr Keyword</em>'.
	 * @generated
	 */
	RemoveXStarAttrKeyword createRemoveXStarAttrKeyword();

	/**
	 * Returns a new object of class '<em>Remove Comma</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Comma</em>'.
	 * @generated
	 */
	RemoveComma createRemoveComma();

	/**
	 * Returns a new object of class '<em>Move Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Line</em>'.
	 * @generated
	 */
	MoveLine createMoveLine();

	/**
	 * Returns a new object of class '<em>Remove Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Rule</em>'.
	 * @generated
	 */
	RemoveRule createRemoveRule();

	/**
	 * Returns a new object of class '<em>Convert1 To Star To1</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert1 To Star To1</em>'.
	 * @generated
	 */
	Convert1ToStarTo1 createConvert1ToStarTo1();

	/**
	 * Returns a new object of class '<em>Remove Rule Call</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Rule Call</em>'.
	 * @generated
	 */
	RemoveRuleCall createRemoveRuleCall();

	/**
	 * Returns a new object of class '<em>Add Keyword After Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Keyword After Keyword</em>'.
	 * @generated
	 */
	AddKeywordAfterKeyword createAddKeywordAfterKeyword();

	/**
	 * Returns a new object of class '<em>Change Type Of Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Type Of Attr</em>'.
	 * @generated
	 */
	ChangeTypeOfAttr createChangeTypeOfAttr();

	/**
	 * Returns a new object of class '<em>Add Parentheses To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Parentheses To Attr</em>'.
	 * @generated
	 */
	AddParenthesesToAttr createAddParenthesesToAttr();

	/**
	 * Returns a new object of class '<em>Remove Parentheses In Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Parentheses In Attribute</em>'.
	 * @generated
	 */
	RemoveParenthesesInAttribute createRemoveParenthesesInAttribute();

	/**
	 * Returns a new object of class '<em>Add Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Import</em>'.
	 * @generated
	 */
	AddImport createAddImport();

	/**
	 * Returns a new object of class '<em>Remove Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Attribute</em>'.
	 * @generated
	 */
	RemoveAttribute createRemoveAttribute();

	/**
	 * Returns a new object of class '<em>Change Attr Line Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Attr Line Content</em>'.
	 * @generated
	 */
	ChangeAttrLineContent createChangeAttrLineContent();

	/**
	 * Returns a new object of class '<em>Rename Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Rule</em>'.
	 * @generated
	 */
	RenameRule createRenameRule();

	/**
	 * Returns a new object of class '<em>Remove Attribute Keywords</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Attribute Keywords</em>'.
	 * @generated
	 */
	RemoveAttributeKeywords createRemoveAttributeKeywords();

	/**
	 * Returns a new object of class '<em>Remove Optionality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Optionality</em>'.
	 * @generated
	 */
	RemoveOptionality createRemoveOptionality();

	/**
	 * Returns a new object of class '<em>Change Braces To Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Braces To Parentheses</em>'.
	 * @generated
	 */
	ChangeBracesToParentheses createChangeBracesToParentheses();

	/**
	 * Returns a new object of class '<em>Change Braces To Square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Braces To Square</em>'.
	 * @generated
	 */
	ChangeBracesToSquare createChangeBracesToSquare();

	/**
	 * Returns a new object of class '<em>Change Braces To Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Braces To Angle</em>'.
	 * @generated
	 */
	ChangeBracesToAngle createChangeBracesToAngle();

	/**
	 * Returns a new object of class '<em>Remove Outermost Braces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Outermost Braces</em>'.
	 * @generated
	 */
	RemoveOutermostBraces createRemoveOutermostBraces();

	/**
	 * Returns a new object of class '<em>Convert1to Star To1or Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert1to Star To1or Star</em>'.
	 * @generated
	 */
	Convert1toStarTo1orStar createConvert1toStarTo1orStar();

	/**
	 * Returns a new object of class '<em>Remove Braces Except Outermost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Braces Except Outermost</em>'.
	 * @generated
	 */
	RemoveBracesExceptOutermost createRemoveBracesExceptOutermost();

	/**
	 * Returns a new object of class '<em>Remove Certain Type From Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Certain Type From Attr</em>'.
	 * @generated
	 */
	RemoveCertainTypeFromAttr createRemoveCertainTypeFromAttr();

	/**
	 * Returns a new object of class '<em>Change Rule Content</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Rule Content</em>'.
	 * @generated
	 */
	ChangeRuleContent createChangeRuleContent();

	/**
	 * Returns a new object of class '<em>Change Called Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Called Rule</em>'.
	 * @generated
	 */
	ChangeCalledRule createChangeCalledRule();

	/**
	 * Returns a new object of class '<em>Change Comma To Other Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Comma To Other Symbol</em>'.
	 * @generated
	 */
	ChangeCommaToOtherSymbol createChangeCommaToOtherSymbol();

	/**
	 * Returns a new object of class '<em>Move Attr To After Rule Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Move Attr To After Rule Keyword</em>'.
	 * @generated
	 */
	MoveAttrToAfterRuleKeyword createMoveAttrToAfterRuleKeyword();

	/**
	 * Returns a new object of class '<em>Add String To Rule Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add String To Rule Keyword</em>'.
	 * @generated
	 */
	AddStringToRuleKeyword createAddStringToRuleKeyword();

	/**
	 * Returns a new object of class '<em>Add Optionality To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Attr</em>'.
	 * @generated
	 */
	AddOptionalityToAttr createAddOptionalityToAttr();

	/**
	 * Returns a new object of class '<em>Remove Import</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Import</em>'.
	 * @generated
	 */
	RemoveImport createRemoveImport();

	/**
	 * Returns a new object of class '<em>Add Alternative Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alternative Keyword</em>'.
	 * @generated
	 */
	AddAlternativeKeyword createAddAlternativeKeyword();

	/**
	 * Returns a new object of class '<em>Add Optionality To Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Keyword</em>'.
	 * @generated
	 */
	AddOptionalityToKeyword createAddOptionalityToKeyword();

	/**
	 * Returns a new object of class '<em>Add Braces To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Braces To Attr</em>'.
	 * @generated
	 */
	AddBracesToAttr createAddBracesToAttr();

	/**
	 * Returns a new object of class '<em>Keyword Upper To Lower Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Keyword Upper To Lower Case</em>'.
	 * @generated
	 */
	KeywordUpperToLowerCase createKeywordUpperToLowerCase();

	/**
	 * Returns a new object of class '<em>Add Square Bracket To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Square Bracket To Attr</em>'.
	 * @generated
	 */
	AddSquareBracketToAttr createAddSquareBracketToAttr();

	/**
	 * Returns a new object of class '<em>Add Optionality To Outermost Braces</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Outermost Braces</em>'.
	 * @generated
	 */
	AddOptionalityToOutermostBraces createAddOptionalityToOutermostBraces();

	/**
	 * Returns a new object of class '<em>Add Symbol To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Symbol To Attr</em>'.
	 * @generated
	 */
	AddSymbolToAttr createAddSymbolToAttr();

	/**
	 * Returns a new object of class '<em>Add Primitive Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Primitive Type</em>'.
	 * @generated
	 */
	AddPrimitiveType createAddPrimitiveType();

	/**
	 * Returns a new object of class '<em>Add Symbol To Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Symbol To Rule</em>'.
	 * @generated
	 */
	AddSymbolToRule createAddSymbolToRule();

	/**
	 * Returns a new object of class '<em>Add Keyword To Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Keyword To Line</em>'.
	 * @generated
	 */
	AddKeywordToLine createAddKeywordToLine();

	/**
	 * Returns a new object of class '<em>Add Parentheses Without Quotes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Parentheses Without Quotes</em>'.
	 * @generated
	 */
	AddParenthesesWithoutQuotes createAddParenthesesWithoutQuotes();

	/**
	 * Returns a new object of class '<em>Add Optionality To Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Symbol</em>'.
	 * @generated
	 */
	AddOptionalityToSymbol createAddOptionalityToSymbol();

	/**
	 * Returns a new object of class '<em>Add Symbol To Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Symbol To Line</em>'.
	 * @generated
	 */
	AddSymbolToLine createAddSymbolToLine();

	/**
	 * Returns a new object of class '<em>Add Symbol Without Quote To Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Symbol Without Quote To Line</em>'.
	 * @generated
	 */
	AddSymbolWithoutQuoteToLine createAddSymbolWithoutQuoteToLine();

	/**
	 * Returns a new object of class '<em>Change ABto BAB</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change ABto BAB</em>'.
	 * @generated
	 */
	ChangeABtoBAB createChangeABtoBAB();

	/**
	 * Returns a new object of class '<em>Copy Attr ATo Attr B</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Attr ATo Attr B</em>'.
	 * @generated
	 */
	CopyAttrAToAttrB createCopyAttrAToAttrB();

	/**
	 * Returns a new object of class '<em>Copy Xfrom Star To Y</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Copy Xfrom Star To Y</em>'.
	 * @generated
	 */
	CopyXfromStarToY createCopyXfromStarToY();

	/**
	 * Returns a new object of class '<em>Convert1to Star To Two</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert1to Star To Two</em>'.
	 * @generated
	 */
	Convert1toStarToTwo createConvert1toStarToTwo();

	/**
	 * Returns a new object of class '<em>Change ATo Optional Aor A</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change ATo Optional Aor A</em>'.
	 * @generated
	 */
	ChangeAToOptionalAorA createChangeAToOptionalAorA();

	/**
	 * Returns a new object of class '<em>Add Terminal Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Terminal Rule</em>'.
	 * @generated
	 */
	AddTerminalRule createAddTerminalRule();

	/**
	 * Returns a new object of class '<em>Add Optionality To Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Line</em>'.
	 * @generated
	 */
	AddOptionalityToLine createAddOptionalityToLine();

	/**
	 * Returns a new object of class '<em>Add Braces To Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Braces To Line</em>'.
	 * @generated
	 */
	AddBracesToLine createAddBracesToLine();

	/**
	 * Returns a new object of class '<em>Add Parentheses Without Quote To Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Parentheses Without Quote To Rule</em>'.
	 * @generated
	 */
	AddParenthesesWithoutQuoteToRule createAddParenthesesWithoutQuoteToRule();

	/**
	 * Returns a new object of class '<em>Add Alternative Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alternative Symbol</em>'.
	 * @generated
	 */
	AddAlternativeSymbol createAddAlternativeSymbol();

	/**
	 * Returns a new object of class '<em>Change AB To ABor BA</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change AB To ABor BA</em>'.
	 * @generated
	 */
	ChangeABToABorBA createChangeABToABorBA();

	/**
	 * Returns a new object of class '<em>Add Symbol Without Quote To Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Symbol Without Quote To Keyword</em>'.
	 * @generated
	 */
	AddSymbolWithoutQuoteToKeyword createAddSymbolWithoutQuoteToKeyword();

	/**
	 * Returns a new object of class '<em>Change Attribute Multiplicity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Attribute Multiplicity</em>'.
	 * @generated
	 */
	ChangeAttributeMultiplicity createChangeAttributeMultiplicity();

	/**
	 * Returns a new object of class '<em>Change Boolean Attr To Special Pattern</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Boolean Attr To Special Pattern</em>'.
	 * @generated
	 */
	ChangeBooleanAttrToSpecialPattern createChangeBooleanAttrToSpecialPattern();

	/**
	 * Returns a new object of class '<em>Change Attribute To Single Element Or Braced List</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Attribute To Single Element Or Braced List</em>'.
	 * @generated
	 */
	ChangeAttributeToSingleElementOrBracedList createChangeAttributeToSingleElementOrBracedList();

	/**
	 * Returns a new object of class '<em>Change Returns</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Returns</em>'.
	 * @generated
	 */
	ChangeReturns createChangeReturns();

	/**
	 * Returns a new object of class '<em>Add Alternative Value</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alternative Value</em>'.
	 * @generated
	 */
	AddAlternativeValue createAddAlternativeValue();

	/**
	 * Returns a new object of class '<em>Change ATo Aor Symbol</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change ATo Aor Symbol</em>'.
	 * @generated
	 */
	ChangeAToAorSymbol createChangeAToAorSymbol();

	/**
	 * Returns a new object of class '<em>Add Alternative Sub Class To Abstract Class</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alternative Sub Class To Abstract Class</em>'.
	 * @generated
	 */
	AddAlternativeSubClassToAbstractClass createAddAlternativeSubClassToAbstractClass();

	/**
	 * Returns a new object of class '<em>Add Braces To Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Braces To Rule</em>'.
	 * @generated
	 */
	AddBracesToRule createAddBracesToRule();

	/**
	 * Returns a new object of class '<em>Remove Literal From Enum</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Literal From Enum</em>'.
	 * @generated
	 */
	RemoveLiteralFromEnum createRemoveLiteralFromEnum();

	/**
	 * Returns a new object of class '<em>Convert0to Star To0to Staror1to Star</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Convert0to Star To0to Staror1to Star</em>'.
	 * @generated
	 */
	Convert0toStarTo0toStaror1toStar createConvert0toStarTo0toStaror1toStar();

	/**
	 * Returns a new object of class '<em>Remove Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Action</em>'.
	 * @generated
	 */
	RemoveAction createRemoveAction();

	/**
	 * Returns a new object of class '<em>Add Call To Other Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Call To Other Rule</em>'.
	 * @generated
	 */
	AddCallToOtherRule createAddCallToOtherRule();

	/**
	 * Returns a new object of class '<em>Set Ast Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Ast Property</em>'.
	 * @generated
	 */
	SetAstProperty createSetAstProperty();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	OptimizationrulePackage getOptimizationrulePackage();

} //OptimizationruleFactory
