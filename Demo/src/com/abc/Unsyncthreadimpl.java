package com.abc;

class A5 implements Runnable{
	Hello33 h;
	A5(Hello33 h){
		this.h=h;
	}
	public void run(){
		h.m1();
	}
}
class B5 implements Runnable{
	Hello33 h;
	B5(Hello33 h){
		this.h=h;
	}
	public void run(){
		h.m1();
	}
}
class Hello33{
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
public class Unsyncthreadimpl {

	public static void main(String[] args) {
		System.out.println("Begin main");
		Hello33 h = new Hello33();
		A5 a = new A5(h);
		B5 b = new B5(h);
		Thread t1 = new Thread(a,"A Thread");
		Thread t2 = new Thread(b,"B Thread");
		t1.start();
		t2.start();
		System.out.println("End main");
	}

}
