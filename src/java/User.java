package com.miniproject.carrental.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class User {
	
	private String id;
	private String username;
	private String mobile;
	private String usertype;
	@Id
	private String email;
	public User() {
		super();
	}
	public User(String id, String username, String mobile, String usertype, String email) {
		super();
		this.id = id;
		this.username = username;
		this.mobile = mobile;
		this.usertype = usertype;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", mobile=" + mobile + ", id=" + id + ", usertype=" + usertype
				+ ", email=" + email + "]";
	}

}
