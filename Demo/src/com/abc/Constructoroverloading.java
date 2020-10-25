package com.abc;

public class Constructoroverloading {

	Constructoroverloading(){
		System.out.println("Default constructor");
	}
	Constructoroverloading(int a){
		System.out.println("Parametrised constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructoroverloading ob = new Constructoroverloading();
		Constructoroverloading ob1 = new Constructoroverloading(3);
	}

}
