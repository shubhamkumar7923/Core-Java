package com.abc;

public class Stringbufferimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer ob = new StringBuffer("Kishore");
		System.out.println(ob.capacity());
		System.out.println(ob.length());
		ob.append(" sharma");
		System.out.println(ob);
		ob.insert(0, 'k');
		System.out.println(ob);
		ob.replace(1, 4, "Hello");
		System.out.println(ob);
		ob.delete(1, 5);
		System.out.println(ob);
	}

}
