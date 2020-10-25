package com.abc;
// using try catch block
public class ExceptionHanimpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii");
		System.out.println("Hello");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("How r you");
		System.out.println("I m fine");
	}

}
