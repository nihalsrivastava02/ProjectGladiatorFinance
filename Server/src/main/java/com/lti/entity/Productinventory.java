package com.lti.entity;

import javax.persistence.*;
import java.util.Set;

@Entity
@NamedQuery(name = "is-product-present", query = "select count(p.name) from Productinventory p where p.name = :pn")
public class Productinventory{
	
	@Id
	@GeneratedValue
	private long productid;
	
	@Column(length=10,nullable=false)
	private Double actualcost;
	
	@Column(length=10,nullable=false)
	private Double availabilitynumber;
	
	@Column(length=10,nullable=false,unique = true)
	private String name;
	
	@Column(length=10,nullable=false)
	private Double processingcharge;
	
	@Column(length=10,nullable=false)
	private String productdetails;
	
	@Column(length=10,nullable=false)
	private Double totalcost;

	//bi-directional many-to-one association to Purchase
	@OneToMany(mappedBy="productinventory",cascade = CascadeType.ALL)
	private Set<Purchase> purchases;

	public Productinventory() {
	}

	public long getProductid() {
		return this.productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public Double getActualcost() {
		return this.actualcost;
	}

	public void setActualcost(Double actualcost) {
		this.actualcost = actualcost;
	}

	public Double getAvailabilitynumber() {
		return this.availabilitynumber;
	}

	public void setAvailabilitynumber(Double availabilitynumber) {
		this.availabilitynumber = availabilitynumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getProcessingcharge() {
		return this.processingcharge;
	}

	public void setProcessingcharge(Double processingcharge) {
		this.processingcharge = processingcharge;
	}

	public String getProductdetails() {
		return this.productdetails;
	}

	public void setProductdetails(String productdetails) {
		this.productdetails = productdetails;
	}

	public Double getTotalcost() {
		return this.totalcost;
	}

	public void setTotalcost(Double totalcost) {
		this.totalcost = totalcost;
	}

	public Set<Purchase> getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set<Purchase> purchases) {
		this.purchases = purchases;
	}
}