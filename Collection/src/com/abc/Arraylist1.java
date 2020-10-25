package com.abc;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Arraylist1 {

	public static void main(String[] args) {
		ArrayList l = new ArrayList();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("E");
		System.out.println(l);
		System.out.println("Iterator");
		Iterator i = l.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("List iterator");
		ListIterator li = l.listIterator();
		while(li.hasNext()){
			Object o = li.next();
			System.out.println(o);
		}
	}

}
