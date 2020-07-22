package org.greyhope.eb.documents;

public class ServiceInput {
	
	private String requestId;
	private String payload;
	
	public ServiceInput() {
		super();
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getPayload() {
		return payload;
	}

	public void setPayload(String payload) {
		this.payload = payload;
	}

}
