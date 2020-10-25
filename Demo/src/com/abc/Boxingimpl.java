package com.abc;

public class Boxingimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 1000;
		int j= 20;
		System.out.println("Value of i :"+i);
		System.out.println("Value of j :"+j);
		
		Integer x = new Integer(i);
		Integer y = new Integer(j);
		System.out.println("Value of i :"+x);
		System.out.println("Value of j :"+y);
		
		int p1 = x.intValue();
		System.out.println(p1);
		int p2 = y.intValue();
		System.out.println(p2);
	}

}
