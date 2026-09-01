package com.tnsif.exceptions;

public class StudentInfo {
	private int rollNo;
	private String name;
	private float perc;
	
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPerc() {
		return perc;
	}
	public void setPerc(float perc) {
		this.perc = perc;
	}
	
	public void show() {
		try {
		PercentageValidator.isValidPercentage(perc);
		System.out.println("Student details ---");
		System.out.println("RollNo : "+rollNo+"\tName : "+name+"\tPer : "+perc);
		}
		catch(ArithmeticException ae) {
			System.out.println("Give the proper percentage");
			System.out.println(ae);
		}
	}

}
