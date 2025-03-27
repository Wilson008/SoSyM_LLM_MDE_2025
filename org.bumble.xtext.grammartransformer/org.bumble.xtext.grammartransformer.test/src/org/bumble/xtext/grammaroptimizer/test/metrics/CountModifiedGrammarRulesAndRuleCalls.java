package org.bumble.xtext.grammaroptimizer.test.metrics;

import java.util.HashMap;

import org.apache.commons.lang3.StringUtils;
import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.test.FileHelper;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.eclipse.emf.common.util.EList;

public class CountModifiedGrammarRulesAndRuleCalls {

	private static EList<GrammarRule> initialProductionRules;
	private static EList<GrammarRule> optimizedProductionRules;
	private static HashMap<String, GrammarRule> optRulesMap = new HashMap<String, GrammarRule>();
	private static HashMap<String, GrammarRule> initRulesMap = new HashMap<String, GrammarRule>();
	private static int modifiedRules = 0;
	private static int addedRules = 0;
	private static int deletedRules = 0;
	private static int modifiedLines = 0;
	private static int addedLines = 0;
	private static int deletedLines = 0;
	private static int ruleCallsInitialGrammar = 0;
	private static int ruleCallsOptimizedGrammar = 0;
	private static int linesNoBlankInput = 0;
	private static int linesNoBlankOutput = 0;

	public static void main(String[] args) {
//		initializeGrammarDataStructures("EastAdlSimplified.txt", "Test_EastAdlSimplified.txt");
//		initializeGrammarDataStructures("EastAdlFull.txt", "Test_EastAdlFull.txt");
//		initializeGrammarDataStructures("ATLnoOCL.txt", "Test_MyATLnoOCL.txt");		
//		initializeGrammarDataStructures("MyXenia.txt", "Test_MyXenia.txt");
//		initializeGrammarDataStructures("Xcore.txt", "Test_Xcore.txt");
//		initializeGrammarDataStructures("Dot.txt", "Test_MyDot.txt");
//		initializeGrammarDataStructures("SML.txt", "Test_SML.txt");
//		initializeGrammarDataStructures("Spectra.txt", "Test_Spectra.txt");
//		initializeGrammarDataStructures("SQLDDL.txt", "Test_SQLDDL.txt");
//		initializeGrammarDataStructures("MyBibTex.txt", "Test_MyBibTex.txt");
//		initializeGrammarDataStructures("QVToV10.txt", "Test_QVToV10.txt");
//		initializeGrammarDataStructures("QVToV11.txt", "Test_QVToV11.txt");
//		initializeGrammarDataStructures("QVToV12.txt", "Test_QVToV12.txt");
//		initializeGrammarDataStructures("QVToV13.txt", "Test_QVToV13.txt");

		countModifiedRules();
		System.out.println("GO modified " + modifiedRules + " rules, added " + addedRules + " rules, and deleted "
				+ deletedRules + " rules!");
		System.out.println("GO modified " + modifiedLines + " lines, added " + addedLines + " lines, and deleted "
				+ deletedLines + " lines!");
		System.out.println("The initial grammar contains " + ruleCallsInitialGrammar
				+ " rule calls, and the optimized grammar " + ruleCallsOptimizedGrammar + " ones.");
		System.out.println("There are " + linesNoBlankInput + " lines in the input file that are not blank!");
		System.out.println("There are " + linesNoBlankOutput + " lines in the output file that are not blank!");
	}

	public static void initializeGrammarDataStructures(String inputFileName, String outputFileName) {
		GrammarTransformer goForInitialGrammar = new GrammarTransformer();
		String plainInputGrammar = FileHelper.getInputTextFile(inputFileName);
		goForInitialGrammar.processGrammar(plainInputGrammar);
		Grammar initialGrammar = goForInitialGrammar.getGrammar();
		initialProductionRules = initialGrammar.getRules();
		for (GrammarRule initialProductionRule : initialProductionRules) {
			initRulesMap.put(initialProductionRule.getName(), initialProductionRule);
		}

		GrammarTransformer goForOptimizedGrammar = new GrammarTransformer();
		String plainOutputGrammar = FileHelper.getOutputTextFile(outputFileName);
		goForOptimizedGrammar.processGrammar(plainOutputGrammar);
		Grammar optimizedGrammar = goForOptimizedGrammar.getGrammar();
		optimizedProductionRules = optimizedGrammar.getRules();
		for (GrammarRule optimizedProductionRule : optimizedProductionRules) {
			optRulesMap.put(optimizedProductionRule.getName(), optimizedProductionRule);
		}
		
		// count lines that are not blank
		linesNoBlankInput = CountLinesNoBlank(plainInputGrammar);
		linesNoBlankOutput = CountLinesNoBlank(plainOutputGrammar);
	}
	
	public static int CountLinesNoBlank(String str) {
		// Split the contents of Xtext file (i.e. string) into lines
		String lines[] = str.split("\r\n|\r|\n");
		int iCount = 0;
		
		// judge whether a line is blank or not
		// if not blank then plus 1
		int size = lines.length;
		
		for (int i = 0; i < size; i++) {
			if (!lines[i].equals("")) {
				iCount++;
			}
		}
		
		return iCount;
	}

