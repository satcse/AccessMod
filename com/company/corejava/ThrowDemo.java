package com.company.corejava;

public class ThrowDemo {

	public static void main(String[] args) {
	
		int a=45,b=0,res;
		
		try
		{
			if(b==0)
				throw(new ArithmeticException("Can't divide by Zero"));
			else
			{
				res = a/b;
				System.out.println("\n \t Result: "+res);
			}
		}catch(ArithmeticException x)
		{
			System.out.print("\n\tError:"+ x.getMessage());
		}
		
	}

}
