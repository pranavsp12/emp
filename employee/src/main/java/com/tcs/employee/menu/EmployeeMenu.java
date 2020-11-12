package com.tcs.employee.menu;

import java.util.Scanner;

public class EmployeeMenu {
	
	public static void main (String[] args)
	{
	char choice;
	
	//Declare input as scanner
	Scanner input = new Scanner(System.in);

	//Take inputs
	System.out.println("Enter 1 to add employee.");
	System.out.println("Enter 2 to update employee");
	System.out.println("Enter 3 to delete employee");
	System.out.println("Enter 4 to find employee by Id");
	System.out.println("Enter 5 for list of all employees");
	System.out.println("Enter 6 to find employee by organization");
	String s = input.next();
	choice = s.charAt(0);

	//add a switch statement
	switch(choice)
	{
	case '1':
		//
	break;
	
	case '2':
		//
	break;

	case '3':
		//
	break;

	case '4':
		//
	break;

	case '5':
		//
	break;
	
	case '6':
		//
	break;

	default:
	System.out.println("Error");
	}

	}

}
