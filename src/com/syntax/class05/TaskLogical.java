package com.syntax.class05;

import java.util.Scanner;

public class TaskLogical {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 Scanner input = new Scanner (System.in);
		 
		 System.out.println("Please enter your heights in inches ");
		 int inches=input.nextInt();
	     
		 if (inches<60) {
			 System.out.println("You are short");
			 
		 }else if (inches>=60 || inches<=72 ) {
			 System.out.println("You are medium");
		 }else if ( inches > 72) {
			 System.out.println("You are tall");
		 }
		
	}

}
