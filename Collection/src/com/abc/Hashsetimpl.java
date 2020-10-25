package com.abc;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetimpl {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add("E");
		System.out.println(hs);
		hs.add(new Integer(100));
		hs.add(null);
		System.out.println("Size of hashset after adding elements: "+hs.size());
		System.out.println("Hashset is empty after adding values: "+hs.isEmpty());
		boolean b1 = hs.contains("D");
		System.out.println("Value D is present: "+b1);
		hs.remove("B");
		System.out.println("After removing value B :"+hs);
		System.out.println("Iterator");
		Iterator i = hs.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		hs.clear();
		System.out.println("Size of hashset after clearing elements:"+hs.size());
	}

}
