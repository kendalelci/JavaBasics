package com.syntax.class4;

import java.util.Scanner;

public class odev4 {

	public static void main(String[] args) {
		/*
		 * reate a program that will ask a user to input boolean value "Input the boolean value"

         *If the input is true or false, then the output should look like below: 
		 */

		Scanner input=new Scanner(System.in);
		
		System.out.println(" Input the boolean value");
		
		 boolean v2=input.nextBoolean();
		 
	
		
		if(v2) {
			System.out.println("The value is true ");
		}else {
			System.out.println("The value is false");
		}
				
		
		
		
	}

}
