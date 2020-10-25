package com.abc;

public class ConstructorDemo1 {

	ConstructorDemo1(){
		this(4);
		System.out.println("Constructor aa");
	}
	ConstructorDemo1(int a){
		this(4,5);
		System.out.println("Constructor bb");
	}
	ConstructorDemo1(int a, int b){
		System.out.println("Constructor cc");
	}
	public static void main(String[] args) {
		ConstructorDemo1 ob = new ConstructorDemo1();
	}

}
