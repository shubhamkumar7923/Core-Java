package com.abc;

public class ExceptionHanimpl6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii");
		System.out.println("Hello");
		try {
			int a []={10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			//System.out.println(a[3]);
			System.out.println(10/0);
			System.out.println("Hii");
			System.out.println("Hello");
			System.out.println("How r you");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception occured "+e);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured "+e);
		} catch (Exception e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("How r you");
		System.out.println("I m fine");
	}

}
