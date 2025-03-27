package org.bumble.xtext.grammaroptimizer.test;

import java.util.ArrayList;
import java.util.List;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingEastAdlFullTest {
	@Test
	public void testAdaptingEastAdlFull() {
		GrammarTransformer go = new GrammarTransformer();

		// read text from file
		String input = FileHelper.getFileText("EastAdlFull.txt", true);

		// Remove tab symbols
		input = input.replaceAll("\t", "    ");

		go.processGrammar(input);

		// Add/Implement the needed grammar rules/terminals
		go.addPrimitiveType("EString", "ecore::EString", "    STRING | ID;", null);
		go.addPrimitiveType("Integer", "Integer", "    INT;", null);
		go.addPrimitiveType("Boolean", "ecore::EBoolean", "    'true' | 'false';", null);
		go.addPrimitiveType("Float", "ecore::EDouble", "    INT '.' INT;", null);
		go.addPrimitiveType("String0", "String", "    ID;", null);
		go.addPrimitiveType("Identifier", "Identifier", "    ID;", null);
		go.addPrimitiveType("Numerical", "Numerical", "EABINARY | EAOCTAL | INT | EAHEX | EAEXPONENT;", null);
		go.addTerminalRule("EABINARY", "('0b'('0'..'1')*);", null);
		go.addTerminalRule("EAOCTAL", "('0'('1'..'7')('0'..'7')*);", null);
		go.addTerminalRule("EAHEX", "('0x'('0'..'9'|'a'..'f')*);", null);
		go.addTerminalRule("EAEXPONENT", "('0'..'9')+('e'|'E')('+'|'-')?('0'..'9')+;", null);
		go.addPrimitiveType("UUID", "ecore::EString", "    STRING;", null);

		// remove all the brackets except the outermost brackets for all the grammar
		// rules
		go.removeBracesExceptContainer(null);

		// remove all the brackets in rule EAXML, even its outermost brackets
		go.removeBraces("EAXML", null, null);

		// remove some keywords (for simplifying the language)
		// remove all the keyword from the attributes which are in the form of X* or X
		// ("," X)*
		List<String> excludedAttributes = new ArrayList<String>();
		excludedAttributes.add("justification");
		go.removeXStarAttrKeyword(null, null, excludedAttributes);

		// remove keyword EAXML
		go.removeKeyword("EAXML", null, "EAXML", null);

		// remove all the keyword shortName from all the grammar rules in the grammar
		go.removeKeyword(null, "shortName", "shortName", null);

		// change the order of attributes (move shortName)
		go.moveAttrToAfterRuleKeyword(null, "shortName");

		// remove all the commas except only some of them
		excludedAttributes.clear();
		excludedAttributes.add("allocateableElement_context");
		excludedAttributes.add("allocationTarget_context");
		excludedAttributes.add("identifiable_context");
		go.removeComma(null, null, excludedAttributes);

		go.changeTypeOfAttr(null, "uuid", "String0", "UUID");

		// allow empty attribute existing
		go.addOptionalityToContainerBraces(null, MultiplicityKey.MULTIPLICITY_OPTIONAL);

		go.addKeywordToAttr("FeatureModel", "featureLink", "featureLink", true);
		go.addKeywordToAttr("VerificationValidation", "verify", "verify", true);
		go.addKeywordToAttr("ArbitraryConstraint", "minimum", "minimum", true);
		go.addKeywordToAttr("ArbitraryConstraint", "maximum", "maximum", true);

		// add ';' to the attributes which is not 0...* or 1...*, and the name is not
		// shortName
		excludedAttributes.clear();
		excludedAttributes.add("shortName");
		go.addSymbolToAttr(null, null, ";", false, excludedAttributes, true, true);

//		go.changeTypeOfAttr("ModeGroup", "precondition", "String0", "EString");
//		go.changeTypeOfAttr("Mode", "condition", "String0", "EString");
//		go.changeTypeOfAttr("Requirement_Impl", "text", "String0", "EString");
		
		go.removeRule("String0");
		go.changeTypeOfAttr(null, null, "String0", "EString");
		go.changeTypeOfAttr(null, "text", "EString", "STRING");
		go.changeTypeOfAttr(null, "uri", "EString", "STRING");
		go.changeTypeOfAttr(null, "name", "EString", "Identifier");
		

		String actualOutput = go.spliceGrammar();
//		FileHelper.setFileText("Test_EastAdlFull.txt", actualOutput);
		String expectedOutput = FileHelper.getFileText("Test_EastAdlFull.txt", false);

		// compare text
		Assert.assertEquals("The modified grammar is not expected!", expectedOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
