package com.abc;

public class PrinitivetoWrap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		Integer i = Integer.valueOf(a);
		System.out.println(i);
		
		Integer x= new Integer(a);
		System.out.println(x);
		Double d = new Double(a);
		System.out.println(d);
		
	}

}
