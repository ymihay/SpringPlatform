package com.tenper.facebook.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

@Entity
@Table(name = "posts")
public class Post {
	@Id
	@GeneratedValue
	private String id;
	
	@Column(nullable = false)
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
