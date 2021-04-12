package com.company.datastructures;

public class CircularLinkedList 
{ 
    	static class Node 
    	{ 
    			int data; 
        		Node next; 
                Node(int d) 
        		{ 
            			data = d; 
            			next = null; 
        		} 
    	}
    	Node head; 
    	CircularLinkedList()   
		{ 
    		head = null; 
		} 
    	void sortedInsert(Node new_node) 
		   { 
		        Node current = head; 
		        if (current == null) // To create a New node and promote it as Head node to the list.
		        { 
		          		new_node.next = new_node; 
		         		head = new_node; 
		  		} 
		        else if (current.data >= new_node.data) // To create a node and add in between the existing circular list. new node's value >  Key's in the node
		        { 
		        	while (current.next != head) 
		                			current = current.next; 
		  		 	current.next = new_node; 
		            			new_node.next = head; 
		            			head = new_node; 
		        } 
		        else
		        {
					while (current.next != head && current.next.data < new_node.data) // To create a node and add in between the existing circular list. new node's value <= Key's in the node
					                			current = current.next; 
					  			new_node.next = current.next; 
					            			current.next = new_node; 
		        } 
			}
    	void printList() 
    	{ 
        		if (head != null) 
       		{ 
            			Node temp = head; 
            			do
           			{ 
                			System.out.print(temp.data + " "); 
                			temp = temp.next; 
            			}  while (temp != head); 
        		} 
    	}
public static void main(String[] args) 
    	{ 
				CircularLinkedList list = new CircularLinkedList(); 
        		int arr[] = new int[] {12, 56, 2, 11, 1, 90}; 
        		Node temp = null; 
        		for (int i = 0; i < 6; i++) 
        		{ 
           			temp = new Node(arr[i]); 
            			list.sortedInsert(temp); 
        		} 
        				list.printList(); 
    	}		 
}
