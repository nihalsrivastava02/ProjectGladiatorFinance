package com.lti.status;

public class Status{
	
	private StatusType status;
		
	public static enum StatusType{
		ACTIVATED, DECLINED;
	}

	public StatusType getStatus() {
		return status;
	}

	public void setStatus(StatusType status) {
		this.status = status;
	}

}