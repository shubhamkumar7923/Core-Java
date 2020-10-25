package com.abc;

public class Methodrefimpl {

	public static void Threadstatus(){
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		Thread t1 = new Thread(Methodrefimpl::Threadstatus);
		t1.start();
		
	}

}
