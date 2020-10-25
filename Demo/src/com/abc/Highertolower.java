package com.abc;
//higher scope value to lower scope
public class Highertolower {

	int a=10;
	int b=20;
	void add(int a, int b){
		System.out.println(a+b);
		System.out.println(this.a+this.b);
	}
	public static void main(String[] args) {
		Highertolower ob = new Highertolower();
		ob.add(1, 2);
	}

}
