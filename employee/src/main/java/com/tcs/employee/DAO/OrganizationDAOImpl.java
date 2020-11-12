package com.tcs.employee.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Organization;

public class OrganizationDAOImpl implements OrganizationDAO {
	
	private OrganizationDAOImpl() {
		
	}
	private static OrganizationDAO dao;
	 	
	public static OrganizationDAO getInstance() {
		if(dao==null) {
			dao = new OrganizationDAOImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
	}

	public String createDepartment(Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Organization> updateOrganization(int id, Organization organization) {
		// TODO Auto-generated method stub
		return null;
	}

	public String deleteOrganization(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Organization> getOrganizationById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Organization>> getOrganization() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<List<Organization>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
