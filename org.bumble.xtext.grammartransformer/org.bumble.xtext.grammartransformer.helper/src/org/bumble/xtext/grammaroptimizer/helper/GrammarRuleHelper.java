package org.bumble.xtext.grammaroptimizer.helper;

import java.util.List;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import org.bumble.xtext.grammaroptimizer.grammarrule.Grammar;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;

public class GrammarRuleHelper {
	public static Grammar processGrammar(Grammar grammar, String strRaw) {
		// Split the contents of Xtext file (i.e. string) into lines
		String lines[] = strRaw.split("\r\n|\r|\n");

		// split the text into different GrammarRule instances
		GrammarRuleImpl grammarRule = new GrammarRuleImpl();

		for (int i = 0; i < lines.length; i++) {			
			//if (!lines[i].isEmpty() && !lines[i].equals("\t") && !(lines[i].trim().length() == 0)) {
			if (!lines[i].isEmpty() && !lines[i].equals("\t") && !lines[i].equals("\\s+")) {
				LineEntryImpl lineEntry = new LineEntryImpl();

				lineEntry.setLineContent(lines[i]);

				String regex = "(\\w*)\\s*\\+*\\?*\\=.*\\w*";
				Pattern pattern = Pattern.compile(regex);
				String attrName = RegexHelper.getTargetString(lines[i], pattern);
				lineEntry.setAttrName(attrName);

				// collect the lines from a same rule
				// grammarRule.lines.add(lineEntry);
				grammarRule.getLines().add(lineEntry);
			} else {
				if (grammarRule.getLines() == null || grammarRule.getLines().size() == 0)
					continue;

				// when encounter empty line, means a grammar rule finishes
				grammar.getRules().add(grammarRule);

				// then clear grammar rule object
				grammarRule = new GrammarRuleImpl();
			}
		}

		grammar.getRules().add(grammarRule);

		return processFirstLine(grammar);
	}
	
	public static Grammar processManualGrammar(Grammar grammar, String strRaw) {
		// Split the contents of Xtext file (i.e. string) into lines
		String lines[] = strRaw.split("\r\n|\r|\n");

		// split the text into different GrammarRule instances
		GrammarRuleImpl grammarRule = new GrammarRuleImpl();
		boolean bStartFromBeginning = true;
		
		for (int i = 0; i < lines.length; i++) {
			if (bStartFromBeginning) {
				if (lines[i].trim().length() == 0)
					continue;
			}
			
			if (isFirstLineOfGrammarRule(lines[i]) && !RegexHelper.doesStringExist(lines[i], "import.*http")) {
				if (grammarRule.getLines() != null) {
					if (grammarRule.getLines().size() != 0) {
						// when encounter empty line, means a grammar rule finishes
						grammar.getRules().add(grammarRule);

						// then clear grammar rule object
						grammarRule = new GrammarRuleImpl();
					}
				}

				
				storeTempLine(lines[i], grammarRule);
				bStartFromBeginning = true;
				
				continue;
			}
			else if (RegexHelper.doesStringExist(lines[i], "import.*http")) {
				if ((i + 1) < lines.length) {
					if (!RegexHelper.doesStringExist(lines[i + 1], "import")) {
						storeTempLine(lines[i], grammarRule);
						
						// when encounter empty line, means a grammar rule finishes
						grammar.getRules().add(grammarRule);

						// then clear grammar rule object
						grammarRule = new GrammarRuleImpl();
						bStartFromBeginning = true;
						
						continue;
					}
				}
				
				if ((i - 1) >= 0) {
					if (RegexHelper.doesStringExist(lines[i - 1], "grammar")) {
						// when encounter empty line, means a grammar rule finishes
						grammar.getRules().add(grammarRule);

						// then clear grammar rule object
						grammarRule = new GrammarRuleImpl();
						
						storeTempLine(lines[i], grammarRule);
						bStartFromBeginning = true;
						
						continue;
					}
				}
			}
			
			storeTempLine(lines[i], grammarRule);
			bStartFromBeginning = false;
		}
		
		grammar.getRules().add(grammarRule);
		
		return processFirstLine(grammar);
	}
	
	public static void storeTempLine(String lineContent, GrammarRule grammarRule) {
		LineEntryImpl lineEntry = new LineEntryImpl();

		lineEntry.setLineContent(lineContent);

		String regex = "(\\w*)\\s*\\+*\\?*\\=.*\\w*";
		Pattern pattern = Pattern.compile(regex);
		String attrName = RegexHelper.getTargetString(lineContent, pattern);
		lineEntry.setAttrName(attrName);

		// collect the lines from a same rule
		// grammarRule.lines.add(lineEntry);
		grammarRule.getLines().add(lineEntry);
	}
	
