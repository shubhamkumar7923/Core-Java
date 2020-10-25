package com.abc;

class A8 {
	synchronized void foo(B8 b){
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered A8.foo");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("A Intrrupted");
		}
		System.out.println(name+" trying to call B8.m2()");
		b.m2();
	}
	synchronized void m1(){
		System.out.println("Inside A8.m1");
	}
}
class B8 {
	synchronized void bar(A8 a){
		String name = Thread.currentThread().getName();
		System.out.println(name+" entered B8.bar");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("B Intrrupted");
		}
		System.out.println(name+" trying to call A8.m1()");
		a.m1();
	}
	synchronized void m2(){
		System.out.println("Inside B8.m2");
	}
}
class X implements Runnable{
	A8 a;
	B8 b;
	X(A8 a,B8 b){
		this.a=a;
		this.b=b;
	}
	public void run(){
		a.foo(b);
	}
}
class Y implements Runnable{
	A8 a;
	B8 b;
	Y(A8 a,B8 b){
		this.a=a;
		this.b=b;
	}
	public void run(){
		b.bar(a);
	}
}
public class Deadlockimpl {

	public static void main(String[] args) {
		System.out.println("Begin main");
		A8 a = new A8();
		B8 b = new B8();
		X x = new X(a,b);
		Y y = new Y(a,b);
		Thread t1 = new Thread(x,"AThread");
		Thread t2 = new Thread(y,"BThread");
		t1.start();
		t2.start();
		System.out.println("End main");
	}

}
