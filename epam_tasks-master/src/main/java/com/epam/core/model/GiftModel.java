package com.epam.core.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="gift")
public class GiftModel {

	
	@Id
	int id;
	
	@Column(name="total_weight")
	int totalWeight;
	
	@ManyToMany
	@Column(name="items")
	List<ItemModel> items;
	
	@OneToOne
	@JoinColumn(name = "id")
	ChildModel child;
	
	@Column(name="child_name")
	String childName;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalWeight() {
		return totalWeight;
	}
	public void setTotalWeight(int totalWeight) {
		this.totalWeight = totalWeight;
	}
	public List<ItemModel> getItems() {
		return items;
	}
	public void setItems(ArrayList<ItemModel> items) {
		this.items = items;
	}
	public String getChildName() {
		return childName;
	}
	public void setChildName(String childName) {
		this.childName = childName;
	}
	
}
