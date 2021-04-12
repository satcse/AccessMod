package com.company.corejava;

public class tryCatchExample {

	public static void main(String[] args) {
		
	
		try
		{
		String[] vars = {"20","55","30","41","32"};
		int sum = 0;
		for(int i=0;i < vars.length; i++)
		{
			sum = sum + Integer.parseInt(vars[i]);
		}
		System.out.println("Output: "+sum);
		}
		catch(NumberFormatException e)
		{
			System.err.println("Error is Summation, not a valid input"+e.getMessage());
		}
		catch(ArithmeticException e1)
		{
			System.err.println("Error is Summation - ArithmeticException, not a valid input"+e1.getMessage());		
		}
		finally
		{
				System.out.println("Closing Prinwriter...");
		}
		
	}

}

//Finally block executes after a successful try block execution.
//Finally block helps us in code cleanup and non-handling of any exception.
//It will execute finally even if there are no exceptions.
//It will execute finally if there any exceptions but after try-> catch blocks
//It will execute finally even if an exception is thrown and not caught by any catch block 
//Finally block will help prevent resource leaks.
//Files, DB Connections, Cache connection strings,streams, IO Objects etc - Resources to be closed.
//If the JVM is stopped before the try/catch block is executed, the finally block will be skipped.
