package com.tcs.employee.menu;

import java.util.Scanner;

public class OrganizationMenu {
			
		public static void main (String[] args)
		{
		char choice;
		
		//Declare input as scanner
		Scanner input = new Scanner(System.in);

		//Take inputs
		System.out.println("Enter 1 to add organization.");
		System.out.println("Enter 2 to update organization");
		System.out.println("Enter 3 to delete organization");
		System.out.println("Enter 4 to find organization by Id");
		System.out.println("Enter 5 for list of all organization");
		System.out.println("Enter 6 to find organization by organization");
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
