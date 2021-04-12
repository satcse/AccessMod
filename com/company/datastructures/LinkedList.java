package com.company.datastructures;

public class LinkedList {
	
	
	//A Node Definition
	Node head;
	static class Node
	{
		int data; // Data of the node
		Node next; // Pointer Section of the node.
		
		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	//Method to Insert a New Node
	public static LinkedList insert (LinkedList list,int data)
	{
		//Create a new node with the given Data.
		
		Node new_node = new Node(data);
		new_node.next = null;
		
		//If the Linked List is empty, then make the new node as head.
		
		if(list.head==null) // If the incoming list is empty and has no nodes in it.
		{
			list.head = new_node;
		}
		else // If the incoming list is not empty and has some nodes in it.
		{
			//Go to the HEAD node -> Travel through all the nodes and reach TAIL Node -> Assign newly created node to the TAIL node's next(Pointer)
			Node last  = list.head; // Starting from the First Node(Head Node)
			while(last.next!=null)
			{
					last = last.next; // Iterate until you find the last node.
			}
			
			last.next = new_node; // Remove the null of last node and assign it to new_node and make the new_node as Tail(by having next as NULL).
		}
		return list;
	}
	
	//Print the Linked List.
	public static void printList(LinkedList list)
	{
		Node currNode = list.head;
		System.out.println("LinkedList: ");
		
		//Traverse through the LinkedList
		while(currNode!=null)
		{
			
			//Print the data at current node
			System.out.println(currNode.data + "");
			
			//Go to the next node
			currNode = currNode.next;			
		}
		System.out.println();
	}

	//Method to delete a node in the LinkedList by KEY
	public static LinkedList deleteByKey(LinkedList list, int key)
	{
		
		//Removing a head node
		Node currNode = list.head, prev = null;
		if(currNode!=null && currNode.data == key) 
		{
			list.head = currNode.next; // changed head
			System.out.println(key + "found and deleted");
			return list;
		}
		
		//Removing a simple node
		while(currNode!=null && currNode.data!=key)
		{
			prev = currNode;
			currNode = currNode.next;
		}
		
		if(currNode!=null)
		{
			prev.next = currNode.next;
			System.out.println(key + "found and deleted");
		}
		
		//What if the Key is not found?
		if(currNode == null)
		{
			System.out.println(key + "not found");
		}
		return list;
	}
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list = insert(list,1);
		list = insert(list,2);
		list = insert(list,3);
		list = insert(list,4);
		list = insert(list,5);
		list = insert(list,6);
		list = insert(list,7);
		list = insert(list,8);
		list = insert(list,9);
		list = insert(list,10);
		list = insert(list,11);
		
		printList(list);
		
		deleteByKey(list, 1);
		
		printList(list);
		
		deleteByKey(list, 2);
		deleteByKey(list, 10);
		
		printList(list);
		
	}

}
