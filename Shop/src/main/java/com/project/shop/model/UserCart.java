package com.project.shop.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
@Table(name="user_cart")
public class UserCart {
	
	@Id
	private CartPrimaryKey cartPrimaryKey;
	private Integer cartQty;
	private String itemName;
	private double price;
//	@OneToMany(mappedBy = "userCart", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	private Set<Items> cart_items;
	public UserCart() {
		
	}
	
	public UserCart(CartPrimaryKey cartPrimaryKey, Integer cartQty,String itemName, double price) {
	
		this.cartPrimaryKey = cartPrimaryKey;
		this.cartQty = cartQty;
		this.itemName=itemName;
		this.price = price;
	}

	public CartPrimaryKey getCartPrimaryKey() {
		return cartPrimaryKey;
	}

	public void setCartPrimaryKey(CartPrimaryKey cartPrimaryKey) {
		this.cartPrimaryKey = cartPrimaryKey;
	}

	public Integer getCartQty() {
		return cartQty;
	}

	public void setCartQty(Integer cartQty) {
		this.cartQty = cartQty;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public String getItemName() {
		return itemName;
	}
	
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	
	
	
}
