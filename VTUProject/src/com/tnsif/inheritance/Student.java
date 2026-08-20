package com.tnsif.inheritance;

public class Student extends Citizen {
private int rollNo;
private String collegeName;
public int getRollNo() {
	return rollNo;
}
public void setRollNo(int rollNo) {
	this.rollNo = rollNo;
}
public String getCollegeName() {
	return collegeName;
}
public void setCollegeName(String collegeName) {
	this.collegeName = collegeName;
}
public Student() {
	super();
	System.out.println("In Student class");
}

public Student(String name, long adharNumber, String address, long phNo, int rollNo, String collegeName) {
	super(name, adharNumber, address, phNo);
	this.rollNo = rollNo;
	this.collegeName = collegeName;
}
@Override
public String toString() {
	return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()
			+ ", AdharNumber" + getAdharNumber() + ", Address=" + getAddress() + ", PhNo=" + getPhNo()
			+ "]";
}

}
