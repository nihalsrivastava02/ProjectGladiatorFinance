package com.lti.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

@Entity
public class Emidetail {
	
	@Id
	@JsonIgnore
	@GeneratedValue
	private long dueid;
	
	@Column(length=10,nullable=false)
	private Double afterpaymenttobebalance;
	
	@Column(length=10,nullable=false,unique = true)
	@Temporal(TemporalType.DATE)
	private Date duedate;
	
	@Column(length=10,nullable=false)
	private Double initialtobebalance;
	
	@Column(length=10,nullable=false)
	private Double installmentmonthno;
	
	@Column(length=10,nullable=false)
	private Double paymenttobedone;
	
	@Column(length=10,nullable=false)
	private String status="Upcoming";

	//bi-directional many-to-one association to Purchase
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="PURCHASETXNID")
	private Purchase purchase;

	public Emidetail() {
	}

	public long getDueid() {
		return this.dueid;
	}

	public void setDueid(long dueid) {
		this.dueid = dueid;
	}

	public Double getAfterpaymenttobebalance() {
		return this.afterpaymenttobebalance;
	}

	public void setAfterpaymenttobebalance(Double afterpaymenttobebalance) {
		this.afterpaymenttobebalance = afterpaymenttobebalance;
	}

	public Date getDuedate() {
		return this.duedate;
	}

	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}

	public Double getInitialtobebalance() {
		return this.initialtobebalance;
	}

	public void setInitialtobebalance(Double initialtobebalance) {
		this.initialtobebalance = initialtobebalance;
	}

	public Double getInstallmentmonthno() {
		return this.installmentmonthno;
	}

	public void setInstallmentmonthno(Double installmentmonthno) {
		this.installmentmonthno = installmentmonthno;
	}

	public Double getPaymenttobedone() {
		return this.paymenttobedone;
	}

	public void setPaymenttobedone(Double paymenttobedone) {
		this.paymenttobedone = paymenttobedone;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Purchase getPurchase() {
		return this.purchase;
	}

	public void setPurchase(Purchase purchase) {
		this.purchase = purchase;
	}

}