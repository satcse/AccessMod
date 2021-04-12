package com.example.Strings;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Methods of String");
		String sl = new String("Hello World");
		
		System.out.println("Length of String"+sl.length());
		
		//subString
		String sub = new String("Welcome");
		System.out.println("subString Example:"+sub.substring(2));
		
		//String Comparision
		String s1 = "Hello";
		String s2 = "Heldo";
		System.out.println("String Comparision: "+s1.compareTo(s2));
		
		//isEmpty
		String s4="";
		System.out.println("isEmpty: "+s4.isEmpty());
		
		//toLowerCase
		String s5 = "Hello";
		System.out.println("toLowercase"+s1.toLowerCase());
		
		//replace
		String s6 = "heldo";
		System.out.println(s6.replace('d','l'));
		
		//equals
		String x= "Welcome to Java";
		String y= "WeLCoMe tO JaVa";
		System.out.println("Equals:"+x.equalsIgnoreCase(y));
		
		//StringBuilder and StringBuffer Concepts
		StringBuffer s = new StringBuffer("Java String Buffer");
		s.append("Enjoy your class!");
		System.out.println(s);
		
		//Insert Method
		s.insert(0, 'O');
		System.out.println("String Buffer insert: "+s);
		
		//Replace Method
		StringBuffer sb = new StringBuffer("Hello");
		sb.replace(0, 2, "hEL");
		System.out.println("Replace: "+sb);
		
		//delete method
		sb.delete(0, 1);
		System.out.println("Detele: "+sb);
		
		//StringBuilder
		System.out.println("Creating String Builder");
		StringBuilder sb1 = new StringBuilder("Happy");
		sb1.append("Learning");
		
		System.out.println(sb1);
		
		System.out.println(sb1.delete(0, 1));
		
		System.out.println(sb1.insert(1, "Welcome"));
		
		System.out.println(sb1.reverse());
		
		//Conversion from String object to StringBuffer
		StringBuffer sbr = new StringBuffer("Hello");
		sbr.reverse();
		System.out.println("String to stringbuffer");
		System.out.println(sbr);
		
		StringBuilder sbl = new StringBuilder("hello");
		sbl.append("world");
		System.out.println("String to StringBuilder");
		System.out.println(sbl);
		
		String trimStr = new String(" SAMPLE    ");
		System.out.println(trimStr.trim());
		
	}

}
