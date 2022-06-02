package com.syntax.class05;

public class Homework5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		

		int age=23;
		int weight=110;
		
		if (age>=18) {
			if (weight >=110) {
				System.out.println("You are "+ age + " years old,and your weight is " +
			weight + " lbs.");
				System.out.println("You are eligible to be a donor.");
			}else {
				System.out.println("You are "+age+ "years old,and your weight is " + weight + " lbs.it is less then 110 lbs.");
				System.out.println("You are not aligible to be a donor.");
			} 
		} else {
				System.out.println("You are not aligible to be a donor.");
			}
		
		/*
		 * Write a program to find largest number among three numbers using nested if 
		 * provided by a user ( numbers must be distinct)
		 */
		
	int num1= 15;
	int num2= 44;
	int num3= 23;
	 if (num1 >= num2) {
		 if ( num1 >= num3) {
		 System.out.println(num1+ " is largest number");
	 } else { 
		 System.out.println( num3+ " is largest number");
	 }
	
	
	} else { //otherwise num2>num1
		
	if (num2 >= num3) {
	System.out.println(num2 + " is largest number");
	 }else { // num3>num2
		 System.out.println(num3 + " is the largest number ");
	 }
	}
	 }
}

