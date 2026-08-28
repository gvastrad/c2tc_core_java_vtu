package com.tnsif.polymorphism.methodoverloading;

public class MethodOverLoadingDemo {

	public static void main(String[] args) {
		//MethodOverLoading obj=new MethodOverLoading();
		System.out.println(MethodOverLoading.addition(10, 20));
		System.out.println(MethodOverLoading.addition(10, 30.2f));
		System.out.println(MethodOverLoading.addition(40.8f, 30.7f));
		System.out.println(MethodOverLoading.addition("Great", "India"));

	}

}
