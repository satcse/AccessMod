package com.company.innerclass;

abstract class AnonClass
{
	public abstract void display();
}

public class LocalClass
{
	public static void main(String args[])
	{
		AnonClass obj = new AnonClass() {
			
			public void display()
			{
				System.out.println("Anonymous Inner Class!");
			}
		};
		obj.display();
	}

}


