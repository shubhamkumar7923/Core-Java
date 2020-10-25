package com.abc;

public class ConstructorDemo {

	int sum;
	ConstructorDemo(int a,int b){
		sum=a+b;
	}
	public static void main(String[] args) {
		ConstructorDemo ob = new ConstructorDemo(2,3);
		System.out.println("Sum : "+ob.sum);
	}

}
