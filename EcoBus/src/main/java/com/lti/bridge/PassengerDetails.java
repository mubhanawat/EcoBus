package com.lti.bridge;

public class PassengerDetails {
	private int age;
	private String gender;
	private String name;
	
	
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "PassengerDetails [age=" + age + ", gender=" + gender + ", name=" + name + "]";
	}
	
	
	

}
