package com.tcs.employee.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Employee;

public interface EmployeeDAO {

	public String createEmployee(Employee employee);
	public Optional<Employee> updateEmployees(int id, Employee employee);
	public String deleteEmployee (int id);
	public Optional<Employee>getEmployeeById(int id);
	public Optional<List<Employee>> getEmployee();
	public Optional<List<Employee>> findByOrganizationId(int id);

}
