package com.tcs.employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.employee.model.Organization;
import com.tcs.employee.util.DBUtils;

@Repository
public class OrganizationDAOImpl implements OrganizationDAO {
	
	@Autowired
	DBUtils dbUtils;

	public String createDepartment(Organization organization) {
		Connection connection = dbUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		String insertEmployee = "insert into ORGANIZATION (id,name,address,departments,employees) values(?,?,?,?,?)";
		try {
			 preparedStatement = connection.prepareStatement(insertEmployee);
			 preparedStatement.setLong(1, organization.getId());
			 preparedStatement.setString(2, organization.getName());
			 preparedStatement.setString(3, organization.getAddress());
			 preparedStatement.setString(4, organization.getDepartments());
			 preparedStatement.setString(5, organization.getEmployees());
			 
			 result = preparedStatement.executeUpdate();
			 
			 if(result>0)
			 {
				 connection.commit();
				 return "success";
				 
			 }
			 else {
				 return "fail";
			 }
		} catch (SQLException e) {
			try {
				connection.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "fail";
		}
		finally {
			dbUtils.closeConnection(connection);
		}
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
