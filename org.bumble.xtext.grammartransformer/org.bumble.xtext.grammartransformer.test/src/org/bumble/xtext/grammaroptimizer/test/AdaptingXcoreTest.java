package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingXcoreTest {
	@Test
	public void testAdaptingMyXcore() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("Xcore.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		// Change org.eclipse.xtext.common.Terminals to org.eclipse.xtext.xbase.Xbase
		input = input.replaceAll("org.eclipse.xtext.common.Terminals", "org.eclipse.xtext.xbase.Xbase");
		
		go.processGrammar(input);
		
		go.addImport("http://www.eclipse.org/xtext/xbase/Xbase", "xbase");
		go.addImport("http://www.eclipse.org/emf/2002/GenModel", "genmodel");
		go.addImport("http://www.eclipse.org/xtext/common/JavaVMTypes", "javaVMTypes");
		go.addImport("http://www.eclipse.org/xtext/xbase/Xtype", "xtype");
		
		// remove rule EString
		go.removeRule("EString");
		
		// remove rule EObject
		go.removeRule("EObject");
		
		// remove rule EClass/EClass0/EClass1 ...EClass9
		go.removeRule("EClass");
		go.removeRule("EClass0");
		go.removeRule("EClass1");
		go.removeRule("EClass2");
		go.removeRule("EClass3");
		go.removeRule("EClass4");
		go.removeRule("EClass5");
		go.removeRule("EClass6");
		go.removeRule("EClass7");
		go.removeRule("EClass8");
		go.removeRule("EClass9");

		// remove rule EBoolean
		go.removeRule("EBoolean");
		
		// rename keyword 'XPackage' to 'package'
		go.renameKeyword("XPackage", null, "XPackage", "package", null);
		
		// remove all the brackets in rule XPackage
		go.removeBraces("XPackage", null, null);
		
		// apply X 0...* to X* on all the attributes except attribute name
		go.convert1toStarToStar("XPackage", null);
		
		// remove the optional from all the attributes in rule XPackage
		go.removeOptionality("XPackage", null);
		
		// remove the keyword from all the attributes in rule XPackage 
		go.removeKeywordsOfAllAttrs("XPackage");
		
		// move attribute annotations to the front of keyword 'package'
		go.moveLine("XPackage", "annotations", "package", true);
		
		// change type of attribute name from EString to QualifiedName
		go.changeTypeOfAttr("XPackage", "name", "EString", "QualifiedName");
		
		// change XDataType_Impl to XDataType in rule XClassifier
		go.changeCalledRule("XClassifier", "XDataType_Impl", "XDataType");
		
		// remove keyword 'XAnnotation'
		go.removeKeyword("XAnnotation", null, "XAnnotation", null);
		
		// remove the outermost brackets 
		go.removeContainerBraces("XAnnotation");
		
		// remove attribute annotations
		go.removeAttribute("XAnnotation", "annotations");
		
		// rename keyword from 'source' to '@'
		go.renameKeyword("XAnnotation", null, "source", "@", null);
		
		// remove keyword 'details'
		go.removeKeyword("XAnnotation", null, "details", null);
		
		// remove the optional from all the attributes in rule XAnnotation
		go.removeOptionality("XAnnotation", "source");
		
		// change the brackets of attribute details to parentheses
		go.changeBracesToParentheses("XAnnotation", "details");
		
		// change EString to XQualifiedName
		go.changeTypeOfAttr("XAnnotation", "source", "EString", "XQualifiedName");
		
		
		// remove all the brackets in rule XImportDirective
		go.removeBraces("XImportDirective", null, null);		
		go.removeKeyword("XImportDirective", null, "importedNamespace", null);
		go.removeKeyword("XImportDirective", null, "importedObject", null);		
		go.renameKeyword("XImportDirective", null, "XImportDirective", "import", null);		
		go.removeAttribute("XImportDirective", "annotations");		
		go.changeOptionalAttrToOrRelation("XImportDirective", true, null, null);		
		go.changeTypeOfAttr("XImportDirective", "importedNamespace", "EString", "QualifiedNameWithWildcard");		
		go.changeTypeOfAttr("XImportDirective", "importedObject", "EString", "QualifiedName");
		go.packageAttributes("XImportDirective", "importedNamespace", "importedObject", MultiplicityKey.PACKAGE_ONLY);
		
		
		// remove attribute annotations from rule XAnnotationDirective
		go.removeAttribute("XAnnotationDirective", "annotations");
		
		// remove keyword 'XAnnotationDirective'
		go.removeKeyword("XAnnotationDirective", null, "XAnnotationDirective", null);
		
		// remove all the brackets in rule XAnnotationDirective
		go.removeBraces("XAnnotationDirective", null, null);
		
		// move the attribute sourceURI to the front of attribute name
		go.moveLine("XAnnotationDirective", "sourceURI", "name", true);
		
		// change the content of attribute sourceURI to "=>('annotation' sourceURI=STRING)"
		go.changeTypeOfAttr("XAnnotationDirective", "sourceURI", "EString", "STRING");
		go.renameKeyword("XAnnotationDirective", "sourceURI", "sourceURI", "annotation", null);
		go.removeOptionality("XAnnotationDirective", "sourceURI");
		go.addParenthesesWithoutQuotes("XAnnotationDirective", ScopeKey.SINGLELINE, null, "sourceURI", MultiplicityKey.PACKAGE_ONLY);
		go.addSymbolWithoutQuoteToLine("XAnnotationDirective", "sourceURI", "=>", true);
		
		// add a keyword 'as' to the head of attribute name
		go.addKeywordToAttr("XAnnotationDirective", "name", "as", true);
		
		// change the type of attribute name from EString to ValidID
		go.changeTypeOfAttr("XAnnotationDirective", "name", "EString", "ValidID");
		
		// remove all the keywords from rule XStringToStringMapEntry
		go.removeKeyword("XStringToStringMapEntry", null, null, null);
		
		// remove all the brackets from rule XStringToStringMapEntry
		go.removeBraces("XStringToStringMapEntry", null, null);
		
		// remove all the optional from rule XStringToStringMapEntry
		go.removeOptionality("XStringToStringMapEntry", null);
		
		// add an '=' to the head of attribute value
		go.addKeywordToAttr("XStringToStringMapEntry", "value", "=", true);
		
		// change the type of attribute key from EString to QualifiedName
		go.changeTypeOfAttr("XStringToStringMapEntry", "key", "EString", "QualifiedName");
		
		// change the type of attribute value from EString to STRING
		go.changeTypeOfAttr("XStringToStringMapEntry", "value", "EString", "STRING");
		
		
		// remove keyword 'XTypeParameter' from rule XTypeParameter
		go.removeKeyword("XTypeParameter", null, "XTypeParameter", null);
		
		// remove all the brackets from rule XTypeParameter
		go.removeBraces("XTypeParameter", null, null);
		
		// remove keyword 'annotations'
		go.removeKeyword("XTypeParameter", null, "annotations", null);
		
		// move attribute annotations to the front of attribute name
		go.moveLine("XTypeParameter", "annotations", "name", true);
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XTypeParameter", "annotations");
		
		// remove the optional from attribute annotations
		go.removeOptionality("XTypeParameter", "annotations");
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XTypeParameter", "name", "EString", "ID");
		
		// rename keyword 'bounds' to 'extends'
		go.renameKeyword("XTypeParameter", null, "bounds", "extends", null);
		
		// change "," to '&' in attribute bounds
		go.changeCommaToOtherSymbol("XTypeParameter", "bounds", "&");
		
		
		// Move attribute annotations to the front of attribute abstract in rule XClass
		go.moveLine("XClass", "annotations", "abstract", true);
		go.moveLine("XClass", "interface", "name", true);
//		go.renameKeyword("XClass", null, "XClass", "class", null);
		// remove keyword 'annotations'
		go.removeKeyword("XClass", null, "annotations", null);
		
		// remove the brackets from attribute annotations
		go.removeBraces("XClass", "annotations", null);
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XClass", "annotations");
		
		// remove the optional from attribute annotations
		go.removeOptionality("XClass", "annotations");
		go.removeOptionality("XClass", "abstract");
		go.removeOptionality("XClass", "interface");
		go.removeKeyword("XClass", null, "XClass", null);
		go.addSymbolWithoutQuoteToLine("XClass", "abstract", "?", false);
		go.addKeywordToLine("XClass", "abstract", "class", false);
		go.addParenthesesWithoutQuotes("XClass", ScopeKey.SINGLELINE, null, "abstract", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("XClass", false, "abstract", "interface");
		go.packageAttributes("XClass", "abstract", "interface", MultiplicityKey.PACKAGE_ONLY);
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XClass", "name", "EString", "ID");
		
		// move attribute typeParameters to the end of attribute name
		go.moveLine("XClass", "typeParameters", "name", false);
		
		// remove keyword 'typeParameters' 
		go.removeKeyword("XClass", null, "typeParameters", null);
		
		// change brackets of attribute typeParameters to '<' and '>'
		go.changeBracesToAngle("XClass", "typeParameters");
		
		// move attribute superTypes to the end of attribute typeParameters
		go.moveLine("XClass", "superTypes", "typeParameters", false);
		
		// rename keyword 'superTypes' to 'extends'
		go.renameKeyword("XClass", null, "superTypes", "extends", null);
		
		// remove brackets from attribute superTypes
		go.removeBraces("XClass", "superTypes", null);
		
		// move attribute instanceType to the end of attribute superTypes
		go.moveLine("XClass", "instanceType", "superTypes", false);
		
		// change the type of attribute instanceType from EClass to JvmTypeReference
		go.changeTypeOfAttr("XClass", "instanceType", "EClass", "JvmTypeReference");
		
		// rename keyword 'instanceType' to 'wraps'
		go.renameKeyword("XClass", null, "instanceType", "wraps", null);
		
		// remove keyword 'members' from attribute members
		go.removeKeyword("XClass", null, "members", null);
		
		// remove brackets from attribute members
		go.removeBraces("XClass", "members", null);
		
		// remove optional from attribute members
		go.removeOptionality("XClass", "members");
		
		// apply a change from X 0...* to on attribute members
		go.convert1toStarToStar("XClass", "members");
		
		
		// change XDataType_Impl to XDataType in rule XDataType_Impl
		go.renameRule("XDataType_Impl", "XDataType");
		
		// rename keyword 'XDataType' to 'type'
		go.renameKeyword("XDataType", null, "XDataType", "type", null);
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XDataType", "name", "EString", "ID");
		
		// move attribute annotations to the front of keyword 'type'
		go.moveLine("XDataType", "annotations", "type", true);
		
		// remove keyword 'annotations'
		go.removeKeyword("XDataType", null, "annotations", null);
		
		// remove brackets from attribute annotations
		go.removeBraces("XDataType", "annotations", null);
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XDataType", "annotations");
		
		// remove the optional from attribute annotations
		go.removeOptionality("XDataType", "annotations");
		
		// remove the outermost brackets from rule XDataType
		go.removeContainerBraces("XDataType");
		
		// move attribute typeParameters to the front of attribute serializable
		go.moveLine("XDataType", "typeParameters", "serializable", true);
		
		// remove keyword 'typeParameters' from attribute typeParameters
		go.removeKeyword("XDataType", null, "typeParameters", null);
		
		// change the brackets of attribute typeParameters to '<' '>'
		go.changeBracesToAngle("XDataType", "typeParameters");
		
		// move attribute instanceType to the end of attribute typeParameters
		go.moveLine("XDataType", "instanceType", "typeParameters", false);
		
		// remove the optional from attribute instanceType
		go.removeOptionality("XDataType", "instanceType");
		
		// change the type of attribute instanceType from EClass to JvmTypeReference
		go.changeTypeOfAttr("XDataType", "instanceType", "EClass", "JvmTypeReference");
		
		// rename the keyword 'instanceType' to 'wraps'
		go.renameKeyword("XDataType", null, "instanceType", "wraps", null);
		
		// move the attribute serializable to the front of attribute createBody
		go.moveLine("XDataType", "serializable", "createBody", true);
		
		// remove keyword 'serializable' from attribute serializable
		//go.removeKeyword("XDataType", null, "serializable", null);
		go.changeBooleanAttrToSpecialPattern("XDataType", "serializable");
		go.renameKeyword("XDataType", "serializable", "serializable", "create", null);

		//go.changeTypeOfAttr("XDataType", "serializable", "EBoolean", "create");
		go.changeTypeOfAttr("XDataType", "createBody", "EClass0", "XBlockExpression");
		go.changeTypeOfAttr("XDataType", "convertBody", "EClass1", "XBlockExpression");
		go.removeKeyword("XDataType", "createBody", "createBody", null);
		go.renameKeyword("XDataType", "convertBody", "convertBody", "convert", null);
		go.removeOptionality("XDataType", "createBody");
		go.packageAttributes("XDataType", "serializable", "createBody", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		go.addSymbolWithoutQuoteToLine("XDataType", "createBody", " &", false);
		go.packageAttributes("XDataType", "serializable", "convertBody", MultiplicityKey.PACKAGE_ONLY);
		
		
		// move attribute annotations to the front of keyword 'XEnum' in rule XEnum
		go.moveLine("XEnum", "annotations", "XEnum", true);
		
		// remove keyword 'annotations' from attribute annotations
		go.removeKeyword("XEnum", null, "annotations", null);
		
		// remove brackets from attribute annotations
		go.removeBraces("XEnum", "annotations", null);
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XEnum", "annotations");
		
		// remove the optional from attribute annotations
		go.removeOptionality("XEnum", "annotations");
		
		// rename keyword 'XEnum' to 'enum'
		go.renameKeyword("XEnum", null, "XEnum", "enum", null);
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XEnum", "name", "EString", "ID");
		
		// remove attribute serializable/instanceType/typeParameters/createBody/convertBody
		go.removeAttribute("XEnum", "serializable");
		go.removeAttribute("XEnum", "instanceType");
		go.removeAttribute("XEnum", "typeParameters");
		go.removeAttribute("XEnum", "createBody");
		go.removeAttribute("XEnum", "convertBody");
		
		// remove keyword 'literals' from attribute literals
		go.removeKeyword("XEnum", null, "literals", null);
		
		// remove brackets from attribute literals
		go.removeBraces("XEnum", "literals", null);
		
		// change "," to "(',')?" in attribute literals
		go.addOptionalityToSymbol("XEnum", "literals", ",");
	
		// remove keyword 'XGenericType' from rule XGenericType
		go.removeKeyword("XGenericType");
		go.removeOptionality("XGenericType", null);
		// remove the outermost brackets from rule XGenericType
		go.removeBraces("XGenericType");
		
		go.changeTypeOfAttr("XGenericType", "type", "\\[\\|EString\\]", "[genmodel::GenBase|XQualifiedName]");
		go.changeTypeOfAttr("XGenericType", "typeArguments", "XGenericType", "XGenericTypeArgument");
		go.addBracesToLine("XGenericType", "typeArguments");
		go.changeBracesToAngle("XGenericType", "typeArguments");
		go.addSymbolWithoutQuoteToLine("XGenericType", "typeArguments", "=>", true);
		go.addOptionalityToLine("XGenericType", "typeArguments");
		
		// remove attributes upperBound and lowerBound
		go.removeAttribute("XGenericType", "upperBound");
		go.removeAttribute("XGenericType", "lowerBound");
		
		// change the content of rule XMultiplicity to "'[' ('?' | '*' | '+' | (INT ('..' (INT | '?' | '*'))?))? ']';"
		go.changeRuleContent("XMultiplicity", "'[' ('?' | '*' | '+' | (INT ('..' (INT | '?' | '*'))?))? ']';");
		
		// move attribute annotations to the front of attribute unordered in rule XAttribute
		go.moveLine("XAttribute", "annotations", "unordered", true);
		
		// remove keyword 'annotations'
		go.removeKeyword("XAttribute", null, "annotations", null);
		
		// remove brackets from attribute annotations
		go.removeBraces("XAttribute", "annotations", null);
		
		// remove optional from attribute annotations
		go.removeOptionality("XAttribute", "annotations");
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XAttribute", "annotations");
		
		// move attribute transient to the front of attribute volatile
		go.moveLine("XAttribute", "transient", "volatile", true);
		
		go.addSymbolWithoutQuoteToLine("XAttribute", "unordered", "&", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "unique", "&", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "readonly", "&", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "transient", "&", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "volatile", "&", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "unsettable", "&", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "derived", "&", false);
		go.packageAttributes("XAttribute", "unordered", "iD", MultiplicityKey.PACKAGE_ONLY);
		
		// remove keyword 'XAttribute'
		go.removeKeyword("XAttribute", null, "XAttribute", null);
		
		// move attribute type to the front of attribute name
		go.moveLine("XAttribute", "type", "name", true);
		
		// remove keyword 'type' from attribute type
		go.removeKeyword("XAttribute", null, "type", null);
		
		// remove optional from attribute type
		go.removeOptionality("XAttribute", "type");
		
		// move attribute multiplicity to the front of attribute name
		go.moveLine("XAttribute", "multiplicity", "name", true);
		
		// remove keyword 'multiplicity' from attribute multiplicity
		go.removeKeyword("XAttribute", null, "multiplicity", null);
		
		// change the type of name from EString to ID
		go.changeTypeOfAttr("XAttribute", "name", "EString", "ID");
		
		// remove the outermost brackets from rule XAttribute
		go.removeContainerBraces("XAttribute");
		
		// rename keyword 'defaultValueLiteral' to '=' in attribute defaultValueLiteral
		go.renameKeyword("XAttribute", null, "defaultValueLiteral", "=", null);
		
		// change the type of attribute defaultValueLiteral from EString to STRING
		go.changeTypeOfAttr("XAttribute", "defaultValueLiteral", "EString", "STRING");
		go.changeTypeOfAttr("XAttribute", "getBody", "EClass3", "XBlockExpression");
		go.changeTypeOfAttr("XAttribute", "setBody", "EClass4", "XBlockExpression");
		go.changeTypeOfAttr("XAttribute", "isSetBody", "EClass5", "XBlockExpression");
		go.changeTypeOfAttr("XAttribute", "unsetBody", "EClass6", "XBlockExpression");
		go.renameKeyword("XAttribute", "getBody", "getBody", "get", null);
		go.renameKeyword("XAttribute", "setBody", "setBody", "set", null);
		go.renameKeyword("XAttribute", "isSetBody", "isSetBody", "isSet", null);
		go.renameKeyword("XAttribute", "unsetBody", "unsetBody", "unset", null);
		go.addSymbolWithoutQuoteToLine("XAttribute", "getBody", " &", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "setBody", " &", false);
		go.addSymbolWithoutQuoteToLine("XAttribute", "isSetBody", " &", false);
		go.packageAttributes("XAttribute", "getBody", "unsetBody", MultiplicityKey.PACKAGE_ONLY);
		
		
		// move attribute annotations to the front of attribute unordered in rule XOperation
		go.moveLine("XOperation", "annotations", "unordered", true);
		
		// remove keyword 'annotations' of attribute annotations
		go.removeKeyword("XOperation", null, "annotations", null);
		
		// remove brackets from attribute annotations
		go.removeBraces("XOperation", "annotations", null);
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XOperation", "annotations");
		
		// remove optional from attribute annotations
		go.removeOptionality("XOperation", "annotations");
		
		// add a keyword 'op' to the front of attribute unordered
		go.addKeywordToAttr("XOperation", "annotations", "op", false);
		
		go.removeOptionality("XOperation", "unordered");
		go.removeOptionality("XOperation", "unique");
		go.changeABToABorBA("XOperation", "unordered", "unique");
		go.addSymbolWithoutQuoteToKeyword("XOperation", "unordered", "unique", "?", false);
		go.addSymbolWithoutQuoteToKeyword("XOperation", "unique", "unordered", "?", false);
		go.packageAttributes("XOperation", "unordered", "unique", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// remove keyword XOperation
		go.removeKeyword("XOperation", null, "XOperation", null);

		// remove the outermost brackets of rule XOperation
		go.removeContainerBraces("XOperation");
		
		// remove keyword 'typeParameters' of attribute typeParameters
		go.removeKeyword("XOperation", null, "typeParameters", null);
		
		// change brackets of attribute typeParameters to '<' '>'
		go.changeBracesToAngle("XOperation", "typeParameters");
		
		// move attrribute multiplicity to the front of attribute name
		go.moveLine("XOperation", "multiplicity", "name", true);
		
		// move attribute type to the front of attribute multiplicity
		go.moveLine("XOperation", "type", "multiplicity", true);
		
		// move attribute typeParameters to the front of attribute multiplicity
		go.moveLine("XOperation", "typeParameters", "type", true);
		
		go.removeOptionality("XOperation", "type");
		go.removeKeyword("XOperation", "type", "type", null);
		go.addSymbolWithoutQuoteToLine("XOperation", "type", " |", false);
		go.addKeywordToLine("XOperation", "type", "void", false);
		go.addParenthesesWithoutQuotes("XOperation", ScopeKey.SINGLELINE, null, "type", MultiplicityKey.PACKAGE_ONLY);
		
		// remove keyword 'multiplicity' of attribute multiplicity
		go.removeKeyword("XOperation", null, "multiplicity", null);
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XOperation", "name", "EString", "ID");
		
		go.removeOptionality("XOperation", "parameters");
		go.removeBraces("XOperation", "parameters", null);
		go.removeKeyword("XOperation", "parameters", "parameters", null);
		go.addOptionalityToLine("XOperation", "parameters");
		go.addBracesToLine("XOperation", "parameters");
		go.changeBracesToParentheses("XOperation", "parameters");
		
		// remove brackets of attribute exceptions
		go.removeBraces("XOperation", "exceptions", null);
		
		// rename keyword 'exceptions' to 'throws'
		go.renameKeyword("XOperation", null, "exceptions", "throws", null);
		
		// remove keyword 'body' from attribute body
		go.removeKeyword("XOperation", null, "body", null);
		
		// change the type of attribute body from EClass7 to XBlockExpression
		go.changeTypeOfAttr("XOperation", "body", "EClass7", "XBlockExpression");
		
		
		// move attribute annotations to the front of attribute unordered in rule XReference
		go.moveLine("XReference", "annotations", "unordered", true);
		
		// remove keyword 'annotations' from attribute annotations
		go.removeKeyword("XReference", null, "annotations", null);
		
		// remove all the brackets from rule XReference
		go.removeBraces("XReference", null, null);
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XReference", "annotations");
		
		// remove optional from attribute annotations
		go.removeOptionality("XReference", "annotations");
		
		// move attribute containment to the front of attribute unordered
		go.moveLine("XReference", "containment", "unordered", true);

		// move attribute resolveProxies to the front of attribute unordered
		go.moveLine("XReference", "resolveProxies", "unordered", true);

		// move attribute container to the front of attribute unordered
		go.moveLine("XReference", "container", "unordered", true);

		// move attribute local to the front of attribute unordered
		go.moveLine("XReference", "local", "unordered", true);
		
		// change the content of attribute container to "(container?='container' resolveProxies?='resolving'?) | (resolveProxies?='resolving' container?='container') |"
		go.changeAttrLineContent("XReference", "container", 
				"(container?='container' resolveProxies?='resolving'?) | (resolveProxies?='resolving' container?='container') |");
		
		// change the content of resolveProxies to "(resolveProxies?='resolving' containment?='contains') |"
		go.changeAttrLineContent("XReference", "resolveProxies", 
				"(resolveProxies?='resolving' containment?='contains') |");

		// change the content of containment to "((containment?='contains' resolveProxies?='resolving'?) |"
		go.changeAttrLineContent("XReference", "containment", 
				"((containment?='contains' resolveProxies?='resolving'?) |");
		
		// change the content of local to "('refers' local?='local'?) | (local?='local' 'refers'))"
		go.changeAttrLineContent("XReference", "local", "('refers' local?='local'?) | (local?='local' 'refers'))");
		
		go.addSymbolWithoutQuoteToLine("XReference", "unordered", " &", false);
		
		// move attribute transient to the front of attribute volatile
		go.moveLine("XReference", "transient", "volatile", true);
		go.addSymbolWithoutQuoteToLine("XReference", "unique", " &", false);
		go.addSymbolWithoutQuoteToLine("XReference", "readonly", " &", false);
		go.addSymbolWithoutQuoteToLine("XReference", "transient", " &", false);
		go.addSymbolWithoutQuoteToLine("XReference", "volatile", " &", false);
		go.addSymbolWithoutQuoteToLine("XReference", "unsettable", " &", false);
		go.packageAttributes("XReference", "unordered", "derived", MultiplicityKey.PACKAGE_ONLY);
		
		// remove keyword 'XReference'
		go.removeKeyword("XReference", null, "XReference", null);
		
		// move attribute type to the front of attribute name
		go.moveLine("XReference", "type", "name", true);
		
		// remove keyword 'type' from attribute type
		go.removeKeyword("XReference", null, "type", null);
		
		// remove optional of attribute type
		go.removeOptionality("XReference", "type");
		
		// move attribute multiplicity to the front of attribute name
		go.moveLine("XReference", "multiplicity", "name", true);
		
		// remove keyword 'multiplicity' from attribute multiplicity
		go.removeKeyword("XReference", null, "multiplicity", null);
		
		// change the type of name from EString to ID
		go.changeTypeOfAttr("XReference", "name", "EString", "ID");
		
		go.changeTypeOfAttr("XReference", "opposite", "\\[\\|EString\\]", "[genmodel::GenFeature|ValidID]");
		go.changeTypeOfAttr("XReference", "keys", "\\[\\|EString\\]", "[genmodel::GenFeature|ValidID]");
		go.removeParenthesesInSpecifiedAttr("XReference", "keys");
		go.changeTypeOfAttr("XReference", "getBody", "EClass3", "XBlockExpression");
		go.changeTypeOfAttr("XReference", "setBody", "EClass4", "XBlockExpression");
		go.changeTypeOfAttr("XReference", "isSetBody", "EClass5", "XBlockExpression");
		go.changeTypeOfAttr("XReference", "unsetBody", "EClass6", "XBlockExpression");
		go.renameKeyword("XReference", "getBody", "getBody", "get", null);
		go.renameKeyword("XReference", "setBody", "setBody", "set", null);
		go.renameKeyword("XReference", "isSetBody", "isSetBody", "isSet", null);
		go.renameKeyword("XReference", "unsetBody", "unsetBody", "unset", null);
		go.addSymbolWithoutQuoteToLine("XReference", "getBody", " &", false);
		go.addSymbolWithoutQuoteToLine("XReference", "setBody", " &", false);
		go.addSymbolWithoutQuoteToLine("XReference", "isSetBody", " &", false);
		go.packageAttributes("XReference", "getBody", "unsetBody", MultiplicityKey.PACKAGE_ONLY);
		
		// move attribute annotations to the front of attribute unordered in rule XParameter
		go.moveLine("XParameter", "annotations", "unordered", true);
		
		// remove keyword 'annotations'
		go.removeKeyword("XParameter", null, "annotations", null);
		
		// remove all the brackets in rule XParameter
		go.removeBraces("XParameter", null, null);
		
		// remove optional from attribute annotations
		go.removeOptionality("XParameter", "annotations");
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XParameter", "annotations");
		
		go.removeOptionality("XParameter", "unordered");
		go.removeOptionality("XParameter", "unique");
		go.changeABToABorBA("XParameter", "unordered", "unique");
		go.addSymbolWithoutQuoteToKeyword("XParameter", "unordered", "unique", "?", false);
		go.addSymbolWithoutQuoteToKeyword("XParameter", "unique", "unordered", "?", false);
		go.packageAttributes("XParameter", "unordered", "unique", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// remove keyword 'XParameter'
		go.removeKeyword("XParameter", null, "XParameter", null);
		
		// move attribute type to the front of attribute name
		go.moveLine("XParameter", "type", "name", true);
		
		// remove keyword 'type' from attribute type
		go.removeKeyword("XParameter", null, "type", null);
		
		// remove optional from attribute type
		go.removeOptionality("XParameter", "type");
		
		// move attribute multiplicity to the front of attribute name
		go.moveLine("XParameter", "multiplicity", "name", true);
		
		// remove keyword 'multiplicity'
		go.removeKeyword("XParameter", null, "multiplicity", null);
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XParameter", "name", "EString", "ID");
		
		
		// move attribute annotations to the front of attribute name in rule XEnumLiteral
		go.moveLine("XEnumLiteral", "annotations", "name", true);
		
		// remove keyword 'annotations'
		go.removeKeyword("XEnumLiteral", null, "annotations", null);
		
		// remove all the brackets in rule XEnumLiteral
		go.removeBraces("XEnumLiteral", null, null);
		
		// remove optional from attribute annotations
		go.removeOptionality("XEnumLiteral", "annotations");
		
		// apply a change from X 0...* to X* on attribute annotations
		go.convert1toStarToStar("XEnumLiteral", "annotations");
		
		// remove keyword 'XEnumLiteral'
		go.removeKeyword("XEnumLiteral", null, "XEnumLiteral", null);
		
		// change the type of attribute name from EString to ID
		go.changeTypeOfAttr("XEnumLiteral", "name", "EString", "ID");
		
		// rename keyword 'value' to '=' of attribute value
		go.renameKeyword("XEnumLiteral", null, "value", "=", null);
		
		// change the type of attribute value from EInt to SignedInt
		go.changeTypeOfAttr("XEnumLiteral", "value", "EInt", "SignedInt");
		
		// rename keyword 'literal' to 'as' of attribute literal
		go.renameKeyword("XEnumLiteral", null, "literal", "as", null);
		
		// change the type of attribute literal from EString to STRING
		go.changeTypeOfAttr("XEnumLiteral", "literal", "EString", "STRING");
		
		// move the attribute literal to the front of attribute value
		go.moveLine("XEnumLiteral", "literal", "value", true);
		
		// change the name of rule EInt to SignedInt
		go.renameRule("EInt", "SignedInt");
		
		go.addPrimitiveType("XBlockExpression", "xbase::XBlockExpression", 
				"    {xbase::XBlockExpression}\n    '{'\n        (expressions+=XExpressionOrVarDeclaration ';'?)*\n    '}'\n;", 
				"Override");
		
		go.addPrimitiveType("XGenericTypeArgument", "XGenericType", 
				"    XGenericType |\n    XGenericWildcardTypeArgument\n;", null);
	
		go.addPrimitiveType("XGenericWildcardTypeArgument", "XGenericType", 
				"    {XGenericType}\n    '?' ('extends' upperBound=XGenericType | 'super' lowerBound=XGenericType)?\n;", null);
		
		go.addPrimitiveType("XQualifiedName", null, 
				"    XID ('.' XID)*\n;", null);
		
		go.addPrimitiveType("XID", null, 
				"    ID | 'get' | 'isSet' | 'set' | 'unset'\n;", null);
		
		go.addPrimitiveType("ValidID", null, 
				"    XID | 'void'\n;", "Override");
		
		String bodyOfFeatureCallID = "ValidID | 'abstract' | 'annotation' | 'as' | 'class' | 'container' | 'contains' | 'convert' | 'create' | 'derived' | 'enum' | 'extends' | 'extension' | 'id' | 'import' | 'keys' |\r\n"
				+ "	'interface'| 'local' | 'op' | 'opposite' | 'package' | 'readonly' | 'refers' | 'resolving' | 'static' | 'throws' | 'transient' | 'unique' | 'unordered' | 'unsettable'|\r\n"
				+ "	'volatile' | 'wraps'";
		go.addPrimitiveType("FeatureCallID", null, 
				"    " + bodyOfFeatureCallID + "\n;", "Override");
		
		String actualOutput = go.spliceGrammar();	
		//FileHelper.setFileText("Test_Xcore.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_Xcore.txt", false);
		
		// compare text
		//Assertions.assertEquals(expectOutput, actualOutput, "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
