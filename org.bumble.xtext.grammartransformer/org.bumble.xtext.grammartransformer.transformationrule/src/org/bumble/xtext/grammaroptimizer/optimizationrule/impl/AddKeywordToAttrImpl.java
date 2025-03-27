/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddKeywordToAttr;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Keyword To Attr</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl#getNewKeyword <em>New Keyword</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddKeywordToAttrImpl#isIsHead <em>Is Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddKeywordToAttrImpl extends OptimizationRuleImpl implements AddKeywordToAttr {
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
	protected AddKeywordToAttrImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_KEYWORD_TO_ATTR;
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__NEW_KEYWORD, oldNewKeyword, newKeyword));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__IS_HEAD, oldIsHead, isHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__NEW_KEYWORD:
				return getNewKeyword();
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__IS_HEAD:
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
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__NEW_KEYWORD:
				setNewKeyword((String)newValue);
				return;
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__IS_HEAD:
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
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__NEW_KEYWORD:
				setNewKeyword(NEW_KEYWORD_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__IS_HEAD:
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
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__NEW_KEYWORD:
				return NEW_KEYWORD_EDEFAULT == null ? newKeyword != null : !NEW_KEYWORD_EDEFAULT.equals(newKeyword);
			case OptimizationrulePackage.ADD_KEYWORD_TO_ATTR__IS_HEAD:
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

	public void apply() {
		for (int i = 0; i < grammar.getRules().size(); i++) {
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammar.getRules().get(i).getName().equals(grammarRule)) {
					continue;
				}
			}			
			
			if (attrName != null && !attrName.isEmpty()) {
				if (!RegexHelper.doesAttributeExist(grammar.getRules().get(i), attrName)) {
					continue;
				}
			}
			
			// construct keyword
			String keyword = " '" + newKeyword + "' ";
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
				if (RegexHelper.doesStringExist(lineContent, attrName)) {
					String regex1 = "\\(.*\\)\\?";
					String regex2 = "\\)\\?";
					
					if (RegexHelper.doesStringExist(lineContent, regex2)) {
						Pattern pattern = Pattern.compile("\\((.*)\\)\\?");
						String internalContent = RegexHelper.getTargetString(lineContent, pattern);
						
						String newContent = "";
						if (isHead) {
							newContent = "(" + keyword + internalContent + ")?";
							
						}
						else {
							newContent = "(" + internalContent + keyword + ")?";
						}
						
						lineContent = lineContent.replaceAll(regex1, newContent);
						grammar.getRules().get(i).getLines().get(j).setLineContent(lineContent);
					}
					else {
						// construct the new keyword with ' '
						LineEntryImpl lineEntry = new LineEntryImpl();
						lineEntry.setLineContent(keyword);
						
						if (isHead) {
							grammar.getRules().get(i).getLines().add(j, lineEntry);
						}
						else {
							String strTemp = grammar.getRules().get(i).getLines().get(j).getLineContent();
							strTemp += keyword;
							grammar.getRules().get(i).getLines().get(j).setLineContent(strTemp);
						}
					}
					
					break;
				}
			}
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}			
		}
	}
} //AddKeywordToAttrImpl
