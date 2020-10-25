package com.sbi.withdraw;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int reversed=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int num= sc.nextInt();
		 while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
		 System.out.println("Reversed Number: " + reversed);
	}

}
