package com.abc;

public class Localvar {

	void m1(){
		int a=10;
		System.out.println("Local variable of method "+a);
	}
	Localvar()
	{
		int a=10;
		System.out.println("Local var of constructor "+ a);
	}
	public static void main(String[] args) {
		Localvar ob = new Localvar();
		ob.m1();
	}

}
