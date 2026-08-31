package com.tnsif.exceptions;

import java.util.Scanner;

public class ExceptionsDemo {

	public static void main(String[] args) {
		try {
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the array length");
			int n=sc.nextInt();
		int[] a=new int[n];
		a[3]=100;
		int numOne,numTwo;
		System.out.println("Enter the numbers");
		numOne=sc.nextInt();
		numTwo=sc.nextInt();
		int x=numOne/numTwo;
		System.out.println(x);
		}
	
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
		
		System.out.println("The other code");
		
		System.out.println("The other code");
	}
}
