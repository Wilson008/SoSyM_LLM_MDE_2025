package org.xtext.configgenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarImpl;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.GrammarRuleHelper;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResourceFactory;
import org.eclipse.xtext.resource.XtextResourceSet;
import java.util.regex.Matcher;

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//import com.opencsv.CSVWriter;

public class ConfigGenerator {
	
	public enum LineType {
		NONE,
		ATTR,
		KEYWORD,
		BRACKET
	}

	public class RecognizableLine {
		int index;
		String key;
//		boolean isAttr = true;
		LineType lineType = LineType.NONE;
	}
	
	public class AttrSetInOrRelationship {
		boolean bExist;
		String startAttr;
		String endAttr;
	}
	
	public class SingleLiteral {
		String name;
		String value;
	}
	
	public static void main(String[] args) {
		ConfigGenerator cg = new ConfigGenerator();
		/**Solution A
		 * Compare grammars based on pure texts
		 * */
		cg.extractionWorkFlow("EAST-ADL-Full");
		cg.extractionWorkFlow("EAST-ADL-Simplified");
		cg.extractionWorkFlow("Bibtex");
		cg.extractionWorkFlow("Xenia");
		cg.extractionWorkFlow("Dot");
		cg.extractionWorkFlow("Xcore");
		cg.extractionWorkFlow("SML");
		
		/**Solution B
		 * Compare grammars based on node model (AST) 
		 * */
//		// Load the two grammar files as resources
//		XtextResourceSet resourceSet = new XtextResourceSet();
//		
//        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("*", new XtextResourceFactory());
//        
//        String pathOfRepository = "D:\\02.Git Repository\\Pretty-Printer_Language-Analysis\\org.bumble.xtext.grammaroptimizer\\";
//        String pathOfProject = pathOfRepository + "org.bumble.xtext.grammaroptimizer.configgenerator\\";
//        String pathOfGrammar1 = pathOfProject + "grammar\\generated\\generated_example.xtext";
//        String pathOfGrammar2 = pathOfProject + "grammar\\optimized\\optimized_example.xtext";
//            
//        Resource resource1 = resourceSet.getResource(URI.createURI(pathOfGrammar1), true);
//        Resource resource2 = resourceSet.getResource(URI.createURI(pathOfGrammar2), true);
//        
//        // Get the root node of each grammar
//        INode rootNode1 = NodeModelUtils.getNode(resource1.getContents().get(0));
//        INode rootNode2 = NodeModelUtils.getNode(resource2.getContents().get(0));
//        
//        // Compare the two root nodes
//        boolean result = compareNodes(rootNode1, rootNode2);
//        
//        // Print the comparison result
//        System.out.println("The two grammars are " + (result ? "identical" : "different"));
    }
	
	public void extractionWorkFlow(String languageName) {
		
		Grammar generated_grammar = new GrammarImpl();
		Grammar optimized_grammar = new GrammarImpl();
		// read the full strings of the two grammars
		String generated = FileHelper.getFileText("Generated_" + languageName + ".txt", FileHelper.FileType.GENERATED);
		String optimized = FileHelper.getFileText("Target_" + languageName + ".txt", FileHelper.FileType.TARGET);
		
		// Remove tab symbols
		generated = generated.replaceAll("\t", "    ");
		optimized = optimized.replaceAll("\t", "    ");
		
		// split grammar into grammar rules
		GrammarRuleHelper.processGrammar(generated_grammar, generated);
		GrammarRuleHelper.processManualGrammar(optimized_grammar, optimized);
		
//		// TEST CODE: WRITE GRAMMAR INTO EXCEL
//		if (languageName.equals("EAST-ADL-Full")) {
//			writeGrammarToCSV(generated_grammar, "EA-generated_grammar.csv");
//			writeGrammarToCSV(optimized_grammar, "EA-optimized_grammar.csv");
//		}

		List<String> optimizationRules = new ArrayList<String>();
		
		// compare two grammars
		compareGrammar(optimizationRules, generated_grammar, optimized_grammar);
		
		String configStr = "";
		
		// Print the rules on console
		for (int i = 0; i < optimizationRules.size(); i++) {
			//System.out.print(optimizationRules.get(i) + "\n");
			configStr += optimizationRules.get(i) + "\n";
		}
		
		if (FileHelper.setFileText("Config_" + languageName + ".txt", configStr, FileHelper.FileType.CONFIG)) {
			System.out.printf("Configuration for optimizing the generated grammar of %s has been updated!\n", languageName);
		}
	}
	
//	public void writeGrammarToCSV(Grammar grammar, String filePath) {
//	    // first create file object for file placed at location
//	    // specified by filepath
//	    File file = new File(filePath);
//	    try {
//	        // create FileWriter object with file as parameter
//	        FileWriter outputfile = new FileWriter(file);
//	  
//	        // create CSVWriter object filewriter object as parameter
//	        CSVWriter writer = new CSVWriter(outputfile);
//	  
//	        for (GrammarRule rule : grammar.getRules()) {
//	        	String ruleContent = "";
//	        	
//	        	for (int i = 0; i < rule.getLines().size(); i++) {
//	        		String lineContent = rule.getLines().get(i).getLineContent();
//	        		ruleContent += lineContent;
//	        		
//	        		if (i != rule.getLines().size() - 1) 
//	        			ruleContent += "\n";
//	        	}
//	        	
//	        	String[] content = {"Name"};
//	        	content[0] = ruleContent;
//	        	writer.writeNext(content);
//	        }
////	        // adding header to csv
////	        String[] header = { "Name", "Class", "Marks" };
////	        writer.writeNext(header);
////	  
////	        // add data to csv
////	        String[] data1 = { "Aman", "10", "620" };
////	        writer.writeNext(data1);
////	        String[] data2 = { "Suraj", "10", "630" };
////	        writer.writeNext(data2);
//	  
//	        // closing writer connection
//	        writer.close();
//	    }
//	    catch (IOException e) {
//	        // TODO Auto-generated catch block
//	        e.printStackTrace();
//	    }
//	}
	
	public void compareGrammar(List<String> optimizationRules, Grammar generated, Grammar optimized) {
		//List<String> optimizationRules = new ArrayList<String>();
		
		// clear existing import in the generated grammar 
		// and add import from the optimized grammar
		updateImport(optimizationRules, optimized);
		
		// Traverse the list storing the grammar rules of the generated grammar
		for (GrammarRule ruleInGenerated : generated.getRules()) {
			if (ruleInGenerated.getName() == null)
				continue;
			
			boolean bFindFlag = false;
			
			// the same grammar in the generated grammar may have a suffix "_Impl"
			for (GrammarRule ruleInOptimized : optimized.getRules()) {
				if (ruleInGenerated.getName().equals(ruleInOptimized.getName())) {
					bFindFlag = true;
					
					// Normalize the grammar rule in optimized grammar, this step deal with, e.g.:
					// split up the attributes if they are put in a same line.
					ruleInOptimized = normalizeGrammarRule(ruleInOptimized);
					
					// if found a grammar rule with the same name in the grammar rules
					// of the optimized grammar, compare the two grammar rules
					compareGrammarRule(optimizationRules, ruleInGenerated, ruleInOptimized);
				}
			}
			
			if (!bFindFlag) {
				if (RegexHelper.doesStringExist(ruleInGenerated.getName(), "_Impl")) {
					for (GrammarRule ruleInOptimized : optimized.getRules()) {
						if (ruleInGenerated.getName().equals(ruleInOptimized.getName() + "_Impl")) {
							boolean isSuperClass_G = isSuperClass(ruleInGenerated);
							boolean isSuperClass_O = isSuperClass(ruleInOptimized);
							
							if (isSuperClass_G == isSuperClass_O) {
								bFindFlag = true;
								
								// Normalize the grammar rule in optimized grammar, this step deal with, e.g.:
								// split up the attributes if they are put in a same line.
								ruleInOptimized = normalizeGrammarRule(ruleInOptimized);
								
								// if found a grammar rule with the same name in the grammar rules
								// of the optimized grammar, compare the two grammar rules
								compareGrammarRule(optimizationRules, ruleInGenerated, ruleInOptimized);
							}
						}
					}
				}
			}
			
			// if don't see a grammar rule with the same name in the grammar rules
			// of the optimized grammar, an optimized grammar for remove the grammar rule is extracted
			if (!bFindFlag) {
				String removeRule = "go.removeRule(\"" + ruleInGenerated.getName() + "\");";
				optimizationRules.add(removeRule);
			}
		}
		
		checkNewRuleAdded(optimizationRules, generated, optimized);
	}
	
