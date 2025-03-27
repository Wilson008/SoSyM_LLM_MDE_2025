package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class BracketRuleTest {
	@Test
	public void testRemoveAllBracketsInGrammar() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveBraces removeBrackets = GrammaroptimizerFactory.eINSTANCE.createRemoveBraces();
		removeBrackets.setGrammar(go.getGrammar());
		removeBrackets.setGrammarRule(null);
		removeBrackets.setAttrName(null);
		removeBrackets.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_001.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testRemoveOnlyRuleBrackets() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveOutermostBraces removeOutermostBracket = GrammaroptimizerFactory.eINSTANCE.createRemoveOutermostBraces();
		removeOutermostBracket.setGrammar(go.getGrammar());
		removeOutermostBracket.setGrammarRule("AttrList");
		removeOutermostBracket.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_002.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testRemoveBracketsInAttrs() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		RemoveBracesExceptOutermost removeBracketExceptOutermost = GrammaroptimizerFactory.eINSTANCE.createRemoveBracesExceptOutermost();
		removeBracketExceptOutermost.setGrammar(go.getGrammar());
		removeBracketExceptOutermost.setGrammarRule("AttrList");
		removeBracketExceptOutermost.setAttrName(null);
		removeBracketExceptOutermost.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_003.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	/**
	 * Remove the brackets from all the attributes except the outermost brackets
	 * from all the rules within the grammar.
	 * */
	@Test
	public void testRemoveAllBracketInAttrs() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		RemoveBracesExceptOutermost removeBracketExceptOutermost = GrammaroptimizerFactory.eINSTANCE.createRemoveBracesExceptOutermost();
		removeBracketExceptOutermost.setGrammar(go.getGrammar());
		removeBracketExceptOutermost.setGrammarRule(null);
		removeBracketExceptOutermost.setAttrName(null);
		removeBracketExceptOutermost.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_004.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testRemoveBracketsInSpecifiedAttr() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		RemoveBraces removeBrackets = GrammaroptimizerFactory.eINSTANCE.createRemoveBraces();
		removeBrackets.setGrammar(go.getGrammar());
		removeBrackets.setGrammarRule("EdgeStmtNode");
		removeBrackets.setAttrName("edgeRHS");
		removeBrackets.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_005.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testChangeBracketToSquareForAll() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		ChangeBracesToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracesToSquare();
		changeBracketToSquare.setGrammar(go.getGrammar());
		changeBracketToSquare.setGrammarRule(null);
		changeBracketToSquare.setAttrName(null);
		changeBracketToSquare.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_006.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testChangeRuleBracketToSquare() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		ChangeBracesToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracesToSquare();
		changeBracketToSquare.setGrammar(go.getGrammar());
		changeBracketToSquare.setGrammarRule("DotAst");
		changeBracketToSquare.setAttrName(null);
		changeBracketToSquare.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_007.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	@Test
	public void testChangeAttrBracketToSquare() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		ChangeBracesToSquare changeBracketToSquare = GrammaroptimizerFactory.eINSTANCE.createChangeBracesToSquare();
		changeBracketToSquare.setGrammar(go.getGrammar());
		changeBracketToSquare.setGrammarRule("EdgeStmtNode");
		changeBracketToSquare.setAttrName("attrLists");
		changeBracketToSquare.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_BracketProcess_008.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
}
