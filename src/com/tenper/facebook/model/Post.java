package com.tenper.facebook.model;

import java.util.List;

public class Post {
	private String id;
	private String postMessage;
	private List<Tagg> taggs;

	public Post(String postMessage, List<Tagg> taggs) {
		super();
		this.postMessage = postMessage;
		this.taggs = taggs;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPostMessage() {
		return postMessage;
	}

	public void setPostMessage(String postMessage) {
		this.postMessage = postMessage;
	}

	public List<Tagg> getTaggs() {
		return taggs;
	}

	public void setTaggs(List<Tagg> taggs) {
		this.taggs = taggs;
	}
}
