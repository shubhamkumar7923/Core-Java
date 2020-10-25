package com.abc;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapimpl1 {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();
		//tm.put(new Double(11.11),"Kumar");
		//tm.put(new Double(22.22),"Ravi");
		//tm.put(new Double(33.33),"Amogh");
		//tm.put(new Double(44.44),"Vinay");
		//tm.put(new Double(55.55),"Binny");
		//System.out.println("Values: "+tm);
	    tm.put("Kumar",new Double(11.11));
		tm.put("Ravi",new Double(22.22));
		tm.put("Amogh",new Double(33.33));
		tm.put("Vinay",new Double(44.44));
		tm.put("Binny",new Double(55.55));
		System.out.println("Values: "+tm);
		System.out.println("Size of treemap after adding elements: "+tm.size());
		System.out.println("Treemap is empty after adding values: "+tm.isEmpty());
		tm.replace("Vinay",new Double(66.66));
		System.out.println("After replacing :"+tm);
		System.out.println("Iterator");
		Iterator i1 = tm.entrySet().iterator();
		while(i1.hasNext()){
			Object o = i1.next(); 
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator i2 = tm.keySet().iterator();
		while(i2.hasNext()){
			Object o = i2.next(); 
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator i3 = tm.values().iterator();
		while(i3.hasNext()){
			Object o = i3.next(); 
			System.out.println(o);
		}
		tm.clear();
		System.out.println("Size of hashset after clearing elements:"+tm.size());
		
	}

}
