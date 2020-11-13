package com.tcs.employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.employee.model.Department;
import com.tcs.employee.util.DBUtils;

@Repository
public class DepatmentDAOImpl implements DepartmentDAO {
	
	@Autowired
	DBUtils dbUtils;
	
	
	public String createDepartment(Department department) {
		Connection connection = dbUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		String insertEmployee = "insert into DEPARTMENT (id,organizationId,name,employees) values(?,?,?,?)";
		try {
			 preparedStatement = connection.prepareStatement(insertEmployee);
			 preparedStatement.setLong(1, department.getId());
			 preparedStatement.setLong(2, department.getOrganizationId());
			 preparedStatement.setString(3, department.getName());
			 preparedStatement.setString(4, department.getEmployees());
			 
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
