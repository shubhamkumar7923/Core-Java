package com.abc;

interface It1{
	void add();
	void div();
}
public class Interfaceimpl1 implements It1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceimpl1 ob= new Interfaceimpl1();
		ob.add();
		ob.div();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("how r u");
	}

}
