package com.lti.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

@Entity
public class Newcardpayment {
	
	@Id
	@GeneratedValue
	private long newcardpaymentid;
	
	@Column(length=10,nullable=false)
	private Double amountpaid;
	
	@Column(length=10,nullable=false)
	@Temporal(TemporalType.DATE)
	private Date paymentdate;

	//bi-directional one-to-one association to Customer
	@OneToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="CUSTOMERID")
	private Customer customer;

	public Newcardpayment() {
	}

	public long getNewcardpaymentid() {
		return this.newcardpaymentid;
	}

	public void setNewcardpaymentid(long newcardpaymentid) {
		this.newcardpaymentid = newcardpaymentid;
	}

	public Double getAmountpaid() {
		return this.amountpaid;
	}

	public void setAmountpaid(Double amountpaid) {
		this.amountpaid = amountpaid;
	}

	public Date getPaymentdate() {
		return this.paymentdate;
	}

	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

}