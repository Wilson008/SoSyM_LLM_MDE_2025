/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl;
import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerPackage
 * @generated
 */
public interface GrammaroptimizerFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammaroptimizerFactory eINSTANCE = org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Remove Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Bracket</em>'.
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
	 * Returns a new object of class '<em>Change Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Keyword</em>'.
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
	 * Returns a new object of class '<em>Change Opt Of Attr To Or In Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Opt Of Attr To Or In Rule</em>'.
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
	 * Returns a new object of class '<em>Add Alternative Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Alternative Keyword</em>'.
	 * @generated
	 */
	AddAlternativeKeyword createAddAlternativeKeyword();

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
	 * Returns a new object of class '<em>Remove Parentheses In Specified Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Parentheses In Specified Attr</em>'.
	 * @generated
	 */
	RemoveParenthesesInAttribute createRemoveParenthesesInSpecifiedAttr();

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
	 * Returns a new object of class '<em>Rename Rule/em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Rename Rule</em>'.
	 * @generated
	 */
	RenameRule createRenameRule();

	/**
	 * Returns a new object of class '<em>Remove Keywords Of All Attrs</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Keywords Of All Attrs</em>'.
	 * @generated
	 */
	RemoveAttributeKeywords createRemoveKeywordsOfAllAttrs();

	/**
	 * Returns a new object of class '<em>Remove Optionality</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Optionality</em>'.
	 * @generated
	 */
	RemoveOptionality createRemoveOptionality();

	/**
	 * Returns a new object of class '<em>Change Bracket To Parentheses</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Bracket To Parentheses</em>'.
	 * @generated
	 */
	ChangeBracesToParentheses createChangeBracesToParentheses();

	/**
	 * Returns a new object of class '<em>Change Bracket To Square</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Bracket To Square</em>'.
	 * @generated
	 */
	ChangeBracesToSquare createChangeBracesToSquare();

	/**
	 * Returns a new object of class '<em>Change Bracket To Angle</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Change Bracket To Angle</em>'.
	 * @generated
	 */
	ChangeBracesToAngle createChangeBracesToAngle();

	/**
	 * Returns a new object of class '<em>Remove Outer Most Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Outer Most Bracket</em>'.
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
	 * Returns a new object of class '<em>Remove Bracket Except Outermost</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Remove Bracket Except Outermost</em>'.
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
	 * Returns a new object of class '<em>Add Keyword After Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Keyword After Keyword</em>'.
	 * @generated
	 */
	AddKeywordAfterKeyword createAddKeywordAfterKeyword();

	/**
	 * Returns a new object of class '<em>Add Optionality To Keyword</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Keyword</em>'.
	 * @generated
	 */
	AddOptionalityToKeyword createAddOptionalityToKeyword();

	/**
	 * Returns a new object of class '<em>Add Bracket To Attr</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Bracket To Attr</em>'.
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
	 * Returns a new object of class '<em>Add Optionality To Outer Most Bracket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Optionality To Outer Most Bracket</em>'.
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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package org.bumble.xtext.grammaroptimizer.optimizationrule by this factory.
	 * @generated
	 */
	GrammaroptimizerPackage getGrammaroptimizerPackage();

	/**
	 * Returns a new object of class '<em>Add Parentheses Without Quotes</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Add Parentheses Without Quotes</em>'.
	 * @generated
	 */
	AddParenthesesWithoutQuotes createAddParenthesesWithoutQuotes();

} //GrammaroptimizerFactory
