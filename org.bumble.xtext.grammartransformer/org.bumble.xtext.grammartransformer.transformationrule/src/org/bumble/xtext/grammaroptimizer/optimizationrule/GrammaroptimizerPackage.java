/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule;

import org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptionalAttrToOrRelationImpl;
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
 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory
 * @model kind="package"
 * @generated
 */
public interface GrammaroptimizerPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammaroptimizer";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://grammaroptimizer/DSL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammaroptimizer";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammaroptimizerPackage eINSTANCE = org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl <em>Optimization Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getOptimizationRule()
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
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTIMIZATION_RULE__GRAMMAR_RULE_NAME = 1;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl <em>Remove Bracket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveBracket()
	 * @generated
	 */
	int REMOVE_BRACKET = 1;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Only Exist Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET__ONLY_EXIST_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Excluded Grammar Rule</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET__EXCLUDED_GRAMMAR_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;
	
	/**
	 * The number of structural features of the '<em>Remove Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl <em>Add Keyword To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordToAttr()
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
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The feature id for the '<em><b>Only Exist Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR__ONLY_EXIST_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Add Keyword To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToRuleImpl <em>Add Keyword To Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordToRule()
	 * @generated
	 */
	int ADD_KEYWORD_TO_RULE = 3;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Head</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE__IS_HEAD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Keyword To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Keyword To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl <em>Remove Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveKeyword()
	 * @generated
	 */
	int REMOVE_KEYWORD = 4;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The feature id for the '<em><b>Only Exist Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORD__ONLY_EXIST_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeKeywordImpl <em>Change Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRenameKeyword()
	 * @generated
	 */
	int RENAME_KEYWORD = 5;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Old Keyword Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__CURRENT_KEYWORD_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Keyword Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__NEW_KEYWORD_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Only Exist Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_KEYWORD__TARGET_ATTRIBUTE = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Change Keyword</em>' class.
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
	 * The number of operations of the '<em>Change Keyword</em>' class.
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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1toStarToStar()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO_STAR = 6;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_STAR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1toStarToPlus()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO_PLUS = 7;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO_PLUS__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptOfAttrToOrInRuleImpl <em>Change Opt Of Attr To Or In Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptOfAttrToOrInRuleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeOptOfAttrToOrInRule()
	 * @generated
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE = 8;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Opt Of Attr To Or In Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Opt Of Attr To Or In Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl <em>Remove XStar Attr Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveXStarAttrKeyword()
	 * @generated
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD = 9;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_XSTAR_ATTR_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	int REMOVE_XSTAR_ATTR_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveComma()
	 * @generated
	 */
	int REMOVE_COMMA = 10;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_COMMA__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getMoveLine()
	 * @generated
	 */
	int MOVE_LINE = 11;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_LINE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveRule()
	 * @generated
	 */
	int REMOVE_RULE = 12;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1ToStarTo1()
	 * @generated
	 */
	int CONVERT1_TO_STAR_TO1 = 13;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1_TO_STAR_TO1__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl <em>Remove Rule Calling</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveRuleCall()
	 * @generated
	 */
	int REMOVE_RULE_CALL = 14;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The number of structural features of the '<em>Remove Rule Calling</em>' class.
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
	 * The number of operations of the '<em>Remove Rule Calling</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_RULE_CALL_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.InsertKeywordAfterExistingKeywordImpl <em>Insert Keyword After Existing Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.InsertKeywordAfterExistingKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getInsertKeywordAfterExistingKeyword()
	 * @generated
	 */
	int ADD_ALTERNATIVE_KEYWORD = 15;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_KEYWORD_AFTER_EXISTING_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_KEYWORD_AFTER_EXISTING_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_KEYWORD_AFTER_EXISTING_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Existing Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_ALTERNATIVE_KEYWORD__EXISTING_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Insert Keyword After Existing Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_KEYWORD_AFTER_EXISTING_KEYWORD_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_KEYWORD_AFTER_EXISTING_KEYWORD___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Insert Keyword After Existing Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERT_KEYWORD_AFTER_EXISTING_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl <em>Change Type Of Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeTypeOfAttr()
	 * @generated
	 */
	int CHANGE_TYPE_OF_ATTR = 16;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Old Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__OLD_TYPE_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_TYPE_OF_ATTR__NEW_TYPE_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddParenthesesToAttr()
	 * @generated
	 */
	int ADD_PARENTHESES_TO_ATTR = 17;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_TO_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttribute <em>Remove Parentheses In Specified Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttribute
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveParenthesesInSpecifiedAttr()
	 * @generated
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR = 18;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Parentheses In Specified Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Parentheses In Specified Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_PARENTHESES_IN_SPECIFIED_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl <em>Add Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddImport()
	 * @generated
	 */
	int ADD_IMPORT = 19;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Import String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT__IMPORT_STRING = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_IMPORT_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

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
	 * The meta object id for the '{@link grammaroptimizer.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammaroptimizer.impl.RemoveAttributeImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveAttribute()
	 * @generated
	 */
	int REMOVE_ATTRIBUTE = 20;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_ATTRIBUTE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeAttrLineContent()
	 * @generated
	 */
	int CHANGE_ATTR_LINE_CONTENT = 21;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_ATTR_LINE_CONTENT__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleNameImpl <em>Change Rule Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleNameImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRenameRule()
	 * @generated
	 */
	int RENAME_RULE = 22;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_NAME__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_NAME__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_NAME__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Old Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__OLD_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RENAME_RULE__NEW_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Rule Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_NAME_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_NAME___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Rule Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_NAME_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl <em>Remove Keywords Of All Attrs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveKeywordsOfAllAttrs()
	 * @generated
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS = 23;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Keywords Of All Attrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Keywords Of All Attrs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_KEYWORDS_OF_ALL_ATTRS_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl <em>Remove Optionality</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveOptionality()
	 * @generated
	 */
	int REMOVE_OPTIONALITY = 24;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OPTIONALITY__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl <em>Change Bracket To Parentheses</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeBracketToParentheses()
	 * @generated
	 */
	int CHANGE_BRACKET_TO_PARENTHESES = 25;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_PARENTHESES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_PARENTHESES__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_PARENTHESES__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Bracket To Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_PARENTHESES_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_PARENTHESES___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Bracket To Parentheses</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_PARENTHESES_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl <em>Change Bracket To Square</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeBracketToSquare()
	 * @generated
	 */
	int CHANGE_BRACKET_TO_SQUARE = 26;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_SQUARE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_SQUARE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_SQUARE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Bracket To Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_SQUARE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_SQUARE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Bracket To Square</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_SQUARE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl <em>Change Bracket To Angle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeBracketToAngle()
	 * @generated
	 */
	int CHANGE_BRACKET_TO_ANGLE = 27;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_ANGLE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_ANGLE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_ANGLE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Bracket To Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_ANGLE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_ANGLE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Bracket To Angle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_BRACKET_TO_ANGLE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl <em>Remove Outer Most Bracket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveOutermostBracket()
	 * @generated
	 */
	int REMOVE_OUTER_MOST_BRACKET = 28;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTER_MOST_BRACKET__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTER_MOST_BRACKET__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTER_MOST_BRACKET__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Outer Most Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTER_MOST_BRACKET_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTER_MOST_BRACKET___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Outer Most Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_OUTER_MOST_BRACKET_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl <em>Convert1to Star To1or Star</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1toStarTo1orStar()
	 * @generated
	 */
	int CONVERT1TO_STAR_TO1OR_STAR = 29;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONVERT1TO_STAR_TO1OR_STAR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl <em>Remove Bracket Except Outermost</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveBracketExceptOutermost()
	 * @generated
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST = 30;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Remove Bracket Except Outermost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Remove Bracket Except Outermost</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_BRACKET_EXCEPT_OUTERMOST_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl <em>Remove Certain Type From Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveCertainTypeFromAttr()
	 * @generated
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR = 31;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Type Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE_NAME = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToCommaImpl <em>Add Optionality To Comma</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToCommaImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToComma()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_COMMA = 32;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_COMMA__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_COMMA__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_COMMA__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Optionality To Comma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_COMMA_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_COMMA___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Comma</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_COMMA_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl <em>Change Rule Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeRuleContent()
	 * @generated
	 */
	int CHANGE_RULE_CONTENT = 33;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_RULE_CONTENT__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleNameImpl <em>Change Called Rule Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleNameImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeCalledRule()
	 * @generated
	 */
	int CHANGE_CALLED_RULE = 34;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_NAME__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_NAME__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_NAME__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Old Called Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__CURRENT_CALLED_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Called Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE__NEW_CALLED_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Change Called Rule Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_NAME_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_NAME___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Called Rule Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_CALLED_RULE_NAME_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl <em>Change Comma To Other Symbol</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeCommaToOtherSymbol()
	 * @generated
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL = 35;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_COMMA_TO_OTHER_SYMBOL__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getMoveAttrToAfterRuleKeyword()
	 * @generated
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD = 36;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MOVE_ATTR_TO_AFTER_RULE_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddStringToRuleKeyword()
	 * @generated
	 */
	int ADD_STRING_TO_RULE_KEYWORD = 37;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Only Exist Attr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_STRING_TO_RULE_KEYWORD__ONLY_EXIST_ATTR = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToAttr()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_ATTR = 38;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveImport()
	 * @generated
	 */
	int REMOVE_IMPORT = 39;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Import String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REMOVE_IMPORT__IMPORT_STRING = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToKeywordImpl <em>Add Keyword To Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordAfterKeyword()
	 * @generated
	 */
	int ADD_KEYWORD_AFTER_KEYWORD = 40;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Existing Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__EXISTING_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>New Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Add Keyword To Keyword</em>' class.
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
	 * The number of operations of the '<em>Add Keyword To Keyword</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_AFTER_KEYWORD_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl <em>Add Optionality To Keyword</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToKeyword()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_KEYWORD = 41;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_KEYWORD__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl <em>Add Bracket To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddBracketToAttr()
	 * @generated
	 */
	int ADD_BRACKET_TO_ATTR = 42;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACKET_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACKET_TO_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACKET_TO_ATTR__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Bracket To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACKET_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACKET_TO_ATTR___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Bracket To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_BRACKET_TO_ATTR_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl <em>Keyword Upper To Lower Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getKeywordUpperToLowerCase()
	 * @generated
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE = 43;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_UPPER_TO_LOWER_CASE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordLowerToUpperCaseImpl <em>Keyword Lower To Upper Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordLowerToUpperCaseImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getKeywordLowerToUpperCase()
	 * @generated
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE = 44;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE__KEYWORD = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Keyword Lower To Upper Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Keyword Lower To Upper Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORD_LOWER_TO_UPPER_CASE_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl <em>Add Square Bracket To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddSquareBracketToAttr()
	 * @generated
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR = 45;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SQUARE_BRACKET_TO_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl <em>Add Optionality To Outer Most Bracket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToOutermostBracket()
	 * @generated
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET = 46;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Add Optionality To Outer Most Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Add Optionality To Outer Most Bracket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOutermostBracketToParenthesisImpl <em>Change Outer Most Bracket To Parenthesis</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOutermostBracketToParenthesisImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeOutermostBracketToParenthesis()
	 * @generated
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS = 47;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The number of structural features of the '<em>Change Outer Most Bracket To Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Apply</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS___APPLY = OPTIMIZATION_RULE___APPLY;

	/**
	 * The number of operations of the '<em>Change Outer Most Bracket To Parenthesis</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS_OPERATION_COUNT = OPTIMIZATION_RULE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl <em>Add Symbol To Attr</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddSymbolToAttr()
	 * @generated
	 */
	int ADD_SYMBOL_TO_ATTR = 48;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The feature id for the '<em><b>Avoid Attrs</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__AVOID_ATTRS = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Only Common Rule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__ONLY_COMMON_RULE = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Only Upper Bound One</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR__ONLY_UPPER_BOUND_ONE = OPTIMIZATION_RULE_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Add Symbol To Attr</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_ATTR_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 4;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddPrimitiveType()
	 * @generated
	 */
	int ADD_PRIMITIVE_TYPE = 49;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

	/**
	 * The feature id for the '<em><b>Attr Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__ATTR_NAME = OPTIMIZATION_RULE__ATTR_NAME;

	/**
	 * The feature id for the '<em><b>Primitive Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE__PRIMITIVE_TYPE = OPTIMIZATION_RULE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Add Primitive Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PRIMITIVE_TYPE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddSymbolToRule()
	 * @generated
	 */
	int ADD_SYMBOL_TO_RULE = 50;

	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The number of structural features of the '<em>Add Symbol To Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_SYMBOL_TO_RULE_FEATURE_COUNT = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

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
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordToLine()
	 * @generated
	 */
	int ADD_KEYWORD_TO_LINE = 51;

	/**
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl <em>Add Parentheses Without Quotes</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getAddParenthesesWithoutQuotes()
	 * @generated
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES = 52;
	
	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * The feature id for the '<em><b>Line</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__LINE = OPTIMIZATION_RULE_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE = OPTIMIZATION_RULE_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey <em>Scope Key</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.OptimizationrulePackageImpl#getScopeKey()
	 * @generated
	 */
	int SCOPE_KEY = 53;
	
	/**
	 * The feature id for the '<em><b>Grammar</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__GRAMMAR = OPTIMIZATION_RULE__GRAMMAR;

	/**
	 * The feature id for the '<em><b>Grammar Rule Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADD_KEYWORD_TO_LINE__GRAMMAR_RULE_NAME = OPTIMIZATION_RULE__GRAMMAR_RULE_NAME;

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammarRuleName <em>Grammar Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Grammar Rule Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationRule#getGrammarRuleName()
	 * @see #getOptimizationRule()
	 * @generated
	 */
	EAttribute getOptimizationRule_GrammarRuleName();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces <em>Remove Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Bracket</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces
	 * @generated
	 */
	EClass getRemoveBracket();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getOnlyExistAttr <em>Only Exist Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Exist Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getOnlyExistAttr()
	 * @see #getRemoveBracket()
	 * @generated
	 */
	EAttribute getRemoveBracket_OnlyExistAttr();

	/**
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getExcludedGrammarRule <em>Excluded Grammar Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Excluded Grammar Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBraces#getExcludedGrammarRule()
	 * @see #getRemoveBracket()
	 * @generated
	 */
	EAttribute getRemoveBracket_ExcludedGrammarRule();
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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#getOnlyExistAttr <em>Only Exist Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Exist Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr#getOnlyExistAttr()
	 * @see #getAddKeywordToAttr()
	 * @generated
	 */
	EAttribute getAddKeywordToAttr_OnlyExistAttr();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule <em>Add Keyword To Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Keyword To Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule
	 * @generated
	 */
	EClass getAddKeywordToRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule#getNewKeyword()
	 * @see #getAddKeywordToRule()
	 * @generated
	 */
	EAttribute getAddKeywordToRule_NewKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule#isIsHead <em>Is Head</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Head</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToRule#isIsHead()
	 * @see #getAddKeywordToRule()
	 * @generated
	 */
	EAttribute getAddKeywordToRule_IsHead();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getOnlyExistAttr <em>Only Exist Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Exist Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveKeyword#getOnlyExistAttr()
	 * @see #getRemoveKeyword()
	 * @generated
	 */
	EAttribute getRemoveKeyword_OnlyExistAttr();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword <em>Change Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword
	 * @generated
	 */
	EClass getRenameKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword#getOldKeywordName <em>Old Keyword Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Keyword Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword#getOldKeywordName()
	 * @see #getRenameKeyword()
	 * @generated
	 */
	EAttribute getRenameKeyword_CurrentKeywordName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword#getNewKeywordName <em>New Keyword Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword#getNewKeywordName()
	 * @see #getRenameKeyword()
	 * @generated
	 */
	EAttribute getRenameKeyword_NewKeywordName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword#getOnlyExistAttr <em>Only Exist Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Exist Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeKeyword#getOnlyExistAttr()
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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptOfAttrToOrInRule <em>Change Opt Of Attr To Or In Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Opt Of Attr To Or In Rule</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOptOfAttrToOrInRule
	 * @generated
	 */
	EClass getChangeOptionalAttrToOrRelation();

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
	 * @return the meta object for class '<em>Remove Rule Call/em>'.
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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword <em>Add Alternative Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Alternative Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddAlternativeKeyword
	 * @generated
	 */
	EClass getAddAlternativeKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.InsertKeywordAfterExistingKeyword#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.InsertKeywordAfterExistingKeyword#getNewKeyword()
	 * @see #getInsertKeywordAfterExistingKeyword()
	 * @generated
	 */
	EAttribute getInsertKeywordAfterExistingKeyword_NewKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.InsertKeywordAfterExistingKeyword#getExistingKeyword <em>Existing Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.InsertKeywordAfterExistingKeyword#getExistingKeyword()
	 * @see #getInsertKeywordAfterExistingKeyword()
	 * @generated
	 */
	EAttribute getInsertKeywordAfterExistingKeyword_ExistingKeyword();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getOldTypeName <em>Old Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Type Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getOldTypeName()
	 * @see #getChangeTypeOfAttr()
	 * @generated
	 */
	EAttribute getChangeTypeOfAttr_OldTypeName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getNewTypeName <em>New Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Type Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeTypeOfAttr#getNewTypeName()
	 * @see #getChangeTypeOfAttr()
	 * @generated
	 */
	EAttribute getChangeTypeOfAttr_NewTypeName();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInAttribute <em>Remove Parentheses In Specified Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Parentheses In Specified Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveParenthesesInAttribute
	 * @generated
	 */
	EClass getRemoveParenthesesInSpecifiedAttr();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getImportString <em>Import String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import String</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport#getImportString()
	 * @see #getAddImport()
	 * @generated
	 */
	EAttribute getAddImport_ImportString();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleName <em>Change Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Rule Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleName
	 * @generated
	 */
	EClass getRenameRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleName#getOldName <em>Old Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleName#getOldName()
	 * @see #getRenameRule()
	 * @generated
	 */
	EAttribute getRenameRule_OldName();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleName#getNewName <em>New Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeRuleName#getNewName()
	 * @see #getRenameRule()
	 * @generated
	 */
	EAttribute getRenameRule_NewName();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords <em>Remove Keywords Of All Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Keywords Of All Attrs</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveAttributeKeywords
	 * @generated
	 */
	EClass getRemoveKeywordsOfAllAttrs();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToParentheses <em>Change Bracket To Parentheses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Bracket To Parentheses</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToParentheses
	 * @generated
	 */
	EClass getChangeBracketToParentheses();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare <em>Change Bracket To Square</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Bracket To Square</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToSquare
	 * @generated
	 */
	EClass getChangeBracketToSquare();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToAngle <em>Change Bracket To Angle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Bracket To Angle</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeBracesToAngle
	 * @generated
	 */
	EClass getChangeBracketToAngle();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces <em>Remove Outer Most Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Outer Most Bracket</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveOutermostBraces
	 * @generated
	 */
	EClass getRemoveOutermostBracket();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost <em>Remove Bracket Except Outermost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Remove Bracket Except Outermost</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveBracesExceptOutermost
	 * @generated
	 */
	EClass getRemoveBracketExceptOutermost();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr#getTypeName <em>Type Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveCertainTypeFromAttr#getTypeName()
	 * @see #getRemoveCertainTypeFromAttr()
	 * @generated
	 */
	EAttribute getRemoveCertainTypeFromAttr_TypeName();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToComma <em>Add Optionality To Comma</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Comma</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToComma
	 * @generated
	 */
	EClass getAddOptionalityToComma();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRuleName <em>Change Called Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Called Rule Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRuleName
	 * @generated
	 */
	EClass getChangeCalledRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRuleName#getOldCalledRuleName <em>Old Called Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Called Rule Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRuleName#getOldCalledRuleName()
	 * @see #getChangeCalledRule()
	 * @generated
	 */
	EAttribute getChangeCalledRule_CurrentCalledRule();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRuleName#getNewCalledRuleName <em>New Called Rule Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Called Rule Name</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeCalledRuleName#getNewCalledRuleName()
	 * @see #getChangeCalledRule()
	 * @generated
	 */
	EAttribute getChangeCalledRule_NewCalledRuleName();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getOnlyExistAttr <em>Only Exist Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Only Exist Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddStringToRuleKeyword#getOnlyExistAttr()
	 * @see #getAddStringToRuleKeyword()
	 * @generated
	 */
	EAttribute getAddStringToRuleKeyword_OnlyExistAttr();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport#getImportString <em>Import String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Import String</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveImport#getImportString()
	 * @see #getRemoveImport()
	 * @generated
	 */
	EAttribute getRemoveImport_ImportString();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToKeyword <em>Add Keyword To Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Keyword To Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToKeyword
	 * @generated
	 */
	EClass getAddKeywordAfterKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToKeyword#getExistingKeyword <em>Existing Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Existing Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToKeyword#getExistingKeyword()
	 * @see #getAddKeywordAfterKeyword()
	 * @generated
	 */
	EAttribute getAddKeywordAfterKeyword_ExistingKeyword();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToKeyword#getNewKeyword <em>New Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToKeyword#getNewKeyword()
	 * @see #getAddKeywordAfterKeyword()
	 * @generated
	 */
	EAttribute getAddKeywordAfterKeyword_NewKeyword();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr <em>Add Bracket To Attr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Bracket To Attr</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddBracesToAttr
	 * @generated
	 */
	EClass getAddBracketToAttr();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordLowerToUpperCase <em>Keyword Lower To Upper Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keyword Lower To Upper Case</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordLowerToUpperCase
	 * @generated
	 */
	EClass getKeywordLowerToUpperCase();

	/**
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordLowerToUpperCase#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.KeywordLowerToUpperCase#getKeyword()
	 * @see #getKeywordLowerToUpperCase()
	 * @generated
	 */
	EAttribute getKeywordLowerToUpperCase_Keyword();

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
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces <em>Add Optionality To Outer Most Bracket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Add Optionality To Outer Most Bracket</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddOptionalityToOutermostBraces
	 * @generated
	 */
	EClass getAddOptionalityToOutermostBracket();

	/**
	 * Returns the meta object for class '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOutermostBracketToParenthesis <em>Change Outer Most Bracket To Parenthesis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Change Outer Most Bracket To Parenthesis</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeOutermostBracketToParenthesis
	 * @generated
	 */
	EClass getChangeOutermostBracketToParenthesis();

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
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getAvoidAttrs <em>Avoid Attrs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Avoid Attrs</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddSymbolToAttr#getAvoidAttrs()
	 * @see #getAddSymbolToAttr()
	 * @generated
	 */
	EAttribute getAddSymbolToAttr_AvoidAttrs();

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
	 * Returns the meta object for the attribute '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getPrimitiveType <em>Primitive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Primitive Type</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType#getPrimitiveType()
	 * @see #getAddPrimitiveType()
	 * @generated
	 */
	EAttribute getAddPrimitiveType_PrimitiveType();

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
	 * Returns the meta object for the attribute list '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes#getLine()
	 * @see #getAddParenthesesWithoutQuotes()
	 * @generated
	 */
	EAttribute getAddParenthesesWithoutQuotes_Line();

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
	 * Returns the meta object for enum '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey <em>Scope Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Scope Key</em>'.
	 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey
	 * @generated
	 */
	EEnum getScopeKey();
	
	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammaroptimizerFactory getGrammaroptimizerFactory();

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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getOptimizationRule()
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
		 * The meta object literal for the '<em><b>Grammar Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTIMIZATION_RULE__GRAMMAR_RULE_NAME = eINSTANCE.getOptimizationRule_GrammarRuleName();

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
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl <em>Remove Bracket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveBracket()
		 * @generated
		 */
		EClass REMOVE_BRACKET = eINSTANCE.getRemoveBracket();

		/**
		 * The meta object literal for the '<em><b>Only Exist Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BRACKET__ONLY_EXIST_ATTR = eINSTANCE.getRemoveBracket_OnlyExistAttr();

		/**
		 * The meta object literal for the '<em><b>Excluded Grammar Rule</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_BRACKET__EXCLUDED_GRAMMAR_RULE = eINSTANCE.getRemoveBracket_ExcludedGrammarRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl <em>Add Keyword To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordToAttr()
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
		 * The meta object literal for the '<em><b>Only Exist Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_ATTR__ONLY_EXIST_ATTR = eINSTANCE.getAddKeywordToAttr_OnlyExistAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToRuleImpl <em>Add Keyword To Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordToRule()
		 * @generated
		 */
		EClass ADD_KEYWORD_TO_RULE = eINSTANCE.getAddKeywordToRule();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_RULE__NEW_KEYWORD = eINSTANCE.getAddKeywordToRule_NewKeyword();

		/**
		 * The meta object literal for the '<em><b>Is Head</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_TO_RULE__IS_HEAD = eINSTANCE.getAddKeywordToRule_IsHead();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl <em>Remove Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveKeyword()
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
		 * The meta object literal for the '<em><b>Only Exist Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_KEYWORD__ONLY_EXIST_ATTR = eINSTANCE.getRemoveKeyword_OnlyExistAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl <em>Rename Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RenameKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRenameKeyword()
		 * @generated
		 */
		EClass RENAME_KEYWORD = eINSTANCE.getRenameKeyword();

		/**
		 * The meta object literal for the '<em><b>Current Keyword Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_KEYWORD__CURRENT_KEYWORD_NAME = eINSTANCE.getRenameKeyword_CurrentKeywordName();

		/**
		 * The meta object literal for the '<em><b>New Keyword Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RENAME_KEYWORD__NEW_KEYWORD_NAME = eINSTANCE.getRenameKeyword_NewKeywordName();

		/**
		 * The meta object literal for the '<em><b>Only Exist Attr</b></em>' attribute feature.
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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1toStarToStar()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO_STAR = eINSTANCE.getConvert1toStarToStar();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToPlusImpl <em>Convert1to Star To Plus</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarToPlusImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1toStarToPlus()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO_PLUS = eINSTANCE.getConvert1toStarToPlus();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptOfAttrToOrInRuleImpl <em>Change Opt Of Attr To Or In Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOptOfAttrToOrInRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeOptOfAttrToOrInRule()
		 * @generated
		 */
		EClass CHANGE_OPT_OF_ATTR_TO_OR_IN_RULE = eINSTANCE.getChangeOptionalAttrToOrRelation();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl <em>Remove XStar Attr Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveXStarAttrKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveXStarAttrKeyword()
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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveComma()
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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getMoveLine()
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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveRule()
		 * @generated
		 */
		EClass REMOVE_RULE = eINSTANCE.getRemoveRule();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1ToStarTo1Impl <em>Convert1 To Star To1</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1ToStarTo1Impl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1ToStarTo1()
		 * @generated
		 */
		EClass CONVERT1_TO_STAR_TO1 = eINSTANCE.getConvert1ToStarTo1();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl <em>Remove Rule Call</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveRuleCallImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveRuleCall()
		 * @generated
		 */
		EClass REMOVE_RULE_CALL = eINSTANCE.getRemoveRuleCall();

		/**
		 * The meta object literal for the '<em><b>Called Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_RULE_CALLING__CALLED_RULE_NAME = eINSTANCE.getRemoveRuleCall_CalledRuleName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.InsertKeywordAfterExistingKeywordImpl <em>Insert Keyword After Existing Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.InsertKeywordAfterExistingKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getInsertKeywordAfterExistingKeyword()
		 * @generated
		 */
		EClass ADD_ALTERNATIVE_KEYWORD = eINSTANCE.getAddAlternativeKeyword();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_KEYWORD__NEW_KEYWORD = eINSTANCE.getInsertKeywordAfterExistingKeyword_NewKeyword();

		/**
		 * The meta object literal for the '<em><b>Existing Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_ALTERNATIVE_KEYWORD__EXISTING_KEYWORD = eINSTANCE.getInsertKeywordAfterExistingKeyword_ExistingKeyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl <em>Change Type Of Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeTypeOfAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeTypeOfAttr()
		 * @generated
		 */
		EClass CHANGE_TYPE_OF_ATTR = eINSTANCE.getChangeTypeOfAttr();

		/**
		 * The meta object literal for the '<em><b>Old Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE_OF_ATTR__OLD_TYPE_NAME = eINSTANCE.getChangeTypeOfAttr_OldTypeName();

		/**
		 * The meta object literal for the '<em><b>New Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_TYPE_OF_ATTR__NEW_TYPE_NAME = eINSTANCE.getChangeTypeOfAttr_NewTypeName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesToAttrImpl <em>Add Parentheses To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddParenthesesToAttr()
		 * @generated
		 */
		EClass ADD_PARENTHESES_TO_ATTR = eINSTANCE.getAddParenthesesToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttribute <em>Remove Parentheses In Specified Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveParenthesesInAttribute
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveParenthesesInSpecifiedAttr()
		 * @generated
		 */
		EClass REMOVE_PARENTHESES_IN_SPECIFIED_ATTR = eINSTANCE.getRemoveParenthesesInSpecifiedAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl <em>Add Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddImport()
		 * @generated
		 */
		EClass ADD_IMPORT = eINSTANCE.getAddImport();

		/**
		 * The meta object literal for the '<em><b>Import String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_IMPORT__IMPORT_STRING = eINSTANCE.getAddImport_ImportString();

		/**
		 * The meta object literal for the '{@link grammaroptimizer.impl.RemoveAttributeImpl <em>Remove Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammaroptimizer.impl.RemoveAttributeImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveAttribute()
		 * @generated
		 */
		EClass REMOVE_ATTRIBUTE = eINSTANCE.getRemoveAttribute();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl <em>Change Attr Line Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttrLineContentImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeAttrLineContent()
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
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleNameImpl <em>Change Rule Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleNameImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRenameRule()
		 * @generated
		 */
		EClass CHANGE_RULE_NAME = eINSTANCE.getRenameRule();

		/**
		 * The meta object literal for the '<em><b>Old Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_RULE_NAME__OLD_NAME = eINSTANCE.getRenameRule_OldName();

		/**
		 * The meta object literal for the '<em><b>New Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_RULE_NAME__NEW_NAME = eINSTANCE.getRenameRule_NewName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl <em>Remove Keywords Of All Attrs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveAttributeKeywordsImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveKeywordsOfAllAttrs()
		 * @generated
		 */
		EClass REMOVE_KEYWORDS_OF_ALL_ATTRS = eINSTANCE.getRemoveKeywordsOfAllAttrs();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl <em>Remove Optionality</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOptionalityImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveOptionality()
		 * @generated
		 */
		EClass REMOVE_OPTIONALITY = eINSTANCE.getRemoveOptionality();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl <em>Change Bracket To Parentheses</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToParenthesesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeBracketToParentheses()
		 * @generated
		 */
		EClass CHANGE_BRACKET_TO_PARENTHESES = eINSTANCE.getChangeBracketToParentheses();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl <em>Change Bracket To Square</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToSquareImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeBracketToSquare()
		 * @generated
		 */
		EClass CHANGE_BRACKET_TO_SQUARE = eINSTANCE.getChangeBracketToSquare();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl <em>Change Bracket To Angle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeBracesToAngleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeBracketToAngle()
		 * @generated
		 */
		EClass CHANGE_BRACKET_TO_ANGLE = eINSTANCE.getChangeBracketToAngle();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl <em>Remove Outer Most Bracket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveOutermostBracesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveOutermostBracket()
		 * @generated
		 */
		EClass REMOVE_OUTER_MOST_BRACKET = eINSTANCE.getRemoveOutermostBracket();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl <em>Convert1to Star To1or Star</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.Convert1toStarTo1orStarImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getConvert1toStarTo1orStar()
		 * @generated
		 */
		EClass CONVERT1TO_STAR_TO1OR_STAR = eINSTANCE.getConvert1toStarTo1orStar();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl <em>Remove Bracket Except Outermost</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveBracesExceptOutermostImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveBracketExceptOutermost()
		 * @generated
		 */
		EClass REMOVE_BRACKET_EXCEPT_OUTERMOST = eINSTANCE.getRemoveBracketExceptOutermost();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl <em>Remove Certain Type From Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCertainTypeFromAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveCertainTypeFromAttr()
		 * @generated
		 */
		EClass REMOVE_CERTAIN_TYPE_FROM_ATTR = eINSTANCE.getRemoveCertainTypeFromAttr();

		/**
		 * The meta object literal for the '<em><b>Type Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_CERTAIN_TYPE_FROM_ATTR__TYPE_NAME = eINSTANCE.getRemoveCertainTypeFromAttr_TypeName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToCommaImpl <em>Add Optionality To Comma</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToCommaImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToComma()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_COMMA = eINSTANCE.getAddOptionalityToComma();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl <em>Change Rule Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeRuleContentImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeRuleContent()
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
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleNameImpl <em>Change Called Rule Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCalledRuleNameImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeCalledRule()
		 * @generated
		 */
		EClass CHANGE_CALLED_RULE_NAME = eINSTANCE.getChangeCalledRule();

		/**
		 * The meta object literal for the '<em><b>Old Called Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CALLED_RULE_NAME__OLD_CALLED_RULE_NAME = eINSTANCE.getChangeCalledRule_CurrentCalledRule();

		/**
		 * The meta object literal for the '<em><b>New Called Rule Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHANGE_CALLED_RULE_NAME__NEW_CALLED_RULE_NAME = eINSTANCE.getChangeCalledRule_NewCalledRuleName();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl <em>Change Comma To Other Symbol</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeCommaToOtherSymbolImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeCommaToOtherSymbol()
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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getMoveAttrToAfterRuleKeyword()
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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddStringToRuleKeyword()
		 * @generated
		 */
		EClass ADD_STRING_TO_RULE_KEYWORD = eINSTANCE.getAddStringToRuleKeyword();

		/**
		 * The meta object literal for the '<em><b>Only Exist Attr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_STRING_TO_RULE_KEYWORD__ONLY_EXIST_ATTR = eINSTANCE.getAddStringToRuleKeyword_OnlyExistAttr();

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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToAttr()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_ATTR = eINSTANCE.getAddOptionalityToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveImportImpl <em>Remove Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveImportImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getRemoveImport()
		 * @generated
		 */
		EClass REMOVE_IMPORT = eINSTANCE.getRemoveImport();

		/**
		 * The meta object literal for the '<em><b>Import String</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REMOVE_IMPORT__IMPORT_STRING = eINSTANCE.getRemoveImport_ImportString();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl <em>Add Keyword After Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordAfterKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordAfterKeyword()
		 * @generated
		 */
		EClass ADD_KEYWORD_AFTER_KEYWORD = eINSTANCE.getAddKeywordAfterKeyword();

		/**
		 * The meta object literal for the '<em><b>Existing Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_AFTER_KEYWORD__EXISTING_KEYWORD = eINSTANCE.getAddKeywordAfterKeyword_ExistingKeyword();

		/**
		 * The meta object literal for the '<em><b>New Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_KEYWORD_AFTER_KEYWORD__NEW_KEYWORD = eINSTANCE.getAddKeywordAfterKeyword_NewKeyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl <em>Add Optionality To Keyword</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToKeywordImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToKeyword()
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
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl <em>Add Bracket To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddBracesToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddBracketToAttr()
		 * @generated
		 */
		EClass ADD_BRACKET_TO_ATTR = eINSTANCE.getAddBracketToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl <em>Keyword Upper To Lower Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordUpperToLowerCaseImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getKeywordUpperToLowerCase()
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
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordLowerToUpperCaseImpl <em>Keyword Lower To Upper Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.KeywordLowerToUpperCaseImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getKeywordLowerToUpperCase()
		 * @generated
		 */
		EClass KEYWORD_LOWER_TO_UPPER_CASE = eINSTANCE.getKeywordLowerToUpperCase();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORD_LOWER_TO_UPPER_CASE__KEYWORD = eINSTANCE.getKeywordLowerToUpperCase_Keyword();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl <em>Add Square Bracket To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSquareBracketToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddSquareBracketToAttr()
		 * @generated
		 */
		EClass ADD_SQUARE_BRACKET_TO_ATTR = eINSTANCE.getAddSquareBracketToAttr();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl <em>Add Optionality To Outer Most Bracket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddOptionalityToOutermostBracesImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddOptionalityToOutermostBracket()
		 * @generated
		 */
		EClass ADD_OPTIONALITY_TO_OUTER_MOST_BRACKET = eINSTANCE.getAddOptionalityToOutermostBracket();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOutermostBracketToParenthesisImpl <em>Change Outer Most Bracket To Parenthesis</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeOutermostBracketToParenthesisImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getChangeOutermostBracketToParenthesis()
		 * @generated
		 */
		EClass CHANGE_OUTER_MOST_BRACKET_TO_PARENTHESIS = eINSTANCE.getChangeOutermostBracketToParenthesis();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl <em>Add Symbol To Attr</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToAttrImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddSymbolToAttr()
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
		 * The meta object literal for the '<em><b>Avoid Attrs</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_SYMBOL_TO_ATTR__AVOID_ATTRS = eINSTANCE.getAddSymbolToAttr_AvoidAttrs();

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
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddPrimitiveType()
		 * @generated
		 */
		EClass ADD_PRIMITIVE_TYPE = eINSTANCE.getAddPrimitiveType();

		/**
		 * The meta object literal for the '<em><b>Primitive Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PRIMITIVE_TYPE__PRIMITIVE_TYPE = eINSTANCE.getAddPrimitiveType_PrimitiveType();

		/**
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl <em>Add Symbol To Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddSymbolToRuleImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddSymbolToRule()
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
		 * The meta object literal for the '{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl <em>Add Keyword To Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl
		 * @see org.bumble.xtext.grammaroptimizer.optimizationrule.impl.GrammaroptimizerPackageImpl#getAddKeywordToLine()
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
		 * The meta object literal for the '<em><b>Line</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PARENTHESES_WITHOUT_QUOTES__LINE = eINSTANCE.getAddParenthesesWithoutQuotes_Line();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE = eINSTANCE.getAddParenthesesWithoutQuotes_Scope();
	}

} //GrammaroptimizerPackage
