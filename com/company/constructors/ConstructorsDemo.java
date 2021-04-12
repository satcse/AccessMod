package com.company.constructors;

class Empinfo  
{
	//Class Variables
	int id;
	String name; 
	
	Empinfo()
	{
		super();
		System.out.println("Constructor Invoked");
		
	}
	
	Empinfo(int id, String name)
	{
		super();
		System.out.println("Parameterized Constructor Invoked");
		this.id=id;
		this.name=name;
	}
	
	//Method Definitions
	void display()
	{
		System.out.println(id + ","+name);
	}
}

public class ConstructorsDemo {

	public static void main(String[] args) {
		Empinfo emp1 = new Empinfo(10,"Sathish");
		Empinfo emp2 = new Empinfo(11, "Rahul");
		
		emp1.display(); // EMP1.ID
		emp2.display();

	}

}
