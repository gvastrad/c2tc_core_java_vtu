package com.tnsif.vtu.basics;

public class StaticConceptDemo {
	final static  int x=10;
	private int y;
	
	static void m1() {
		int z=10;
		System.out.println(x);
		//System.out.println(y);
		System.out.println(z);
	}
	void m2() {
		System.out.println(x);
		System.out.println(y);
		//z cant be accessed its a m1 local variablee
		//System.out.println(z);
	}
	static {
		System.out.println("Hello World");
	}

}
