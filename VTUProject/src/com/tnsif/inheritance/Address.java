package com.tnsif.inheritance;

public class Address {
private String street;
private String city;
private String state;
private int pincode;
public Address(String street, String city, String state, int pincode) {
	super();
	this.street = street;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
@Override
public String toString() {
	return "Address [street=" + street + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
}

}
