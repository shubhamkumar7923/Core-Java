package com.abc;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A21 implements Serializable{
	int x;
	static int y;
	transient int z;
	A21(){
		System.out.println("inside constructor");
		x=10;
		y=20;
		z=30;
	}
}
public class Serializableimpl2 {

	public static void main(String[] args) {
		A21 a = new A21();
		try {
			FileOutputStream fos = new FileOutputStream("hello.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(a);
			oos.close();
			System.out.println("Values are: "+ a.x+" "+a.y+" "+a.z);
		} catch (Exception e) {
			System.out.println("Exception: "+e);
		}
	}

}
