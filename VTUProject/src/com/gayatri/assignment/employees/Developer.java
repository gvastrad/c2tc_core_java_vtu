package com.gayatri.assignment.employees;

public class Developer extends Employee {
	private String language;

	public String getLanguage() {
		return language;
	}

	protected void setLanguage(String language) {
		this.language = language;
	}

	public Developer(String language) {
		this.language = language;
	}
	public Developer() {
		
	}

}
