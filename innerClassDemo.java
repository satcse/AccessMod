package com.company.innerclass;

public class innerClassDemo {
	
	private String msg = "Hello Inner Classes!";
	
	class inner
	{
		public void hello()
		{
			System.out.println(msg);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		innerClassDemo obj = new innerClassDemo();
		innerClassDemo.inner in = obj.new inner();
		in.hello();
	}

}
