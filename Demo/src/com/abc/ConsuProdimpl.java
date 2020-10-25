package com.abc;

class Hello39{
	int x;
	boolean flag = true;
	synchronized public void push(int x){
		if(flag){
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		this.x = x;
		System.out.println(x+" is pushed");
		flag=true;
		notify();
	}
	synchronized public void pop(){
		if(!flag){
			try {
				wait();
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println(x+" is poped");
		flag=false;
		notify();
	}
}
class Producer implements Runnable{
	Hello39 h;
	Producer(Hello39 h){
		this.h = h;
	}
	@Override
	public void run() {
		int a=1;
		for(int i=0;i<7;i++){
			h.push(a++);
		}
	}
}
class Consumer implements Runnable{
	Hello39 h;
	Consumer(Hello39 h){
		this.h = h;
	}
	@Override
	public void run() {
		int a=1;
		for(int i=0;i<7;i++){
			h.pop();
		}
	}
}
public class ConsuProdimpl {

	public static void main(String[] args) {
		System.out.println("Begin Main");
		Hello39 h = new Hello39();
		Producer p = new Producer(h);
		Consumer c = new Consumer(h);
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		t1.start();
		t2.start();
		System.out.println("End main");
	}

}
