package com.bbva.wikj.dto.customer;

import java.io.Serializable;

/**
 * The OutDTO class...
 */
public class OutDTO implements Serializable  {
	private static final long serialVersionUID = 2931699728946643245L;

	private String id;

	private String date;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
