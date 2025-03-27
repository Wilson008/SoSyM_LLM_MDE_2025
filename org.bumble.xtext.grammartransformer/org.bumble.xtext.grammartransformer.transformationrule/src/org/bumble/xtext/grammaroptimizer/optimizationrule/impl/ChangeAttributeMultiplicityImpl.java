/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.ChangeAttributeMultiplicity;
import org.bumble.xtext.grammaroptimizer.optimizationrule.MultiplicityKey;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package Attributes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl#getStartAttr <em>Start Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl#getEndAttr <em>End Attr</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.ChangeAttributeMultiplicityImpl#getMultiplicity <em>Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ChangeAttributeMultiplicityImpl extends OptimizationRuleImpl implements ChangeAttributeMultiplicity {
	/**
	 * The default value of the '{@link #getStartAttr() <em>Start Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String START_ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartAttr() <em>Start Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartAttr()
	 * @generated
	 * @ordered
	 */
	protected String startAttr = START_ATTR_EDEFAULT;

	/**
	 * The default value of the '{@link #getEndAttr() <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAttr()
	 * @generated
	 * @ordered
	 */
	protected static final String END_ATTR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndAttr() <em>End Attr</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndAttr()
	 * @generated
	 * @ordered
	 */
	protected String endAttr = END_ATTR_EDEFAULT;

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
	protected ChangeAttributeMultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.CHANGE_ATTRIBUTE_MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStartAttr() {
		return startAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartAttr(String newStartAttr) {
		String oldStartAttr = startAttr;
		startAttr = newStartAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR, oldStartAttr, startAttr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndAttr() {
		return endAttr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndAttr(String newEndAttr) {
		String oldEndAttr = endAttr;
		endAttr = newEndAttr;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR, oldEndAttr, endAttr));
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
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR:
				return getStartAttr();
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR:
				return getEndAttr();
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY:
				return getMultiplicity();
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
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR:
				setStartAttr((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR:
				setEndAttr((String)newValue);
				return;
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY:
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
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR:
				setStartAttr(START_ATTR_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR:
				setEndAttr(END_ATTR_EDEFAULT);
				return;
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY:
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
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__START_ATTR:
				return START_ATTR_EDEFAULT == null ? startAttr != null : !START_ATTR_EDEFAULT.equals(startAttr);
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__END_ATTR:
				return END_ATTR_EDEFAULT == null ? endAttr != null : !END_ATTR_EDEFAULT.equals(endAttr);
			case OptimizationrulePackage.CHANGE_ATTRIBUTE_MULTIPLICITY__MULTIPLICITY:
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
		result.append(" (startAttr: ");
		result.append(startAttr);
		result.append(", endAttr: ");
		result.append(endAttr);
		result.append(", multiplicity: ");
		result.append(multiplicity);
		result.append(')');
		return result.toString();
	}

	/**
	 * Changes the multiplicity of a line depending on the package type.
	 */
	public void apply() {
		if (startAttr == null || startAttr.isEmpty() ||
			  endAttr == null || endAttr.isEmpty()) 
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!rule.getName().equals(grammarRule)) {
					continue;
				}
			}
			
			int attrANo = -1;
			int attrBNo = -1;
			
			for (int i = 0; i < rule.getLines().size(); i++) {
//				if (rule.getLines().get(i).getAttrName() == null)
//					continue;
				if (rule.getLines().get(i).getAttrName() == null) {
					String lineContent = rule.getLines().get(i).getLineContent();
					
					if (RegexHelper.doesStringExist(lineContent, "\\{" + startAttr)) {
						attrANo = i;
						continue;
					}
					
					continue;
				}
				
				if (rule.getLines().get(i).getAttrName().equals(startAttr)) {
					attrANo = i;
					continue;
				}
				
				if (rule.getLines().get(i).getAttrName().equals(endAttr)) {
					attrBNo = i;
					continue;
				}
				
				if (attrANo >= 0 && attrBNo >= 0)
					break;
			}
			
			// the order of attributes should be correct.
			if (attrANo > attrBNo)
				break;
			
			if (attrANo < 0 || attrBNo <0)
				break;
			
			String startAttrContent = rule.getLines().get(attrANo).getLineContent();
			int startAttrWhiteSpaceNum = StringHelper.getWhitespaceNumAtHead(startAttrContent);
			startAttrContent = "(" + startAttrContent.stripLeading();
			startAttrContent = StringHelper.setWhitespaceToString(startAttrContent, startAttrWhiteSpaceNum);
			rule.getLines().get(attrANo).setLineContent(startAttrContent);
			
			String endAttrContent = rule.getLines().get(attrBNo).getLineContent();
			if (multiplicity == MultiplicityKey.MULTIPLICITY_OPTIONAL)
				endAttrContent += ")?";
			else if (multiplicity == MultiplicityKey.MULTIPLICITY_ZERO_OR_MORE)
				endAttrContent += ")*";
			else if (multiplicity == MultiplicityKey.MULTIPLICITY_ONE_OR_MORE)
				endAttrContent += ")+";
			else
				endAttrContent += ")";
			rule.getLines().get(attrBNo).setLineContent(endAttrContent);
			
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}	
		}
	}
} //PackageAttributesImpl
