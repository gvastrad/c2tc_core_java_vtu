package com.tnsif.polymorphism;

class Testable
{
		static void m1(char ch)
		{
			System.out.println("Char-arg Constructor");
		}
		static void m1(int a)
		{
			System.out.println("int-arg Constructor");
		}
		public static void main(String args[])
		{	
			m1(10);
			m1('b');
		}
	}

