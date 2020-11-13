package com.tcs.employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tcs.employee.model.Employee;
import com.tcs.employee.util.DBUtils;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	DBUtils dbUtils;
	
	
	public String createEmployee(Employee employee) {
		Connection connection = dbUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		String insertEmployee = "insert into EMPLOYEE (id,departmentId,organizationId,name,age,position) values(?,?,?,?,?,?)";
		try {
			 preparedStatement = connection.prepareStatement(insertEmployee);
			 preparedStatement.setLong(1, employee.getId());
			 preparedStatement.setLong(3, employee.getOrganizationId());
			 preparedStatement.setLong(2, employee.getDepartmentId());
			 preparedStatement.setString(4, employee.getName());
			 preparedStatement.setInt(5, employee.getAge());
			 preparedStatement.setString(6, employee.getPosition());
			 
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
	
	public Optional<Employee> updateEmployees(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String deleteEmployee(int id) {
		// TODO Auto-generated method stub
		return null;
	}	

	public Optional<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Connection connection = dbUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Employee employee = null;
		String query = "select * from EMPLOYEE where id=?";
		try {
			 preparedStatement = connection.prepareStatement(query);
			 preparedStatement.setInt(1,id);
			
			resultSet =  preparedStatement.executeQuery();
			 
			if(resultSet.next()) {
				employee = new Employee();
				employee.setId(resultSet.getLong("id"));
				employee.setOrganizationId(resultSet.getLong("organizationId"));
				employee.setDepartmentId(resultSet.getLong("departmentId"));
				employee.setName(resultSet.getString("name"));
				employee.setAge(resultSet.getInt("age"));
				employee.setPosition(resultSet.getString("position"));
				 
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
			return Optional.empty();
		}
		finally {
			dbUtils.closeConnection(connection);
		}
		return Optional.of(employee);
	}
	
	public Optional<List<Employee>> getEmployee() {
		// TODO Auto-generated method stub
		return null;
		
	}
		
	public Optional<List<Employee>> findByOrganizationId(int organizationId) {
		// TODO Auto-generated method stub
		return null;
		
	}

	

	
	
	
}
