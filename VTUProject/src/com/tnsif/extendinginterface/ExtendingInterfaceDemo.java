package com.tnsif.extendinginterface;

public class ExtendingInterfaceDemo implements ChildInterface {

	@Override
	public void print() {
		System.out.println("print method");	
	}

	@Override
	public void show() {
		System.out.println("show method");	
	}
}
