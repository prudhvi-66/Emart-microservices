package com.project.buyeritemservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "sub_category_table")
public class SubCategoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "subcategory_id")
	private int id;
	
	@Column(name = "subcategory_name")
	private String name;
	
	@Column(name = "subcategory_brief")
	private String brief;
	
	@Column(name = "subcategory_gst")
	private int gstPercent;
	
	@ManyToOne
	@JoinColumn(name = "category_id")
	private CategoryEntity category;
	
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

	public CategoryEntity getCategory() {
		return category;
	}

	public void setCategory(CategoryEntity category) {
		this.category = category;
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

	public SubCategoryEntity(int id, String name, CategoryEntity category, String brief, int gstPercent) {
		super();
		this.id = id;
		this.name = name;
		this.category = category;
		this.brief = brief;
		this.gstPercent = gstPercent;
	}

	public SubCategoryEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
