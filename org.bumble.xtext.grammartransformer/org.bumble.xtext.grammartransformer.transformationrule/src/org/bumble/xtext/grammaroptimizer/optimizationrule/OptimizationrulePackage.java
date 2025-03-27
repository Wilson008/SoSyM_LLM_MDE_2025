/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationruleFactory
 * @model kind="package"
 * @generated
 */
public interface OptimizationrulePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "optimizationrule";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://bumble.org/xtext/optimizationrule/DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.bumble.xtext.grammaroptimizer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	OptimizationrulePackage eINSTANCE = org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl <em>Optimization Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getOptimizationRule()
	 * @generated
	 */
	int OPTIMIZATION_RULE = 0;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE__GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE__GRAMMAR_RULE = 1;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE__ATTR_NAME = 2;

	/**
	 * The number of structural features of the '<em>Optimization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE___APPLY = 0;

	/**
	 * The number of operations of the '<em>Optimization Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl <em>Remove Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveBraces()
	 * @generated
	 */
	int REMOVE_BRACES = 1;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES__TARGET_ATTRIBUTE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Excluded Grammar Rule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl <em>Add Keyword To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddKeywordToAttr()
	 * @generated
	 */
	int ADD_KEYWORD_TO_ATTR = 2;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__IS_HEAD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Keyword To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Keyword To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl <em>Remove Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveKeyword()
	 * @generated
	 */
	int REMOVE_KEYWORD = 3;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Keyword Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__KEYWORD_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__TARGET_ATTRIBUTE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Remove Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl <em>Rename Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRenameKeyword()
	 * @generated
	 */
	int RENAME_KEYWORD = 4;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Current Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__CURRENT_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__TARGET_ATTRIBUTE = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rename Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Rename Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToStarImpl <em>Convert1to Star To Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToStarImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarToStar()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO_STAR = 5;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Convert1to Star To Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Convert1to Star To Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToPlusImpl <em>Convert1to Star To Plus</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToPlusImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarToPlus()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO_PLUS = 6;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Convert1to Star To Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Convert1to Star To Plus</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl <em>Change Optional Attr To Or Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeOptionalAttrToOrRelation()
	 * @generated
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION = 7;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Is All</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Start Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>End Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Excluded Grammar Rule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Change Optional Attr To Or Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Optional Attr To Or Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPTIONAL_ATTR_TO_OR_RELATION_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl <em>Remove XStar Attr Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveXStarAttrKeyword()
	 * @generated
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD = 8;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD__ATTRIBUTES = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove XStar Attr Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove XStar Attr Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCommaImpl <em>Remove Comma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCommaImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveComma()
	 * @generated
	 */
	int REMOVE_COMMA = 9;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA__ATTRIBUTES = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Comma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Comma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl <em>Move Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getMoveLine()
	 * @generated
	 */
	int MOVE_LINE = 10;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__SOURCE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__TARGET = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__IS_HEAD = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Move Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Move Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleImpl <em>Remove Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveRule()
	 * @generated
	 */
	int REMOVE_RULE = 11;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1ToStarTo1Impl <em>Convert1 To Star To1</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1ToStarTo1Impl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1ToStarTo1()
	 * @generated
	 */
	int CONVERT1_TO_STAR_TO1 = 12;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Convert1 To Star To1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Convert1 To Star To1</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl <em>Remove Rule Call</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveRuleCall()
	 * @generated
	 */
	int REMOVE_RULE_CALL = 13;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Called Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL__CALLED_RULE_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Rule Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Rule Call</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl <em>Add Keyword After Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddKeywordAfterKeyword()
	 * @generated
	 */
	int ADD_KEYWORD_AFTER_KEYWORD = 14;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Current Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Keyword After Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Keyword After Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl <em>Change Type Of Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeTypeOfAttr()
	 * @generated
	 */
	int CHANGE_TYPE_OF_ATTR = 15;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Current Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__CURRENT_TYPE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__NEW_TYPE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Type Of Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Type Of Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesToAttrImpl <em>Add Parentheses To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesToAttr()
	 * @generated
	 */
	int ADD_PARENTHESES_TO_ATTR = 16;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Parentheses To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Parentheses To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttributeImpl <em>Remove Parentheses In Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttributeImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveParenthesesInAttribute()
	 * @generated
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE = 17;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Parentheses In Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Parentheses In Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_ATTRIBUTE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl <em>Add Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddImport()
	 * @generated
	 */
	int ADD_IMPORT = 18;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__NEW_IMPORT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nick Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__NICK_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveAttribute()
	 * @generated
	 */
	int REMOVE_ATTRIBUTE = 19;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl <em>Change Attr Line Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAttrLineContent()
	 * @generated
	 */
	int CHANGE_ATTR_LINE_CONTENT = 20;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Line Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Attr Line Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Attr Line Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameRuleImpl <em>Rename Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRenameRule()
	 * @generated
	 */
	int RENAME_RULE = 21;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Current Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__CURRENT_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__NEW_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Rename Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Rename Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl <em>Remove Attribute Keywords</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveAttributeKeywords()
	 * @generated
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS = 22;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Attribute Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Attribute Keywords</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE_KEYWORDS_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl <em>Remove Optionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveOptionality()
	 * @generated
	 */
	int REMOVE_OPTIONALITY = 23;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Optionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Optionality</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl <em>Change Braces To Parentheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBracesToParentheses()
	 * @generated
	 */
	int CHANGE_BRACES_TO_PARENTHESES = 24;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_PARENTHESES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_PARENTHESES__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_PARENTHESES__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Braces To Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_PARENTHESES_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_PARENTHESES___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Braces To Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_PARENTHESES_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl <em>Change Braces To Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBracesToSquare()
	 * @generated
	 */
	int CHANGE_BRACES_TO_SQUARE = 25;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_SQUARE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_SQUARE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_SQUARE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Braces To Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_SQUARE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_SQUARE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Braces To Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_SQUARE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl <em>Change Braces To Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBracesToAngle()
	 * @generated
	 */
	int CHANGE_BRACES_TO_ANGLE = 26;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_ANGLE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_ANGLE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_ANGLE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Braces To Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_ANGLE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_ANGLE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Braces To Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACES_TO_ANGLE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl <em>Remove Outermost Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveOutermostBraces()
	 * @generated
	 */
	int REMOVE_OUTERMOST_BRACES = 27;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTERMOST_BRACES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTERMOST_BRACES__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTERMOST_BRACES__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Outermost Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTERMOST_BRACES_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTERMOST_BRACES___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Outermost Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTERMOST_BRACES_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl <em>Convert1to Star To1or Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarTo1orStar()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO1OR_STAR = 28;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Convert1to Star To1or Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Convert1to Star To1or Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl <em>Remove Braces Except Outermost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveBracesExceptOutermost()
	 * @generated
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST = 29;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Braces Except Outermost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Braces Except Outermost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACES_EXCEPT_OUTERMOST_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl <em>Remove Certain Type From Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveCertainTypeFromAttr()
	 * @generated
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR = 30;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Certain Type From Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Certain Type From Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl <em>Change Rule Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeRuleContent()
	 * @generated
	 */
	int CHANGE_RULE_CONTENT = 31;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT__NEW_CONTENT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Rule Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Rule Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleImpl <em>Change Called Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeCalledRule()
	 * @generated
	 */
	int CHANGE_CALLED_RULE = 32;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Current Called Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__CURRENT_CALLED_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Called Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__NEW_CALLED_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Called Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Called Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl <em>Change Comma To Other Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeCommaToOtherSymbol()
	 * @generated
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL = 33;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Comma To Other Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Comma To Other Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveAttrToAfterRuleKeywordImpl <em>Move Attr To After Rule Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveAttrToAfterRuleKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getMoveAttrToAfterRuleKeyword()
	 * @generated
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD = 34;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Moved Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Move Attr To After Rule Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Move Attr To After Rule Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl <em>Add String To Rule Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddStringToRuleKeyword()
	 * @generated
	 */
	int ADD_STRING_TO_RULE_KEYWORD = 35;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Target Attribute</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Added String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__IS_HEAD = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add String To Rule Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add String To Rule Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToAttrImpl <em>Add Optionality To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToAttr()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_ATTR = 36;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Optionality To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveImportImpl <em>Remove Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveImportImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveImport()
	 * @generated
	 */
	int REMOVE_IMPORT = 37;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Import</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__IMPORT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeKeywordImpl <em>Add Alternative Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeKeyword()
	 * @generated
	 */
	int ADD_ALTERNATIVE_KEYWORD = 38;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Current Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Alternative Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Alternative Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl <em>Add Optionality To Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToKeyword()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_KEYWORD = 39;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD__KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Optionality To Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl <em>Add Braces To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddBracesToAttr()
	 * @generated
	 */
	int ADD_BRACES_TO_ATTR = 40;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Braces To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Braces To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl <em>Keyword Upper To Lower Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getKeywordUpperToLowerCase()
	 * @generated
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE = 41;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword Upper To Lower Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Keyword Upper To Lower Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl <em>Add Square Bracket To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSquareBracketToAttr()
	 * @generated
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR = 42;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Square Bracket To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Square Bracket To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl <em>Add Optionality To Outermost Braces</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToOutermostBraces()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES = 43;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Optionality To Outermost Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Outermost Braces</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTERMOST_BRACES_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl <em>Add Symbol To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolToAttr()
	 * @generated
	 */
	int ADD_SYMBOL_TO_ATTR = 44;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__NEW_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Ignored Attributes</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__IS_HEAD = OPTIMIZATION_RULE_FEATURE_COUNT + 2;
	
	/**
	 * The feature id for the '<em><b>Only Common Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Only Upper Bound One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE = OPTIMIZATION_RULE_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Add Symbol To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Symbol To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl <em>Add Primitive Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddPrimitiveType()
	 * @generated
	 */
	int ADD_PRIMITIVE_TYPE = 45;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Metaclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__METACLASS = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__BODY = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__ANNOTATION = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl <em>Add Symbol To Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolToRule()
	 * @generated
	 */
	int ADD_SYMBOL_TO_RULE = 46;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BInside</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__BINSIDE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Symbol To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Symbol To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl <em>Add Keyword To Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddKeywordToLine()
	 * @generated
	 */
	int ADD_KEYWORD_TO_LINE = 47;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__IS_HEAD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Keyword To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Keyword To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl <em>Add Parentheses Without Quotes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesWithoutQuotes()
	 * @generated
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES = 48;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Parentheses Without Quotes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Parentheses Without Quotes</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToSymbolImpl <em>Add Optionality To Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToSymbolImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToSymbol()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_SYMBOL = 49;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Target Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Optionality To Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_SYMBOL_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToLineImpl <em>Add Symbol To Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToLineImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolToLine()
	 * @generated
	 */
	int ADD_SYMBOL_TO_LINE = 50;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE__NEW_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE__IS_FRONT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Symbol To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Symbol To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_LINE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToLineImpl <em>Add Symbol Without Quote To Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToLineImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolWithoutQuoteToLine()
	 * @generated
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE = 51;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Symbol Without Quote To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Symbol Without Quote To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABtoBABImpl <em>Change ABto BAB</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABtoBABImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeABtoBAB()
	 * @generated
	 */
	int CHANGE_ABTO_BAB = 52;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB__ATTR_A = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB__ATTR_B = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change ABto BAB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change ABto BAB</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ABTO_BAB_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl <em>Copy Attr ATo Attr B</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getCopyAttrAToAttrB()
	 * @generated
	 */
	int COPY_ATTR_ATO_ATTR_B = 53;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B__ATTR_A = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B__ATTR_B = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B__IS_FRONT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Copy Attr ATo Attr B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Copy Attr ATo Attr B</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_ATTR_ATO_ATTR_B_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl <em>Copy Xfrom Star To Y</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getCopyXfromStarToY()
	 * @generated
	 */
	int COPY_XFROM_STAR_TO_Y = 54;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Attr In X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y__ATTR_IN_X = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr In Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y__ATTR_IN_Y = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y__IS_FRONT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Copy Xfrom Star To Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Copy Xfrom Star To Y</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPY_XFROM_STAR_TO_Y_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToTwoImpl <em>Convert1to Star To Two</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToTwoImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarToTwo()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO_TWO = 55;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_TWO__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_TWO__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_TWO__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Convert1to Star To Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_TWO_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_TWO___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Convert1to Star To Two</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_TWO_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToOptionalAorAImpl <em>Change ATo Optional Aor A</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToOptionalAorAImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAToOptionalAorA()
	 * @generated
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A = 56;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change ATo Optional Aor A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change ATo Optional Aor A</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_OPTIONAL_AOR_A_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddTerminalRuleImpl <em>Add Terminal Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddTerminalRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddTerminalRule()
	 * @generated
	 */
	int ADD_TERMINAL_RULE = 57;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Body</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE__BODY = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE__ANNOTATION = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Terminal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Terminal Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_TERMINAL_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToLineImpl <em>Add Optionality To Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToLineImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToLine()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_LINE = 58;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_LINE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_LINE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Optionality To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_LINE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_LINE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_LINE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToLineImpl <em>Add Braces To Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToLineImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddBracesToLine()
	 * @generated
	 */
	int ADD_BRACES_TO_LINE = 59;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_LINE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_LINE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Braces To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_LINE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_LINE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Braces To Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_LINE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuoteToRuleImpl <em>Add Parentheses Without Quote To Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuoteToRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesWithoutQuoteToRule()
	 * @generated
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE = 60;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Parentheses Without Quote To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Parentheses Without Quote To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSymbolImpl <em>Add Alternative Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSymbolImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeSymbol()
	 * @generated
	 */
	int ADD_ALTERNATIVE_SYMBOL = 61;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Current Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Alternative Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Alternative Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SYMBOL_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABToABorBAImpl <em>Change AB To ABor BA</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABToABorBAImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeABToABorBA()
	 * @generated
	 */
	int CHANGE_AB_TO_ABOR_BA = 62;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Attr A</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA__ATTR_A = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attr B</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA__ATTR_B = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change AB To ABor BA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change AB To ABor BA</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_AB_TO_ABOR_BA_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl <em>Add Symbol Without Quote To Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolWithoutQuoteToKeyword()
	 * @generated
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD = 63;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Front</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Symbol Without Quote To Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Symbol Without Quote To Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl <em>Change Attribute Multiplicity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAttributeMultiplicity()
	 * @generated
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY = 64;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Start Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>End Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Multiplicity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Attribute Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Attribute Multiplicity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_MULTIPLICITY_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBooleanAttrToSpecialPatternImpl <em>Change Boolean Attr To Special Pattern</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBooleanAttrToSpecialPatternImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBooleanAttrToSpecialPattern()
	 * @generated
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN = 65;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Boolean Attr To Special Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Boolean Attr To Special Pattern</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeToSingleElementOrBracedListImpl <em>Change Attribute To Single Element Or Braced List</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeToSingleElementOrBracedListImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAttributeToSingleElementOrBracedList()
	 * @generated
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST = 66;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Attribute To Single Element Or Braced List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Attribute To Single Element Or Braced List</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeReturnsImpl <em>Change Returns</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeReturnsImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeReturns()
	 * @generated
	 */
	int CHANGE_RETURNS = 67;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Returns</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS__NEW_RETURNS = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Returns</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RETURNS_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeValueImpl <em>Add Alternative Value</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeValueImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeValue()
	 * @generated
	 */
	int ADD_ALTERNATIVE_VALUE = 68;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Is Enum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE__IS_ENUM = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE__NEW_VALUE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Alternative Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Alternative Value</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_VALUE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToAorSymbolImpl <em>Change ATo Aor Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToAorSymbolImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAToAorSymbol()
	 * @generated
	 */
	int CHANGE_ATO_AOR_SYMBOL = 69;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL__SYMBOL = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Change ATo Aor Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change ATo Aor Symbol</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATO_AOR_SYMBOL_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSubClassToAbstractClassImpl <em>Add Alternative Sub Class To Abstract Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSubClassToAbstractClassImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeSubClassToAbstractClass()
	 * @generated
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS = 70;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Alternative Sub Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Alternative Sub Class To Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Alternative Sub Class To Abstract Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToRuleImpl <em>Add Braces To Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddBracesToRule()
	 * @generated
	 */
	int ADD_BRACES_TO_RULE = 71;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Braces To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Braces To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACES_TO_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveLiteralFromEnumImpl <em>Remove Literal From Enum</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveLiteralFromEnumImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveLiteralFromEnum()
	 * @generated
	 */
	int REMOVE_LITERAL_FROM_ENUM = 72;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Literal Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Remove Literal From Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Literal From Enum</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_LITERAL_FROM_ENUM_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert0toStarTo0toStaror1toStarImpl <em>Convert0to Star To0to Staror1to Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert0toStarTo0toStaror1toStarImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert0toStarTo0toStaror1toStar()
	 * @generated
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR = 73;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Convert0to Star To0to Staror1to Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Convert0to Star To0to Staror1to Star</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveActionImpl <em>Remove Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveActionImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveAction()
	 * @generated
	 */
	int REMOVE_ACTION = 74;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ACTION_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddCallToOtherRuleImpl <em>Add Call To Other Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddCallToOtherRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddCallToOtherRule()
	 * @generated
	 */
	int ADD_CALL_TO_OTHER_RULE = 75;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Name Of Other Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Call Required</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE__CALL_REQUIRED = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Call To Other Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Call To Other Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_CALL_TO_OTHER_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl <em>Set Ast Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getSetAstProperty()
	 * @generated
	 */
	int SET_AST_PROPERTY = 76;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__GRAMMAR_RULE = OPTIMIZATION_RULE__GRAMMAR_RULE;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__CLASS_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Property Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__PROPERTY_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Property Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__PROPERTY_VALUE = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Multi</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY__MULTI = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Set Ast Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Set Ast Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_AST_PROPERTY_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey <em>Scope Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getScopeKey()
	 * @generated
	 */
	int SCOPE_KEY = 77;


	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey <em>Multiplicity Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getMultiplicityKey()
	 * @generated
	 */
	int MULTIPLICITY_KEY = 78;

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule <em>Optimization Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Optimization Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule
	 * @generated
	 */
	EClass getOptimizationRule();

	/**
	 * Returns the meta object for the reference '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Grammar</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammar()
	 * @see #getOptimizationRule()
	 * @generated
	 */
	EReference getOptimizationRule_Grammar();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammarRule <em>Grammar Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grammar Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammarRule()
	 * @see #getOptimizationRule()
	 * @generated
	 */
	EAttribute getOptimizationRule_GrammarRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getAttrName <em>Attr Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getAttrName()
	 * @see #getOptimizationRule()
	 * @generated
	 */
	EAttribute getOptimizationRule_AttrName();

	/**
	 * Returns the meta object for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#apply() <em>Apply</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Apply</em>' operation.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#apply()
	 * @generated
	 */
	EOperation getOptimizationRule__Apply();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces <em>Remove Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Braces</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces
	 * @generated
	 */
	EClass getRemoveBraces();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getTargetAttribute <em>Target Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Attribute</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getTargetAttribute()
	 * @see #getRemoveBraces()
	 * @generated
	 */
	EAttribute getRemoveBraces_TargetAttribute();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excluded Grammar Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getExcludedGrammarRule()
	 * @see #getRemoveBraces()
	 * @generated
	 */
	EAttribute getRemoveBraces_ExcludedGrammarRule();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr <em>Add Keyword To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Keyword To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr
	 * @generated
	 */
	EClass getAddKeywordToAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#getNewKeyword()
	 * @see #getAddKeywordToAttr()
	 * @generated
	 */
	EAttribute getAddKeywordToAttr_NewKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#isIsHead <em>Is Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Head</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#isIsHead()
	 * @see #getAddKeywordToAttr()
	 * @generated
	 */
	EAttribute getAddKeywordToAttr_IsHead();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword <em>Remove Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword
	 * @generated
	 */
	EClass getRemoveKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getKeywordName <em>Keyword Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getKeywordName()
	 * @see #getRemoveKeyword()
	 * @generated
	 */
	EAttribute getRemoveKeyword_KeywordName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getTargetAttribute <em>Target Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Attribute</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getTargetAttribute()
	 * @see #getRemoveKeyword()
	 * @generated
	 */
	EAttribute getRemoveKeyword_TargetAttribute();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword <em>Rename Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword
	 * @generated
	 */
	EClass getRenameKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getCurrentKeyword <em>Current Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getCurrentKeyword()
	 * @see #getRenameKeyword()
	 * @generated
	 */
	EAttribute getRenameKeyword_CurrentKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getNewKeyword()
	 * @see #getRenameKeyword()
	 * @generated
	 */
	EAttribute getRenameKeyword_NewKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getTargetAttribute <em>Target Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Attribute</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameKeyword#getTargetAttribute()
	 * @see #getRenameKeyword()
	 * @generated
	 */
	EAttribute getRenameKeyword_TargetAttribute();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar <em>Convert1to Star To Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert1to Star To Star</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToStar
	 * @generated
	 */
	EClass getConvert1toStarToStar();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToPlus <em>Convert1to Star To Plus</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert1to Star To Plus</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToPlus
	 * @generated
	 */
	EClass getConvert1toStarToPlus();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation <em>Change Optional Attr To Or Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Optional Attr To Or Relation</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation
	 * @generated
	 */
	EClass getChangeOptionalAttrToOrRelation();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#isIsAll <em>Is All</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is All</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#isIsAll()
	 * @see #getChangeOptionalAttrToOrRelation()
	 * @generated
	 */
	EAttribute getChangeOptionalAttrToOrRelation_IsAll();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getStartAttr <em>Start Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getStartAttr()
	 * @see #getChangeOptionalAttrToOrRelation()
	 * @generated
	 */
	EAttribute getChangeOptionalAttrToOrRelation_StartAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getEndAttr <em>End Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getEndAttr()
	 * @see #getChangeOptionalAttrToOrRelation()
	 * @generated
	 */
	EAttribute getChangeOptionalAttrToOrRelation_EndAttr();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excluded Grammar Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptionalAttrToOrRelation#getExcludedGrammarRule()
	 * @see #getChangeOptionalAttrToOrRelation()
	 * @generated
	 */
	EAttribute getChangeOptionalAttrToOrRelation_ExcludedGrammarRule();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword <em>Remove XStar Attr Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove XStar Attr Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword
	 * @generated
	 */
	EClass getRemoveXStarAttrKeyword();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveXStarAttrKeyword#getAttributes()
	 * @see #getRemoveXStarAttrKeyword()
	 * @generated
	 */
	EAttribute getRemoveXStarAttrKeyword_Attributes();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma <em>Remove Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Comma</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma
	 * @generated
	 */
	EClass getRemoveComma();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Attributes</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma#getAttributes()
	 * @see #getRemoveComma()
	 * @generated
	 */
	EAttribute getRemoveComma_Attributes();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine <em>Move Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine
	 * @generated
	 */
	EClass getMoveLine();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine#getSource()
	 * @see #getMoveLine()
	 * @generated
	 */
	EAttribute getMoveLine_Source();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine#getTarget()
	 * @see #getMoveLine()
	 * @generated
	 */
	EAttribute getMoveLine_Target();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine#isIsHead <em>Is Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Head</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine#isIsHead()
	 * @see #getMoveLine()
	 * @generated
	 */
	EAttribute getMoveLine_IsHead();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRule <em>Remove Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRule
	 * @generated
	 */
	EClass getRemoveRule();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1ToStarTo1 <em>Convert1 To Star To1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert1 To Star To1</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1ToStarTo1
	 * @generated
	 */
	EClass getConvert1ToStarTo1();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall <em>Remove Rule Call</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Rule Call</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall
	 * @generated
	 */
	EClass getRemoveRuleCall();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall#getCalledRuleName <em>Called Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Called Rule Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveRuleCall#getCalledRuleName()
	 * @see #getRemoveRuleCall()
	 * @generated
	 */
	EAttribute getRemoveRuleCall_CalledRuleName();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword <em>Add Keyword After Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Keyword After Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword
	 * @generated
	 */
	EClass getAddKeywordAfterKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword#getNewKeyword()
	 * @see #getAddKeywordAfterKeyword()
	 * @generated
	 */
	EAttribute getAddKeywordAfterKeyword_NewKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword#getCurrentKeyword <em>Current Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordAfterKeyword#getCurrentKeyword()
	 * @see #getAddKeywordAfterKeyword()
	 * @generated
	 */
	EAttribute getAddKeywordAfterKeyword_CurrentKeyword();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr <em>Change Type Of Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Type Of Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr
	 * @generated
	 */
	EClass getChangeTypeOfAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getCurrentType <em>Current Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Type</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getCurrentType()
	 * @see #getChangeTypeOfAttr()
	 * @generated
	 */
	EAttribute getChangeTypeOfAttr_CurrentType();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getNewType <em>New Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Type</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getNewType()
	 * @see #getChangeTypeOfAttr()
	 * @generated
	 */
	EAttribute getChangeTypeOfAttr_NewType();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesToAttr <em>Add Parentheses To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Parentheses To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesToAttr
	 * @generated
	 */
	EClass getAddParenthesesToAttr();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInAttribute <em>Remove Parentheses In Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Parentheses In Attribute</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInAttribute
	 * @generated
	 */
	EClass getRemoveParenthesesInAttribute();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport <em>Add Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Import</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport
	 * @generated
	 */
	EClass getAddImport();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNewImport <em>New Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Import</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNewImport()
	 * @see #getAddImport()
	 * @generated
	 */
	EAttribute getAddImport_NewImport();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNickName <em>Nick Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nick Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getNickName()
	 * @see #getAddImport()
	 * @generated
	 */
	EAttribute getAddImport_NickName();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute <em>Remove Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attribute</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttribute
	 * @generated
	 */
	EClass getRemoveAttribute();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent <em>Change Attr Line Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Attr Line Content</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent
	 * @generated
	 */
	EClass getChangeAttrLineContent();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent#getNewLineContent <em>New Line Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Line Content</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttrLineContent#getNewLineContent()
	 * @see #getChangeAttrLineContent()
	 * @generated
	 */
	EAttribute getChangeAttrLineContent_NewLineContent();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule <em>Rename Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rename Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule
	 * @generated
	 */
	EClass getRenameRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule#getCurrentName <em>Current Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule#getCurrentName()
	 * @see #getRenameRule()
	 * @generated
	 */
	EAttribute getRenameRule_CurrentName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RenameRule#getNewName()
	 * @see #getRenameRule()
	 * @generated
	 */
	EAttribute getRenameRule_NewName();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords <em>Remove Attribute Keywords</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Attribute Keywords</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords
	 * @generated
	 */
	EClass getRemoveAttributeKeywords();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality <em>Remove Optionality</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Optionality</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOptionality
	 * @generated
	 */
	EClass getRemoveOptionality();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToParentheses <em>Change Braces To Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Braces To Parentheses</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToParentheses
	 * @generated
	 */
	EClass getChangeBracesToParentheses();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare <em>Change Braces To Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Braces To Square</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare
	 * @generated
	 */
	EClass getChangeBracesToSquare();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToAngle <em>Change Braces To Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Braces To Angle</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToAngle
	 * @generated
	 */
	EClass getChangeBracesToAngle();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces <em>Remove Outermost Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Outermost Braces</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces
	 * @generated
	 */
	EClass getRemoveOutermostBraces();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar <em>Convert1to Star To1or Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert1to Star To1or Star</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarTo1orStar
	 * @generated
	 */
	EClass getConvert1toStarTo1orStar();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost <em>Remove Braces Except Outermost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Braces Except Outermost</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost
	 * @generated
	 */
	EClass getRemoveBracesExceptOutermost();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr <em>Remove Certain Type From Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Certain Type From Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr
	 * @generated
	 */
	EClass getRemoveCertainTypeFromAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr#getType()
	 * @see #getRemoveCertainTypeFromAttr()
	 * @generated
	 */
	EAttribute getRemoveCertainTypeFromAttr_Type();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent <em>Change Rule Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Rule Content</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent
	 * @generated
	 */
	EClass getChangeRuleContent();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent#getNewContent <em>New Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Content</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleContent#getNewContent()
	 * @see #getChangeRuleContent()
	 * @generated
	 */
	EAttribute getChangeRuleContent_NewContent();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule <em>Change Called Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Called Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule
	 * @generated
	 */
	EClass getChangeCalledRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getCurrentCalledRule <em>Current Called Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Called Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getCurrentCalledRule()
	 * @see #getChangeCalledRule()
	 * @generated
	 */
	EAttribute getChangeCalledRule_CurrentCalledRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getNewCalledRule <em>New Called Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Called Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRule#getNewCalledRule()
	 * @see #getChangeCalledRule()
	 * @generated
	 */
	EAttribute getChangeCalledRule_NewCalledRule();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol <em>Change Comma To Other Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Comma To Other Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol
	 * @generated
	 */
	EClass getChangeCommaToOtherSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol#getNewSymbol <em>New Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCommaToOtherSymbol#getNewSymbol()
	 * @see #getChangeCommaToOtherSymbol()
	 * @generated
	 */
	EAttribute getChangeCommaToOtherSymbol_NewSymbol();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword <em>Move Attr To After Rule Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Move Attr To After Rule Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword
	 * @generated
	 */
	EClass getMoveAttrToAfterRuleKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword#getMovedLine <em>Moved Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moved Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword#getMovedLine()
	 * @see #getMoveAttrToAfterRuleKeyword()
	 * @generated
	 */
	EAttribute getMoveAttrToAfterRuleKeyword_MovedLine();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword <em>Add String To Rule Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add String To Rule Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword
	 * @generated
	 */
	EClass getAddStringToRuleKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getTargetAttribute <em>Target Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Attribute</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getTargetAttribute()
	 * @see #getAddStringToRuleKeyword()
	 * @generated
	 */
	EAttribute getAddStringToRuleKeyword_TargetAttribute();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getAddedString <em>Added String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Added String</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getAddedString()
	 * @see #getAddStringToRuleKeyword()
	 * @generated
	 */
	EAttribute getAddStringToRuleKeyword_AddedString();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#isIsHead <em>Is Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Head</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#isIsHead()
	 * @see #getAddStringToRuleKeyword()
	 * @generated
	 */
	EAttribute getAddStringToRuleKeyword_IsHead();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr <em>Add Optionality To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToAttr
	 * @generated
	 */
	EClass getAddOptionalityToAttr();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport <em>Remove Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Import</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport
	 * @generated
	 */
	EClass getRemoveImport();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport#getImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport#getImport()
	 * @see #getRemoveImport()
	 * @generated
	 */
	EAttribute getRemoveImport_Import();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword <em>Add Alternative Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alternative Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword
	 * @generated
	 */
	EClass getAddAlternativeKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getCurrentKeyword <em>Current Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getCurrentKeyword()
	 * @see #getAddAlternativeKeyword()
	 * @generated
	 */
	EAttribute getAddAlternativeKeyword_CurrentKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword#getNewKeyword()
	 * @see #getAddAlternativeKeyword()
	 * @generated
	 */
	EAttribute getAddAlternativeKeyword_NewKeyword();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword <em>Add Optionality To Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword
	 * @generated
	 */
	EClass getAddOptionalityToKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToKeyword#getKeyword()
	 * @see #getAddOptionalityToKeyword()
	 * @generated
	 */
	EAttribute getAddOptionalityToKeyword_Keyword();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr <em>Add Braces To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Braces To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr
	 * @generated
	 */
	EClass getAddBracesToAttr();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase <em>Keyword Upper To Lower Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Upper To Lower Case</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase
	 * @generated
	 */
	EClass getKeywordUpperToLowerCase();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordUpperToLowerCase#getKeyword()
	 * @see #getKeywordUpperToLowerCase()
	 * @generated
	 */
	EAttribute getKeywordUpperToLowerCase_Keyword();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSquareBracketToAttr <em>Add Square Bracket To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Square Bracket To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSquareBracketToAttr
	 * @generated
	 */
	EClass getAddSquareBracketToAttr();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces <em>Add Optionality To Outermost Braces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Outermost Braces</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces
	 * @generated
	 */
	EClass getAddOptionalityToOutermostBraces();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces#getMultiplicity()
	 * @see #getAddOptionalityToOutermostBraces()
	 * @generated
	 */
	EAttribute getAddOptionalityToOutermostBraces_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr <em>Add Symbol To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Symbol To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr
	 * @generated
	 */
	EClass getAddSymbolToAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getNewSymbol <em>New Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getNewSymbol()
	 * @see #getAddSymbolToAttr()
	 * @generated
	 */
	EAttribute getAddSymbolToAttr_NewSymbol();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getIgnoredAttributes <em>Ignored Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Ignored Attributes</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getIgnoredAttributes()
	 * @see #getAddSymbolToAttr()
	 * @generated
	 */
	EAttribute getAddSymbolToAttr_IgnoredAttributes();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isIsHead <em>Is Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Head</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isIsHead()
	 * @see #getAddSymbolToAttr()
	 * @generated
	 */
	EAttribute getAddSymbolToAttr_IsHead();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyCommonRule <em>Only Common Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Common Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyCommonRule()
	 * @see #getAddSymbolToAttr()
	 * @generated
	 */
	EAttribute getAddSymbolToAttr_OnlyCommonRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyUpperBoundOne <em>Only Upper Bound One</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Upper Bound One</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#isOnlyUpperBoundOne()
	 * @see #getAddSymbolToAttr()
	 * @generated
	 */
	EAttribute getAddSymbolToAttr_OnlyUpperBoundOne();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType <em>Add Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Primitive Type</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType
	 * @generated
	 */
	EClass getAddPrimitiveType();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getMetaclass <em>Metaclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Metaclass</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getMetaclass()
	 * @see #getAddPrimitiveType()
	 * @generated
	 */
	EAttribute getAddPrimitiveType_Metaclass();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getBody()
	 * @see #getAddPrimitiveType()
	 * @generated
	 */
	EAttribute getAddPrimitiveType_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getAnnotation()
	 * @see #getAddPrimitiveType()
	 * @generated
	 */
	EAttribute getAddPrimitiveType_Annotation();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule <em>Add Symbol To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Symbol To Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule
	 * @generated
	 */
	EClass getAddSymbolToRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule#getSymbol()
	 * @see #getAddSymbolToRule()
	 * @generated
	 */
	EAttribute getAddSymbolToRule_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule#getBInside <em>BInside</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>BInside</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToRule#getBInside()
	 * @see #getAddSymbolToRule()
	 * @generated
	 */
	EAttribute getAddSymbolToRule_BInside();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine <em>Add Keyword To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Keyword To Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine
	 * @generated
	 */
	EClass getAddKeywordToLine();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine#getNewKeyword()
	 * @see #getAddKeywordToLine()
	 * @generated
	 */
	EAttribute getAddKeywordToLine_NewKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine#isIsHead <em>Is Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Head</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine#isIsHead()
	 * @see #getAddKeywordToLine()
	 * @generated
	 */
	EAttribute getAddKeywordToLine_IsHead();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes <em>Add Parentheses Without Quotes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Parentheses Without Quotes</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes
	 * @generated
	 */
	EClass getAddParenthesesWithoutQuotes();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getKeyword()
	 * @see #getAddParenthesesWithoutQuotes()
	 * @generated
	 */
	EAttribute getAddParenthesesWithoutQuotes_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getScope()
	 * @see #getAddParenthesesWithoutQuotes()
	 * @generated
	 */
	EAttribute getAddParenthesesWithoutQuotes_Scope();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getMultiplicity()
	 * @see #getAddParenthesesWithoutQuotes()
	 * @generated
	 */
	EAttribute getAddParenthesesWithoutQuotes_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol <em>Add Optionality To Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol
	 * @generated
	 */
	EClass getAddOptionalityToSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol#getTargetSymbol <em>Target Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToSymbol#getTargetSymbol()
	 * @see #getAddOptionalityToSymbol()
	 * @generated
	 */
	EAttribute getAddOptionalityToSymbol_TargetSymbol();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine <em>Add Symbol To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Symbol To Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine
	 * @generated
	 */
	EClass getAddSymbolToLine();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine#getNewSymbol <em>New Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine#getNewSymbol()
	 * @see #getAddSymbolToLine()
	 * @generated
	 */
	EAttribute getAddSymbolToLine_NewSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine#isIsFront <em>Is Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToLine#isIsFront()
	 * @see #getAddSymbolToLine()
	 * @generated
	 */
	EAttribute getAddSymbolToLine_IsFront();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine <em>Add Symbol Without Quote To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Symbol Without Quote To Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine
	 * @generated
	 */
	EClass getAddSymbolWithoutQuoteToLine();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#getNewSymbol <em>New Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#getNewSymbol()
	 * @see #getAddSymbolWithoutQuoteToLine()
	 * @generated
	 */
	EAttribute getAddSymbolWithoutQuoteToLine_NewSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#isIsFront <em>Is Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToLine#isIsFront()
	 * @see #getAddSymbolWithoutQuoteToLine()
	 * @generated
	 */
	EAttribute getAddSymbolWithoutQuoteToLine_IsFront();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB <em>Change ABto BAB</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change ABto BAB</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB
	 * @generated
	 */
	EClass getChangeABtoBAB();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB#getAttrA <em>Attr A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr A</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB#getAttrA()
	 * @see #getChangeABtoBAB()
	 * @generated
	 */
	EAttribute getChangeABtoBAB_AttrA();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB#getAttrB <em>Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr B</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABtoBAB#getAttrB()
	 * @see #getChangeABtoBAB()
	 * @generated
	 */
	EAttribute getChangeABtoBAB_AttrB();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB <em>Copy Attr ATo Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Attr ATo Attr B</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB
	 * @generated
	 */
	EClass getCopyAttrAToAttrB();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrA <em>Attr A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr A</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrA()
	 * @see #getCopyAttrAToAttrB()
	 * @generated
	 */
	EAttribute getCopyAttrAToAttrB_AttrA();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrB <em>Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr B</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#getAttrB()
	 * @see #getCopyAttrAToAttrB()
	 * @generated
	 */
	EAttribute getCopyAttrAToAttrB_AttrB();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#isIsFront <em>Is Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyAttrAToAttrB#isIsFront()
	 * @see #getCopyAttrAToAttrB()
	 * @generated
	 */
	EAttribute getCopyAttrAToAttrB_IsFront();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY <em>Copy Xfrom Star To Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copy Xfrom Star To Y</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY
	 * @generated
	 */
	EClass getCopyXfromStarToY();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY#getAttrInX <em>Attr In X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr In X</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY#getAttrInX()
	 * @see #getCopyXfromStarToY()
	 * @generated
	 */
	EAttribute getCopyXfromStarToY_AttrInX();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY#getAttrInY <em>Attr In Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr In Y</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY#getAttrInY()
	 * @see #getCopyXfromStarToY()
	 * @generated
	 */
	EAttribute getCopyXfromStarToY_AttrInY();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY#isIsFront <em>Is Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.CopyXfromStarToY#isIsFront()
	 * @see #getCopyXfromStarToY()
	 * @generated
	 */
	EAttribute getCopyXfromStarToY_IsFront();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToTwo <em>Convert1to Star To Two</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert1to Star To Two</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert1toStarToTwo
	 * @generated
	 */
	EClass getConvert1toStarToTwo();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA <em>Change ATo Optional Aor A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change ATo Optional Aor A</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToOptionalAorA
	 * @generated
	 */
	EClass getChangeAToOptionalAorA();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule <em>Add Terminal Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Terminal Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule
	 * @generated
	 */
	EClass getAddTerminalRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule#getBody <em>Body</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Body</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule#getBody()
	 * @see #getAddTerminalRule()
	 * @generated
	 */
	EAttribute getAddTerminalRule_Body();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotation</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddTerminalRule#getAnnotation()
	 * @see #getAddTerminalRule()
	 * @generated
	 */
	EAttribute getAddTerminalRule_Annotation();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToLine <em>Add Optionality To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToLine
	 * @generated
	 */
	EClass getAddOptionalityToLine();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToLine <em>Add Braces To Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Braces To Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToLine
	 * @generated
	 */
	EClass getAddBracesToLine();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule <em>Add Parentheses Without Quote To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Parentheses Without Quote To Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule
	 * @generated
	 */
	EClass getAddParenthesesWithoutQuoteToRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuoteToRule#getMultiplicity()
	 * @see #getAddParenthesesWithoutQuoteToRule()
	 * @generated
	 */
	EAttribute getAddParenthesesWithoutQuoteToRule_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol <em>Add Alternative Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alternative Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol
	 * @generated
	 */
	EClass getAddAlternativeSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getCurrentSymbol <em>Current Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Current Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getCurrentSymbol()
	 * @see #getAddAlternativeSymbol()
	 * @generated
	 */
	EAttribute getAddAlternativeSymbol_CurrentSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getNewSymbol <em>New Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSymbol#getNewSymbol()
	 * @see #getAddAlternativeSymbol()
	 * @generated
	 */
	EAttribute getAddAlternativeSymbol_NewSymbol();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA <em>Change AB To ABor BA</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change AB To ABor BA</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA
	 * @generated
	 */
	EClass getChangeABToABorBA();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA#getAttrA <em>Attr A</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr A</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA#getAttrA()
	 * @see #getChangeABToABorBA()
	 * @generated
	 */
	EAttribute getChangeABToABorBA_AttrA();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA#getAttrB <em>Attr B</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Attr B</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeABToABorBA#getAttrB()
	 * @see #getChangeABToABorBA()
	 * @generated
	 */
	EAttribute getChangeABToABorBA_AttrB();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword <em>Add Symbol Without Quote To Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Symbol Without Quote To Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword
	 * @generated
	 */
	EClass getAddSymbolWithoutQuoteToKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword#getKeyword()
	 * @see #getAddSymbolWithoutQuoteToKeyword()
	 * @generated
	 */
	EAttribute getAddSymbolWithoutQuoteToKeyword_Keyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword#getSymbol()
	 * @see #getAddSymbolWithoutQuoteToKeyword()
	 * @generated
	 */
	EAttribute getAddSymbolWithoutQuoteToKeyword_Symbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword#isIsFront <em>Is Front</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Front</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolWithoutQuoteToKeyword#isIsFront()
	 * @see #getAddSymbolWithoutQuoteToKeyword()
	 * @generated
	 */
	EAttribute getAddSymbolWithoutQuoteToKeyword_IsFront();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity <em>Change Attribute Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Attribute Multiplicity</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity
	 * @generated
	 */
	EClass getChangeAttributeMultiplicity();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getStartAttr <em>Start Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getStartAttr()
	 * @see #getChangeAttributeMultiplicity()
	 * @generated
	 */
	EAttribute getChangeAttributeMultiplicity_StartAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getEndAttr <em>End Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getEndAttr()
	 * @see #getChangeAttributeMultiplicity()
	 * @generated
	 */
	EAttribute getChangeAttributeMultiplicity_EndAttr();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getMultiplicity <em>Multiplicity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multiplicity</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity#getMultiplicity()
	 * @see #getChangeAttributeMultiplicity()
	 * @generated
	 */
	EAttribute getChangeAttributeMultiplicity_Multiplicity();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBooleanAttrToSpecialPattern <em>Change Boolean Attr To Special Pattern</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Boolean Attr To Special Pattern</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBooleanAttrToSpecialPattern
	 * @generated
	 */
	EClass getChangeBooleanAttrToSpecialPattern();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeToSingleElementOrBracedList <em>Change Attribute To Single Element Or Braced List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Attribute To Single Element Or Braced List</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeToSingleElementOrBracedList
	 * @generated
	 */
	EClass getChangeAttributeToSingleElementOrBracedList();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns <em>Change Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Returns</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns
	 * @generated
	 */
	EClass getChangeReturns();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns#getNewReturns <em>New Returns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Returns</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeReturns#getNewReturns()
	 * @see #getChangeReturns()
	 * @generated
	 */
	EAttribute getChangeReturns_NewReturns();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue <em>Add Alternative Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alternative Value</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue
	 * @generated
	 */
	EClass getAddAlternativeValue();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#isIsEnum <em>Is Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Enum</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#isIsEnum()
	 * @see #getAddAlternativeValue()
	 * @generated
	 */
	EAttribute getAddAlternativeValue_IsEnum();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#getNewValue <em>New Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>New Value</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeValue#getNewValue()
	 * @see #getAddAlternativeValue()
	 * @generated
	 */
	EAttribute getAddAlternativeValue_NewValue();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol <em>Change ATo Aor Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change ATo Aor Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol
	 * @generated
	 */
	EClass getChangeAToAorSymbol();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol#getSymbol <em>Symbol</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Symbol</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAToAorSymbol#getSymbol()
	 * @see #getChangeAToAorSymbol()
	 * @generated
	 */
	EAttribute getChangeAToAorSymbol_Symbol();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass <em>Add Alternative Sub Class To Abstract Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alternative Sub Class To Abstract Class</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass
	 * @generated
	 */
	EClass getAddAlternativeSubClassToAbstractClass();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass#getNewAlternativeSubClass <em>New Alternative Sub Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Alternative Sub Class</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeSubClassToAbstractClass#getNewAlternativeSubClass()
	 * @see #getAddAlternativeSubClassToAbstractClass()
	 * @generated
	 */
	EAttribute getAddAlternativeSubClassToAbstractClass_NewAlternativeSubClass();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToRule <em>Add Braces To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Braces To Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToRule
	 * @generated
	 */
	EClass getAddBracesToRule();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum <em>Remove Literal From Enum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Literal From Enum</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum
	 * @generated
	 */
	EClass getRemoveLiteralFromEnum();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum#getLiteralName <em>Literal Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Literal Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveLiteralFromEnum#getLiteralName()
	 * @see #getRemoveLiteralFromEnum()
	 * @generated
	 */
	EAttribute getRemoveLiteralFromEnum_LiteralName();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.Convert0toStarTo0toStaror1toStar <em>Convert0to Star To0to Staror1to Star</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Convert0to Star To0to Staror1to Star</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.Convert0toStarTo0toStaror1toStar
	 * @generated
	 */
	EClass getConvert0toStarTo0toStaror1toStar();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction <em>Remove Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Action</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAction
	 * @generated
	 */
	EClass getRemoveAction();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule <em>Add Call To Other Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Call To Other Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule
	 * @generated
	 */
	EClass getAddCallToOtherRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#getNameOfOtherClass <em>Name Of Other Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name Of Other Class</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#getNameOfOtherClass()
	 * @see #getAddCallToOtherRule()
	 * @generated
	 */
	EAttribute getAddCallToOtherRule_NameOfOtherClass();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#isCallRequired <em>Call Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Call Required</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddCallToOtherRule#isCallRequired()
	 * @see #getAddCallToOtherRule()
	 * @generated
	 */
	EAttribute getAddCallToOtherRule_CallRequired();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty <em>Set Ast Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Ast Property</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty
	 * @generated
	 */
	EClass getSetAstProperty();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#getClassName <em>Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#getClassName()
	 * @see #getSetAstProperty()
	 * @generated
	 */
	EAttribute getSetAstProperty_ClassName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#getPropertyName <em>Property Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#getPropertyName()
	 * @see #getSetAstProperty()
	 * @generated
	 */
	EAttribute getSetAstProperty_PropertyName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#getPropertyValue <em>Property Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Property Value</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#getPropertyValue()
	 * @see #getSetAstProperty()
	 * @generated
	 */
	EAttribute getSetAstProperty_PropertyValue();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#isMulti <em>Multi</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Multi</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.SetAstProperty#isMulti()
	 * @see #getSetAstProperty()
	 * @generated
	 */
	EAttribute getSetAstProperty_Multi();

	/**
	 * Returns the meta object for enum '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey <em>Scope Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Key</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
	 * @generated
	 */
	EEnum getScopeKey();

	/**
	 * Returns the meta object for enum '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey <em>Multiplicity Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Multiplicity Key</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
	 * @generated
	 */
	EEnum getMultiplicityKey();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	OptimizationruleFactory getOptimizationruleFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl <em>Optimization Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getOptimizationRule()
		 * @generated
		 */
		EClass OPTIMIZATION_RULE = eINSTANCE.getOptimizationRule();

		/**
		 * The meta object literal for the '<em><b>Grammar</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTIMIZATION_RULE__GRAMMAR = eINSTANCE.getOptimizationRule_Grammar();

		/**
		 * The meta object literal for the '<em><b>Grammar Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_RULE__GRAMMAR_RULE = eINSTANCE.getOptimizationRule_GrammarRule();

		/**
		 * The meta object literal for the '<em><b>Attr Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_RULE__ATTR_NAME = eINSTANCE.getOptimizationRule_AttrName();

		/**
		 * The meta object literal for the '<em><b>Apply</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OPTIMIZATION_RULE___APPLY = eINSTANCE.getOptimizationRule__Apply();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl <em>Remove Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveBraces()
		 * @generated
		 */
		EClass REMOVE_BRACES = eINSTANCE.getRemoveBraces();

		/**
		 * The meta object literal for the '<em><b>Target Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BRACES__TARGET_ATTRIBUTE = eINSTANCE.getRemoveBraces_TargetAttribute();

		/**
		 * The meta object literal for the '<em><b>Excluded Grammar Rule</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BRACES__EXCLUDED_GRAMMAR_RULE = eINSTANCE.getRemoveBraces_ExcludedGrammarRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl <em>Add Keyword To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddKeywordToAttr()
		 * @generated
		 */
		EClass ADD_KEYWORD_TO_ATTR = eINSTANCE.getAddKeywordToAttr();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_ATTR__NEW_KEYWORD = eINSTANCE.getAddKeywordToAttr_NewKeyword();

		/**
		 * The meta object literal for the '<em><b>Is Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_ATTR__IS_HEAD = eINSTANCE.getAddKeywordToAttr_IsHead();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl <em>Remove Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveKeyword()
		 * @generated
		 */
		EClass REMOVE_KEYWORD = eINSTANCE.getRemoveKeyword();

		/**
		 * The meta object literal for the '<em><b>Keyword Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_KEYWORD__KEYWORD_NAME = eINSTANCE.getRemoveKeyword_KeywordName();

		/**
		 * The meta object literal for the '<em><b>Target Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_KEYWORD__TARGET_ATTRIBUTE = eINSTANCE.getRemoveKeyword_TargetAttribute();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl <em>Rename Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRenameKeyword()
		 * @generated
		 */
		EClass RENAME_KEYWORD = eINSTANCE.getRenameKeyword();

		/**
		 * The meta object literal for the '<em><b>Current Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_KEYWORD__CURRENT_KEYWORD = eINSTANCE.getRenameKeyword_CurrentKeyword();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_KEYWORD__NEW_KEYWORD = eINSTANCE.getRenameKeyword_NewKeyword();

		/**
		 * The meta object literal for the '<em><b>Target Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_KEYWORD__TARGET_ATTRIBUTE = eINSTANCE.getRenameKeyword_TargetAttribute();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToStarImpl <em>Convert1to Star To Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToStarImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarToStar()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO_STAR = eINSTANCE.getConvert1toStarToStar();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToPlusImpl <em>Convert1to Star To Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToPlusImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarToPlus()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO_PLUS = eINSTANCE.getConvert1toStarToPlus();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl <em>Change Optional Attr To Or Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeOptionalAttrToOrRelation()
		 * @generated
		 */
		EClass CHANGE_OPTIONAL_ATTR_TO_OR_RELATION = eINSTANCE.getChangeOptionalAttrToOrRelation();

		/**
		 * The meta object literal for the '<em><b>Is All</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__IS_ALL = eINSTANCE.getChangeOptionalAttrToOrRelation_IsAll();

		/**
		 * The meta object literal for the '<em><b>Start Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__START_ATTR = eINSTANCE.getChangeOptionalAttrToOrRelation_StartAttr();

		/**
		 * The meta object literal for the '<em><b>End Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__END_ATTR = eINSTANCE.getChangeOptionalAttrToOrRelation_EndAttr();

		/**
		 * The meta object literal for the '<em><b>Excluded Grammar Rule</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_OPTIONAL_ATTR_TO_OR_RELATION__EXCLUDED_GRAMMAR_RULE = eINSTANCE.getChangeOptionalAttrToOrRelation_ExcludedGrammarRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl <em>Remove XStar Attr Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveXStarAttrKeyword()
		 * @generated
		 */
		EClass REMOVE_XSTAR_ATTR_KEYWORD = eINSTANCE.getRemoveXStarAttrKeyword();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_XSTAR_ATTR_KEYWORD__ATTRIBUTES = eINSTANCE.getRemoveXStarAttrKeyword_Attributes();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCommaImpl <em>Remove Comma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCommaImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveComma()
		 * @generated
		 */
		EClass REMOVE_COMMA = eINSTANCE.getRemoveComma();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_COMMA__ATTRIBUTES = eINSTANCE.getRemoveComma_Attributes();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl <em>Move Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getMoveLine()
		 * @generated
		 */
		EClass MOVE_LINE = eINSTANCE.getMoveLine();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_LINE__SOURCE = eINSTANCE.getMoveLine_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_LINE__TARGET = eINSTANCE.getMoveLine_Target();

		/**
		 * The meta object literal for the '<em><b>Is Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_LINE__IS_HEAD = eINSTANCE.getMoveLine_IsHead();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleImpl <em>Remove Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveRule()
		 * @generated
		 */
		EClass REMOVE_RULE = eINSTANCE.getRemoveRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1ToStarTo1Impl <em>Convert1 To Star To1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1ToStarTo1Impl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1ToStarTo1()
		 * @generated
		 */
		EClass CONVERT1_TO_STAR_TO1 = eINSTANCE.getConvert1ToStarTo1();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl <em>Remove Rule Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveRuleCall()
		 * @generated
		 */
		EClass REMOVE_RULE_CALL = eINSTANCE.getRemoveRuleCall();

		/**
		 * The meta object literal for the '<em><b>Called Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_RULE_CALL__CALLED_RULE_NAME = eINSTANCE.getRemoveRuleCall_CalledRuleName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl <em>Add Keyword After Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddKeywordAfterKeyword()
		 * @generated
		 */
		EClass ADD_KEYWORD_AFTER_KEYWORD = eINSTANCE.getAddKeywordAfterKeyword();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD = eINSTANCE.getAddKeywordAfterKeyword_NewKeyword();

		/**
		 * The meta object literal for the '<em><b>Current Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_AFTER_KEYWORD__CURRENT_KEYWORD = eINSTANCE.getAddKeywordAfterKeyword_CurrentKeyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl <em>Change Type Of Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeTypeOfAttr()
		 * @generated
		 */
		EClass CHANGE_TYPE_OF_ATTR = eINSTANCE.getChangeTypeOfAttr();

		/**
		 * The meta object literal for the '<em><b>Current Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE_OF_ATTR__CURRENT_TYPE = eINSTANCE.getChangeTypeOfAttr_CurrentType();

		/**
		 * The meta object literal for the '<em><b>New Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE_OF_ATTR__NEW_TYPE = eINSTANCE.getChangeTypeOfAttr_NewType();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesToAttrImpl <em>Add Parentheses To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesToAttr()
		 * @generated
		 */
		EClass ADD_PARENTHESES_TO_ATTR = eINSTANCE.getAddParenthesesToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttributeImpl <em>Remove Parentheses In Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttributeImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveParenthesesInAttribute()
		 * @generated
		 */
		EClass REMOVE_PARENTHESES_IN_ATTRIBUTE = eINSTANCE.getRemoveParenthesesInAttribute();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl <em>Add Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddImport()
		 * @generated
		 */
		EClass ADD_IMPORT = eINSTANCE.getAddImport();

		/**
		 * The meta object literal for the '<em><b>New Import</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_IMPORT__NEW_IMPORT = eINSTANCE.getAddImport_NewImport();

		/**
		 * The meta object literal for the '<em><b>Nick Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_IMPORT__NICK_NAME = eINSTANCE.getAddImport_NickName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveAttribute()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTE = eINSTANCE.getRemoveAttribute();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl <em>Change Attr Line Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAttrLineContent()
		 * @generated
		 */
		EClass CHANGE_ATTR_LINE_CONTENT = eINSTANCE.getChangeAttrLineContent();

		/**
		 * The meta object literal for the '<em><b>New Line Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ATTR_LINE_CONTENT__NEW_LINE_CONTENT = eINSTANCE.getChangeAttrLineContent_NewLineContent();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameRuleImpl <em>Rename Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRenameRule()
		 * @generated
		 */
		EClass RENAME_RULE = eINSTANCE.getRenameRule();

		/**
		 * The meta object literal for the '<em><b>Current Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_RULE__CURRENT_NAME = eINSTANCE.getRenameRule_CurrentName();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_RULE__NEW_NAME = eINSTANCE.getRenameRule_NewName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl <em>Remove Attribute Keywords</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveAttributeKeywords()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTE_KEYWORDS = eINSTANCE.getRemoveAttributeKeywords();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl <em>Remove Optionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveOptionality()
		 * @generated
		 */
		EClass REMOVE_OPTIONALITY = eINSTANCE.getRemoveOptionality();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl <em>Change Braces To Parentheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBracesToParentheses()
		 * @generated
		 */
		EClass CHANGE_BRACES_TO_PARENTHESES = eINSTANCE.getChangeBracesToParentheses();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl <em>Change Braces To Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBracesToSquare()
		 * @generated
		 */
		EClass CHANGE_BRACES_TO_SQUARE = eINSTANCE.getChangeBracesToSquare();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl <em>Change Braces To Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBracesToAngle()
		 * @generated
		 */
		EClass CHANGE_BRACES_TO_ANGLE = eINSTANCE.getChangeBracesToAngle();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl <em>Remove Outermost Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveOutermostBraces()
		 * @generated
		 */
		EClass REMOVE_OUTERMOST_BRACES = eINSTANCE.getRemoveOutermostBraces();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl <em>Convert1to Star To1or Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarTo1orStar()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO1OR_STAR = eINSTANCE.getConvert1toStarTo1orStar();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl <em>Remove Braces Except Outermost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveBracesExceptOutermost()
		 * @generated
		 */
		EClass REMOVE_BRACES_EXCEPT_OUTERMOST = eINSTANCE.getRemoveBracesExceptOutermost();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl <em>Remove Certain Type From Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveCertainTypeFromAttr()
		 * @generated
		 */
		EClass REMOVE_CERTAIN_TYPE_FROM_ATTR = eINSTANCE.getRemoveCertainTypeFromAttr();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE = eINSTANCE.getRemoveCertainTypeFromAttr_Type();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl <em>Change Rule Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeRuleContent()
		 * @generated
		 */
		EClass CHANGE_RULE_CONTENT = eINSTANCE.getChangeRuleContent();

		/**
		 * The meta object literal for the '<em><b>New Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_RULE_CONTENT__NEW_CONTENT = eINSTANCE.getChangeRuleContent_NewContent();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleImpl <em>Change Called Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeCalledRule()
		 * @generated
		 */
		EClass CHANGE_CALLED_RULE = eINSTANCE.getChangeCalledRule();

		/**
		 * The meta object literal for the '<em><b>Current Called Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CALLED_RULE__CURRENT_CALLED_RULE = eINSTANCE.getChangeCalledRule_CurrentCalledRule();

		/**
		 * The meta object literal for the '<em><b>New Called Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CALLED_RULE__NEW_CALLED_RULE = eINSTANCE.getChangeCalledRule_NewCalledRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl <em>Change Comma To Other Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeCommaToOtherSymbol()
		 * @generated
		 */
		EClass CHANGE_COMMA_TO_OTHER_SYMBOL = eINSTANCE.getChangeCommaToOtherSymbol();

		/**
		 * The meta object literal for the '<em><b>New Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_COMMA_TO_OTHER_SYMBOL__NEW_SYMBOL = eINSTANCE.getChangeCommaToOtherSymbol_NewSymbol();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveAttrToAfterRuleKeywordImpl <em>Move Attr To After Rule Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveAttrToAfterRuleKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getMoveAttrToAfterRuleKeyword()
		 * @generated
		 */
		EClass MOVE_ATTR_TO_AFTER_RULE_KEYWORD = eINSTANCE.getMoveAttrToAfterRuleKeyword();

		/**
		 * The meta object literal for the '<em><b>Moved Line</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE = eINSTANCE.getMoveAttrToAfterRuleKeyword_MovedLine();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl <em>Add String To Rule Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddStringToRuleKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddStringToRuleKeyword()
		 * @generated
		 */
		EClass ADD_STRING_TO_RULE_KEYWORD = eINSTANCE.getAddStringToRuleKeyword();

		/**
		 * The meta object literal for the '<em><b>Target Attribute</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_STRING_TO_RULE_KEYWORD__TARGET_ATTRIBUTE = eINSTANCE.getAddStringToRuleKeyword_TargetAttribute();

		/**
		 * The meta object literal for the '<em><b>Added String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_STRING_TO_RULE_KEYWORD__ADDED_STRING = eINSTANCE.getAddStringToRuleKeyword_AddedString();

		/**
		 * The meta object literal for the '<em><b>Is Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_STRING_TO_RULE_KEYWORD__IS_HEAD = eINSTANCE.getAddStringToRuleKeyword_IsHead();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToAttrImpl <em>Add Optionality To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToAttr()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_ATTR = eINSTANCE.getAddOptionalityToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveImportImpl <em>Remove Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveImportImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveImport()
		 * @generated
		 */
		EClass REMOVE_IMPORT = eINSTANCE.getRemoveImport();

		/**
		 * The meta object literal for the '<em><b>Import</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_IMPORT__IMPORT = eINSTANCE.getRemoveImport_Import();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeKeywordImpl <em>Add Alternative Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeKeyword()
		 * @generated
		 */
		EClass ADD_ALTERNATIVE_KEYWORD = eINSTANCE.getAddAlternativeKeyword();

		/**
		 * The meta object literal for the '<em><b>Current Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_KEYWORD__CURRENT_KEYWORD = eINSTANCE.getAddAlternativeKeyword_CurrentKeyword();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD = eINSTANCE.getAddAlternativeKeyword_NewKeyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl <em>Add Optionality To Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToKeyword()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_KEYWORD = eINSTANCE.getAddOptionalityToKeyword();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_OPTIONALITY_TO_KEYWORD__KEYWORD = eINSTANCE.getAddOptionalityToKeyword_Keyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl <em>Add Braces To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddBracesToAttr()
		 * @generated
		 */
		EClass ADD_BRACES_TO_ATTR = eINSTANCE.getAddBracesToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl <em>Keyword Upper To Lower Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getKeywordUpperToLowerCase()
		 * @generated
		 */
		EClass KEYWORD_UPPER_TO_LOWER_CASE = eINSTANCE.getKeywordUpperToLowerCase();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_UPPER_TO_LOWER_CASE__KEYWORD = eINSTANCE.getKeywordUpperToLowerCase_Keyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl <em>Add Square Bracket To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSquareBracketToAttr()
		 * @generated
		 */
		EClass ADD_SQUARE_BRACKET_TO_ATTR = eINSTANCE.getAddSquareBracketToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl <em>Add Optionality To Outermost Braces</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToOutermostBraces()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_OUTERMOST_BRACES = eINSTANCE.getAddOptionalityToOutermostBraces();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_OPTIONALITY_TO_OUTERMOST_BRACES__MULTIPLICITY = eINSTANCE.getAddOptionalityToOutermostBraces_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl <em>Add Symbol To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolToAttr()
		 * @generated
		 */
		EClass ADD_SYMBOL_TO_ATTR = eINSTANCE.getAddSymbolToAttr();

		/**
		 * The meta object literal for the '<em><b>New Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_ATTR__NEW_SYMBOL = eINSTANCE.getAddSymbolToAttr_NewSymbol();

		/**
		 * The meta object literal for the '<em><b>Ignored Attributes</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_ATTR__IGNORED_ATTRIBUTES = eINSTANCE.getAddSymbolToAttr_IgnoredAttributes();

		/**
		 * The meta object literal for the '<em><b>Is Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_ATTR__IS_HEAD = eINSTANCE.getAddSymbolToAttr_IsHead();

		/**
		 * The meta object literal for the '<em><b>Only Common Rule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE = eINSTANCE.getAddSymbolToAttr_OnlyCommonRule();

		/**
		 * The meta object literal for the '<em><b>Only Upper Bound One</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE = eINSTANCE.getAddSymbolToAttr_OnlyUpperBoundOne();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl <em>Add Primitive Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddPrimitiveType()
		 * @generated
		 */
		EClass ADD_PRIMITIVE_TYPE = eINSTANCE.getAddPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Metaclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMITIVE_TYPE__METACLASS = eINSTANCE.getAddPrimitiveType_Metaclass();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMITIVE_TYPE__BODY = eINSTANCE.getAddPrimitiveType_Body();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMITIVE_TYPE__ANNOTATION = eINSTANCE.getAddPrimitiveType_Annotation();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl <em>Add Symbol To Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolToRule()
		 * @generated
		 */
		EClass ADD_SYMBOL_TO_RULE = eINSTANCE.getAddSymbolToRule();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_RULE__SYMBOL = eINSTANCE.getAddSymbolToRule_Symbol();

		/**
		 * The meta object literal for the '<em><b>BInside</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_RULE__BINSIDE = eINSTANCE.getAddSymbolToRule_BInside();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl <em>Add Keyword To Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddKeywordToLine()
		 * @generated
		 */
		EClass ADD_KEYWORD_TO_LINE = eINSTANCE.getAddKeywordToLine();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_LINE__NEW_KEYWORD = eINSTANCE.getAddKeywordToLine_NewKeyword();

		/**
		 * The meta object literal for the '<em><b>Is Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_LINE__IS_HEAD = eINSTANCE.getAddKeywordToLine_IsHead();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl <em>Add Parentheses Without Quotes</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesWithoutQuotes()
		 * @generated
		 */
		EClass ADD_PARENTHESES_WITHOUT_QUOTES = eINSTANCE.getAddParenthesesWithoutQuotes();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD = eINSTANCE.getAddParenthesesWithoutQuotes_Keyword();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE = eINSTANCE.getAddParenthesesWithoutQuotes_Scope();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY = eINSTANCE.getAddParenthesesWithoutQuotes_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToSymbolImpl <em>Add Optionality To Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToSymbolImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToSymbol()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_SYMBOL = eINSTANCE.getAddOptionalityToSymbol();

		/**
		 * The meta object literal for the '<em><b>Target Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_OPTIONALITY_TO_SYMBOL__TARGET_SYMBOL = eINSTANCE.getAddOptionalityToSymbol_TargetSymbol();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToLineImpl <em>Add Symbol To Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolToLine()
		 * @generated
		 */
		EClass ADD_SYMBOL_TO_LINE = eINSTANCE.getAddSymbolToLine();

		/**
		 * The meta object literal for the '<em><b>New Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_LINE__NEW_SYMBOL = eINSTANCE.getAddSymbolToLine_NewSymbol();

		/**
		 * The meta object literal for the '<em><b>Is Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_LINE__IS_FRONT = eINSTANCE.getAddSymbolToLine_IsFront();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToLineImpl <em>Add Symbol Without Quote To Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolWithoutQuoteToLine()
		 * @generated
		 */
		EClass ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE = eINSTANCE.getAddSymbolWithoutQuoteToLine();

		/**
		 * The meta object literal for the '<em><b>New Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__NEW_SYMBOL = eINSTANCE.getAddSymbolWithoutQuoteToLine_NewSymbol();

		/**
		 * The meta object literal for the '<em><b>Is Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_WITHOUT_QUOTE_TO_LINE__IS_FRONT = eINSTANCE.getAddSymbolWithoutQuoteToLine_IsFront();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABtoBABImpl <em>Change ABto BAB</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABtoBABImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeABtoBAB()
		 * @generated
		 */
		EClass CHANGE_ABTO_BAB = eINSTANCE.getChangeABtoBAB();

		/**
		 * The meta object literal for the '<em><b>Attr A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ABTO_BAB__ATTR_A = eINSTANCE.getChangeABtoBAB_AttrA();

		/**
		 * The meta object literal for the '<em><b>Attr B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ABTO_BAB__ATTR_B = eINSTANCE.getChangeABtoBAB_AttrB();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl <em>Copy Attr ATo Attr B</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyAttrAToAttrBImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getCopyAttrAToAttrB()
		 * @generated
		 */
		EClass COPY_ATTR_ATO_ATTR_B = eINSTANCE.getCopyAttrAToAttrB();

		/**
		 * The meta object literal for the '<em><b>Attr A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_ATTR_ATO_ATTR_B__ATTR_A = eINSTANCE.getCopyAttrAToAttrB_AttrA();

		/**
		 * The meta object literal for the '<em><b>Attr B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_ATTR_ATO_ATTR_B__ATTR_B = eINSTANCE.getCopyAttrAToAttrB_AttrB();

		/**
		 * The meta object literal for the '<em><b>Is Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_ATTR_ATO_ATTR_B__IS_FRONT = eINSTANCE.getCopyAttrAToAttrB_IsFront();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl <em>Copy Xfrom Star To Y</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.CopyXfromStarToYImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getCopyXfromStarToY()
		 * @generated
		 */
		EClass COPY_XFROM_STAR_TO_Y = eINSTANCE.getCopyXfromStarToY();

		/**
		 * The meta object literal for the '<em><b>Attr In X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_XFROM_STAR_TO_Y__ATTR_IN_X = eINSTANCE.getCopyXfromStarToY_AttrInX();

		/**
		 * The meta object literal for the '<em><b>Attr In Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_XFROM_STAR_TO_Y__ATTR_IN_Y = eINSTANCE.getCopyXfromStarToY_AttrInY();

		/**
		 * The meta object literal for the '<em><b>Is Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPY_XFROM_STAR_TO_Y__IS_FRONT = eINSTANCE.getCopyXfromStarToY_IsFront();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToTwoImpl <em>Convert1to Star To Two</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToTwoImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert1toStarToTwo()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO_TWO = eINSTANCE.getConvert1toStarToTwo();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToOptionalAorAImpl <em>Change ATo Optional Aor A</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToOptionalAorAImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAToOptionalAorA()
		 * @generated
		 */
		EClass CHANGE_ATO_OPTIONAL_AOR_A = eINSTANCE.getChangeAToOptionalAorA();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddTerminalRuleImpl <em>Add Terminal Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddTerminalRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddTerminalRule()
		 * @generated
		 */
		EClass ADD_TERMINAL_RULE = eINSTANCE.getAddTerminalRule();

		/**
		 * The meta object literal for the '<em><b>Body</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TERMINAL_RULE__BODY = eINSTANCE.getAddTerminalRule_Body();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_TERMINAL_RULE__ANNOTATION = eINSTANCE.getAddTerminalRule_Annotation();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToLineImpl <em>Add Optionality To Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddOptionalityToLine()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_LINE = eINSTANCE.getAddOptionalityToLine();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToLineImpl <em>Add Braces To Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddBracesToLine()
		 * @generated
		 */
		EClass ADD_BRACES_TO_LINE = eINSTANCE.getAddBracesToLine();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuoteToRuleImpl <em>Add Parentheses Without Quote To Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuoteToRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesWithoutQuoteToRule()
		 * @generated
		 */
		EClass ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE = eINSTANCE.getAddParenthesesWithoutQuoteToRule();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PARENTHESES_WITHOUT_QUOTE_TO_RULE__MULTIPLICITY = eINSTANCE.getAddParenthesesWithoutQuoteToRule_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSymbolImpl <em>Add Alternative Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSymbolImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeSymbol()
		 * @generated
		 */
		EClass ADD_ALTERNATIVE_SYMBOL = eINSTANCE.getAddAlternativeSymbol();

		/**
		 * The meta object literal for the '<em><b>Current Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_SYMBOL__CURRENT_SYMBOL = eINSTANCE.getAddAlternativeSymbol_CurrentSymbol();

		/**
		 * The meta object literal for the '<em><b>New Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_SYMBOL__NEW_SYMBOL = eINSTANCE.getAddAlternativeSymbol_NewSymbol();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABToABorBAImpl <em>Change AB To ABor BA</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeABToABorBAImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeABToABorBA()
		 * @generated
		 */
		EClass CHANGE_AB_TO_ABOR_BA = eINSTANCE.getChangeABToABorBA();

		/**
		 * The meta object literal for the '<em><b>Attr A</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_AB_TO_ABOR_BA__ATTR_A = eINSTANCE.getChangeABToABorBA_AttrA();

		/**
		 * The meta object literal for the '<em><b>Attr B</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_AB_TO_ABOR_BA__ATTR_B = eINSTANCE.getChangeABToABorBA_AttrB();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl <em>Add Symbol Without Quote To Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolWithoutQuoteToKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddSymbolWithoutQuoteToKeyword()
		 * @generated
		 */
		EClass ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD = eINSTANCE.getAddSymbolWithoutQuoteToKeyword();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__KEYWORD = eINSTANCE.getAddSymbolWithoutQuoteToKeyword_Keyword();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__SYMBOL = eINSTANCE.getAddSymbolWithoutQuoteToKeyword_Symbol();

		/**
		 * The meta object literal for the '<em><b>Is Front</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_WITHOUT_QUOTE_TO_KEYWORD__IS_FRONT = eINSTANCE.getAddSymbolWithoutQuoteToKeyword_IsFront();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl <em>Change Attribute Multiplicity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAttributeMultiplicity()
		 * @generated
		 */
		EClass CHANGE_ATTRIBUTE_MULTIPLICITY = eINSTANCE.getChangeAttributeMultiplicity();

		/**
		 * The meta object literal for the '<em><b>Start Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR = eINSTANCE.getChangeAttributeMultiplicity_StartAttr();

		/**
		 * The meta object literal for the '<em><b>End Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR = eINSTANCE.getChangeAttributeMultiplicity_EndAttr();

		/**
		 * The meta object literal for the '<em><b>Multiplicity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY = eINSTANCE.getChangeAttributeMultiplicity_Multiplicity();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBooleanAttrToSpecialPatternImpl <em>Change Boolean Attr To Special Pattern</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBooleanAttrToSpecialPatternImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeBooleanAttrToSpecialPattern()
		 * @generated
		 */
		EClass CHANGE_BOOLEAN_ATTR_TO_SPECIAL_PATTERN = eINSTANCE.getChangeBooleanAttrToSpecialPattern();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeToSingleElementOrBracedListImpl <em>Change Attribute To Single Element Or Braced List</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeToSingleElementOrBracedListImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAttributeToSingleElementOrBracedList()
		 * @generated
		 */
		EClass CHANGE_ATTRIBUTE_TO_SINGLE_ELEMENT_OR_BRACED_LIST = eINSTANCE.getChangeAttributeToSingleElementOrBracedList();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeReturnsImpl <em>Change Returns</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeReturnsImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeReturns()
		 * @generated
		 */
		EClass CHANGE_RETURNS = eINSTANCE.getChangeReturns();

		/**
		 * The meta object literal for the '<em><b>New Returns</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_RETURNS__NEW_RETURNS = eINSTANCE.getChangeReturns_NewReturns();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeValueImpl <em>Add Alternative Value</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeValueImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeValue()
		 * @generated
		 */
		EClass ADD_ALTERNATIVE_VALUE = eINSTANCE.getAddAlternativeValue();

		/**
		 * The meta object literal for the '<em><b>Is Enum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_VALUE__IS_ENUM = eINSTANCE.getAddAlternativeValue_IsEnum();

		/**
		 * The meta object literal for the '<em><b>New Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_VALUE__NEW_VALUE = eINSTANCE.getAddAlternativeValue_NewValue();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToAorSymbolImpl <em>Change ATo Aor Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAToAorSymbolImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getChangeAToAorSymbol()
		 * @generated
		 */
		EClass CHANGE_ATO_AOR_SYMBOL = eINSTANCE.getChangeAToAorSymbol();

		/**
		 * The meta object literal for the '<em><b>Symbol</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_ATO_AOR_SYMBOL__SYMBOL = eINSTANCE.getChangeAToAorSymbol_Symbol();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSubClassToAbstractClassImpl <em>Add Alternative Sub Class To Abstract Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddAlternativeSubClassToAbstractClassImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddAlternativeSubClassToAbstractClass()
		 * @generated
		 */
		EClass ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS = eINSTANCE.getAddAlternativeSubClassToAbstractClass();

		/**
		 * The meta object literal for the '<em><b>New Alternative Sub Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_SUB_CLASS_TO_ABSTRACT_CLASS__NEW_ALTERNATIVE_SUB_CLASS = eINSTANCE.getAddAlternativeSubClassToAbstractClass_NewAlternativeSubClass();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToRuleImpl <em>Add Braces To Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddBracesToRule()
		 * @generated
		 */
		EClass ADD_BRACES_TO_RULE = eINSTANCE.getAddBracesToRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveLiteralFromEnumImpl <em>Remove Literal From Enum</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveLiteralFromEnumImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveLiteralFromEnum()
		 * @generated
		 */
		EClass REMOVE_LITERAL_FROM_ENUM = eINSTANCE.getRemoveLiteralFromEnum();

		/**
		 * The meta object literal for the '<em><b>Literal Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_LITERAL_FROM_ENUM__LITERAL_NAME = eINSTANCE.getRemoveLiteralFromEnum_LiteralName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert0toStarTo0toStaror1toStarImpl <em>Convert0to Star To0to Staror1to Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert0toStarTo0toStaror1toStarImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getConvert0toStarTo0toStaror1toStar()
		 * @generated
		 */
		EClass CONVERT0TO_STAR_TO0TO_STAROR1TO_STAR = eINSTANCE.getConvert0toStarTo0toStaror1toStar();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveActionImpl <em>Remove Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveActionImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getRemoveAction()
		 * @generated
		 */
		EClass REMOVE_ACTION = eINSTANCE.getRemoveAction();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddCallToOtherRuleImpl <em>Add Call To Other Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddCallToOtherRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddCallToOtherRule()
		 * @generated
		 */
		EClass ADD_CALL_TO_OTHER_RULE = eINSTANCE.getAddCallToOtherRule();

		/**
		 * The meta object literal for the '<em><b>Name Of Other Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CALL_TO_OTHER_RULE__NAME_OF_OTHER_CLASS = eINSTANCE.getAddCallToOtherRule_NameOfOtherClass();

		/**
		 * The meta object literal for the '<em><b>Call Required</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_CALL_TO_OTHER_RULE__CALL_REQUIRED = eINSTANCE.getAddCallToOtherRule_CallRequired();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl <em>Set Ast Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.SetAstPropertyImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getSetAstProperty()
		 * @generated
		 */
		EClass SET_AST_PROPERTY = eINSTANCE.getSetAstProperty();

		/**
		 * The meta object literal for the '<em><b>Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_AST_PROPERTY__CLASS_NAME = eINSTANCE.getSetAstProperty_ClassName();

		/**
		 * The meta object literal for the '<em><b>Property Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_AST_PROPERTY__PROPERTY_NAME = eINSTANCE.getSetAstProperty_PropertyName();

		/**
		 * The meta object literal for the '<em><b>Property Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_AST_PROPERTY__PROPERTY_VALUE = eINSTANCE.getSetAstProperty_PropertyValue();

		/**
		 * The meta object literal for the '<em><b>Multi</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SET_AST_PROPERTY__MULTI = eINSTANCE.getSetAstProperty_Multi();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey <em>Scope Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getScopeKey()
		 * @generated
		 */
		EEnum SCOPE_KEY = eINSTANCE.getScopeKey();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey <em>Multiplicity Key</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getMultiplicityKey()
		 * @generated
		 */
		EEnum MULTIPLICITY_KEY = eINSTANCE.getMultiplicityKey();

	}

} //OptimizationrulePackage
