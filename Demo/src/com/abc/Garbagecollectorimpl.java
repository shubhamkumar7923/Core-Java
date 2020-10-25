package com.abc;

public class Garbagecollectorimpl {

	public void finalize(){
		System.out.println("I am finalize");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Garbagecollectorimpl ob1 = new Garbagecollectorimpl();
		Garbagecollectorimpl ob2 = new Garbagecollectorimpl();
		Garbagecollectorimpl ob3 = new Garbagecollectorimpl();
		ob1= null;
		ob2= null;
		ob3= null;
		System.gc();
	}

}
