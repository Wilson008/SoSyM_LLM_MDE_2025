package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingMyDotTest {
	@Test
	public void testAdaptingMyDot() {
		GrammarTransformer go = new GrammarTransformer();

		// read text from file
		String input = FileHelper.getFileText("Dot.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		go.processGrammar(input);

		// optimize grammar rule DotAst
		go.removeKeyword("DotAst", null, null, null);		
		go.removeBraces("DotAst", null, null);		
		go.convert1toStarToStar("DotAst", "graphs");
		go.removeOptionality("DotAst", "graphs");
		
		// optimize grammar rule Stmt
		go.removeRuleCall("Stmt", "Stmt_Impl");
		go.removeRuleCall("Stmt", "EdgeStmtSubgraph");
		go.removeRuleCall("Stmt", "Subgraph");
		go.addParenthesesWithoutQuoteToRule("Stmt", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolToRule("Stmt", ";");
		go.addOptionalityToSymbol("Stmt", null, ";");
		
		go.changeCalledRule("Stmt", "SubgraphOrEdgeStmtSubgraph_Impl", "SubgraphOrEdgeStmtSubgraph");
		
		go.removeRuleCall("EdgeRhs", "EdgeRhs_Impl");
		
		go.removeKeyword("DotGraph", null, "DotGraph", null);
		go.removeKeyword("DotGraph", null, "type", null);
		go.removeKeyword("DotGraph", null, "stmts", null);
		
		go.removeBracesExceptContainer("DotGraph");
		
		go.removeOptionality("DotGraph", "type");
		go.removeOptionality("DotGraph", "stmts");
		
		go.convert1toStarToStar("DotGraph", "stmts");
		
		go.moveLine("DotGraph", "type", "name", true);
		
		go.changeTypeOfAttr("DotGraph", "name", "EString", "ID");
		
		// add optionality to the attribute name in rule DotGraph
		go.addOptionalityToAttr("DotGraph", "name");
		
		// remove rule EBoolean and Stmt_Impl
		go.removeRule("EBoolean");
		go.removeRule("Stmt_Impl");
		
		// adapt EdgeStmtNode
		go.removeKeyword("EdgeStmtNode", null, null, null);
		
		go.removeBraces("EdgeStmtNode", null, null);
		
		go.removeOptionality("EdgeStmtNode", null);
		
		go.convert1toStarToPlus("EdgeStmtNode", "edgeRHS");

		go.convert1toStarToStar("EdgeStmtNode", "attrLists");
		
		// adapt EdgeStmtSubgraph
		go.removeKeyword("EdgeStmtSubgraph", null, null, null);
		
		go.removeBraces("EdgeStmtSubgraph", null, null);
		
		go.removeOptionality("EdgeStmtSubgraph", null);
		
		go.convert1toStarToPlus("EdgeStmtSubgraph", "edgeRHS");

		go.convert1toStarToStar("EdgeStmtSubgraph", "attrLists");
		
		// adapt NodeStmt
		go.removeKeyword("NodeStmt", null, null, null);
		
		go.removeBraces("NodeStmt", null, null);
		
		go.removeOptionality("NodeStmt", null);
		
		go.convert1toStarToStar("NodeStmt", "attrLists");
		
		// adapt AttrStmt
		go.removeKeyword("AttrStmt", null, null, null);
		
		go.removeBraces("AttrStmt", null, null);
		
		go.removeOptionality("AttrStmt", null);
		
		go.convert1toStarToPlus("AttrStmt", "attrLists");
		
		// adapt Attribute
		go.removeBraces("Attribute", null, null);
		
		go.removeKeyword("Attribute", null, "Attribute", null);
		
		go.removeOptionality("Attribute", "value");
		
		go.renameKeyword("Attribute", "value", "value", "=", null);
		
		go.renameRule("SubgraphOrEdgeStmtSubgraph_Impl", "SubgraphOrEdgeStmtSubgraph");
		
		go.changeRuleContent("SubgraphOrEdgeStmtSubgraph", "Subgraph ({EdgeStmtSubgraph.subgraph=current}\n    (edgeRHS+=EdgeRhs)+\n    (attrLists+=AttrList)*)?;");
		
		
		// adapt Subgraph
		go.removeKeyword("Subgraph");
		// add optionality to attribute name
		go.addOptionalityToAttr("Subgraph", "name");
		go.addKeywordToLine("Subgraph", "name", "subgraph", true);
		go.changeTypeOfAttr("Subgraph", "name", "EString", "ID");
		go.addParenthesesWithoutQuotes("Subgraph", ScopeKey.SINGLELINE, null, "name", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		go.removeOptionality("Subgraph", "stmts");
		
		go.removeKeyword("Subgraph", "stmts", "stmts", null);
		
		go.removeBraces("Subgraph", "stmts", null);
		
		go.convert1toStarToStar("Subgraph", "stmts");
		
		// adapt NodeId
		go.removeKeyword("NodeId", null, null, null);
		
		go.removeBraces("NodeId", null, null);
		
		go.changeTypeOfAttr("NodeId", "name", "EString", "ID");
		
		go.removeRule("EdgeRhs_Impl");
		
		// adapt AttrList
		go.removeKeyword("AttrList");
		go.removeBracesExceptContainer("AttrList");
		
		go.changeBracesToSquare("AttrList", null);
		
		go.convert1toStarToStar("AttrList", "attributes");
		
		go.removeOptionality("AttrList", "attributes");
		
		go.addSymbolToAttr("AttrList", "attributes", ",", false, null, true, false);
		go.addOptionalityToSymbol("AttrList", "attributes", ",");
		
		// it'd be better if there is a dedicated method for adding alternative symbol to an existing symbol
		go.addAlternativeSymbol("AttrList", "attributes", ",", ";");
		
		// adapt Port
		// change the content of Port to "":" (=> compass_pt=COMPASS_PT | name=ID | name=ID ":" compass_pt=COMPASS_PT);"
		go.changeRuleContent("Port", "{Port}\n    \':\'\n    (=> compass_pt=COMPASS_PT |\n        name=ID |\n        name=ID \":\" compass_pt=COMPASS_PT);");
		
		// adapt EdgeOp
		go.renameKeyword("EdgeOp", null, "directed", "->", null);
		go.renameKeyword("EdgeOp", null, "undirected", "--", null);
		
		// adapt EdgeRhsNode
		go.removeKeyword("EdgeRhsNode", null, null, null);
		
		go.removeBraces("EdgeRhsNode", null, null);
		
		go.removeOptionality("EdgeRhsNode", null);
		
		// adapt EdgeRhsSubgraph
		go.removeKeyword("EdgeRhsSubgraph", null, null, null);
		
		go.removeBraces("EdgeRhsSubgraph", null, null);
		
		go.removeOptionality("EdgeRhsSubgraph", null);
		// add primitive type COMPASS_PT
		go.addTerminalRule("COMPASS_PT", "'n' | 'ne' | 'e' | 'se' | 's' | 'sw' | 'w' | 'nw' | 'c' | '_';", null);
		
		String actualOutput = go.spliceGrammar();
		//FileHelper.setFileText("Test_MyDot.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_MyDot.txt", false);

		// compare text
		//Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
