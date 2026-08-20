package com.tnsif.vtu.basics;

public class Person {
	private String name;
	private String location;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Person(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	public Person() {
		this.name="Ms. Draupadi Murmu";
		this.location="New Delhi";
	}
	@Override
	public String toString() {
		return "Person Details [name=" + name + ", location=" + location + "]";
	}
	
	

}
