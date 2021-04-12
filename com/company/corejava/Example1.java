package com.company.corejava;


class MyException extends Exception
{
	String str;
	public MyException(String str2) {

		str = str2;
	}
	
	public String toString()
	{
		return ("MyException Occured: "+str);
	}
}
public class Example1 {

	public static void main(String[] args) {
		try
		{
		System.out.println("Start of the try block");
		throw new MyException("This is my custom error message");
		}
		catch(MyException exp)
		{
			System.out.println("Catch Block executed");
			System.out.println(exp);
		}

	}

}
