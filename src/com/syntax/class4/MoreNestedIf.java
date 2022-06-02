package com.syntax.class4;

public class MoreNestedIf {

	public static void main(String[] args) {
		
		
		/*we need to check if repl was completed
		 * 
		 * if repl is completed we want to see
		 * if you did 15 and more--> great job
		 * if you did more than 10--> did good
		 * if less than10--> try to complete all assigments
		 * 
		 */

		boolean didRepl=false;
		
		int assigments;
		
	     // if true olmak zorunda 
		//aksi takdirde false'e esit olsa bile kabul etmeyecek.
       //Kabul edebilmesi icin nested if'i if true ile baslamak zorunda
		
		if (didRepl) {
			System.out.println("How many assigments have you done");
			assigments=14;
			
			if (assigments>15) {
				System.out.println("You did a great job");
			}else if (assigments>10) {
				System.out.println(" You did a good job");
			}else {
				System.out.println("Please complete all repl as");
			}
			
		}else {
			System.out.println("You should complete you Repl HW");
		}
	}

}
