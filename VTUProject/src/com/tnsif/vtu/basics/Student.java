package com.tnsif.vtu.basics;

public class Student {
	 private int sId;
	private String sName;
	
	public void setsID(int sId) {
		this.sId=sId;
	}
	public int getsID() {
		return sId;
	}
	
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	
	
	public Student(int sId, String sName) {
		this.sId = sId;
		this.sName = sName;
	}
	
	public Student() {
		
	}
	public void display() {
		System.out.println("Student details ");
		System.out.print(sId);
		System.out.print(" ");
		System.out.print(sName);
	}
	@Override
	public String toString() {
		return "Student details:---- [sId=" + sId + ", sName=" + sName + "]";
	}

	

}
