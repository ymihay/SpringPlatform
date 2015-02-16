package com.tenper.facebook.model;

public class Tagg {
	private String id;
	private String name;

	public Tagg(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Tagg(String name) {
		super();
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
