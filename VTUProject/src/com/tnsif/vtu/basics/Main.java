package com.tnsif.vtu.basics;

public class Main {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.setsID(101);
		obj.setsName("Gayatri");
		obj.display();
		System.out.println(obj.hashCode());
		
		Student obj1=new Student(102,"Gowri");
		obj1.display();
		System.out.println(obj1.hashCode());

	}

}
