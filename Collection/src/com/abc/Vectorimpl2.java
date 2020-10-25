package com.abc;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class Vectorimpl2 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add("A");
		v.add("C");
		v.add("E");
		v.add("F");
		v.add("D");
		v.add("B");
		System.out.println("Enumeration");
		Enumeration e = v.elements();
		while(e.hasMoreElements()){
			Object o = e.nextElement();
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator i = v.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("List iterator");
		ListIterator li = v.listIterator();
		while(li.hasNext()){
			Object o = li.next();
			System.out.println(o);
		}
		System.out.println("Reverse");
		while(li.hasPrevious()){
			Object o = li.previous();
			System.out.println(o);
		}
	}

}
