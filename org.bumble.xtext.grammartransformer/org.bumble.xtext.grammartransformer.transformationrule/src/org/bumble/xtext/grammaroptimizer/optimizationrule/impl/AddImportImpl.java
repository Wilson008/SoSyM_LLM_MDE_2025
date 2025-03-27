/**
 */
package org.bumble.xtext.grammaroptimizer.optimizationrule.impl;
import java.util.regex.Pattern;

import org.bumble.xtext.grammaroptimizer.grammarrule.GrammarRule;
import org.bumble.xtext.grammaroptimizer.grammarrule.LineEntry;
import org.bumble.xtext.grammaroptimizer.grammarrule.impl.LineEntryImpl;
import org.bumble.xtext.grammaroptimizer.helper.RegexHelper;
import org.bumble.xtext.grammaroptimizer.optimizationrule.AddImport;
import org.bumble.xtext.grammaroptimizer.optimizationrule.OptimizationrulePackage;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl#getNewImport <em>New Import</em>}</li>
 *   <li>{@link org.bumble.xtext.grammaroptimizer.optimizationrule.impl.AddImportImpl#getNickName <em>Nick Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AddImportImpl extends OptimizationRuleImpl implements AddImport {
	/**
	 * The default value of the '{@link #getNewImport() <em>New Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewImport()
	 * @generated
	 * @ordered
	 */
	protected static final String NEW_IMPORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNewImport() <em>New Import</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewImport()
	 * @generated
	 * @ordered
	 */
	protected String newImport = NEW_IMPORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected static final String NICK_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNickName() <em>Nick Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNickName()
	 * @generated
	 * @ordered
	 */
	protected String nickName = NICK_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OptimizationrulePackage.Literals.ADD_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNewImport() {
		return newImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNewImport(String newNewImport) {
		String oldNewImport = newImport;
		newImport = newNewImport;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_IMPORT__NEW_IMPORT, oldNewImport, newImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNickName() {
		return nickName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNickName(String newNickName) {
		String oldNickName = nickName;
		nickName = newNickName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OptimizationrulePackage.ADD_IMPORT__NICK_NAME, oldNickName, nickName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case OptimizationrulePackage.ADD_IMPORT__NEW_IMPORT:
				return getNewImport();
			case OptimizationrulePackage.ADD_IMPORT__NICK_NAME:
				return getNickName();
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
			case OptimizationrulePackage.ADD_IMPORT__NEW_IMPORT:
				setNewImport((String)newValue);
				return;
			case OptimizationrulePackage.ADD_IMPORT__NICK_NAME:
				setNickName((String)newValue);
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
			case OptimizationrulePackage.ADD_IMPORT__NEW_IMPORT:
				setNewImport(NEW_IMPORT_EDEFAULT);
				return;
			case OptimizationrulePackage.ADD_IMPORT__NICK_NAME:
				setNickName(NICK_NAME_EDEFAULT);
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
			case OptimizationrulePackage.ADD_IMPORT__NEW_IMPORT:
				return NEW_IMPORT_EDEFAULT == null ? newImport != null : !NEW_IMPORT_EDEFAULT.equals(newImport);
			case OptimizationrulePackage.ADD_IMPORT__NICK_NAME:
				return NICK_NAME_EDEFAULT == null ? nickName != null : !NICK_NAME_EDEFAULT.equals(nickName);
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
		result.append(" (newImport: ");
		result.append(newImport);
		result.append(", nickName: ");
		result.append(nickName);
		result.append(')');
		return result.toString();
	}

	public void apply() {
		if (newImport == null || newImport.isEmpty())
			return;
		
		for (GrammarRule rule : getGrammar().getRules()) {
			if (rule.getName() == null) {
				boolean doesImportExist = false;
				
				for (LineEntry line : rule.getLines()) {
					if (RegexHelper.doesStringExist(line.getLineContent(), "import")) {
						String importContent = null;
						String[] lines = line.getLineContent().split("\\s");
						
						if (lines.length > 0) {
							Pattern pattern = Pattern.compile("\"(.*)\"");
							importContent = RegexHelper.getTargetString(lines[1], pattern);
						}
						
						if (importContent.equals(newImport)) {
							doesImportExist = true;
							break;
						}
					}

				}
				
				if (!doesImportExist) {
					LineEntryImpl lineEntry = new LineEntryImpl();
					String fullImport = "import \"" + newImport + "\"";
					
					if (nickName != null)
						fullImport += " as " + nickName;
					lineEntry.setLineContent(fullImport);
					rule.getLines().add(lineEntry);
					break;
				}
			}
		}
	}
} //AddImportImpl
