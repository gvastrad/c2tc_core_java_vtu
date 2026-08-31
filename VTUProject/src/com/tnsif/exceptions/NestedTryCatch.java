package com.tnsif.exceptions;

public class NestedTryCatch {
	public static void check() {
		String str="TNSIF";
		int length=str.length();
		System.out.println("String length: " + length);
		String anotherString=null;
		int y = 6;
		
		try {
			try {
				System.out.println(str.charAt(y));
			}
			catch(StringIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			System.out.println("String length: " + anotherString.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}		
	}
}
