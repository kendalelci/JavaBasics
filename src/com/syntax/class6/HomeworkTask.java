package com.syntax.class6;

import java.util.Scanner;

public class HomeworkTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * You are a loan specialist and you need to ask user what is the amount of loan is needed.
		 * if loan is less or equal to 200,000 then you would lend the money otherwise you will reject the client. 
		 */

		
		Scanner scan = new Scanner (System.in);
		System.out.println("What is the amound of loan you need?");
		int loan=scan.nextInt();
		
		if (loan<=200.000) {
			System.out.println("I can lend you money");
		}else {
			System.out.println("Rejected");
		}
	}

}