package com.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "user_entity")
public class User extends Auditable<String>
{
	@Id
	private int userId;
	private String name;
	private String password;
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
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}
	public User(int userId, String name, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.password = password;
	}
}
