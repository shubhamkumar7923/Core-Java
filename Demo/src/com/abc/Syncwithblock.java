package com.abc;

class A7 implements Runnable{
	Hello35 h;
	A7(Hello35 h){
		this.h=h;
	}
	public void run(){
		synchronized(h){
			h.m1();
		}
		
	}
}
class B7 implements Runnable{
	Hello35 h;
	B7(Hello35 h){
		this.h=h;
	}
	public void run(){
		synchronized(h){
			h.m1();
		}
	}
}
class Hello35{
	public void m1(){
		for(int i=1;i<5;i++){
			try {
				System.out.println("Begin of for loop by "+Thread.currentThread().getName()+"\t"+i);
				Thread.sleep(500);
				System.out.println("End of for loop by "+Thread.currentThread().getName());
			} catch (InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class Syncwithblock {

	public static void main(String[] args) {
		System.out.println("Begin main");
		Hello35 h = new Hello35();
		A7 a = new A7(h);
		B7 b = new B7(h);
		Thread t1 = new Thread(a,"A Thread");
		Thread t2 = new Thread(b,"B Thread");
		t1.start();
		t2.start();
		System.out.println("End main");
	}

}
