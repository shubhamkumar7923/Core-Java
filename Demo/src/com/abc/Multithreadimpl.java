package com.abc;
// through extends
 class Multithreadimpl extends Thread {

	public void run(){
		for(int i=0;i<5;i++)
		{
			System.out.println("Hello "+ i);
		}
	}
	public static void main(String[] args) {
		Multithreadimpl t1= new Multithreadimpl();
		t1.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main "+ i);
		}
	}

}