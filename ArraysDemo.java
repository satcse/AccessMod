package com.example.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[] = {10,20,30,40,50};
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Element of array is: "+a[i]);
		}
		
		//for(declaration/assignment of a iterating variable ; condition ; increment/decrement)

		//Multidimensional Array
		int[][] b= {
				{2,4,6,8},
				{3,6,9}};
		
		System.out.println("length of row"+b[0].length);
		System.out.println("data in MD Array"+b[1][2]);
		}
	//b[0] -> First row
	//b[1] -> Second row
	//b[0][1] -> 4
	//b[1][2] -> 9
	}


