package com.whitespace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Do {
	


	@Id
	@GeneratedValue
	private Long id;
	
	private String todo;
	
	public Do() {
		// TODO Auto-generated constructor stub
	}

	public Do(String todo) {
		super();
		this.todo = todo;
	}
	
	public String getTodo() {
		return todo;
	}
	
	
	
	
	

}
