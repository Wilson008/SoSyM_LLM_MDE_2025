package org.bumble.xtext.grammaroptimizer.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingATLTest {
	@Test
	public void testAdaptingATL()  {
		// read text from file
		String input = FileHelper.getFileText("ATL.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		GrammarTransformer go = new GrammarTransformer();
		Assert.assertTrue(go.processGrammar(input));
		
		//Remove inherited comment attributes
		go.removeAttribute(null, "location");
		go.removeAttribute(null, "commentsBefore");
		go.removeAttribute(null, "commentsAfter");

		//remove attribute 
		//go.removeAttribute("CalledRule", "parameters");
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
		
		go.removeAttribute( "OclType_Impl", "name");
		go.removeAttribute( "OclType_Impl", "type");
		go.removeAttribute( "VariableExp", "type");
		go.removeAttribute( "SuperExp", "type");
		go.removeAttribute( "StringExp", "type");
		go.removeAttribute( "BooleanExp", "type");
		go.removeAttribute( "RealExp", "type");
		go.removeAttribute( "IntegerExp", "type");
		go.removeAttribute( "BagExp", "type");
		go.removeAttribute( "OrderedSetExp", "type");
		go.removeAttribute( "SequenceExp", "type");
		go.removeAttribute( "SetExp", "type");
		go.removeAttribute( "TupleExp", "type");
		go.removeAttribute( "MapExp", "type");
		go.removeAttribute( "EnumLiteralExp", "type");
		go.removeAttribute( "OclUndefinedExp", "type");
		go.removeAttribute( "NavigationOrAttributeCallExp", "type");
		go.removeAttribute( "OperationCallExp_Impl", "type");
		go.removeAttribute( "OperatorCallExp", "type");
		go.removeAttribute( "CollectionOperationCallExp", "type");
		go.removeAttribute( "IterateExp", "type");
		go.removeAttribute( "IteratorExp", "type");
		go.removeAttribute( "LetExp", "type");
		go.removeAttribute( "IfExp", "type");
		go.removeAttribute( "CollectionType_Impl", "type");
		go.removeAttribute( "StringType", "type");
		go.removeAttribute( "BooleanType", "type");
		go.removeAttribute( "IntegerType", "type");
		go.removeAttribute( "RealType", "type");
		go.removeAttribute( "BagType", "type");
		go.removeAttribute( "OrderedSetType", "type");
		go.removeAttribute( "SequenceType", "type");
		go.removeAttribute( "SetType", "type");
		go.removeAttribute( "OclAnyType", "type");
		go.removeAttribute( "TupleType", "type");
		go.removeAttribute( "OclModelElement", "type");
		go.removeAttribute( "MapType", "type");
		//go.removeAttribute( "TuplePart", "type");
		//go.removeAttribute( "VariableDeclaration_Impl", "type");
		go.removeAttribute( "Iterator", "type");
		//go.removeAttribute( "Parameter", "type");
		go.removeAttribute( "NavigationOrAttributeCallExp", "source");
		go.removeAttribute( "OperatorCallExp", "source");
		go.removeAttribute( "OperationCallExp_Impl", "source");
		go.removeAttribute( "CollectionOperationCallExp", "source");
		go.removeAttribute( "IterateExp", "source");
		go.removeAttribute( "IteratorExp", "source");
		//go.removeAttribute( "", "type");
		go.removeAttribute( "CollectionType_Impl", "name");
		go.removeAttribute( "StringType", "name");
		go.removeAttribute( "BooleanType", "name");
		go.removeAttribute( "IntegerType", "name");
		go.removeAttribute( "RealType", "name");
		go.removeAttribute( "BagType", "name");
		go.removeAttribute( "OrderedSetType", "name");
		go.removeAttribute( "SequenceType", "name");
		go.removeAttribute( "SetType", "name");
		go.removeAttribute( "TupleType", "name");		
		go.removeAttribute( "OclAnyType", "name");		
		go.removeAttribute( "MapType", "name");		
		go.removeAttribute( "VariableDeclaration_Impl", "id");		
		go.removeAttribute( "Parameter", "id");		
		go.removeAttribute( "TuplePart", "id");		
		go.removeAttribute( "Iterator", "id");		
		go.removeAttribute( "VariableDeclaration_Impl", "variableExp");		
		go.removeAttribute( "TuplePart", "variableExp");		
		
		go.removeAttribute( "Iterator", "variableExp");
		go.removeAttribute( "Iterator", "initExpression");		
		go.removeAttribute( "OclModel", "elements");		
		//go.removeAttribute( "OclModel", "model");		
		go.removeAttribute( "Parameter", "initExpression");
		go.removeAttribute( "Parameter", "variableExp");		
		
		
		// TODO: remove all the brackets in all rules, even its outermost brackets, but not for rules MatchedRule_Impl, CalledRule, LazyMatchedRule, ActionBlock ( also exclude some OCL rules here)
		List<String> excludedRule = new ArrayList<String>(Arrays.asList("TupleExp", "MapExp","SetExp","SequenceExp","OrderedSetExp","BagExp","ForStat","IfStat","MatchedRule_Impl", "CalledRule","LazyMatchedRule","ActionBlock"));
		go.removeBraces(null, null, excludedRule);
		go.removeContainerBraces("ForStat");
		go.removeContainerBraces("IfStat");
		go.removeContainerBraces("ActionBlock");
		
		go.removeBracesExceptContainer("BagExp");
		go.removeBracesExceptContainer("SetExp");
		go.removeBracesExceptContainer("OrderedSetExp");
		go.removeBracesExceptContainer("SequenceExp");
		go.removeBracesExceptContainer("TupleExp");
		go.removeBracesExceptContainer("MapExp");
		
		go.removeBraces("CalledRule", "parameters", null);
		go.addBracesToLine("CalledRule", "parameters");
		go.changeBracesToParentheses("CalledRule", "parameters");
		
		go.addBracesToLine("Operation", "parameters");
		go.changeBracesToParentheses("Operation", "parameters");
		
		go.addBracesToLine("CollectionOperationCallExp", "arguments");
		go.changeBracesToParentheses("CollectionOperationCallExp", "arguments");
		
		go.addBracesToLine("OperationCallExp_Impl", "arguments");
		go.changeBracesToParentheses("OperationCallExp_Impl", "arguments");
	
		
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
		go.removeKeyword("OclFeatureDefinition", null, "OclFeatureDefinition", null);
		go.removeKeyword("Attribute", null, "Attribute", null);
		go.removeKeyword("Operation", null, "Operation", null);
		go.removeKeyword("VariableExp", null, "VariableExp", null);
		go.removeKeyword("StringExp", null, "StringExp", null);
		go.removeKeyword("BooleanExp", null, "BooleanExp", null);
		go.removeKeyword("RealExp", null, "RealExp", null);
		go.removeKeyword("IntegerExp", null, "IntegerExp", null);
		go.removeKeyword("NavigationOrAttributeCallExp", null, "NavigationOrAttributeCallExp", null);
		go.removeKeyword("OperatorCallExp", null, "OperatorCallExp", null);
		go.removeKeyword("OperationCallExp_Impl", null, "OperationCallExp", null);
		go.removeKeyword("CollectionOperationCallExp", null, "CollectionOperationCallExp", null);
		go.removeKeyword("IteratorExp", null, "IteratorExp", null);
		go.removeKeyword("VariableDeclaration_Impl", null, "VariableDeclaration", null);
		go.removeKeyword("TuplePart", null, "TuplePart", null);
		go.removeKeyword("Parameter", null, "Parameter", null);
		go.removeKeyword("Iterator", null, "Iterator", null);
		go.removeKeyword("MapElement", null, "MapElement", null);
		go.removeKeyword("TupleTypeAttribute", null, "TupleTypeAttribute", null);
		go.removeKeyword("OclModel", null, "OclModel", null);
		
		
		
		// Change some keywords
		// Rule keywords to lower case
		go.renameKeyword("Module", null, "Module", "module", null);
		go.renameKeyword("Library", null, "Library", "library", null);
		go.renameKeyword("Query", null, "Query", "query", null);
		go.renameKeyword("Helper", null, "Helper", "helper", null);
		
		go.renameKeyword("OclContextDefinition", null, "OclContextDefinition", "context", null);
		go.renameKeyword("SuperExp", null, "SuperExp", "super", null);
		go.renameKeyword("BagExp", null, "BagExp", "Bag", null);
		go.renameKeyword("SetExp", null, "SetExp", "Set", null);
		go.renameKeyword("OrderedSetExp", null, "OrderedSetExp", "OrderedSet", null);
		go.renameKeyword("SequenceExp", null, "SequenceExp", "Sequence", null);
		go.renameKeyword("TupleExp", null, "TupleExp", "Tuple", null);
		go.renameKeyword("MapExp", null, "MapExp", "Map", null);
		go.renameKeyword("EnumLiteralExp", null, "EnumLiteralExp", "#", null);
		go.renameKeyword("OclUndefinedExp", null, "OclUndefinedExp", "OclUndefined", null);
		go.renameKeyword("IterateExp", null, "IterateExp", "iterate", null);
		
		
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
		go.renameKeyword("LetExp", null, "LetExp", "let", null);
		go.renameKeyword("IfExp", null, "IfExp", "if", null);
		go.renameKeyword("CollectionType_Impl", null, "CollectionType", "Collection", null);
		go.renameKeyword("StringType", null, "StringType", "String", null);
		go.renameKeyword("BooleanType", null, "BooleanType", "Boolean", null);
		go.renameKeyword("RealType", null, "RealType", "Real", null);
		go.renameKeyword("IntegerType", null, "IntegerType", "Integer", null);
		go.renameKeyword("BagType", null, "BagType", "Bag", null);
		go.renameKeyword("OrderedSetType", null, "OrderedSetType", "OrderedSet", null);
		go.renameKeyword("SetType", null, "SetType", "Set", null);
		go.renameKeyword("SequenceType", null, "SequenceType", "Sequence", null);
		go.renameKeyword("OclAnyType", null, "OclAnyType", "OclAny", null);
		go.renameKeyword("MapType", null, "MapType", "Map", null);
		
		
		
		// remove attribute keywords
		// remove all the keyword from the attributes which are in the form of X* or X ("," X)*
		go.removeKeyword(null, null, "superRule", null);
		//go.removeKeyword(null, null, "children", null);
		go.removeKeyword(null, null, "outPattern", null);
		go.removeKeyword(null, null, "actionBlock", null);
		//go.removeKeyword("MatchedRule_Impl", null, "variables", null);
		go.removeKeyword(null, null, "inPattern", null);
		go.removeKeyword(null, null, "OclModelElement", null);
		
		
		go.removeKeywordsOfAllAttrs(null);
		//exceptions, keywords to keep/change:
		go.addKeywordToLine(null, "isAbstract", "abstract", false);
		go.addKeywordToLine(null, "isRefining", "refining", false);
		go.addKeywordToLine(null, "isNoDefault", "nodefault", false);
		go.addKeywordToLine(null,  "isUnique", "unique", false);
		go.addKeywordToLine(null, "isEntrypoint", "entrypoint", false);
		go.addKeywordToLine(null, "isEndpoint", "endpoint", false);
				
		
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
		go.addKeywordToAttr( "SimpleOutPatternElement", "bindings", "(", true);
		go.addKeywordToAttr( "SimpleOutPatternElement", "bindings", ")", false);
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
		
//		go.addKeywordToAttr( "OclFeatureDefinition", "feature", "def", true, null);
//		go.addKeywordToAttr( "OclFeatureDefinition", "feature", ":", true, null);
		go.addSymbolToLine("OclFeatureDefinition", "feature", ":", true);
		go.addKeywordToLine("OclFeatureDefinition", "feature", "def", true);
		
		go.addKeywordToLine( "Attribute", "name", ":", false);
		go.addKeywordToLine( "Attribute", "type", "=", false);
		
		go.addKeywordToAttr( "Operation", "returnType", ":", true);
		go.addKeywordToAttr( "Operation", "returnType", "=", false);
		go.addKeywordToAttr( "IterateExp", "iterators", ";", false);
		go.addKeywordToAttr( "IterateExp", "result", "|", false);
		go.addKeywordToAttr( "IterateExp", "body", ")", false);
		go.addKeywordToAttr( "IterateExp", "iterators", "(", true);
		go.addKeywordToAttr( "IteratorExp", "iterators", "|", false);
		go.addKeywordToAttr( "IteratorExp", "body", ")", false);
		go.addKeywordToAttr( "IteratorExp", "iterators", "(", true);
		//go.addKeywordToAttr( "CollectionOperationCallExp", "arguments", ")", false, null);
		//go.addKeywordToAttr( "CollectionOperationCallExp", "arguments", "(", true, null);
		
		go.addKeywordToAttr( "LetExp", "variable", "in", false);
		go.addKeywordToAttr( "IfExp", "condition", "then", false);
		go.addKeywordToAttr( "IfExp", "thenExpression", "else", false);
		go.addKeywordToAttr( "IfExp", "elseExpression", "endif", false);
		
		go.addKeywordToAttr( "CollectionType_Impl", "elementType", "(", true);
		go.addKeywordToAttr( "CollectionType_Impl", "elementType", ")", false);
		go.addKeywordToAttr( "BagType", "elementType", "(", true);
		go.addKeywordToAttr( "BagType", "elementType", ")", false);
		go.addKeywordToAttr( "SetType", "elementType", "(", true);
		go.addKeywordToAttr( "SetType", "elementType", ")", false);
		go.addKeywordToAttr( "OrderedSetType", "elementType", "(", true);
		go.addKeywordToAttr( "OrderedSetType", "elementType", ")", false);
		go.addKeywordToAttr( "SequenceType", "elementType", "(", true);
		go.addKeywordToAttr( "SequenceType", "elementType", ")", false);
//		go.addKeywordToAttr( "TupleType", "attributes", "(", true, null);
//		go.addKeywordToAttr( "TupleType", "attributes", ")", false, null);
		go.removeOptionality("TupleType", "attributes");
		go.addBracesToLine("TupleType", "attributes");
		go.changeBracesToParentheses("TupleType", "attributes");
		go.addParenthesesWithoutQuotes("TupleType", ScopeKey.SINGLELINE, null, "attributes", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		go.addKeywordToAttr( "OclModelElement", "name", "!", false);
		
		go.addKeywordToAttr( "MapType", "valueType", "(", true);
		go.addKeywordToAttr( "MapType", "valueType", ",", false);
		go.addKeywordToAttr( "MapType", "keyType", ")", false);
		
		go.addKeywordToAttr( "MapElement", "key", "(", true);
		go.addKeywordToAttr( "MapElement", "key", ",", false);
		go.addKeywordToAttr( "MapElement", "value", ")", false);
		
		go.addKeywordToAttr( "TupleTypeAttribute", "name", ":", false);
		go.addKeywordToAttr( "OclModel", "name", ":", false);
		
		go.addKeywordToAttr( "VariableDeclaration_Impl", "varName", ":", false);
		go.addKeywordToAttr( "VariableDeclaration_Impl", "type", "=", false);
			
		go.addKeywordToAttr( "TuplePart", "type", ":", true);
		go.addKeywordToAttr( "TuplePart", "initExpression", "=", true);
		
		go.addKeywordToAttr( "Parameter", "type", ":", true);
		
		
		//Make Booleans optional
		go.addOptionalityToAttr("LazyMatchedRule", "isUnique");
		go.addOptionalityToAttr(null, "isRefining");
		go.addOptionalityToAttr(null, "isAbstract");
		go.addOptionalityToAttr(null, "isNoDefault");
		go.addOptionalityToAttr(null, "isEntrypoint");
		go.addOptionalityToAttr(null, "isEndpoint");
		//go.addOptionalityToAttr(null, "isAssignment");
		
		go.removeOptionality(null, "inPattern");
		go.removeOptionality(null, "statements");
		go.removeOptionality(null, "thenStatements");
		go.removeOptionality("RuleVariableDeclaration", "type");
		go.removeOptionality("RuleVariableDeclaration", "initExpression");
		go.removeOptionality("SimpleInPatternElement", "type");
		go.removeOptionality("SimpleOutPatternElement", "type");
		go.removeOptionality("ForEachOutPatternElement", "type");
		go.removeOptionality("Query", "helpers");
		go.removeOptionality("Query", "libraries");
		go.removeOptionality("Library", "helpers");
		go.removeOptionality("Library", "libraries");
		go.removeOptionality("Module", "elements");
		go.removeOptionality("Module", "libraries");
		go.removeOptionality("VariableDeclaration_Impl", "type");
		go.removeOptionality("VariableDeclaration_Impl", "initExpression");
		go.removeOptionality("TuplePart", "initExpression");
		go.removeOptionality("Parameter", "type");
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
		
		go.moveLine("OclFeatureDefinition", "feature", "context_", false);
		go.moveLine("Attribute", "type", "name", false);
		
		go.moveLine("IterateExp", "body", "result", false);
		go.moveLine("IteratorExp", "body", "iterators", false);
		
		go.moveLine("IfExp", "condition", "thenExpression", true);
		
		
		// Addkeyword
		//("LazyMatchedRule", "isAbstract", "lazy", true, null);
		
		
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
		//go.addParenthesesToAttr("ForStat", "iterator");
		go.addParenthesesToAttr("IfStat", "condition");
		go.addParenthesesToAttr("InPattern", "filter");
		go.removeParenthesesInSpecifiedAttr("SimpleInPatternElement", "models");
		//go.addParenthesesToAttr("SimpleOutPatternElement", "bindings");
		
		//go.addParenthesesToAttr("Attribute", "parameters");
		//go.addParenthesesToAttr("OperationCallExp_Impl", "arguments");
		go.addAlternativeKeyword("Module", "isRefining", "refining", "from");
		go.addKeywordToLine("LazyMatchedRule", "isUnique", "lazy", false);
		
		// remove all the commas except only some of them
		//List<String> excludedAttr = new ArrayList();
		//excludedAttr.add("allocateableElement_context");
		//excludedAttr.add("allocationTarget_context");
		//excludedAttr.add("identifiable_context");
		//go.removeComma(null, null, excludedAttr);
		
		
		String actualOutput = go.spliceGrammar();
		//FileHelper.setFileText("Test_MyATL.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_MyATL.txt", false);

		// compare text
//		Assert.assertEquals("The modified ATL grammar is not expected!" + " \n " + StringUtils.difference(expectOutput.replaceAll("\\s+",""),actualOutput.replaceAll("\\s+","")), expectOutput.replaceAll("\\s+",""), actualOutput.replaceAll("\\s+",""));
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
