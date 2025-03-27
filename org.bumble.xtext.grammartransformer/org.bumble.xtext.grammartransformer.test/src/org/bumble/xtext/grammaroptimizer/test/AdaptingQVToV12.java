package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class AdaptingQVToV12 {
	@Test
	public void testAdaptingQVToV12() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("QVToV12.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");
		
		go.processGrammar(input);
		
		// remove rules
		go.removeRule("Type");
		go.removeRule("Element");
		go.removeRule("NamedElement");

		go.removeRule("VarParameter");
		go.removeRule("OperationBody");

		go.removeRule("Module_Impl");
		go.removeRule("Tag");
		go.removeRule("Comment");
		go.removeRule("String0");
		go.removeRule("Package");
		go.removeRule("Operation");
		go.removeRule("Property");
		go.removeRule("Boolean");

		go.removeRule("Class");
		go.removeRule("DataType_Impl");
		go.removeRule("Enumeration");
		go.removeRule("Parameter");
		go.removeRule("EnumerationLiteral");
		go.removeRule("PrimitiveType");
		go.removeRule("Integer");
		go.removeRule("UnlimitedNatural");
		
		go.removeRule("MappingParameter");
		go.removeRule("ModelParameter");
		go.removeRule("OperationBody_Impl");
		go.removeRule("ImperativeOperation_Impl");
		go.removeRule("ConstructorBody");
		go.removeRule("ImportKind");
		
		go.removeRule("ResolveExp_Impl");
		go.removeRule("ResolveInExp");
		go.removeRule("MappingCallExp");
		go.removeRule("ImperativeCallExp_Impl");
		go.removeRule("ObjectExp");
		go.removeRule("ExpressionGO");
		
		go.removeRule("Factory");
		
		// optimize the grammar rule TopLevelGo
		go.removeBraces("TopLevelGO");
		go.removeKeyword("TopLevelGO");
		go.convert1toStarToStar("TopLevelGO", null);
		go.removeOptionality("TopLevelGO", null);
		go.moveLine("TopLevelGO", "unit_element", "moduleimport", false);
		
		// optimize the rule Module
		go.removeRuleCall("Module", "Module_Impl");
		
		// optimize the rule ImperativeOperation
		go.removeRuleCall("ImperativeOperation", "ImperativeOperation_Impl");
		
		// optimize the grammar rule ModuleImport
		go.removeAttribute("ModuleImport", "kind");
		go.removeAttribute("ModuleImport", "tag");
		go.removeAttribute("ModuleImport", "binding");
		go.removeAttribute("ModuleImport", "importedModule");
		go.removeAttribute("ModuleImport", "ownedComment");
		go.removeKeyword("ModuleImport", null, "ModuleImport", null);
		go.removeBraces("ModuleImport");
		go.removeOptionality("ModuleImport", null);
		go.changeTypeOfAttr("ModuleImport", "identifier", "EString", "ID");
		go.removeKeyword("ModuleImport", "identifier", "identifier", null);
		go.addSymbolWithoutQuoteToLine("ModuleImport", "identifier", "|", false);
		go.addSymbolToLine("ModuleImport", "identifier", "*", false);
		go.addSymbolWithoutQuoteToLine("ModuleImport", "identifier", "(", true);
		go.addSymbolWithoutQuoteToLine("ModuleImport", "identifier", ")", false);
		go.addSymbolToLine("ModuleImport", "identifier", ";", false);
		go.addKeywordToLine("ModuleImport", "identifier", "import", true);
		go.changeABtoBAB("ModuleImport", "identifier", "unit");
		go.renameKeyword("ModuleImport", "identifier", "unit", "from", null);
		go.renameKeyword("ModuleImport", "unit", "unit", "import", null);
		go.addSymbolToLine("ModuleImport", "unit", ";", false);
		go.changeOptionalAttrToOrRelation("ModuleImport", false, "identifier", "unit");
		
		// optimize grammar rule helper
		go.removeAttribute("Helper", "isOrdered");
		go.removeAttribute("Helper", "isUnique");
		go.removeAttribute("Helper", "lower");
		go.removeAttribute("Helper", "upper");
		go.removeAttribute("Helper", "name");
		go.removeAttribute("Helper", "isQuery");
		go.removeAttribute("Helper", "tag");
		go.removeAttribute("Helper", "type");
		go.removeAttribute("Helper", "raisedException");
		go.removeAttribute("Helper", "entry");
		go.removeAttribute("Helper", "configProperty");
		go.removeAttribute("Helper", "usedModelType");
		go.removeAttribute("Helper", "ownedComment");
		go.removeAttribute("Helper", "ownedParameter");
		go.removeAttribute("Helper", "result");
		go.removeAttribute("Helper", "body");
		go.removeAttribute("Helper", "ownedTag");
		go.removeAttribute("Helper", "moduleImport");
		go.removeAttribute("Helper", "ownedVariable");
		go.removeAttribute("Helper", "uri");
		go.removeAttribute("Helper", "isBlackbox");
		go.removeAttribute("Helper", "overridden");
		go.removeAttribute("Helper", "context");
		go.removeAttribute("Helper", "ownedType");
		go.removeAttribute("Helper", "nestedPackage");
		go.removeBraces("Helper");
		go.removeKeyword("Helper");
		go.addSymbolWithoutQuoteToLine("Helper", "helper_header", " (", false);
		go.addSymbolToLine("Helper", "helper_header", ";", false);
		go.addSymbolWithoutQuoteToLine("Helper", "helper_header", " |", false);
		go.removeOptionality("Helper", null);
		go.addSymbolToLine("Helper", "expression", "=", true);
		go.addSymbolToLine("Helper", "expression", ";", false);
		go.addSymbolWithoutQuoteToLine("Helper", "expression", " |", false);
		go.addSymbolToLine("Helper", "expression_block", ";", false);
		go.addOptionalityToSymbol("Helper", "expression_block", ";");
		go.addSymbolWithoutQuoteToLine("Helper", "expression_block", ")", false);
		
		// optimize OperationalTransformation
		go.removeAttribute("OperationalTransformation", "name");
		go.removeAttribute("OperationalTransformation", "uri");
		go.removeAttribute("OperationalTransformation", "isBlackbox");
		go.removeAttribute("OperationalTransformation", "tag");
		go.removeAttribute("OperationalTransformation", "entry");
		go.removeAttribute("OperationalTransformation", "configProperty");
		go.removeAttribute("OperationalTransformation", "usedModelType");
		go.removeAttribute("OperationalTransformation", "intermediateClass");
		go.removeAttribute("OperationalTransformation", "refined");
		go.removeAttribute("OperationalTransformation", "intermediateProperty");
		go.removeAttribute("OperationalTransformation", "ownedComment");
		go.removeAttribute("OperationalTransformation", "ownedType");
		go.removeAttribute("OperationalTransformation", "nestedPackage");
		go.removeAttribute("OperationalTransformation", "ownedTag");
		go.removeAttribute("OperationalTransformation", "moduleImport");
		go.removeAttribute("OperationalTransformation", "ownedVariable");
		go.removeAttribute("OperationalTransformation", "modelParameter");
		go.removeAttribute("OperationalTransformation", "relation");
		go.removeContainerBraces("OperationalTransformation");
		go.removeKeyword("OperationalTransformation");
		go.convert1toStarToStar("OperationalTransformation", "module_element");
		go.removeOptionality("OperationalTransformation", null);
		go.addSymbolToLine("OperationalTransformation", "module_element", ";", false);
		go.addOptionalityToSymbol("OperationalTransformation", "module_element", ";");
		go.addSymbolWithoutQuoteToLine("OperationalTransformation", "transformation_h", " (", false);
		go.addSymbolToLine("OperationalTransformation", "transformation_h", ";", false);
		go.addSymbolWithoutQuoteToLine("OperationalTransformation", "transformation_h", " |", false);
		go.addSymbolWithoutQuoteToLine("OperationalTransformation", "module_element", " )", false);
		
		
		// optimize MappingOperation
		go.removeAttribute("MappingOperation", "isOrdered");
		go.removeAttribute("MappingOperation", "isUnique");
		go.removeAttribute("MappingOperation", "lower");
		go.removeAttribute("MappingOperation", "upper");
		go.removeAttribute("MappingOperation", "name");
		go.removeAttribute("MappingOperation", "isQuery");
		go.removeAttribute("MappingOperation", "tag");
		go.removeAttribute("MappingOperation", "type");
		go.removeAttribute("MappingOperation", "raisedException");
		go.removeAttribute("MappingOperation", "entry");
		go.removeAttribute("MappingOperation", "configProperty");
		go.removeAttribute("MappingOperation", "usedModelType");
		go.removeAttribute("MappingOperation", "ownedComment");
		go.removeAttribute("MappingOperation", "ownedParameter");
		go.removeAttribute("MappingOperation", "result");
		go.removeAttribute("MappingOperation", "body");
		go.removeAttribute("MappingOperation", "ownedTag");
		go.removeAttribute("MappingOperation", "moduleImport");
		go.removeAttribute("MappingOperation", "ownedVariable");
		go.removeAttribute("MappingOperation", "uri");
		go.removeAttribute("MappingOperation", "isBlackbox");
		go.removeAttribute("MappingOperation", "overridden");
		go.removeAttribute("MappingOperation", "context");
		go.removeAttribute("MappingOperation", "ownedType");
		go.removeAttribute("MappingOperation", "nestedPackage");
		go.removeAttribute("MappingOperation", "disjunct");
		go.removeAttribute("MappingOperation", "refinedRelation");
		go.removeAttribute("MappingOperation", "merged");
		go.removeAttribute("MappingOperation", "inherited");
		go.removeAttribute("MappingOperation", "when");
		go.removeAttribute("MappingOperation", "where");
		go.moveLine("MappingOperation", "mapping_full_header", "MappingOperation", false);
		go.removeKeyword("MappingOperation");
		go.removeOptionality("MappingOperation", null);
		go.addSymbolWithoutQuoteToLine("MappingOperation", "mapping_full_header", " (", false);
		go.addSymbolToLine("MappingOperation", "mapping_full_header", ";", false);
		go.addSymbolWithoutQuoteToLine("MappingOperation", "mapping_full_header", " |", false);
		go.removeBraces("MappingOperation");
		go.addBracesToAttr("MappingOperation", "mapping_body");
		go.addSymbolToLine("MappingOperation", "mapping_body", ";", false);
		go.addOptionalityToSymbol("MappingOperation", "mapping_body", ";");
		go.addSymbolWithoutQuoteToLine("MappingOperation", "mapping_body", ")", false);
		
		
		// optimize constructor
		go.removeAttribute("Constructor", "isOrdered");
		go.removeAttribute("Constructor", "isUnique");
		go.removeAttribute("Constructor", "lower");
		go.removeAttribute("Constructor", "upper");
		go.removeAttribute("Constructor", "name");
		go.removeAttribute("Constructor", "isQuery");
		go.removeAttribute("Constructor", "tag");
		go.removeAttribute("Constructor", "type");
		go.removeAttribute("Constructor", "raisedException");
		go.removeAttribute("Constructor", "entry");
		go.removeAttribute("Constructor", "configProperty");
		go.removeAttribute("Constructor", "usedModelType");
		go.removeAttribute("Constructor", "ownedComment");
		go.removeAttribute("Constructor", "ownedParameter");
		go.removeAttribute("Constructor", "result");
		go.removeAttribute("Constructor", "body");
		go.removeAttribute("Constructor", "ownedTag");
		go.removeAttribute("Constructor", "moduleImport");
		go.removeAttribute("Constructor", "ownedVariable");
		go.removeAttribute("Constructor", "uri");
		go.removeAttribute("Constructor", "isBlackbox");
		go.removeAttribute("Constructor", "overridden");
		go.removeAttribute("Constructor", "context");
		go.removeAttribute("Constructor", "ownedType");
		go.removeAttribute("Constructor", "nestedPackage");
		go.moveLine("Constructor", "constructor_header", "Constructor", false);
		go.removeKeyword("Constructor");
		go.removeOptionality("Constructor", null);
		go.addSymbolWithoutQuoteToLine("Constructor", "constructor_header", " (", false);
		go.addSymbolToLine("Constructor", "constructor_header", ";", false);
		go.addSymbolWithoutQuoteToLine("Constructor", "constructor_header", " |", false);
		go.removeBraces("Constructor");
		go.addSymbolToLine("Constructor", "expression_block", ";", false);
		go.addOptionalityToSymbol("Constructor", "expression_block", ";");
		go.addSymbolWithoutQuoteToLine("Constructor", "expression_block", ")", false);
		
		
		// optimize ContextualProperty
		go.removeAttribute("ContextualProperty", "isOrdered");
		go.removeAttribute("ContextualProperty", "isUnique");
		go.removeAttribute("ContextualProperty", "lower");
		go.removeAttribute("ContextualProperty", "upper");
		go.removeAttribute("ContextualProperty", "name");
		go.removeAttribute("ContextualProperty", "isQuery");
		go.removeAttribute("ContextualProperty", "tag");
		go.removeAttribute("ContextualProperty", "type");
		go.removeAttribute("ContextualProperty", "raisedException");
		go.removeAttribute("ContextualProperty", "entry");
		go.removeAttribute("ContextualProperty", "configProperty");
		go.removeAttribute("ContextualProperty", "usedModelType");
		go.removeAttribute("ContextualProperty", "ownedComment");
		go.removeAttribute("ContextualProperty", "ownedParameter");
		go.removeAttribute("ContextualProperty", "result");
		go.removeAttribute("ContextualProperty", "body");
		go.removeAttribute("ContextualProperty", "ownedTag");
		go.removeAttribute("ContextualProperty", "moduleImport");
		go.removeAttribute("ContextualProperty", "ownedVariable");
		go.removeAttribute("ContextualProperty", "uri");
		go.removeAttribute("ContextualProperty", "isBlackbox");
		go.removeAttribute("ContextualProperty", "overridden");
		go.removeAttribute("ContextualProperty", "context");
		go.removeAttribute("ContextualProperty", "ownedType");
		go.removeAttribute("ContextualProperty", "nestedPackage");
		
		go.removeAttribute("ContextualProperty", "initExpression");
		go.removeBraces("ContextualProperty");
		go.removeKeywordsOfAllAttrs("ContextualProperty");
		go.convert1toStarToPlus("ContextualProperty", "property_key");
		go.addOptionalityToKeyword("ContextualProperty", null, "ContextualProperty");
		go.addSymbolToRule("ContextualProperty", ";");
		go.renameKeyword("ContextualProperty", null, "ContextualProperty", "intermediate", null);
		
		// Optimize EntryOperation
		go.removeAttribute("EntryOperation", "isOrdered");
		go.removeAttribute("EntryOperation", "isUnique");
		go.removeAttribute("EntryOperation", "lower");
		go.removeAttribute("EntryOperation", "upper");
		go.removeAttribute("EntryOperation", "name");
		go.removeAttribute("EntryOperation", "isQuery");
		go.removeAttribute("EntryOperation", "tag");
		go.removeAttribute("EntryOperation", "type");
		go.removeAttribute("EntryOperation", "raisedException");
		go.removeAttribute("EntryOperation", "entry");
		go.removeAttribute("EntryOperation", "configProperty");
		go.removeAttribute("EntryOperation", "usedModelType");
		go.removeAttribute("EntryOperation", "ownedComment");
		go.removeAttribute("EntryOperation", "ownedParameter");
		go.removeAttribute("EntryOperation", "result");
		go.removeAttribute("EntryOperation", "body");
		go.removeAttribute("EntryOperation", "ownedTag");
		go.removeAttribute("EntryOperation", "moduleImport");
		go.removeAttribute("EntryOperation", "ownedVariable");
		go.removeAttribute("EntryOperation", "uri");
		go.removeAttribute("EntryOperation", "isBlackbox");
		go.removeAttribute("EntryOperation", "overridden");
		go.removeAttribute("EntryOperation", "context");
		go.removeAttribute("EntryOperation", "ownedType");
		go.removeAttribute("EntryOperation", "nestedPackage");
		go.moveLine("EntryOperation", "entry_header", "EntryOperation", false);
		go.removeKeyword("EntryOperation");
		go.removeOptionality("EntryOperation", null);
		go.addSymbolWithoutQuoteToLine("EntryOperation", "entry_header", " (", false);
		go.addSymbolToLine("EntryOperation", "entry_header", ";", false);
		go.addSymbolWithoutQuoteToLine("EntryOperation", "entry_header", " |", false);
		go.removeBraces("EntryOperation");
		go.addSymbolToLine("EntryOperation", "expression_block", ";", false);
		go.addOptionalityToSymbol("EntryOperation", "expression_block", ";");
		go.addSymbolWithoutQuoteToLine("EntryOperation", "expression_block", ")", false);
		
		// optimize Library
		go.removeAttribute("Library", "name");
		go.removeAttribute("Library", "uri");
		go.removeAttribute("Library", "isBlackbox");
		go.removeAttribute("Library", "tag");
		go.removeAttribute("Library", "entry");
		go.removeAttribute("Library", "configProperty");
		go.removeAttribute("Library", "usedModelType");
		go.removeAttribute("Library", "ownedComment");
		go.removeAttribute("Library", "ownedType");
		go.removeAttribute("Library", "nestedPackage");
		go.removeAttribute("Library", "ownedTag");
		go.removeAttribute("Library", "moduleImport");
		go.removeAttribute("Library", "ownedVariable");
		go.moveLine("Library", "library_h", "Library", false);
		go.convert1toStarToStar("Library", "module_element");
		go.removeKeyword("Library");
		go.removeContainerBraces("Library");
		go.removeOptionality("Library", "module_element");
		go.addSymbolWithoutQuoteToLine("Library", "library_h", " (", false);
		go.addSymbolToLine("Library", "library_h", ";", false);
		go.addSymbolWithoutQuoteToLine("Library", "library_h", " |", false);
		go.addSymbolToLine("Library", "module_element", ";", false);
		go.addOptionalityToSymbol("Library", "module_element", ";");
		go.addSymbolWithoutQuoteToLine("Library", "module_element", ")", false);
		
		
		// optimize grammar rule ModelType
		go.removeAttribute("ModelType", "uri");
		go.removeAttribute("ModelType", "isBlackbox");
		go.removeAttribute("ModelType", "isAbstract");
		go.removeAttribute("ModelType", "conformanceKind");
		go.removeAttribute("ModelType", "tag");
		go.removeAttribute("ModelType", "entry");
		go.removeAttribute("ModelType", "configProperty");
		go.removeAttribute("ModelType", "usedModelType");
		go.removeAttribute("ModelType", "superClass");
		go.removeAttribute("ModelType", "metamodel");
		go.removeAttribute("ModelType", "ownedComment");
		go.removeAttribute("ModelType", "ownedType");
		go.removeAttribute("ModelType", "nestedPackage");
		go.removeAttribute("ModelType", "ownedTag");
		go.removeAttribute("ModelType", "moduleImport");
		go.removeAttribute("ModelType", "ownedVariable");
		go.removeAttribute("ModelType", "ownedAttribute");
		go.removeAttribute("ModelType", "ownedOperation");
		go.removeAttribute("ModelType", "additionalCondition");
		go.changeTypeOfAttr("ModelType", "compliance_kind", "EString", "STRING");
		go.removeBraces("ModelType");
		go.removeKeyword("ModelType", "name", "name", null);
		go.changeTypeOfAttr("ModelType", "name", "String0", "ID");
		go.removeOptionality("ModelType", "name");
		go.removeOptionality("ModelType", "packageref_list");
		go.removeKeyword("ModelType", "compliance_kind", "compliance_kind", null);
		go.removeKeyword("ModelType", "modeltype_where", "modeltype_where", null);
		go.renameKeyword("ModelType", "packageref_list", "packageref_list", "uses", null);
		go.addSymbolToRule("ModelType", ";");
		go.renameKeyword("ModelType", null, "ModelType", "modeltype", null);
		go.addKeywordToAttr("ModelType", "modeltype_where", "where", true);
		
		
		// optimize TagGO
		go.removeAttribute("TagGO", "isOrdered");
		go.removeAttribute("TagGO", "isUnique");
		go.removeAttribute("TagGO", "lower");
		go.removeAttribute("TagGO", "upper");
		go.removeAttribute("TagGO", "name");
		go.removeAttribute("TagGO", "isQuery");
		go.removeAttribute("TagGO", "type");
		go.removeAttribute("TagGO", "raisedException");
		go.removeAttribute("TagGO", "entry");
		go.removeAttribute("TagGO", "configProperty");
		go.removeAttribute("TagGO", "usedModelType");
		go.removeAttribute("TagGO", "ownedComment");
		go.removeAttribute("TagGO", "ownedParameter");
		go.removeAttribute("TagGO", "result");
		go.removeAttribute("TagGO", "body");
		go.removeAttribute("TagGO", "ownedTag");
		go.removeAttribute("TagGO", "moduleImport");
		go.removeAttribute("TagGO", "ownedVariable");
		go.removeAttribute("TagGO", "uri");
		go.removeAttribute("TagGO", "isBlackbox");
		go.removeAttribute("TagGO", "overridden");
		go.removeAttribute("TagGO", "context");
		go.removeAttribute("TagGO", "ownedType");
		go.removeAttribute("TagGO", "nestedPackage");
		go.removeAttribute("TagGO", "tag");
		go.removeBraces("TagGO");
		go.changeTypeOfAttr("TagGO", "tagid", "EString", "STRING");
		go.removeKeywordsOfAllAttrs("TagGO");
		go.addSymbolToAttr("TagGO", "tagvalue", "=", true, null, true, true);
		go.renameKeyword("TagGO", null, "TagGO", "tag", null);
		go.addSymbolToRule("TagGO", ";");
		
		// optimize MetaModelGO
		go.removeAttribute("MetaModelGO", "name");
		go.removeAttribute("MetaModelGO", "uri");
		go.removeAttribute("MetaModelGO", "isBlackbox");
		go.removeAttribute("MetaModelGO", "tag");
		go.removeAttribute("MetaModelGO", "entry");
		go.removeAttribute("MetaModelGO", "configProperty");
		go.removeAttribute("MetaModelGO", "usedModelType");
		go.removeAttribute("MetaModelGO", "ownedComment");
		go.removeAttribute("MetaModelGO", "ownedType");
		go.removeAttribute("MetaModelGO", "nestedPackage");
		go.removeAttribute("MetaModelGO", "ownedTag");
		go.removeAttribute("MetaModelGO", "moduleImport");
		go.removeAttribute("MetaModelGO", "ownedVariable");
		go.moveLine("MetaModelGO", "metamodel_h", "MetaModelGO", false);
		go.convert1toStarToStar("MetaModelGO", "metamodel_element");
		go.removeKeyword("MetaModelGO");
		go.removeContainerBraces("MetaModelGO");
		go.removeOptionality("MetaModelGO", "metamodel_element");
		go.addSymbolWithoutQuoteToLine("MetaModelGO", "metamodel_h", " (", false);
		go.addSymbolToLine("MetaModelGO", "metamodel_h", ";", false);
		go.addSymbolWithoutQuoteToLine("MetaModelGO", "metamodel_h", " |", false);
		go.addSymbolToLine("MetaModelGO", "metamodel_element", ";", false);
		go.addOptionalityToSymbol("MetaModelGO", "metamodel_element", ";");
		go.addSymbolWithoutQuoteToLine("MetaModelGO", "metamodel_element", ")", false);
		
		
		// optimize AccessDecl
		go.removeAttribute("AccessDecl", "isOrdered");
		go.removeAttribute("AccessDecl", "isUnique");
		go.removeAttribute("AccessDecl", "lower");
		go.removeAttribute("AccessDecl", "upper");
		go.removeAttribute("AccessDecl", "name");
		go.removeAttribute("AccessDecl", "isQuery");
		go.removeAttribute("AccessDecl", "type");
		go.removeAttribute("AccessDecl", "raisedException");
		go.removeAttribute("AccessDecl", "entry");
		go.removeAttribute("AccessDecl", "configProperty");
		go.removeAttribute("AccessDecl", "usedModelType");
		go.removeAttribute("AccessDecl", "ownedComment");
		go.removeAttribute("AccessDecl", "ownedParameter");
		go.removeAttribute("AccessDecl", "result");
		go.removeAttribute("AccessDecl", "body");
		go.removeAttribute("AccessDecl", "ownedTag");
		go.removeAttribute("AccessDecl", "moduleImport");
		go.removeAttribute("AccessDecl", "ownedVariable");
		go.removeAttribute("AccessDecl", "uri");
		go.removeAttribute("AccessDecl", "isBlackbox");
		go.removeAttribute("AccessDecl", "overridden");
		go.removeAttribute("AccessDecl", "context");
		go.removeAttribute("AccessDecl", "ownedType");
		go.removeAttribute("AccessDecl", "nestedPackage");
		go.removeAttribute("AccessDecl", "tag");
		go.removeBraces("AccessDecl");
		go.removeKeyword("AccessDecl");
		go.addSymbolToLine("AccessDecl", "access_usage", ";", false);
		
		
		// optimize TypeDef
		go.removeAttribute("TypeDef", "isOrdered");
		go.removeAttribute("TypeDef", "isUnique");
		go.removeAttribute("TypeDef", "lower");
		go.removeAttribute("TypeDef", "upper");
		go.removeAttribute("TypeDef", "isQuery");
		go.removeAttribute("TypeDef", "type");
		go.removeAttribute("TypeDef", "raisedException");
		go.removeAttribute("TypeDef", "entry");
		go.removeAttribute("TypeDef", "configProperty");
		go.removeAttribute("TypeDef", "usedModelType");
		go.removeAttribute("TypeDef", "ownedComment");
		go.removeAttribute("TypeDef", "ownedParameter");
		go.removeAttribute("TypeDef", "result");
		go.removeAttribute("TypeDef", "body");
		go.removeAttribute("TypeDef", "ownedTag");
		go.removeAttribute("TypeDef", "moduleImport");
		go.removeAttribute("TypeDef", "ownedVariable");
		go.removeAttribute("TypeDef", "uri");
		go.removeAttribute("TypeDef", "isBlackbox");
		go.removeAttribute("TypeDef", "overridden");
		go.removeAttribute("TypeDef", "context");
		go.removeAttribute("TypeDef", "ownedType");
		go.removeAttribute("TypeDef", "nestedPackage");
		go.removeAttribute("TypeDef", "tag");
		
		go.removeBraces("TypeDef");
		go.removeKeywordsOfAllAttrs("TypeDef");
		go.changeTypeOfAttr("TypeDef", "name", "String0", "ID");
		go.removeOptionality("TypeDef", "name");
		go.addSymbolToRule("TypeDef", ";");
		go.addSymbolToLine("TypeDef", "typespec", "=", true);
		go.renameKeyword("TypeDef", null, "TypeDef", "typedef", null);
		go.addSquareBracketToAttr("TypeDef", "typedef_condition");
		
		
		// optimize ClassifierGO
		go.removeAttribute("ClassifierGO", "isOrdered");
		go.removeAttribute("ClassifierGO", "isUnique");
		go.removeAttribute("ClassifierGO", "lower");
		go.removeAttribute("ClassifierGO", "upper");
		go.removeAttribute("ClassifierGO", "isQuery");
		go.removeAttribute("ClassifierGO", "type");
		go.removeAttribute("ClassifierGO", "raisedException");
		go.removeAttribute("ClassifierGO", "entry");
		go.removeAttribute("ClassifierGO", "configProperty");
		go.removeAttribute("ClassifierGO", "usedModelType");
		go.removeAttribute("ClassifierGO", "ownedComment");
		go.removeAttribute("ClassifierGO", "ownedParameter");
		go.removeAttribute("ClassifierGO", "result");
		go.removeAttribute("ClassifierGO", "body");
		go.removeAttribute("ClassifierGO", "ownedTag");
		go.removeAttribute("ClassifierGO", "moduleImport");
		go.removeAttribute("ClassifierGO", "ownedVariable");
		go.removeAttribute("ClassifierGO", "uri");
		go.removeAttribute("ClassifierGO", "isBlackbox");
		go.removeAttribute("ClassifierGO", "overridden");
		go.removeAttribute("ClassifierGO", "context");
		go.removeAttribute("ClassifierGO", "ownedType");
		go.removeAttribute("ClassifierGO", "nestedPackage");
		go.removeAttribute("ClassifierGO", "tag");
		go.removeAttribute("ClassifierGO", "name");
		go.moveLine("ClassifierGO", "classifier_h", "ClassifierGO", false);
		go.removeKeyword("ClassifierGO");
		go.removeContainerBraces("ClassifierGO");
		go.addSymbolWithoutQuoteToLine("ClassifierGO", "classifier_h", " (", false);
		go.addSymbolToLine("ClassifierGO", "classifier_h", ";", false);
		go.addSymbolWithoutQuoteToLine("ClassifierGO", "classifier_h", " |", false);
		go.addBracesToLine("ClassifierGO", "classifier_feature_list");
		
		go.addSymbolToLine("ClassifierGO", "classifier_feature_list", ";", false);
		go.addOptionalityToSymbol("ClassifierGO", "classifier_feature_list", ";");
		go.addSymbolWithoutQuoteToLine("ClassifierGO", "classifier_feature_list", ")", false);
		
		
		// optimize HelperHeader
		go.removeBraces("HelperHeader");
		go.removeKeyword("HelperHeader");
		
		
		// optimize ExpressionGO
		go.renameRule("ExpressionGO_Impl", "ExpressionGO");
		go.removeBraces("ExpressionGO");
		go.removeKeyword("ExpressionGO");
		go.removeOptionality("ExpressionGO", null);
		go.convert1toStarToStar("ExpressionGO", "dummyContent");
		
		// optimize ExpressionBlock
		go.removeKeyword("ExpressionBlock");
		
		
		// optimize HelperInfo
		go.convert1toStarToStar("HelperInfo", "qualifier");
		go.removeKeyword("HelperInfo");
		go.removeBraces("HelperInfo");
		go.removeOptionality("HelperInfo", null);
		
		
		// optimize ScopedIdentifier
		go.removeKeyword("ScopedIdentifier");
		go.removeBraces("ScopedIdentifier");
		go.removeOptionality("ScopedIdentifier", null);
		go.changeTypeOfAttr("ScopedIdentifier", "identifier", "EString", "ID");
		go.changeCommaToOtherSymbol("ScopedIdentifier", "identifier", "::");
		
		
		// optimize CompleteSignature
		go.removeKeyword("CompleteSignature");
		go.removeBraces("CompleteSignature");
		go.addSymbolToAttr("CompleteSignature", "param_list", ":", true, null, true, true);
		
		
		// optimize SimpleSignature
		go.removeKeyword("SimpleSignature");
		go.changeBracesToParentheses("SimpleSignature", null);
		
		
		// optimize ParamList
		go.removeKeyword("ParamList");
		go.removeBraces("ParamList");
		go.removeOptionality("ParamList", null);
		
		
		// optimize VarParameter
		go.renameRule("VarParameter_Impl", "VarParameter");
		go.removeKeyword("VarParameter");
		go.removeBraces("VarParameter");
		go.removeAttribute("VarParameter", "isOrdered");
		go.removeAttribute("VarParameter", "isUnique");
		go.removeAttribute("VarParameter", "lower");
		go.removeAttribute("VarParameter", "upper");
		go.removeAttribute("VarParameter", "name");
		go.removeAttribute("VarParameter", "tag");
		go.removeAttribute("VarParameter", "type");
		go.removeAttribute("VarParameter", "representedParameter");
		go.removeAttribute("VarParameter", "ownedComment");
		go.removeAttribute("VarParameter", "initExpression");
		go.removeAttribute("VarParameter", "dummyContent");
		
		// optimize Declarator
		go.removeKeyword("Declarator");
		go.removeBraces("Declarator");		
		go.removeOptionality("Declarator", "scoped_identifier");
		go.addSymbolToLine("Declarator", "scoped_identifier", ":", false);
		go.copyAttrAToAttrB("Declarator", "typespec", "scoped_identifier", false);
		go.copyAttrAToAttrB("Declarator", "init_part", "scoped_identifier", false);
		go.addSymbolWithoutQuoteToLine("Declarator", "init_part", "|", false);
		
		
		// optimize TypeSpec
		go.removeKeyword("TypeSpec");
		go.removeBraces("TypeSpec");
		go.addSymbolToAttr("TypeSpec", "extent_location", "@", true, null, true, true);
		go.moveLine("TypeSpec", "extent_location", "type_reference", false);
		go.changeTypeOfAttr("TypeSpec", "extent_location", "EString", "ID");
		
		
		// optimize InitPart
		go.removeKeyword("InitPart");
		go.removeBraces("InitPart");
		go.changeTypeOfAttr("InitPart", "init_op", "EString", "('=' | ':=' | '::=')");
		
		
		// optimize TypeReference
		go.removeKeyword("TypeReference");
		go.removeBraces("TypeReference");
		go.changeOptionalAttrToOrRelation("TypeReference", true, null, null);
		
		
		// optimize ComplexType
		go.removeKeyword("ComplexType");
		go.removeBraces("ComplexType");
		go.removeOptionality("ComplexType", null);
		go.addSymbolWithoutQuoteToLine("ComplexType", "complex_type_key", " |", false);
		go.addSymbolToLine("ComplexType", "collection_key", "(", false);
		go.copyXfromStarToY("ComplexType", "typespec", "collection_key", false);
		go.addSymbolToLine("ComplexType", "collection_key", ")", false);
		go.convert1toStarToTwo("ComplexType", "typespec");
		go.addSymbolToLine("ComplexType", "typespec", "(", true);
		go.addSymbolToLine("ComplexType", "typespec", ")", false);
		go.addKeywordToLine("ComplexType", "typespec", "Dict", true);
		go.addSymbolWithoutQuoteToLine("ComplexType", "collection_key", " |", false);
		go.addSymbolWithoutQuoteToLine("ComplexType", "typespec", " |", false);
		go.addParenthesesToAttr("ComplexType", "declarator_list");
		go.addKeywordToLine("ComplexType", "declarator_list", "Tuple", true);
		
		
		// optimize DeclaratorList
		go.removeKeyword("DeclaratorList");
		go.removeBraces("DeclaratorList");
		go.removeOptionality("DeclaratorList", null);
		
		
		// optimize ExpressionList
		go.removeKeyword("ExpressionList");
		go.removeBraces("ExpressionList");
		go.addSymbolToLine("ExpressionList", "expression_semi_list", ";", false);
		go.addOptionalityToSymbol("ExpressionList", "expression_semi_list", ";");
		
		
		// optimize DeclaratorList
		go.removeKeyword("ExpressionSemiList");
		go.removeBraces("ExpressionSemiList");
		go.removeOptionality("ExpressionSemiList", null);
		
		// optimize TransformationHeader
		go.removeBraces("TransformationHeader");
		go.removeKeywordsOfAllAttrs("TransformationHeader");
		go.convert1toStarToStar("TransformationHeader", "qualifier");
		go.removeOptionality("TransformationHeader", "qualifier");
		go.moveLine("TransformationHeader", "qualifier", "TransformationHeader", true);
		go.renameKeyword("TransformationHeader", null, "TransformationHeader", "transformation", null);
		go.changeTypeOfAttr("TransformationHeader", "name", "EString", "ID");
		
		
		// optimize TransformationUsageRefine
		go.removeKeyword("TransformationUsageRefine");
		go.removeBraces("TransformationUsageRefine");
		go.addKeywordToLine("TransformationUsageRefine", "transformation_refine", "refines", true);
		go.changeOptionalAttrToOrRelation("TransformationUsageRefine", true, null, null);
		
		
		// optimize ModuleUsageGO
		go.removeKeyword("ModuleUsageGO");
		go.removeBraces("ModuleUsageGO");
		go.changeOptionalAttrToOrRelation("ModuleUsageGO", true, null, null);				
		
		
		// optimize ModuleRefGO
		go.removeKeyword("ModuleRefGO");
		go.removeBraces("ModuleRefGO");
		
		
		// optimize AccessUsage
		go.removeBraces("AccessUsage");
		go.removeKeywordsOfAllAttrs("AccessUsage");
		go.renameKeyword("AccessUsage", null, "AccessUsage", "access", null);
		go.removeOptionality("AccessUsage", "moduleref_list");
		
		
		// optimize ExtendsUsage
		go.removeBraces("ExtendsUsage");
		go.removeKeywordsOfAllAttrs("ExtendsUsage");
		go.renameKeyword("ExtendsUsage", null, "ExtendsUsage", "extends", null);
		go.removeOptionality("ExtendsUsage", "moduleref_list");
		
		
		// optimize MappingFullHeader
		go.removeBraces("MappingFullHeader");
		go.removeKeyword("MappingFullHeader", null, "MappingFullHeader", null);
		go.removeKeyword("MappingFullHeader", "mapping_header", "mapping_header", null);
		
		
		// optimize MappingBody
		go.removeAttribute("MappingBody", "tag");
		go.removeAttribute("MappingBody", "ownedComment");
		go.removeAttribute("MappingBody", "content");
		go.removeAttribute("MappingBody", "variable");
		go.removeBraces("MappingBody");
		go.removeKeyword("MappingBody");
//		go.convert1toStarTo1("MappingBody", "initSection");
//		go.convert1toStarTo1("MappingBody", "endSection");
		go.moveLine("MappingBody", "endSection", "population_section", false);		
		go.removeOptionality("MappingBody", "initSection");
		go.addSymbolToLine("MappingBody", "initSection", ";", false);
		go.addOptionalityToSymbol("MappingBody", "initSection", ";");
		go.addOptionalityToLine("MappingBody", "initSection");
		go.addBracesToLine("MappingBody", "initSection");
		go.addKeywordToLine("MappingBody", "initSection", "init", true);
		go.addOptionalityToLine("MappingBody", "initSection");
		go.changeCommaToOtherSymbol("MappingBody", "initSection", ";");
		
		go.removeOptionality("MappingBody", "endSection");
		go.addSymbolToLine("MappingBody", "endSection", ";", false);
		go.addOptionalityToSymbol("MappingBody", "endSection", ";");
		go.addOptionalityToLine("MappingBody", "endSection");
		go.addBracesToLine("MappingBody", "endSection");
		go.addKeywordToLine("MappingBody", "endSection", "end", true);
		go.addOptionalityToLine("MappingBody", "endSection");
		go.changeCommaToOtherSymbol("MappingBody", "endSection", ";");
		
		// optimize MappingHeader
		go.removeBraces("MappingHeader");
		go.removeKeywordsOfAllAttrs("MappingHeader");
		go.convert1toStarToStar("MappingHeader", null);
		go.removeOptionality("MappingHeader", null);
		go.moveLine("MappingHeader", "qualifier", "MappingHeader", true);
		go.addOptionalityToAttr("MappingHeader", "param_direction");
		go.renameKeyword("MappingHeader", null, "MappingHeader", "mapping", null);
		
		
		// optimize MappingExtra
		go.removeKeyword("MappingExtra");
		go.removeBraces("MappingExtra");
		go.changeOptionalAttrToOrRelation("MappingExtra", true, null, null);
		
		
		// optimize MappingExtension
		go.removeKeyword("MappingExtension");
		go.removeBraces("MappingExtension");
		
		
		// optimize MappingRefinement
		go.removeBraces("MappingRefinement");
		go.renameKeyword("MappingRefinement", null, "scoped_identifier", "refines", null);
		go.removeKeyword("MappingRefinement", null, "MappingRefinement", null);
		
		
		// optimize ScopedIdentifierList
		go.removeKeyword("ScopedIdentifierList");
		go.removeBraces("ScopedIdentifierList");
		go.removeOptionality("ScopedIdentifierList", null);
		
		
		// optimize PopulationSection
		go.removeKeyword("PopulationSection");
		go.removeBraces("PopulationSection");
		go.changeOptionalAttrToOrRelation("PopulationSection", true, null, null);
		go.addKeywordToLine("PopulationSection", "expression_block", "population", true);
		
		
		// optimize ConstructorHeader
		go.removeBraces("ConstructorHeader");
		go.moveLine("ConstructorHeader", "qualifier", "ConstructorHeader", true);
		go.removeKeywordsOfAllAttrs("ConstructorHeader");
		go.removeOptionality("ConstructorHeader", null);
		go.convert1toStarToStar("ConstructorHeader", "qualifier");
		go.renameKeyword("ConstructorHeader", null, "ConstructorHeader", "constructor", null);
		
		
		// optimize EntryHeader
		go.removeBraces("EntryHeader");
		go.removeKeyword("EntryHeader", null, "EntryHeader", null);
		go.renameKeyword("EntryHeader", null, "simple_signature", "main", null);
		
		
		// optimize LibraryHeader
		go.removeBraces("LibraryHeader");
		go.removeKeywordsOfAllAttrs("LibraryHeader");
		go.renameKeyword("LibraryHeader", null, "LibraryHeader", "library", null);
		go.changeTypeOfAttr("LibraryHeader", "name", "EString", "ID");
		
		
		// optimize PackageRefGO
		go.removeKeyword("PackageRefGO");
		go.removeBraces("PackageRefGO");
		go.moveLine("PackageRefGO", "uri", "scoped_identifier", false);
		go.changeTypeOfAttr("PackageRefGO", "uri", "EString", "STRING");
		go.changeAToOptionalAorA("PackageRefGO", "uri");
		go.removeOptionality("PackageRefGO", "scoped_identifier");
		go.addSymbolWithoutQuoteToLine("PackageRefGO", "scoped_identifier", "(", true);
		go.addSymbolWithoutQuoteToLine("PackageRefGO", "uri", ")", false);
		
		
		// optimize MetaModelHeader
		go.removeBraces("MetaModelHeader");
		go.removeKeywordsOfAllAttrs("MetaModelHeader");
		go.renameKeyword("MetaModelHeader", null, "MetaModelHeader", "metamodel", null);
		go.addParenthesesWithoutQuotes("MetaModelHeader", ScopeKey.SINGLEKEWORD, "metamodel", null, MultiplicityKey.PACKAGE_ONLY);
		go.addAlternativeKeyword("MetaModelHeader", null, "metamodel", "package");
		
		
		// optimize MetaModelElement
		go.removeKeyword("MetaModelElement");
		go.removeBraces("MetaModelElement");
		go.changeOptionalAttrToOrRelation("MetaModelElement", true, null, null);
		
		
		// optimize EnumerationGO
		go.moveLine("EnumerationGO", "enumeration_h", "EnumerationGO", false);
		go.removeKeyword("EnumerationGO");
		go.removeOptionality("EnumerationGO", "enumeration_h");
		go.removeContainerBraces("EnumerationGO");
		go.removeOptionality("EnumerationGO", "identifier");
		go.addSymbolWithoutQuoteToLine("EnumerationGO", "enumeration_h", " (", false);
		go.addSymbolToLine("EnumerationGO", "enumeration_h", ";", false);
		go.addSymbolWithoutQuoteToLine("EnumerationGO", "enumeration_h", " |", false);
		go.addSymbolToLine("EnumerationGO", "identifier", ";", false);
		go.addOptionalityToSymbol("EnumerationGO", "identifier", ";");
		go.addSymbolWithoutQuoteToLine("EnumerationGO", "identifier", ")", false);
		
		
		// optimize EnumerationHeader
		go.removeBraces("EnumerationHeader");
		go.removeKeywordsOfAllAttrs("EnumerationHeader");
		go.renameKeyword("EnumerationHeader", null, "EnumerationHeader", "enum", null);
		go.changeTypeOfAttr("EnumerationHeader", "identifier", "EString", "ID");
		
		
		// optimize ClassifierHeader
		go.removeKeyword("ClassifierHeader");
		go.removeBraces("ClassifierHeader");
		
		
		// optimize ClassifierFeatureList
		go.removeKeyword("ClassifierFeatureList");
		go.removeBraces("ClassifierFeatureList");
		go.removeOptionality("ClassifierFeatureList", null);
		go.addSymbolToLine("ClassifierFeatureList", "classifier_feature", ";", false);
		go.addOptionalityToSymbol("ClassifierFeatureList", "classifier_feature", ";");
		go.changeCommaToOtherSymbol("ClassifierFeatureList", "classifier_feature", ";");
		
		
		// optimize ClassifierInfo
		go.removeBraces("ClassifierInfo");
		go.removeKeywordsOfAllAttrs("ClassifierInfo");
		go.convert1toStarToStar("ClassifierInfo", null);
		go.removeOptionality("ClassifierInfo", null);
		go.addKeywordToLine("ClassifierInfo", "qualifier", "class", false);
		//go.addOptionalityToKeyword("ClassifierInfo", null, "ClassifierInfo");
		go.renameKeyword("ClassifierInfo", null, "ClassifierInfo", "datatype", null);
		go.addAlternativeKeyword("ClassifierInfo", null, "datatype", "primitive");
		go.addAlternativeKeyword("ClassifierInfo", null, "primitive", "exception");
		go.addAlternativeKeyword("ClassifierInfo", null, "exception", "intermediate");
		go.addOptionalityToKeyword("ClassifierInfo", null, "intermediate");
		
		
		// optimize ClassifierExtension
		go.removeBraces("ClassifierExtension");
		go.removeKeyword("ClassifierExtension", null, "ClassifierExtension", null);
		go.renameKeyword("ClassifierExtension", "scoped_identifier_list", "scoped_identifier_list", "extends", null);
		
		
		// optimize ClassifierFeature
		go.removeKeyword("ClassifierFeature");
		go.removeBraces("ClassifierFeature");
		go.removeOptionality("ClassifierFeature", "tag");
		go.removeOptionality("ClassifierFeature", "complete_signature");
		go.addSymbolWithoutQuoteToLine("ClassifierFeature", "feature_qualifier", "(", true);
		go.addSymbolWithoutQuoteToLine("ClassifierFeature", "multiplicity", "(", true);
		go.addSymbolWithoutQuoteToLine("ClassifierFeature", "opposite_property", "|", false);
		go.addSymbolWithoutQuoteToLine("ClassifierFeature", "complete_signature", "))", false);
		go.addSymbolWithoutQuoteToLine("ClassifierFeature", "complete_signature", "|", false);
		
		
		// optimize FeatureQualifier
		go.removeKeyword("FeatureQualifier");
		go.removeBraces("FeatureQualifier");
		go.moveLine("FeatureQualifier", "feature_key", "stereotype_qualifier", false);
		go.convert1toStarToStar("FeatureQualifier", "feature_key");
		go.removeOptionality("FeatureQualifier", "feature_key");
		
		
		// optimize Multiplicity
		go.removeKeyword("Multiplicity");
		go.changeBracesToSquare("Multiplicity", null);
		go.changeTypeOfAttr("Multiplicity", "multiplicity_range", "EString", "MULTIPLICITYRANGE");
		
		
		// optimize OppositeProperty
		go.removeBraces("OppositeProperty");
		go.removeKeywordsOfAllAttrs("OppositeProperty");
		go.changeTypeOfAttr("OppositeProperty", "name", "EString", "ID");
		go.addSymbolToLine("OppositeProperty", "name", "~", true);
		go.addOptionalityToSymbol("OppositeProperty", "name", "~");
		go.renameKeyword("OppositeProperty", null, "OppositeProperty", "opposites", null);
		
		
		// optimize StereotypeQualifier
		go.removeKeyword("StereotypeQualifier");
		go.removeBraces("StereotypeQualifier");
		go.changeTypeOfAttr("StereotypeQualifier", "identifier", "EString", "ID");
		go.removeOptionality("StereotypeQualifier", "identifier");
		go.addSymbolToLine("StereotypeQualifier", "identifier", "<<", true);
		go.addSymbolToLine("StereotypeQualifier", "identifier", ">>", false);
		
		
		// optimize UnitRefGO
		go.removeKeyword("UnitRefGO");
		go.removeBraces("UnitRefGO");
		go.changeTypeOfAttr("UnitRefGO", "identifier", "EString", "ID");
		go.removeOptionality("UnitRefGO", "identifier");
		go.changeCommaToOtherSymbol("UnitRefGO", "identifier", ".");
		
		
		// add terminal MULTIPLICITYRANGE
		go.addTerminalRule("MULTIPLICITYRANGE", "INT | '*' | INT '...' INT | INT '...' '*';", null);
		
		
		String actualOutput = go.spliceGrammar();
		//FileHelper.setFileText("Test_QVToV12.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_QVToV12.txt", false);

		// compare text
		//Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
