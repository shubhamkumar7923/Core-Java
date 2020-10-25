package com.abc;

abstract class A{
	abstract void add();
	abstract void div();
	abstract void mul();
}
abstract class B extends A{
	void add(){
		System.out.println("abc");
	}
	void div(){
		System.out.println("ijk");
	}
}
public class Abstractimp2 extends B {
	void mul(){
		System.out.println("def");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractimp2 ob = new Abstractimp2();
		ob.add();
		ob.mul();
		ob.div();
	}

}
