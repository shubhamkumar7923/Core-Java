package com.abc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A20 implements Serializable{
	int x;
	int y;
	int z;
	public A20(int x,int y,int z){
		System.out.println("Inside constructor");
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
public class Serializedimpl {

	public static void main(String[] args) {
		A20 a = new A20(10,20,30);
		System.out.println("Value of object is :"+a.x+" "+a.y+" "+a.z);
		try {
			FileOutputStream fos = new FileOutputStream("hello.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();
			System.out.println("Serialization done.....");
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}

}
