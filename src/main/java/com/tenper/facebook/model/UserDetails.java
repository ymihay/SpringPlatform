package com.tenper.facebook.model;

import java.util.Date;
import java.util.List;

public class UserDetails {
	private User user;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String country;
	private String cityOfLiving;
	private List<User> friends;
	private List<Post> posts;

	public UserDetails(User user, String firstName, String lastName,
			Date dateOfBirth, String country, String cityOfLiving) {
		super();
		this.user = user;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.country = country;
		this.cityOfLiving = cityOfLiving;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCityOfLiving() {
		return cityOfLiving;
	}

	public void setCityOfLiving(String cityOfLiving) {
		this.cityOfLiving = cityOfLiving;
	}

	public List<User> getFriends() {
		return friends;
	}

	public void setFriends(List<User> friends) {
		this.friends = friends;
	}

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
}
