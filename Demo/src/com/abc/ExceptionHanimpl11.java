package com.abc;

public class ExceptionHanimpl11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Hello");
			System.out.println(10/0);
		} finally {
			System.out.println("Finally block ie executed ");
		}
	}

}
