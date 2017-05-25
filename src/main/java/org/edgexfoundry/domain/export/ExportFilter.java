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

import java.util.List;

/**
 * Specifies the client filters on reading data.
 */
public class ExportFilter {
	// TODO - someday offer time filter?? What would that look like? Use some
	// type of reg expression to match on day, hour, etc?

	// list of device identifiers (either id or name) for which the client wants
	// all associated data. Leave null or empty for no filtering of devices.
	private List<String> deviceIdentifiers;

	// list of value descriptor identifiers (either id or name) for which the
	// client wants all associated data. Leave null or empty for no filtering by
	// value descriptors.
	private List<String> valueDescriptorIdentifiers;

	public List<String> getDeviceIdentifiers() {
		return deviceIdentifiers;
	}

	public void setDeviceIdentifiers(List<String> deviceIdentifiers) {
		this.deviceIdentifiers = deviceIdentifiers;
	}

	public List<String> getValueDescriptorIdentifiers() {
		return valueDescriptorIdentifiers;
	}

	public void setValueDescriptorIdentifiers(List<String> valueDescriptorIdentifiers) {
		this.valueDescriptorIdentifiers = valueDescriptorIdentifiers;
	}

}
