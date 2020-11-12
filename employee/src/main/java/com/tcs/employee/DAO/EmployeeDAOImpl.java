package com.tcs.employee.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.tcs.employee.model.Employee;
import com.tcs.employee.util.DBUtils;

public class EmployeeDAOImpl implements EmployeeDAO {
	
	private EmployeeDAOImpl() {
		
	}
	private static EmployeeDAO dao;
	 	
	public static EmployeeDAO getInstance() {
		if(dao==null) {
			dao = new EmployeeDAOImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
		
	}
	
	public String createEmployee(Employee employee) {
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		String insertProduct = "insert into Employee (id,organizationId,departmentId,name,age,position) values(?,?,?,?,?,?)";
		try {
			 preparedStatement = connection.prepareStatement(insertProduct);
			 preparedStatement.setInt(1, employee.getId());
			 preparedStatement.setInt(2, employee.getOrganizationId());
			 preparedStatement.setInt(3, employee.getDepartmentId());
			 preparedStatement.setString(4, employee.getName());
			 preparedStatement.setFloat(5, employee.getAge());
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
			DBUtils.closeConnection(connection);
		}	
	}
	
	public Optional<Employee> updateEmployees(int id, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String deleteEmployee(int id) {
		return null;
	}	

	public Optional<Employee> getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Connection connection = DBUtils.getConnection();
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
				employee.setId(resultSet.getInt("id"));
				employee.setOrganizationId(resultSet.getInt("organizationId"));
				employee.setDepartmentId(resultSet.getInt("departmentId"));
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
			DBUtils.closeConnection(connection);
		}
		return Optional.of(employee);
	}
	
	public Optional<List<Employee>> getEmployee() {
		return null;
		
	}
		
	public Optional<List<Employee>> findByOrganizationId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	

	
	
	
}
