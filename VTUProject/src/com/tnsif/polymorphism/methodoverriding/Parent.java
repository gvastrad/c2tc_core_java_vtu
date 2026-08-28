package com.tnsif.polymorphism.methodoverriding;

public class Parent {
	
	protected  boolean login(String uname,String pwd) {
		boolean status=false;
		if(uname==uname && pwd==pwd)
		{
			status=true;
			System.out.println("Login successfull");
		}
		return status ;
	}

}
