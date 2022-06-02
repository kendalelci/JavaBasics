package com.syntax.reviewclass2;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
	    int num2=10;
        System.out.println(num+num2);
        System.out.println(num>=num2); // num>num2=false or num=num2=true f+t=t
        // Whole 0-infinity Negative infinity to Positive infinity

        System.out.println(Long.MAX_VALUE); // Gives us the maximum range
        System.out.println(Long.MIN_VALUE); // Gives us the maximum range
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        
        System.out.println(num/num2);
        System.out.println(num%num2);
        
        System.out.println(10/3);
        System.out.println(10%3); // you can find left number as result not divide number
        
        System.out.println(10.0/3);
        System.out.println((int)10.0/3); // if you want to convert your data type as not decimal number you can put your data type (for example integer) front of the number your results gave you as choosedata type 
        
        System.out.println(10.0*3);
	}

}
