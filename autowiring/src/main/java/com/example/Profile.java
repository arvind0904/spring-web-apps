package com.example;

import org.springframework.beans.factory.annotation.Autowired;

public class Profile {
	private int id;
	private String skill;
	private User user; //user of type User class
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public User getUser() {
		return user;
	}
	
	@Autowired
	public void setUser(User user) {
		this.user = user;
	}
	
	void getProfileDetails(){
		System.out.println(id + " " + skill + " " + user.getUsername());
	}
}