	public void checkNewRuleAdded(List<String> optimizationRules, Grammar generated, Grammar optimized) {
		// check whether add new grammar rule in the optimized grammar
		for (GrammarRule ruleInOptimized : optimized.getRules()) {
			if (ruleInOptimized.getName() == null)
				continue;
			
			boolean bFindFlag = false;
			
			for (GrammarRule ruleInGenerated : generated.getRules()) {
				if (ruleInGenerated.getName() == null)
					continue;
				
				if (ruleInGenerated.getName().equals(ruleInOptimized.getName())) {
					bFindFlag = true;
					
					if (RegexHelper.doesStringExist(ruleInGenerated.getLines().get(ruleInGenerated.getLines().size() - 1).getLineContent(), 
							"TODO: implement this rule and an appropriate IValueConverter")) {
						bFindFlag = false;
						break;
					}
				}
			}
			
			// add new grammar rule
			if (!bFindFlag) {				
				String metaclass = null;
				String body = "";
				String annotation = null;
				boolean bTerminal = false;
				
				if (RegexHelper.doesStringExist(ruleInOptimized.getLines().get(0).getLineContent(), "Override")) {
					String[] lines = ruleInOptimized.getLines().get(1).getLineContent().split("\\s");
					
					if (!RegexHelper.doesStringExist(ruleInOptimized.getLines().get(1).getLineContent(), "terminal")) {
						if (lines.length >= 3) 
							metaclass = lines[2];
					}
					else
						bTerminal = true;
					
					for (int i = 2; i < ruleInOptimized.getLines().size(); i++) {
						body += ruleInOptimized.getLines().get(i).getLineContent();
						
						if (i != (ruleInOptimized.getLines().size() - 1)) {
							body += "\\n";
						}
					}
					
					annotation = "Override";
				}
				else {
					if (!RegexHelper.doesStringExist(ruleInOptimized.getLines().get(0).getLineContent(), "terminal")) {
						String[] lines = ruleInOptimized.getLines().get(0).getLineContent().split("\\s");
						
						if (lines.length >= 3) 
							metaclass = lines[2];
					}
					else
						bTerminal = true;
					
					for (int i = 1; i < ruleInOptimized.getLines().size(); i++) {
						body += ruleInOptimized.getLines().get(i).getLineContent();
						
						if (i != (ruleInOptimized.getLines().size() - 1)) {
							body += "\\n";
						}
					}
				}

				if (!bTerminal) {
					String addPrimitiveType = null;
					
					if (metaclass != null) {
						if (RegexHelper.doesStringExist(metaclass, "\\w*::\\w*:")) {
							Pattern pattern = Pattern.compile("(\\w*::\\w*):");
							metaclass = RegexHelper.getTargetString(metaclass, pattern);
						}
						else {
							if (RegexHelper.doesStringExist(metaclass, "\\w*:")) {
								Pattern pattern = Pattern.compile("(\\w*):");
								metaclass = RegexHelper.getTargetString(metaclass, pattern);
							}
						}
						
						if (annotation == null) {
							if (RegexHelper.doesStringExist(body, "\""))
								body = body.replaceAll("\"", "'");
							
							addPrimitiveType = "go.addPrimitiveType(\"" + ruleInOptimized.getName() + "\", \"" + metaclass +
									"\", \"" + body + "\", null);";
						}
						else {
							addPrimitiveType = "go.addPrimitiveType(\"" + ruleInOptimized.getName() + "\", \"" + metaclass +
									"\", \"" + body + "\", \"" + annotation + "\");";
						}
					}
					else {
						if (annotation == null) {
							addPrimitiveType = "go.addPrimitiveType(\"" + ruleInOptimized.getName() + "\", null, \"" + body + "\", null);";
						}
						else {
							addPrimitiveType = "go.addPrimitiveType(\"" + ruleInOptimized.getName() + "\", null, \"" + body + "\", \"" + annotation + "\");";
						}
					}

					optimizationRules.add(addPrimitiveType);
				}
				else {
					String addTerminal = null;
					if (annotation == null) {
						addTerminal = "go.addTerminalRule(\"" + ruleInOptimized.getName() + "\", \"" + body + "\", null);";
					}
					else {
						addTerminal = "go.addTerminalRule(\"" + ruleInOptimized.getName() + "\", \"" + body + "\", \"" + annotation + "\");";
					}
					optimizationRules.add(addTerminal);
				}				
			}
		}
	}
	
	public boolean isSuperClass(GrammarRule grammarRule) {
		boolean bRet = false;
		
		int firstLineIdx = -1;
		
		if (RegexHelper.doesStringExist(grammarRule.getLines().get(1).getLineContent(), "\\{\\w+\\}"))
			firstLineIdx = 2;
		else
			firstLineIdx = 1;
		
		String lineContent = grammarRule.getLines().get(firstLineIdx).getLineContent();
		
		if (RegexHelper.doesStringExist(lineContent, "\\w+(\\|\\w+)*\\|*") &&
				!RegexHelper.doesStringExist(lineContent, "'\\w+'") && 
				!RegexHelper.doesStringExist(lineContent, "="))
			bRet = true;
		
		return bRet;
	}
	
