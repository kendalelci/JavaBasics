package com.syntax.reviewclass3;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String user="Asghar";
		String password="pass123";
		
		// whenever we use primitive data types like byte short int long float double char boolean
		// we use ==
		//whenever we use non=primitive data types we use ,equals method String
		
		if (user.equals("Asghar") && password.equals(password)) {
			System.out.println("Welcome back to Syntax");
						
		}else {
			System.out.println("username or password is not correct");
		}
		
		// when debugging make sure;
		// you have not disabled the breakpoint
		// you have not enabled the skip all breakpoints option in debug window

	}

}
