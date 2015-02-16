package com.tenper.facebook.model;

public class User {
	private String id;
	private String login;
	private String password;
	private UserDetails userDetails;

	public User(String login, String password, UserDetails userDetails) {
		super();
		this.login = login;
		this.password = password;
		this.userDetails = userDetails;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}
}
