package com.project.buyeritemservice.pojo;


import java.util.Date;
import java.util.Set;

public class BillPojo {
	private int id;
	BuyerSignupPojo buyer;
	private String type;
	Date date;
	private String remarks;
	private int amount;
	Set<BillDetailsPojo> allBillDetails;
		
	public BillPojo(int id,  String type, Date date, String remarks, int amount,BuyerSignupPojo buyer,
			Set<BillDetailsPojo> allBillDetails) {
		super();
		this.id = id;
		this.buyer = buyer;
		this.type = type;
		this.date = date;
		this.remarks = remarks;
		this.amount = amount;
		this.allBillDetails = allBillDetails;
	}

	public BillPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BuyerSignupPojo getBuyer() {
		return buyer;
	}
	public void setBuyer(BuyerSignupPojo buyer) {
		this.buyer = buyer;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Set<BillDetailsPojo> getAllBillDetails() {
		return allBillDetails;
	}
	public void setAllBillDetails(Set<BillDetailsPojo> allBillDetails) {
		this.allBillDetails = allBillDetails;
	}
	
}
