package com.abc;
//one primitive to another primitive
public class Primitiveimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=999;
		Integer z = new Integer(i);
		byte b= z.byteValue();
		short s=z.shortValue();
		long l = z.longValue();
		float f = z.floatValue();
		double d = z.doubleValue();
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
	}

}
