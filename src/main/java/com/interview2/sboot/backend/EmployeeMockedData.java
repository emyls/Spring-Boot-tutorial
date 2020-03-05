package com.interview2.sboot.backend;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMockedData {
	
	private List<Employee> employeeList;
	
	private static EmployeeMockedData instance = null;
	
	public static EmployeeMockedData getEmployeeMockedDataInstance() {
		
		if(instance == null) return new EmployeeMockedData();
		
		else return instance;
	}
	
	public EmployeeMockedData() {
		employeeList = new ArrayList<Employee>();
		
		employeeList.add(new Employee(1, 22, "Ian"));
		employeeList.add(new Employee(2, 25, "Ryan"));
		employeeList.add(new Employee(3, 23, "Owen"));
		employeeList.add(new Employee(4, 34, "Scott"));
		employeeList.add(new Employee(5, 26, "Patrick"));
	}
	
	// get all Employees
	public List<Employee> getAllEmployees() {
		return employeeList;
	}
	
	// get an Employee
	public Employee getEmployeeById(int id) {
		return employeeList.get(id-1);
	}
	
	// post an Employee
	public Employee createAnEmployee(int age, String name) {
		Employee newEmployee = new Employee(employeeList.size()+1, age, name);
		employeeList.add(newEmployee);
		return newEmployee;
	}
	
	// update an Employee
	public Employee updateAnEmployee(int id, int age, String name) {
		Employee updateEmployee = new Employee(id, age, name);
		employeeList.set(id-1, updateEmployee);
		return updateEmployee;
	}

}
