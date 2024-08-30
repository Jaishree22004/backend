package com.jaidemo.DTO;

public class Users {
	private String userName;
	private String mail;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Users(String userName, String mail, String password) {
		super();
		this.userName = userName;
		this.mail = mail;
		this.password = password;
	}

	
	
}
