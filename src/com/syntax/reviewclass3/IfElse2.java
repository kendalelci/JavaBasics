package com.syntax.reviewclass3;

public class IfElse2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * When code executes but does not produce expected results we call these mistakes logical errors
		 * whenn code does not even executes we call these mistakes syntax errors
		 * 
		 */
		
		String day="Friday"; // in non primitive type veriables we can store null which means nothing
		
		     if (day.equals("Monday")) {
			System.out.println("weekday");
			} else if ( "Tuesday".equals(day)) {	
				System.out.println("weekend");		
			} else if ("Wednesday".equals(day)) {
				System.out.println("weekday");	
			} else if ("Thursday".equals(day)) {
				System.out.println("weekday");	
			} else if ("Friday".equals(day)) {
				System.out.println("weekday");	
			} else if ("Saturday".equals(day)) {
				System.out.println("weekend");
			} else if ("Sunday".equals(day)) {
				System.out.println("weekend");
			}
		     if (day.equals("Monday") || "Tuesday".equals(day) || "Wednesday" .equals(day)) {
		    	 
		    	 System.out.println("weekday");
		     }else {
		    	 System.out.println("wekend");
		     }
		
		
		
		
		
		
		
		
		
		
		
		
			if (day.equals("Monday")) 
			{
				System.out.println("weekday");
				
				} if ( "Tuesday".equals(day)) {
					
					System.out.println("weekend");
				}
// if we have to test multiple conditions we go with else if conditions
	}

}
