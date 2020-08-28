package com.lti.dto;

public class StatusDto {
	
	private long customerid;
	private String activationstatus;
	public long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}
	public String getActivationstatus() {
		return activationstatus;
	}
	public void setActivationstatus(String activationstatus) {
		this.activationstatus = activationstatus;
	}
}
