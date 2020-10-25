package com.abc;

import java.util.ArrayList;

public class Arrylist {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		l.add(null);
		l.add(new Integer(10));
		System.out.println(l);
		l.add(2, "F");
		System.out.println(l);
		l.set(1, "a");
		System.out.println(l);
		//fetching
		Object o = l.get(3);
		String s = (String)o;
		System.out.println(s);
		l.remove(2);
		System.out.println(l);
		l.removeAll(l);
		System.out.println("Info "+l);
	}

}
