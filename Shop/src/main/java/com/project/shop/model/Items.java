package com.project.shop.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer item_id;
	private String item_name;
	private String item_catagory;
	private Integer qty;
	private Integer price;
	private Integer is_available;
	

	
	public Items() {
		
	}


	public Items(String item_name, String item_catagory, Integer qty, Integer price, Integer is_available
			) {
		
		this.item_name = item_name;
		this.item_catagory = item_catagory;
		this.qty = qty;
		this.price = price;
		this.is_available = is_available;
		
	}


	public String getItem_name() {
		return item_name;
	}


	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}


	public String getItem_catagory() {
		return item_catagory;
	}


	public void setItem_catagory(String item_catagory) {
		this.item_catagory = item_catagory;
	}


	public Integer getQty() {
		return qty;
	}


	public void setQty(Integer qty) {
		this.qty = qty;
	}


	public Integer getPrice() {
		return price;
	}


	public void setPrice(Integer price) {
		this.price = price;
	}


	public Integer getIs_available() {
		return is_available;
	}


	public void setIs_available(Integer is_available) {
		this.is_available = is_available;
	}


	@Override
	public String toString() {
		return "Items [item_id=" + item_id + ", item_name=" + item_name + ", item_catagory=" + item_catagory + ", qty="
				+ qty + ", price=" + price + ", is_available=" + is_available + "]";
	}

	 
	
	
}
