package com.abc;

public class Threadsleepimpl extends Thread {

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
		Threadsleepimpl ob1 = new Threadsleepimpl();
		Threadsleepimpl ob2 = new Threadsleepimpl();
		ob1.start();
		ob2.start();
	}

}
