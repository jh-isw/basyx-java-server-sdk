/*******************************************************************************
 * Copyright (C) 2023 the Eclipse BaSyx Authors
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 * SPDX-License-Identifier: MIT
 ******************************************************************************/

package org.eclipse.digitaltwin.basyx.submodelservice;

import java.util.Collection;

import org.eclipse.digitaltwin.aas4j.v3.model.Submodel;
import org.eclipse.digitaltwin.aas4j.v3.model.SubmodelElement;
import org.eclipse.digitaltwin.basyx.core.exceptions.ElementDoesNotExistException;
import org.eclipse.digitaltwin.basyx.submodelservice.value.SubmodelElementValue;

/**
 * Specifies the overall SubmodelService API
 * 
 * @author schnicke
 *
 */
public interface SubmodelService {
	/**
	 * Retrieves the Submodel contained in the service
	 * 
	 * @return
	 */
	public Submodel getSubmodel();

	/**
	 * Retrieves all submodelElements contained in the Submodel
	 * 
	 * @return
	 */
	public Collection<SubmodelElement> getSubmodelElements();

	/**
	 * Retrieve specific SubmodelElement of the Submodel
	 *
	 * @param idShortPath the SubmodelElement IdShort
	 * @return the SubmodelElement
	 * @throws ElementDoesNotExistException if the SubmodelElement does not exist
	 */
	public SubmodelElement getSubmodelElement(String idShortPath) throws ElementDoesNotExistException;

	/**
	 * Retrieves the value of a specific SubmodelElement of the Submodel
	 * 
	 * @param idShortPath
	 *            the SubmodelElement idShortPath
	 * @return the SubmodelElementValue
	 * @throws ElementDoesNotExistException
	 *             if the SubmodelElement does not exist
	 */
	public SubmodelElementValue getSubmodelElementValue(String idShortPath) throws ElementDoesNotExistException;

	/**
	 * Sets the value of a specific SubmodelElement of the Submodel
	 * 
	 * @param idShortPath the SubmodelElement IdShortPath
	 * @param value       the new value
	 * @throws ElementDoesNotExistException if the SubmodelElement does not exist
	 */
	public void setSubmodelElementValue(String idShortPath, SubmodelElementValue value) throws ElementDoesNotExistException;

	/**
	 * Creates a Submodel Element
	 * 
	 * @return
	 */
	public void createSubmodelElement(SubmodelElement submodelElement);

	/**
	 * Create a nested submodel element
	 * 
	 * @param idShortPath
	 *            the SubmodelElement IdShortPath
	 * @param submodelElement
	 *            the submodel element to be created
	 * @throws ElementDoesNotExistException
	 *             If the submodel element defined in the path does not exist
	 */
	public void createSubmodelElement(String idShortPath, SubmodelElement submodelElement) throws ElementDoesNotExistException;

	/**
	 * Delete a submodel element in a submodel
	 * 
	 * @param idshortPath
	 *            the SubmodelElement IdShortPath
	 * @throws ElementDoesNotExistException
	 *             If the submodel element defined in the path does not exist
	 */
	public void deleteSubmodelElement(String idShortPath) throws ElementDoesNotExistException;

}
