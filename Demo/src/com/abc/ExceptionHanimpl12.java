package com.abc;

public class ExceptionHanimpl12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			System.out.println(10/2);
			System.exit(0);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured "+e);
		} finally {
			System.out.println("Finally block ie executed ");
		}
	}

}
