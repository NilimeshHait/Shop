package com.project.shop.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class CartPrimaryKey implements Serializable{
	
	private String userId;
	private Integer itemId;
	
	
	
	public CartPrimaryKey() {
		
	}
	public CartPrimaryKey(String userId, Integer itemId) {
		
		this.userId = userId;
		this.itemId = itemId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public Integer getItemId() {
		return itemId;
	}
	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}
	
	

}
