package com.syntax.class4;

import java.util.Scanner;

public class odev1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input=new Scanner(System.in);
		
		System.out.println("Please Enter First Name");
		
		String name=input.next();
		
		System.out.println("Please Enter Your Last Name");
		
		String lastname=input.next();
		
		System.out.println(name+" "+lastname);
		
		
		
		System.out.println("--------------------------------");
		
		
		//Write a program that asks the user's age: "Enter your age  "

        //Then display it by adding 10 (i.e age + 10) in your final output.
		
		
		Scanner calm=new Scanner(System.in);
		
		System.out.println("Enter your age");
		
		int age=calm.nextInt();
		
	System.out.println("Your age after 10 years is"+(age+10));
		
		
		
		
		
		
	}

}
