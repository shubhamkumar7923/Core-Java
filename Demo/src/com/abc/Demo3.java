package com.abc;

public class Demo3 {

	void add()
	{
		System.out.println("Inside default add method");
	}
	void add(int a)
	{
		System.out.println("Inside parametrised add method");
	}
	public static void main(String[] args) {
		Demo3 bb = new Demo3();
		bb.add();
		bb.add(1);
	}

}
