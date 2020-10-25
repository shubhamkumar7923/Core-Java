package com.abc;

abstract class AA{
	abstract void add();
	void div(){
		System.out.println("div");
	}
	
}
public class Abstractimp3 extends AA {
	void add(){
		System.out.println("add");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abstractimp3 ob = new Abstractimp3();
		ob.add();
		ob.div();
	}

}
