package com.epam.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class ItemModel {
	
	
	@Id
	int id;
	
	@Column(name="name")
	String name;
	
	@Column(name="sweetness")
	int sweetness;
	
	@Column(name="weight")
	int weight;
	
	@ManyToOne
	CategoryModel categoryId;
	
	
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
	public int getSweetness() {
		return sweetness;
	}
	public void setSweetness(int sweetness) {
		this.sweetness = sweetness;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public CategoryModel getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(CategoryModel categoryId) {
		this.categoryId = categoryId;
	}

}
