package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingMyBibTexTest {
	@Test
	public void testAdaptingMyBibTex() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("MyBibTex.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");

		go.processGrammar(input);
		
		go.removeRule("EString");
		go.changeTypeOfAttr(null, null, "EString", "STRING");
		go.changeTypeOfAttr(null, "key", "STRING", "ID");
		
		// remove keyword 'Bibtex' and 'entries'
		go.removeKeyword("Bibtex", null, "Bibtex", null);
		go.removeKeyword("Bibtex", null, "entries", null);
		
		// remove all the brackets from grammar rule "Bibtex"
		go.removeBraces("Bibtex", null, null);
		
		// adapt all the entry rules
		go.addStringToRuleKeyword(null, "fields", "@", true);
		
		// rename keyword from 'value' to '='
		go.renameKeyword(null, null, "value", "=", "value");
		
		// remove keyword 'key' and keyword 'fields' from attribute key
		go.removeKeyword(null, null, "key", "fields");
		go.removeKeyword(null, null, "fields", "fields");
		
		// add keyword ','
		//go.addKeywordToAttr(null, "key", ",", false, "fields");
		go.addKeywordToAttr(null, "key", ",", false);
		
		// remove attribute location/commentsBefore/commentsAfter
		go.removeAttribute(null, "location");
		go.removeAttribute(null, "commentsBefore");
		go.removeAttribute(null, "commentsAfter");
		
		// remove brackets from attribute fields
		go.removeBraces(null, "fields", null);
		
		// remove brackets
		go.removeBraces(null, null, "value", null);
		
		// move the attribute key to the front of attribute location
		go.moveLine(null, "key", "location", true);
		
		String actualOutput = go.spliceGrammar();
		FileHelper.setFileText("Test_MyBibTex1.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_MyBibTex.txt", false);

		// compare text
		//Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
