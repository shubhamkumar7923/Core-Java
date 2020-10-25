package com.abc;

import java.util.Vector;

public class Vectorimpl {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("a");
		v.add("c");
		v.add("f");
		v.add("d");
		v.add(new Integer(101));
		v.add(null);
		v.add("a");
		System.out.println("Values of vector is "+v);
		v.insertElementAt("B", 3);
		System.out.println("Values of vector after change "+v);
		String s1 = (String)v.elementAt(3);
		System.out.println("Value at 3rd index "+s1);
		String s2 = (String)v.firstElement();
		System.out.println("Value at first index "+s2);
		String s3 = (String)v.lastElement();
		System.out.println("Value at last index "+s3);
	}

}
