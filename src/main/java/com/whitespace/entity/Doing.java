package com.whitespace.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Doing {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String todoing;
	
	public Doing() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Doing(String todoing) {
		super();
		this.todoing = todoing;
	}



	public String getTodoing() {
		return todoing;
	}
	
	
	

}
