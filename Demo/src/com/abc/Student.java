package com.abc;
import java.util.Scanner;

public class Student {

	String sname;
	int sno;
	Student(){
		Scanner sc= new Scanner(System.in); 
		System.out.println("Enter the name");
		String sname=sc.next();
		this.sname=sname;
		System.out.println("Enter the sno");
		int sno=sc.nextInt();
		this.sno=sno;
	}
	void display(){
		System.out.println("Details are as follows");
		System.out.println("Name :"+sname);
		System.out.println("Sno :"+sno);
	}
	public static void main(String[] args) {
		Student ob = new Student();
		ob.display();
	}

}

