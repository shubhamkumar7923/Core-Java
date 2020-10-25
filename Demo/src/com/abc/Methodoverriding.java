package com.abc;

class Parent{
	void property(){
		System.out.println("Property");
	}
	void marry(){
		System.out.println("parent selected");
	}
}
public class Methodoverriding extends Parent {
	void marry(){
		System.out.println("campus selected");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding ob = new Methodoverriding();
		ob.marry();
		ob.property();
	}

}
