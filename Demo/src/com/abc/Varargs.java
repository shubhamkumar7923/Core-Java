package com.abc;

public class Varargs {

	void m1(int ...a){
		System.out.println("Logic executed");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Varargs ob = new Varargs();
		ob.m1();
		ob.m1(1);
		ob.m1(1,2);
		ob.m1(1,2,3);
		ob.m1(1,2,3,4);
	}

}
