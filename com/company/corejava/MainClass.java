package com.company.corejava;

class myException extends Exception
{
	
	String sm = new String();
	public myException(String s)
	{	
		sm = s;
		//super(s);
		
	}
}
public class MainClass {

	public static void main(String[] args) {

		try
		{
			throw new myException("temp");
		}catch(myException exc)
		{
			exc.printStackTrace(); // It will display the error in the try block, calling method, parent method of calling method etc.
		}
		
		
	}

}

//Service A ==> Service B ==> Service C ==>class with method ==> display method.