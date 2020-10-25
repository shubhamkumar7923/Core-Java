package com.abc;
// Multiple inheritance using interface
interface It3{
	void add();
}
interface It4{
	void div();
}
public class Multipleinheriimpl implements It3,It4{

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("div");
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("add");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipleinheriimpl ob = new Multipleinheriimpl();
		ob.add();
		ob.div();
	}
}
