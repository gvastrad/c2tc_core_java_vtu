package com.gayatri.assignment.employees;

public class Employee {
	private int eid;
	private String ename;
	private float esalary;
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public float getEsalary() {
		return esalary;
	}
	 public void setEsalary(float esalary) {
		this.esalary = esalary;
	}
	public Employee() {
		
	}
	public Employee(int eid, String ename, float esalary) {
		this.eid = eid;
		this.ename = ename;
		this.esalary = esalary;
	}
}
