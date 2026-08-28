package com.tnsif.polymorphism.methodoverriding;

public class MethodOveridingDemo {

	public static void main(String[] args) {
		Parent p=new Parent();
		p.login("Gayatri", "123");
        p=new Child();
        p.login("David", "xyz");
	}

}
