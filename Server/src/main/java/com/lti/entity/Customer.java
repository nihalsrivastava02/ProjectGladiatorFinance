package com.lti.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity
@NamedQuery(name = "is-customer-present", query = "select count(c.username) from Customer c where c.username = :us")
public class Customer {

	@Id
	@GeneratedValue
	private long customerid;
	@Column(length=20,nullable=false)
	private String firstname;
	@Column(length=20,nullable=false)
	private String lastname;
	@Column(length=25,nullable=false,unique = true)
	private String emailid;
	@Column(length=20,nullable=false,unique = true)
	private String username;
	@Column(length=8,nullable=false)
	private String password;
	@Column(length=10,nullable=false,unique = true)
	private String phoneno;
	@Column(length=12,nullable=false,unique = true)
	private String aadharno;
	@Column(length=10,nullable=false,unique = true)
	private String pan;
	@Column(length=20,nullable=false)
	private String bankname;
	@Column(length=20,nullable=false)
	private String accountno;
	@Column(length=11,nullable=false)
	private String ifsc;
	@Column(length=25,nullable=false)
	private String addressline1;
	@Column(length=25)
	private String addressline2;
	@Column(length=10,nullable=false)
	private String country;
	@Column(length=20,nullable=false)
	private String city;
	@Column(length=20,nullable=false)
	private String state;
	@Column(length=20,nullable=false)
	private String activationstatus = "applied";
	
	//bi-directional many-to-one association to Purchase
	
	@OneToMany(mappedBy="customer",cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<Purchase> purchases;

	//bi-directional one-to-one association to Carddetail
	@OneToOne(mappedBy="customer",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private Carddetail carddetail;

	//bi-directional one-to-one association to Newcardpayment
	@OneToOne(mappedBy="customer",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
	@JsonIgnore
	private Newcardpayment newcardpayment;
	
	public Customer() {
	}

	
	public long getCustomerid() {
		return customerid;
	}



	public void setCustomerid(long customerid) {
		this.customerid = customerid;
	}



	public String getFirstname() {
		return firstname;
	}



	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}



	public String getLastname() {
		return lastname;
	}



	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public String getEmailid() {
		return emailid;
	}



	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getPhoneno() {
		return phoneno;
	}



	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}



	public String getAadharno() {
		return aadharno;
	}



	public void setAadharno(String aadharno) {
		this.aadharno = aadharno;
	}



	public String getPan() {
		return pan;
	}



	public void setPan(String pan) {
		this.pan = pan;
	}



	public String getBankname() {
		return bankname;
	}



	public void setBankname(String bankname) {
		this.bankname = bankname;
	}



	public String getAccountno() {
		return accountno;
	}



	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}



	public String getIfsc() {
		return ifsc;
	}



	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}



	public String getAddressline1() {
		return addressline1;
	}



	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}



	public String getAddressline2() {
		return addressline2;
	}



	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public String getState() {
		return state;
	}



	public void setState(String state) {
		this.state = state;
	}
	
	
	
	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getActivationstatus() {
		return activationstatus;
	}



	public void setActivationstatus(String activationstatus) {
		this.activationstatus = activationstatus;
	}

	public Set<Purchase> getPurchases() {
		return this.purchases;
	}

	public void setPurchases(Set<Purchase> purchases) {
		this.purchases = purchases;
	}

	public Carddetail getCarddetail() {
		return this.carddetail;
	}

	public void setCarddetail(Carddetail carddetail) {
		this.carddetail = carddetail;
	}

	public Newcardpayment getNewcardpayment() {
		return this.newcardpayment;
	}

	public void setNewcardpayment(Newcardpayment newcardpayment) {
		this.newcardpayment = newcardpayment;
	}


	@Override
	public String toString() {
		return "Customer [username=" + username + "]";
	}

}