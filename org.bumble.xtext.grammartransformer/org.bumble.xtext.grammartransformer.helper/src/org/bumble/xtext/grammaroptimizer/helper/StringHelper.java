package org.bumble.xtext.grammaroptimizer.helper;

import java.util.regex.Pattern;

public class StringHelper {
	public static String constructXRegex(String X) {
		String output = null;
		String regex = "\\+=";
		
		// add \\before+, because it will be used in regex
		if (RegexHelper.doesStringExist(X, regex)) {
			output = X.replaceAll(regex, "\\\\+=");
			return output;
		}
		
		regex = "\\=";
		
		if (RegexHelper.doesStringExist(X, regex)) {
			output = X.replaceAll(regex, "\\\\=");
			return output;
		}
				
		return output;
	}
	// construct x (',' x)*
	public static String constructX0toStar(String X) {
		String strOutput = null;
		String strRegex = "\\+=";
		
		// add \\before+, because it will be used in regex
		if (RegexHelper.doesStringExist(X, strRegex))
			X = X.replaceAll(strRegex, "\\\\+=");
		
		if (RegexHelper.doesStringExist(X, "\\["))
			X = X.replaceAll("\\[", "\\\\[");
		
		if (RegexHelper.doesStringExist(X, "\\]"))
			X = X.replaceAll("\\]", "\\\\]");
		
		if (RegexHelper.doesStringExist(X, "\\|"))
			X = X.replaceAll("\\|", "\\\\|");
		
		if (RegexHelper.doesStringExist(X, "\\="))
			X = X.replaceAll("\\=", "\\\\=");
		
		if (X != null && !X.isEmpty()) {
			strOutput = X + ".*" + X + "\\)\\*";
		}
		
		return strOutput;
	}
	
	// construct x (',' x)+
	public static String constructX0toPlus(String X) {
		String strOutput = null;
		String strRegex = "\\+=";
		
		// add \\before+, because it will be used in regex
		if (RegexHelper.doesStringExist(X, strRegex))
			X = X.replaceAll(strRegex, "\\\\+=");
		
		if (X != null && !X.isEmpty()) {
			strOutput = X + ".*" + X + "\\)\\+";
		}
		
		return strOutput;
	}
	
	/**
	 * get a X by specifying an attribute name
	 * this X ranges from 0...*
	 * */
	public static String getX(String lineContent, String attrName) {
		String strOutput = null;
		String lines[] = lineContent.split(" ");
		String regex = "(" + attrName + "\\+=\\[*\\w*[\\|\\w*]*\\]*)";
		String regex1 = "(" + attrName + "\\+=\\[*.*\\])";
		
		for (int i = 0; i < lines.length; i++) {
			if (RegexHelper.doesStringExist(lines[i], "\\=\\[")) {
				if (RegexHelper.doesStringExist(lines[i], regex1)) {
					Pattern pattern = Pattern.compile(regex1);
					strOutput = RegexHelper.getTargetString(lines[i], pattern);
					break;
				}
			}
			
			if (RegexHelper.doesStringExist(lines[i], regex)) {
				Pattern pattern = Pattern.compile(regex);
				strOutput = RegexHelper.getTargetString(lines[i], pattern);
				break;
			}
		}
		
		return strOutput;
	}
	
	/**
	 * get a X by specifying an attribute name
	 * This x ranges from 0...1
	 * */
	public static String getX1(String lineContent, String attrName) {
		String strOutput = null;
		
		String lines[] = lineContent.split(" ");
		String regex = "(" + attrName + "\\=\\w*)";
		
		for (int i = 0; i < lines.length; i++) {
			if (RegexHelper.doesStringExist(lines[i], regex)) {
				Pattern pattern = Pattern.compile(regex);
				strOutput = RegexHelper.getTargetString(lines[i], pattern);
				break;
			}
		}
		
		return strOutput;
	}
	
	/**
	 * get a X without specifying an attribute name
	 * */
	public static String getX2(String lineContent) {
		String strOutput = null;
		String lines[] = lineContent.split(" ");
		String regex = "(\\w*\\+=\\w*)";
		
		for (int i = 0; i < lines.length; i++) {
			if (RegexHelper.doesStringExist(lines[i], regex)) {
//				strOutput = strings[i];
				Pattern pattern = Pattern.compile(regex);
				strOutput = RegexHelper.getTargetString(lines[i], pattern);
				break;
			}
		}
		
		return strOutput;
	}
	
	public static int getWhitespaceNumAtHead(String strInput) {
		int number = 0;
		
		if (!strInput.isBlank() && !strInput.isEmpty()) {
			char[] cInput = strInput.toCharArray();
			
			if (cInput.length != 0) {
				for (int i = 0; i < cInput.length; i++) {
					if (cInput[i] == ' ')
						number++;
					// one tab symbol = four whitespace
					else if (cInput[i] == '\t')
						number += 4;
					else
						break;
				}
			}
		}
		
		return number;
	}
	
	public static String setWhitespaceToString(String input, int num) {
		String output = "";
		
		if (num <= 0)
			return input;
		
		for (int i = 0; i < num; i++) {
			output += " ";
		}
		
		output += input;
		
		return output;
	}
}
