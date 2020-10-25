package com.abc;

public class Demo2 {

	void method1()
	{
		System.out.println("Inside method 1");
	}
	void method2()
	{
		method1();
		System.out.println("Inside method 2");
	}
	public static void main(String[] args) {
		Demo2 bb = new Demo2();
		bb.method2();
	}

}
