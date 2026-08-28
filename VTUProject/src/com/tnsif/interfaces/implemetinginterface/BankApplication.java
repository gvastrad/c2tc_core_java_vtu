package com.tnsif.interfaces.implemetinginterface;

public class BankApplication {

	public static void main(String[] args) {
		Bank b=new BankImpl();
		Account a=new Account(101,"David",80000,b);
		
		b.deposit(a, 20000);
		System.out.println(a);
		b.withdraw(a, 10000);
		System.out.println(a);
		b.withdraw(a, 90000);

	}

}
