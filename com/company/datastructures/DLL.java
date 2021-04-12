package com.company.datastructures;

public class DLL {
	Node head;

	//Defines the structure of the node in Doubly Linked List
	class Node {
		int data;
		Node prev;
		Node next;

		Node(int d) {
			data = d;
		}
	}

	//Create a new Node and make it as a HEAD of the entire DLL.
	public void push(int new_data) {
		Node new_Node = new Node(new_data);//Create a new node with 7 as data.
		new_Node.next = head; // Node's next Addr part points to the HEAD.
		new_Node.prev = null; // Node's prev part is NULL.
		if (head != null)
			head.prev = new_Node; // Take the current HEAD Node and assign this newly created node's address to the current HEAD's prev part
		head = new_Node; // Make the current node as a new HEAD.
	}

	//To insert data after a given node and rewire all connections.
	public void InsertAfter(Node prev_Node, int new_data) {
		if (prev_Node == null) {
			System.out.println("The given previous node cannot be NULL ");
			return;
		}
		Node new_node = new Node(new_data); //Create a new node with 8 as data.
		new_node.next = prev_Node.next;
		prev_Node.next = new_node;
		new_node.prev = prev_Node;
		if (new_node.next != null)
			new_node.next.prev = new_node;
	}

	//To insert data (Node) at the last of the DLL.
	void append(int new_data) {
		Node new_node = new Node(new_data);
		Node last = head;
		new_node.next = null;
		if (head == null) {
			new_node.prev = null;
			head = new_node;
			return;
		}
		while (last.next != null)
			last = last.next;
		last.next = new_node;
		new_node.prev = last;
	}

	public void printlist(Node node) {
		Node last = null;
		System.out.println("Traversal in forward Direction");
		while (node != null) {
			System.out.print(node.data + " ");
			last = node;
			node = node.next;
		}
		System.out.println();
		System.out.println("Traversal in reverse direction");
		while (last != null) {
			System.out.print(last.data + " ");
			last = last.prev;
		}
	}

	public static void main(String[] args) 
	    	{
		DLL dll = new DLL();
		dll.append(6); // DLL: 6
		dll.push(7); // DLL:7,6
		dll.push(1); //DLL: 1,7,6
		dll.append(4); //DLL: 1,7,6,4
		dll.InsertAfter(dll.head.next, 8); //DLL: 1,7,8,6,4
	  	System.out.println("Created DLL is: "); 
	    dll.printlist(dll.head); //DLL: 1,7,8,6,4 AND REVERSER ORDER IS: 4,6,8,7,1
	    	}
}
