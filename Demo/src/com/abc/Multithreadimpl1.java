package com.abc;
// implement runnable interface
 class Multithreadimpl1 implements Runnable {

	 public void run(){
		 for(int i=0;i<5;i++){
			 System.out.println("hello "+i);
		 }
	 }
	public static void main(String[] args) {
		Multithreadimpl1 ob = new Multithreadimpl1();
		Thread t1 = new Thread(ob);
		t1.start();
		for(int i=0;i<5;i++){
			 System.out.println("main "+i);
		 }
	}

}