	private static void countModifiedRules() {
		// compare rules that exist both in initial and optimized grammar
		for (GrammarRule initialProductionRule : initialProductionRules) {
			if (initialProductionRule.getName() != null) {
				// now we have excluded the first two lines of the grammar, which are no
				// production rules (but also terminal rules, check TODO below)

				boolean differenceFound = false; // only for for the last line entry comparison branch needed

				GrammarRule correspondingOptimizedRule = optRulesMap.get(initialProductionRule.getName());
				if (correspondingOptimizedRule == null) {
					// rule was deleted
					System.out.println("GO deleted rule '" + initialProductionRule.getName() + "'");
					deletedRules++;
				} else {
					EList<LineEntry> initialRuleLines = initialProductionRule.getLines();
					EList<LineEntry> optimizedRuleLines = correspondingOptimizedRule.getLines();
					if (initialRuleLines.size() != optimizedRuleLines.size()) {
						// one entry in the rule was deleted or added
						System.out.println("GO deleted or added lines in rule '" + initialProductionRule.getName()
								+ "' (skipping remainder of production rule)");
						modifiedRules++;

						if (optimizedRuleLines.size() > initialRuleLines.size()) {
							int tmpAddedLines = optimizedRuleLines.size() - initialRuleLines.size();
							System.out.println(
									"GO added " + tmpAddedLines + " to rule '" + initialProductionRule.getName() + "'");
							addedLines += tmpAddedLines;
						} else if (optimizedRuleLines.size() < initialRuleLines.size()) {
							int tmpDeletedLines = initialRuleLines.size() - optimizedRuleLines.size();
							System.out.println(
									"GO deleted " + tmpDeletedLines + " from rule '" + initialProductionRule.getName() + "'");
							deletedLines += tmpDeletedLines;
						}
					} else { // now we have to really compare
						for (int i = 0; i < initialRuleLines.size(); i++) {
							String initialRuleLine = initialRuleLines.get(i).getLineContent().replaceAll("\\s+", "");
							String optimizedRuleLine = optimizedRuleLines.get(i).getLineContent().replaceAll("\\s+",
									"");
							if (!differenceFound) {
								if (!initialRuleLine.equals(optimizedRuleLine)) {
									differenceFound = true;

									System.out.println("GO modified line in rule '" + initialProductionRule.getName()
											+ "'; difference: '" + StringUtils.difference(initialRuleLine,
													optimizedRuleLine + "' (skipping remainder of production rule)"));

									modifiedRules++;

									// potential extensions: Average changed lines per changed production rules, etc.
								}
							}

							if (!initialRuleLine.equals(optimizedRuleLine)) {
								System.out.println("GO modified a line in rule '" + initialProductionRule.getName()
										+ "'; difference: '"
										+ StringUtils.difference(initialRuleLine, optimizedRuleLine + "'"));
								modifiedLines++;
							}

							// determine sizes for initial grammar
							// count calls to default Xtext terminals
							if (initialRuleLine.contains("STRING")) {
								ruleCallsInitialGrammar++;
							}
							if (initialRuleLine.contains("ID")) {
								ruleCallsInitialGrammar++;
							}
							// count rule calls to MM-specific rules
							for (String ruleName : initRulesMap.keySet()) {
								if (ruleName != null && initialRuleLine.contains(ruleName)) {
									ruleCallsInitialGrammar++;
								}
							}

							// determine sizes for optimized grammar
							// count calls to default Xtext terminals
							if (optimizedRuleLine.contains("STRING")) {
								ruleCallsOptimizedGrammar++;
							}
							if (optimizedRuleLine.contains("ID")) {
								ruleCallsOptimizedGrammar++;
							}
							// count rule calls
							for (String ruleName : optRulesMap.keySet()) {
								if (ruleName != null && optimizedRuleLine.contains(ruleName)) {
									ruleCallsOptimizedGrammar++;
								}
							}
						}
					}
				}
				differenceFound = false;
			} else { // TODO might be not needed, check other applications than EAST-ADL whether this
						// branch occurs
				String firstRuleLine = initialProductionRule.getLines().get(0).getLineContent();
				if (firstRuleLine.startsWith("terminal")) {
					String ruleName = firstRuleLine.substring(9); // "terminal " = 9 characters
					ruleName = ruleName.substring(0, ruleName.indexOf(":"));
					System.err.println(
							"!!! Terminal rule '" + ruleName + "' in initial rules, is there something to do?");
				}
			}
		}

		// now the other way round: Did GO add rules to the grammar?
		for (GrammarRule optimizedProductionRule : optimizedProductionRules) {
			if (optimizedProductionRule.getName() != null) {
				// now we have excluded the first two lines of the grammar, which are no
				// production rules
				GrammarRule correspondingInitialRule = initRulesMap.get(optimizedProductionRule.getName());
				if (correspondingInitialRule == null) {
					System.out.println("GO added the production rule '" + optimizedProductionRule.getName() + "'");
					addedRules++;
				}
			} else {
				String firstRuleLine = optimizedProductionRule.getLines().get(0).getLineContent();
				if (firstRuleLine.endsWith(":")) {
					String ruleName = null;
					if (firstRuleLine.startsWith("terminal")) { // terminal <ruleName>:
						ruleName = firstRuleLine.substring(9); // "terminal " = 9 characters
						ruleName = ruleName.substring(0, ruleName.indexOf(":"));
					} else if (!firstRuleLine.contains(" ")) { // <ruleName>:
						ruleName = firstRuleLine.substring(0, firstRuleLine.indexOf(":"));
					}
					if (ruleName != null) {
						System.out.println("GO added the terminal rule '" + ruleName + "'");
						addedRules++;
					}
				}
			}
		}
	}

}
