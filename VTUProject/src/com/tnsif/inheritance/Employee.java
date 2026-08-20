package com.tnsif.inheritance;

public class Employee extends Person {
private int eid;
private double salary;
private int deptid;
public int getEid() {
	return eid;
}
public void setEid(int eid) {
	this.eid = eid;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public int getDeptid() {
	return deptid;
}
public void setDeptid(int deptid) {
	this.deptid = deptid;
}
public Employee() {
	super();
	this.deptid=1;
	this.eid=100;
	this.salary=40000;
}
public Employee(String name,String city,Address address,int eid, double salary, int deptid) {
	super(name,city,address);
	this.eid = eid;
	this.salary = salary;
	this.deptid = deptid;
}
@Override
public String toString() {
	return "Employee [eid=" + eid + ", salary=" + salary + ", deptid=" + deptid + ", getName()=" + getName()
			+ ", getCity()=" + getCity() + ", Address= " +"Street"+ getAddress().getStreet() + "Pincode + "+getAddress().getPincode()+"]";
}
}
