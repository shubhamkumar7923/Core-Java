package com.abc;

public class Fibonacci {

	void fibo(int a){
		int sum=0;
		int n1=0;
		int n2=1;
		for(int i=1;i<=a;i++)
		{
			System.out.print(" "+n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}
	public static void main(String[] args) {
		Fibonacci ob = new Fibonacci();
		ob.fibo(10);
	}

}
