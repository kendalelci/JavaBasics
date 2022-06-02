package com.syntax.class05;

import java.util.Scanner;

public class TaskLogical3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Ask user to enter a number then define if number is small, medium or large
		 * small number is value between 1 and 10
		 * medium number is value between 11 and 100
		 * large number is value between 101 and 1000
		 */
	
		Scanner scan = new Scanner (System.in);
		System.out.println(" Please enter a number");
		int number=scan.nextInt();
		
		if (number>=1 && number<=10) {
			
			System.out.println("Number is small");
		}else if (number>=11 && number<=100 ) {
			System.out.println("Number is medium");
		}else if ( number>=101 && number<=1000) {
			System.out.println("Number is large");
		}
		else {
			System.out.println("Number is invalid");
		}
			
		
	}
	


}
