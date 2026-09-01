package com.tnsif.exceptions;

public class AgeValidator {
	
	public static void validateAge(int age) throws InvalidAgeException{
		if(age>18) {
			System.out.println("The candidate is eligible vote");
		}
		else
		throw new InvalidAgeException();
	}

}
