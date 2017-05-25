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

public class ExportString {

	private ExportRegistration registration;
	private String eventString;
	private String eventId;
	private String deviceId;

	public ExportRegistration getRegistration() {
		return registration;
	}

	public void setRegistration(ExportRegistration registration, String eventId) {
		this.registration = registration;
		this.eventId = eventId;
	}

	public void setRegistration(ExportRegistration registration, String eventId, String deviceId) {
		this.registration = registration;
		this.eventId = eventId;
		this.deviceId = deviceId;
	}

	public String getEventString() {
		return eventString;
	}

	public void setEventString(String eventString) {
		this.eventString = eventString;
	}

	public String toString() {
		return eventString;
	}

	public String getEventId() {
		return eventId;
	}

	public void setEventId(String eventId) {
		this.eventId = eventId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

}
