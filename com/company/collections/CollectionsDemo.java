package com.company.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {

	public static void main(String[] args) {
		
//		System.out.println("ArrayList");
		
		//int a =10;
		
		ArrayList<String> city = new ArrayList<String>();
		city.add("Bangalore");
		city.add("Delhi");
		city.add("Mumbai");
		city.add("Noida");
		city.add("Hyderabad");
		
		
		city.remove(0);
		if(city.contains("Bangalore"))
				System.out.println("Bangalore is present");
		
		System.out.println("ArrayList Data: "+city);
		
		System.out.println("Vectors");
		Vector<Integer> vec = new Vector<Integer>();
		vec.addElement(15);
		vec.addElement(30);
		
		System.out.println("Vector Data: "+vec);
		
		System.out.println("Linked List");
		LinkedList<String> names = new LinkedList<String>();
		names.add("David");
		names.add("Arpita");
		Iterator<String> itr = names.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		if(names.contains("Arpita"))
			System.out.println("ARPITA IS THERE.");
		
		
		System.out.println("Hashset");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(10);
		set.add(11);
		set.add(12);
		set.add(10);
		set.add(10);
		
		System.out.println("HashSet Output: "+set);
		
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(1);
		set2.add(12);
		set2.add(5233);
		set2.add(4);
		set2.add(500);
		System.out.println(set2);
		
		System.out.println("Treeset");
		TreeSet<Integer> tset = new TreeSet<Integer>();
		tset.add(1);
		tset.add(12);
		tset.add(5233);
		tset.add(4);
		tset.add(500);
		
		System.out.println(tset);
		
		System.out.println("Stack"); // LIFO - Last In First Out
		Stack<String> stack = new Stack<String>();
		stack.push("first");
		stack.push("second");
		stack.push("third");
		
		Iterator<String> iter = stack.iterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		stack.pop();
		
		iter = stack.iterator();
		
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
		
		System.out.println("Map***************");
		HashMap<Integer,String> gm = new HashMap<Integer,String>();
		gm.put(1, "Arpita");
		gm.put(2, "David");
		gm.put(3, "Nanda");
		gm.put(3, "Pradeep");
		
		for(Map.Entry m:gm.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
		
		System.out.println("Hash Table***************");
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		ht.put(1, "Arpita");
		ht.put(20, "Pradeep");
		ht.put(3, "Sathish");
		ht.put(5, "Rahul");
		
		for(Map.Entry m:ht.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
		
		
		System.out.println("Tree Map***************");
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		tm.put(1, "Arpita");
		tm.put(22, "David");
		tm.put(3, "Nanda");
		tm.put(20, "Pradeep");
		
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+","+m.getValue());
		}
		
	}

}
