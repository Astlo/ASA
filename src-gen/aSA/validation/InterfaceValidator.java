/**
 *
 * $Id$
 */
package aSA.validation;

import aSA.Composant;
import aSA.Configuration;
import aSA.Connecteur;

/**
 * A sample validator interface for {@link aSA.Interface}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface InterfaceValidator {
	boolean validate();

	boolean validateComposant(Composant value);

	boolean validateConfiguration(Configuration value);

	boolean validateConnecteur(Connecteur value);

	boolean validateName(String value);
}
