package com.example.j2eeapp.domain;

import java.io.Serializable;

public class UserEntity implements Serializable {

	private static final long serialVersionUID = 9014169812363387062L;
	
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
}
