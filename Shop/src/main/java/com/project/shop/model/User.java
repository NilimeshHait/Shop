package com.project.shop.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	@Id
	private String user_id;
	private String user_name;
	private String password;
	private String phone_number;
	private Date dob;
	private Integer is_admin;
	
	public User() {
		
	}
	
	public User(String user_id, String user_name, String password, String phone_number, Date dob,
			Integer is_admin) {
		
		this.user_id = user_id;
		this.user_name = user_name;
		this.password = password;
		this.phone_number = phone_number;
		this.dob = dob;
		this.is_admin = is_admin;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUse_name() {
		return user_name;
	}

	public void setUse_name(String use_name) {
		this.user_name = use_name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public Date getDob() {
		return dob;
	}

	public void setJoin_date(Date dob) {
		this.dob=dob;
	}

	public Integer getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(Integer is_admin) {
		this.is_admin = is_admin;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", user_name=" + user_name + ", password=" + password + ", phone_number="
				+ phone_number + ", dob 	=" + dob + ", is_admin=" + is_admin + "]";
	}
	
	
	
	
	
	
	
	
}
