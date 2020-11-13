package com.tcs.employee;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tcs.employee.config.DBConfig;
import com.tcs.employee.model.Department;
import com.tcs.employee.model.Employee;
import com.tcs.employee.service.DepartmentService;
import com.tcs.employee.service.EmployeeService;


public class MainSpring {
	
	
//	  public static void main(String[] args) {
//	  System.out.println("Before object creating");
//	  AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
//	  System.out.println("after context creation"); 
//	  EmployeeService employeeService = context.getBean(EmployeeService.class); 
//	  Employee employee = new Employee(3,2,1,"Eve",25,"Developer"); 
//	  String result = employeeService.createEmployee(employee); 
//	  System.out.println(result);
//	  System.out.println("after data source "); 
//	  context.close(); 
//	  }
	 
//	public static void main(String[] args) {
//		System.out.println("Before object creating");
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DBConfig.class);
//		System.out.println("after context creation");
//		DepartmentService departmentService = context.getBean(DepartmentService.class);
//		Department department = new Department(1,1,"Tech","Adam");
//		String result = departmentService.createDepartment(department);
//		System.out.println(result);
//		System.out.println("after data source ");
//		context.close();
//	}
	
	

}
