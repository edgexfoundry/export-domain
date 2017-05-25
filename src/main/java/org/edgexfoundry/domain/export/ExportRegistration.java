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

import java.io.Serializable;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import org.edgexfoundry.domain.common.BaseObject;
import org.edgexfoundry.domain.meta.Addressable;

/**
 * Defines the registration details on the part of north side export
 * clients
 * 
 * @author CPundhir - original. JWhite updated and expanded
 *
 */
@SuppressWarnings("serial")
@Document(collection = "exportConfiguration")
public class ExportRegistration extends BaseObject implements Serializable {

	@Indexed(unique = true)
	// non-database identifier for a export configuration - must be unique
	private String name;

	// external connectivity details for export data send
	private Addressable addressable;

	// format for export data (JSON, XML, CSV, ...)
	private ExportFormat format;

	// filters used to limit data sent to client
	private ExportFilter filter;

	// encryption details for requests to have export data encrypted
	private EncryptionDetails encryption;

	// compression format (GZIP, TAR, etc.)
	private ExportCompression compression;

	// indication if registration is active
	private boolean enable;
	
	// destination
	private ExportDestination destination;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Addressable getAddressable() {
		return addressable;
	}

	public void setAddressable(Addressable addressable) {
		this.addressable = addressable;
	}

	public ExportFormat getFormat() {
		return format;
	}

	public void setFormat(ExportFormat format) {
		this.format = format;
	}

	public ExportFilter getFilter() {
		return filter;
	}

	public void setFilter(ExportFilter filter) {
		this.filter = filter;
	}

	public boolean isEnable() {
		return enable;
	}

	public void setEnable(boolean enable) {
		this.enable = enable;
	}

	public EncryptionDetails getEncryption() {
		return encryption;
	}

	public void setEncryption(EncryptionDetails encryption) {
		this.encryption = encryption;
	}

	public ExportCompression getCompression() {
		return compression;
	}

	public void setCompression(ExportCompression compression) {
		this.compression = compression;
	}
	
	public ExportDestination getDestination() {
		return destination;
	}

	public void setDestination(ExportDestination destination) {
		this.destination = destination;
	}

	@Override
	public String toString() {
		return name + " - " + destination + " - " + format + " - " + encryption + " - " + compression;
	}

}
