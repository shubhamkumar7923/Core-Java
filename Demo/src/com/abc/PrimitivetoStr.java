package com.abc;

public class PrimitivetoStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=99;
		String s=Integer.toString(i);
		System.out.println(s);
		
		byte b=10;
		Byte bb=new Byte(b);
		String s1=bb.toString();
		System.out.println(s1);
		
		short sh=15;
		Short ss = new Short(sh);
		String s2 = ss.toString();
		System.out.println(s2);
		
		double d=99.99;
		Double dd = new Double(d);
		String s3 = dd.toString();
		System.out.println(s3);
	}

}
