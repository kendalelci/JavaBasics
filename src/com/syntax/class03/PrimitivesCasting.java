package com.syntax.class03;

public class PrimitivesCasting {

	public static void main(String[] args) {
		
	//main+ctrl+space  you can createmanual public static
		
		int i=100;
		double d=100;//widening
		
		System.out.println(i);//100
		System.out.println(d);//100.0
		
		long l=10000;
		
		//byte b=130; error: cannot concert from int to byte
		//int x=99.99 error: cannot convert from double to int
		
		// Type mismatch: cannot convert from double int ** int x=100.99; doesnt work but if you make it double int. Check bellow
		
		int x=(int)99.99; //narrowing
        System.out.println(x);
        
        byte b=(byte)130;
        System.out.println(b);
        
        float f=10.99f; // sistemin narrowing kullanmasýný istemiyorsan float ve long kullandýðýnda value!nýn sonuna f getirmen gerekir. 
        //Ya da long kullanýrken long kullanman gerekir.
        
        double dd=9.99;
        
        double price=100;
        
        int g=(int)40l; //deneme
        System.out.println(g);
        
        long v=40l;
        System.out.println(v);//deneme own
      
        
        
	}

}