	public static boolean isFirstLineOfGrammarRule(String str) {
		boolean bRet = false;
		
		if (RegexHelper.doesStringExist(str, "\\w+\\s*\\:") && !RegexHelper.doesStringExist(str, "\\w+\\s*\\+*=")) {
			bRet = true;
		}
		
		return bRet;
	}
	
	private static Grammar processFirstLine(Grammar grammar) {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getLines() == null || grammar.getRules().get(i).getLines().isEmpty()) {
				continue;
			}
			String firstLine = grammar.getRules().get(i).getLines().get(0).getLineContent();

			if (RegexHelper.doesStringExist(firstLine, "package") || RegexHelper.doesStringExist(firstLine, "import")
					|| RegexHelper.doesStringExist(firstLine, "//.*") 
					|| RegexHelper.doesStringExist(firstLine, "grammar")) {
				grammar.getRules().get(i).setName(null);

				continue;
			}
			
			if (RegexHelper.doesStringExist(firstLine, "returns")) {

				
				String[] arr = firstLine.split("\\s+");

				if (RegexHelper.doesStringExist(firstLine, "enum")) {
					if (arr.length >= 4) {
						// in an enum rule, the second string is the rule name
						grammar.getRules().get(i).setName(arr[1]);
					} else {
						// just in case if a rule doesn't reference anything
						grammar.getRules().get(i).setName(arr[1]);
					}				
				} else {
					if (arr.length >= 3) {
						// in a common rule, the first string is the rule name
						grammar.getRules().get(i).setName(arr[0]);
					} else {
						// just in case if a rule doesn't reference anything
						grammar.getRules().get(i).setName(arr[0]);
					}
				}
			} 
			else if (RegexHelper.doesStringExist(firstLine, "@Override")) {
				// rule name is in second line
				firstLine = grammar.getRules().get(i).getLines().get(1).getLineContent();
				String[] arr = firstLine.split("\\s+");
				if(RegexHelper.doesStringExist(firstLine, "terminal")) {
					String ruleName = arr[1];
					if(ruleName.endsWith(":")) {
						ruleName = ruleName.substring(0, ruleName.indexOf(":")); 
					} 
					grammar.getRules().get(i).setName(ruleName);
				} else {
					if (RegexHelper.doesStringExist(arr[0], "\\w+\\:")) {
						Pattern pattern = Pattern.compile("(\\w+)\\:.*");
						arr[0] = RegexHelper.getTargetString(arr[0], pattern);
					}
					grammar.getRules().get(i).setName(arr[0]);
				}
			}
			else {			
				String[] arr = firstLine.split("\\s+");
				String ruleName = null;
				if (RegexHelper.doesStringExist(firstLine, "enum") || 
						RegexHelper.doesStringExist(firstLine, "terminal")) {
					if (RegexHelper.doesStringExist(arr[1], "\\w+"))
						ruleName = arr[1];
				}
				else {
					if (RegexHelper.doesStringExist(arr[0], "\\w+\\:*"))
						ruleName = arr[0];
				}
				
				if (ruleName != null) {
					if(ruleName.endsWith(":")) {
						ruleName = ruleName.substring(0, ruleName.indexOf(":")); 
					} 
					grammar.getRules().get(i).setName(ruleName);
				}
			}
		}

		return grammar;
	}
	
	public static boolean doesItNeedNormalize(GrammarRule rule) {
		boolean bRet = false;
		
		for (LineEntry line: rule.getLines()) {
			if (RegexHelper.doesStringExist(line.getLineContent(), "\\w+\\+*=")) {
				List<String> attrNames = new ArrayList<String>();
				Pattern pattern = Pattern.compile("(\\w+)\\+*=");
				Matcher matcher = pattern.matcher(line.getLineContent());
				
				while (matcher.find()) {
					attrNames.add(matcher.group());
				}
				
				for (int i = 0; i < attrNames.size(); i++) {
					for (int j = 0; j < attrNames.size(); j++) {
						if (i != j && attrNames.get(i).equals(attrNames.get(j))) {
							attrNames.remove(attrNames.get(j));
						}
					}
				}
				
				if (attrNames.size() > 1) {
					bRet = true;
					break;
				}
			}
			
			if (RegexHelper.doesStringExist(line.getLineContent(), "\\{\\w+\\}\\s\\w+") || 
					RegexHelper.doesStringExist(line.getLineContent(), "\\{\\w+\\}\\s\\W+")) {
				bRet = true;
				break;
			}
			
			if (RegexHelper.doesStringExist(line.getLineContent(), "'\\W+'") && !RegexHelper.doesStringExist(line.getLineContent(), "\\w+\\s*\\+*=")) {
				String[] subLines = line.getLineContent().strip().split("\\s");
				
				if (subLines.length > 1)
					bRet = true;
				else if (subLines.length < 1)
					bRet = false;
				else {
					if (isBracket(subLines[0]))
						bRet = false;
					else
						bRet = true;
				}
			}
		}
		
		return bRet;
	}
	
	public static boolean isBracket(String line) {
		boolean bRet = false;
		
		line = line.strip();

		if (line.equals("'{'") || line.equals("'}'") || line.equals("'}';") || 
				line.equals("('{'") || line.equals("'}')?") || line.equals("'}')?;") || 
				line.equals("'('") || line.equals("')'") || line.equals("')';") || 
				line.equals("'['") || line.equals("']'") || line.equals("']';")) {
			bRet = true;
		}		
		
		return bRet;
	}
	
	public static boolean isContainerComplete(GrammarRule rule) {
		boolean bRet = true;
		
		// find '{' and '}'
		boolean bOpeningExist = false;
		boolean bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("'{'")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("'}'") || lineContent.strip().equals("'}';")) {
				bClosingExist = true;
			}
		}
		
		if (bOpeningExist && bClosingExist) {
			bRet = true;
		}
		else {
			return false;
		}
		
		// find ('{' and '}')?
		bOpeningExist = false;
		bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("('{'")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("'}')?") || lineContent.strip().equals("'}')?;")) {
				bClosingExist = true;
			}
		}
		
		if (bOpeningExist && bClosingExist) {
			bRet = true;
		}
		else {
			return false;
		}
		
		// find '(' and ')'
		bOpeningExist = false;
		bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("'('")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("')'") || lineContent.strip().equals("')';")) {
				bClosingExist = true;
			}
		}
		
		if (bOpeningExist && bClosingExist) {
			bRet = true;
		}
		else {
			return false;
		}
		
		// find '[' and ']'
		bOpeningExist = false;
		bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("'['")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("']'") || lineContent.strip().equals("']';")) {
				bClosingExist = true;
			}
		}
		
		if (bOpeningExist && bClosingExist) {
			bRet = true;
		}
		else {
			return false;
		}
		
		return bRet;
	}
	
	public static boolean isContainerNormal(GrammarRule rule) {
		boolean bRet = true;
		
		// find '{' and '}'
		boolean bOpeningExist = false;
		boolean bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("'{'")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("'}'") || lineContent.strip().equals("'}';")) {
				bClosingExist = true;
			}
		}
		
		if ((bOpeningExist && bClosingExist) || (!bOpeningExist && !bClosingExist)) {
			bRet = true;
		}
		else {
			return false;
		}
		
		// find ('{' and '}')?
		bOpeningExist = false;
		bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("('{'")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("'}')?") || lineContent.strip().equals("'}')?;")) {
				bClosingExist = true;
			}
		}
		
		if ((bOpeningExist && bClosingExist) || (!bOpeningExist && !bClosingExist)) {
			bRet = true;
		}
		else {
			return false;
		}
		
		// find '(' and ')'
		bOpeningExist = false;
		bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("'('")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("')'") || lineContent.strip().equals("')';")) {
				bClosingExist = true;
			}
		}
		
		if ((bOpeningExist && bClosingExist) || (!bOpeningExist && !bClosingExist)) {
			bRet = true;
		}
		else {
			return false;
		}
		
		// find '[' and ']'
		bOpeningExist = false;
		bClosingExist = false;
		
		for (int i = 0; i < rule.getLines().size(); i++) {
			String lineContent = rule.getLines().get(i).getLineContent();
			if (lineContent.strip().equals("'['")) {
				bOpeningExist = true;
			}
			
			if (lineContent.strip().equals("']'") || lineContent.strip().equals("']';")) {
				bClosingExist = true;
			}
		}
		
		if ((bOpeningExist && bClosingExist) || (!bOpeningExist && !bClosingExist)) {
			bRet = true;
		}
		else {
			return false;
		}
		
		return bRet;
	}
}
