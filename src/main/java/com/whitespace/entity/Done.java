package com.whitespace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Done {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String todone;
	
	public Done() {
		// TODO Auto-generated constructor stub
	}

	public Done(String todone) {
		super();
		this.todone = todone;
	}
	
	
	
	
	

}
