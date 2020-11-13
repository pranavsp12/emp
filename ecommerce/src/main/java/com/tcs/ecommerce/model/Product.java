package com.tcs.ecommerce.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	private int productId;
	private String productName;
	private String description;
	private float price;
	private String category;
	

	
}
