package com.tnsif.exceptions;

public class ThrowDemo {

	public static void main(String[] args) {
		StudentInfo s1=new StudentInfo();
		s1.setRollNo(110);
		s1.setName("Gayatri");
		s1.setPerc(12);
		s1.show();
		
		VoterInfo v=new VoterInfo();
		v.setName("David");
		v.setAge(10);
		System.out.println(v);
         	}

}
