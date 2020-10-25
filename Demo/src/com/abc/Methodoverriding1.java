package com.abc;

class Parent1{
	void property(){
		System.out.println("Property");
	}
	void marry(){
		System.out.println("parent selected");
	}
}
public class Methodoverriding1 extends Parent1 {
	void marry(){
		super.marry();
		System.out.println("campus selected");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverriding1 ob = new Methodoverriding1();
		ob.marry();
		ob.property();
	}

}
