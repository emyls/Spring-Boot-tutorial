package com.interview2.sboot.backend;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	EmployeeMockedData employeeMockedData = new EmployeeMockedData();
	
	@GetMapping("/employee")
	public List<Employee> sendEmployeeList() {
		return employeeMockedData.getAllEmployees();
	}
	
	@GetMapping("/employee/{id}")
	public Employee sendAnEmployee(@PathVariable int id) {
		return employeeMockedData.getEmployeeById(id);
	}
}
