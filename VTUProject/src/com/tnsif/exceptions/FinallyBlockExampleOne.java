package com.tnsif.exceptions;

public class FinallyBlockExampleOne {
	public static void divide(int a, int b) {
		 try {
	         System.out.println("-------Within Try Block-----------");
	         int result = a / b;
	         System.out.println("Result: " + result);
	}
		 catch(ArithmeticException ae) {
			 ae.printStackTrace();
		 }
		 finally {
			 System.out.println("In finally block");
		 }
		   System.out.println("Statement after finally block");
}
}
