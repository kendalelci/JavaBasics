package com.syntax.class05;

import java.util.Scanner;

public class TaskCreditCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner  input=new Scanner(System.in);
		System.out.println("Do you have a credit card? yes or no");
		String answer = input.next();
		
		if (answer.equals("no")) {  // if I put nextLine when you use big case or small case or mix it is gonna work still. Bur if you dont use its not.0
			System.out.println("We will offer you a credit card");
			
		}else {
			System.out.println("What is the balance on the card");
			int balance = input.nextInt();
			
			if (balance > 1000) {
				System.out.println("Pay it off immediately");
			} else {
				System.out.println("You can spend more");
			}
		}
		
		
		

	}

}
