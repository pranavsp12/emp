package com.tcs.employee.service;

import java.util.Optional;

import com.tcs.employee.model.Employee;

public interface EmployeeService {
	
	public String createEmployee(Employee employee);
	public Optional<Employee> getEmployeeById(int Id);

	
}
