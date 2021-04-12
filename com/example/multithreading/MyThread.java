package com.example.multithreading;

public class MyThread extends Thread{
	
	public void run()
	{
		System.out.println("Concurrent thread is running...");
	}

	public static void main(String[] args) {
		MyThread mt = new  MyThread();
		mt.start();
		

	}

}
