package com.tnsif.inheritance;

public class Citizen {
	private String name;
	private long adharNumber;
	private String address;
	private long phNo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAdharNumber() {
		return adharNumber;
	}
	public void setAdharNumber(long adharNumber) {
		this.adharNumber = adharNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getPhNo() {
		return phNo;
	}
	public void setPhNo(long phNo) {
		this.phNo = phNo;
	}
	public Citizen() {
		System.out.println("In citizen class");
	}
	public Citizen(String name, long adharNumber, String address, long phNo) {
		this.name = name;
		this.adharNumber = adharNumber;
		this.address = address;
		this.phNo = phNo;
	}
	@Override
	public String toString() {
		return "Citizen [name=" + name + ", adharNumber=" + adharNumber + ", address=" + address + ", phNo=" + phNo
				+ "]";
	}
}
