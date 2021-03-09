package com.ymsli.labtest.model.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Publisher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String code;
	private String name;
	@OneToOne(mappedBy = "publisher")
	private Book book;

	public Publisher() {
	}

	public Publisher(String code, String name) {
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Publisher [code=");
		builder.append(code);
		builder.append(", name=");
		builder.append(name);
		builder.append(", book=");
		builder.append(book);
		builder.append("]");
		return builder.toString();
	}
	
	

}
