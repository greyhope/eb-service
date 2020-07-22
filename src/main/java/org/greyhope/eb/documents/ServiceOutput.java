package org.greyhope.eb.documents;

public class ServiceOutput {
	
	private String requestId;
	private String payload;
	
	public ServiceOutput() {
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
