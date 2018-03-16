package com.train.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name="users")
@Table(name="users")
public class Users{

	@Id
	@Column(name="user_id")
	protected int userId;
	@Column(name="name")
	protected String name;
	@Column(name="email")
	protected String email;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Users(String name, String email) {
		this.name = name;
		this.email = email;
	}
	public Users() {
	}
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", email=" + email + "]";
	}
	
	
}
