package com.lti.dto;

import java.util.Date;

public class NewcardpaymentDto {

	private long newcardpaymentid;
	private Double amountpaid;
	private Date paymentdate;
	private int customerId;
	
	public long getNewcardpaymentid() {
		return newcardpaymentid;
	}
	public void setNewcardpaymentid(long newcardpaymentid) {
		this.newcardpaymentid = newcardpaymentid;
	}
	public Double getAmountpaid() {
		return amountpaid;
	}
	public void setAmountpaid(Double amountpaid) {
		this.amountpaid = amountpaid;
	}
	public Date getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
}
