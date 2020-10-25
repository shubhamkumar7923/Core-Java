package com.abc;

import java.util.Vector;

public class Vectorimpl1 {

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
		// update
		System.out.println("Before updating :"+v);
		v.setElementAt("Z", 2);
		System.out.println("After updating :"+v);
		// delete
		System.out.println("Before deleting :"+v);
		v.remove("Z");
		v.removeElementAt(4);
		System.out.println("After deleting :"+v);
	}

}
