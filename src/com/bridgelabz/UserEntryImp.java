package com.bridgelabz;

import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserEntryImp implements IUserEntry {

	public boolean isFirstName(String fName) {
		String regex = "^[A-Z][a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> firstName = pattern.asPredicate();
		return firstName.test(fName);
	}

	public boolean isLastName(String lName) {
		String regex = "^[A-Z][a-z]{3,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> lastName = pattern.asPredicate();
		return lastName.test(lName);  
	}

	public boolean isValidEmail(String email) {
		String regex = "^[a-z.+_-]+[.a-z0-9]*+@[a-z0-9]+[.a-z]+[.a-z0-9]*$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> emailId = pattern.asPredicate();
		return emailId.test(email); 
	}

	public boolean isValidMobileNo(String mobile) {
		String regex = "^[0-9]{2}+[ ][0-9]{10}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> mobileNo = pattern.asPredicate();
		return mobileNo.test(mobile); 
	}

	public boolean isValidPassword(String password) {
		String regex = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[!#@%^&*(){}])[a-zA-Z0-9+-_!@#$%^&*(){}'.,]{8,}$";
		Pattern pattern = Pattern.compile(regex);
		Predicate<String> passw = pattern.asPredicate();
		return passw.test(password);
	}

}
