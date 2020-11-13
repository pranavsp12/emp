package com.tcs.employee.service;

import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Department;


public interface DepartmentService {
	public String createDepartment(Department department);
	public String updateDepartment(long id);
	public String deleteDepartment(long id);
	public Optional<Department> findById(long id);
	public Optional<List<Department>> getDepartment();
	public Optional<List<Department>> findByOrganizationId(long id);

}
