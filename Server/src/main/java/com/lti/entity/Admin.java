package com.lti.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="\"ADMIN\"")
public class Admin{
	
	@Id
	@JsonIgnore
	@GeneratedValue
	private long adminid;
	@Column(length=20,nullable=false)
	private String firstname;
	@Column(length=20,nullable=false)
	private String lastname;
	@Column(length=25,nullable=false,unique = true)
	private String adminemailid;
	@Column(length=10,nullable=false,unique = true)
	private String adminusername;
	@Column(length=8,nullable=false)
	private String adminpassword;
	

	public Admin() {
	}

	public long getAdminid() {
		return this.adminid;
	}

	public void setAdminid(long adminid) {
		this.adminid = adminid;
	}
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAdminemailid() {
		return this.adminemailid;
	}

	public void setAdminemailid(String adminemailid) {
		this.adminemailid = adminemailid;
	}

	public String getAdminusername() {
		return this.adminusername;
	}

	public void setAdminusername(String adminusername) {
		this.adminusername = adminusername;
	}

	public String getAdminpassword() {
		return this.adminpassword;
	}

	public void setAdminpassword(String adminpassword) {
		this.adminpassword = adminpassword;
	}
}