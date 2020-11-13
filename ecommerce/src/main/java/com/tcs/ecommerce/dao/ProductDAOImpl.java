package com.tcs.ecommerce.dao;

import java.sql.*;
import java.util.*;

import com.tcs.ecommerce.model.Product;
import com.tcs.ecommerce.util.DBUtils;

public class ProductDAOImpl implements ProductDAO {
	
	private ProductDAOImpl() {
		
	}
	private static ProductDAO dao;
	
	public static ProductDAO getInstance() {
		
		if(dao==null) {
			dao = new ProductDAOImpl();
			System.out.println("inside the if condition");
			return dao;
		}
		return dao;
	}
	
	public String createProduct(Product product) {
		// TODO Auto-generated method stub
	
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		int result = 0;
		String insertProduct = "insert into PRODUCT (productid,productname,description,category,price) values(?,?,?,?,?)";
		try {
			 preparedStatement = connection.prepareStatement(insertProduct);
			 preparedStatement.setInt(1, product.getProductId());
			 preparedStatement.setString(2, product.getProductName());
			 preparedStatement.setString(3, product.getDescription());
			 preparedStatement.setString(4, product.getCategory());
			 preparedStatement.setFloat(5, product.getPrice());
			 
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

	public Optional<Product> getProductById(int id) {
		// TODO Auto-generated method stub
		Connection connection = DBUtils.getConnection();
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;
		
		Product product = null;
		String query = "select * from PRODUCT where productid=?";
		try {
			 preparedStatement = connection.prepareStatement(query);
			 preparedStatement.setInt(1,id);
			
			resultSet =  preparedStatement.executeQuery();
			 
			if(resultSet.next()) {
				 product = new Product();
				product.setProductId(resultSet.getInt("productid"));
				product.setProductName(resultSet.getString("productname"));
				product.setDescription(resultSet.getString("description"));
				product.setCategory(resultSet.getString("category"));
				product.setPrice(resultSet.getFloat("price"));
				
				 
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
		return Optional.of(product);
	}

	public Optional<List<Product>> getProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	public String removeProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Product> updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
