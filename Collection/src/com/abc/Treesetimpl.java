package com.abc;

import java.util.Iterator;
import java.util.TreeSet;

public class Treesetimpl {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("B");
		ts.add("A");
		ts.add("C");
		ts.add("D");
		System.out.println("Value of tree set"+ts);
		System.out.println("Size of treeset after adding elements: "+ts.size());
		System.out.println("Tree set is empty after adding values: "+ts.isEmpty());
		System.out.println("Iterator");
		Iterator i = ts.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("After removing B");
		ts.remove("B");
		System.out.println(ts);
		boolean b1 = ts.contains("D");
		System.out.println("Value D is present: "+b1);
		ts.clear();
		System.out.println("Size of treeset after clearing elements:"+ts.size());
	}

}
