package com.company.corejava;

public class FinallyBlockDemo {

	public static void main(String[] args) {
		int a=45,b=0,res = 0;
		try
		{
			
			res = a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("\n \t Error: "+e.getMessage());
		}
		finally
		{
			System.out.println("\n \t Result: "+res);
		}

	}

}
