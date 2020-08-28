package com.lti.dto;

public class ProductinventoryDto {
	
	private long productid;
	private Double actualcost;
	private Double availabilitynumber;
	private String name;
	private Double processingcharge;
	private String productdetails;
	private Double totalcost;
	
	public long getProductid() {
		return productid;
	}
	public void setProductid(long productid) {
		this.productid = productid;
	}
	public Double getActualcost() {
		return actualcost;
	}
	public void setActualcost(Double actualcost) {
		this.actualcost = actualcost;
	}
	public Double getAvailabilitynumber() {
		return availabilitynumber;
	}
	public void setAvailabilitynumber(Double availabilitynumber) {
		this.availabilitynumber = availabilitynumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getProcessingcharge() {
		return processingcharge;
	}
	public void setProcessingcharge(Double processingcharge) {
		this.processingcharge = processingcharge;
	}
	public String getProductdetails() {
		return productdetails;
	}
	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}
	public Double getTotalcost() {
		return totalcost;
	}
	public void setTotalcost(Double totalcost) {
		this.totalcost = totalcost;
	}
}
