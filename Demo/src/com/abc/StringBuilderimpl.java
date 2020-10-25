package com.abc;

public class StringBuilderimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder ob = new StringBuilder();
		System.out.println(ob.length());
		System.out.println(ob.capacity());
		
		ob.append("Hello");
		System.out.println(ob.length());
		System.out.println(ob.capacity());
		
		ob.append("World");
		System.out.println(ob.length());
		System.out.println(ob.capacity());
		
		ob.append("Hello World");
		System.out.println(ob.length());
		System.out.println(ob.capacity());
		
		StringBuilder ob1 = new StringBuilder("Hello");
		ob1.append("Java");
		System.out.println(ob1);
		
		StringBuilder ob2 = new StringBuilder("Hello");
		ob2.insert(1,"Java");
		System.out.println(ob2);
		
		StringBuilder ob3 = new StringBuilder("Hello");
		ob3.replace(1, 3, "Java");
		System.out.println(ob3);
		
		StringBuilder ob4 = new StringBuilder("Hello");
		ob4.delete(1, 3);
		System.out.println(ob4);
	}

}
