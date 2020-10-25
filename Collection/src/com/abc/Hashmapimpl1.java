package com.abc;

import java.util.HashMap;
import java.util.Iterator;

public class Hashmapimpl1 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put("Kumar",new Double(11.11));
		hm.put("Ravi",new Double(22.22));
		hm.put("Amogh",new Double(33.33));
		hm.put("Vinay",new Double(44.44));
		hm.put("Binny",new Double(55.55));
		System.out.println("Values: "+hm);
		System.out.println("Size of hashmap after adding elements: "+hm.size());
		System.out.println("Hashmap is empty after adding values: "+hm.isEmpty());
		hm.replace("Vinay",new Double(66.66));
		System.out.println("After replacing :"+hm);
		hm.remove("Binny",new Double(55.55));
		System.out.println("After deletion: "+hm);
		System.out.println("Iterator");
		Iterator i1 = hm.entrySet().iterator();
		while(i1.hasNext()){
			Object o = i1.next(); 
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator i2 = hm.keySet().iterator();
		while(i2.hasNext()){
			Object o = i2.next(); 
			System.out.println(o);
		}
		System.out.println("Iterator");
		Iterator i3 = hm.values().iterator();
		while(i3.hasNext()){
			Object o = i3.next(); 
			System.out.println(o);
		}
		hm.clear();
		System.out.println("Size of hashmap after clearing elements:"+hm.size());
		
	}

}
