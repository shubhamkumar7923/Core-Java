package com.abc;

interface It2{
	void add();
	void div();
	void mul();
}
abstract class Abc implements It2{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}
	
}
public class Interfaceimpl2 extends Abc{

	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("mul");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interfaceimpl2 ob = new Interfaceimpl2();
		ob.add();
		ob.div();
		ob.mul();
	}

}
