package com.company.typecast;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Implicit Type Casting");
		char a='A'; // Implicit assignment
		System.out.println("Value of a :"+a);
		
		int b= 1024;
		System.out.println("Value of b :"+b);
		
		float c= 12.59f;
		System.out.println("Value of c :"+c);
		
		long d=b;
		System.out.println("Value of d :"+d);
		
		double e=b;
		System.out.println("Value of e :"+e);
		
		int ff = (int)c;
		System.out.println("Value of ff :"+ff);
		
		int fc = (int) (b * c);
		System.out.println("Value of fc :"+fc); // 1024.0f * 12.59f
		
		String s = "25234";
		
		char st = s.charAt(0);
		System.out.println("Value of char st :"+st);
		
		int dav = Integer.parseInt(s); //  converts or extracts the integer data from string.
		System.out.println("Value of char dav :"+dav);
		
		Integer davInt = dav; // Boxing.
		System.out.println("Value of Integer dav :"+davInt);
		
		int examp = davInt; // UnBoxing
		System.out.println("Value of int dav :"+examp);
		
		System.out.println("Method Invocation: "+display(5,5));
		

		
	}
	
	public static int display(int a,int b)
	{
		System.out.println("First Display");
		return a+b;
	}
	
	public static int display(short a,int b)
	{
		System.out.println("Second Display");
		return a+b;
	}

}


//Package -> Class -> Methods -> Method Params -> Variables -> Processing code

// byte -> char -> short -> int -> long -> float -> double

//upcasting - auto done by Java Compiler, no loss of data

//downcasting - explicit, involves loss of Magnitude and Precision.

//com.xyz.typecast

// chars = 'C' , int = 105, boolean = true / fale, float = 10.52f, double = 10.52

// char - 1 Byte, String = 'NandaKishore'

//Typecasting will not work in Method Invocation.