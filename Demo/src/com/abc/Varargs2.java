package com.abc;

public class Varargs2 {

	void m1(int a, String ...b){
		System.out.println("Logic executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs2 ob = new Varargs2();
		ob.m1(1);
		ob.m1(1,"shubham");
	}

}
