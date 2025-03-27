package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class OptionalityTest {
	@Test
	public void testRemoveOptOfSingleAttr() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveOptionality removeOptionality = GrammaroptimizerFactory.eINSTANCE.createRemoveOptionality();
		removeOptionality.setGrammar(go.getGrammar());
		removeOptionality.setGrammarRule("EdgeRhsNode");
		removeOptionality.setAttrName("op");
		removeOptionality.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_OptionalityProcess_001.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testRemoveOptOfAttrInRule() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveOptionality removeOptionality = GrammaroptimizerFactory.eINSTANCE.createRemoveOptionality();
		removeOptionality.setGrammar(go.getGrammar());
		removeOptionality.setGrammarRule("EdgeRhsNode");
		removeOptionality.setAttrName(null);
		removeOptionality.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_OptionalityProcess_002.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testRemoveOptOfAttrInGrammar() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveOptionality removeOptionality = GrammaroptimizerFactory.eINSTANCE.createRemoveOptionality();
		removeOptionality.setGrammar(go.getGrammar());
		removeOptionality.setGrammarRule(null);
		removeOptionality.setAttrName(null);
		removeOptionality.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_OptionalityProcess_003.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testChangeOptOfAttrToOrInRule() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		ChangeOptionalAttrToOrRelation changeOptOfAttrToOrInRule = GrammaroptimizerFactory.eINSTANCE.createChangeOptionalAttrToOrRelation();
		changeOptOfAttrToOrInRule.setGrammar(go.getGrammar());
		changeOptOfAttrToOrInRule.setGrammarRule("EdgeRhsNode");
		changeOptOfAttrToOrInRule.setIsAll(true);
		changeOptOfAttrToOrInRule.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_OptionalityProcess_004.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
}
