package com.abc;

public class Threadjoinimpl extends Thread {

	public void run(){
		for(int i=0;i<5;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Threadjoinimpl t1 = new Threadjoinimpl();
		Threadjoinimpl t2 = new Threadjoinimpl();
		Threadjoinimpl t3 = new Threadjoinimpl();
		t1.start();
		try {
			t1.join();
		} catch (InterruptedException e) {
			System.out.println(e);
		}
		t2.start();
		t3.start();
	}

}
