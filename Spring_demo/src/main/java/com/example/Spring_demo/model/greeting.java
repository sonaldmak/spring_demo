package com.example.Spring_demo.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
public class greeting {
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
