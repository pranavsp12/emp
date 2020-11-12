package com.tcs.employee.service;

import java.util.Optional;

import com.tcs.employee.DAO.EmployeeDAO;
import com.tcs.employee.DAO.EmployeeDAOImpl;
import com.tcs.employee.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private static EmployeeService dao;
	
	private EmployeeServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	public static EmployeeService getInstance() {
		
		if(dao==null) {
			dao = new EmployeeServiceImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
		
		
	}
	EmployeeDAO employeeDao = EmployeeDAOImpl.getInstance();
	
	public String createEmployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.createEmployee(employee);
	}

	public Optional<Employee> getEmployeeById(int Id) {
		// TODO Auto-generated method stub
		return employeeDao.getEmployeeById(Id);
	}

}