	public void updateImport(List<String> optimizationRules, Grammar optimized) {
		// First, clear all existing import
		String removeImport = "go.removeImport(null);";
		optimizationRules.add(removeImport);
		
		List<String> importList = new ArrayList<String>();
		
		for (GrammarRule rule : optimized.getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty()) {
				for (LineEntry line : rule.getLines()) {
					if (RegexHelper.doesStringExist(line.getLineContent(), "import")) {
						String[] lines = line.getLineContent().split("\\s");
						
						if (lines.length > 0) {
							String importContent = null;
							
							if (RegexHelper.doesStringExist(lines[1], "\".*\"")) {
								Pattern pattern = Pattern.compile("\"(.*)\"");
								importContent = RegexHelper.getTargetString(lines[1], pattern);
							}
							
							//go.addImport("http://www.eclipse.org/emf/2002/Ecore", "ecore");
							String addImport = null;
							if (lines.length ==4)
								addImport = "go.addImport(\"" + importContent + "\", \"" + lines[3] + "\");";
							else 
								addImport = "go.addImport(\"" + importContent + "\", null);";
							
							optimizationRules.add(addImport);
						}
					}
				}
			}
			else
				break;
		}
	}
	
	// to be finished
	public void compareGrammarRule(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {		
		// Compare the name
		if (!ruleInGenerated.getName().equals(ruleInOptimized.getName())) {
			boolean isSuperClass_G = isSuperClass(ruleInGenerated);
			boolean isSuperClass_O = isSuperClass(ruleInOptimized);
			boolean bAvoid = false;
			
			if (RegexHelper.doesStringExist(ruleInGenerated.getName(), "_Impl")) {
				if (isSuperClass_G != isSuperClass_O)
					bAvoid = true;
			}
			
			if (!bAvoid) {
				String renameRule = "go.renameRule(\"" + ruleInGenerated.getName() + "\", \"" + ruleInOptimized.getName() + "\");";
				optimizationRules.add(renameRule);
			}
		}
		
		// Check if the Action is removed
		compareAction(optimizationRules, ruleInGenerated, ruleInOptimized);
	
		// compare the last line of the two grammar rules if they are the same one super class
		// example for super class:
		// Type returns emof::Type:
		//     Class | DataType_Impl | Enumeration | PrimitiveType;
		if (isSuperClass(ruleInGenerated) && isSuperClass(ruleInOptimized)) {
			compareSuperClass(optimizationRules, ruleInGenerated, ruleInOptimized);
		}

		// compare the main keyword
		compareMainKeyword(optimizationRules, ruleInGenerated, ruleInOptimized);
		
		// compare the attribute lines
		compareAttributeLines(optimizationRules, ruleInGenerated, ruleInOptimized);
		
		// check line orders
		compareLineOrderNew(optimizationRules, ruleInGenerated, ruleInOptimized);	
		
		// compare the container braces
		compareContainerBraces(optimizationRules, ruleInGenerated, ruleInOptimized);
		
		// compare enum
		compareEnumRule(optimizationRules, ruleInGenerated, ruleInOptimized);
	}
	
	public void compareEnumRule(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {
		// In the generated syntax, enum rules default to the first line with the enum keyword
		boolean isEnum = false;

		if (RegexHelper.doesStringExist(ruleInGenerated.getLines().get(0).getLineContent(), "enum " + ruleInGenerated.getName())) {
			isEnum = true;
		}
		
		if (isEnum) {
			// The follow code is for collecting all the literals into a list (generated grammar side)
			List<SingleLiteral> literalList_G = new ArrayList<SingleLiteral>();
			getLiteralList(literalList_G, ruleInGenerated, false);
			
			// The follow code is for collecting all the literals into a list (target grammar side)
			List<SingleLiteral> literalList_O = new ArrayList<SingleLiteral>();
			getLiteralList(literalList_O, ruleInOptimized, true);

			for (int i = 0; i < literalList_G.size(); i++) {
				boolean bFound = false;
				
				for (int j = 0; j < literalList_O.size(); j++) {
					if (literalList_G.get(i).name.equals(literalList_O.get(j).name)) {
						bFound = true;
						
						if (!literalList_G.get(i).value.equals(literalList_O.get(j).value)) {
							String command = "go.renameKeyword(\"" + ruleInGenerated.getName() + "\", null, \"" + 
								literalList_G.get(i).value + "\", \"" + literalList_O.get(j).value + "\", null);";
							optimizationRules.add(command);
						}
						
						break;
					}
				}
				
				if (!bFound) {
					// removeLiteralFromEnum
					String command = "go.removeLiteralFromEnum(\"" + ruleInGenerated.getName() + "\", \"" + literalList_G.get(i).name + "\");";
					optimizationRules.add(command);
				}
			}
		}
	}
	
	public void getLiteralList(List<SingleLiteral> literalList, GrammarRule rule, boolean isTarget) {
		String strip = "";
		
		if (isTarget) {
			for (int j = 1; j < rule.getLines().size(); j++) {
				strip += rule.getLines().get(j).getLineContent().strip();
			}
		}
		else {
			Pattern pattern = Pattern.compile("(.*)\\;");
			strip = RegexHelper.getTargetString(rule.getLines().get(1).getLineContent().strip(), pattern);
		}
		
		String literals[] = strip.split("\\s*\\|\\s*");
		
		for (int i = 0; i < literals.length; i++) {
			SingleLiteral singleLiteral = getSingleLiteral(literals[i]);
			literalList.add(singleLiteral);
		}
	}
	
	public SingleLiteral getSingleLiteral(String literal) {
		SingleLiteral singleLiteral = new SingleLiteral();
		
		String subStr[] = literal.split("\\s*=\\s*");
		
		if (subStr.length == 2) {
			singleLiteral.name = subStr[0];
			Pattern pattern = Pattern.compile("'(\\w+|\\W+)'.*");
			singleLiteral.value = RegexHelper.getTargetString(literal, pattern);
		}
		
		return singleLiteral;
	}
	
	public void compareSuperClass(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {
		// to get all the called rules' names in the grammar rule from generated grammar
		String secondLineStr_G = ruleInGenerated.getLines().get(1).getLineContent();
		Pattern pattern_G = Pattern.compile("(\\w+(\\s\\|\\s\\w+)*).*");
		String ruleCallingList_G = RegexHelper.getTargetString(secondLineStr_G, pattern_G);
		String[] ruleNames_G = ruleCallingList_G.split("\\s\\|\\s");
		
		// to get all the called rules' names in the grammar rule from target grammar
		String secondLineStr_O = "";
		for (int i = 1; i < ruleInOptimized.getLines().size(); i++) {
			secondLineStr_O += ruleInOptimized.getLines().get(i).getLineContent().strip();
		}
		Pattern pattern_O = Pattern.compile("(\\w+(\\s*\\|\\s*\\w+)*).*");
		String ruleCallingList_O = RegexHelper.getTargetString(secondLineStr_O, pattern_O);
		String[] ruleNames_O = ruleCallingList_O.split("\\s*\\|\\s*");
		
		// if there are some rule calling in both side, then compare them
		compareCalledNameList(optimizationRules, ruleInGenerated.getName(), ruleNames_G, ruleNames_O);

		// check if all the called rules are packaged
		String regex = "\\w+(\\s*\\|\\s*\\w+)*";
		
		if (RegexHelper.doesStringExist(secondLineStr_O, "\\(\\s*" + regex + "\\s*\\)") && 
				!RegexHelper.doesStringExist(secondLineStr_O, "\\w+\\s*\\(\\s*" + regex) &&
				!RegexHelper.doesStringExist(secondLineStr_O, regex + "\\s*\\)\\s*\\w+")) {
			//go.addParenthesesWithoutQuoteToRule("Stmt", MultiplicityKey.PACKAGE_ONLY);
			String command = "go.addParenthesesWithoutQuoteToRule(\"" + ruleInGenerated.getName() + "\", MultiplicityKey.PACKAGE_ONLY);";
			optimizationRules.add(command);
			
			if (RegexHelper.doesStringExist(secondLineStr_O, "'\\['\\s*.*" + regex + ".*\\s*'\\]'")) {
//				go.addBracesToRule("AbstractRanges");
//				go.changeBracesToSquare("AbstractRanges", null);
				String command1 = "go.addBracesToRule(\"" + ruleInGenerated.getName() + "\");";
				optimizationRules.add(command1);
				String command2 = "go.changeBracesToSquare(\"" + ruleInGenerated.getName() + "\", null);";
				optimizationRules.add(command2);
			}
		}
		
		// check if a new symbol added to the superclass
		if (RegexHelper.doesStringExist(secondLineStr_O, regex + ".*'\\W+'.*\\;")) {
			Pattern pattern = Pattern.compile(".*'([?,!,@,$,%,^,&,*,(,),;,:,=])'.*");
			String symbol = RegexHelper.getTargetString(secondLineStr_O, pattern);
			
			if (RegexHelper.doesStringExist(secondLineStr_O, regex + ".*'\\" + symbol + "'.*\\;")) {
				//go.addSymbolToRule("Stmt", ";");
				String command = "go.addSymbolToRule(\"" + ruleInGenerated.getName() + "\", \"" + symbol + "\");";
				optimizationRules.add(command);
				
				if (RegexHelper.doesStringExist(secondLineStr_O, regex + ".*\\(\\s*'\\" + symbol + "'\\s*\\)\\?.*\\;")) {
					//go.addOptionalityToSymbol("Stmt", null, ";");
					command = "go.addOptionalityToSymbol(\"" + ruleInGenerated.getName() + "\", null, \"" + symbol + "\");";
					optimizationRules.add(command);
				}
			}
		}
	}
	
	public void compareCalledNameList(List<String> optimizationRules, String grammarRule, String[] ruleNames_G, String[] ruleNames_O) {
		if (ruleNames_G.length > 0 && ruleNames_O.length > 0) {
			for (int m = 0; m < ruleNames_G.length; m++) {
				boolean bExist = false;
				
				for (int n = 0; n < ruleNames_O.length; n++) {					
					if (ruleNames_G[m].equals(ruleNames_O[n])) {
						bExist = true;
						break;
					}
					
					if (ruleNames_G[m].equals(ruleNames_O[n] + "_Impl")) {
						boolean duplicate = false;
						for (int o = 0; o < ruleNames_G.length; o++) {
							if (ruleNames_G[o].equals(ruleNames_O[n])) {
								duplicate = true;
								break;
							}
						}
						
						// TODO: here should be another iteration to check whether
						// there is one called name in list 'ruleNames_O' which is equal to  
						// ruleNames_O[n] + "_Impl". Will be done in future.
						
						if (!duplicate) {
							//go.changeCalledRule("Stmt", "SubgraphOrEdgeStmtSubgraph_Impl", "SubgraphOrEdgeStmtSubgraph");
							String command = "go.changeCalledRule(\"" + grammarRule + "\", \"" + ruleNames_G[m] +
									"\", \"" + ruleNames_O[n] + "\");";
							optimizationRules.add(command);
							bExist = true;
							break;
						}
					}
				}
				
				if (!bExist) {
					//go.removeRuleCall("Stmt", "Stmt_Impl");
					String command = "go.removeRuleCall(\"" + grammarRule + "\", \"" + ruleNames_G[m] + "\");";
					optimizationRules.add(command);
				}
			}
		}
	}
	
	public void compareContainerBraces(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {
		boolean bContainerInGR = false;
		boolean bOriginalContainerInOG = false;
		boolean bContainerWithQuestionInOG = false;
		boolean bSquareContainerInOG = false;
		boolean bParenthesesContainerInOG = false;
		
		// check if container braces exist in the generated grammar rule
		for (LineEntry lineGR : ruleInGenerated.getLines()) {
			String lineNoSpace = lineGR.getLineContent().strip();
			if (lineNoSpace.equals("'{'")) {
				bContainerInGR = true;
				break;
			}
		}
		
		// check if container braces exist in the optimized grammar rule
		boolean bOriginalFindOpening = false;
		boolean bOriginalFindClosing = false;
		boolean bFindOpening = false;
		boolean bFindClosing = false;
		boolean bSquareOpening = false;
		boolean bSquareClosing = false;
		boolean bParenthesesOpening = false;
		boolean bParenthesesClosing = false;
		
		for (LineEntry lineOG : ruleInOptimized.getLines()) {
			if (lineOG.getLineContent().strip().equals("'{'")) {
				bOriginalFindOpening = true;
			}
			
			if (lineOG.getLineContent().strip().equals("('{'")) {
				bFindOpening = true;
			}
			
			if (lineOG.getLineContent().strip().equals("'['")) {
				bSquareOpening = true;
			}
			
			if (lineOG.getLineContent().strip().equals("'('")) {
				bParenthesesOpening = true;
			}
			
			if (lineOG.getLineContent().strip().equals("'}'") || lineOG.getLineContent().strip().equals("'}';")) {
				bOriginalFindClosing = true;
			}
			
			if (lineOG.getLineContent().strip().equals("'}')?") || lineOG.getLineContent().strip().equals("'}')?;")) {
				bFindClosing = true;
			}
			
			if (lineOG.getLineContent().strip().equals("']'") || lineOG.getLineContent().strip().equals("']';")) {
				bSquareClosing = true;
			}
			
			if (lineOG.getLineContent().strip().equals("')'") || lineOG.getLineContent().strip().equals("')';")) {
				bParenthesesClosing = true;
			}
			
			if (bOriginalFindOpening && bOriginalFindClosing) {
				bOriginalContainerInOG = true;
				break;
			}
			
			if (bFindOpening && bFindClosing) {
				bContainerWithQuestionInOG = true;
				break;
			}
			
			if (bSquareOpening && bSquareClosing) {
				bSquareContainerInOG = true;
				break;
			}
			
			if (bParenthesesOpening && bParenthesesClosing) {
				bParenthesesContainerInOG = true;
				break;
			}
		}

		// if both sides have container braces, then judge if ()? is added
		if (bContainerInGR) {
			if (bContainerWithQuestionInOG) {
				// go.addOptionalityToContainerBraces(null, MultiplicityKey.MULTIPLICITY_OPTIONAL);
				String addOptToContainer = "go.addOptionalityToContainerBraces(\"" + ruleInGenerated.getName() + 
						"\", MultiplicityKey.MULTIPLICITY_OPTIONAL);";
				optimizationRules.add(addOptToContainer);
			}
			else if (bSquareContainerInOG) {
				// go.changeBracesToSquare("InterruptCondition", null);
				if (!isBracesInAttribute(ruleInGenerated)) {
					String command = "go.changeBracesToSquare(\"" + ruleInGenerated.getName() + "\", null);";
					optimizationRules.add(command);
				}
			}
			else if (bParenthesesContainerInOG) {
				// TODO:
			}
			else if (!bOriginalContainerInOG) {
				String removeContainerBraces = "go.removeContainerBraces(\"" + ruleInGenerated.getName() + "\");";
				optimizationRules.add(removeContainerBraces);
			}
		}
	}
	
	public boolean isBracesInAttribute(GrammarRule rule) {
		boolean bRet = false;
		
		for (LineEntry line : rule.getLines()) {
			String lineStr = line.getLineContent();
			
			if (RegexHelper.doesStringExist(lineStr, "\\w+\\s*\\+*=") &&
					(RegexHelper.doesStringExist(lineStr, "'\\{'") ||
					RegexHelper.doesStringExist(lineStr, "'\\}'"))) {
				bRet = true;
				break;
			}
		}
		
		return bRet;
	}
	
	public void compareAction(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {		
		String action_G = null;
		String action_O = null;
		
		if (ruleInGenerated.getLines().size() >= 3) {
			if (RegexHelper.doesStringExist(ruleInGenerated.getLines().get(1).getLineContent(), "\\{\\w+\\}")) {
				Pattern pattern = Pattern.compile("\\{(\\w+)\\}");
				action_G = RegexHelper.getTargetString(ruleInGenerated.getLines().get(1).getLineContent(), pattern);
			}
		}
		
		for (int i = 0; i < ruleInOptimized.getLines().size(); i++) {
			if (RegexHelper.doesStringExist(ruleInOptimized.getLines().get(i).getLineContent(), "\\s\\{\\w+\\}")) {
				Pattern pattern = Pattern.compile("\\{(\\w+)\\}.*");
				action_O = RegexHelper.getTargetString(ruleInOptimized.getLines().get(i).getLineContent(), pattern);
			}
		}
		
		if (action_G != null && action_O == null) {
			String removeAction = "go.removeAction(\"" + ruleInOptimized.getName() + "\");";
			optimizationRules.add(removeAction);
		}
	}
	
	public RecognizableLine getRecognizableLine(GrammarRule rule, int index) {
		RecognizableLine recognizableLine = new RecognizableLine();
		
		if ((index) >= 0 && index < rule.getLines().size()) {
			String lineContent = rule.getLines().get(index).getLineContent();
			
			if (RegexHelper.doesStringExist(lineContent, "\\w+\\+*=") ||
					RegexHelper.doesStringExist(lineContent, "\\'\\w+\\'") ||
					GrammarRuleHelper.isBracket(lineContent)) {
				recognizableLine = getRecognizableLineInfo(lineContent, index);
			}
			else {
				recognizableLine.index = index;
				recognizableLine.key = null;
				recognizableLine.lineType = LineType.NONE;
			}
		}
		else {
			recognizableLine.index = index;
			recognizableLine.key = null;
			recognizableLine.lineType = LineType.NONE;
		}
		
		return recognizableLine;
	}
	
	public void compareLineOrderNew(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {
		RecognizableLine currentLine_G = new RecognizableLine();
		RecognizableLine currentLine_O = new RecognizableLine();
		RecognizableLine previousLine_G = new RecognizableLine();
		RecognizableLine previousLine_O = new RecognizableLine();
		RecognizableLine nextLine_G = new RecognizableLine();
		RecognizableLine nextLine_O = new RecognizableLine();
		
		for (int i = 0; i < ruleInOptimized.getLines().size(); i++) {
			String curLineStr = ruleInOptimized.getLines().get(i).getLineContent();
			
			if (RegexHelper.doesStringExist(curLineStr, "\\w+\\+*=") ||
					RegexHelper.doesStringExist(curLineStr, "\\'\\w+\\'") ||
					GrammarRuleHelper.isBracket(curLineStr)) {
				currentLine_O = getRecognizableLineInfo(curLineStr, i);
				
				previousLine_O = getRecognizableLine(ruleInOptimized, i - 1);
				nextLine_O = getRecognizableLine(ruleInOptimized, i + 1);
				
				int iCounterpartLine_G = getCounterpartLineInOR(currentLine_O, ruleInGenerated);
				
				if (iCounterpartLine_G >= 0) {
					currentLine_G = getRecognizableLineInfo(ruleInGenerated.getLines().get(iCounterpartLine_G).getLineContent(), iCounterpartLine_G);
					previousLine_G = getRecognizableLine(ruleInGenerated, iCounterpartLine_G - 1);
					nextLine_G = getRecognizableLine(ruleInGenerated, iCounterpartLine_G + 1);
				}
				else {
					currentLine_G.index = -1;
					currentLine_G.key = null;
					currentLine_G.lineType = LineType.NONE;
					continue;
				}
			}
			else
				continue;
			
			// there should be something wrong
			if (currentLine_O.index < 0 || currentLine_O.lineType == LineType.NONE) {
				continue;
			}
			
			// if the counterpart is not found in optimized grammar, this should be removed, so then
			// it will be handled in other methods.
			if (currentLine_G.index < 0 || currentLine_G.lineType == LineType.NONE) {
				continue;
			}
			
			// to move the lines
			// go.moveLine("XPackage", "annotations", "package", true);
			if (previousLine_O.lineType != LineType.NONE) {
				if (previousLine_G.lineType == LineType.NONE || previousLine_G.lineType != previousLine_O.lineType || 
						!previousLine_G.key.equals(previousLine_O.key)) {
					if (checkLineExist(previousLine_O, ruleInGenerated)) {
						String command = "go.moveLine(\"" + ruleInGenerated.getName() + "\", \"" + currentLine_G.key + "\", \"" + 
							previousLine_O.key + "\", false);";
						optimizationRules.add(command);
					}
				}
			}
			else {
				if (nextLine_O.lineType != LineType.NONE && checkLineExist(nextLine_O, ruleInGenerated)) {
					String command = "go.moveLine(\"" + ruleInGenerated.getName() + "\", \"" + currentLine_G.key + "\", \"" +
						nextLine_O.key + "\", true);";
					optimizationRules.add(command);
				}
			}
		}
	}
	
	public boolean checkLineExist(RecognizableLine line, GrammarRule rule) {
		String regex = null;
		boolean bExist = false;
		
		if (line.lineType == LineType.ATTR)
			regex = line.key + "\\s*\\+*=";
		else if (line.lineType == LineType.KEYWORD) 
			regex = "'" + line.key + "'";
		else if (line.lineType == LineType.BRACKET)
			regex = "'\\" + line.key + "'";
		else
			return false;
		
		for (LineEntry le : rule.getLines()) {
			if (RegexHelper.doesStringExist(le.getLineContent(), regex)) {
				bExist = true;
				break;
			}
		}
		
		return bExist;
	}
	
	public void compareLineOrder(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {
		RecognizableLine lineGR = new RecognizableLine();
		RecognizableLine lineNextGR = new RecognizableLine();
		RecognizableLine lineOR = new RecognizableLine();
		RecognizableLine lineNextOR = new RecognizableLine();
		
		for (int i = 0; i < ruleInGenerated.getLines().size(); i++) {
			// to get what is the current line and what is next line
			if (RegexHelper.doesStringExist(ruleInGenerated.getLines().get(i).getLineContent(), "\\w+\\+*=") ||
					RegexHelper.doesStringExist(ruleInGenerated.getLines().get(i).getLineContent(), "\\'\\w+\\'") ||
					GrammarRuleHelper.isBracket(ruleInGenerated.getLines().get(i).getLineContent())) {
				lineGR = getRecognizableLineInfo(ruleInGenerated.getLines().get(i).getLineContent(), i);
				
				if ((i + 1) < ruleInGenerated.getLines().size()) {
					if (RegexHelper.doesStringExist(ruleInGenerated.getLines().get(i + 1).getLineContent(), "\\w+\\+*=") ||
							RegexHelper.doesStringExist(ruleInGenerated.getLines().get(i + 1).getLineContent(), "'\\w+'") || 
							GrammarRuleHelper.isBracket(ruleInGenerated.getLines().get(i + 1).getLineContent())) {
						lineNextGR = getRecognizableLineInfo(ruleInGenerated.getLines().get(i + 1).getLineContent(), i + 1);
					}
					else {
						lineNextGR.index = i + 1;
						lineNextGR.key = null;
						lineNextGR.lineType = LineType.NONE;
					}
				}
				else {
					lineNextGR.index = -1;
					lineNextGR.key = null;
					lineNextGR.lineType = LineType.NONE;
				}
				
				int iCounterpartLineInOR = getCounterpartLineInOR(lineGR, ruleInOptimized);
				
				if (iCounterpartLineInOR >= 0) {
					lineOR = getRecognizableLineInfo(ruleInOptimized.getLines().get(iCounterpartLineInOR).getLineContent(), iCounterpartLineInOR);
					
					if ((iCounterpartLineInOR + 1) < ruleInOptimized.getLines().size()) {
						lineNextOR = getRecognizableLineInfo(ruleInOptimized.getLines().get(iCounterpartLineInOR + 1).getLineContent(), iCounterpartLineInOR + 1);
					}
					else {
						lineNextOR.index = iCounterpartLineInOR + 1;
						lineNextOR.key = null;
						lineNextOR.lineType = LineType.NONE;
					}
				}
				else {
					lineOR.index = -1;
					lineOR.key = null;
					lineOR.lineType = LineType.NONE;
					continue;
				}
			}
			else {
				continue;
			}
			
			// there should be something wrong
			if (lineGR.index < 0 || lineGR.lineType == LineType.NONE) {
				continue;
			}
			
			// if the counterpart is not found in optimized grammar, this should be removed, so then
			// it will be handled in other methods.
			if (lineOR.index < 0 || lineOR.lineType == LineType.NONE) {
				continue;
			}
			
			// to move the lines
			// go.moveLine("XPackage", "annotations", "package", true);
			if (lineNextGR.lineType == LineType.NONE) {
				if (lineNextOR.lineType != LineType.NONE) {
					String moveLine = "go.moveLine(\"" + ruleInGenerated.getName() + "\", \"" + lineNextOR.key + "\", \"" + lineGR.key + "\", false);";
					optimizationRules.add(moveLine);
				}
				else
					continue;
			}
			else {
				if (lineNextOR.lineType == LineType.NONE)
					continue;
				else {
					if (lineNextGR.lineType != lineNextOR.lineType || !lineNextGR.key.equals(lineNextOR.key)) {
						String moveLine = "";
						
						if (lineNextOR.index < lineNextGR.index) {
							moveLine = "go.moveLine(\"" + ruleInGenerated.getName() + "\", \"" + lineNextOR.key + "\", \"" + lineGR.key + "\", false);";
						}
						else 
							moveLine = "go.moveLine(\"" + ruleInGenerated.getName() + "\", \"" + lineGR.key + "\", \"" + lineNextOR.key + "\", true);";
						optimizationRules.add(moveLine);
					}
				}
			}
		}
	}
	
	@SuppressWarnings({ "unlikely-arg-type" })
	public int getCounterpartLineInOR(RecognizableLine lineGR, GrammarRule ruleInOptimized) {
		int i = -1;
		boolean bFound = false;
		
		String regex = null;
		
		if (lineGR.lineType == LineType.ATTR) {
			//regex = "\\w+\\+*=";
			regex = lineGR.key + "\\s*\\+*=";
		}
		else if (lineGR.lineType == LineType.KEYWORD) {
			//regex = "'\\w+'";
			regex = "'" + lineGR.key + "'";
		}
		
		if (lineGR.lineType == LineType.ATTR || lineGR.lineType == LineType.KEYWORD) {
			for (i = 0; i < ruleInOptimized.getLines().size(); i++) {
				String lineContent = ruleInOptimized.getLines().get(i).getLineContent();
				if (RegexHelper.doesStringExist(lineContent, regex)) {
					bFound = true;
					break;
				}
			}
			
			if (!bFound)
				i = -1;
			else
				return i;
		}

		
		if (lineGR.lineType == LineType.BRACKET) {
			boolean bFound1 = false;
			for (i = 0; i < ruleInOptimized.getLines().size(); i++) {
				String lineContent = ruleInOptimized.getLines().get(i).getLineContent();
				
				if (!GrammarRuleHelper.isBracket(lineContent))
					continue;
				
				if ((lineGR.key.equals("{")) && 
						(lineContent.strip().equals("'{'") || lineContent.strip().equals("('{'"))) {
					bFound1 = true;
					break;
				}
				else if ((lineGR.key.equals("}")) && (lineContent.strip().equals("'}';") || lineContent.strip().equals("'}')?;") ||
						lineContent.strip().equals("'}'") || lineContent.strip().equals("'}')?"))) {
					bFound1 = true;
					break;
				}
				else if (lineGR.key.equals("]") && (lineContent.strip().equals("']'") || lineContent.strip().equals("']';"))) {
					bFound1 = true;
					break;
				}
				else if (lineGR.key.equals(")") && (lineContent.strip().equals("')'") || lineContent.strip().equals("')';"))) {
					bFound1 = true;
					break;
				}
				else if (lineContent.strip().equals("'" + lineGR.key + "'")) {
					bFound1 = true;
					break;
				}
			}
			
			if (bFound1) {
				return i;
			}
			else
				i = -1;
		}
		
		return i;
	}
	
	public RecognizableLine getRecognizableLineInfo(String lineContent, int index) {
		RecognizableLine line = new RecognizableLine();
		String regex = null;
		
		if (RegexHelper.doesStringExist(lineContent, "\\w+\\s*\\+*=")) {
			line.index = index;
			line.lineType = LineType.ATTR;
			regex = "(\\w+)\\s*\\+*=.*";
			Pattern pattern = Pattern.compile(regex);
			line.key = RegexHelper.getTargetString(lineContent, pattern);
		}
		else {
			if (RegexHelper.doesStringExist(lineContent, "'\\w+'")) {
				line.index = index;
				line.lineType = LineType.KEYWORD;
				regex = "'(\\w+)'.*";
				Pattern pattern = Pattern.compile(regex);
				line.key = RegexHelper.getTargetString(lineContent, pattern);
			}
			else {
				if (GrammarRuleHelper.isBracket(lineContent)) {
					line.index = index;
					line.lineType = LineType.BRACKET;
					//line.key = lineContent;
					regex = "'(\\W+)'.*";
					Pattern pattern = Pattern.compile(regex);
					line.key = RegexHelper.getTargetString(lineContent, pattern);
				}
			}
		}
		
		return line;
	}

	public void compareMainKeyword(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {
		
		if (RegexHelper.doesStringExist(ruleInGenerated.getLines().get(ruleInGenerated.getLines().size() - 1).getLineContent(), 
				"TODO: implement this rule and an appropriate IValueConverter")) {
			return;
		}
		
		String ruleName = ruleInGenerated.getName();
		
		if (RegexHelper.doesStringExist(ruleName, "_Impl")) {
			String regex = "(\\w*)_Impl";
			Pattern pattern = Pattern.compile(regex);
			ruleName = RegexHelper.getTargetString(ruleName, pattern);
			
			// TODO:
		}

		String regex4MainKeyword = "\'" +  ruleName + "\'";
		
		boolean bHasMainKeyword = false;
		
		for (LineEntry line : ruleInGenerated.getLines()) {
			if (RegexHelper.doesStringExist(line.getLineContent(), regex4MainKeyword)) {
				bHasMainKeyword = true;
				break;
			}
		}
		
		if (bHasMainKeyword) {
			boolean bHasMainKeywordInOG = false;
			for (LineEntry line : ruleInOptimized.getLines()) {
				String stripLeading = line.getLineContent().stripLeading();
				String[] lines = stripLeading.split("\\s");
				
				if (lines.length == 1) {
					if (RegexHelper.doesStringExist(lines[0], "'\\W*\\w+'") && 
							!RegexHelper.doesStringExist(lines[0], "(\\w+|\\W+)'\\W*\\w+'")) {
						bHasMainKeywordInOG = true;
						Pattern pattern = Pattern.compile("'(.*)'.*");
						String mainKeywordInOG = RegexHelper.getTargetString(lines[0], pattern);
						
						if (!ruleName.equals(mainKeywordInOG) && RegexHelper.doesStringExist(mainKeywordInOG, "\\w")) {
							String renameKeyword = "go.renameKeyword(\"" + ruleName + "\", null, \"" + ruleName +
									"\", \"" + mainKeywordInOG + "\", null);";
							optimizationRules.add(renameKeyword);
						}
					}
				}
			}
			
			if (!bHasMainKeywordInOG) {
				String removeKeyword = "go.removeKeyword(\"" + ruleName + "\", null, \"" + ruleName + "\", null);"; 
				optimizationRules.add(removeKeyword);
			}
		}
		else {
			// if there is no main keyword in the grammar rule from the generated
			// grammar, we assume there will not be a main keyword in the same 
			// grammar rule in the optimized grammar, so, just return.
			return;
		}
	}
	
	public void compareAttributeLines(List<String> optimizationRules, GrammarRule ruleInGenerated, GrammarRule ruleInOptimized) {	
		// a grammar rule with attribute lines must have at least 5 lines
		if (ruleInGenerated.getLines().size() < 4)
			return;
		else {
			boolean bAttrExist_O = false;
			boolean bAttrExist_G = false;
			
			for (LineEntry line_G : ruleInGenerated.getLines()) {
				if (RegexHelper.doesStringExist(line_G.getLineContent(), "\\w+\\+*=")) {
					bAttrExist_G = true;
					break;
				}
			}
			
			for (LineEntry line_O : ruleInOptimized.getLines()) {
				if (RegexHelper.doesStringExist(line_O.getLineContent(), "\\w+\\s*\\+*=")) {
					bAttrExist_O = true;
					break;
				}
			}
			
			if (bAttrExist_O && !bAttrExist_G) {
				String ruleContent = "";
				
				for (int i = 1; i < ruleInOptimized.getLines().size(); i++) {
					ruleContent += ruleInOptimized.getLines().get(i).getLineContent();
					
					if (i != (ruleInOptimized.getLines().size() - 1)) {
						ruleContent += "\\n";
					}
				}
				
				if (ruleContent != "") {
					String command = "go.changeRuleContent(\"" + ruleInOptimized.getName() + "\", \"" + ruleContent + "\");";
					optimizationRules.add(command);
					return;
				}
			}
		}
		
		AttrSetInOrRelationship attrSet = getAttrSetInOrRelationship(ruleInOptimized);
		
		for (LineEntry line : ruleInGenerated.getLines()) {
			if (RegexHelper.doesStringExist(line.getLineContent(), "\\w*\\+*=\\w*")) {
				String attrName = line.getAttrName();
				boolean bFindFlag = false;
				
				for (LineEntry lineO : ruleInOptimized.getLines()) {
					if (RegexHelper.doesStringExist(lineO.getLineContent(), attrName + "\\s*\\+*=") || 
							RegexHelper.doesStringExist(lineO.getLineContent(), attrName + "\\?='\\w+'")) {
						compareAttributeLine(optimizationRules, ruleInGenerated.getName(), line, lineO, attrSet.bExist);
						
						bFindFlag = true;
						break;
					}
				}
				
				// if can't find the same attribute, that means this attribute has been removed
				if (!bFindFlag) {
					String removeAttribute = "go.removeAttribute(\"" + ruleInGenerated.getName() + "\", \"" + line.getAttrName() + "\");";
					optimizationRules.add(removeAttribute);
				}
			}
		}
		
		if (attrSet.bExist) {
			String command = "go.changeOptionalAttrToOrRelation(\"" + ruleInOptimized.getName() + "\", false, \"" + 
				attrSet.startAttr + "\", \"" + attrSet.endAttr + "\");";
			optimizationRules.add(command);
		}
	}
	
	public AttrSetInOrRelationship getAttrSetInOrRelationship(GrammarRule rule) {
		int bFirstAttrIndex = -1;
		int bLastAttrIndex = -1;
		AttrSetInOrRelationship attrSet = new AttrSetInOrRelationship();
		attrSet.startAttr = null;
		attrSet.endAttr = null;
		attrSet.bExist = false;
		
		// find the first attribute end with |
		for (int i = 0; i < rule.getLines().size(); i++) {
			if (RegexHelper.doesStringExist(rule.getLines().get(i).getLineContent(), "\\w+\\+*=.*\\|") && 
					!RegexHelper.doesStringExist(rule.getLines().get(i).getLineContent(), "\\w+\\+*=.*\\|\\w")) {
				bFirstAttrIndex = i;
				break;
			}
		}
		
		if (bFirstAttrIndex >= 0) {
			for (int j = bFirstAttrIndex; j < rule.getLines().size(); j++) {
				if (!RegexHelper.doesStringExist(rule.getLines().get(j).getLineContent(), "\\w+\\+*=.*\\|")) {
					bLastAttrIndex = j;
					break;
				}
			}		
			
			if (bFirstAttrIndex >= 0 && bLastAttrIndex > bFirstAttrIndex) {
				Pattern pattern = Pattern.compile("(\\w+)\\+*=.*");
				String startAttr = RegexHelper.getTargetString(rule.getLines().get(bFirstAttrIndex).getLineContent(), pattern);
				String endAttr = RegexHelper.getTargetString(rule.getLines().get(bLastAttrIndex).getLineContent(), pattern);
				attrSet.startAttr = startAttr;
				attrSet.endAttr = endAttr;
				attrSet.bExist = true;
			}
			else if (bFirstAttrIndex >= 0 && bLastAttrIndex == -1) {
				Pattern pattern = Pattern.compile("(\\w+)\\+*=.*");
				String startAttr = RegexHelper.getTargetString(rule.getLines().get(bFirstAttrIndex).getLineContent(), pattern);
				String endAttr = RegexHelper.getTargetString(rule.getLines().get(bFirstAttrIndex + 1).getLineContent(), pattern);
				attrSet.startAttr = startAttr;
				attrSet.endAttr = endAttr;
				attrSet.bExist = true;
			}
		}

		return attrSet;
	}
	
	public void compareLineOptionality(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized, boolean bChangeToOrRationship) {
		String lineContent_G = lineInGenerated.getLineContent();
		String lineContent_O = lineInOptimized.getLineContent();
		
		boolean bAttrOptional_G = false;
		boolean bAttrOptional_O = false;
		
		if (RegexHelper.doesStringExist(lineContent_G, "\\(.*\\)\\?")) {
			bAttrOptional_G = true;
		}
		
		if (RegexHelper.doesStringExist(lineContent_O, "\\(.*\\)\\?")) {
			bAttrOptional_O = true;
		}
		
		// Should be note:
		// if there are a set of continuous attributes that are in relationship
		// then we won't remove its ()? from here, instead, there will be another
		// optimization rule to handle this case, this is why flag variable 
		// bChangeToOrRationship is here.
		if (bAttrOptional_G && !bAttrOptional_O && !bChangeToOrRationship) {
			String removeOptionality = "go.removeOptionality(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\");";
			optimizationRules.add(removeOptionality);
		}
		
		if (!bAttrOptional_G && bAttrOptional_O) {
			String addOptionality = "go.addOptionalityToAttr(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\");";
			optimizationRules.add(addOptionality);
		}
	}
	
	public void compareAttrKeyword(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		String lineContent_G = lineInGenerated.getLineContent();
		String lineContent_O = lineInOptimized.getLineContent();
		
		String attrName = lineInGenerated.getAttrName();
		
		if (RegexHelper.doesStringExist(lineContent_G, "\\'" + attrName + "\\'")) {
			List<String> keywords_O = new ArrayList<String>();
			
			String[] subContents = lineContent_O.split("\\s");
			int iKeywordCnt = 0;
			
			for (int i = 0; i < subContents.length; i++) {
				if (RegexHelper.doesStringExist(subContents[i], "\\'\\w*\\'")) {
					String regex = "\\'(\\w*)\\'.*";
					Pattern pattern = Pattern.compile(regex);
					String keyword = RegexHelper.getTargetString(subContents[i], pattern);
					keywords_O.add(keyword);
					
					iKeywordCnt++;
				}
			}
			
			// if there is no keyword in the one in the optimized grammar
			// then the attribute keyword must have been removed
			if (iKeywordCnt == 0) {
				String removeKeyword = "go.removeKeyword(\"" + grammarRule + "\", \"" + attrName + "\", \"" + attrName + "\", null);"; 
				optimizationRules.add(removeKeyword);
			}
			else if (iKeywordCnt == 1) {
				// assume the first one keyword is the counterpart of the old one attribute keyword
				if (!keywords_O.get(0).equals(attrName)) {
					String renameKeyword = "go.renameKeyword(\"" + grammarRule + "\", \"" + attrName + "\", \"" + attrName + "\", \"" + keywords_O.get(0) + "\", null);";
					optimizationRules.add(renameKeyword);
				}
			}
			else if (iKeywordCnt > 1) {
				if (RegexHelper.doesStringExist(lineContent_G, "'\\w+'\\s+\\w+\\+*=") && RegexHelper.doesStringExist(lineContent_O, "'\\w+'\\s+\\w+\\+*=")) {
					Pattern pattern = Pattern.compile("'(\\w+)'\\s+\\w+\\+*=.*");
					String newKeyword = RegexHelper.getTargetString(lineContent_O, pattern);
					
					if (!newKeyword.equals(attrName)) {
						String renameKeyword = "go.renameKeyword(\"" + grammarRule + "\", \"" + attrName + "\", \"" + attrName + "\", \"" + newKeyword + "\", null);";
						optimizationRules.add(renameKeyword);
					}
				}
				
				// TODO: to be completed
				// There is keyword(s) existing behind the attribute, which is definitely not the
				// case in the generated grammar.
				if (RegexHelper.doesStringExist(lineContent_O, attrName + "\\+*=.*'\\w+'")) {
					addMultipleKeywordToAttr(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
				}
			}
			
			if (RegexHelper.doesStringExist(lineContent_O, "'\\w+'\\s+'\\W+'.*" + attrName + "\\+*=") && 
					!RegexHelper.doesStringExist(lineContent_G, "'\\w+'\\s+'\\W+'.*" + attrName + "\\+*=")) {
				Pattern pattern1 = Pattern.compile("'(\\w+)'\\s+'\\W+'.*");
				String keyword = RegexHelper.getTargetString(lineContent_O, pattern1);
				Pattern pattern2 = Pattern.compile("'\\w+'\\s+'(\\W+)'.*");
				String symbol = RegexHelper.getTargetString(lineContent_O, pattern2);
				//go.addKeywordAfterKeyword("TimedViolationCondition", null, "timed", "violation");
				String command = "go.addKeywordAfterKeyword(\"" + grammarRule + "\", \"" + attrName + "\", \"" + keyword + "\", \"" + symbol + "\");";
				optimizationRules.add(command);
			}
			else if (RegexHelper.doesStringExist(lineContent_O, "'\\w+'\\s+'\\W+'\\s+'(\\{|\\(|\\[)'") && 
					!RegexHelper.doesStringExist(lineContent_G, "'\\w+'\\s+'\\W+'\\s+'(\\{|\\(|\\[)'")) {
				Pattern pattern1 = Pattern.compile("'(\\w+)'\\s+'\\W+'.*");
				String keyword = RegexHelper.getTargetString(lineContent_O, pattern1);
				Pattern pattern2 = Pattern.compile("'\\w+'\\s+'(\\W+)'\\s+'(\\{|\\(|\\[)'.*");
				String symbol = RegexHelper.getTargetString(lineContent_O, pattern2);
				String command = "go.addKeywordAfterKeyword(\"" + grammarRule + "\", \"" + attrName + "\", \"" + keyword + "\", \"" + symbol + "\");";
				optimizationRules.add(command);
			}
		}
		else {
			if (RegexHelper.doesStringExist(lineContent_O, attrName + "\\+*=.*'\\w+'")) {
				addMultipleKeywordToAttr(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
			}
			
			// Senario: keyword exist outside of ()? in optimzed grammar rule while not in generated one
			if (RegexHelper.doesStringExist(lineContent_O, "'\\w+'\\s*\\("+attrName+"\\+*=.*") &&
					!RegexHelper.doesStringExist(lineContent_G, "'\\w+'\\s*\\("+attrName+"\\+*=.*")) {
				Pattern pattern = Pattern.compile("'(\\w+)'\\s*\\("+attrName+"\\+*=.*");
				String keyword = RegexHelper.getTargetString(lineContent_O, pattern);
				//go.addKeywordToLine("ModuleImport", "identifier", "import", true);
				String command = "go.addKeywordToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"" + keyword + "\", true);";
				optimizationRules.add(command);
			}
			
			// Senario: keyword exist before an attribute in optimized grammar rule while not in generated one
			if (RegexHelper.doesStringExist(lineContent_O, "'\\w+'\\s*" + attrName + "\\s*\\+*=") ||
					!RegexHelper.doesStringExist(lineContent_G, "'\\w+'\\s*" + attrName + "\\s*\\+*=")) {
				Pattern pattern = Pattern.compile("'(\\w+)'\\s*" + attrName + "\\s*\\+*=.*");
				String keyword = RegexHelper.getTargetString(lineContent_O, pattern);
				
				if (keyword != null) {
					//go.addKeywordToLine("ModuleImport", "identifier", "import", true);
					String command = "go.addKeywordToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"" + keyword + "\", true);";
					optimizationRules.add(command);
				}
			}
		}
	}
	
	public void addMultipleKeywordToAttr(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		List<String> addedKeyword = new ArrayList<String>();
		String lineContent_O = lineInOptimized.getLineContent();
		String attrName = lineInGenerated.getAttrName();
		String[] subString = lineContent_O.split("\\s");
		boolean bAfterAttr = false;
		for (int i = 0; i < subString.length; i++) {
			if (RegexHelper.doesStringExist(subString[i], attrName + "\\+*=")) {
				bAfterAttr = true;
				continue;
			}
			else if (RegexHelper.doesStringExist(subString[i], "'\\w+'")) {
				if (bAfterAttr) {
					Pattern pattern = Pattern.compile("'(\\w+)'.*");
					String extractedKeyword = RegexHelper.getTargetString(subString[i], pattern);
					addedKeyword.add(extractedKeyword);
				}
			}
		}
		
		for (String newKeyword : addedKeyword) {
			// go.addKeywordToLine("Subgraph", "name", "subgraph", true);
			String command = "go.addKeywordToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"" + newKeyword + "\", false);";
			optimizationRules.add(command);
		}
	}
	
	// I think that comparing list will be a better idea, so I will rewrite the code
	public void compareAttributeLine(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized, boolean bChangeToOrRationship) {
		
		// compare optionality
		compareLineOptionality(optimizationRules, grammarRule, lineInGenerated, lineInOptimized, bChangeToOrRationship);
		
		// compare attribute keyword
		compareAttrKeyword(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
		
		// compare braces
		compareLineBraces(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
		
		// compare symbols
		compareSymbols(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
		
		// compare attribute type
		compareAttrType(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
		
		// compare multiplicities
		compareAttrMultiplicities(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
	}
	
	public void compareAttrMultiplicities(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		// when the symbols between attribute and its type are +=, then the upper bound should be larger than 1
		if (RegexHelper.doesStringExist(lineInGenerated.getLineContent(), lineInGenerated.getAttrName() + "\\+=.*")) {
			String stripLine = lineInOptimized.getLineContent().strip();
			String[] lines = stripLine.split("\\+=");
			String convertCommand = null;
			
			if (lines.length == 2) {
				if (RegexHelper.doesStringExist(stripLine, lineInGenerated.getAttrName() + "\\s*\\+=\\s*\\[*\\w+(\\|\\w*)*\\]*.*\\)*\\*")) {
					//go.convert1toStarToStar("DotAst", "graphs");
					convertCommand = "go.convert1toStarToStar(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\");";
					optimizationRules.add(convertCommand);
				}
				else {
					if (RegexHelper.doesStringExist(stripLine, lineInGenerated.getAttrName() + "\\s*\\+=\\s*\\[*\\w+(\\|\\w*)*\\]*\\)*\\+")) {
						//go.convert1toStarToStar("DotAst", "graphs");
						convertCommand = "go.convert1toStarToPlus(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\");";
						optimizationRules.add(convertCommand);
					}
					else {
						if (RegexHelper.doesStringExist(stripLine, lineInGenerated.getAttrName() + "\\s*\\+=\\s*\\[*\\w+(\\|\\w*)*\\]*\\)*")) {
							//go.convert1toStarToStar("DotAst", "graphs");
							convertCommand = "go.convert1toStarTo1(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\");";
							optimizationRules.add(convertCommand);
						}
					}
				}
			}
		}
	}
	
	public void compareLineBraces(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		String lineContent_G = lineInGenerated.getLineContent();
		String lineContent_O = lineInOptimized.getLineContent();
		
		String attrName = lineInGenerated.getAttrName();
		
		if (RegexHelper.doesStringExist(lineContent_G, "\\'\\{\\'") && RegexHelper.doesStringExist(lineContent_G, "\\'\\}\\'")) {
			
			if (!RegexHelper.doesStringExist(lineContent_O, "\\'\\{\\'") && !RegexHelper.doesStringExist(lineContent_O, "\\'\\}\\'")) {
				
				if (RegexHelper.doesStringExist(lineContent_O, "\\'\\[\\'") && RegexHelper.doesStringExist(lineContent_O, "\\'\\]\\'")) {
					String changeBracesToSquare = "go.changeBracesToSquare(\"" + grammarRule + "\", \"" + attrName + "\");";
					optimizationRules.add(changeBracesToSquare);
				}
				else if (RegexHelper.doesStringExist(lineContent_O, "\\'\\(\\'") && RegexHelper.doesStringExist(lineContent_O, "\\'\\)\\'")) {
					String changeBracesToParentheses = "go.changeBracesToParentheses(\"" + grammarRule + "\", \"" + attrName + "\");";
					optimizationRules.add(changeBracesToParentheses);
				}
				else {
					String removeBraces = "go.removeBraces(\"" + grammarRule + "\", \"" + attrName + "\", null);";
					optimizationRules.add(removeBraces);
				}
			}
		}
		else if (RegexHelper.doesStringExist(lineContent_G, "\\'\\(\\'") && RegexHelper.doesStringExist(lineContent_G, "\\'\\)\\'")) {
			if (!RegexHelper.doesStringExist(lineContent_O, "\\'\\(\\'") && !RegexHelper.doesStringExist(lineContent_O, "\\'\\)\\'")) {
				// go.removeParenthesesInSpecifiedAttr("XReference", "keys");
				String command = "go.removeParenthesesInSpecifiedAttr(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\");";
				optimizationRules.add(command);
			}
		}
	}
	
	public void compareSymbols(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		String lineContent_G = lineInGenerated.getLineContent();
		String lineContent_O = lineInOptimized.getLineContent();
		
		String attrName = lineInGenerated.getAttrName();
		
		// Check if the comma is removed
		if (RegexHelper.doesStringExist(lineContent_G, attrName + "\\+=.*\\,.*" + attrName + "\\+=")) {
			if (!RegexHelper.doesStringExist(lineContent_O, attrName + "\\+=.*\\,.*" + attrName + "\\+=")) {
				String removeComma = "go.removeComma(\"" + grammarRule + "\", \"" + attrName + "\", null);";
				optimizationRules.add(removeComma);
			}
		}
		
		// check if any new symbols are added
		checkIfNewSymbolAdd(optimizationRules, grammarRule, lineInGenerated, lineInOptimized);
	}
	
	public void checkIfNewSymbolAdd(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		String lineContent_G = lineInGenerated.getLineContent();
		String lineContent_O = lineInOptimized.getLineContent();
		
		String attrName = lineInGenerated.getAttrName();
		
		String lines[] = lineContent_O.split("\\s+");
		List<String> addedSymbols = new ArrayList<String>();
		
		for (int i = 0; i < lines.length; i++) {
			if (RegexHelper.doesStringExist(lines[i], "\'.*\'") && !RegexHelper.doesStringExist(lines[i], "\'\\w*\'")) {
		         Pattern p = Pattern.compile(".*'([?,!,@,$,%,^,&,*,(,),;,:,=])'.*");
		         
		         // get the symbol in single quotes, but in the form of without quotes
		         String symbol = RegexHelper.getTargetString(lines[i], p);
		         addedSymbols.add(symbol);
			}
		}
		
		for (int j = 0; j < addedSymbols.size(); j++) {
			String symbol = addedSymbols.get(j);
			
	         // Judge whether the upper bound of the attribute is only 1
	         boolean isUpperBoundOne = isUpperBoundOne(lineContent_G, attrName);
	         
	         // Judge if a symbol is added and where is it added
	         if (isUpperBoundOne) {
	        	 // is attribute optional in the generated grammar?
	        	 if (RegexHelper.doesStringExist(lineContent_G, "\\(.*" + attrName + "\\+*=.*\\)\\?")) {
	        		 // add a symbol before the attribute and out of ()?
	        		 
	        		 // add a symbol before the attribute and within ()?
	        		 if (!RegexHelper.doesStringExist(lineContent_G, "'\\" + symbol + "'.*" + attrName) &&
	        				 RegexHelper.doesStringExist(lineContent_O, "'\\" + symbol + "'.*" + attrName)) {
	        			 
	        			 if (!RegexHelper.doesStringExist(lineContent_O, "'\\w+'\\s*" + "'\\" + symbol + "'.*" + attrName)) {
		        			 String addSymbolToAttr = "go.addSymbolToAttr(\"" + grammarRule + "\", \"" +
			        				 attrName + "\", \"" + symbol + "\", true, null, true, true);";
			        		 optimizationRules.add(addSymbolToAttr);
	        			 }
	        		 }
	        		 // add a symbol after the attribute and out of ()?
	        		 
	        		 // add a symbol after the attribute and within ()?
	        		 if (RegexHelper.doesStringExist(lineContent_O, attrName + "\\+*=.*'\\" + symbol + "'") && 
	        				 !RegexHelper.doesStringExist(lineContent_G, attrName + "\\+*=.*'\\" + symbol + "'.*\\)\\?")) {
	        			 String addSymbolToAttr = "go.addSymbolToAttr(\"" + grammarRule + "\", \"" +
	        				 attrName + "\", \"" + symbol + "\", false, null, true, true);";
	        			 optimizationRules.add(addSymbolToAttr);
	        		 }
	        	 }
	        	 // it not optional, i.e., without ()?
	        	 else {
	        		 // add a symbol before the attribute
	        		 if (RegexHelper.doesStringExist(lineContent_O, "'\\" + symbol + "'.*" + attrName) && 
	        				 !RegexHelper.doesStringExist(lineContent_G, "'\\" + symbol + "'.*" + attrName)) {
	        			 String addSymbolToAttr = "go.addSymbolToAttr(\"" + grammarRule + "\", \"" + 
		        				 attrName + "\", \"" + symbol + "\", true, null, true, true);";
		        		 optimizationRules.add(addSymbolToAttr);
	        		 }
	        		 // add a symbol after the attribute
	        		 if (RegexHelper.doesStringExist(lineContent_O, attrName + ".*\\s'\\" + symbol + "'") && 
	        				 !RegexHelper.doesStringExist(lineContent_G, attrName + ".*\\s'\\" + symbol + "'")) {
	        			 String addSymbolToAttr = "go.addSymbolToAttr(\"" + grammarRule + "\", \"" + 
	        				 attrName + "\", \"" + symbol + "\", false, null, true, true);";
	        			 optimizationRules.add(addSymbolToAttr);
	        		 }
	        	 }
	         }
	         // when the upper bound is larger than 1, that means there are only two possible places for adding symbol
	         else {
	        	 String[] temp = lineContent_O.split("\\+=");
	        	 if (temp.length == 3) {
	        		 // as an example: sites+=SuperSite ( "," sites+=SuperSite)*
	        	 }
	        	 else {
	        		 // as an example: (sites+=SuperSite)*
		        	 //go.addSymbolToLine("ForEachOutPatternElement", "iterator", "(", true);
		        	 // add a symbol before the line
		        	 if (!RegexHelper.doesStringExist(lineContent_G, "'\\" + symbol + "'.*" + attrName) &&
	        				 RegexHelper.doesStringExist(lineContent_O, "'\\" + symbol + "'.*" + attrName)) {
		        		 String addSymbolToLine = "go.addSymbolToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"" + symbol + "\", true);";
		        		 optimizationRules.add(addSymbolToLine);
		        	 }
		        	 // add a symbol after the line
		        	 if (RegexHelper.doesStringExist(lineContent_O, attrName + ".*'\\" + symbol + "'") && 
	        				 !RegexHelper.doesStringExist(lineContent_G, attrName + ".*'\\" + symbol + "'")) {
		        		 String addSymbolToLine = "go.addSymbolToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"" + symbol + "\", false);";
		        		 optimizationRules.add(addSymbolToLine);
		        	 }
	        	 }
	         }
		}
		
		// specialized process for adding '->'
		if (RegexHelper.doesStringExist(lineContent_O, attrName + "\\+*=.*'\\-\\>'") && 
				!RegexHelper.doesStringExist(lineContent_G, attrName + "\\+*=.*'\\-\\>'")) {
			String command = "go.addKeywordToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"->\", false);";
			optimizationRules.add(command);
		}
		else if (RegexHelper.doesStringExist(lineContent_O, "'\\-\\>'.*" + attrName + "\\+*=") && 
				!RegexHelper.doesStringExist(lineContent_G, "'\\-\\>'.*" + attrName + "\\+*=")) {
			String command = "go.addKeywordToLine(\"" + grammarRule + "\", \"" + attrName + "\", \"->\", true);";
			optimizationRules.add(command);
		}
	}
	
	public boolean isUpperBoundOne(String lineContent, String attrName) {
		boolean bRet = false;
		String regex = "\\(.*"+attrName+"\\+*=.*\\)\\*";
		
		if (!RegexHelper.doesStringExist(lineContent, regex)) {
			bRet = true;
		}
		
		return bRet;
	}
	
	public void removePathInType(String[] typeList) {
		if (typeList.length <= 0)
			return;
		
		for (int i = 0; i < typeList.length; i++) {
			if (RegexHelper.doesStringExist(typeList[i], "\\w+\\:\\:\\w+")) {
				Pattern pattern = Pattern.compile("\\w+\\:\\:(\\w+)");
				typeList[i] = RegexHelper.getTargetString(typeList[i], pattern);
			}
		}
	}
	
	public void compareAttrType(List<String> optimizationRules, String grammarRule, LineEntry lineInGenerated, LineEntry lineInOptimized) {
		String lineContent_G = lineInGenerated.getLineContent();
		String lineContent_O = lineInOptimized.getLineContent();
		
		String attrName = lineInGenerated.getAttrName();
		
		// The situation that only has one type
		String regex_type = attrName + "\\s*\\+*=\\s*(\\w*)";
		String regex_cr = attrName + "\\+*=\\[";
		
		// cross-reference exists
		if (RegexHelper.doesStringExist(lineContent_G, regex_cr)) {
			//         ('importedObject' importedObject=[ecore::EObject|EString])?
			Pattern pattern = Pattern.compile("\\[((\\w*\\W*)\\w+(\\|(\\w+)*)*)\\].*");
			String subStrTypes_G = RegexHelper.getTargetString(lineContent_G, pattern);
			String subStrTypes_O = RegexHelper.getTargetString(lineContent_O, pattern);
			String[] typeList_G = subStrTypes_G.split("\\|");
			String[] typeList_O = subStrTypes_O.split("\\|");
		
			removePathInType(typeList_G);
			removePathInType(typeList_O);
			
			if (typeList_G.length == 2 && typeList_O.length == 2) {
				for (int i = 0; i < typeList_G.length; i++) {
					for (int j = 0; j < typeList_O.length; j++) {
						if (typeList_G[i].equals(typeList_O[j])) {
							int anotherIndex_G = 1 - i;
							int anotherIndex_O = 1 - j;
							if (!typeList_G[anotherIndex_G].equals(typeList_O[anotherIndex_O])) {
								// go.changeTypeOfAttr("XAnnotation", "source", "EString", "XQualifiedName");
								String command = "go.changeTypeOfAttr(\"" + grammarRule + "\", \"" + attrName + "\", \"" + 
									typeList_G[anotherIndex_G] + "\", \"" + typeList_O[anotherIndex_O] + "\");";
								optimizationRules.add(command);
							}
						}
					}
				}
			}
			else {
				for (int i = 0; i < typeList_G.length; i++) {
					boolean bExist = false;
					
					for (int j = 0; j < typeList_O.length; j++) {
						if (typeList_G[i].equals(typeList_O[j])) {
							bExist = true;
							break;
						}
					}
					
					if (!bExist) {
						//go.removeCertainTypeFromAttr("Specification", "controllableEClasses", "EString");
						String command = "go.removeCertainTypeFromAttr(\"" + grammarRule + "\", \"" + lineInGenerated.getAttrName() + "\", \"" + typeList_G[i] + "\");";
						optimizationRules.add(command);
					}
				}
			}

		}
		// cross-reference doesn't exist
		else {
			Pattern pattern = Pattern.compile(regex_type);
			String attrType_G = RegexHelper.getTargetString(lineContent_G, pattern);
			String attrType_O = RegexHelper.getTargetString(lineContent_O, pattern);
			
			if (attrType_G != null && !attrType_G.equals(attrType_O)) {
				String changeTypeOfAttr = "go.changeTypeOfAttr(\"" + grammarRule + "\", \"" + attrName + "\", \"" +
						attrType_G + "\", \"" + attrType_O + "\");";
				optimizationRules.add(changeTypeOfAttr);
			}
		}
	}
	
	/**
	 * This method is for combining all the lines except first line to a same one line
	 * */
	public void resetGrammarRule(GrammarRule input) {
		if (input == null || input.getName() == null)
			return;
		
		if (input.getLines() == null || input.getLines().size() == 1)
			return;
		
		if (!RegexHelper.doesStringExist(input.getLines().get(0).getLineContent(), input.getName()))
			return;
		
		List<LineEntry> preList = new ArrayList<LineEntry>();
		preList.add(input.getLines().get(0));
		String combinedLineStr = "";
		
		for (int m = 1; m < input.getLines().size(); m++) {
			combinedLineStr += input.getLines().get(m).getLineContent().strip();
			
			if (m != input.getLines().size() - 1) {
				combinedLineStr += " ";
			}
		}
		LineEntryImpl lineEntry = new LineEntryImpl();
		lineEntry.setLineContent(combinedLineStr);
		lineEntry.setAttrName(null);
		preList.add(lineEntry);
		
		if (preList.size() > 0) {
			input.getLines().clear();
			input.getLines().addAll(preList);
		}
	}
	
	// todo: 
	public GrammarRule normalizeGrammarRule(GrammarRule input) {
		GrammarRule output = null;
		boolean doesItNeedNormalize = false;
		
		if (input.getName().equals("WildcardParameterExpression"))
			System.out.println("WildcardParameterExpression");
		
		if (GrammarRuleHelper.isContainerNormal(input)) {
			if (GrammarRuleHelper.doesItNeedNormalize(input)) {
				doesItNeedNormalize = true;
			}
		}
		else {
			doesItNeedNormalize = true;
		}
		
		if (doesItNeedNormalize) {
			resetGrammarRule(input);
			
			System.out.printf("Start normalizing grammar rule %s\n", input.getName());
			
			List<LineEntry> tempList = new ArrayList<LineEntry>();
			for (int i = 0; i < input.getLines().size(); i++) {	
				String stripLine = input.getLines().get(i).getLineContent().strip();
				String[] lines = stripLine.split("\\s");

				// with {Action} and something
				if (RegexHelper.doesStringExist(input.getLines().get(i).getLineContent(), "\\{\\w+\\}")) {
					if (lines.length == 1 && RegexHelper.doesStringExist(lines[0], "\\{\\w+\\}")) {
						if (RegexHelper.doesStringExist(lines[0], "\\{\\w+\\}\\.\\w+")) {
							// there should be changes happened, while this can not be handled by current GrammarOptimizer
							// so we default to not processing it for the time being
							tempList.add(input.getLines().get(i));
						}
						else {
							// with {Action} only, no need to do anything in this case
							tempList.add(input.getLines().get(i));
						}
					}
					// there is something else after an {Action}, divide it
					else {
						divideLine(i, lines, tempList);
					}
				}
				else {
					// without {Action}, but with multiple/single attribute
					if (RegexHelper.doesStringExist(input.getLines().get(i).getLineContent(), "\\w+\\+*=")) {
						divideLine(i, lines, tempList);
					}
					else {
						// without {Action} and attribute, no need to do anything in this case
						tempList.add(input.getLines().get(i));
					}
				}
			}
			
			if (tempList.size() > 0) {
				input.getLines().clear();
				input.getLines().addAll(tempList);
				output = input;
			}
			
			System.out.printf("Complete normalizing grammar rule %s\n", input.getName());
		}
		else {
			output = input;
		}
		
		return output;
	}
	
	/**
	 * In an hand-craft grammar, it's possible to see that different attributes are
	 * put in the same line or something put after an {Action}. This creates a barrier
	 * for grammar comparison, as the comparison is based on line-by-line mapping. So
	 * in this method, we divide such lines.
	 * */
	public void divideLine(int index, String[] subStrings, List<LineEntry> dividedLines) {
		String newLine = "";
		boolean bAlreadyAttr = false;
		String attrName = null;
		
		for (int i = 0; i < subStrings.length; i++) {
			newLine += subStrings[i] + " ";
			
			// encounter an {Action}, start a new line
			if (RegexHelper.doesStringExist(subStrings[i], "\\{\\w+\\}")) {
				LineEntryImpl lineEntry = new LineEntryImpl();
				lineEntry.setLineContent(newLine);
				lineEntry.setAttrName(null);
				dividedLines.add(lineEntry);
				newLine = "";
				attrName = null;
				bAlreadyAttr = false;
				continue;
			}
			else if (RegexHelper.doesStringExist(subStrings[i], "\\w+\\+*=")) {
				bAlreadyAttr = true;
				Pattern pattern = Pattern.compile("(\\w+)\\+*=");
				attrName = RegexHelper.getTargetString(subStrings[i], pattern);
				
				// when encounter an attribute, check the next line whether it's also an attribute
				if ((i + 1) < subStrings.length) {
					if (RegexHelper.doesStringExist(subStrings[i + 1], "\\w+\\+*=")) {
						Pattern pattern1 = Pattern.compile("(\\w+)\\+*=");
						String nextAttrName = RegexHelper.getTargetString(subStrings[i + 1], pattern1);
						
						// if the attribute in next line is different, then start a new line
						if (!attrName.equals(nextAttrName)) {
							LineEntryImpl lineEntry = new LineEntryImpl();
							lineEntry.setLineContent(newLine);
							lineEntry.setAttrName(attrName);
							dividedLines.add(lineEntry);
							bAlreadyAttr = false;
							newLine = "";
							attrName = null;
							continue;
						}

					}
					else if (RegexHelper.doesStringExist(subStrings[i + 1], "'(\\(|\\[|\\{)'")) {
						LineEntryImpl lineEntry = new LineEntryImpl();
						lineEntry.setLineContent(newLine);
						lineEntry.setAttrName(attrName);
						dividedLines.add(lineEntry);
						bAlreadyAttr = false;
						newLine = "";
						attrName = null;
						continue;
					}
					else {
						continue;
					}
				}
			}
			else {
				if (bAlreadyAttr) {
					if ((i + 1) < subStrings.length) {
						if (RegexHelper.doesStringExist(subStrings[i + 1], "\\w+\\+*=")) {
							Pattern pattern1 = Pattern.compile("(\\w+)\\+*=");
							String nextAttrName = RegexHelper.getTargetString(subStrings[i + 1], pattern1);
							
							if (!attrName.equals(nextAttrName)) {
								LineEntryImpl lineEntry = new LineEntryImpl();
								lineEntry.setLineContent(newLine);
								lineEntry.setAttrName(attrName);
								dividedLines.add(lineEntry);
								bAlreadyAttr = false;
								newLine = "";
								attrName = null;
								continue;
							}
						}
						else if (RegexHelper.doesStringExist(subStrings[i + 1], "'(\\(|\\[|\\{)'")) {
							LineEntryImpl lineEntry = new LineEntryImpl();
							lineEntry.setLineContent(newLine);
							lineEntry.setAttrName(attrName);
							dividedLines.add(lineEntry);
							bAlreadyAttr = false;
							newLine = "";
							attrName = null;
							continue;
						}
						else {
							continue;
						}
					}
				}
				else 
					continue;
			}
		}
		
		// In the above code, when face the last line, we didn't do anything
		// so here, this is the code for end the last line
		if (!newLine.equals("")) {
			LineEntryImpl lineEntry = new LineEntryImpl();
			lineEntry.setLineContent(newLine);
			if (RegexHelper.doesStringExist(newLine, "\\w+\\+*=")) {
				Pattern pattern = Pattern.compile("(\\w+)\\+*=");
				attrName = RegexHelper.getTargetString(newLine, pattern);
				lineEntry.setAttrName(attrName);
				attrName = null;
			}
			dividedLines.add(lineEntry);
		}
	}
	
	private static boolean compareNodes(INode node1, INode node2) {
	    // Compare node types
	    if (!Objects.equals(node1.getGrammarElement(), node2.getGrammarElement())) {
	        return false;
	    }

	    // Compare node texts
	    if (!Objects.equals(node1.getText(), node2.getText())) {
	        return false;
	    }

	    // Compare node children recursively
	    Iterator<INode> i1 = node1.getAsTreeIterable().iterator();
	    Iterator<INode> i2 = node2.getAsTreeIterable().iterator();
	    
	    while (i1.hasNext() && i2.hasNext()) {
	        INode c1 = i1.next();
	        INode c2 = i2.next();
	        if (!compareNodes(c1, c2)) {
	            return false;
	        }
	    }
	    return !i1.hasNext() && !i2.hasNext();
	}
}
