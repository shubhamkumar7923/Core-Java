package com.abc;

public class Demo1 {

	void add(int a, int b)
	{
		int c=a+b;
		System.out.println("I am inside add method "+c);
	}
	void sub(int a, int b)
	{
		int c=a-b;
		System.out.println("I am inside sun method "+c);
	}
	void mul(int a, int b)
	{
		int c=a*b;
		System.out.println("I am inside mul method "+c);
	}
	void div(int a,int b)
	{
		int c=a/b;
		System.out.println("I am inside div method "+c);
	}
	public static void main(String[] args) {
		Demo1 bb = new Demo1();
		bb.add(6, 3);
		bb.sub(10, 5);
		bb.mul(6, 3);
		bb.div(4,2);
	}

}
