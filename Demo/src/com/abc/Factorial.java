package com.abc;

public class Factorial {

	void fact(int a){
		int calc=1;
		for(int i=a;i>=1;i--)
		{
			calc=calc*i;
		}
		System.out.println("Factorial of "+ a +" is "+calc);
	}
	public static void main(String[] args) {
		Factorial ob = new Factorial();
		ob.fact(5);
	}

}
