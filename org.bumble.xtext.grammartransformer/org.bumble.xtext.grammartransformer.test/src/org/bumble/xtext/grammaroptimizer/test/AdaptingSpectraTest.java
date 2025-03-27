package org.bumble.xtext.grammaroptimizer.test;

import java.util.ArrayList;
import java.util.List;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingSpectraTest {
	@Test
	public void testAdaptingSpectra() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Spectra.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		go.processGrammar(input);
		
		
		go.addPrimitiveType("PrimaryRegExp", "RegExp", "'(' RegExp ')' | val=('TRUE' |'FALSE' | 'true' | 'false') | assrt=BooleanTerm  | empty?='()';", null);;
		go.addTerminalRule("SL_COMMENT", "('//' | '--') !('\\n' | '\\r')* ('\\r'? '\\n')?;", "Override");
		go.addPrimitiveType("TypeConstantLiteral", null, "    ID | INT;", null);
		go.changeTypeOfAttr(null, null, "EInt", "INT");
		go.changeTypeOfAttr(null, null, "EString", "ID");
		
		// remove all the imports
		go.removeImport(null);
		go.addImport("http://smlab.cs.tau.ac.il/syntech/Spectra", null);
		go.addImport("http://www.eclipse.org/emf/2002/Ecore", "ecore");
		
		// Remove rule EString/Decl_Impl/TemporalExpression_Impl/EBoolean/PredicateOrPatternReferrable_Impl/Referrable_Impl/RegExp_Impl/EInt
		go.removeRule("EString");
		go.removeRule("Decl_Impl");
		go.removeRule("TemporalExpression_Impl");
		go.removeRule("PredicateOrPatternReferrable_Impl");
		go.removeRule("Referrable_Impl");
		go.removeRule("RegExp_Impl");
		go.removeRule("EBoolean");
		go.removeRule("EInt");
		
		// Adapt rule Model
		go.removeKeywordsOfAllAttrs("Model");
		go.removeBraces("Model", null, null);
		go.convert1toStarToStar("Model", "imports");
		go.convert1toStarToPlus("Model", "elements");
		go.renameKeyword("Model", null, "Model", "module", null);
		go.addParenthesesWithoutQuotes("Model", ScopeKey.SINGLEKEWORD, "module", null, MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("Model", null, "module", "spec");
		go.removeOptionality("Model", null);
		go.moveLine("Model", "imports", "module", true);
		
		// Adapt rule Decl
		go.removeRuleCall("Decl", "Decl_Impl");
		
		go.changeRuleContent("TemporalExpression", "QuantifierExpr;");
		go.changeRuleContent("RegExp", "BinaryRegExp;");
		
		// Adapt rule TemporalExpression
		go.removeRuleCall("TemporalExpression", "TemporalExpression_Impl");
		
		// Adapt rule RegExp
		go.removeRuleCall("RegExp", "RegExp_Impl");
		
		// Adapt rule PredicateOrPatternReferrable
		go.removeRuleCall("PredicateOrPatternReferrable", "PredicateOrPatternReferrable_Impl");
		
		// Adapt rule Referrable
		go.removeRuleCall("Referrable", "Referrable_Impl");
		
		// Adapt rule Import
		go.removeBraces("Import", null, null);
		go.removeOptionality("Import", null);
		go.removeKeyword("Import", null, "Import", null);
		go.renameKeyword("Import", "importURI", "importURI", "import", null);
		go.changeTypeOfAttr("Import", "importURI", "ID", "STRING");
		
		// Adapt rule WeightDef
		go.renameKeyword("WeightDef", null, "WeightDef", "weight", null);
		go.removeBraces("WeightDef", null, null);
		go.removeKeywordsOfAllAttrs("WeightDef");
		go.removeOptionality("WeightDef", null);
		go.addOptionalityToAttr("WeightDef", "name");
		go.changeTypeOfAttr("WeightDef", "negative", "ID", "('-')?");
		go.addSymbolToAttr("WeightDef", "name", ":", false, null, true, true);
		go.addSymbolToRule("WeightDef", ";");
		go.changeTypeOfAttr("WeightDef", "definition", "TemporalExpression", "TemporalInExpr");
		
		// Adapt rule Var
		go.removeBraces("Var", null, null);
		go.removeKeyword("Var", null, null, null);
		go.removeOptionality("Var", null);
		
		// Adapt rule TypeDef
		go.removeBraces("TypeDef", null, null);
		go.removeOptionality("TypeDef", null);
		go.renameKeyword("TypeDef", "type", "type", "=", null);
		go.renameKeyword("TypeDef", null, "TypeDef", "type", null);
		go.addSymbolToRule("TypeDef", ";");
		
		// Adapt rule Define
		go.renameKeyword("Define", null, "Define", "define", null);
		go.removeKeywordsOfAllAttrs("Define");
		go.removeBraces("Define", null, null);
		go.removeOptionality("Define", null);
		go.convert1toStarToPlus("Define", "defineList");
		
		// Adapt rule DefineRegExp
		go.renameKeyword("DefineRegExp", null, "DefineRegExp", "regexp", null);
		go.removeKeywordsOfAllAttrs("DefineRegExp");
		go.removeBraces("DefineRegExp", null, null);
		go.removeOptionality("DefineRegExp", null);
		go.convert1toStarToPlus("DefineRegExp", "defineRegsList");
		
		// Adapt rule Counter
		go.renameKeyword("Counter", null, "Counter", "counter", null);
		go.removeBracesExceptContainer("Counter");
		go.convert1toStarTo1("Counter", null);
		go.moveLine("Counter", "range", "name", false);
		go.moveLine("Counter", "underflowMethod", "decPred", false);
		go.moveLine("Counter", "overflowMethod", "underflowMethod", true);
		go.removeOptionality("Counter", "range");
		go.removeKeyword("Counter", "range", "range", null);
		go.addParenthesesToAttr("Counter", "range");
		go.removeKeyword("Counter", "initial", "initial", null);
		go.renameKeyword("Counter", "resetPred", "resetPred", "reset:", null);
		go.renameKeyword("Counter", "incPred", "incPred", "inc:", null);
		go.renameKeyword("Counter", "decPred", "decPred", "dec:", null);
		go.renameKeyword("Counter", "overflowMethod", "overflowMethod", "overflow:", null);
		go.renameKeyword("Counter", "underflowMethod", "underflowMethod", "underflow:", null);
		go.changeTypeOfAttr("Counter", "initial", "TemporalExpression", "TemporalInExpr");
		go.changeTypeOfAttr("Counter", "resetPred", "TemporalExpression", "TemporalInExpr");
		go.removeOptionality("Counter", null);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "range", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "initial", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "resetPred", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "incPred", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "decPred", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "overflowMethod", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Counter", ScopeKey.SINGLELINE, null, "underflowMethod", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("Counter", "initial", "underflowMethod", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolToLine("Counter", "underflowMethod", ";", false);
		go.changeOptionalAttrToOrRelation("Counter", false, "initial", "underflowMethod");
		go.packageAttributes("Counter", "initial", "underflowMethod", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);

		// Adapt rule Monitor
		go.renameKeyword("Monitor", null, "Monitor", "monitor", null);
		go.moveLine("Monitor", "type", "name", true);
		go.removeKeyword("Monitor", "type", "type", null);
		go.removeOptionality("Monitor", "type");
		go.changeTypeOfAttr("Monitor", null, "TemporalExpression", "TemporalInExpr");
		go.convert1toStarTo1("Monitor", null);
		go.removeBracesExceptContainer("Monitor");
		go.removeOptionality("Monitor", null);
		go.renameKeyword("Monitor", "safety", "safety", "G", null);
		go.addParenthesesWithoutQuotes("Monitor", ScopeKey.SINGLEKEWORD, "G", null, MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("Monitor", "safety", "G", "trans");
		go.renameKeyword("Monitor", "stateInv", "stateInv", "always", null);
		go.addParenthesesWithoutQuotes("Monitor", ScopeKey.SINGLEKEWORD, "always", null, MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("Monitor", "stateInv", "always", "alw");
		go.addParenthesesWithoutQuotes("Monitor", ScopeKey.SINGLELINE, null, "initial", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Monitor", ScopeKey.SINGLELINE, null, "safety", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Monitor", ScopeKey.SINGLELINE, null, "stateInv", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("Monitor", "initial", "stateInv", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolToLine("Monitor", "stateInv", ";", false);
		go.changeOptionalAttrToOrRelation("Monitor", false, "initial", "stateInv");
		go.packageAttributes("Monitor", "initial", "stateInv", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.addOptionalityToKeyword("Monitor", "initial", "initial");
		go.renameKeyword("Monitor", "initial", "initial", "ini", null);
		go.addAlternativeKeyword("Monitor", "initial", "ini", "initially");
		
		// Adapt rule Pattern
		go.renameKeyword("Pattern", null, "Pattern", "pattern", null);
		go.moveLine("Pattern", "params", "name", false);
		go.convert1toStarTo1("Pattern", "varDeclList");
		go.renameKeyword("Pattern", "varDeclList", "varDeclList", "var", null);
		go.convert1toStarTo1("Pattern", null);
		go.removeBracesExceptContainer("Pattern");
		go.addParenthesesToAttr("Pattern", "params");
		go.removeKeyword("Pattern", "params", "params", null);
		go.renameKeyword("Pattern", "initial", "initial", "ini", null);
		go.addOptionalityToKeyword("Pattern", "initial", "ini");
		go.addAlternativeKeyword("Pattern", "initial", "ini", "initially");
		go.renameKeyword("Pattern", "safety", "safety", "G", null);
		go.addParenthesesWithoutQuotes("Pattern", ScopeKey.SINGLEKEWORD, "G", "safety", MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("Pattern", "safety", "G", "trans");
		go.renameKeyword("Pattern", "stateInv", "stateInv", "always", null);
		go.addParenthesesWithoutQuotes("Pattern", ScopeKey.SINGLEKEWORD, "always", "stateInv", MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("Pattern", "stateInv", "always", "alw");
		go.renameKeyword("Pattern", "justice", "justice", "GF", null);
		go.addParenthesesWithoutQuotes("Pattern", ScopeKey.SINGLEKEWORD, "GF", "justice", MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("Pattern", "justice", "GF", "alwEv");
		go.addAlternativeKeyword("Pattern", "justice", "alwEv", "alwaysEventually");
		go.changeTypeOfAttr("Pattern", "initial", "TemporalExpression", "TemporalInExpr");
		go.changeTypeOfAttr("Pattern", "safety", "TemporalExpression", "TemporalInExpr");
		go.changeTypeOfAttr("Pattern", "stateInv", "TemporalExpression", "TemporalInExpr");
		go.changeTypeOfAttr("Pattern", "justice", "TemporalExpression", "TemporalInExpr");
		go.removeOptionality("Pattern", "varDeclList");
		go.changeOptionalAttrToOrRelation("Pattern", false, "initial", "justice");
		go.packageAttributes("Pattern", "initial", "justice", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolToLine("Pattern", "justice", ";", false);
		go.packageAttributes("Pattern", "varDeclList", "varDeclList", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.addParenthesesWithoutQuotes("Pattern", ScopeKey.SINGLELINE, null, "varDeclList", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.packageAttributes("Pattern", "initial", "justice", MultiplicityKey.MULTIPLICITY_ONE_OR_MORE);
		go.addOptionalityToContainerBraces("Pattern", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule Predicate
		go.renameKeyword("Predicate", null, "Predicate", "predicate", null);
		go.removeBraces("Predicate", null, null);
		go.removeKeyword("Predicate", "params", "params", null);
		go.addParenthesesToAttr("Predicate", "params");
		go.removeKeyword("Predicate", "body", "body", null);
		go.removeOptionality("Predicate", null);
		go.changeAToASemiOrAWithBraces("Predicate", "body");
		go.addSymbolToLine("Predicate", "body", ":", true);
		go.addParenthesesWithoutQuotes("Predicate", ScopeKey.SINGLELINE, null, "body", MultiplicityKey.PACKAGE_ONLY);
		go.changeAToAorSymbol("Predicate", "params", "'()'");
		go.addParenthesesWithoutQuotes("Predicate", ScopeKey.SINGLELINE, null, "params", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule LTLGar
		go.addParenthesesWithoutQuotes("LTLGar", ScopeKey.SINGLEKEWORD, "LTLGar", null, MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("LTLGar", null, "LTLGar", "gar");
		go.renameKeyword("LTLGar", null, "LTLGar", "guarantee", null);
		go.removeBraces("LTLGar", null, null);
		go.addBracesToAttr("LTLGar", "params");
		go.renameKeyword("LTLGar", "safety", "safety", "ini", null);
		go.addAlternativeKeyword("LTLGar", "safety", "ini", "initially");
		go.removeKeyword("LTLGar", "params", "params", null);
		go.moveLine("LTLGar", "params", "safety", true);
		go.removeKeyword("LTLGar", "trig", "trig", null);
		go.changeTypeOfAttr("LTLGar", "safety", "ID", "('G' | 'trans')");
		go.removeKeyword("LTLGar", "stateInv", "stateInv", null);
		go.removeKeyword("LTLGar", "justice", "justice", null);
		go.removeKeyword("LTLGar", "temporalExpr", "temporalExpr", null);
		go.changeTypeOfAttr("LTLGar", "stateInv", "ID", "('always' | 'alw')");
		go.changeTypeOfAttr("LTLGar", "justice", "ID", "('GF' | 'alwEv'| 'alwaysEventually')");
		go.addSymbolToRule("LTLGar", ";");
		go.changeTypeOfAttr("LTLGar", "temporalExpr", "TemporalExpression", "QuantifierExpr");
		go.addSymbolToLine("LTLGar", "params", ":", false);
		go.packageAttributes("LTLGar", "name", "params", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		go.changeOptionalAttrToOrRelation("LTLGar", false, "safety", "justice");
		go.packageAttributes("LTLGar", "safety", "justice", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		go.addAlternativeKeyword("LTLGar", "safety", "initially", "temp");
		go.removeKeyword("LTLGar", "safety", "temp", null);
		go.removeOptionality("LTLGar", "temporalExpr");
		go.addParenthesesWithoutQuotes("LTLGar", ScopeKey.SINGLELINE, null, "temporalExpr", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("LTLGar", "safety", "temporalExpr", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("LTLGar", false, "temporalExpr", "trig");
		go.addParenthesesWithoutQuotes("LTLGar", ScopeKey.SINGLELINE, null, "trig", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("LTLGar", "safety", "trig", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule LTLAsm
		go.addParenthesesWithoutQuotes("LTLAsm", ScopeKey.SINGLEKEWORD, "LTLAsm", null, MultiplicityKey.PACKAGE_ONLY);
		go.removeContainerBraces("LTLAsm");
		go.addAlternativeKeyword("LTLAsm", null, "LTLAsm", "asm");
		go.renameKeyword("LTLAsm", "null", "LTLAsm", "assumption", null);
		go.moveLine("LTLAsm", "params", "safety", true);
		go.renameKeyword("LTLAsm", "safety", "safety", "ini", null);
		go.addAlternativeKeyword("LTLAsm", "safety", "ini", "initially");
		go.removeKeyword("LTLAsm", "trig", "trig", null);
		go.changeTypeOfAttr("LTLAsm", "safety", "ID", "('G' | 'trans')");
		go.removeKeyword("LTLAsm", "params", "params", null);
		go.addBracesToAttr("LTLAsm", "params");
		go.removeKeyword("LTLAsm", "stateInv", "stateInv", null);
		go.removeKeyword("LTLAsm", "justice", "justice", null);
		go.removeKeyword("LTLAsm", "temporalExpr", "temporalExpr", null);
		go.changeTypeOfAttr("LTLAsm", "stateInv", "ID", "('always' | 'alw')");
		go.changeTypeOfAttr("LTLAsm", "justice", "ID", "('GF' | 'alwEv'| 'alwaysEventually')");
		go.addSymbolToRule("LTLAsm", ";");
		go.addSymbolToLine("LTLAsm", "params", ":", false);
		go.packageAttributes("LTLAsm", "name", "params", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		go.changeTypeOfAttr("LTLAsm", "temporalExpr", "TemporalExpression", "QuantifierExpr");
		go.changeOptionalAttrToOrRelation("LTLAsm", false, "safety", "justice");
		go.packageAttributes("LTLAsm", "safety", "justice", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		go.addAlternativeKeyword("LTLAsm", "safety", "initially", "temp");
		go.removeKeyword("LTLAsm", "safety", "temp", null);
		go.removeOptionality("LTLAsm", "temporalExpr");
		go.addParenthesesWithoutQuotes("LTLAsm", ScopeKey.SINGLELINE, null, "temporalExpr", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("LTLAsm", "safety", "temporalExpr", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("LTLAsm", false, "temporalExpr", "trig");
		go.addParenthesesWithoutQuotes("LTLAsm", ScopeKey.SINGLELINE, null, "trig", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("LTLAsm", "safety", "trig", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule EXGar
		go.addParenthesesWithoutQuotes("EXGar", ScopeKey.SINGLEKEWORD, "EXGar", null, MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("EXGar", null, "EXGar", "gar");
		go.renameKeyword("EXGar", null, "EXGar", "guarantee", null);
		go.removeBraces("EXGar", null, null);
		go.moveLine("EXGar", "elements", "regExpPointer", true);
		go.removeCertainTypeFromAttr("EXGar", "regExpPointer", "ID");
		go.renameKeyword("EXGar", "elements", "elements", "GE", null);
		go.renameKeyword("EXGar", "regExpPointer", "regExpPointer", "GEF", null);
		go.renameKeyword("EXGar", "regExp", "regExp", "GEF", null);
		go.addOptionalityToAttr("EXGar", "name");
		go.addSymbolToAttr("EXGar", "name", ":", false, null, true, true);
		go.addSymbolToRule("EXGar", ";");
		go.changeTypeOfAttr("EXGar", "elements", "TemporalExpression", "TemporalInExpr");
		go.changeOptionalAttrToOrRelation("EXGar", false, "elements", "regExp");
		go.packageAttributes("EXGar", "elements", "regExp", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule TemporalInExpr
		go.removeContainerBraces("TemporalInExpr");
		go.moveLine("TemporalInExpr", "left", "not", true);
		go.removeKeyword("TemporalInExpr", null, "TemporalInExpr", null);
		go.removeOptionality("TemporalInExpr", null);
		go.changeTypeOfAttr("TemporalInExpr", "operator", "ID", "('in')");
		go.removeKeyword("TemporalInExpr", "values", "values", null);
		go.removeKeyword("TemporalInExpr", "left", "left", null);
		go.removeKeyword("TemporalInExpr", "operator", "operator", null);
		go.changeReturns("TemporalInExpr", "TemporalExpression");
		go.addOptionalityToAttr("TemporalInExpr", "not");
		go.addCallToOtherRule("TemporalInExpr", "TemporalImpExpr", true);
		go.removeAttribute("TemporalInExpr", "left");
		go.setAstProperty("TemporalInExpr", "TemporalInExpr", "left", "current", false);
		go.packageAttributes("TemporalInExpr", "TemporalInExpr", "values", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		
		// Adapt rule TemporalImpExpr
		go.moveLine("TemporalImpExpr", "left", "operator", true);
		go.removeBraces("TemporalImpExpr", null, null);
		go.removeKeyword("TemporalImpExpr", null, null, null);
		go.removeOptionality("TemporalImpExpr", null);
		go.changeTypeOfAttr("TemporalImpExpr", "operator", "ID", "('->' | 'implies')");
		go.changeReturns("TemporalImpExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalImpExpr", "implication", "TemporalExpression", "TemporalImpExpr");
		go.addCallToOtherRule("TemporalImpExpr", "TemporalIffExpr", true);
		go.removeAttribute("TemporalImpExpr", "left");
		go.setAstProperty("TemporalImpExpr", "TemporalImpExpr", "left", "current", false);
		go.packageAttributes("TemporalImpExpr", "TemporalImpExpr", "implication", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// Adapt rule TemporalIffExpr
		go.removeKeyword("TemporalIffExpr", null, null, null);
		go.removeBraces("TemporalIffExpr", null, null);
		go.changeTypeOfAttr("TemporalIffExpr", "operator", "ID", "('<->' | 'iff')");
		go.removeOptionality("TemporalIffExpr", null);
		go.convert1toStarTo1("TemporalIffExpr", "elements");
		go.changeReturns("TemporalIffExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalIffExpr", "elements", "TemporalExpression", "TemporalOrExpr");
		go.addCallToOtherRule("TemporalIffExpr", "TemporalOrExpr", true);
		go.setAstProperty("TemporalIffExpr", "TemporalIffExpr", "elements", "current", true);
		go.packageAttributes("TemporalIffExpr", "TemporalIffExpr", "elements", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// Adapt rule TemporalOrExpr
		go.removeKeyword("TemporalOrExpr", null, null, null);
		go.removeBraces("TemporalOrExpr", null, null);
		go.removeOptionality("TemporalOrExpr", null);
		go.convert1toStarTo1("TemporalOrExpr", "operator");
		go.convert1toStarTo1("TemporalOrExpr", "elements");
		go.changeTypeOfAttr("TemporalOrExpr", "operator", "ID", "('|' | 'or' | 'xor')");
		go.changeReturns("TemporalOrExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalOrExpr", "elements", "TemporalExpression", "TemporalAndExpr");
		go.addCallToOtherRule("TemporalOrExpr", "TemporalAndExpr", true);
		go.setAstProperty("TemporalOrExpr", "TemporalOrExpr", "elements", "current", true);
		go.packageAttributes("TemporalOrExpr", "TemporalOrExpr", "elements", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);

		// Adapt rule TemporalAndExpr
		go.removeKeyword("TemporalAndExpr", null, null, null);
		go.removeBraces("TemporalAndExpr", null, null);
		go.removeOptionality("TemporalAndExpr", null);
		go.convert1toStarTo1("TemporalAndExpr", "operator");
		go.convert1toStarTo1("TemporalAndExpr", "elements");
		go.changeTypeOfAttr("TemporalAndExpr", "operator", "ID", "('&' | 'and')");
		go.changeReturns("TemporalAndExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalAndExpr", "elements", "TemporalExpression", "TemporalRelationalExpr");
		go.addCallToOtherRule("TemporalAndExpr", "TemporalRelationalExpr", true);
		go.setAstProperty("TemporalAndExpr", "TemporalAndExpr", "elements", "current", true);
		go.packageAttributes("TemporalAndExpr", "TemporalAndExpr", "elements", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// Adapt rule TemporalRelationalExpr
		go.removeKeyword("TemporalRelationalExpr", null, null, null);
		go.removeBraces("TemporalRelationalExpr", null, null);
		go.removeOptionality("TemporalRelationalExpr", null);
		go.changeTypeOfAttr("TemporalRelationalExpr", "operator", "ID", "('='|'!='|'<'|'>'|'<='|'>=')");
		go.moveLine("TemporalRelationalExpr", "left", "operator", true);
		go.changeReturns("TemporalRelationalExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalRelationalExpr", "right", "TemporalExpression", "TemporalRemainderExpr");
		go.addCallToOtherRule("TemporalRelationalExpr", "TemporalRemainderExpr", true);
		go.removeAttribute("TemporalRelationalExpr", "left");
		go.setAstProperty("TemporalRelationalExpr", "TemporalRelationalExpr", "left", "current", false);
		go.packageAttributes("TemporalRelationalExpr", "TemporalRelationalExpr", "right", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// Adapt rule TemporalRemainderExpr
		go.removeKeyword("TemporalRemainderExpr", null, null, null);
		go.removeBraces("TemporalRemainderExpr", null, null);
		go.removeOptionality("TemporalRemainderExpr", null);
		go.changeTypeOfAttr("TemporalRemainderExpr", "operator", "ID", "('mod' | '%')");
		go.moveLine("TemporalRemainderExpr", "left", "operator", true);
		go.changeReturns("TemporalRemainderExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalRemainderExpr", "right", "TemporalExpression", "TemporalAdditiveExpr");
		go.addCallToOtherRule("TemporalRemainderExpr", "TemporalAdditiveExpr", true);
		go.removeAttribute("TemporalRemainderExpr", "left");
		go.setAstProperty("TemporalRemainderExpr", "TemporalRemainderExpr", "left", "current", false);
		go.packageAttributes("TemporalRemainderExpr", "TemporalRemainderExpr", "right", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// Adapt rule TemporalAdditiveExpr
		go.removeKeyword("TemporalAdditiveExpr", null, null, null);
		go.removeBraces("TemporalAdditiveExpr", null, null);
		go.removeOptionality("TemporalAdditiveExpr", null);
		go.convert1toStarTo1("TemporalAdditiveExpr", "operator");
		go.convert1toStarTo1("TemporalAdditiveExpr", "elements");
		go.changeTypeOfAttr("TemporalAdditiveExpr", "operator", "ID", "('+'|'-')");
		go.changeReturns("TemporalAdditiveExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalAdditiveExpr", "elements", "TemporalExpression", "TemporalMultiplicativeExpr");
		go.addCallToOtherRule("TemporalAdditiveExpr", "TemporalMultiplicativeExpr", true);
		go.setAstProperty("TemporalAdditiveExpr", "TemporalAdditiveExpr", "elements", "current", true);
		go.packageAttributes("TemporalAdditiveExpr", "TemporalAdditiveExpr", "elements", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// Adapt rule TemporalMultiplicativeExpr
		go.removeKeyword("TemporalMultiplicativeExpr", null, null, null);
		go.removeBraces("TemporalMultiplicativeExpr", null, null);
		go.removeOptionality("TemporalMultiplicativeExpr", null);
		go.convert1toStarTo1("TemporalMultiplicativeExpr", "operator");
		go.convert1toStarTo1("TemporalMultiplicativeExpr", "elements");
		go.changeTypeOfAttr("TemporalMultiplicativeExpr", "operator", "ID", "('*'|'/')");
		go.changeReturns("TemporalMultiplicativeExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalMultiplicativeExpr", "elements", "TemporalExpression", "TemporalBinaryExpr");
		go.addCallToOtherRule("TemporalMultiplicativeExpr", "TemporalBinaryExpr", true);
		go.setAstProperty("TemporalMultiplicativeExpr", "TemporalMultiplicativeExpr", "elements", "current", true);
		go.packageAttributes("TemporalMultiplicativeExpr", "TemporalMultiplicativeExpr", "elements", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// Adapt rule TemporalBinaryExpr
		go.removeKeyword("TemporalBinaryExpr", null, null, null);
		go.removeBraces("TemporalBinaryExpr", null, null);
		go.removeOptionality("TemporalBinaryExpr", null);
		go.convert1toStarTo1("TemporalBinaryExpr", "operator");
		go.convert1toStarTo1("TemporalBinaryExpr", "elements");
		go.changeTypeOfAttr("TemporalBinaryExpr", "operator", "ID", "('S' | 'SINCE' | 'T' | 'TRIGGERED')");
		go.changeReturns("TemporalBinaryExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalBinaryExpr", "elements", "TemporalExpression", "TemporalUnaryExpr");
		//go.removeAction("TemporalBinaryExpr");
		go.addCallToOtherRule("TemporalBinaryExpr", "TemporalUnaryExpr", true);
		go.setAstProperty("TemporalBinaryExpr", "TemporalBinaryExpr", "elements", "current", true);
		go.packageAttributes("TemporalBinaryExpr", "TemporalBinaryExpr", "elements", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// Adapt rule TemporalUnaryExpr
		go.removeKeyword("TemporalUnaryExpr", null, null, null);
		go.removeBraces("TemporalUnaryExpr", null, null);
		go.changeReturns("TemporalUnaryExpr", "TemporalExpression");
		go.changeTypeOfAttr("TemporalUnaryExpr", "tue", "TemporalExpression", "TemporalUnaryExpr");
		go.removeOptionality("TemporalUnaryExpr", "tue");
		go.addCallToOtherRule("TemporalUnaryExpr", "TemporalPrimaryExpr", false);
		
		// Adapt rule TemporalPrimaryExpr
		go.changeBracesToParentheses("TemporalPrimaryExpr", "predPattParams");
		go.removeKeyword("TemporalPrimaryExpr", null, null, null);
		go.removeKeyword("TemporalPrimaryExpr", "predPattParams", "predPattParams", null);
		go.removeBraces("TemporalPrimaryExpr", null, null);
		go.convert1toStarToStar("TemporalPrimaryExpr", "index");
		go.addBracesToAttr("TemporalPrimaryExpr", "index");
		go.changeBracesToSquare("TemporalPrimaryExpr", "index");
		go.changeReturns("TemporalPrimaryExpr", "TemporalExpression");
		go.addCallToOtherRule("TemporalPrimaryExpr", "Constant | '(' QuantifierExpr ')'", false);
		go.moveLine("TemporalPrimaryExpr", "predPatt", "operator", true);
		go.moveLine("TemporalPrimaryExpr", "predPattParams", "operator", true);
		go.removeCertainTypeFromAttr("TemporalPrimaryExpr", "predPatt", "ID");
		go.changeTypeOfAttr("TemporalPrimaryExpr", "predPattParams", "TemporalExpression", "TemporalInExpr");
		go.removeOptionality("TemporalPrimaryExpr", "predPatt");
		go.removeOptionality("TemporalPrimaryExpr", "predPattParams");
		go.addSymbolWithoutQuoteToLine("TemporalPrimaryExpr", "predPattParams", "|", false);
		go.addSymbolToLine("TemporalPrimaryExpr", "predPattParams", "()", false);
		go.addParenthesesWithoutQuotes("TemporalPrimaryExpr", ScopeKey.SINGLELINE, null, "predPattParams", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolWithoutQuoteToLine("TemporalPrimaryExpr", "predPattParams", "|", false);
		go.moveLine("TemporalPrimaryExpr", "regexpPointer", "regexp", false);
		go.removeCertainTypeFromAttr("TemporalPrimaryExpr", "regexpPointer", "ID");
		
		// Adapt rule Constant
		go.removeKeyword("Constant");
		go.removeBraces("Constant");
		go.changeOptionalAttrToOrRelation("Constant", true, null, null);
		go.changeTypeOfAttr("Constant", "booleanValue", "ID", "'FALSE'");
		List<String> newValues = new ArrayList<String>();
		newValues.add("false");
		newValues.add("TRUE");
		newValues.add("true");
		go.addAlternativeValue("Constant", "booleanValue", newValues, false);
		go.packageAttributes("Constant", "booleanValue", "integerValue", MultiplicityKey.PACKAGE_ONLY);
		go.changeReturns("Constant", "TemporalExpression");
		
		// Adapt rule QuantifierExpr
		go.removeKeyword("QuantifierExpr", null, null, null);
		go.removeBraces("QuantifierExpr", null, null);
		go.removeOptionality("QuantifierExpr", null);
		go.changeTypeOfAttr("QuantifierExpr", "operator", "ID", "('forall' | 'exists')");
		go.addKeywordToAttr("QuantifierExpr", "domainVar", ".", false);
		go.changeReturns("QuantifierExpr", "TemporalExpression");
		go.changeTypeOfAttr("QuantifierExpr", "temporalExpr", "TemporalExpression", "(QuantifierExpr)");
		go.packageAttributes("QuantifierExpr", "operator", "temporalExpr", MultiplicityKey.PACKAGE_ONLY);
		go.addCallToOtherRule("QuantifierExpr", "TemporalInExpr", false);
		
		// Adapt rule ValueInRange
		go.removeKeyword("ValueInRange", null, null, null);
		go.addKeywordToAttr("ValueInRange", "multi", "-", false);
		go.removeBraces("ValueInRange", null, null);
		go.removeOptionality("ValueInRange", null);
		go.moveLine("ValueInRange", "multi", "from", false);
		go.moveLine("ValueInRange", "const", "int", true);
		go.changeTypeOfAttr("ValueInRange", "booleanValue", "ID", "('TRUE' |'FALSE' | 'true' | 'false')");
		go.removeCertainTypeFromAttr("ValueInRange", "const", "ID");
		go.changeOptionalAttrToOrRelation("ValueInRange", false, "const", "from");
		go.packageAttributes("ValueInRange", "from", "to", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("ValueInRange", false, "to", "booleanValue");
		
		// Adapt rule TypeConstant
		go.removeKeyword("TypeConstant", null, null, null);
		go.changeTypeOfAttr("TypeConstant", "name", "ID", "TypeConstantLiteral");
		
		// Adapt rule DefineRegExpDecl
		go.removeBraces("DefineRegExpDecl", null, null);
		go.removeKeyword("DefineRegExpDecl", null, "DefineRegExpDecl", null);
		go.renameKeyword("DefineRegExpDecl", "exp", "exp", ":=", null);
		go.removeOptionality("DefineRegExpDecl", null);
		go.addSymbolToRule("DefineRegExpDecl", ";");
		
		// Adapt rule VarDecl
		go.removeBraces("VarDecl", null, null);
		go.removeKeyword("VarDecl", null, null, null);
		go.removeOptionality("VarDecl", null);
		go.moveLine("VarDecl", "name", "type", false);
		go.addSymbolToRule("VarDecl", ";");
		
		// Adapt rule DefineDecl
		go.removeKeyword("DefineDecl", null, "DefineDecl", null);
		go.removeKeyword("DefineDecl", null, "dimensions", null);
		go.removeBraces("DefineDecl", null, null);
		go.convert1toStarToPlus("DefineDecl", "dimensions");
		go.renameKeyword("DefineDecl", "simpleExpr", "simpleExpr", ":=", null);
		go.renameKeyword("DefineDecl", "innerArray", "innerArray", ":=", null);
		go.addBracesToAttr("DefineDecl", "dimensions");
		go.changeBracesToSquare("DefineDecl", "dimensions");
		go.addSymbolToRule("DefineDecl", ";");
		go.removeOptionality("DefineDecl", null);
		go.copyAttrAToAttrB("DefineDecl", "name", "dimensions", true);
		go.packageAttributes("DefineDecl", "name", "simpleExpr", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("DefineDecl", false, "simpleExpr", "dimensions");
		go.packageAttributes("DefineDecl", "dimensions", "innerArray", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("DefineDecl", "name", "innerArray", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule PatternParam
		go.removeKeyword("PatternParam", null, "PatternParam", null);
		
		// Adapt rule TypedParam
		go.removeKeyword("TypedParam", null, null, null);
		go.removeBraces("TypedParam", null, null);
		go.removeOptionality("TypedParam", null);
		go.moveLine("TypedParam", "name", "type", false);
		
		// Adapt rule DomainVarDecl
		go.removeKeyword("DomainVarDecl", null, "DomainVarDecl", null);
		go.removeBraces("DomainVarDecl", null, null);
		go.removeOptionality("DomainVarDecl", null);
		go.renameKeyword("DomainVarDecl", "domainType", "domainType", "in", null);
		
		// Adapt rule VarType
		go.removeKeyword("VarType", null, "VarType", null);
		go.removeKeyword("VarType", null, "const", null);
		go.removeKeyword("VarType", null, "type", null);
		go.removeKeyword("VarType", null, "dimensions", null);
		go.changeTypeOfAttr("VarType", "name", "ID", "'boolean'");
		go.moveLine("VarType", "type", "const", false);
		go.removeCertainTypeFromAttr("VarType", "type", "ID");
		go.addBracesToAttr("VarType", "subr");
		go.changeBracesToParentheses("VarType", "subr");
		go.convert1toStarToStar("VarType", "dimensions");
		go.removeBraces("VarType", "dimensions", null);
		go.addBracesToAttr("VarType", "dimensions");
		go.changeBracesToSquare("VarType", "dimensions");
		go.renameKeyword("VarType", "subr", "subr", "Int", null);
		go.removeContainerBraces("VarType");
		go.removeOptionality("VarType", null);
		go.changeOptionalAttrToOrRelation("VarType", false, "name", "type");
		go.packageAttributes("VarType", "name", "type", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule Subrange
		go.removeBraces("Subrange", null, null);
		go.removeOptionality("Subrange", null);
		go.removeKeyword("Subrange", null, "Subrange", null);
		go.removeKeyword("Subrange", null, "from", null);
		go.renameKeyword("Subrange", "to", "to", "..", null);
		
		// Adapt rule SizeDefineDecl
		go.removeBraces("SizeDefineDecl", null, null);
		go.removeKeyword("SizeDefineDecl", null, null, null);
		go.removeCertainTypeFromAttr("SizeDefineDecl", "name", "ID");
		go.addParenthesesToAttr("SizeDefineDecl", "arithExp");
		go.changeOptionalAttrToOrRelation("SizeDefineDecl", true, null, null);
		
		// Adapt rule DefineArray
		go.removeKeyword("DefineArray", null, null, null);
		go.removeBraces("DefineArray");
		go.removeOptionality("DefineArray", null);
		go.addParenthesesWithoutQuotes("DefineArray", ScopeKey.SINGLELINE, null, "simpleExprs", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("DefineArray", ScopeKey.SINGLELINE, null, "innerArrays", MultiplicityKey.PACKAGE_ONLY);
		go.addBracesToLine("DefineArray", null);
		go.addOptionalityToLine("DefineArray", null);
		go.changeOptionalAttrToOrRelation("DefineArray", true, null, null);
		
		// Adapt rule BooleanTerm
		go.removeKeyword("BooleanTerm", null, null, null);
		go.removeOptionality("BooleanTerm", null);
		go.changeBracesToSquare("BooleanTerm", null);
		go.changeTypeOfAttr("BooleanTerm", "relExpr", "TemporalExpression", "TemporalInExpr");
		
		// Adapt rule BinaryRegExp
		go.removeKeyword("BinaryRegExp", null, "BinaryRegExp", null);
		go.removeOptionality("BinaryRegExp", null);
		go.changeBracesToSquare("BinaryRegExp", "right");
		go.addOptionalityToAttr("BinaryRegExp", "empty");
		go.changeTypeOfAttr("BinaryRegExp", "op", "ID", "('&' | '|')");
		go.removeKeyword("BinaryRegExp", "op", "op", null);
		go.addOptionalityToAttr("BinaryRegExp", "op");
		go.removeKeyword("BinaryRegExp", "right", "right", null);
		go.changeReturns("BinaryRegExp", "RegExp");
		go.removeContainerBraces("BinaryRegExp");
		go.addCallToOtherRule("BinaryRegExp", "UnaryRegExp", true);
		go.removeAttribute("BinaryRegExp", "val");
		go.removeAttribute("BinaryRegExp", "assrt");
		go.removeAttribute("BinaryRegExp", "empty");
		go.changeTypeOfAttr("BinaryRegExp", "right", "RegExp", "UnaryRegExp");
		go.moveLine("BinaryRegExp", "left", "op", true);
		go.removeKeyword("BinaryRegExp", "left", "left", null);
		go.removeAttribute("BinaryRegExp", "left");
		go.setAstProperty("BinaryRegExp", "BinaryRegExp", "left", "current", false);
		go.packageAttributes("BinaryRegExp", "BinaryRegExp", "right", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// Adapt rule UnaryRegExp
		go.removeKeyword("UnaryRegExp", null, "UnaryRegExp", null);
		go.removeBraces("UnaryRegExp", null, null);
		go.removeCertainTypeFromAttr("UnaryRegExp", "fromDefine", "ID");
		go.removeCertainTypeFromAttr("UnaryRegExp", "toDefine", "ID");
		go.renameKeyword("UnaryRegExp", "kleened", "kleened", "*", null);
		go.renameKeyword("UnaryRegExp", "questionMark", "questionMark", "?", null);
		go.renameKeyword("UnaryRegExp", "plus", "plus", "+", null);
		go.removeKeyword("UnaryRegExp", null, "from", null);
		go.removeKeyword("UnaryRegExp", null, "to", null);
		go.removeKeyword("UnaryRegExp", null, "fromDefine", null);
		go.removeKeyword("UnaryRegExp", null, "toDefine", null);
		go.moveLine("UnaryRegExp", "fromDefine", "to", true);
		go.addSymbolToAttr("UnaryRegExp", "atLeast", ",", false, null, true, true);
		go.changeReturns("UnaryRegExp", "RegExp");
		go.addCallToOtherRule("UnaryRegExp", "CompRegExp", true);
		go.removeAttribute("UnaryRegExp", "empty");
		go.removeAttribute("UnaryRegExp", "val");
		go.removeAttribute("UnaryRegExp", "assrt");
		go.moveLine("UnaryRegExp", "atLeast", "haveAtLeast", false);
		go.moveLine("UnaryRegExp", "from", "exactRepetition", true);
		go.moveLine("UnaryRegExp", "fromDefine", "exactRepetition", true);
		go.moveLine("UnaryRegExp", "exactRepetition", "haveExactRepetition", false);
		go.renameKeyword("UnaryRegExp", "haveExactRepetition", "haveExactRepetition", "{", null);
		go.renameKeyword("UnaryRegExp", "haveAtLeast", "haveAtLeast", "{", null);
		go.renameKeyword("UnaryRegExp", "haveRange", "haveRange", "{", null);
		go.removeKeyword("UnaryRegExp", "exactRepetition", "exactRepetition", null);
		go.removeKeyword("UnaryRegExp", "atLeast", "atLeast", null);
		go.removeOptionality("UnaryRegExp", null);
		go.addParenthesesWithoutQuotes("UnaryRegExp", ScopeKey.SINGLELINE, null, "kleened", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("UnaryRegExp", ScopeKey.SINGLELINE, null, "questionMark", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("UnaryRegExp", ScopeKey.SINGLELINE, null, "plus", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "kleened", "|", false);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "questionMark", "|", false);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "plus", "|", false);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "from", "|", false);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "to", "|", false);
		go.packageAttributes("UnaryRegExp", "to", "toDefine", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("UnaryRegExp", "from", "fromDefine", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolToLine("UnaryRegExp", "toDefine", "}", false);
		go.addSymbolToLine("UnaryRegExp", "fromDefine", ",", false);
		go.addSymbolToLine("UnaryRegExp", "atLeast", "}", false);
		go.addSymbolToLine("UnaryRegExp", "exactRepetition", "}", false);
		go.packageAttributes("UnaryRegExp", "haveExactRepetition", "exactRepetition", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("UnaryRegExp", "haveAtLeast", "atLeast", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("UnaryRegExp", "haveRange", "toDefine", MultiplicityKey.PACKAGE_ONLY);
		go.packageAttributes("UnaryRegExp", "kleened", "toDefine", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "exactRepetition", "|", false);
		go.addSymbolWithoutQuoteToLine("UnaryRegExp", "atLeast", "|", false);
		go.removeAttribute("UnaryRegExp", "left");
		go.setAstProperty("UnaryRegExp", "UnaryRegExp", "left", "current", false);
		go.packageAttributes("UnaryRegExp", "UnaryRegExp", "toDefine", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// Adapt rule CompRegExp
		go.removeBraces("CompRegExp", null, null);
		go.removeOptionality("CompRegExp", null);
		go.removeKeyword("CompRegExp", null, null, null);
		go.addKeywordToAttr("CompRegExp", "empty", "empty", false);
		go.addOptionalityToAttr("CompRegExp", "empty");
		go.changeTypeOfAttr("CompRegExp", "comp", "ID", "'~'");
		go.addParenthesesWithoutQuotes("CompRegExp", ScopeKey.SINGLELINE, null, "comp", MultiplicityKey.PACKAGE_ONLY);
		go.changeReturns("CompRegExp", "RegExp");
		go.addCallToOtherRule("CompRegExp", "PrimaryRegExp", false);
		go.removeAttribute("CompRegExp", "assrt");
		go.removeAttribute("CompRegExp", "empty");
		go.removeAttribute("CompRegExp", "val");
		go.changeTypeOfAttr("CompRegExp", "left", "RegExp", "CompRegExp");
		go.packageAttributes("CompRegExp", "CompRegExp", "left", MultiplicityKey.PACKAGE_ONLY);
		
		// Adapt rule enum VarOwner
		go.keywordUpperToLowerCase("VarOwner", null, null);
		newValues.clear();
		newValues.add("output");
		newValues.add("out");
		newValues.add("sysvar");
		go.addAlternativeValue("VarOwner", "SYS", newValues, true);
		newValues.clear();
		newValues.add("input");
		newValues.add("in");
		newValues.add("envvar");
		go.addAlternativeValue("VarOwner", "ENV", newValues, true);
		newValues.clear();
		newValues.add("auxvar");
		go.addAlternativeValue("VarOwner", "AUX", newValues, true);
		
		// Adapt rule enum OverflowMethod
		go.keywordUpperToLowerCase("OverflowMethod", null, null);
		
		// Adapt rule PatternParamList
		go.removeBraces("PatternParamList", null, null);
		go.removeOptionality("PatternParamList", null);
		go.removeKeyword("PatternParamList", null, null, null);
		
		// Adapt rule TypedParamList
		go.removeBraces("TypedParamList", null, null);
		go.removeOptionality("TypedParamList", null);
		go.removeKeyword("TypedParamList", null, null, null);
		
		// Adapt rule Trigger
		go.renameKeyword("Trigger", null, "Trigger", "trig", null);
		go.removeKeywordsOfAllAttrs("Trigger");
		go.removeCertainTypeFromAttr("Trigger", "initPointer", "ID");
		go.removeCertainTypeFromAttr("Trigger", "effectPointer", "ID");
		go.moveLine("Trigger", "initRegExp", "initPointer", false);
		go.removeContainerBraces("Trigger");
		go.removeOptionality("Trigger", null);
		go.changeOptionalAttrToOrRelation("Trigger", false, "initPointer", "initRegExp");
		go.packageAttributes("Trigger", "initPointer", "initRegExp", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolToLine("Trigger", "initRegExp", "|=>", false);
		go.changeOptionalAttrToOrRelation("Trigger", false, "effectPointer", "effectRegExp");
		go.packageAttributes("Trigger", "effectPointer", "effectRegExp", MultiplicityKey.PACKAGE_ONLY);
		
		
		String actualOutput = go.spliceGrammar();
		FileHelper.setFileText("Test_Spectra.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_Spectra.txt", false);

		// compare text
		//Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
