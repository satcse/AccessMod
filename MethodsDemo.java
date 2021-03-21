package com.company.methods;

public class MethodsDemo {
	

	
	public void area(int b,int h)
	{
		System.out.println("Area of Triangle: "+(0.5*b*h));
	}
	
	public void area(int r)
	{
		System.out.println("Area of Triangle with r: "+(3.14*r*r));
	}

	public static void main(String[] args) {
		
		MethodsDemo obj = new MethodsDemo();
				
		obj.area(10,12);
		obj.area(5);
		

	}

}

//Methods , Method invocation, Return, Call By Value, Method Overloading