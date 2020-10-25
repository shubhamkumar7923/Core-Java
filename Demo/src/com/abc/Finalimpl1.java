package com.abc;

class Abcd{
	final void m1(){
		System.out.println("Hello");
	}
}
public class Finalimpl1 extends Abcd {
// we cannot override final method 
/*	void m1(){
		System.out.println("Hello");
	} */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Finalimpl1 ob = new Finalimpl1();
		ob.m1();
	}

}
