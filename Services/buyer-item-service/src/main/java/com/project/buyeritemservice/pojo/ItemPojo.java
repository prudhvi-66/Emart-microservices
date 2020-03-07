package com.project.buyeritemservice.pojo;

public class ItemPojo {
	private int id;
	private String name;
	private SellerSignupPojo seller;
	private  SubCategoryPojo subCategory;
	private int price;
	private String description;
	private int stock;
	private String remarks;
	private String image;
	public ItemPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ItemPojo(int id, String name, SellerSignupPojo seller, SubCategoryPojo subCategory, int price,
			String description, int stock, String remarks, String image) {
		super();
		this.id = id;
		this.name = name;
		this.seller = seller;
		this.subCategory = subCategory;
		this.price = price;
		this.description = description;
		this.stock = stock;
		this.remarks = remarks;
		this.image = image;
	}
	@Override
	public String toString() {
		return "ItemPojo [id=" + id + ", name=" + name + ", seller=" + seller + ", subCategory=" + subCategory
				+ ", price=" + price + ", description=" + description + ", stock=" + stock + ", remarks=" + remarks
				+ ", image=" + image + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SellerSignupPojo getSeller() {
		return seller;
	}
	public void setSeller(SellerSignupPojo seller) {
		this.seller = seller;
	}
	public SubCategoryPojo getSubCategory() {
		return subCategory;
	}
	public void setSubCategory(SubCategoryPojo subCategory) {
		this.subCategory = subCategory;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	
	
	
	
	
}


