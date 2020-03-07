package com.project.buyeritemservice.entity;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "buyer_signup_table")
public class BuyerSignupEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "buyer_id")
	private int id;
	
	@Column(name = "buyer_username")
	private String username;
	
	@Column(name = "buyer_password")
	private String password;
	
	@Column(name = "buyer_email")
	private String email;
	
	@Column(name = "buyer_mobile")
	private int mobile;
	
	@Column(name = "buyer_date")
	private Date date;
	
	@OneToMany(mappedBy = "buyer")
	Set<BillEntity>allBills;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<BillEntity> getAllBills() {
		return allBills;
	}

	public void setAllBills(Set<BillEntity> allBills) {
		this.allBills = allBills;
	}

	public BuyerSignupEntity(int id, String username, String password, String email, int mobile, Date date,
			Set<BillEntity> allBills) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.mobile = mobile;
		this.date = date;
		this.allBills = allBills;
	}

	public BuyerSignupEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "BuyerSignupEntity [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email
				+ ", mobile=" + mobile + ", date=" + date + ", allBills=" + allBills + "]";
	}
	
	
	
	

}
