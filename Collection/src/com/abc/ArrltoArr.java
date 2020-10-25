package com.abc;

import java.util.ArrayList;

public class ArrltoArr {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add(new Integer(1));
		l.add(new Integer(2));
		l.add(new Integer(3));
		l.add(new Integer(4));
		l.add(new Integer(5));
		System.out.println(l);
		System.out.println("converting arraylist to array");
		Object a[] = l.toArray();
		for(Object obj:a)
			System.out.println(obj+" ");
	}

}
