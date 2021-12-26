package com.bridgelabz;

public class UserRegistration {

	public static void main(String[] args) {
		UserEntryImp user = new UserEntryImp();
		
		System.out.println("First name: " + user.isFirstName("Koda"));
		System.out.println("Last name: " + user.isLastName("Ashok"));
		System.out.println("Email-ID: " + user.isValidEmail("a.koda59@gmail.com"));
		System.out.println("Mobile No: " + user.isValidMobileNo("911234567890"));
		System.out.println("Password: " + user.isValidPassword("Koda@1996"));

	}

}
