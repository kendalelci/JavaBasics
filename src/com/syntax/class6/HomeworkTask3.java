package com.syntax.class6;

import java.util.Scanner;

public class HomeworkTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Write a program that will read three inputs of scores (quiz,mid term,and final scores) and determine the grade based on the following rules;
		 * if the average score >=90 --? grade=A
		 * if the average score >=70 and <90 --> grade=B
		 * if the average score <50--> grade=F
		 */

		Scanner input = new Scanner (System.in);
		System.out.println("Enter your quiz score?");
		int num1=input.nextInt();
		
		System.out.println("Enter your mid term score?");
		int num2=input.nextInt();
		
		System.out.println("Enter your final score?");
		int num3=input.nextInt();
		
		int result= ((num1 + num2 + num3) /3);
		
		if ( result>=90) {
			
			System.out.println("Your grade is A");
		}else if (result>=70 && result<90) {
			
			System.out.println("Your grade is B");
		}else if (result>=50 && result<=70) {
			System.out.println("Your grade is C");
		}else if (result<50) {
			System.out.println("Your grade is F");
		}
		
		
	}

}
