/*******************************************************************************
 * Copyright 2017 Dell Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @microservice:  export-domain library
 * @author: Jim White, Dell
 * @version: 1.0.0
 *******************************************************************************/
package org.edgexfoundry.domain.export;

/**
 * Provides details for encryption of export data per client request.
 * 
 * @author CPundhir - original. JWhite updated and expanded
 *
 */
public class EncryptionDetails {

	// encryption algorithm
	private ExportEncryption encryptionAlgorithm = ExportEncryption.NONE;

	// key used to do encryption
	private String encryptionKey = "";

	// vector for initializing the security encryption
	private String initializingVector = "";

	public ExportEncryption getEncryptionAlgorithm() {
		return encryptionAlgorithm;
	}

	public void setEncryptionAlgorithm(ExportEncryption encryptionAlgorithm) {
		this.encryptionAlgorithm = encryptionAlgorithm;
	}

	public String getEncryptionKey() {
		return encryptionKey;
	}

	public void setEncryptionKey(String encryptionKey) {
		this.encryptionKey = encryptionKey;
	}

	public String getInitializingVector() {
		return initializingVector;
	}

	public void setInitializingVector(String initializingVector) {
		this.initializingVector = initializingVector;
	}

}
