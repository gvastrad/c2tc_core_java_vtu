package com.tnsif.vtu.basics;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s1=new Student();
		System.out.println("Enter Students details");
		System.out.print("Enter Student name");
		String name=sc.nextLine();
		s1.setsName(name);
		System.out.println("Enter Student id");
		s1.setsID(sc.nextInt());
		System.out.println(" Students details -------");
		System.out.println(s1);
		System.out.println("Char at position "+"0"+"is");
		System.out.println(name.charAt(0));
		System.out.println("Do you want to proceed?");
		System.out.println("Yes/No");
		String c=sc.next();
		System.out.println("Response is: "+c.charAt(0));
		//1System.err.println("Its a error");
	}

}
