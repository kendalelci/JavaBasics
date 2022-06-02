package com.syntax.class4;

import java.util.Scanner;

public class Odev3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Write a program to take user name, age and mobile number

*First Output: "Enter your name"

*Second Output: "Enter your mobile number" (please use xxx-xxx-xxxx format)

*Third Output: "Enter your age"

		 */
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter your name");
		
		String name=input.next();
		
		System.out.println("Enter your mobile number");
		
		String mobilph=input.next();
		
		System.out.println("Enter your age");
		
		int age=input.nextInt();
		
		System.out.println("Your name is "+name+", your age is "+age+" and your mobile phone is "+mobilph);
		
	}

}
