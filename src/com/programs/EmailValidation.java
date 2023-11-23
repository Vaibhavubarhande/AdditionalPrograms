package com.programs;

import java.util.regex.Pattern;

public class EmailValidation {

	public static void main(String[] args) {

		String email1 = "vb@gmail.com";
		String email2 = "vbgmail.com";

		System.out.println("email1 = " + validateEmail(email1));
		System.out.println("email2 = " + validateEmail(email2));
	}

	public static String validateEmail(String email) {

		if (email == null || email.isEmpty()) {

			return "invalid";
		}
		String emailRegex = "^(?=.{1,64}@)[A-Za-z0-9_-]+(\\.[A-Za-z0-9_-]+)*@" 
		        + "[^-][A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z]{2,})$";

		Pattern pattern = Pattern.compile(emailRegex);

		if (pattern.matcher(email).matches()) {
			
			return "valid";
		} else {
			return "Invalid";
		}
	}
}
