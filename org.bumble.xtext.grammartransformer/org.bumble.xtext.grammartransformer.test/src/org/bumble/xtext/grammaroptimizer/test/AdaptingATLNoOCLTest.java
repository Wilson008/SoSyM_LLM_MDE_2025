package org.bumble.xtext.grammaroptimizer.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingATLNoOCLTest {
	@Test
	public void testAdaptingATL()  {
		// read text from file
		String input = FileHelper.getFileText("ATLnoOCL.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		GrammarTransformer go = new GrammarTransformer();
		Assert.assertTrue(go.processGrammar(input));
		
		//Remove inherited comment attributes
		go.removeAttribute(null, "location");
		go.removeAttribute(null, "commentsBefore");
		go.removeAttribute(null, "commentsAfter");

		//remove attribute 
		go.removeAttribute("LazyMatchedRule", "isNoDefault");
		go.removeAttribute(null, "children");
		go.removeAttribute(null, "isAssignment");
		go.removeAttribute("BindingStat", "propertyName");
		go.removeAttribute("RuleVariableDeclaration", "id");
		go.removeAttribute("RuleVariableDeclaration", "variableExp");
		go.removeAttribute( "SimpleInPatternElement", "mapsTo");
		go.removeAttribute( "SimpleInPatternElement", "id");
		go.removeAttribute( "SimpleInPatternElement", "initExpression");
		go.removeAttribute( "SimpleInPatternElement", "variableExp");
		go.removeAttribute( "SimpleOutPatternElement", "id");
		go.removeAttribute( "SimpleOutPatternElement", "initExpression");
		go.removeAttribute( "SimpleOutPatternElement", "variableExp");
		go.removeAttribute( "SimpleOutPatternElement", "reverseBindings");
		go.removeAttribute( "ForEachOutPatternElement", "id");
		go.removeAttribute( "ForEachOutPatternElement", "initExpression");
		go.removeAttribute( "ForEachOutPatternElement", "variableExp");
		go.removeAttribute( "ForEachOutPatternElement", "model");
		
			
		go.removeAttribute(null, "letExp");
		go.removeAttribute(null, "baseExp");
		
		// TODO: remove all the brackets in all rules, even its outermost brackets, but not for rules MatchedRule_Impl, CalledRule, LazyMatchedRule, ActionBlock ( also exclude some OCL rules here)
		List<String> excludedRule = new ArrayList<String>(Arrays.asList( "ForStat","IfStat","MatchedRule_Impl", "CalledRule","LazyMatchedRule","ActionBlock"));
		go.removeBraces(null, null, excludedRule);
		go.removeContainerBraces("ForStat");
		go.removeContainerBraces("IfStat");
		go.removeContainerBraces("ActionBlock");
		
		
		
		go.removeBraces("CalledRule", "parameters", null);
		go.addBracesToLine("CalledRule", "parameters");
		go.changeBracesToParentheses("CalledRule", "parameters");
		
		
		// Remove some keywords 
		// remove rule keywords
		go.removeKeyword("RuleVariableDeclaration", null, "RuleVariableDeclaration", null);
		go.removeKeyword("SimpleInPatternElement", null, "SimpleInPatternElement", null);
		go.removeKeyword("SimpleOutPatternElement", null, "SimpleOutPatternElement", null);
		go.removeKeyword("ForEachOutPatternElement", null, "ForEachOutPatternElement", null);
		go.removeKeyword("Binding", null, "Binding", null);
		go.removeKeyword("BindingStat", null, "BindingStat", null);
		go.removeKeyword("ExpressionStat", null, "ExpressionStat", null);
		go.removeKeyword("Root", null, "Root", null);
		
		
		
		// Change some keywords
		// Rule keywords to lower case
		go.renameKeyword("Module", null, "Module", "module", null);
		go.renameKeyword("Library", null, "Library", "library", null);
		go.renameKeyword("Query", null, "Query", "query", null);
		go.renameKeyword("Helper", null, "Helper", "helper", null);
		
				
		// Rule keywords to more descriptive names
		go.renameKeyword("LibraryRef", null, "LibraryRef", "uses", null);
		go.renameKeyword("LazyMatchedRule", null, "LazyMatchedRule", "rule", null);
		go.renameKeyword("MatchedRule_Impl", null, "MatchedRule", "rule", null);
		go.renameKeyword("CalledRule", null, "CalledRule", "rule", null);
		go.renameKeyword("InPattern", null, "InPattern", "from", null);
		go.renameKeyword("OutPattern", null, "OutPattern", "to", null);
		go.renameKeyword("ActionBlock", null, "ActionBlock", "do", null);
		go.renameKeyword("IfStat", null, "IfStat", "if", null);
		go.renameKeyword("ForStat", null, "ForStat", "for", null);
		
		
		
		// remove attribute keywords
		// remove all the keyword from the attributes which are in the form of X* or X ("," X)*
		go.removeKeyword(null, null, "superRule", null);
		//go.removeKeyword(null, null, "children", null);
		go.removeKeyword(null, null, "outPattern", null);
		go.removeKeyword(null, null, "actionBlock", null);
		//go.removeKeyword("MatchedRule_Impl", null, "variables", null);
		go.removeKeyword(null, null, "inPattern", null);
		
		
		go.removeKeywordsOfAllAttrs(null);
		//exceptions, keywords to keep/change:
		go.addKeywordToAttr(null, "isAbstract", "abstract", false);
		go.addKeywordToAttr(null, "isRefining", "refining", false);
		go.addKeywordToAttr(null, "isNoDefault", "nodefault", false);
		go.addKeywordToAttr(null,  "isUnique", "unique", false);
		go.addKeywordToAttr(null, "isEntrypoint", "entrypoint", false);
		go.addKeywordToAttr(null, "isEndpoint", "endpoint", false);
		
		go.addKeywordToLine("LazyMatchedRule", "isAbstract", "lazy", true);
		//("LazyMatchedRule", "isAbstract", "lazy", true, null);
		
		// Add attribute Keywords
		go.addKeywordToAttr(null, "variables", "using", true);
		go.addKeywordToAttr(null, "superRule", "extends", true);
		go.addKeywordToAttr( "ForStat", "iterator", "in", false);
		go.addKeywordToAttr( "ForStat", "for", "(", false);
		go.addKeywordToAttr( "ForStat", "collection", ")", false);
		go.addKeywordToAttr( "IfStat", "elseStatements", "else", true);
		go.addKeywordToAttr( "BindingStat", "value", "<-", true);
		go.addKeywordToAttr( "BindingStat", "value", ";", false);
		go.addKeywordToAttr( "ExpressionStat", "expression", ";", false);
		go.addKeywordToAttr( "Binding", "value", "<-", true);
		go.addKeywordToAttr( "RuleVariableDeclaration", "type", "=", false);
		go.addKeywordToAttr( "RuleVariableDeclaration", "varName", ":", false);
		go.addKeywordToAttr( "RuleVariableDeclaration", "initExpression", ";", false);
		go.addKeywordToAttr( "SimpleInPatternElement", "varName", ":", false);
		go.addKeywordToAttr( "SimpleInPatternElement", "models", "in", true);
		go.addKeywordToAttr( "SimpleOutPatternElement", "varName", ":", false);
		go.addKeywordToAttr( "SimpleOutPatternElement", "model", "in", true);
		go.addKeywordToAttr( "SimpleOutPatternElement", "sourceElement", "mapsTo", true);
//		go.addKeywordToAttr( "SimpleOutPatternElement", "bindings", "(", true, null);
//		go.addKeywordToAttr( "SimpleOutPatternElement", "bindings", ")", false, null);
		go.addKeywordToAttr( "ForEachOutPatternElement", "varName", ":", false);
		go.addKeywordToAttr( "ForEachOutPatternElement", "iterator", "in", false);
		go.addKeywordToAttr( "ForEachOutPatternElement", "sourceElement", "mapsTo", true);
		go.addKeywordToAttr( "ForEachOutPatternElement", "type", "foreach", false);
		go.addKeywordToAttr( "ForEachOutPatternElement", "type", "distinct", true);
		go.addSymbolToLine("ForEachOutPatternElement", "iterator", "(", true);
		go.addSymbolToLine( "ForEachOutPatternElement", "collection", ")", false);
		go.addKeywordToAttr( "Helper", "definition", ";", false);
		go.addKeywordToAttr( "LibraryRef", "name", ";", false);
		go.addKeywordToAttr( "Query", "name", "=", false);
		go.addKeywordToAttr( "Query", "body", ";", false);
		go.addKeywordToAttr( "Library", "name", ";", false);
		go.addKeywordToAttr( "Module", "name", ";", false);
		go.addKeywordToAttr( "Module", "name", "create", false);
		go.addKeywordToAttr( "Module", "inModels", ";", false);
		
		go.addAlternativeKeyword("Module", "isRefining", "refining", "from");
		go.addParenthesesWithoutQuotes("Module", ScopeKey.SINGLELINE, null, "isRefining", MultiplicityKey.PACKAGE_ONLY);
				
		
		//Make Booleans optional
		go.addOptionalityToAttr("LazyMatchedRule", "isUnique");
		go.addOptionalityToAttr("MatchedRule_Impl", "isRefining");
		go.addOptionalityToAttr("LazyMatchedRule", "isRefining");
		//MatchedRule_Impl, LazyMatchedRule 
		
		go.addOptionalityToAttr(null, "isAbstract");
		go.addOptionalityToAttr(null, "isNoDefault");
		go.addOptionalityToAttr(null, "isEntrypoint");
		go.addOptionalityToAttr(null, "isEndpoint");
		//go.addOptionalityToAttr("ForEachOutPatternElement", "bindings");
		
		
		
		go.removeOptionality(null, "inPattern");
		go.removeOptionality(null, "statements");
		go.removeOptionality(null, "thenStatements");
		go.removeOptionality("RuleVariableDeclaration", "type");
		go.removeOptionality("RuleVariableDeclaration", "varName");
		go.removeOptionality("RuleVariableDeclaration", "initExpression");
		go.removeOptionality("SimpleInPatternElement", "type");
		go.removeOptionality("SimpleInPatternElement", "varName");
		go.removeOptionality("SimpleOutPatternElement", "type");
		go.removeOptionality("SimpleOutPatternElement", "varName");
		go.removeOptionality("ForEachOutPatternElement", "type");
		go.removeOptionality("ForEachOutPatternElement", "varName");
		go.removeOptionality("Query", "helpers");
		go.removeOptionality("Query", "libraries");
		go.removeOptionality("Library", "helpers");
		go.removeOptionality("Library", "libraries");
		go.removeOptionality("Module", "elements");
		go.removeOptionality("Module", "libraries");
		go.removeOptionality("IfStat", "elseStatements");
		go.removeKeyword("IfStat", "elseStatements", "else", null);
		go.addParenthesesWithoutQuotes("IfStat", ScopeKey.SINGLELINE, null, "elseStatements", MultiplicityKey.PACKAGE_ONLY);
		go.addKeywordToLine("IfStat", "elseStatements", "else", true);
		go.addParenthesesWithoutQuotes("IfStat", ScopeKey.SINGLELINE, null, "elseStatements", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		
		// change the order of lines 
		go.moveLine("LazyMatchedRule", "isUnique", "isAbstract", true);
		go.moveLine("LazyMatchedRule", "inPattern", "variables", true);
		go.moveLine("LazyMatchedRule", "outPattern", "variables", false);
		go.moveLine("LazyMatchedRule", "actionBlock", "outPattern", false);
		go.moveLine("LazyMatchedRule", "superRule", "name", false);
		
		
		go.moveLine("MatchedRule_Impl", "isNoDefault", "isAbstract", true);
		go.moveLine("MatchedRule_Impl", "inPattern", "variables", true);
		go.moveLine("MatchedRule_Impl", "outPattern", "variables", false);
		go.moveLine("MatchedRule_Impl", "actionBlock", "outPattern", false);
		go.moveLine("MatchedRule_Impl", "superRule", "name", false);
		
		
		go.moveLine("CalledRule", "outPattern", "variables", false);
		go.moveLine("CalledRule", "actionBlock", "outPattern", false);
		go.moveLine("CalledRule", "parameters", "name", false);
		
		
		go.moveLine("ForStat", "iterator", "for", false); //ATTENTION: dependent on rename of keyword!
		go.moveLine("ForStat", "collection", "iterator", false);
		
		go.moveLine("SimpleInPatternElement", "type", "varName", false);
		go.moveLine("SimpleOutPatternElement", "type", "varName", false);
		go.moveLine("SimpleOutPatternElement", "model", "type", false);
		
		go.moveLine("ForEachOutPatternElement", "type", "varName", false);
		go.moveLine("ForEachOutPatternElement", "iterator", "type", false);
		go.moveLine("ForEachOutPatternElement", "collection", "iterator", false);
		
		go.moveLine("Query", "body", "name", false);
		
		go.moveLine("Module", "outModels", "name", false);
		go.moveLine("Module", "inModels", "outModels", false);
		go.moveLine("Module", "isRefining", "inModels", true);
		
				
		//Multiplicities
		go.convert1toStarToStar(null, "variables");
		go.convert1toStarToStar(null, "statements");
		go.convert1toStarTo1orStar("IfStat", "thenStatements") ;
		go.convert1toStarTo1orStar("IfStat", "elseStatements") ;
		go.convert1toStarToStar("Query", "libraries") ;
		go.convert1toStarToStar("Query", "helpers") ;
		go.convert1toStarToStar("Library", "libraries") ;
		go.convert1toStarToStar("Library", "helpers") ;
		go.convert1toStarToStar("Module", "libraries") ;
		go.convert1toStarToStar("Module", "elements") ;
		
		
		//Add parenthesis around multiple lines?
		go.addParenthesesToAttr("IfStat", "condition");
		go.addParenthesesToAttr("InPattern", "filter");
		go.removeParenthesesInSpecifiedAttr("SimpleInPatternElement", "models");
		//go.addParenthesesToAttr("SimpleOutPatternElement", "bindings");
		
		
		go.addBracesToLine("SimpleOutPatternElement", "bindings");
		go.changeBracesToParentheses("SimpleOutPatternElement", "bindings");
		go.addOptionalityToLine("SimpleOutPatternElement", "bindings");

		go.addBracesToLine("ForEachOutPatternElement", "bindings");
		go.changeBracesToParentheses("ForEachOutPatternElement", "bindings");
		go.addOptionalityToLine("ForEachOutPatternElement", "bindings");
		
		String actualOutput = go.spliceGrammar();
		//FileHelper.setFileText("Test_MyATLnoOCL1.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_MyATLnoOCL.txt", false);

		// compare text
//		Assert.assertEquals("The modified ATLnoOCL grammar is not expected!" + " \n " + StringUtils.difference(expectOutput.replaceAll("\\s+",""),actualOutput.replaceAll("\\s+","")), actualOutput.replaceAll("\\s+",""), expectOutput.replaceAll("\\s+",""));
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
