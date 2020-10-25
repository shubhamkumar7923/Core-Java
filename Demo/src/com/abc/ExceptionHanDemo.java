package com.abc;

import java.util.Scanner;

public class ExceptionHanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a:");
		int a= sc.nextInt();
		System.out.println("Enter b:");
		int b= sc.nextInt();
		try {
			int div =a/b;
			System.out.println(div);
		} catch (ArithmeticException e) {
			System.out.println("Exception occured "+e);
		}
		System.out.println("Program executed");
	}

}
