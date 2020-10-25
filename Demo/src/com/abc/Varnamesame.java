package com.abc;

public class Varnamesame {
	int a;
	int b;
	void add(int a, int b){
		this.a=a;
		this.b=b;
	}
	void mul(){
		System.out.println(a*b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Lowertohigher ob = new Lowertohigher();
		ob.add(2, 5);
		ob.mul();
	}
}
