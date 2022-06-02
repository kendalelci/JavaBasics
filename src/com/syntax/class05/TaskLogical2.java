package com.syntax.class05;

import java.util.Scanner;

public class TaskLogical2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner scan = new Scanner (System.in);
		 System.out.println(" What is the the day of the week today? 'Enter the number'");
		 int day=scan.nextInt();
		 
		 if ( day == 1 || day == 2 || day == 3 || day == 4 || day == 5  ) {
			 
			 System.out.println("it's a weekday");
		 }else if ( day == 6 || day == 7) {
			 
			 System.out.println(" it's a weekend");
		 }else {
			 System.out.println("Invalid day");
		 }
	
		 System.out.println("-----------------------------");
		 
		 if (day>=1 && day<=5) {
			 System.out.println("it is a weekday");
		 }else if (day>=6 && day<=7) {
			 System.out.println("it is a weekend");
		 }else {
			 System.out.println("Invalid day");
		 }
	}
	

}
