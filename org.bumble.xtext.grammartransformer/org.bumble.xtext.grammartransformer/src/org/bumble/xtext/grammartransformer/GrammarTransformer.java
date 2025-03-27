package org.bumble.xtext.grammartransformer;

import java.util.List;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarImpl;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.GrammarRuleHelper;
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
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeToSingleElementOrBracedList;
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
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationruleFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword;
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

/**
* The GrammarOptimizer.java implements all the optimization rules
* for optimizing the generated grammar. Once an Xtext grammar is
* generated from an Ecore metamodel, it could be optimized by being
* modified (or so to say "adapted").
*
* @author  Weixing Zhang
* @version 1.0
* @since   2022-01-01 
*/
public class GrammarTransformer {

	private Grammar grammar = new GrammarImpl();

	/**
	* This method is used to splice all the grammar rules into a
	* complete grammar, i.e. one string. While before being spliced, 
	* each grammar rule consists of several lines of strings.
	* @param 
	* @return String This returns the complete grammar string which
	* is spliced with all the grammar rules in the grammar. 
	*/
	public String spliceGrammar() {
		if (grammar == null)
			return null;
		// splice lines of strings into one string
		String strFinal = "";
		for (int i = 0; i < grammar.getRules().size(); i++) {
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				// We should remove the empty lines within a rule
				if (grammar.getRules().get(i).getLines().get(j).getLineContent().isEmpty()
						|| grammar.getRules().get(i).getLines().get(j).getLineContent().equals("\t")
						|| grammar.getRules().get(i).getLines().get(j).getLineContent().equals("\\s*"))
					continue;

				// make sure every line of text will be written in a new line
				strFinal += grammar.getRules().get(i).getLines().get(j).getLineContent() + System.lineSeparator();
			}

			// there should be an empty line between two rules
			strFinal += System.lineSeparator();
		}

