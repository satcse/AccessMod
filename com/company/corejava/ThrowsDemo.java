package com.company.corejava;

public class ThrowsDemo {

	public void Division() throws ArithmeticException
	{
		
		int a=45,b=0,res;
		res = a/b;
		System.out.println("\n \t Result: "+res);
		
	}
	
	public static void main(String[] args) {
		
		ThrowsDemo td = new ThrowsDemo();
		try
		{
		td.Division();
		}catch(ArithmeticException x)
		{
			System.out.print("\n\tError:"+ x.getMessage());
		}
	}

}
