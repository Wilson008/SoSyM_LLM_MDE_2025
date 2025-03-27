/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;

import java.util.Collection;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.helper.StringHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.bumble.xtext.grammaroptimizer.optimizationrule.RemoveComma;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Remove Comma</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.RemoveCommaImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RemoveCommaImpl extends OptimizationRuleImpl implements RemoveComma {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<String> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RemoveCommaImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.REMOVE_COMMA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getAttributes() {
		if (attributes == null) {
			attributes = new EDataTypeUniqueEList<String>(String.class, this, OptimizationrulePackage.REMOVE_COMMA__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.REMOVE_COMMA__ATTRIBUTES:
				return getAttributes();
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
			case OptimizationrulePackage.REMOVE_COMMA__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends String>)newValue);
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
			case OptimizationrulePackage.REMOVE_COMMA__ATTRIBUTES:
				getAttributes().clear();
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
			case OptimizationrulePackage.REMOVE_COMMA__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
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
		result.append(" (attributes: ");
		result.append(attributes);
		result.append(')');
		return result.toString();
	}

	// remove commas from the whole grammar
	public void apply() {
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null)
				continue;
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				if (!grammarRule.equals(rule.getName()))
					continue;
			}
			
			for (LineEntry line : rule.getLines()) {
				String lineContent = line.getLineContent();

				if (attrName != null && !attrName.isEmpty()) {
					if (!RegexHelper.doesStringExist(lineContent, attrName + "\\+*="))
						continue;
					
					lineContent = lineContent.replaceAll( "\",\"", "");
					line.setLineContent(lineContent);
					break;
				}
				else {
					// if a line without an attribute which is in the form of X, then skip
					// X here means X* or X ("," X)*
					if (!RegexHelper.doesStringExist(lineContent, "\\+="))
						continue;
					
					// get the X from the line
					String X = StringHelper.getX2(lineContent);
					
					// get the attribute name from the X
					String regex = "(.*)\\+=";
					Pattern pattern = Pattern.compile(regex);
					String attrTemp = RegexHelper.getTargetString(X, pattern);
					
					boolean isAvoid = false;
					
					if (X != null && !X.isEmpty()) {
						// Check if this is the line that we want to keep the comma, then mark
						if (attributes != null) {
							for (String attr : attributes) {
								if (attr.equals(attrTemp)) {
									isAvoid = true;
									break;
								}
							}
						}					
						
						// if we want to keep the comma, then we need to avoid replacing
						if (!isAvoid) {
							lineContent = lineContent.replaceAll( "\",\"", "");
							line.setLineContent(lineContent);
						}
					}
				}
			}
			
			if (grammarRule != null && !grammarRule.isEmpty()) {
				break;
			}
		}
	}
} //RemoveCommaImpl
