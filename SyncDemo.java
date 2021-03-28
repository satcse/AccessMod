package com.example.multithreading;

//Shared Resource
class Sender
{
	public void send(String msg)
	{
		System.out.println("Sending\t" + msg);
		try
		{
			Thread.sleep(1000);
		}catch(Exception e)
		{
			System.out.println("Thread Interrupted...");
		}
		System.out.println("\n" + msg + "Sent");
	}
}

//Thread Definition
class ThreadedSend extends Thread
{
	private String msg;
	private Thread t;
	Sender sender;
	
	ThreadedSend(String m, Sender obj)
	{
		msg = m;
		sender = obj;
		
	}
	
	public void run()
	{
		synchronized(sender)
		{
			System.out.println("Monitor Lock Acquired...");
			sender.send(msg);
			System.out.println("Monitor Lock Released...");
		}
	}
}
public class SyncDemo {

	public static void main(String[] args) {
		Sender snd = new Sender();
		//Creating Multiple Threads
		ThreadedSend thread1 = new ThreadedSend("Hi", snd);
		ThreadedSend thread2 = new ThreadedSend("Bye", snd);
		
		//Invoked the threads
		thread1.start(); // Moving the thread1 to Ready state
		thread2.start(); // Moving the thread2 to Ready state
		
		try
		{
			//Made the thread to wait until the other thread completes.
			thread1.join(); // It instructs the Java Compiler to complete the thread1 execution and come back to this main thread.
			thread2.join(); // It instructs the Java Compiler to complete the thread2 execution and come back to this main thread.
		}catch(Exception e)
		{
			System.out.println("interrupted");
		}

	}

}
