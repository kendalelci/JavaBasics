package com.syntax.class07;

public class IncrementAndDecrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10;	
		
		x=x+1;
		
		x+=1;
   
		System.out.println(x); //12
		
		x++; // increments value of a variable by 1
		
		System.out.println(x);//13
		
		x--; // decrement value of variable by 1
		System.out.println(x); //12
		
		//increment and decrement operators work only with variable
		// 10++; CE: Invalid argument to operation ++/-- / you can not use as that
		
		int num=100;
				num++;
				System.out.println(num);
		
		
}
}