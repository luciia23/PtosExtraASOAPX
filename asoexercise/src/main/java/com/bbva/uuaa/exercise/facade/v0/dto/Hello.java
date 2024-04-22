package com.bbva.uuaa.exercise.facade.v0.dto;

import java.io.Serializable;

public class Hello implements Serializable {
	//DTO output
	String message;
	public Hello() {
	}
	
	public String getMessage () {
		return message;
	}
	
	public void setMessage (String message) {
		this.message = message;
	}
}
