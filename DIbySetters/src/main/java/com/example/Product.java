package com.example;

public class Product {
	private int id;
	private String name;
	
	//setters and getters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	void product_details() {
		System.out.println(this.id + " " + this.name);
	}
	
}
