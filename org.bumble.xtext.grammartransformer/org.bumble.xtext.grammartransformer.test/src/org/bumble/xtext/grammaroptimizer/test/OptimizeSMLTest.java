package org.bumble.xtext.grammaroptimizer.test;

import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.bumble.xtext.grammartransformer.GrammarTransformer;
import org.junit.Assert;
import org.junit.Test;

public class OptimizeSMLTest {
	@Test
	public void testOptimizeSML() {
		GrammarTransformer go = new GrammarTransformer();
		
		// read text from file
		String input = FileHelper.getFileText("SML.txt", true);
		
		// Remove tab symbols
		input = input.replaceAll("\t", "    ");

		go.processGrammar(input);
		
		go.removeRule("ETypedElement");
		go.removeRule("EClassifier");
		go.removeRule("EStructuralFeature");
		go.removeRule("ExpressionOrRegion");
		go.removeRule("Expression");
		go.removeRule("Value");
		go.removeRule("Variable");
		go.removeRule("VariableDeclaration");
		go.removeRule("Clock");
		go.removeRule("Message");
		go.removeRule("VariableExpression");
		go.removeRule("EString");
		go.removeRule("Import");
		go.removeRule("EPackage");
		go.removeRule("EClass");
		go.removeRule("EAnnotation");
		go.removeRule("EStringToStringMapEntry");
		go.removeRule("EObject");
		go.removeRule("ETypeParameter");
		go.removeRule("EDataType_Impl");
		go.removeRule("EEnum");
		go.removeRule("EGenericType");
		go.removeRule("EBoolean");
		go.removeRule("EEnumLiteral");
		go.removeRule("EInt");
		go.removeRule("EOperation");
		go.removeRule("EParameter");
		go.removeRule("EAttribute");
		go.removeRule("EReference");
		go.removeRule("EDouble");
		
		go.removeRule("FeatureAccess");
		go.removeRule("CollectionAccess");
		go.removeRule("IntegerValue");
		go.removeRule("BooleanValue");
		go.removeRule("StringValue");
		go.removeRule("EnumValue");
		go.removeRule("NullValue");
		go.removeRule("VariableValue");
		go.removeRule("SubFeatureAccess");
		go.removeRule("StructuralFeatureValue");
		go.removeRule("OperationValue");
		go.removeRule("VariableDeclaration_Impl");
		go.removeRule("TypedVariableDeclaration");
		go.removeRule("CollectionOperation");
		go.removeRule("UnaryOperationExpression");
		go.removeRule("ObjectQueryBindingExpression");
		
		go.removeRule("BinaryOperationExpression");
		go.removeRule("VariableAssignment");
		go.removeRule("ClockDeclaration");
		go.removeRule("TimedExpression");
		go.removeRule("ClockAssignment");
		go.removeRule("ClockExpression");
		go.removeRule("Clock_Impl");
		go.removeRule("ObjectQueryValue");
		go.removeRule("ExpressionRegion");
		go.removeRule("ClockFragment");
		
		// optimize the grammar rule Specification
		go.moveLine("Specification", "imports", "Specification", true);
		go.removeKeyword("Specification", "imports", "imports", null);
		go.removeOptionality("Specification", "imports");
		go.removeBraces("Specification", "imports", null);
		go.convert1toStarToStar("Specification", "imports");
		go.keywordUpperToLowerCase("Specification", null, "Specification");
		
		go.changeTypeOfAttr("Specification", "name", "EString", "ID");
		go.removeOptionality("Specification", "domains");
		go.removeParenthesesInSpecifiedAttr("Specification", "domains");
		go.convert1toStarTo1("Specification", "domains");
		go.renameKeyword("Specification", "domains", "domains", "domain", null);
		go.addParenthesesWithoutQuotes("Specification", ScopeKey.SINGLELINE, null, "domains", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.changeTypeOfAttr("Specification", "domains", "EString", "FQN");
		go.addSymbolWithoutQuoteToLine("Specification", "domains", "->", true);
		
		go.removeOptionality("Specification", "contexts");
		go.removeParenthesesInSpecifiedAttr("Specification", "contexts");
		go.convert1toStarTo1("Specification", "contexts");
		go.addParenthesesWithoutQuotes("Specification", ScopeKey.SINGLELINE, null, "contexts", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.changeTypeOfAttr("Specification", "contexts", "EString", "FQN");
		
		go.convert1toStarToStar("Specification", "controllableEClasses");
		
		// I will change the following lines later
		go.removeParenthesesInSpecifiedAttr("Specification", "controllableEClasses");
		go.removeOptionality("Specification", "controllableEClasses");
		go.removeKeyword("Specification", "controllableEClasses", "controllableeclasses", null);
		go.addBracesToLine("Specification", "controllableEClasses");
		go.addKeywordToLine("Specification", "controllableEClasses", "controllable", true);
		go.addOptionalityToLine("Specification", "controllableEClasses");
		go.removeCertainTypeFromAttr("Specification", "controllableEClasses", "EString");
		// I will change the above lines later
		
		go.moveLine("Specification", "channelOptions", "nonSpontaneousOperations", true);
		go.removeOptionality("Specification", "channelOptions");
		go.removeKeyword("Specification", "channelOptions", "channeloptions", null);
		go.changeTypeOfAttr("Specification", "nonSpontaneousOperations", "EString", "FQN");
		go.removeComma("Specification", "nonSpontaneousOperations", null);
		// I will change the following lines later
		go.removeKeyword("Specification", "nonSpontaneousOperations", "nonspontaneousoperations", null);
		go.removeOptionality("Specification", "nonSpontaneousOperations");
		go.removeParenthesesInSpecifiedAttr("Specification", "nonSpontaneousOperations");
		go.addOptionalityToLine("Specification", "nonSpontaneousOperations");
		go.addBracesToLine("Specification", "nonSpontaneousOperations");
		go.addKeywordToLine("Specification", "nonSpontaneousOperations", "non-spontaneous events", true);
		go.addOptionalityToLine("Specification", "nonSpontaneousOperations");
		// I will change the above lines later
		go.moveLine("Specification", "eventParameterRanges", "includedCollaborations", true);
		// I will change the following lines later
		go.removeKeyword("Specification", "eventParameterRanges", "eventparameterranges", null);
		go.removeOptionality("Specification", "eventParameterRanges");
		go.removeBraces("Specification", "eventParameterRanges", null);
		go.addOptionalityToLine("Specification", "eventParameterRanges");
		go.addBracesToLine("Specification", "eventParameterRanges");
		go.addKeywordToLine("Specification", "eventParameterRanges", "parameter ranges", true);
		go.addOptionalityToLine("Specification", "eventParameterRanges");
		// I will change the above lines later
		go.moveLine("Specification", "includedCollaborations", "containedCollaborations", false);
		go.removeKeyword("Specification", "containedCollaborations", "containedcollaborations", null);
		go.convert1toStarTo1("Specification", "containedCollaborations");
		go.removeOptionality("Specification", "containedCollaborations");
		go.removeBraces("Specification", "containedCollaborations", null);
		go.changeTypeOfAttr("Specification", "containedCollaborations", "Collaboration", "NestedCollaboration");
		
		go.removeKeyword("Specification", "includedCollaborations", "includedcollaborations", null);
		go.convert1toStarTo1("Specification", "includedCollaborations");
		go.removeOptionality("Specification", "includedCollaborations");
		go.removeBraces("Specification", "includedCollaborations", null);
		go.removeParenthesesInSpecifiedAttr("Specification", "includedCollaborations");
		go.removeCertainTypeFromAttr("Specification", "includedCollaborations", "EString");
		go.addKeywordToLine("Specification", "includedCollaborations", "include collaboration", true);
		go.addParenthesesWithoutQuotes("Specification", ScopeKey.SINGLELINE, null, "includedCollaborations", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("Specification", false, "containedCollaborations", "includedCollaborations");
		go.packageAttributes("Specification", "containedCollaborations", "includedCollaborations", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		// optimize BindingExpression
		go.removeRuleCall("BindingExpression", "ObjectQueryBindingExpression");
		go.removeRuleCall("BindingExpression", "ParameterExpression_Impl");
		go.removeRuleCall("BindingExpression", "WildcardParameterExpression");
		go.removeRuleCall("BindingExpression", "ValueParameterExpression");
		go.removeRuleCall("BindingExpression", "VariableBindingParameterExpression");
		
		// optimize InteractionFragment
		go.removeRuleCall("InteractionFragment", "WaitCondition");
		go.removeRuleCall("InteractionFragment", "InterruptCondition");
		go.removeRuleCall("InteractionFragment", "ViolationCondition");
		go.removeRuleCall("InteractionFragment", "Condition");
		go.removeRuleCall("InteractionFragment", "TimedViolationCondition");
		go.removeRuleCall("InteractionFragment", "TimedInterruptCondition");
		go.removeRuleCall("InteractionFragment", "TimedWaitCondition");
		go.removeRuleCall("InteractionFragment", "ClockFragment");
		go.addAlternativeSubClassToAbstractClass("InteractionFragment", "ConditionFragment");
		go.addAlternativeSubClassToAbstractClass("InteractionFragment", "TimedConditionFragment");
		
		// optimize AbstractRanges
		go.addParenthesesWithoutQuoteToRule("AbstractRanges", MultiplicityKey.PACKAGE_ONLY);
		go.addBracesToRule("AbstractRanges");
		go.changeBracesToSquare("AbstractRanges", null);
		
		// optimize Collaboration
		go.removeBracesExceptContainer("Collaboration");
		go.removeAction("Collaboration");
		go.moveLine("Collaboration", "contexts", "Collaboration", true);
		go.moveLine("Collaboration", "domains", "contexts", true);
		go.moveLine("Collaboration", "imports", "domains", true);
		go.removeOptionality("Collaboration", null);
		go.removeKeywordsOfAllAttrs("Collaboration");
		go.keywordUpperToLowerCase("Collaboration", null, "Collaboration");
		go.removeParenthesesInSpecifiedAttr("Collaboration", "domains");
		go.removeParenthesesInSpecifiedAttr("Collaboration", "contexts");
		go.convert1toStarToStar("Collaboration", "imports");
		go.convert1toStarToStar("Collaboration", "roles");
		go.convert1toStarToStar("Collaboration", "scenarios");
		go.convert1toStarTo1("Collaboration", "domains");
		go.convert1toStarTo1("Collaboration", "contexts");
		go.addKeywordToLine("Collaboration", "domains", "domain", true);
		go.addKeywordToLine("Collaboration", "contexts", "contexts", true);
		go.addParenthesesWithoutQuotes("Collaboration", ScopeKey.SINGLELINE, null, "domains", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.addParenthesesWithoutQuotes("Collaboration", ScopeKey.SINGLELINE, null, "contexts", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		go.changeTypeOfAttr("Collaboration", "domains", "EString", "FQN");
		go.changeTypeOfAttr("Collaboration", "contexts", "EString", "FQN");
		go.changeTypeOfAttr("Collaboration", "name", "EString", "ID");
		
		// optimize EventParameterRanges
		go.removeAction("EventParameterRanges");
		go.removeBraces("EventParameterRanges");
		go.removeKeyword("EventParameterRanges");
		go.removeOptionality("EventParameterRanges", null);
		go.addBracesToLine("EventParameterRanges", "rangesForParameter");
		go.changeBracesToParentheses("EventParameterRanges", "rangesForParameter");
		go.changeTypeOfAttr("EventParameterRanges", "event", "EString", "FQN");
		
		// optimize ChannelOptions
		go.moveLine("ChannelOptions", "allMessagesRequireLinks", "messageChannels", true);
		go.removeBracesExceptContainer("ChannelOptions");		
		go.removeKeyword("ChannelOptions", "messageChannels", "messageChannels", null);
		go.removeOptionality("ChannelOptions", "messageChannels");
		go.convert1toStarToStar("ChannelOptions", "messageChannels");
		go.renameKeyword("ChannelOptions", null, "ChannelOptions", "channels", null);
		go.addParenthesesWithoutQuoteToRule("ChannelOptions", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		// optimize Role
		go.removeAction("Role");
		go.removeBraces("Role");
		go.moveLine("Role", "type", "name", true);
		go.changeOptionalAttrToOrRelation("Role", false, "static", "multiRole");
		go.renameKeyword("Role", "multiRole", "multiRole", "multi", null);
		go.addOptionalityToLine("Role", "multiRole");
		go.addKeywordToLine("Role", "multiRole", "dynamic", true);
		go.packageAttributes("Role", "static", "multiRole", MultiplicityKey.PACKAGE_ONLY);
		go.removeCertainTypeFromAttr("Role", "type", "EString");
		go.changeTypeOfAttr("Role", "type", "EClassifier", "EClass");
		go.removeKeyword("Role", "type", "type", null);
		go.changeTypeOfAttr("Role", "name", "EString", "ID");
		go.removeOptionality("Role", "type");
		go.renameKeyword("Role", "null", "Role", "role", null);
		
		// optimize Scenario
		go.removeContainerBraces("Scenario");
		go.moveLine("Scenario", "optimizeCost", "name", false);
		go.moveLine("Scenario", "kind", "singular", false);
		go.removeKeyword("Scenario", "kind", "kind", null);
		go.removeKeyword("Scenario", "ownedInteraction", "ownedInteraction", null);
		go.keywordUpperToLowerCase("Scenario", null, "Scenario");
		go.changeTypeOfAttr("Scenario", "name", "EString", "ID");
		go.changeTypeOfAttr("Scenario", "cost", "EDouble", "DOUBLE");
		go.removeCertainTypeFromAttr("Scenario", "contexts", "EString");
		go.convert1toStarToStar("Scenario", "roleBindings");
		go.removeOptionality("Scenario", "kind");
		go.removeOptionality("Scenario", "ownedInteraction");
		go.renameKeyword("Scenario", "optimizeCost", "optimizecost", "optimize", null);
		go.addKeywordToAttr("Scenario", "optimizeCost", "cost", false);
		go.removeKeyword("Scenario", "cost", "cost", null);
		go.addSquareBracketToAttr("Scenario", "cost");
		go.addKeywordToLine("Scenario", "cost", "cost", true);
		go.addParenthesesWithoutQuotes("Scenario", ScopeKey.SINGLELINE, null, "cost", MultiplicityKey.PACKAGE_ONLY);
		go.addParenthesesWithoutQuotes("Scenario", ScopeKey.SINGLELINE, null, "optimizeCost", MultiplicityKey.PACKAGE_ONLY);
		go.changeOptionalAttrToOrRelation("Scenario", false, "optimizeCost", "cost");
		go.packageAttributes("Scenario", "optimizeCost", "cost", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		go.removeParenthesesInSpecifiedAttr("Scenario", "contexts");
		go.changeBracesToSquare("Scenario", "roleBindings");
		go.renameKeyword("Scenario", "contexts", "contexts", "context", null);
		go.renameKeyword("Scenario", "roleBindings", "rolebindings", "bindings", null);
		
		// optimize RoleBindingConstraint
		go.removeAction("RoleBindingConstraint");
		go.removeBraces("RoleBindingConstraint");
		go.removeKeyword("RoleBindingConstraint");
		go.removeOptionality("RoleBindingConstraint", null);
		go.removeCertainTypeFromAttr("RoleBindingConstraint", "role", "EString");
		go.addSymbolToAttr("RoleBindingConstraint", "role", "=", false, null, true, true);
		
		
		// optimize Interaction
		go.removeBraces("Interaction");
		go.removeKeyword("Interaction");
		go.removeAttribute("Interaction", "expressions");
		go.convert1toStarToStar("Interaction", "fragments");
		go.removeOptionality("Interaction", "fragments");
		go.addBracesToLine("Interaction", "fragments");
		
		
		// optimize FeatureAccessBindingExpression
		go.removeBraces("FeatureAccessBindingExpression");
		go.removeKeyword("FeatureAccessBindingExpression");
		go.removeOptionality("FeatureAccessBindingExpression", "featureaccess");
		go.removeAction("FeatureAccessBindingExpression");
		
		// optimize ParameterExpression_Impl
		go.renameRule("ParameterExpression_Impl", "ParameterExpression");
		go.removeKeyword("ParameterExpression", null, "ParameterExpression", null);
		go.addAlternativeSubClassToAbstractClass("ParameterExpression", "WildcardParameterExpression");
		go.addAlternativeSubClassToAbstractClass("ParameterExpression", "ValueParameterExpression");
		go.addAlternativeSubClassToAbstractClass("ParameterExpression", "VariableBindingParameterExpression");
		go.removeAction("ParameterExpression");
		
		
		// optimize WildcardParameterExpression
		go.renameKeyword("WildcardParameterExpression", null, "WildcardParameterExpression", "*", null);
		go.removeAction("WildcardParameterExpression");
		
		
		// optimize ValueParameterExpression
		go.removeBraces("ValueParameterExpression");
		go.removeKeyword("ValueParameterExpression");
		go.removeAction("ValueParameterExpression");
		go.removeOptionality("ValueParameterExpression", "value");
		
		
		// optimize VariableBindingParameterExpression
		go.removeBraces("VariableBindingParameterExpression");
		go.removeKeywordsOfAllAttrs("VariableBindingParameterExpression");
		go.removeOptionality("VariableBindingParameterExpression", "variable");
		go.renameKeyword("VariableBindingParameterExpression", null, "VariableBindingParameterExpression", "bind", null);
		go.removeAction("VariableBindingParameterExpression");
		
		// optimize ConstraintBlock
		go.renameKeyword("ConstraintBlock", null, "ConstraintBlock", "constraints", null);
		go.removeBracesExceptContainer("ConstraintBlock");
		go.moveLine("ConstraintBlock", "interrupt", "forbidden", false);
		go.changeBracesToSquare("ConstraintBlock", null);
		go.convert1toStarTo1("ConstraintBlock", null);
		go.changeTypeOfAttr("ConstraintBlock", null, "Message", "ConstraintMessage");
		go.changeOptionalAttrToOrRelation("ConstraintBlock", true, null, null);
		go.packageAttributes("ConstraintBlock", "consider", "interrupt", MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE);
		
		
		// optimize ModalMessage
		go.removeAction("ModalMessage");
		go.removeContainerBraces("ModalMessage");
		go.moveLine("ModalMessage", "expectationKind", "monitored", false);
		go.moveLine("ModalMessage", "sender", "expectationKind", false);
		go.removeKeyword("ModalMessage", "expectationKind", "expectationKind", null);
		go.removeOptionality("ModalMessage", "expectationKind");
		go.packageAttributes("ModalMessage", "monitored", "expectationKind", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		go.removeCertainTypeFromAttr("ModalMessage", "sender", "EString");
		go.removeKeyword("ModalMessage", "sender", "sender", null);
		go.removeOptionality("ModalMessage", "sender");
		go.renameKeyword("ModalMessage", null, "ModalMessage", "->", null);
		go.moveLine("ModalMessage", "collectionModification", "modelElement", false);
		go.removeCertainTypeFromAttr("ModalMessage", "receiver", "EString");
		go.removeKeyword("ModalMessage", "receiver", "receiver", null);
		go.removeOptionality("ModalMessage", "receiver");
		go.addSymbolToLine("ModalMessage", "receiver", ".", false);
		go.removeKeyword("ModalMessage", "modelElement", "modelElement", null);
		go.removeCertainTypeFromAttr("ModalMessage", "modelElement", "EString");
		go.removeOptionality("ModalMessage", "modelElement");
		go.changeTypeOfAttr("ModalMessage", "collectionModification", "CollectionOperation", "CollectionModification");
		go.renameKeyword("ModalMessage", "collectionModification", "collectionModification", ".", null);
		go.removeKeyword("ModalMessage", "parameters", "parameters", null);
		go.removeBraces("ModalMessage", "parameters", null);
		go.addBracesToLine("ModalMessage", "parameters");
		go.changeBracesToParentheses("ModalMessage", "parameters");
		go.addParenthesesWithoutQuotes("ModalMessage", ScopeKey.SINGLELINE, null, "parameters", MultiplicityKey.MULTIPLICITY_OPTIONAL);
		
		
		// optimize Alternative
		go.removeBraces("Alternative");
		go.removeKeywordsOfAllAttrs("Alternative");
		go.removeOptionality("Alternative", "cases");
		go.changeCommaToOtherSymbol("Alternative", "cases", "or");
		
		
		// optimize Loop
		go.removeBraces("Loop");
		go.removeAction("Loop");
		go.removeKeywordsOfAllAttrs("Loop");
		go.moveLine("Loop", "bodyInteraction", "loopCondition", false);
		go.renameKeyword("Loop", null, "Loop", "while", null);
		go.removeOptionality("Loop", "bodyInteraction");
		
		
		// optimize Parallel
		go.removeBraces("Parallel");
		go.removeKeywordsOfAllAttrs("Parallel");
		go.removeOptionality("Parallel", "parallelInteraction");
		go.changeCommaToOtherSymbol("Parallel", "parallelInteraction", "and");
		
		
		// optimize WaitCondition
		go.removeAction("WaitCondition");
		go.moveLine("WaitCondition", "strict", "WaitCondition", false);
		go.moveLine("WaitCondition", "requested", "strict", false);
		go.renameKeyword("WaitCondition", null, "WaitCondition", "wait", null);
		go.renameKeyword("WaitCondition", "requested", "requested", "eventually", null);
		go.removeKeyword("WaitCondition", "conditionExpression", "conditionExpression", null);
		go.removeOptionality("WaitCondition", "conditionExpression");
		go.changeBracesToSquare("WaitCondition", null);
		
		
		// optimize InterruptCondition
		go.removeAction("InterruptCondition");
		go.removeKeywordsOfAllAttrs("InterruptCondition");
		go.removeOptionality("InterruptCondition", "conditionExpression");
		go.renameKeyword("InterruptCondition", null, "InterruptCondition", "interrupt", null);
		go.changeBracesToSquare("InterruptCondition", null);
		
		// optimize ViolationCondition
		go.removeAction("ViolationCondition");
		go.removeKeywordsOfAllAttrs("ViolationCondition");
		go.removeOptionality("ViolationCondition", "conditionExpression");
		go.renameKeyword("ViolationCondition", null, "ViolationCondition", "violation", null);
		go.changeBracesToSquare("ViolationCondition", null);
		
		
		// optimize Condition
		go.removeAction("Condition");
		go.removeKeyword("Condition");
		go.removeOptionality("Condition", "conditionExpression");
		go.changeBracesToSquare("Condition", null);
		
		
		// optimize VariableFragment
		go.removeAction("VariableFragment");
		go.removeBraces("VariableFragment");
		go.removeKeyword("VariableFragment");
		go.removeOptionality("VariableFragment", null);
		go.changeTypeOfAttr("VariableFragment", "expression", "VariableExpression", "(TypedVariableDeclaration | VariableAssignment | ClockDeclaration | ClockAssignment)");
		
		
		// optimize TimedViolationCondition
		go.removeAction("TimedViolationCondition");
		go.renameKeyword("TimedViolationCondition", null, "TimedViolationCondition", "timed", null);
		go.addKeywordAfterKeyword("TimedViolationCondition", null, "timed", "violation");
		go.removeKeyword("TimedViolationCondition", "timedConditionExpression", "timedConditionExpression", null);
		go.removeOptionality("TimedViolationCondition", null);
		go.changeBracesToSquare("TimedViolationCondition", null);
		
		
		// optimize TimedInterruptCondition
		go.removeAction("TimedInterruptCondition");
		go.renameKeyword("TimedInterruptCondition", null, "TimedInterruptCondition", "timed", null);
		go.addKeywordAfterKeyword("TimedInterruptCondition", null, "timed", "interrupt");
		go.removeKeyword("TimedInterruptCondition", "timedConditionExpression", "timedConditionExpression", null);
		go.removeOptionality("TimedInterruptCondition", null);
		go.changeBracesToSquare("TimedInterruptCondition", null);
		
		
		// optimize TimedWaitCondition
		go.removeAction("TimedWaitCondition");
		go.moveLine("TimedWaitCondition", "strict", "TimedWaitCondition", false);
		go.moveLine("TimedWaitCondition", "requested", "strict", false);
		go.renameKeyword("TimedWaitCondition", null, "TimedWaitCondition", "timed", null);
		go.addKeywordAfterKeyword("TimedWaitCondition", null, "timed", "wait");
		go.removeKeyword("TimedWaitCondition", "timedConditionExpression", "timedConditionExpression", null);
		go.removeOptionality("TimedWaitCondition", null);
		go.changeBracesToSquare("TimedWaitCondition", null);
		go.renameKeyword("TimedWaitCondition", null, "requested", "eventually", null);
		go.addOptionalityToLine("TimedWaitCondition", "strict");
		go.addOptionalityToLine("TimedWaitCondition", "requested");
		
		
		// optimize ParameterBinding
		go.removeAction("ParameterBinding");
		go.removeBraces("ParameterBinding");
		go.removeKeyword("ParameterBinding");
		go.removeOptionality("ParameterBinding", null);
		go.changeTypeOfAttr("ParameterBinding", "bindingExpression", "BindingExpression", "ParameterExpression");
		
		
		// optimize ExpectationKind
		go.removeLiteralFromEnum("ExpectationKind", "none");
		
		
		// optimize Case
		go.removeBraces("Case");
		go.removeKeyword("Case");
		go.moveLine("Case", "caseInteraction", "caseCondition", false);
		go.removeOptionality("Case", "caseInteraction");
		
		
		// optimize ConditionExpression
		go.removeBraces("ConditionExpression");
		go.removeKeyword("ConditionExpression");
		go.removeOptionality("ConditionExpression", null);
		go.removeAction("ConditionExpression");
		
		
		// optimize Message_Impl
		go.removeAction("Message_Impl");
		go.renameRule("Message_Impl", "ConstraintMessage");
		go.removeBraces("ConstraintMessage");
		go.removeKeyword("ConstraintMessage");
		go.moveLine("ConstraintMessage", "sender", "receiver", true);
		go.moveLine("ConstraintMessage", "collectionModification", "modelElement", false);
		go.removeCertainTypeFromAttr("ConstraintMessage", "sender", "EString");
		go.removeCertainTypeFromAttr("ConstraintMessage", "receiver", "EString");
		go.removeCertainTypeFromAttr("ConstraintMessage", "modelElement", "EString");
		go.changeTypeOfAttr("ConstraintMessage", "collectionModification", "CollectionOperation", "CollectionModification");
		go.addBracesToLine("ConstraintMessage", "parameters");
		go.changeBracesToParentheses("ConstraintMessage", "parameters");
		go.removeOptionality("ConstraintMessage", "sender");
		go.removeOptionality("ConstraintMessage", "receiver");
		go.removeOptionality("ConstraintMessage", "modelElement");
		go.addSymbolToLine("ConstraintMessage", "sender", "->", false);
		go.addSymbolToLine("ConstraintMessage", "receiver", ".", false);
		go.addSymbolToAttr("ConstraintMessage", "collectionModification", ".", true, null, true, true);
		
		
		
		// optimize RangesForParameter
		go.removeBraces("RangesForParameter");
		go.removeKeyword("RangesForParameter");
		go.removeOptionality("RangesForParameter", null);
		go.removeCertainTypeFromAttr("RangesForParameter", "parameter", "EString");
		go.addSymbolToLine("RangesForParameter", "ranges", "=", true);
		go.removeAction("RangesForParameter");
		
		
		// optimize IntegerRanges
		go.removeBraces("IntegerRanges");
		go.removeKeyword("IntegerRanges", null, "IntegerRanges", null);
		go.removeKeyword("IntegerRanges", "min", "min", null);
		go.removeKeyword("IntegerRanges", "max", "max", null);
		go.removeOptionality("IntegerRanges", "min");
		go.removeOptionality("IntegerRanges", "max");
		go.addSymbolToLine("IntegerRanges", "min", "..", false);
		go.packageAttributes("IntegerRanges", "min", "max", MultiplicityKey.PACKAGE_ONLY);
		go.convert0toStarTo0toStaror1toStar("IntegerRanges", "values");
		go.changeTypeOfAttr("IntegerRanges", null, "EInt", "(INT | SIGNEDINT)");
		go.renameKeyword("IntegerRanges", "values", "values", ",", null);
		go.removeAction("IntegerRanges");
		
		
		// optimize StringRanges
		go.removeBraces("StringRanges");
		go.removeKeyword("StringRanges");
		go.removeOptionality("StringRanges", "values");
		go.addParenthesesWithoutQuotes("StringRanges", ScopeKey.SINGLELINE, null, "values", MultiplicityKey.PACKAGE_ONLY);
		go.changeTypeOfAttr("StringRanges", "values", "EString", "STRING");
		
		
		// optimize EnumRanges
		go.removeBraces("EnumRanges");
		go.removeKeyword("EnumRanges");
		go.removeAction("EnumRanges");
		go.removeOptionality("EnumRanges", "values");
		go.removeParenthesesInSpecifiedAttr("EnumRanges", "values");
		go.addParenthesesWithoutQuotes("EnumRanges", ScopeKey.SINGLELINE, null, "values", MultiplicityKey.PACKAGE_ONLY);
		go.changeTypeOfAttr("EnumRanges", "values", "EString", "FQNENUM");
		go.removeAction("StringRanges");
		
		
		// optimize MessageChannel
		go.removeBraces("MessageChannel");
		go.removeKeyword("MessageChannel");
		go.removeAction("MessageChannel");
		go.removeOptionality("MessageChannel", null);
		go.changeTypeOfAttr("MessageChannel", null, "EString", "FQN");
		go.addKeywordToLine("MessageChannel", "channelFeature", "over", true);
		
		
		// add rule NestedCollaboration
		go.addPrimitiveType("NestedCollaboration", "Collaboration", 
				"    'collaboration'\n    name=ID\n    '{'\n        roles+=Role*\n        scenarios+=Scenario*\n    '}';\n", null);
		// add rule FQN
		go.addPrimitiveType("FQN", null, "    ID ('.' ID)*;\n", null);
		// add rule TimedConditionFragment
		go.addPrimitiveType("TimedConditionFragment", "TimedConditionFragment", 
				"    TimedWaitCondition | TimedInterruptCondition | TimedViolationCondition;\n", null);
		// add rule ConditionFragment
		go.addPrimitiveType("ConditionFragment", "ConditionFragment", 
				"    WaitCondition | InterruptCondition | ViolationCondition;\n", null);
		// add rule FQNENUM
		go.addPrimitiveType("FQNENUM", null, "    ID (':' ID)*;\n", null);
		
		go.removeImport(null);
		go.addImport("http://www.scenariotools.org/sml", null);
		go.addImport("http://www.scenariotools.org/sml/expressions/ScenarioExpressions", null);
		go.addImport("http://www.eclipse.org/emf/2002/Ecore", "ecore");
		
		go.addPrimitiveType("DOUBLE", "ecore::EDouble", "	INT '.' INT;", null);
		go.addPrimitiveType("SIGNEDINT", "ecore::EInt", "	INT;", null);
		
		String actualOutput = go.spliceGrammar();
		//FileHelper.setFileText("Test_SML.txt", actualOutput);
		String expectOutput = FileHelper.getFileText("Test_SML.txt", false);

		// compare text
		//Assertions.assertTrue(actualOutput.equals(expectOutput), "The modified grammar is not expected!");
		Assert.assertEquals("The modified grammar is not expected!", expectOutput.replaceAll("\\s+", ""), actualOutput.replaceAll("\\s+", ""));
	}
}
