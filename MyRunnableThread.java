package com.example.multithreading;

public class MyRunnableThread implements Runnable{
	
	public static int myCount=0; // Shared Resource/Monitor
	public MyRunnableThread()
	{
		
	}
	
	//Below run method will belong to mrt Thread.
	public void run()
	{
		while(MyRunnableThread.myCount <= 10)
		{
			try
			{
				System.out.println("Mrt Thread: "+(++MyRunnableThread.myCount));
				System.out.println("Putting MRT thread to sleep.....");
				Thread.sleep(100); // This will put mrt thread to sleep.
			}catch(InterruptedException e)
			{
				System.out.println("Exception in thread: "+e.getMessage());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Starting the main Thread...");
		MyRunnableThread mrt = new MyRunnableThread();
		Thread t = new Thread(mrt); // Create the mrt thread.
		t.start(); // Invoke the mrt Thread's Run method.
		
		
		//Below code will belong to Main thread as usual.
		//After line 31 below code will be run by main thread.
		while(MyRunnableThread.myCount <= 10)
		{
			try
			{
				System.out.println("Main Thread: "+(++MyRunnableThread.myCount));
				System.out.println("Putting Main thread to sleep.....");
				Thread.sleep(100); // Put the main thread to sleep/wait.
			}catch(InterruptedException e)
			{
				System.out.println("Exception in thread: "+e.getMessage());
			}
			
		}
		

	}

}

// 2 Thread - Main Thread and mrt Thread

// By Default, Java Compiler will execute the Main Thread, the main thread will create other threads.
