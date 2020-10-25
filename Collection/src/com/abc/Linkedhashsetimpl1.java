package com.abc;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Linkedhashsetimpl1 {

	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("E");
		System.out.println(lhs);
		lhs.add(new Integer(100));
		lhs.add(null);
		System.out.println("Size of Linked hashset after adding elements: "+lhs.size());
		System.out.println("Linked hashset is empty after adding values: "+lhs.isEmpty());
		boolean b1 = lhs.contains("D");
		System.out.println("Value D is present: "+b1);
		lhs.remove("B");
		System.out.println("After removing value B :"+lhs);
		System.out.println("Iterator");
		Iterator i = lhs.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		lhs.clear();
		System.out.println("Size of linked hashset after clearing elements:"+lhs.size());
	}

}
