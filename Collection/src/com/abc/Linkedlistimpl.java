package com.abc;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Linkedlistimpl {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.add("A");
		ll.add(null);
		ll.add(new Integer(97));
		ll.add(5.4);
		System.out.println("linked list values are"+ll);
		ll.set(1, "B");
		System.out.println("After update: "+ll);
		ll.remove(5.4);
		System.out.println("After deletion: "+ll);
		System.out.println("Iterator");
		Iterator i = ll.iterator();
		while(i.hasNext()){
			Object o = i.next();
			System.out.println(o);
		}
		System.out.println("List iteratror");
		ListIterator li = ll.listIterator();
		while(li.hasNext()){
			Object o = li.next();
			System.out.println(o);
		}
	}

}
