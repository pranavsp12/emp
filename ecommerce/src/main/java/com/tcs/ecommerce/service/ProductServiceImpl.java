package com.tcs.ecommerce.service;

import java.util.Optional;

import com.tcs.ecommerce.dao.ProductDAO;
import com.tcs.ecommerce.dao.ProductDAOImpl;
import com.tcs.ecommerce.model.Product;

public class ProductServiceImpl implements ProductService{
		private static ProductService dao;

		private ProductServiceImpl() {
			// TODO Auto-generated constructor stub
		}
		public static ProductService getInstance() {
			
			if(dao==null) {
				dao = new ProductServiceImpl();
				System.out.println("inside the if condition");
				return dao;
			}
			return dao;
			
			
		}
		ProductDAO productDao = ProductDAOImpl.getInstance();
		
		public String createProduct(Product product) {
			// TODO Auto-generated method stub
			return productDao.createProduct(product);
		}

		public Optional<Product> getProductById(int id) {
			// TODO Auto-generated method stub
			return productDao.getProductById(id);
		}
}
