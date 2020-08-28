package com.lti.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;

@Entity

public class Emipayment {
	

	@Id
	@GeneratedValue
	@JsonIgnore
	private long paymenttxnid;
	
	@Column(length=10,nullable=false)
	private long currproductbalance;
	
	@Column(length=10,nullable=false,unique = true)
	private long dueid;
	
	@Column(length=10,nullable=false)
	private long initialproductbalance;
	
	@Column(length=10,nullable=false)
	private long installmentmonthno;
	
	@Column(length=10,nullable=false)
	private long paymentamount;

	@Temporal(TemporalType.DATE)
	private Date paymentdate;

	//bi-directional many-to-one association to Purchase
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="PURCHASETXNID")
	private Purchase purchase;

	public Emipayment() {
	}

	

	public long getPaymenttxnid() {
		return paymenttxnid;
	}



	public void setPaymenttxnid(long paymenttxnid) {
		this.paymenttxnid = paymenttxnid;
	}



	public long getCurrproductbalance() {
		return currproductbalance;
	}



	public void setCurrproductbalance(long currproductbalance) {
		this.currproductbalance = currproductbalance;
	}



	public long getDueid() {
		return dueid;
	}



	public void setDueid(long dueid) {
		this.dueid = dueid;
	}



	public long getInitialproductbalance() {
		return initialproductbalance;
	}



	public void setInitialproductbalance(long initialproductbalance) {
		this.initialproductbalance = initialproductbalance;
	}



	public long getInstallmentmonthno() {
		return installmentmonthno;
	}



	public void setInstallmentmonthno(long installmentmonthno) {
		this.installmentmonthno = installmentmonthno;
	}



	public long getPaymentamount() {
		return paymentamount;
	}



	public void setPaymentamount(long paymentamount) {
		this.paymentamount = paymentamount;
	}



	public Date getPaymentdate() {
		return paymentdate;
	}



	public void setPaymentdate(Date paymentdate) {
		this.paymentdate = paymentdate;
	}



	public Purchase getPurchase() {
		return this.purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

}