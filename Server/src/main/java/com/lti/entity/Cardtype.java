package com.lti.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.util.Set;

@Entity
public class Cardtype{
	
	@Id
	@JsonIgnore
	private long cardtypeid;
	
	@Column(length=5,nullable=false,unique = true)
	private int activeyear;
	
	@Column(length=5,nullable=false,unique = true)
	private int cardjoiningfee;
	
	@Column(length=10,nullable=false,unique = true)
	private Double cardlimit;
	
	@Column(length=10,nullable=false,unique = true)
	private String cardtypename;

	//bi-directional many-to-one association to Carddetail
	@OneToMany(mappedBy="cardtype",cascade = CascadeType.ALL)
	private Set<Carddetail> carddetails;

	public Cardtype() {
	}

	public long getCardtypeid() {
		return this.cardtypeid;
	}

	public void setCardtypeid(long cardtypeid) {
		this.cardtypeid = cardtypeid;
	}

	public int getActiveyear() {
		return this.activeyear;
	}

	public void setActiveyear(int activeyear) {
		this.activeyear = activeyear;
	}

	public int getCardjoiningfee() {
		return this.cardjoiningfee;
	}

	public void setCardjoiningfee(int cardjoiningfee) {
		this.cardjoiningfee = cardjoiningfee;
	}

	public Double getCardlimit() {
		return this.cardlimit;
	}

	public void setCardlimit(Double cardlimit) {
		this.cardlimit = cardlimit;
	}

	public String getCardtypename() {
		return this.cardtypename;
	}

	public void setCardtypename(String cardtypename) {
		this.cardtypename = cardtypename;
	}

	public Set<Carddetail> getCarddetails() {
		return this.carddetails;
	}

	public void setCarddetails(Set<Carddetail> carddetails) {
		this.carddetails = carddetails;
	}
}