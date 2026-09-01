package com.tnsif.exceptions;

public class InvalidAgeException extends Exception {
	public InvalidAgeException(){
		System.out.println("Inavalid Age");
	}
	  InvalidAgeException(String message) {
	        super(message);
	    }
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	@Override
	public String toString() {
		return "InvalidAgeException []";
	}
	

}
