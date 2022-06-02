package com.syntax.class4;

public class IfElself {

	public static void main(String[] args) {
		/*
		 * declare 2 numbers and verify which one is the largest
		 */
          
		int num1=20;
		int num2=20;
		
		if (num1>num2) {
			System.out.println(num1+" is there larger than"+num2);
		}else if (num2>num1){
			System.out.println(num2+" is there larger than "+num1);
		} else {
			System.out.println(num1+" is equal to "+num2);
		}
		
		System.out.println("---------------------");
		
		/*
		 * the moment Java finds true condition
		 * it executes that block and exist entire
		 * If statement
		 */
		
		int day=7;
		
		if (day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday"); // pls keep going with whole days
		}else if (day==3) {
			System.out.println("Wednesday");
		}else if (day==4) {
			System.out.println("Thursday");
		}else if (day==5) {
			System.out.println("Friday");
		}
	}

}
