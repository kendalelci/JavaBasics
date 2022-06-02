package com.syntax.class6;

public class SwitchLimitation {

	public static void main(String[] args) {
		
		/*
		 * switch has a datatype limitations
		 * switch can work with byte,short,int,char,String
		 * switch can not work with double,float,long,boolean
		 */
		
		double price=10;
		
		
		/*switch (price) { -->annot switch on a value of type double.class
		
		
		}
		*/ 
		boolean hungry=true;
		/* switch (hungry) { --> CE:cannot switch on a value of type boolean
		 * 
		 * 
		 */
		
		/* 
		 * switch has aoperators limitations
		 */
		
		char choice='Y';
		String meaning;
		
		/*switch(choice) {
		
		case 'Y' || 'y' --> can not use ||
		  meaning="Yes"
		  break;
		}
		*/
		
		int day=5;
		/* switch (day) {
		case  >5: 	 
		}
		*/
	}
}
