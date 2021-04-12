package com.company.oops;

//Create an Abstract Class
abstract class Shape
{
	String color;
	abstract double area();
	
	public void display()
	{
		//...
	}
	
	public Shape(String color) {
		super();
		System.out.println("Shape Constructor called");
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}	
}

//Create a Derived Class
class Circle extends Shape
{
	double radius;

	public Circle(String color,double radius) {
		super(color);
		System.out.println("Circle constructor called...");
		this.radius = radius;
	}
	
	@Override
	double area()
	{
		return Math.PI*Math.pow(radius, 2); 
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}	
}

//Create an other Derived class.
class Rectangle extends Shape
{
	
	double length;
	double width;
	
	public Rectangle(String color, double length, double width) {
		super(color);
		System.out.println("Rectangle Constructor called");
		this.length = length;
		this.width = width;
	}
	
	@Override
	double area()
	{
		return length*width; 
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + ", color=" + color + "]";
	}
	
	
}
public class AbstractionDemo {

	public static void main(String[] args) {
		
		//BaseClass obj = new DerivedClass();
		Shape s1 = new Circle("Green", 2.3);
		Shape s2 = new Rectangle("Yellow", 2,3);
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println("Circle Area"+s1.area());
		System.out.println("Rectangle Area"+s2.area());

	}

}
