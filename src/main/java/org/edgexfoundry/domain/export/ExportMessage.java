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

import org.edgexfoundry.domain.core.Event;

/**
 * Encapsulating / wrapper message object that contains Event to be exported and
 * the client export registration details.
 */
public class ExportMessage {

	private ExportRegistration registration;
	private Event event;

	public ExportMessage(ExportRegistration registration, Event event) {
		super();
		this.registration = registration;
		this.event = event;
	}

	public ExportRegistration getRegistration() {
		return registration;
	}

	public void setRegistration(ExportRegistration registration) {
		this.registration = registration;
	}

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

	public String toString() {
		return event.toString() + "\n" + registration.toString();
	}

}
