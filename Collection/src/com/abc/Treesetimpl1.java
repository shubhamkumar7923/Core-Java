package com.abc;

import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class Treesetimpl1 {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Integer(10));
		ts.add(new Integer(20));
		ts.add(new Integer(30));
		ts.add(new Integer(40));
		ts.add(new Integer(50));
		ts.add(new Integer(60));
		ts.add(new Integer(70));
		ts.add(new Integer(80));
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		SortedSet hs = ts.headSet(new Integer(50));
		System.out.println("Value of head set: "+hs);
		SortedSet tls = ts.tailSet(new Integer(30));
		System.out.println("Value of tail set: "+tls);
		SortedSet ss = ts.subSet(new Integer(20), new Integer(60));
		System.out.println("Value of head set: "+ss);
		System.out.println("Iterator");
		Iterator i = ts.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
	}

}
