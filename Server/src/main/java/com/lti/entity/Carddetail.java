package com.lti.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;

@Entity
public class Carddetail {
	

	@Id
	@JsonIgnore
	@GeneratedValue
	private long cardnumber;
	
	//bi-directional one-to-one association to Customer
	@OneToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="CUSTOMERID")
	private Customer customer;
	
	//bi-directional many-to-one association to Cardtype
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="CARDTYPEID")
	private Cardtype cardtype;
	
	@Column(length=10,nullable=false)
	@Temporal(TemporalType.DATE)
	private Date activationdate;

	@Column(length=10,nullable=false)
	@Temporal(TemporalType.DATE)
	private Date expirydate;
	
	@Column(length=10,nullable=false)
	private Double balance;

	public Carddetail() {
	}

	public long getCardnumber() {
		return this.cardnumber;
	}

	public void setCardnumber(long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public Date getActivationdate() {
		return this.activationdate;
	}

	public void setActivationdate(Date activationdate) {
		this.activationdate = activationdate;
	}

	public Double getBalance() {
		return this.balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public Date getExpirydate() {
		return this.expirydate;
	}

	public void setExpirydate(Date expirydate) {
		this.expirydate = expirydate;
	}

	public Cardtype getCardtype() {
		return this.cardtype;
	}

	public void setCardtype(Cardtype cardtype) {
		this.cardtype = cardtype;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}