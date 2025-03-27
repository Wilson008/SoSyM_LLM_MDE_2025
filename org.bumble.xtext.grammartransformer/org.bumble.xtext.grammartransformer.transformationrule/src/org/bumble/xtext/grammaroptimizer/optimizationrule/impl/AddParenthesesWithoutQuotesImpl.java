/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddParenthesesWithoutQuotes;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ScopeKey;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Parentheses Without Quotes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl#getScope <em>Scope</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddParenthesesWithoutQuotesImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddParenthesesWithoutQuotesImpl extends OptimizationRuleImpl implements AddParenthesesWithoutQuotes {
	/**
	 * The default value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected String keyword = KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected static final ScopeKey SCOPE_EDEFAULT = ScopeKey.SINGLEKEWORD;

	/**
	 * The cached value of the '{@link #getScope() <em>Scope</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScope()
	 * @generated
	 * @ordered
	 */
	protected ScopeKey scope = SCOPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected static final MultiplicityKey MULTIPLICITY_EDEFAULT = MultiplicityKey.PACKAGE_ONLY;

	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityKey multiplicity = MULTIPLICITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddParenthesesWithoutQuotesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_PARENTHESES_WITHOUT_QUOTES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getKeyword() {
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeyword(String newKeyword) {
		String oldKeyword = keyword;
		keyword = newKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD, oldKeyword, keyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ScopeKey getScope() {
		return scope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScope(ScopeKey newScope) {
		ScopeKey oldScope = scope;
		scope = newScope == null ? SCOPE_EDEFAULT : newScope;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE, oldScope, scope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityKey getMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultiplicity(MultiplicityKey newMultiplicity) {
		MultiplicityKey oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity == null ? MULTIPLICITY_EDEFAULT : newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				return getKeyword();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				return getScope();
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY:
				return getMultiplicity();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				setKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				setScope((ScopeKey)newValue);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY:
				setMultiplicity((MultiplicityKey)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				setKeyword(KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				setScope(SCOPE_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY:
				setMultiplicity(MULTIPLICITY_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__KEYWORD:
				return KEYWORD_EDEFAULT == null ? keyword != null : !KEYWORD_EDEFAULT.equals(keyword);
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__SCOPE:
				return scope != SCOPE_EDEFAULT;
			case OptimizationrulePackage.ADD_PARENTHESES_WITHOUT_QUOTES__MULTIPLICITY:
				return multiplicity != MULTIPLICITY_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (keyword: ");
		result.append(keyword);
		result.append(", scope: ");
		result.append(scope);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			if (scope.equals(ScopeKey.SINGLEKEWORD)) {
				for (LineEntry line : rule.getLines()) {
					String lineContent = line.getLineContent();
					String regex = "\'" + keyword + "\'";
					if (RegexHelper.doesStringExist(lineContent, regex)) {
						lineContent = lineContent.replaceAll(regex, "('" + keyword + "')");
						line.setLineContent(lineContent);
						break;
					}
				}
			}
			else if (scope.equals(ScopeKey.SINGLELINE)) {				
				for (LineEntry line : rule.getLines()) {
					if (line.getAttrName() == null)
						continue;
					
					if (attrName != null && !attrName.isEmpty()) {
						if (!attrName.equals(line.getAttrName()))
							continue;
					}
					
					String coreContent = line.getLineContent().stripLeading();
					int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(line.getLineContent());
					String lineContent = "(" + coreContent + ")";
					if (multiplicity == MultiplicityKey.MULTIPLICITY_OPTIONAL)
						lineContent += "?";
					else if (multiplicity == MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE)
						lineContent += "*";
					else if (multiplicity == MultiplicityKey.MULTIPLICITY_ONE_OR_MORE)
						lineContent += "+";
					
					lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhiteSpace);
					line.setLineContent(lineContent);
					
					if (attrName != null && !attrName.isEmpty()) 
						break;
				}
			}
			else {
				
			}
			
			if (grammarRule != null || !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //AddParenthesesWithoutQuotesImpl
