package com.syntax.class4;

public class NestedIf {

	public static void main(String[] args) {
		
		
		boolean vaccine=true;
		if(vaccine) {
			System.out.println("Let me check if you got a second dose");
		}
		
		boolean vaccine1=false; // if started with false thats way nested if doesnt work.
		//If you make if true nested if work and you can out put true condition
		int dose=1;
		
		if (vaccine1) {
			System.out.println("Let me check how many doses you have");
			
			if (dose==1) {
				System.out.println("You need one more shot");
			}
		}

		boolean vaccine2=true;
		int dose2=2;
		
		if (vaccine2) {
			System.out.println("Let me check how many doses you have");
			
			if (dose2==1) {
				System.out.println("You need one more shot");
			}
		}else {
			System.out.println("You are fully vaccineted");
		}
		
		System.out.println("---------------------------");
		
		String month="June";
		int day=19;
		
		if (month.equals("May")) {
			System.out.println("Let me check what is today's date");
			
		if (day==8) {
			System.out.println("Today mother's day");
		}
		
		}else if (month.equals("June")) {
			
			if (day==19)
			System.out.println("Today is not father's day");
	
		}
	}

}
