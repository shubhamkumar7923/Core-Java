package com.abc;

public class Thisuse {

	void add(){
		this.mul();
		System.out.println("add method");
	}
	void mul(){
		System.out.println("multiply method");
	}
	public static void main(String[] args) {
		Thisuse ob = new Thisuse();
		ob.add();
	}

}
