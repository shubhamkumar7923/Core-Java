package com.abc;

public class Demo6 {

	Demo6(int a,int b)
	{
		int c=a+b;
		System.out.println("Inside parametrised constructor "+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo6 d = new Demo6(2,3);
	}

}