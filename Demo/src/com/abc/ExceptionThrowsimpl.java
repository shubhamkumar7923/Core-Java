package com.abc;

class A1{
	void m1(int x,int y) throws ArrayIndexOutOfBoundsException,
	ArithmeticException{
		System.out.println("Begin M1 method");
		int p= x/y;
		System.out.println("Value of p "+p);
		B1 ob = new B1();
		ob.m2();
	}
}
class B1{
	void m2()throws ArrayIndexOutOfBoundsException{
		System.out.println("Begin M2 Method");
		int a[]= new int [5];
		a[6]=20;
		System.out.println("end of m2 method");
	}
}
public class ExceptionThrowsimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Begin Main Method");
			A1 ob = new A1();
			ob.m1(10,2);
		} catch (ArithmeticException e) {
			System.out.println("Inside arithmatic exception "+e);
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Inside Array index "+e);
		}
	}

}
