package com.tcs.employee.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tcs.employee.DAO.DepartmentDAO;
import com.tcs.employee.DAO.EmployeeDAO;
import com.tcs.employee.model.Department;

@Service
public class DepartmentServiceImpl implements DepartmentService {
	
	@Autowired
	private DepartmentDAO departmentDao;

	public String createDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentDao.createDepartment(department);
	}

	public String updateDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteDepartment(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Department> findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Department>> getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Department>> findByOrganizationId(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
