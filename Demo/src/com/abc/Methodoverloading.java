package com.abc;

public class Methodoverloading {

	void m1(){
		System.out.println("m1");
	}
	void m1(int a){
		System.out.println("m2");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading ob = new Methodoverloading();
		ob.m1();
		ob.m1(1);
	}

}
