package com.tnsif.inheritance;

public class Studentt extends Person {
	private String clas;
	private float perc;
	
	public Studentt() {
	super();
	this.clas="FY";
	this.perc=60.00f;
	}
	
	public Studentt(String name,String city,String clas, float perc) {
		super(name,city);
		this.clas = clas;
		this.perc = perc;
	}
	
	@Override
	public String toString() {
		return "Studentt [clas=" + clas + ", perc=" + perc + ", getName()=" + getName() + ", getCity()=" + getCity()
				+ "]";
	}

}
