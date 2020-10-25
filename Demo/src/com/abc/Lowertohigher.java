package com.abc;

public class Lowertohigher {

	int a;
	int b;
	void add(int c, int d){
		a=c;
		b=d;
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
