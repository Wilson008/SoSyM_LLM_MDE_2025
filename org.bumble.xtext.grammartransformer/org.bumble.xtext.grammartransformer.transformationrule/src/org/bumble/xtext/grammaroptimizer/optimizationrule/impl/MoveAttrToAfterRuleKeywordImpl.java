/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveAttrToAfterRuleKeyword;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.GrammaroptimizerFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Attr To After Rule Keyword</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveAttrToAfterRuleKeywordImpl#getMovedLine <em>Moved Line</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveAttrToAfterRuleKeywordImpl extends OptimizationRuleImpl implements MoveAttrToAfterRuleKeyword {
	/**
	 * The default value of the '{@link #getMovedLine() <em>Moved Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovedLine()
	 * @generated
	 * @ordered
	 */
	protected static final String MOVED_LINE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMovedLine() <em>Moved Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMovedLine()
	 * @generated
	 * @ordered
	 */
	protected String movedLine = MOVED_LINE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MoveAttrToAfterRuleKeywordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.MOVE_ATTR_TO_AFTER_RULE_KEYWORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMovedLine() {
		return movedLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMovedLine(String newMovedLine) {
		String oldMovedLine = movedLine;
		movedLine = newMovedLine;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE, oldMovedLine, movedLine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE:
				return getMovedLine();
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
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE:
				setMovedLine((String)newValue);
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
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE:
				setMovedLine(MOVED_LINE_EDEFAULT);
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
			case OptimizationrulePackage.MOVE_ATTR_TO_AFTER_RULE_KEYWORD__MOVED_LINE:
				return MOVED_LINE_EDEFAULT == null ? movedLine != null : !MOVED_LINE_EDEFAULT.equals(movedLine);
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
		result.append(" (movedLine: ");
		result.append(movedLine);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		// change the order of attributes (move shortName)
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (RegexHelper.doesAttributeExist(rule, movedLine)) {
				String grammarRule = rule.getName();
				String actualRuleName = "";
				
				Pattern pattern = Pattern.compile("(\\w*)_Impl");
				if (RegexHelper.doesStringExist(grammarRule, "(\\w*)_Impl"))
					actualRuleName = RegexHelper.getTargetString(grammarRule, pattern);
				
				String keyword = actualRuleName;
				
				MoveLine moveline = GrammaroptimizerFactory.eINSTANCE.createMoveLine();
				moveline.setGrammar(grammar);
				moveline.setGrammarRule(grammarRule);
				moveline.setSource(movedLine);
				moveline.setTarget(keyword);
				moveline.setIsHead(false);
				moveline.apply();
			}
		}
	}
} //MoveAttrToAfterRuleKeywordImpl
