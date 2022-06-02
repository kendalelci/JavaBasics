package com.syntax.class05;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Please enter name");
		String name= scan.nextLine(); // capture String // when you want to write long name for example "Joe John" you need to put nextLine();
		System.out.println(name);
		
		System.out.println("Please enter your age");
		int age=scan.nextInt(); // capture Int
		System.out.println(age);
		
		System.out.println("Please enter price");
		double price=scan.nextDouble(); // capture double
		System.out.println(price);
		
		System.out.println("Please enter boolean");
		boolean boo=scan.nextBoolean();// capture boolean 
		System.out.println(boo);
		
		System.out.println("Please enter any character");
		char character=scan.next().charAt(0); // capture 1 character
		System.out.println(character);
	}

}
