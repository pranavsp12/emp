package com.tcs.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employee.DAO.EmployeeDAO;
import com.tcs.employee.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDao;

	public String createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeDao.createEmployee(employee);
	}

	public String updateEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteEmployee(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Employee> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Employee>> getEmployees() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Employee>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
}
