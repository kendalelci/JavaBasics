package com.syntax.reviewclass3;

public class IfElse6 {
	
	public static void main(String[] args) {
		
String country="Indian";
String capital;

		switch(country) {
		
		case "Turkey":
			capital="Ankara";
		break;
		
		case "USA":
			capital="DC";
		break;
		
		case "Serbia":
			capital="Begrade";
		break;
		
		case "Albania":
			capital="Tirana";
		break;
		
		case "Afghanistan":
			capital="Kabul";
		break;
		
		case"Pakistan":
			capital="Islamabad";
		break;
		default:
			
			capital= "Either country name is included correct or its not acountry";
				
		}
		
		System.out.println(capital);
	}

}
