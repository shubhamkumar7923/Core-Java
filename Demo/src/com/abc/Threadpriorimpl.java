package com.abc;

public class Threadpriorimpl extends Thread {

	public void run(){
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		Threadpriorimpl ob1 = new Threadpriorimpl();
		Threadpriorimpl ob2 = new Threadpriorimpl();
		Threadpriorimpl ob3 = new Threadpriorimpl();
		ob1.start();
		System.out.println("ob1 thread priority"+ob1.getPriority());
		System.out.println("ob2 thread priority"+ob2.getPriority());
		System.out.println("ob3 thread priority"+ob3.getPriority());
	}

}
