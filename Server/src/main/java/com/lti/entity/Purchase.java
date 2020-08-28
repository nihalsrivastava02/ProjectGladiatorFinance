package com.lti.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Date;
import java.util.Set;

@Entity
public class Purchase{
	
	@Id
	@GeneratedValue
	private long purchasetxnid;
	
	@Column(length=10,nullable=false)
	private Double emiamountpermonth;
	
	@Column(length=10,nullable=false)
	private int emitenure;
	
	@Column(length=10,nullable=false)
	@Temporal(TemporalType.DATE)
	private Date purchasedate;

	//bi-directional many-to-one association to Emidetail
	@OneToMany(mappedBy="purchase",cascade = CascadeType.ALL)
	private Set<Emidetail> emidetails;

	//bi-directional many-to-one association to Emipayment
	@OneToMany(mappedBy="purchase",cascade = CascadeType.ALL)
	private Set<Emipayment> emipayments;

	//bi-directional many-to-one association to Customer
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="CUSTOMERID")
	private Customer customer;

	//bi-directional many-to-one association to Productinventory
	@ManyToOne(fetch=FetchType.LAZY)
	@JsonIgnore
	@JoinColumn(name="PRODUCTID")
	private Productinventory productinventory;

	public Purchase() {
	}

	public long getPurchasetxnid() {
		return this.purchasetxnid;
	}

	public void setPurchasetxnid(long purchasetxnid) {
		this.purchasetxnid = purchasetxnid;
	}

	public Double getEmiamountpermonth() {
		return this.emiamountpermonth;
	}

	public void setEmiamountpermonth(Double emiamountpermonth) {
		this.emiamountpermonth = emiamountpermonth;
	}

	public int getEmitenure() {
		return this.emitenure;
	}

	public void setEmitenure(int emitenure) {
		this.emitenure = emitenure;
	}

	public Date getPurchasedate() {
		return this.purchasedate;
	}

	public void setPurchasedate(Date purchasedate) {
		this.purchasedate = purchasedate;
	}

	public Set<Emidetail> getEmidetails() {
		return this.emidetails;
	}

	public void setEmidetails(Set<Emidetail> emidetails) {
		this.emidetails = emidetails;
	}

	public Set<Emipayment> getEmipayments() {
		return this.emipayments;
	}

	public void setEmipayments(Set<Emipayment> emipayments) {
		this.emipayments = emipayments;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Productinventory getProductinventory() {
		return this.productinventory;
	}

	public void setProductinventory(Productinventory productinventory) {
		this.productinventory = productinventory;
	}

}