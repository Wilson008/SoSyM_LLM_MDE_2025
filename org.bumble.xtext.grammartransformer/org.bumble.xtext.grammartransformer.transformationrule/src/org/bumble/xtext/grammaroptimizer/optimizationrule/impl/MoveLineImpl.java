/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MoveLine;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Move Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.MoveLineImpl#isIsHead <em>Is Head</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MoveLineImpl extends OptimizationRuleImpl implements MoveLine {
	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final String TARGET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected String target = TARGET_EDEFAULT;

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
	protected MoveLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.MOVE_LINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.MOVE_LINE__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(String newTarget) {
		String oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.MOVE_LINE__TARGET, oldTarget, target));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.MOVE_LINE__IS_HEAD, oldIsHead, isHead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.MOVE_LINE__SOURCE:
				return getSource();
			case OptimizationrulePackage.MOVE_LINE__TARGET:
				return getTarget();
			case OptimizationrulePackage.MOVE_LINE__IS_HEAD:
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
			case OptimizationrulePackage.MOVE_LINE__SOURCE:
				setSource((String)newValue);
				return;
			case OptimizationrulePackage.MOVE_LINE__TARGET:
				setTarget((String)newValue);
				return;
			case OptimizationrulePackage.MOVE_LINE__IS_HEAD:
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
			case OptimizationrulePackage.MOVE_LINE__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case OptimizationrulePackage.MOVE_LINE__TARGET:
				setTarget(TARGET_EDEFAULT);
				return;
			case OptimizationrulePackage.MOVE_LINE__IS_HEAD:
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
			case OptimizationrulePackage.MOVE_LINE__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case OptimizationrulePackage.MOVE_LINE__TARGET:
				return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
			case OptimizationrulePackage.MOVE_LINE__IS_HEAD:
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
		result.append(" (source: ");
		result.append(source);
		result.append(", target: ");
		result.append(target);
		result.append(", isHead: ");
		result.append(isHead);
		result.append(')');
		return result.toString();
	}
	

	
	/**
	 * This method is used to change orders
	 * source: which line/keyword/attribute do you want to move?
	 * target: where do you want to move to? (usually front or behind
	 * isFront: do you want to put before your target line or after?
	 * */
	public void apply() {
		// search for the line contain source
		for (int i = 0; i < grammar.getRules().size(); i++) {
			int targetLineId = -1;
			int sourceLineId = -1;
			
			if (grammar.getRules().get(i).getName() == null)
				continue;
			
			String regexSource = null;
			String regexTarget = null;
			
			if (RegexHelper.isSingleNonLetter(source)) {
				regexSource = "(\\(|\\s|\')\\" + source + "(\'|\\?|\\s|\\+|\\=)";
			}
			else {
				regexSource = "(\\(|\\s|\')" + source + "(\'|\\?|\\s|\\+|\\=)";
			}
			
			if (RegexHelper.isSingleNonLetter(target)) {
				regexTarget = "(\\(|\\s|\')\\" + target + "(\'|\\?|\\s|\\+|\\=)";
			}
			else {
				regexTarget = "(\\(|\\s|\')" + target + "(\'|\\?|\\s|\\+|\\=)";
			}

			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammar.getRules().get(i).getName().equals(grammarRule)) 
					continue;
			}
			
			for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
				String lineContent = grammar.getRules().get(i).getLines().get(j).getLineContent();
				
				if (RegexHelper.doesStringExist(lineContent, regexSource) && sourceLineId < 0) {
					sourceLineId = j;
				}
				
				if (RegexHelper.doesStringExist(lineContent, regexTarget) && targetLineId < 0) {
					targetLineId = j;
				}
				
				// once found both lines, stop the loop
				if (sourceLineId >= 0 && targetLineId >= 0) {
					break;
				}
			}
			
			// move the line to the front/end of another line
			if (sourceLineId >= 0 && targetLineId >= 0) {
				// this means it has ready been moved
				if ((sourceLineId == (targetLineId + 1) && !isHead)
						|| ((sourceLineId + 1) == targetLineId && isHead))
					continue;
				
				LineEntryImpl lineEntry = (LineEntryImpl)grammar.getRules().get(i).getLines().get(sourceLineId);
				
				List<LineEntry> tempList = new ArrayList<LineEntry>();
				
				for (int j = 0; j < grammar.getRules().get(i).getLines().size(); j++) {
					tempList.addAll((Collection<? extends LineEntry>) grammar.getRules().get(i).getLines());
				}
				
				// Note: they won't be in the same line
				if (isHead)
					tempList.add(targetLineId, lineEntry);
				else
					tempList.add(targetLineId + 1, lineEntry);
				
				if (sourceLineId > targetLineId)
					tempList.remove(sourceLineId + 1);
				else
					tempList.remove(sourceLineId);
				
				for (int k = 0; k < tempList.size(); k++) {
					grammar.getRules().get(i).getLines().clear();
					grammar.getRules().get(i).getLines().addAll(tempList);
				}
				
				continue;
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //MoveLineImpl
