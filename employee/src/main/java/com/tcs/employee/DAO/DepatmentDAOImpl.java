package com.tcs.employee.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Department;

public class DepatmentDAOImpl implements DepartmentDAO {
	
	
	private DepatmentDAOImpl() {
		
	}
	private static DepartmentDAO dao;
	 	
	public static DepartmentDAO getInstance() {
		if(dao==null) {
			dao = new DepatmentDAOImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
	}
	

	public String createDepartment(Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Department> updateDepartment(int id, Department department) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Department> getDepartmentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	public String deleteDepartment(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Department>> getDepartment() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Department>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
