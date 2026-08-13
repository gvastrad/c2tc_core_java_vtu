package com.gayatri.assignment.utilities;

import com.gayatri.assignment.employees.Developer;
import com.gayatri.assignment.employees.Employee;
import com.gayatri.assignment.employees.Manager;

public class EmployeeUtilities extends Developer  {
 Developer d;
 Manager m;
public EmployeeUtilities(Developer d, Manager m) {
	super();
	this.d = d;
	this.m = m;
}
 public void setSalary(float sal) {
	 this.d.setEsalary(sal);
	 this.m.setEsalary(sal);
	 //d.setLanguage("Java");
 }
 
}
