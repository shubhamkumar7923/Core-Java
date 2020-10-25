package com.abc;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist4 {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Shubham");
		al.add("Rahul");
		al.add("11");
		String s = al.get(1);
		System.out.println(s);
		Integer in = Integer.parseInt(al.get(2));
		System.out.println(in);
		Iterator<String> i = al.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		}
	}

}
