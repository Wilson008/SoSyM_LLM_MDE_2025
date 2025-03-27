package org.bumble.xtext.grammaroptimizer.test;


import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingMyXeniaTest {
	@Test
	public void testAdaptingMyXenia() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("MyXenia.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		go.processGrammar(input);
		
		// remove keyword 'Model'
		go.removeKeyword("Model", null, null, null);
		
		// remove all the brackets in rule Model
		go.removeBraces("Model", null, null);
		
		// apply a change from X 0...* to X attribute headers in rule Model
		go.convert1toStarTo1("Model", "headers");
		
		// apply a change from X 0...* to X* attribute entities and mapped_entities in rule Model
		go.convert1toStarToStar("Model", "entities");
		go.convert1toStarToStar("Model", "mapped_entities");

		// remove the optional from all the attributes in rule Model
		go.removeOptionality("Model", null);
		
		// remove called SuperSite_Impl from the rule SuperSite
		go.removeRuleCall("SuperSite",  "SuperSite_Impl");
		
		// remove keyword 'Header' and 'sites'
		go.removeKeyword("Header", null, "Header", null);
		go.removeKeyword("Header", null, "sites", null);
		
		// rename keyword 'appName' to 'app'
		go.renameKeyword("Header", null, "appName", "app", null);
		
		// remove the outermost brackets in rule Header
		go.removeContainerBraces("Header");
		
		// remove the optional from all the attributes in rule Header
		go.removeOptionality("Header", null);
		
		// change the brackets of attribute sites to square brackets
		go.changeBracesToSquare("Header", "sites");
		
		// add keywords 'has' and 'pages' to the end of attribute appName
		go.addKeywordToAttr("Header", "appName", "has", false);
		go.addKeywordToAttr("Header", "appName", "pages", false);
		
		// change the type of attribute appName to ID
		go.changeTypeOfAttr("Header", "appName", "EString", "ID");
		
		// remove keyword 'Entity' from the rule Entity
		go.removeKeyword("Entity", null, "Entity", null);
				
		// remove the outermost brackets from rule Entity
		go.removeContainerBraces("Entity");
		
		// change optional attributes of rule Entity to be in OR relationships
		go.changeOptionalAttrToOrRelation("Entity", true, null, null);
		
		// rename keyword from 'tech' to 'with'
		go.renameKeyword("Entity", null, "tech", "with", null);
		
		// rename keyword from 'path' to 'xml'
		go.renameKeyword("Entity", null, "path", "xml", null);
		
		// insert keyword ':' after the keyword 'with' in attribute tech
		go.addKeywordAfterKeyword("Entity", "tech", "with", ":");
		
		// insert keyword ':' after the keyword 'xml' in attribute path
		go.addKeywordAfterKeyword("Entity", "path", "xml", ":");
		
		// insert keyword ':' after the keyword 'mode' in attibute mode
		go.addKeywordAfterKeyword("Entity", "mode", "mode", ":");
		
		// change the type of attributes tech/path from EString to STRING
		go.changeTypeOfAttr("Entity", "tech", "EString", "STRING");
		go.changeTypeOfAttr("Entity", "path", "EString", "STRING");
		
		// remove keyword 'MappedEntity' from rule MappedEntity
		go.removeKeyword("MappedEntity", null, "MappedEntity", null);
		
		// remove the outermost brackets from rule MappedEntity
		go.removeContainerBraces("MappedEntity");
		
		// change optional attributes to be in OR relationships
		go.changeOptionalAttrToOrRelation("MappedEntity", true, null, null);
		
		// rename keyword from 'infoProps' to 'info'
		go.renameKeyword("MappedEntity", null, "infoProps", "info", null);
		
		// rename keyword from 'linkedProps' to 'map'
		go.renameKeyword("MappedEntity", null, "linkedProps", "map", null);
		
		// insert keyword ':' after the keyword 'info'
		go.addKeywordAfterKeyword("MappedEntity", "infoProps", "info", ":");
		
		// insert keyword ':' after the keyword 'map'
		go.addKeywordAfterKeyword("MappedEntity", "linkedProps", "map", ":");
		
		// change the brackets of all the attributes to square brackets in rule MappedEntity
		go.changeBracesToSquare("MappedEntity", "infoProps");
		go.changeBracesToSquare("MappedEntity", "linkedProps");
		
		// remove rule EString
		go.removeRule("EString");
		
		// remove rule SuperSite_impl
		go.removeRule("SuperSite_Impl");
		
		// rename keyword from 'SiteWithModel' to '@'
		go.renameKeyword("SiteWithModal", null, "SiteWithModal", "@", null);
		
		// remove outermost brackets of rule SiteWithModel
		go.removeContainerBraces("SiteWithModal");
		
		// rename keyword 'sites' to 'with'
		go.renameKeyword("SiteWithModal", null, "sites", "with", null);
		
		// insert keyword 'modal' after keyword 'with'
		go.addKeywordAfterKeyword("SiteWithModal", "sites", "with", "modal");
		
		// change brackets to parentheses
		go.changeBracesToParentheses("SiteWithModal", null);
		
		// remove optional of attribute sites
		go.removeOptionality("SiteWithModal", null);
		
		// change the type of name from EString to ID
		go.changeTypeOfAttr("SiteWithModal", "name", "EString", "ID");
		
		// rename keyword from 'Site' to '@'
		go.renameKeyword("Site", null, "Site", "@", null);
		
		// change the type of name from EString to ID
		go.changeTypeOfAttr("Site", "name", "EString", "ID");
		
		// rename keyword 'DEV' to 'development'
		go.renameKeyword("Mode", null, "DEV", "development", null);
		
		// rename keyword 'PROD' to 'production'
		go.renameKeyword("Mode", null, "PROD", "production", null);
		
		// remove keywords 'InfoProperty' and 'page' in rule InfoProperty
		go.removeKeyword("InfoProperty", null, "InfoProperty", null);
		go.removeKeyword("InfoProperty", null, "page", null);

		// remove all the brackets in rule InfoProperty
		go.removeBraces("InfoProperty", null, null);
		
		// remove the optional of all the attributes in rule InfoProperty
		go.removeOptionality("InfoProperty", null);
		
		// rename keyword 'entities' to '->' in attribute entities
		go.renameKeyword("InfoProperty", null, "entities", "->", null);
		
		// remove |EString from attribute page in rule InfoProperty
		go.removeCertainTypeFromAttr("InfoProperty", null, "EString");
		
		
		// remove keywords 'LinkedProperty' and 'name' in rule LinkedProperty
		go.removeKeyword("LinkedProperty", null, "LinkedProperty", null);
		go.removeKeyword("LinkedProperty", null, "name", null);
		go.removeOptionality("LinkedProperty", null);
		
		// remove all the brackets in rule LinkedProperty
		go.removeBraces("LinkedProperty", null, null);
		
		// add a pair of '(' and ')' to the attribute page
		go.addParenthesesToAttr("LinkedProperty", "page");
		
		// add a keyword '->' to the front of attribute page
		go.renameKeyword("LinkedProperty", null, "page", "->", null);
		
		// remove |EString from attribute name
		go.removeCertainTypeFromAttr("LinkedProperty", null, "EString");
		
		// remove keywords 'InfoEntity' and 'entries' in rule InfoEntity
		go.removeKeyword("InfoEntity", null, "InfoEntity", null);
		go.removeKeyword("InfoEntity", null, "entries", null);
		
		// remove all the brackets in rule InfoEntity
		go.removeBraces("InfoEntity", null, null);
		
		// apply a change from X ("," X)* to X on attribute entries
		go.convert1toStarTo1("InfoEntity", "entries");
		
		// remove the optional of all the attributes in rule InfoEntity
		go.removeOptionality("InfoEntity", null);
		
		// rename keyword from 'infoValue' to ':'
		go.renameKeyword("InfoEntity", null, "infoValue", ":", null);
		
		// change the type of attribute infoValue from EString to STRING
		go.changeTypeOfAttr("InfoEntity", "infoValue", "EString", "STRING");
		
		// rename keyword from 'MOD' to 'mod' / from 'FREQ' to 'freq' / from 'PRIO' to 'prio'
		go.keywordUpperToLowerCase("InfoEntry", null, null);
		
		// remove all the keywords in rule RedirectPage
		go.removeKeyword("RedirectPage", null, null, null);
		
		// remove all the brackets in rule RedirectPage
		go.removeBraces("RedirectPage", null, null);
		
		// remove all the parentheses in rule RedirectPage
		go.removeParenthesesInSpecifiedAttr("RedirectPage", "site");
		
		// remove the optional of attribute site
		go.removeOptionality("RedirectPage", null);
		
		// remove |EString from attribute site
		go.removeCertainTypeFromAttr("RedirectPage", null, "EString");
		
		String actualOutput = go.spliceGrammar();
		String expectOutput = FileHelper.getFileText("Test_MyXenia.txt", false);

		// compare text
		//Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
