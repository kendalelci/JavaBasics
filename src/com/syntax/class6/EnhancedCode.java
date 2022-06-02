package com.syntax.class6;

import java.util.Scanner;

public class EnhancedCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner (System.in);
		System.out.println("Enter your quiz score?");
		int quiz=input.nextInt();
		
		System.out.println("Enter your mid term score?");
		int mid=input.nextInt();
		
		System.out.println("Enter your final score?");
		int fin=input.nextInt();
		
		int averageS= ((quiz + mid + fin) /3);
		
		System.out.println("Your average score is " + averageS);
		
		char grade;
		
         if (averageS>=90) {
        	 grade='A';
         }else if (averageS>=70 && averageS <=90) {
        	 grade='B';
         }else if(averageS>=50 && averageS <70) {
        	 grade='C';
         }else {
        	 grade='F';
         }
         
    System.out.println("You are a " +grade+" student");
    
    /*
     * if you are A or B student --> you are doing great
     * otherwise --> please try to to study more
     */
    
    if (grade=='A'|| grade=='B') {
    	System.out.println("You are doing great");
    }else {
    	System.out.println("Please try to study more");
    }
	}
	
	
	
	

}
