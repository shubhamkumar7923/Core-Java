package com.abc;

public class Threadpriorimpl1 extends Thread{

	public void run(){
		System.out.println("Thread is running.....");
	}
	public static void main(String[] args) {
		Threadpriorimpl1 p1 = new Threadpriorimpl1();
		p1.start();
		System.out.println("max thread priority: "+p1.MAX_PRIORITY);
		System.out.println("min thread priority: "+p1.MIN_PRIORITY);
		System.out.println("normal thread priority: "+p1.NORM_PRIORITY);
	}

}
