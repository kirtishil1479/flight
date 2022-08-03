package com.flightApp.entity;



import javax.persistence.Embeddable;

@Embeddable
public class PassengerDetails {
	
	
	private String name;
	private String gender;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public PassengerDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "PassengerDetails [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	

}
