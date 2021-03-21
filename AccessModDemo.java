package com.company.typecast;

import com.company.accessDemo.*; //Import all classes for accessDemo Package

class defAccess
{
	defAccess()
	{
		System.out.println("Inside constructor");
	}
	private int a =10;
	public void doit()
	{
		System.out.println("Inside doit of defAccess");
		System.out.println("Value of a inside doit"+ a);
	}
}

public class AccessModDemo { // Child Class

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//defAccess obj = new defAccess(); //Constructor will be called now.
		//obj.doit();
		//System.out.println("value of a :"+obj.a);
		int a=100;
		
		AccessDemProtected obj = new AccessDemProtected();
		obj.display();
		
		a= 500;
		System.out.println("Value of int:"+a);
		
	}

}
