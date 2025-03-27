package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class X0toStarRuleTest {
	/**
	 * Change X 0...* to X*
	 * Apply this rule to a specified attribute in a specified grammar rule
	 * */
	@Test
	public void testX0toStarToXStar() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		Convert1toStarToStar x0toStarToXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarToStar();
		x0toStarToXStar.setGrammar(go.getGrammar());
		x0toStarToXStar.setGrammarRule("DotAst");
		x0toStarToXStar.setAttrName("graphs");
		x0toStarToXStar.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_X0toStarProcess_001.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	/**
	 * Change X 0...* to X*
	 * Apply this rule to all the attributes in a specified grammar rule
	 * */
	@Test
	public void testX0toStarToXStarInGrammarRule() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		Convert1toStarToStar x0toStarToXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarToStar();
		x0toStarToXStar.setGrammar(go.getGrammar());
		x0toStarToXStar.setGrammarRule("EdgeStmtSubgraph");
		x0toStarToXStar.setAttrName(null);
		x0toStarToXStar.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_X0toStarProcess_002.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	/**
	 * Change X 0...* to X*
	 * Apply this rule to all the attributes in a whole grammar
	 * */
	@Test
	public void testX0toStarToXStarInGrammar() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		Convert1toStarToStar x0toStarToXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarToStar();
		x0toStarToXStar.setGrammar(go.getGrammar());
		x0toStarToXStar.setGrammarRule(null);
		x0toStarToXStar.setAttrName(null);
		x0toStarToXStar.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_X0toStarProcess_003.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	/**
	 * Change '{' X ( "," X)* '}' to X | '{' X* '}'
	 * Apply this rule to a specified attribute in a specified grammar rule
	 * */
	@Test
	public void testSingleAttrSingleInstanceWithoutBraces() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		Convert1toStarTo1orStar x0toXStarToXorXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarTo1orStar();
		x0toXStarToXorXStar.setGrammar(go.getGrammar());
		x0toXStarToXorXStar.setGrammarRule("DotAst");
		x0toXStarToXorXStar.setAttrName("graphs");
		x0toXStarToXorXStar.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_X0toStarProcess_004.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	/**
	 * Change '{' X ( "," X)* '}' to X | '{' X* '}'
	 * Apply this rule to all the attributes in a specified grammar rule
	 * */
	@Test
	public void testMultiAttrSingleInstanceWithoutBraces() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		Convert1toStarTo1orStar x0toXStarToXorXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarTo1orStar();
		x0toXStarToXorXStar.setGrammar(go.getGrammar());
		x0toXStarToXorXStar.setGrammarRule("EdgeStmtNode");
		x0toXStarToXorXStar.setAttrName(null);
		x0toXStarToXorXStar.apply();
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_X0toStarProcess_005.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
	
	/**
	 * Change '{' X ( "," X)* '}' to X | '{' X* '}'
	 * Apply this rule to all the attributes in a whole grammar
	 * */
	@Test
	public void testMultiAttrAllInstancesWithoutBraces() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		go.processGrammar(input);
		
		// call the specific method for adding key keyword and get output text
		Convert1toStarTo1orStar x0toXStarToXorXStar = GrammaroptimizerFactory.eINSTANCE.createConvert1toStarTo1orStar();
		x0toXStarToXorXStar.setGrammar(go.getGrammar());
		x0toXStarToXorXStar.setGrammarRule(null);
		x0toXStarToXorXStar.setAttrName(null);
		x0toXStarToXorXStar.apply();
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_X0toStarProcess_006.txt", false);

		// compare text
		Assert.assertEquals(expectOutput, actualOutput);
	}
}
