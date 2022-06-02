package com.syntax.class6;

import java.util.Scanner;

public class SwitchDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*
		 * let's ask a user where is he from
		 * based on the country we will define fovorite food
		 */
		
		Scanner scan=new Scanner(System.in);
		
		String country,favoriteFood;
		
		System.out.println("Please tell me where are you from");
		country=scan.nextLine();
		
		switch (country.toLowerCase()) {   // buarada verilecek olan cevabin buyuk harfle mi kucuk harfle mi yazilacagini bilmedigimiz icin
		//kucuk harfle yazilma ihtimaline karsi "toLowerCase()-- 
		//buyuk harfle yazilma ihtimaline karsi "toLongerCase() kullaniriz.
		
		case "Mexico":
			favoriteFood="taco";
			break;
		case  "Canada":
			favoriteFood="poutine";
			break;
		case "Turkey" :
			favoriteFood="lahmacun";
			break;
		case "Pakistan":
			favoriteFood="pati chai";
			break;
		case "Egypt":
			favoriteFood="koshary";
			break;
		case "USA":
			favoriteFood="burges";
			break;
			default:
				favoriteFood="Unknown";
			
		}
		
		System.out.println("You are from " +country+" and your favorite food is "+favoriteFood);
	}

}
