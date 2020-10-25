package com.abc;

import java.util.ArrayList;

public class Arraylist3 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setId(1);
		e1.setName("Amit");
		e1.setPhone(333);
		e1.setEmail("amit123@gamil.com");
		Employee e2 = new Employee();
		e2.setId(2);
		e2.setName("Suraj");
		e2.setPhone(111);
		e2.setEmail("suraj123@gamil.com");
		Employee e3 = new Employee();
		e3.setId(3);
		e3.setName("shubham");
		e3.setPhone(353);
		e3.setEmail("shubham123@gamil.com");
		ArrayList el = new ArrayList();
		el.add(e1);
		el.add(e2);
		el.add(e3);
		System.out.println(el);
	}

}
