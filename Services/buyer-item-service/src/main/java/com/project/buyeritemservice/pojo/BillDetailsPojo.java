package com.project.buyeritemservice.pojo;


public class BillDetailsPojo {
	private int id;
	 BillPojo bill;
	 ItemPojo item;
	
	
	
	public BillDetailsPojo(int id, BillPojo bill, ItemPojo item) {
		super();
		this.id = id;
		this.bill = bill;
		this.item = item;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public BillPojo getBill() {
		return bill;
	}
	public void setBill(BillPojo bill) {
		this.bill = bill;
	}
	public ItemPojo getItem() {
		return item;
	}
	public void setItem(ItemPojo item) {
		this.item = item;
	}
	
}