package com.syntax.class05;

public class LogicalOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Monday and Friday -> No class
		 * Tuesday and Wednesday ->Manual Testing
		 * Thursday -> Review
		 * Saturday and Sunday --> Java
		 */

		String day ="Saturday";
		       
		
		if (day.equals("Monday") || day.equals("Friday")) {
			
			System.out.println("I have no class");
		} else if ( day.equals("Tuesday") || day.equals("Wednesday")) {
			
			System.out.println("I have Manual testing class");
		} else if (day.equals("Thursday")) {
			System.out.println("I have Review class");
			
		}else if ( day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
		}
		
		
		
		
		System.out.println(" New example");
		
		boolean sunny=false;
	    boolean hot=true;
	    
	    if (sunny && hot ) {
	    	System.out.println(" I am not going to beach");
	    	
	    }
	  
	}

}
