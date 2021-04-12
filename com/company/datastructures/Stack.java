package com.company.datastructures;

public class Stack 
{ 
    	static final int MAX = 1000; // Maximum size of stack 
    	int top; //Top pointer
    	int a[] = new int[MAX];  //Stack 
    	boolean isEmpty() 
    	{ 
        		return (top < 0); 
    	} 
    	Stack() 
    	{ 
        		top = -1; 
    	} 
  	boolean push(int x) // Adding data to the stack
    	{ 
        		if (top >= (MAX-1)) 
        		{ 
            			System.out.println("Stack Overflow"); 
            			return false; 
        		} 
        		else
        		{ 
            			a[++top] = x; //First time entry will have top changed from -1 to 0 ==> a[0] = 10 / top = 1, a[1] = 20 / top = 2, a[2] = 30
            			System.out.println(x + " pushed into stack"); 
            			return true; 
        		} 
    	} 
  	int pop() 
    	{ 
        		if (top < 0) 
        		{ 
            			System.out.println("Stack Underflow"); 
            			return 0; 
        		} 
        		else
        		{ 
            			int x = a[top--]; //top = 1
            			return x; 
        		} 
    	} 
    
    	public static void main(String args[])
{
        		Stack s = new Stack(); 
        		s.push(10); 
        		s.push(20); 
        		s.push(30); 
        		System.out.println(s.pop() + " Popped from stack"); 
    	}
} 	

