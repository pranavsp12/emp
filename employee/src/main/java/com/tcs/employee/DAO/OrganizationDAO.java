package com.tcs.employee.DAO;

import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Organization;

public interface OrganizationDAO {
	public String createDepartment(Organization organization);
	public Optional<Organization> updateOrganization(int id, Organization organization);
	public String deleteOrganization (int id);
	public Optional<Organization>getOrganizationById(int id);
	public Optional<List<Organization>> getOrganization();
	public Optional<List<Organization>> findByOrganizationId(int id);


}
