package com.project.loginservice.pojo;

public class SubCategoryPojo {

	private int id;
	private String name;
	private CategoryPojo Category;
	private String brief;
	private int gstPercent;
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
	public CategoryPojo getCategory() {
		return Category;
	}
	public void setCategory(CategoryPojo category) {
		Category = category;
	}
	public String getBrief() {
		return brief;
	}
	public void setBrief(String brief) {
		this.brief = brief;
	}
	public int getGstPercent() {
		return gstPercent;
	}
	public void setGstPercent(int gstPercent) {
		this.gstPercent = gstPercent;
	}
	public SubCategoryPojo(int id, String name, CategoryPojo category, String brief, int gstPercent) {
		super();
		this.id = id;
		this.name = name;
		Category = category;
		this.brief = brief;
		this.gstPercent = gstPercent;
	}
	public SubCategoryPojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
