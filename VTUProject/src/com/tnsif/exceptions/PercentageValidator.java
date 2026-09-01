package com.tnsif.exceptions;

public class PercentageValidator {
	
	public static void isValidPercentage(float perc)throws  ArithmeticException {
		if(perc >=0 && perc<=100) {
			System.out.println("Valid percentage");
		}
		else {
			throw new ArithmeticException();
		}	
	}

}
