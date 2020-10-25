package com.abc;

abstract class Hello{
	abstract void add();
	abstract void div();
	abstract void mul();
}
public class Abstractimp extends Hello1 {
	void add(){
		System.out.println("abcd");
	}
	void mul(){
		System.out.println("def");
	}
	void div(){
		System.out.println("ijk");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractimp ob = new Abstractimp();
		ob.add();
		ob.mul();
		ob.div();
	}

}
