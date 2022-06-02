package com.syntax.class6;

import java.util.Scanner;

public class HomeworkTask2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *Write a program for user to enter his/her birth month/Based on the month define the season.
		 *Example:if user is born on March,April,May
		 *-->season="Spring"
		 *if user is born on June,July,August
		 *-->season=summer etc.
		 *At the end of the program we should see output as "You were born is season--------"
		 */

		
		Scanner scan = new Scanner (System.in);
		System.out.println("What month were you born in?");
		String month=scan.next();
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") ) {
			System.out.println("You were born season spring");
			
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") ) {
			
			System.out.println("You were born season summer ");
		}else if ( month.equalsIgnoreCase("October") || month.equalsIgnoreCase("September")) {
			
			System.out.println( "You were born season autumn");
			
		}else if ( month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December")) {
			
			System.out.println( "You were born season winter"); 
			}
	}

}
