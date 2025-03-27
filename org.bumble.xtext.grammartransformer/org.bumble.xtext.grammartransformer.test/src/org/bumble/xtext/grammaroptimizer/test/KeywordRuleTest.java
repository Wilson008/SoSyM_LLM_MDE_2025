package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class KeywordRuleTest {
	// test adding a keyword to a specified attribute in a specified class
	@Test
	public void testAddKeywordToAttr() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		AddKeywordToAttr addKeywordToAttr = GrammaroptimizerFactory.eINSTANCE.createAddKeywordToAttr();
		addKeywordToAttr.setGrammar(go.getGrammar());
		addKeywordToAttr.setGrammarRule("DotAst");
		addKeywordToAttr.setAttrName("graphs");
		addKeywordToAttr.setNewKeyword("test");
		addKeywordToAttr.setIsHead(true);
		addKeywordToAttr.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_KeywordProcess_001.txt", false);
		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}

		
	@Test
	public void testRemoveKeyword() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		RemoveKeyword removeKeyword = GrammaroptimizerFactory.eINSTANCE.createRemoveKeyword();
		removeKeyword.setGrammar(go.getGrammar());
		removeKeyword.setGrammarRule("DotAst");
		removeKeyword.setKeywordName("DotAst");
		removeKeyword.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_KeywordProcess_003.txt", false);
		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
}
