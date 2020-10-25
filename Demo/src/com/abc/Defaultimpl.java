package com.abc;

interface It5{
	void add();
	default void m1(){
		System.out.println("Hello");
	}
}
public class Defaultimpl implements It5{
	public void add(){
		System.out.println("add");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Defaultimpl ob = new Defaultimpl();
		ob.add();
		ob.m1();
	}

}
