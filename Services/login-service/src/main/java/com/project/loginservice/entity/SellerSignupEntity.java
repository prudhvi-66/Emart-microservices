package com.project.loginservice.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "seller_signup_table")
public class SellerSignupEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "seller_id")
	private int id;
	
	@Column(name = "seller_username")
	private String username;
	
	@Column(name = "seller_password")
	private String password;
	
	@Column(name = "seller_company")
	private String company;
	
	@Column(name = "seller_brief")
	private String brief;
	
	@Column(name = "seller_gst")
	private int gst;
	
	@Column(name = "seller_address")
	private String address;
	
	@Column(name = "seller_email")
	private String email;
	
	@Column(name = "seller_website")
	private String website;
	
	@Column(name = "seller_contact")
	private int contact;
	
	public SellerSignupEntity(int id, String username, String password, String company, String brief, int gst,
			String address, String email, String website, int contact) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.company = company;
		this.brief = brief;
		this.gst = gst;
		this.address = address;
		this.email = email;
		this.website = website;
		this.contact = contact;
	}
	public SellerSignupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public int getGst() {
		return gst;
	}
	public void setGst(int gst) {
		this.gst = gst;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
	

}
