package com.company.oops;

public class Polymorphism {

	
	//One Function name but many forms - Function Overloading.
	//Same method name, but different number of Method Parameters, return types, different types of Method Parameters.
	public int sum(int x, int y)
	{
		return x+y;
	}
	public int sum(int x, int y,int z)
	{
		return x+y+z;
	}
	public double sum(double x, double y)
	{
		return x+y;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Polymorphism obj = new Polymorphism();
		System.out.println(obj.sum(10, 20));
		System.out.println(obj.sum(10, 20, 30));
		System.out.println(obj.sum(10.5, 20.5));

	}

}
