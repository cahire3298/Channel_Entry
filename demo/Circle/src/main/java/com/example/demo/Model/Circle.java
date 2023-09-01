package com.example.demo.Model;

import jakarta.persistence.Entity;

@Entity
public class Circle {

	@jakarta.persistence.Id
	public int Id;
	
	public String Name;

	public Circle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Circle(int id, String name) {
		super();
		Id = id;
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}
	
	
}
