/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Keyword To Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl#getNewKeyword <em>New Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToLineImpl#isIsHead <em>Is Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddKeywordToLineImpl extends OptimizationRuleImpl implements AddKeywordToLine {
	/**
	 * The default value of the '{@link #getNewKeyword() <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewKeyword()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_KEYWORD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewKeyword() <em>New Keyword</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewKeyword()
	 * @generated
	 * @ordered
	 */
	protected String newKeyword = NEW_KEYWORD_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsHead() <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHead()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_HEAD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsHead() <em>Is Head</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsHead()
	 * @generated
	 * @ordered
	 */
	protected boolean isHead = IS_HEAD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddKeywordToLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_KEYWORD_TO_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewKeyword() {
		return newKeyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewKeyword(String newNewKeyword) {
		String oldNewKeyword = newKeyword;
		newKeyword = newNewKeyword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_KEYWORD_TO_LINE__NEW_KEYWORD, oldNewKeyword, newKeyword));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsHead() {
		return isHead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsHead(boolean newIsHead) {
		boolean oldIsHead = isHead;
		isHead = newIsHead;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_KEYWORD_TO_LINE__IS_HEAD, oldIsHead, isHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__NEW_KEYWORD:
				return getNewKeyword();
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__IS_HEAD:
				return isIsHead();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__NEW_KEYWORD:
				setNewKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__IS_HEAD:
				setIsHead((Boolean)newValue);
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
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__NEW_KEYWORD:
				setNewKeyword(NEW_KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__IS_HEAD:
				setIsHead(IS_HEAD_EDEFAULT);
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
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__NEW_KEYWORD:
				return NEW_KEYWORD_EDEFAULT == null ? newKeyword != null : !NEW_KEYWORD_EDEFAULT.equals(newKeyword);
			case OptimizationrulePackage.ADD_KEYWORD_TO_LINE__IS_HEAD:
				return isHead != IS_HEAD_EDEFAULT;
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
		result.append(" (newKeyword: ");
		result.append(newKeyword);
		result.append(", isHead: ");
		result.append(isHead);
		result.append(')');
		return result.toString();
	}

	public void apply()
	{
		if (newKeyword == null)
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			// construct symbol with a pair of single quotes
			String symbol = "'" + newKeyword + "'";
			
			for (LineEntry line : rule.getLines()) {
				if (line.getAttrName() == null)
					continue;
				
				if (!line.getAttrName().equals(attrName))
					continue;
				
				String lineContent = line.getLineContent();
				
				if (isHead) {
					int numOfWhiteSpace = StringHelper.getWhitespaceNumAtHead(lineContent);
					String coreLineContent = lineContent.stripLeading();
					lineContent = symbol + " " + coreLineContent;
					lineContent = StringHelper.setWhitespaceToString(lineContent, numOfWhiteSpace);
				}
				else {
					lineContent = lineContent + " " + symbol;
				}
				
				line.setLineContent(lineContent);
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //AddKeywordToLineImpl
