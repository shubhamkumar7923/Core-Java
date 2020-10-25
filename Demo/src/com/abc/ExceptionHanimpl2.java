package com.abc;
// line 12 & 13 will not execute as all statement are written in 
// try block. We only have to write those statement which will give
// exception.
public class ExceptionHanimpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			System.out.println("Hii");
			System.out.println("Hello");
			System.out.println(10/0);
			System.out.println("How r you");
			System.out.println("I m fine");
		} catch (Exception e) {
			System.out.println("Exception occured "+e);
		
		}
	}
}	
