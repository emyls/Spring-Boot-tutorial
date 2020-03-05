package com.interview2.sboot.backend;

public class Employee {

	private String employeeName;
	private int employeeId, employeeAge;
	
	public Employee(int id, int age, String name ) {
		this.employeeId   = id;
		this.employeeAge  = age;
		this.employeeName = name;
	}
	
	public int getEmployeeId()      { return this.employeeId;   }
	public int getEmployeeAge()     { return this.employeeAge;  }
	public String getEmployeeName() { return this.employeeName; }
}
