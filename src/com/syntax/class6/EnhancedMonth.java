package com.syntax.class6;

import java.util.Scanner;

public class EnhancedMonth {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		

		Scanner scan = new Scanner (System.in);
		System.out.println("What month were you born in?");
		String month=scan.next();
		
		String season;
		
		if (month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May") ) {
			
			season= "Spring";
			
		}else if (month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August") ) {
			
			season="Summer";
			
		}else if ( month.equalsIgnoreCase("October") || month.equalsIgnoreCase("September")) {
			
			season="Autumn";
			
		}else if ( month.equalsIgnoreCase("November") || month.equalsIgnoreCase("December")) {
			
		    season= " Winter"; 
			}else {
				season="Invalid";
			}if (!season.equals("Invalid")) {
		System.out.println("You were born in " +season); }
	}

}
