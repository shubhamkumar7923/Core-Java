package com.abc;
// We cannot write print statement between try and catch block 
public class ExceptionHanimpl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hii");
		System.out.println("Hello");
		try {
			System.out.println(10/0);
		} 
		//System.out.println("In between try and catch");
		catch (Exception e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("How r you");
		System.out.println("I m fine");
	}

}
