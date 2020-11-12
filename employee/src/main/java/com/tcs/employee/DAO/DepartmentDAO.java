package com.tcs.employee.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Department;

public interface DepartmentDAO {
	public String createDepartment(Department department);
	public Optional<Department> updateDepartment(int id, Department department);
	public String deleteDepartment (int id);
	public Optional<Department>getDepartmentById(int id);
	public Optional<List<Department>> getDepartment();
	public Optional<List<Department>> findByOrganizationId(int id);

}
