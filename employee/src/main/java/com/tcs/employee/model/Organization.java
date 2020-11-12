package com.tcs.employee.model;

import java.util.ArrayList;
import java.util.List;

import lombok.*;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class Organization {
	
	private long id;
	private String name;
	private String address;
	private List<Department> departments = new ArrayList<Department>();
	private List<Employee> employees = new ArrayList<Employee>();


}