		return strFinal;
	}

	/**
	* This method is used to check whether a grammar rule contains
	* an attribute - shortName. If it does, return true, otherwise
	* return false.
	* @param grammarRule a grammar rule (i.e., rule with its attributes)
	* @return boolean This returns the result of check.
	*/
	public boolean hasShortName(GrammarRule grammarRule) {
		for (LineEntry line : grammarRule.getLines()) {
			String lineContent = line.getLineContent();

			if (RegexHelper.doesStringExist(lineContent, "shortName"))
				return true;
		}

		return false;
	}

	/**
	* This method is used to divide the grammar text into a group of 
	* grammar rules, and each of them contains many lines of strings,
	* and some of the lines are actually attributes.
	* (The grammar was read from the *.xtext file in the form of a 
	* big string)
	* @param strRaw This param means the string read from the grammar file.
	* @return boolean This returns the result of processing, i.e., it returns
	* true when it success, otherwise it returns false.
	*/
	public boolean processGrammar(String strRaw) {
		grammar = GrammarRuleHelper.processGrammar(grammar, strRaw);
		return true;
	}

	/**
	* There would be one or more lines are empty, so this method is used to remove
	* all the empty lines in a grammar rule.
	* @param grammarRule This the data structure of a grammar rule.
	* @return boolean This returns the result of removing the empty lines.
	*/
	public boolean removeEmptyLine(GrammarRuleImpl grammarRule) {
		if (grammarRule == null || grammarRule.getLines().size() == 0)
			return true;

		for (int i = grammarRule.getLines().size() - 1; i >= 0; i--) {
			if (grammarRule.getLines().get(i).getLineContent() == null) {
				grammarRule.getLines().remove(i);
			}
		}
		return true;
	}

	/**
	* This method is used to get the object of a grammar.
	* @return Grammar This returns the whole grammar.
	*/
	public Grammar getGrammar() {
		return this.grammar;
	}

	/**
	* This method is used to add braces to a specified attribute or
	* multiple specified attributes in the form of placing a pair of '{' '}'
	* in both side of the attribute expression.
	* @param grammarRule specifies which grammar rule to work on.
	* @param attrName specifies which attribute to work on.
	*/
	public void addBracesToAttr(String grammarRule, String attrName) {
		AddBracesToAttr addBracesToAttr = GrammaroptimizerFactory.eINSTANCE.createAddBracesToAttr();
		addBracesToAttr.setGrammar(grammar);
		addBracesToAttr.setGrammarRule(grammarRule);
		addBracesToAttr.setAttrName(attrName);
		addBracesToAttr.apply();
	}
	
	/**
	* This method is used to add braces to a specified rule or multiple 
	* specified rules in the form of placing an opening bracket '{' at the beginning 
	* of the grammar rule and an closing bracket '}' at the ending of the grammar rule.
	* @param ruleName specifies which grammar rule the operation will work on.
	*/
	public void addBracesToRule(String ruleName) {
		AddBracesToRule addBracesToRule = OptimizationruleFactory.eINSTANCE.createAddBracesToRule();
		addBracesToRule.setGrammar(grammar);
		addBracesToRule.setGrammarRule(ruleName);
		addBracesToRule.setAttrName(null);
		addBracesToRule.apply();
	}

	/**
	 * Adds a call to another rule to the very beginning of the specified rule.
	 * @param grammarRule the rule to which to add the rule call
	 * @param nameOfOtherRule the name of the rule to be called
	 * @param callRequired indicates whether the new rule must be called or if it adds an alternative
	 */
	public void addCallToOtherRule(String grammarRule, String nameOfOtherRule, boolean callRequired) {
		AddCallToOtherRule addCallToOtherRule = OptimizationruleFactory.eINSTANCE.createAddCallToOtherRule();
		addCallToOtherRule.setGrammar(grammar);
		addCallToOtherRule.setGrammarRule(grammarRule);
		addCallToOtherRule.setNameOfOtherClass(nameOfOtherRule);
		addCallToOtherRule.setCallRequired(callRequired);
		addCallToOtherRule.setAttrName(null);
		addCallToOtherRule.apply();
	}
	/**
	* This method is used to add an import to the whole grammar.
	* @param importString the import to add
	*/
	public void addImport(String importString, String nickName) {
		AddImport addImport = GrammaroptimizerFactory.eINSTANCE.createAddImport();
		addImport.setGrammar(grammar);
		addImport.setNewImport(importString);
		addImport.setNickName(nickName);
		addImport.apply();
	}

	/**
	 * This method is used to add a keyword to an attribute. It transforms
	 * <code>(attrA=typeA)?</code> to <code>('keywordA' attrA=typeA)?</code>.
	 * 
	 * @param grammarRule: specifies the rule on which to apply this action. 
	 * @param attrName: specifies the attribute on which to apply this action. 
	 * @param newKeyword: the new keyword to add
	 * @param isHead: Will the new keyword be added to the front or the end of the the attribute? 
	 * @see #addKeywordToLine(String, String, String, boolean)
	 */
	public void addKeywordToAttr(String grammarRule, String attrName, String newKeyword, boolean isHead) {
		AddKeywordToAttr addKeywordToAttr = GrammaroptimizerFactory.eINSTANCE.createAddKeywordToAttr();
		addKeywordToAttr.setGrammar(grammar);
		addKeywordToAttr.setGrammarRule(grammarRule);
		addKeywordToAttr.setAttrName(attrName);
		addKeywordToAttr.setNewKeyword(newKeyword);
		addKeywordToAttr.setIsHead(isHead);
		addKeywordToAttr.apply();
	}

	/**
	* This method is used to add an alternative to an existing keyword, for example: 'A' to 'A' | 'B'
	* @param grammarRule specifies the rule on which to apply this action.
	* @param attrName specifies the attribute on which to apply this action.
	* @param currentKeyword specifies the existing keyword to which an alternative keyword should be added.
	* @param newKeyword specifies the alternative keyword to add.
	*/
	public void addAlternativeKeyword(String grammarRule, String attrName, String currentKeyword, String newKeyword) {
		AddAlternativeKeyword addAlternativeKeyword = GrammaroptimizerFactory.eINSTANCE.createAddAlternativeKeyword();
		addAlternativeKeyword.setGrammar(grammar);
		addAlternativeKeyword.setGrammarRule(grammarRule);
		addAlternativeKeyword.setAttrName(attrName);
		addAlternativeKeyword.setCurrentKeyword(currentKeyword);
		addAlternativeKeyword.setNewKeyword(newKeyword);
		addAlternativeKeyword.apply();
	}
	
	/**
	* This method is used to add an alternative symbol to an existing symbol, for example,
	* ';' to ';' | ','
	* @param grammarRule specifies the rule on which to apply this action.
	* @param attrName specifies the attribute on which to apply this action.
	* @param currentSymbol specifies the existing symbol to which an alternative symbol should be added.
	* @param newSymbol specifies the alternative symbol to add.
	*/
	public void addAlternativeSymbol(String grammarRule, String attrName, String currentSymbol, String newSymbol) {
		AddAlternativeSymbol addAlternativeSymbol = OptimizationruleFactory.eINSTANCE.createAddAlternativeSymbol();
		addAlternativeSymbol.setGrammar(grammar);
		addAlternativeSymbol.setGrammarRule(grammarRule);
		addAlternativeSymbol.setAttrName(attrName);
		addAlternativeSymbol.setCurrentSymbol(currentSymbol);
		addAlternativeSymbol.setNewSymbol(newSymbol);
		addAlternativeSymbol.apply();
	}
	
	/**
	* This method is used to add an alternative symbol to a grammar rule, for example:
	* previous: <code>A returns A: B='b' | C = 'c'</code>,
	* after:    <code>A returns A: B='b' | C = 'c' | D = 'd'</code>
	* @param ruleName specifies the rule  on which to apply this action.
	* @param attrName specifies the attribute on which to apply this action.
	* @param newValues the new values to add.
	* @param isEnum indicates whether the rule is an enumeration.
	*/
	public void addAlternativeValue(String ruleName, String attrName, List<String> newValues, boolean isEnum) {
		AddAlternativeValue addAlternativeValue = OptimizationruleFactory.eINSTANCE.createAddAlternativeValue();
		addAlternativeValue.setGrammar(grammar);
		addAlternativeValue.setGrammarRule(ruleName);
		addAlternativeValue.setAttrName(attrName);
		addAlternativeValue.setIsEnum(isEnum);
		if (newValues != null)
			addAlternativeValue.getNewValue().addAll(newValues);
		addAlternativeValue.apply();
	}
	
	/**
	* This method is used to add an alternative subclass to a grammar rule
	* (a grammar rule is actually a class in the meta-model).
	* @param ruleName specifies the rule to add an alternative subclass to.
	* @param newAlternativeSubClass the subclass to add.
	*/
	public void addAlternativeSubClassToAbstractClass(String ruleName, String newAlternativeSubClass) {
		AddAlternativeSubClassToAbstractClass addAlternativeSubClassToAbstractClass = OptimizationruleFactory.eINSTANCE.createAddAlternativeSubClassToAbstractClass();
		addAlternativeSubClassToAbstractClass.setGrammar(grammar);
		addAlternativeSubClassToAbstractClass.setGrammarRule(ruleName);
		addAlternativeSubClassToAbstractClass.setAttrName(null);
		addAlternativeSubClassToAbstractClass.setNewAlternativeSubClass(newAlternativeSubClass);
		addAlternativeSubClassToAbstractClass.apply();
	}

	/**
	* This method is used to add a keyword to a specified line or lines. It transforms
	* <code>(attrA=typeA)?</code> to <code>'keywordA' (attrA=typeA)?</code>.
	* @param grammarRule specifies which rule on which to apply this action.
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param newKeyword specifies the keyword to add.
	* @param isHead specifies where to add the keyword: <code>true</code> means "to the front of the line"
	* while <code>false</code> means "to the end of the line".
	* @see #addKeywordToAttr(String, String, String, boolean)
	*/
	public void addKeywordToLine(String grammarRule, String attrName, String newKeyword, boolean isHead) {
		AddKeywordToLine addKeywordToLine = GrammaroptimizerFactory.eINSTANCE.createAddKeywordToLine();
		addKeywordToLine.setGrammar(grammar);
		addKeywordToLine.setGrammarRule(grammarRule);
		addKeywordToLine.setAttrName(attrName);
		addKeywordToLine.setIsHead(isHead);
		addKeywordToLine.setNewKeyword(newKeyword);
		addKeywordToLine.apply();
	}

	/**
	* This method is used to make an attribute be optional, i.e. from attr=Type to (attr=Type)?
	* @param grammarRule specifies which grammar rule to apply this action to
	* @param attrName specifies the line that contains the specified attribute
	*/
	public void addOptionalityToAttr(String grammarRule, String attrName) {
		AddOptionalityToAttr addOptionalityToAttr = GrammaroptimizerFactory.eINSTANCE.createAddOptionalityToAttr();
		addOptionalityToAttr.setGrammar(grammar);
		addOptionalityToAttr.setGrammarRule(grammarRule);
		addOptionalityToAttr.setAttrName(attrName);
		addOptionalityToAttr.apply();
	}

	/**
	* This method is used to make a specified keyword be optional.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName  specifies the name of the attribute that marks the line to which to apply this action
	* @param keyword If there are many keywords in the same line, then this specifies the keyword.
	*/
	public void addOptionalityToKeyword(String grammarRule, String attrName, String keyword) {
		AddOptionalityToKeyword addOptionalityToKeyword = GrammaroptimizerFactory.eINSTANCE
				.createAddOptionalityToKeyword();
		addOptionalityToKeyword.setGrammar(grammar);
		addOptionalityToKeyword.setGrammarRule(grammarRule);
		addOptionalityToKeyword.setAttrName(attrName);
		addOptionalityToKeyword.setKeyword(keyword);
		addOptionalityToKeyword.apply();
	}
	
	/**
	* This method is used to make a specified line optional (the whole line).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	*/
	public void addOptionalityToLine(String grammarRule, String attrName) {
		AddOptionalityToLine addOptionalityToLine = OptimizationruleFactory.eINSTANCE.createAddOptionalityToLine();
		addOptionalityToLine.setGrammar(grammar);
		addOptionalityToLine.setGrammarRule(grammarRule);
		addOptionalityToLine.setAttrName(attrName);
		addOptionalityToLine.apply();
	}

	/**
	* This method has four alternative functions depending on the provided multiplicity key:
	* 	1) add ()  to the outside of the container brackets.
	* 	2) add ()? to the outside of the container brackets.
	* 	3) add ()* to the outside of the container brackets.
	* 	4) add ()+ to the outside of the container brackets.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param multiplicity specifies which concrete operation the method will do
	*/
	public void addOptionalityToContainerBraces(String grammarRule, MultiplicityKey multiplicity) {
		AddOptionalityToOutermostBraces addOptionalityToOutermostBracket = GrammaroptimizerFactory.eINSTANCE
				.createAddOptionalityToOutermostBraces();
		addOptionalityToOutermostBracket.setGrammar(grammar);
		addOptionalityToOutermostBracket.setGrammarRule(grammarRule);
		addOptionalityToOutermostBracket.setAttrName(null);
		addOptionalityToOutermostBracket.setMultiplicity(multiplicity);
		addOptionalityToOutermostBracket.apply();
	}
	
	/**
	* This method is used to make a specified symbol optional.
	* @param grammarRulespecifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param targetSymbol specifies which concrete symbol will be made optional.
	*/
	public void addOptionalityToSymbol(String grammarRule, String attrName, String targetSymbol) {
		AddOptionalityToSymbol addOptionalityToSymbol = OptimizationruleFactory.eINSTANCE.createAddOptionalityToSymbol();
		addOptionalityToSymbol.setGrammar(grammar);
		addOptionalityToSymbol.setGrammarRule(grammarRule);
		addOptionalityToSymbol.setAttrName(attrName);
		addOptionalityToSymbol.setTargetSymbol(targetSymbol);
		addOptionalityToSymbol.apply();
	}

	/**
	 * This method is used to add () or ()? or ()* or ()+ without quote to a keyword or a line.
	 * @param grammarRule specifies which grammar rule aimed to apply this action to
	 * @param scope Do you want to add () to a keyword or a line (containing a specified attribute
	 * @param keyword the keyword that you want to do this operation.
	 * @param attrName specifies the name of the attribute that marks the line to which to apply this action
	 * @param multiplicity specifies which operation will the method do: to add ()/()?/()* or ()+?
	 */
	public void addParenthesesWithoutQuotes(String grammarRule, ScopeKey scope, String keyword, String attrName, MultiplicityKey multiplicity) {
		AddParenthesesWithoutQuotes addParenthesesWithoutQuotes = GrammaroptimizerFactory.eINSTANCE
				.createAddParenthesesWithoutQuotes();
		addParenthesesWithoutQuotes.setGrammar(grammar);
		addParenthesesWithoutQuotes.setGrammarRule(grammarRule);
		addParenthesesWithoutQuotes.setScope(scope);
		addParenthesesWithoutQuotes.setKeyword(keyword);
		addParenthesesWithoutQuotes.setAttrName(attrName);
		addParenthesesWithoutQuotes.setMultiplicity(multiplicity);
		addParenthesesWithoutQuotes.apply();
	}
	
	/**
	* This method is used to add () or ()? or ()* or ()+ without quote to a specified grammar rule, i.e.
	* to the outside of the container brackets.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param multiplicity specifies what will be added to the specified grammar rule: ()/()?/()* or ()+
	*/
	public void addParenthesesWithoutQuoteToRule(String grammarRule, MultiplicityKey multiplicity) {
		AddParenthesesWithoutQuoteToRule addParenthesesWithoutQuoteToRule = OptimizationruleFactory.eINSTANCE.createAddParenthesesWithoutQuoteToRule();
		addParenthesesWithoutQuoteToRule.setGrammar(grammar);
		addParenthesesWithoutQuoteToRule.setGrammarRule(grammarRule);
		addParenthesesWithoutQuoteToRule.setAttrName(null);
		addParenthesesWithoutQuoteToRule.setMultiplicity(multiplicity);
		addParenthesesWithoutQuoteToRule.apply();
	}

	/**
	* This method is used to add a pair of parentheses to the specifies attribute
	* (i.e., like attr=Type expression).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies to which attribute parentheses should be added.
	*/
	public void addParenthesesToAttr(String grammarRule, String attrName) {
		AddParenthesesToAttr addParenthesesToAttr = GrammaroptimizerFactory.eINSTANCE.createAddParenthesesToAttr();
		addParenthesesToAttr.setGrammar(grammar);
		addParenthesesToAttr.setGrammarRule(grammarRule);
		addParenthesesToAttr.setAttrName(attrName);
		addParenthesesToAttr.apply();
	}
	
	/**
	* This method is used to add a pair of brackets, i.e., '{' and '}' to a specified line.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	*/
	public void addBracesToLine(String grammarRule, String attrName) {
		AddBracesToLine addBracketToLine = OptimizationruleFactory.eINSTANCE.createAddBracesToLine();
		addBracketToLine.setGrammar(grammar);
		addBracketToLine.setGrammarRule(grammarRule);
		addBracketToLine.setAttrName(attrName);
		addBracketToLine.apply();
	}

	/**
	* This method is used to add a totally new grammar rule which is a primitive type, for example, 
	* the definition for EString.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param metaClass specifies the metaClass (it is in the form of returns <class name>).
	* @param body the body of the newly added rule (multiply lines are connected by using <code>\n</code>.
	* @param annotation the annotation to put before the rule 
	*/
	public void addPrimitiveType(String grammarRule, String metaClass, String body, String annotation) {
		AddPrimitiveType addPrimitiveType = GrammaroptimizerFactory.eINSTANCE.createAddPrimitiveType();
		addPrimitiveType.setGrammar(grammar);
		addPrimitiveType.setGrammarRule(grammarRule);
		addPrimitiveType.setMetaclass(metaClass);
		addPrimitiveType.setBody(body);
		addPrimitiveType.setAnnotation(annotation);
		addPrimitiveType.apply();
	}

	/**
	* This method is used to add '[' and ']' to a specified attribute.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies which attribute aimed to be added with the square brackets.
	*/
	public void addSquareBracketToAttr(String grammarRule, String attrName) {
		AddSquareBracketToAttr addSquareBracketToAttr = GrammaroptimizerFactory.eINSTANCE
				.createAddSquareBracketToAttr();
		addSquareBracketToAttr.setGrammar(grammar);
		addSquareBracketToAttr.setGrammarRule(grammarRule);
		addSquareBracketToAttr.setAttrName(attrName);
		addSquareBracketToAttr.apply();
	}

	/**
	 * There is usually a keyword with the same name as the name of the rule. This
	 * method is used to add an extra string to this kind of keyword.
	 * @param grammarRule specifies which grammar rule aimed to apply this action to
	 * @param targetAttribute: this value is actually an attribute name, when it gets a
	 * non-null value, it will check if the grammar rule has this attribute, and
	 * then the method will be executed only when the attribute exists. 
	 * @param addedString: what string will you add to the rule keyword (here we call the rule which has
	 * the same text with the grammar rule name "rule keyword"
	 * @param isHead specifies where to add the string, before the keyword or after the keyword
	 * (anyway, the added string and the existing keyword will be connected).
	 */
	public void addStringToRuleKeyword(String grammarRule, String targetAttribute,
			String addedString, boolean isHead) {
		AddStringToRuleKeyword addStringToRuleKeyword = GrammaroptimizerFactory.eINSTANCE
				.createAddStringToRuleKeyword();
		addStringToRuleKeyword.setGrammar(grammar);
		addStringToRuleKeyword.setGrammarRule(grammarRule);
		addStringToRuleKeyword.setAttrName(null);
		addStringToRuleKeyword.setAddedString(addedString);
		addStringToRuleKeyword.setIsHead(isHead);
		addStringToRuleKeyword.setTargetAttribute(targetAttribute);
		addStringToRuleKeyword.apply();
	}

	/**
	* This method adds a new symbol to an existing attribute. (the symbol will be with quotes, e.g. ';')
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies to which attribute the new symbol will be added.
	* @param newSymbol the new symbol
	* @param isHead here to add the new symbol, to the front of the attribute or after the attribute?
	*/
	public void addSymbolToAttr(String grammarRule, String attrName, String newSymbol, boolean isHead,
			List<String> ignoredAttributes, boolean onlyCommonRule, boolean onlyUpperBoundOne) {
		AddSymbolToAttr addSymbolToAttr = GrammaroptimizerFactory.eINSTANCE.createAddSymbolToAttr();
		addSymbolToAttr.setGrammar(grammar);
		addSymbolToAttr.setGrammarRule(grammarRule);
		addSymbolToAttr.setAttrName(attrName);
		addSymbolToAttr.setNewSymbol(newSymbol);
		addSymbolToAttr.setIsHead(isHead);
		addSymbolToAttr.setOnlyCommonRule(onlyCommonRule);
		addSymbolToAttr.setOnlyUpperBoundOne(onlyUpperBoundOne);
		if (null != ignoredAttributes) {
			addSymbolToAttr.getIgnoredAttributes().addAll(ignoredAttributes);
		}

		addSymbolToAttr.apply();
	}
	
	/**
	* This method is used to add a symbol without quotes to an existing keyword.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param keyword the target keyword aimed to be added with symbol.
	* @param symbol What the symbol is.
	* @param isFront specifies where to add the symbol, to the front of the keyword or behind?
	*/
	public void addSymbolWithoutQuoteToKeyword(String grammarRule, String attrName, String keyword, String symbol, boolean isFront) {
		AddSymbolWithoutQuoteToKeyword addSymbolToKeyword = OptimizationruleFactory.eINSTANCE.createAddSymbolWithoutQuoteToKeyword();
		addSymbolToKeyword.setGrammar(grammar);
		addSymbolToKeyword.setGrammarRule(grammarRule);
		addSymbolToKeyword.setAttrName(attrName);
		addSymbolToKeyword.setKeyword(keyword);
		addSymbolToKeyword.setSymbol(symbol);
		addSymbolToKeyword.setIsFront(isFront);
		addSymbolToKeyword.apply();
	}
	
	/**
	* This method is used to add a new symbol to a specified line.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param newSymbol specifies what the new symbol will be.
	* @param isFront specifies where to add the symbol, to the front of the line or behind?
	*/
	public void addSymbolToLine(String grammarRule, String attrName, String newSymbol, boolean isFront) {
		AddSymbolToLine addSymbolToLine = OptimizationruleFactory.eINSTANCE.createAddSymbolToLine();
		addSymbolToLine.setGrammar(grammar);
		addSymbolToLine.setGrammarRule(grammarRule);
		addSymbolToLine.setAttrName(attrName);
		addSymbolToLine.setNewSymbol(newSymbol);
		addSymbolToLine.setIsFront(isFront);
		addSymbolToLine.apply();
	}

	/**
	* This method is used to add a new symbol to a existing grammar rule (the default place
	* is in the end of a grammar rule).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param symbol specifies what the symbol is.
	*/
	public void addSymbolToRule(String grammarRule, String symbol) {
		AddSymbolToRule addSymbolToRule = GrammaroptimizerFactory.eINSTANCE.createAddSymbolToRule();
		addSymbolToRule.setGrammar(grammar);
		addSymbolToRule.setGrammarRule(grammarRule);
		addSymbolToRule.setSymbol(symbol);
		addSymbolToRule.apply();
	}
	

	/**
	* This method is used to add a symbol without quotes to an existing line.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param newSymbol specifies the symbol to add
	*/
	public void addSymbolWithoutQuoteToLine(String grammarRule, String attrName, String newSymbol, boolean isFront) {
		AddSymbolWithoutQuoteToLine addSymbolWithoutQuoteToLine = OptimizationruleFactory.eINSTANCE.createAddSymbolWithoutQuoteToLine();
		addSymbolWithoutQuoteToLine.setGrammar(grammar);
		addSymbolWithoutQuoteToLine.setGrammarRule(grammarRule);
		addSymbolWithoutQuoteToLine.setAttrName(attrName);
		addSymbolWithoutQuoteToLine.setNewSymbol(newSymbol);
		addSymbolWithoutQuoteToLine.setIsFront(isFront);
		addSymbolWithoutQuoteToLine.apply();
	}
	
	/**
	* This method is used to add a terminal rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param body the body of the newly added terminal rule.
	* @param annotation the annotation of the added terminal rule.
	*/
	public void addTerminalRule(String grammarRule, String body, String annotation) {
		AddTerminalRule addTerminalRule = OptimizationruleFactory.eINSTANCE.createAddTerminalRule();
		addTerminalRule.setGrammar(grammar);
		addTerminalRule.setGrammarRule(grammarRule);
		addTerminalRule.setAttrName(null);
		addTerminalRule.setBody(body);
		addTerminalRule.setAnnotation(annotation);
		addTerminalRule.apply();
	}
	
	/**
	* This method is used to copy attribute B and place it to the front of attribute A.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrA specifies the name of attribute A.
	* @param attrB specifies the name of attribute B.
	*/
	public void changeABtoBAB(String grammarRule, String attrA, String attrB) {
		ChangeABtoBAB changeABtoBAB = OptimizationruleFactory.eINSTANCE.createChangeABtoBAB();
		changeABtoBAB.setGrammar(grammar);
		changeABtoBAB.setGrammarRule(grammarRule);
		changeABtoBAB.setAttrA(attrA);
		changeABtoBAB.setAttrB(attrB);
		changeABtoBAB.setAttrName(null);
		changeABtoBAB.apply();
	}
	
	/**
	* This method is used to reorganize the attributes, in this case it's from:
	* 	attrA=TypeA
	* 	attrB=TypeB
	* to:
	* 	attrA=TypeA attrB=TypeB | 
	* 	attrB=TypeB attrA=TypeA
	* This means that both attributes need to be present, but their order is arbitrary.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrA specifies the name of attribute A
	* @param attrB specifies the name of attribute B
	*/
	public void changeABToABorBA(String grammarRule, String attrA, String attrB) {
		ChangeABToABorBA changeABToABorBA = OptimizationruleFactory.eINSTANCE.createChangeABToABorBA();
		changeABToABorBA.setGrammar(grammar);
		changeABToABorBA.setGrammarRule(grammarRule);
		changeABToABorBA.setAttrA(attrA);
		changeABToABorBA.setAttrB(attrB);
		changeABToABorBA.setAttrName(null);
		changeABToABorBA.apply();
	}
	
	/**
	* This method is used to reorganize the attributes, in this case it's from:
	* 	attrA=TypeA
	* to:
	* 	attrA=TypeA | ';'
	* Please be ware, ';' here is just an example.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of attribute A.
	* @param symbol specifies what symbol will be added.
	*/
	public void changeAToAorSymbol(String grammarRule, String attrName, String symbol) {
		ChangeAToAorSymbol changeAToAorSymbol = OptimizationruleFactory.eINSTANCE.createChangeAToAorSymbol();
		changeAToAorSymbol.setGrammar(grammar);
		changeAToAorSymbol.setGrammarRule(grammarRule);
		changeAToAorSymbol.setAttrName(attrName);
		changeAToAorSymbol.setSymbol(symbol);
		changeAToAorSymbol.apply();
	}
	
	/**
	* This method is used to reorganize the attributes, in this case it's from:
	* 	attrA=TypeA
	* to:
	* 	(attrA=TypeA)? | attrA=TypeA
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of attribute A
	*/
	public void changeAToOptionalAorA(String grammarRule, String attrName) {
		ChangeAToOptionalAorA changeAToOptionalAorA = OptimizationruleFactory.eINSTANCE.createChangeAToOptionalAorA();
		changeAToOptionalAorA.setGrammar(grammar);
		changeAToOptionalAorA.setGrammarRule(grammarRule);
		changeAToOptionalAorA.setAttrName(attrName);
		changeAToOptionalAorA.apply();
	}
	
	/**
	* This method is used to reorganize the attributes, in this case, it's from:
	* 	attrA=TypeA
	* to:
	* 	attrA=TypeA ';' | '{' attrA=TypeA '}'
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of attribute A.
	*/
	public void changeAToASemiOrAWithBraces(String grammarRule, String attrName) {
		ChangeAttributeToSingleElementOrBracedList changeAttributeToSingleElementOrBracedList = OptimizationruleFactory.eINSTANCE.createChangeAttributeToSingleElementOrBracedList();
		changeAttributeToSingleElementOrBracedList.setGrammar(grammar);
		changeAttributeToSingleElementOrBracedList.setGrammarRule(grammarRule);
		changeAttributeToSingleElementOrBracedList.setAttrName(attrName);
		changeAttributeToSingleElementOrBracedList.apply();
	}

	/**
	* This method is used to replace the whole line containing a specified attribute with a new string.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param newLineContent the new content for the target line.
	*/
	public void changeAttrLineContent(String grammarRule, String attrName, String newLineContent) {
		ChangeAttrLineContent changeAttrLineContent = GrammaroptimizerFactory.eINSTANCE.createChangeAttrLineContent();
		changeAttrLineContent.setGrammar(grammar);
		changeAttrLineContent.setGrammarRule(grammarRule);
		changeAttrLineContent.setAttrName(attrName);
		changeAttrLineContent.setNewLineContent(newLineContent);
		changeAttrLineContent.apply();
	}
	
	/**
	* This method is used to re-form the appearance of a specified boolean attribute.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies which attribute is the target boolean attribute.
	*/
	public void changeBooleanAttrToSpecialPattern(String grammarRule, String attrName) {
		ChangeBooleanAttrToSpecialPattern changeBooleanAttrToSpecialPatten = OptimizationruleFactory.eINSTANCE.createChangeBooleanAttrToSpecialPattern();
		changeBooleanAttrToSpecialPatten.setGrammar(grammar);
		changeBooleanAttrToSpecialPatten.setGrammarRule(grammarRule);
		changeBooleanAttrToSpecialPatten.setAttrName(attrName);
		changeBooleanAttrToSpecialPatten.apply();
	}

	/**
	* This method is used to change curly braces to angle brackets.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	*/
	public void changeBracesToAngle(String grammarRule, String attrName) {
		ChangeBracesToAngle changeBracesToAngle = GrammaroptimizerFactory.eINSTANCE.createChangeBracesToAngle();
		changeBracesToAngle.setGrammar(grammar);
		changeBracesToAngle.setGrammarRule(grammarRule);
		changeBracesToAngle.setAttrName(attrName);
		changeBracesToAngle.apply();
	}

	/**
	* This method is used to change curly braces to parentheses.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	*/
	public void changeBracesToParentheses(String grammarRule, String attrName) {
		ChangeBracesToParentheses changeBracesToParentheses = GrammaroptimizerFactory.eINSTANCE
				.createChangeBracesToParentheses();
		changeBracesToParentheses.setGrammar(grammar);
		changeBracesToParentheses.setGrammarRule(grammarRule);
		changeBracesToParentheses.setAttrName(attrName);
		changeBracesToParentheses.apply();
	}

	/**
	* This method is used to change curly braces to square brackets.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	*/
	public void changeBracesToSquare(String grammarRule, String attrName) {
		ChangeBracesToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracesToSquare();
		changeBracketToSquare.setGrammar(grammar);
		changeBracketToSquare.setGrammarRule(grammarRule);
		changeBracketToSquare.setAttrName(attrName);
		changeBracketToSquare.apply();
	}

	/**
	* This method is used to change the called rule in a speficified grammar rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param currentCalledRule the current name of the called rule.
	* @param newCalledRule the new name of the called rule.
	*/
	public void changeCalledRule(String grammarRule, String currentCalledRule, String newCalledRule) {
		ChangeCalledRule changeCalledRule = GrammaroptimizerFactory.eINSTANCE.createChangeCalledRule();
		changeCalledRule.setGrammar(grammar);
		changeCalledRule.setGrammarRule(grammarRule);
		changeCalledRule.setAttrName(null);
		changeCalledRule.setCurrentCalledRule(currentCalledRule);
		changeCalledRule.setNewCalledRule(newCalledRule);
		changeCalledRule.apply();
	}

	/**
	* This method is used to change a specified comma symbol to other symbol.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param newSymbol the new symbol for replacement.
	*/
	public void changeCommaToOtherSymbol(String grammarRule, String attrName, String newSymbol) {
		ChangeCommaToOtherSymbol changeCommaToOtherSymbol = GrammaroptimizerFactory.eINSTANCE
				.createChangeCommaToOtherSymbol();
		changeCommaToOtherSymbol.setGrammar(grammar);
		changeCommaToOtherSymbol.setGrammarRule(grammarRule);
		changeCommaToOtherSymbol.setAttrName(attrName);
		changeCommaToOtherSymbol.setNewSymbol(newSymbol);
		changeCommaToOtherSymbol.apply();
	}

	/**
	 * Change all (or some of) the optional attributes within the same grammar rule to be in an "OR" 
	 * relationship with each other.
	 * (So in this change, the optionality ()? of the specified attribute(s) will be removed).
	 * @param grammarRule specifies which grammar rule aimed to apply this action to
	 * @param isAll This param indicate whether the change will be applied to all the attributes or only part of them?
	 * @param startAttr If the change is applied to part of them, then this param indicate the first attribute, and
	 * @param endAttr indicates the last attribute.
	 */
	public void changeOptionalAttrToOrRelation(String grammarRule, boolean isAll, String startAttr, String endAttr) {
		ChangeOptionalAttrToOrRelation changeOptionalAttrToOrRelation = GrammaroptimizerFactory.eINSTANCE
				.createChangeOptionalAttrToOrRelation();
		changeOptionalAttrToOrRelation.setGrammar(grammar);
		changeOptionalAttrToOrRelation.setGrammarRule(grammarRule);
		changeOptionalAttrToOrRelation.setAttrName(null);
		changeOptionalAttrToOrRelation.setIsAll(isAll);
		changeOptionalAttrToOrRelation.setStartAttr(startAttr);
		changeOptionalAttrToOrRelation.setEndAttr(endAttr);
		changeOptionalAttrToOrRelation.apply();
	}

	/**
	* This method is used to change the "returns" part of a rule (i.e., the metaclass name in the first
	* line of a grammar rule).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param newReturns provides the new returns.
	*/
	public void changeReturns(String grammarRule, String newReturns) {
		ChangeReturns changeReturns = OptimizationruleFactory.eINSTANCE.createChangeReturns();
		changeReturns.setGrammar(grammar);
		changeReturns.setGrammarRule(grammarRule);
		changeReturns.setAttrName(null);
		changeReturns.setNewReturns(newReturns);
		changeReturns.apply();
	}

	/**
	 * this method is going to change the type of an attribute, i.e., the type after
	 * += or =. For example, from:
	 * 	attr=TypeA
	 * to:
	 * 	attr=TypeB
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param currentType specifies what is the old type of the specified attribute.
	* @param newType specifies what will be the new type of the specified attribute.
	*/
	public void changeTypeOfAttr(String grammarRule, String attrName, String currentType, String newType) {
		ChangeTypeOfAttr changeTypeOfAttr = GrammaroptimizerFactory.eINSTANCE.createChangeTypeOfAttr();
		changeTypeOfAttr.setGrammar(grammar);
		changeTypeOfAttr.setGrammarRule(grammarRule);
		changeTypeOfAttr.setAttrName(attrName);
		changeTypeOfAttr.setCurrentType(currentType);
		changeTypeOfAttr.setNewType(newType);
		changeTypeOfAttr.apply();
	}

	/**
	* This method is used to change the whole rule content for a grammar rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param newContent the new content for the grammar rule.
	*/
	public void changeRuleContent(String grammarRule, String newContent) {
		ChangeRuleContent changeRuleContent = GrammaroptimizerFactory.eINSTANCE.createChangeRuleContent();
		changeRuleContent.setGrammar(grammar);
		changeRuleContent.setGrammarRule(grammarRule);
		changeRuleContent.setAttrName(null);
		changeRuleContent.setNewContent(newContent);
		changeRuleContent.apply();
	}

	/**
	* This method is used to rename the specified grammar rule (the name is in the first line)
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param currentName specifies the current name of the specified grammar rule.
	* @param newName the new name for the specified grammar rule.
	*/
	public void renameRule(String grammarRule, String newName) {
		RenameRule renameRule = GrammaroptimizerFactory.eINSTANCE.createRenameRule();
		renameRule.setGrammar(grammar);
		renameRule.setGrammarRule(grammarRule);
		renameRule.setAttrName(null);
		//renameRule.setCurrentName(currentName);
		renameRule.setNewName(newName);
		renameRule.apply();
	}
	
	/**
	* This method is used to change multiplicity of the specified attribute (the range is changed 
	* from 0~* to 0~* or 1~*, star symbol means infinite).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName the attribute whose multiplicity will be changed
	*/
	public void convert0toStarTo0toStaror1toStar(String grammarRule, String attrName) {
		Convert0toStarTo0toStaror1toStar convert0toStarTo0toStaror1toStar = OptimizationruleFactory.eINSTANCE.createConvert0toStarTo0toStaror1toStar();
		convert0toStarTo0toStaror1toStar.setGrammar(grammar);
		convert0toStarTo0toStaror1toStar.setGrammarRule(grammarRule);
		convert0toStarTo0toStaror1toStar.setAttrName(attrName);
		convert0toStarTo0toStaror1toStar.apply();
	}

	/**
	* This method is used to change multiplicity of the specified attribute (the range is changed 
	* from 1~* to 1).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName the attribute whose multiplicity will be changed
	*/
	public void convert1toStarTo1(String grammarRule, String attrName) {
		Convert1ToStarTo1 x0toStarToX = GrammaroptimizerFactory.eINSTANCE.createConvert1ToStarTo1();
		x0toStarToX.setGrammar(grammar);
		x0toStarToX.setGrammarRule(grammarRule);
		x0toStarToX.setAttrName(attrName);
		x0toStarToX.apply();
	}

	/**
	* This method is used to change multiplicity of the specified attribute (the range is changed 
	* from 1~* to *).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName the attribute whose multiplicity will be changed
	*/
	public void convert1toStarToStar(String grammarRule, String attrName) {
		Convert1toStarToStar x0toStarToXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarToStar();
		x0toStarToXStar.setGrammar(grammar);
		x0toStarToXStar.setGrammarRule(grammarRule);
		x0toStarToXStar.setAttrName(attrName);
		x0toStarToXStar.apply();
	}

	/**
	* This method is used to change multiplicity of the specified attribute (the range is changed 
	* from 1~* to +, plus symbol is equivalent with 1~*).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName the attribute whose multiplicity will be changed
	*/
	public void convert1toStarToPlus(String grammarRule, String attrName) {
		Convert1toStarToPlus x0toStarToXPlus = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarToPlus();
		x0toStarToXPlus.setGrammar(grammar);
		x0toStarToXPlus.setGrammarRule(grammarRule);
		x0toStarToXPlus.setAttrName(attrName);
		x0toStarToXPlus.apply();
	}

	/**
	* This method is used to change multiplicity of the specified attribute (the range is changed 
	* from 1~* to "1 or star). 
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName the attribute whose multiplicity will be changed
	*/
	public void convert1toStarTo1orStar(String grammarRule, String attrName) {
		Convert1toStarTo1orStar convert1toStarTo1orStar = GrammaroptimizerFactory.eINSTANCE
				.createConvert1toStarTo1orStar();
		convert1toStarTo1orStar.setGrammar(grammar);
		convert1toStarTo1orStar.setGrammarRule(grammarRule);
		convert1toStarTo1orStar.setAttrName(attrName);
		convert1toStarTo1orStar.apply();
	}
	
	/**
	* This method is used to change multiplicity of the specified attribute (the range is changed 
	* from 1~* to 2).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName the attribute whose multiplicity will be changed
	*/
	public void convert1toStarToTwo(String grammarRule, String attrName) {
		Convert1toStarToTwo convert1toStarToTwo = OptimizationruleFactory.eINSTANCE.createConvert1toStarToTwo();
		convert1toStarToTwo.setGrammar(grammar);
		convert1toStarToTwo.setGrammarRule(grammarRule);
		convert1toStarToTwo.setAttrName(attrName);
		convert1toStarToTwo.apply();
	}
	
	/**
	* This method is used to copy one specified attribute (called A here) to another specified
	* attribute (called B here).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrA the attribute which will be copied.
	* @param attrB the attribute which will be extended with attrA.
	* @param isFront specifies the place for placing, in front of attribute B or behind.
	*/
	public void copyAttrAToAttrB(String grammarRule, String attrA, String attrB, boolean isFront) {
		CopyAttrAToAttrB copyAttrAToAttrB = OptimizationruleFactory.eINSTANCE.createCopyAttrAToAttrB();
		copyAttrAToAttrB.setGrammar(grammar);
		copyAttrAToAttrB.setGrammarRule(grammarRule);
		copyAttrAToAttrB.setAttrName(null);
		copyAttrAToAttrB.setAttrA(attrA);
		copyAttrAToAttrB.setAttrB(attrB);
		copyAttrAToAttrB.setIsFront(isFront);
		copyAttrAToAttrB.apply();
	}
	
	/**
	* This method is used to copy a specified attribute (called X here) to another specified attribute
	* (called Y here), and in this copy the multiplicity will be ignored. For example, here are two
	* attributes:
	* 	attrX=TypeX ("," attrX=TypeX)*
	* 	attrY=TypeY
	* The copied part is only attrX=TypeX. So finally, a possible result would be:
	* 	attrY=TypeY attrX=TypeX
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrInX specifies the attribute called X in the above example.
	* @param attrInY specifies the attribute called Y in the above example.
	* @param isFront specifies where to place the copied attribute, front or behine?
	*/
	public void copyXfromStarToY(String grammarRule, String attrInX, String attrInY, boolean isFront) {
		CopyXfromStarToY copyXfromStarToY = OptimizationruleFactory.eINSTANCE.createCopyXfromStarToY();
		copyXfromStarToY.setGrammar(grammar);
		copyXfromStarToY.setGrammarRule(grammarRule);
		copyXfromStarToY.setAttrInX(attrInX);
		copyXfromStarToY.setAttrInY(attrInY);
		copyXfromStarToY.setAttrName(null);
		copyXfromStarToY.setIsFront(isFront);
		copyXfromStarToY.apply();
	}

	/**
	 * This method is used to insert a new keyword after an existing keyword in
	 * a specified attribute.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param currentKeyword This param specifies a target keyword (means insert the new keyword after it).
	* @param newKeyword This param specifies a new keyword.
	*/
	public void addKeywordAfterKeyword(String grammarRule, String attrName, String currentKeyword,
			String newKeyword) {
		AddKeywordAfterKeyword addKeywordAfterKeyword = GrammaroptimizerFactory.eINSTANCE
				.createAddKeywordAfterKeyword();
		addKeywordAfterKeyword.setGrammar(grammar);
		addKeywordAfterKeyword.setGrammarRule(grammarRule);
		addKeywordAfterKeyword.setAttrName(attrName);
		addKeywordAfterKeyword.setCurrentKeyword(currentKeyword);
		addKeywordAfterKeyword.setNewKeyword(newKeyword);
		addKeywordAfterKeyword.apply();
	}

	/**
	* This method is used to change the specified keyword from upper case to lower case.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param keyword specifies which keyword.
	*/
	public void keywordUpperToLowerCase(String grammarRule, String attrName, String keyword) {
		KeywordUpperToLowerCase keywordUpperToLowerCase = GrammaroptimizerFactory.eINSTANCE
				.createKeywordUpperToLowerCase();
		keywordUpperToLowerCase.setGrammar(grammar);
		keywordUpperToLowerCase.setGrammarRule(grammarRule);
		keywordUpperToLowerCase.setAttrName(attrName);
		keywordUpperToLowerCase.setKeyword(keyword);
		keywordUpperToLowerCase.apply();
	}

	/**
	 * Moved a line containing a specified keyword/attribute to the end of the rule
	 * keyword. Note: here when a keyword has the same name with the rule name, then
	 * we call it rule keyword here, usually it exists very beginning place of a
	 * grammar rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param movedLine specifies the keyword or attributed denoting which line will be moved.
	*/
	public void moveAttrToAfterRuleKeyword(String grammarRule, String movedLine) {
		MoveAttrToAfterRuleKeyword moveAttrToAfterRuleKeyword = GrammaroptimizerFactory.eINSTANCE
				.createMoveAttrToAfterRuleKeyword();
		moveAttrToAfterRuleKeyword.setGrammar(grammar);
		moveAttrToAfterRuleKeyword.setGrammarRule(grammarRule);
		moveAttrToAfterRuleKeyword.setAttrName(null);
		moveAttrToAfterRuleKeyword.setMovedLine(movedLine);
		moveAttrToAfterRuleKeyword.apply();
	}

	/**
	 * source: the line containing a specified attribute/keyword that you want to
	 * move target: the line containing a specified attribute/keyword that you want
	 * to find isHead: where to place the moved line? before the target line or
	 * after it?
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param source specifies the attribute or keyword that marks the line to which to apply this action
	* @param target specifies the target line by specifying an attribute or keyword,
	* the moved line will be put in the front of this line or behine.
	* @param inFrontOfTarget specifies where to place the moved line, to the front
	* of the target line or the back
	*/
	public void moveLine(String grammarRule, String source, String target, boolean inFrontOfTarget) {
		MoveLine moveLine = GrammaroptimizerFactory.eINSTANCE.createMoveLine();
		moveLine.setGrammar(grammar);
		moveLine.setGrammarRule(grammarRule);
		moveLine.setAttrName(null);
		moveLine.setSource(source);
		moveLine.setTarget(target);
		moveLine.setIsHead(inFrontOfTarget);
		moveLine.apply();
	}
	
	/**
	* Changes the optionality of an attribute to optional, zero or more or one or more.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param startAttr specifies the first attribute which is going to be packaged.
	* @param endAttr specifies the last attribute.
	* @param multiplicity specifies how to package them? By adding () or ()? or ()* or ()+.
	*/
	public void packageAttributes(String grammarRule, String startAttr, String endAttr, MultiplicityKey multiplicity) {
		ChangeAttributeMultiplicity packageAttributes = OptimizationruleFactory.eINSTANCE.createChangeAttributeMultiplicity();
		packageAttributes.setGrammar(grammar);
		packageAttributes.setGrammarRule(grammarRule);
		packageAttributes.setAttrName(null);
		packageAttributes.setStartAttr(startAttr);
		packageAttributes.setEndAttr(endAttr);
		packageAttributes.setMultiplicity(multiplicity);
		packageAttributes.apply();
	}
	
	/**
	* This method is used to remove the action of a specified grammar rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeAction(String grammarRule) {
		RemoveAction removeAction = OptimizationruleFactory.eINSTANCE.createRemoveAction();
		removeAction.setGrammar(grammar);
		removeAction.setGrammarRule(grammarRule);
		removeAction.setAttrName(null);
		removeAction.apply();
	}

	/**
	* This method is used to remove a specified attribute.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies which attribute is going to be removed.
	*/
	public void removeAttribute(String grammarRule, String attrName) {
		RemoveAttribute removeAttr = GrammaroptimizerFactory.eINSTANCE.createRemoveAttribute();
		removeAttr.setGrammar(grammar);
		removeAttr.setGrammarRule(grammarRule);
		removeAttr.setAttrName(attrName);
		removeAttr.apply();
	}

	/**
	* This method is used to remove all the brackets except the container brackets in a specified grammar rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeBracesExceptContainer(String grammarRule) {
		RemoveBracesExceptOutermost removeBracesExceptOutermost = GrammaroptimizerFactory.eINSTANCE
				.createRemoveBracesExceptOutermost();
		removeBracesExceptOutermost.setGrammar(grammar);
		removeBracesExceptOutermost.setGrammarRule(grammarRule);
		removeBracesExceptOutermost.setAttrName(null);
		removeBracesExceptOutermost.apply();
	}

	/**
	* This method is used to remove bracket and the scope of this removal could be set.
	* @param grammarRule specifies which grammar rule aimed to apply this action to, if it is empty, then 
	* the removal will happen in all the grammar rules in a grammar.
	* @param attrName This param specifies in which line (attribute) the brackets will be removed?
	* If it is empty, that means all the brackets in all attribute lines will be removed.
	* @param targetAttribute The removal will happen only when the specified targetAttribute is found.
	* @param excludeGrammarRules The removal will not happen when the grammar rule is the member of the list
	* excludeGrammarRules.
	*/
	public void removeBraces(String grammarRule, String attrName, String targetAttribute,
			List<String> excludedGrammarRules) {
		RemoveBraces removeBraces = GrammaroptimizerFactory.eINSTANCE.createRemoveBraces();
		removeBraces.setGrammar(grammar);
		removeBraces.setGrammarRule(grammarRule);
		removeBraces.setAttrName(attrName);
		removeBraces.setTargetAttribute(targetAttribute);
		if (excludedGrammarRules != null) {
			removeBraces.getExcludedGrammarRule().addAll(excludedGrammarRules);
		}
		removeBraces.apply();
	}
	
	public void removeBraces(String grammarRule, String attrName, List<String> excludedGrammarRules) {
		RemoveBraces removeBraces = GrammaroptimizerFactory.eINSTANCE.createRemoveBraces();
		removeBraces.setGrammar(grammar);
		removeBraces.setGrammarRule(grammarRule);
		removeBraces.setAttrName(attrName);
		if (excludedGrammarRules != null) {
			removeBraces.getExcludedGrammarRule().addAll(excludedGrammarRules);
		}
		removeBraces.apply();
	}

	/**
	* This method is used to remove all the brackets in the specified grammar rule(s).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeBraces(String grammarRule) {
		RemoveBraces removeBraces = GrammaroptimizerFactory.eINSTANCE.createRemoveBraces();
		removeBraces.setGrammar(grammar);
		removeBraces.setGrammarRule(grammarRule);
		removeBraces.setAttrName(null);
		removeBraces.setTargetAttribute(null);
		removeBraces.apply();
	}

	/**
	* This method is used to remove a certain type of a specified attribute. For example, from:
	* 	attr=[Type|EString]
	* to:
	* 	attr=[Type]
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies an attribute which one of its types will be removed.
	* @param type specifies which type will ber removed.
	*/
	public void removeCertainTypeFromAttr(String grammarRule, String attrName, String type) {
		RemoveCertainTypeFromAttr removeCertainTypeFromAttr = GrammaroptimizerFactory.eINSTANCE
				.createRemoveCertainTypeFromAttr();
		removeCertainTypeFromAttr.setGrammar(grammar);
		removeCertainTypeFromAttr.setGrammarRule(grammarRule);
		removeCertainTypeFromAttr.setAttrName(attrName);
		removeCertainTypeFromAttr.setType(type);
		removeCertainTypeFromAttr.apply();
	}

	/**
	* This method is used to remove comma.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param ecludedAttributes specifies the attributes containing the attributes that you want to avoid being
	* removed comma ",".
	*/
	public void removeComma(String grammarRule, String attrName, List<String> ecludedAttributes) {
		RemoveComma removeComma = GrammaroptimizerFactory.eINSTANCE.createRemoveComma();
		removeComma.setGrammar(grammar);
		removeComma.setGrammarRule(grammarRule);
		removeComma.setAttrName(attrName);
		if (ecludedAttributes != null) {
			removeComma.getAttributes().addAll(ecludedAttributes);
		}
		removeComma.apply();
	}

	/**
	* This method is used to remove keyword.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param keywordName specifies which keyword to remove.
	* @param targetAttribute The removal will happen only when the targetAttribute is found (if it is not null).
	*/
	public void removeKeyword(String grammarRule, String attrName, String keywordName, String targetAttribute) {
		RemoveKeyword removeKeyword = GrammaroptimizerFactory.eINSTANCE.createRemoveKeyword();
		removeKeyword.setGrammar(grammar);
		removeKeyword.setGrammarRule(grammarRule);
		removeKeyword.setAttrName(attrName);
		removeKeyword.setKeywordName(keywordName);
		removeKeyword.setTargetAttribute(targetAttribute);
		removeKeyword.apply();
	}
	
	/**
	* This method is used to remove all the keywords in the specified grammar rule.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeKeyword(String grammarRule) {
		RemoveKeyword removeKeyword = GrammaroptimizerFactory.eINSTANCE.createRemoveKeyword();
		removeKeyword.setGrammar(grammar);
		removeKeyword.setGrammarRule(grammarRule);
		removeKeyword.setAttrName(null);
		removeKeyword.setKeywordName(null);
		removeKeyword.setTargetAttribute(null);
		removeKeyword.apply();
	}

	/**
	* This method is used to remove the brackets in all the attribute lines.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeKeywordsOfAllAttrs(String grammarRule) {
		RemoveAttributeKeywords removeKeywordsOfAllAttrs = GrammaroptimizerFactory.eINSTANCE
				.createRemoveKeywordsOfAllAttrs();
		removeKeywordsOfAllAttrs.setGrammar(grammar);
		removeKeywordsOfAllAttrs.setGrammarRule(grammarRule);
		removeKeywordsOfAllAttrs.apply();
	}

	/**
	* This method is used to remove a specific Import.
	* @param importString specifies which Import to remove.
	*/
	public void removeImport(String importString) {
		RemoveImport removeImport = GrammaroptimizerFactory.eINSTANCE.createRemoveImport();
		removeImport.setGrammar(grammar);
		removeImport.setImport(importString);
		removeImport.apply();
	}
	
	/**
	* This method is used to remove a specified literal from Enum.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param literalName specifies which literal to remove.
	*/
	public void removeLiteralFromEnum(String grammarRule, String literalName) {
		RemoveLiteralFromEnum removeLiteralFromEnum = OptimizationruleFactory.eINSTANCE.createRemoveLiteralFromEnum();
		removeLiteralFromEnum.setGrammar(grammar);
		removeLiteralFromEnum.setGrammarRule(grammarRule);
		removeLiteralFromEnum.setAttrName(null);
		removeLiteralFromEnum.setLiteralName(literalName);
		removeLiteralFromEnum.apply();
	}

	/**
	* This method is used to Remove the optionality from the specified attribute in the specified rule.
	* The optionality is the in form of, e.g., (attr=Type)?.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attribute specifies from which attribute the optionality will be removed
	*/
	public void removeOptionality(String grammarRule, String attrName) {
		RemoveOptionality removeOptionality = GrammaroptimizerFactory.eINSTANCE.createRemoveOptionality();
		removeOptionality.setGrammar(grammar);
		removeOptionality.setGrammarRule(grammarRule);
		removeOptionality.setAttrName(attrName);
		removeOptionality.apply();
	}

	/**
	* This method is used to remove the container brackets.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeContainerBraces(String grammarRule) {
		RemoveOutermostBraces removeOutermostBraces = GrammaroptimizerFactory.eINSTANCE
				.createRemoveOutermostBraces();
		removeOutermostBraces.setGrammar(grammar);
		removeOutermostBraces.setGrammarRule(grammarRule);
		removeOutermostBraces.setAttrName(null);
		removeOutermostBraces.apply();
	}

	/**
	* This method is used to remove parentheses from a specifies attribute line.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	*/
	public void removeParenthesesInSpecifiedAttr(String grammarRule, String attrName) {
		RemoveParenthesesInAttribute removeParenthesesInSpecifiedAttr = GrammaroptimizerFactory.eINSTANCE
				.createRemoveParenthesesInSpecifiedAttr();
		removeParenthesesInSpecifiedAttr.setGrammar(grammar);
		removeParenthesesInSpecifiedAttr.setGrammarRule(grammarRule);
		removeParenthesesInSpecifiedAttr.setAttrName(attrName);
		removeParenthesesInSpecifiedAttr.apply();
	}

	/**
	* This method is used to remove a specified whole rule. This is necessary, because sometimes Xtext will
	* generate some useless and fault grammar rules.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	*/
	public void removeRule(String grammarRule) {
		RemoveRule removeRule = GrammaroptimizerFactory.eINSTANCE.createRemoveRule();
		removeRule.setGrammar(grammar);
		removeRule.setGrammarRule(grammarRule);
		removeRule.setAttrName(null);
		removeRule.apply();
	}

	/**
	* An abstract class will be generated into a grammar rule which the definition
	* consists of called rules, and this method is going to remove a specified
	* called rule from them.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param calledRuleName specifies which called rule should be removed.
	*/
	public void removeRuleCall(String grammarRule, String calledRuleName) {
		RemoveRuleCall removeRuleCall = GrammaroptimizerFactory.eINSTANCE.createRemoveRuleCall();
		removeRuleCall.setGrammar(grammar);
		removeRuleCall.setGrammarRule(grammarRule);
		removeRuleCall.setAttrName(null);
		removeRuleCall.setCalledRuleName(calledRuleName);
		removeRuleCall.apply();
	}

	/**
	* This method is used to remove keyword from the specified XStar Attr (XStar Attr means
	* the range of the attribute is from 0 to infinite).
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the so-called XStar Attr.
	* @param excludedAttributes If the specified attribute is the member of list excludedAttributes,
	* then the removal will be skipped.
	*/
	public void removeXStarAttrKeyword(String grammarRule, String attrName, List<String> excludedAttributes) {
		RemoveXStarAttrKeyword removeXStarAttrKeyword = GrammaroptimizerFactory.eINSTANCE
				.createRemoveXStarAttrKeyword();
		removeXStarAttrKeyword.setGrammar(grammar);
		removeXStarAttrKeyword.setGrammarRule(grammarRule);
		removeXStarAttrKeyword.setAttrName(attrName);
		if (excludedAttributes != null) {
			removeXStarAttrKeyword.getAttributes().addAll(excludedAttributes);
		}
		removeXStarAttrKeyword.apply();
	}

	/**
	* This method is used to rename keyword.
	* @param grammarRule specifies which grammar rule aimed to apply this action to
	* @param attrName specifies the name of the attribute that marks the line to which to apply this action
	* @param currentKeyword specifies which keyword will be renamed.
	* @param newKeyword specifies what is the new keyword name.
	*/
	public void renameKeyword(String grammarRule, String attrName, String currentKeyword, String newKeyword,
			String targetAttributeAttr) {
		RenameKeyword renameKeyword = GrammaroptimizerFactory.eINSTANCE.createRenameKeyword();
		renameKeyword.setGrammar(grammar);
		renameKeyword.setGrammarRule(grammarRule);
		renameKeyword.setAttrName(attrName);
		renameKeyword.setCurrentKeyword(currentKeyword);
		renameKeyword.setNewKeyword(newKeyword);
		renameKeyword.setTargetAttribute(targetAttributeAttr);
		renameKeyword.apply();
	}
	
	public void setAstProperty(String grammarRule, String className, String propertyName, String propertyValue, boolean multi) {
		SetAstProperty setAstProperty = OptimizationruleFactory.eINSTANCE.createSetAstProperty();
		setAstProperty.setGrammar(grammar);
		setAstProperty.setGrammarRule(grammarRule);
		setAstProperty.setClassName(className);
		setAstProperty.setPropertyName(propertyName);
		setAstProperty.setPropertyValue(propertyValue);
		setAstProperty.setMulti(multi);
		setAstProperty.setAttrName(null);
		setAstProperty.apply();
	}
}
