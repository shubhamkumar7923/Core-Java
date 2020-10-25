package com.abc;

class A6 implements Runnable{
	Hello34 h;
	A6(Hello34 h){
		this.h=h;
	}
	public void run(){
		h.m1();
	}
}
class B6 implements Runnable{
	Hello34 h;
	B6(Hello34 h){
		this.h=h;
	}
	public void run(){
		h.m1();
	}
}
class Hello34{
	synchronized public void m1(){
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
public class SyncThreadimpl {

	public static void main(String[] args) {
		System.out.println("Begin main");
		Hello34 h = new Hello34();
		A6 a = new A6(h);
		B6 b = new B6(h);
		Thread t1 = new Thread(a,"A Thread");
		Thread t2 = new Thread(b,"B Thread");
		t1.start();
		t2.start();
		System.out.println("End main");	}

}
