/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.GrammarRuleImpl;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddPrimitiveType;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Primitive Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl#getMetaclass <em>Metaclass</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddPrimitiveTypeImpl#getAnnotation <em>Annotation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddPrimitiveTypeImpl extends OptimizationRuleImpl implements AddPrimitiveType {
	/**
	 * The default value of the '{@link #getMetaclass() <em>Metaclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclass()
	 * @generated
	 * @ordered
	 */
	protected static final String METACLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMetaclass() <em>Metaclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclass()
	 * @generated
	 * @ordered
	 */
	protected String metaclass = METACLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected static final String ANNOTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected String annotation = ANNOTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddPrimitiveTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_PRIMITIVE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMetaclass() {
		return metaclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclass(String newMetaclass) {
		String oldMetaclass = metaclass;
		metaclass = newMetaclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PRIMITIVE_TYPE__METACLASS, oldMetaclass, metaclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBody(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PRIMITIVE_TYPE__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnotation(String newAnnotation) {
		String oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_PRIMITIVE_TYPE__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__METACLASS:
				return getMetaclass();
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__BODY:
				return getBody();
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__ANNOTATION:
				return getAnnotation();
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
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__METACLASS:
				setMetaclass((String)newValue);
				return;
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__BODY:
				setBody((String)newValue);
				return;
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__ANNOTATION:
				setAnnotation((String)newValue);
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
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__METACLASS:
				setMetaclass(METACLASS_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__ANNOTATION:
				setAnnotation(ANNOTATION_EDEFAULT);
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
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__METACLASS:
				return METACLASS_EDEFAULT == null ? metaclass != null : !METACLASS_EDEFAULT.equals(metaclass);
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case OptimizationrulePackage.ADD_PRIMITIVE_TYPE__ANNOTATION:
				return ANNOTATION_EDEFAULT == null ? annotation != null : !ANNOTATION_EDEFAULT.equals(annotation);
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
		result.append(" (metaclass: ");
		result.append(metaclass);
		result.append(", body: ");
		result.append(body);
		result.append(", annotation: ");
		result.append(annotation);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (grammarRule == null || grammarRule.isEmpty())
			return;
		
		boolean isTypeExist = false;
		
		for (GrammarRule rule : grammar.getRules()) {
			if (rule.getName() == null || rule.getName().isEmpty()) 
				continue;
			
			// if the primitive type exists, then change it
			if (rule.getName().equals(grammarRule)) {
				isTypeExist = true;
				
				if (RegexHelper.doesStringExist(rule.getLines().get(1).getLineContent(), "implement this rule and an appropriate IValueConverter")) {
					String firstLine = grammarRule;
					
					if (metaclass != null) {
						firstLine += " returns " + metaclass;
					}
					
					firstLine += ":";
					rule.getLines().get(0).setLineContent(firstLine);
					rule.getLines().get(1).setLineContent(body);
				}
								
				break;
			}
		}
		
		// if the primitive type doesn't exist, then add it 
		if (!isTypeExist) {
			GrammarRuleImpl rule = new GrammarRuleImpl();
			rule.setName(grammarRule);
			
			if (annotation != null && !annotation.isEmpty()) {
				LineEntryImpl line0 = new LineEntryImpl();
				line0.setLineContent("@" + annotation);
				rule.getLines().add(line0);
			}
			
			LineEntryImpl line1 = new LineEntryImpl();
			String line1Content = grammarRule;
			if (metaclass != null)
				line1Content += " returns " + metaclass;
			line1Content += ":";
			line1.setLineContent(line1Content);
			LineEntryImpl line2 = new LineEntryImpl();
			line2.setLineContent(body);
			
			rule.getLines().add(line1);
			rule.getLines().add(line2);
			
			grammar.getRules().add(rule);
		}
	}
} //AddPrimitiveTypeImpl
