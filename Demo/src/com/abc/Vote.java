package com.abc;

import java.util.Scanner;

public class Vote {

	String name;
	int age;
        Vote(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name :");
		String name= sc.next();
		this.name=name;
		System.out.println("Enter Age :");
		int age= sc.nextInt();
		this.age=age;
		if(age>=18){
			System.out.println("You are eligble to vote");
		}else{
			System.out.println("You are not eligble to vote");
		}
	}
	public static void main(String[] args) {
		Vote ob = new Vote();
	}

}
