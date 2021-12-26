package com.bridgelabz;

import java.util.Scanner;

public class LambdaExpressionForValidateUserEntry {

	//Function for First name
	public static boolean firstName(String fName) {
		return ((fName != null) && (!fName.equals(""))
				&& (fName.chars().allMatch(Character :: isLetter)));
	}
	
	//Last name
	public static boolean LastName(String lName) {
		return ((lName != null) && (!lName.equals(""))
				&& (lName.chars().allMatch(Character :: isLetter)));
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		String fname = sc.next();
		System.out.println("First name is " + fname);
		System.out.println("Valid: " + firstName(fname));
		
		System.out.println();
		
		System.out.println("Enter Last Name: ");
		String lname = sc.next();
		System.out.println("Last name is " + lname);
		System.out.println("Valid: " + LastName(lname));
	}

}
