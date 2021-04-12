package com.company.calculator;

import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Command Line Args: "+args[0]);
		double a,b,output = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the operation like A/S/M/D:");
		
		char ip = sc.next().charAt(0);
		
		System.out.println("Enter the Numbers to be added:");
		
		a = sc.nextDouble();
		b = sc.nextDouble();
		
		switch(ip)
		{
		
		case 'A':
			
				output = a+b;
				break;
				
		case 'S':
			
			output = a-b;
			break;
			
		case 'M':
			
			output = a*b;
			break;
			
		case 'D':
			
			output = a/b;
			break;
			
		default:
			System.out.println("Incorret input");
		}
		
		
		
		System.out.println("The Final Result:"+output);
		sc.close();

	}

}


//javac ArithmeticCalculator.java --> It will a ArithmeticCalculator.class
//java ArithmeticCalculator DaveidGreene
