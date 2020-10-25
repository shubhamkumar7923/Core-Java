package com.abc;

import java.util.Scanner;

public class ExceptionThrowimpl {
	static void m1(int age){
		if(age<18){
			throw new ArithmeticException("Not eligible to vote");
		} else{
			System.out.println("Eligible to vote");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age: ");
		int s=sc.nextInt();
		m1(s);
		System.out.println("------------------");
	}

}
