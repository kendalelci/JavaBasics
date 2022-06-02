package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * declare e var'able rate
		 * If rate id more than 5--> I am not buying a house
		 */
		
		double mortgageRate=5.5;
		
        if(mortgageRate>5) {
        
        	System.out.println("I am not buying a house");
        }
		
        
        /*
         * declare 2 veriables and check If num1 is bigger than num2
         */
        int num1=99;
        int num2=10;
        
        if (num1>num2) {
        	System.out.println(num1+" is bigger than "+num2);
        }
        
        int walk1=78;
     
        		if (walk1>75) {
        			System.out.println("I will go a walk");
        		}
        		
        		System.out.println(" ------------------------------------- ");
        		
        		char gender='m';
        		
        		if (gender=='f') {
               
        			System.out.println("You like shopping");
        		}else {
        			System.out.println("You like watching sports");
        		}
        		
        		System.out.println(" ------------------------ ");
        		
        		
        		String browser="chrome";
        		if (browser.equals("chrome")) {
        			
        			System.out.println("All test cases will be executed on chrome");
        		} else {
        			System.out.println(" I am not executing any test cases");
        			System.out.println("Reason - wrong browser");
        		}
        		
        	// when your code has no errors always try to format it
        		/*
        		 * mac cmd+shift+f
        		 * windows ctrl+shift+f
        		 */
        		//Double Comparison
        		
        		
        		double comp1=21.8;
        		double comp2=20.7;
        				
         		if (comp1>comp2) {
         			System.out.println(" Double value "+comp1+" is larger than "+comp2);
         		} else { 
         		
         		System.out.println(" Otherwise print ");
         		}
        		
        		 //Temperature Check
         		
         		int temp=30;
         		
         		if (temp<32) {
         			System.out.println("Water will frezze with temperature "+temp);
         			System.out.println("it is cold outside");
         			System.out.println("Make sure to use jaket and scarf");
         		} else { 
         			System.out.println("Water will NOT freeze with temperature "+temp);
         			System.out.println("it is not cold outside then");
        		
         		}
        	System.out.println("I am code outside of if block");	
	}
}
