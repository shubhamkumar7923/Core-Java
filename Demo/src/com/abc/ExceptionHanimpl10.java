package com.abc;

public class ExceptionHanimpl10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			System.out.println(10/0);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured "+e);
		}finally {
			System.out.println("Finally block ie executed ");
		}
	}

}
