/*
 * generated by Xtext 2.17.0
 */
package zd.zero.abdt.eclipse.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractAnyaBasicValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(zd.zero.abdt.eclipse.anyaBasic.AnyaBasicPackage.eINSTANCE);
		return result;
	}
}
