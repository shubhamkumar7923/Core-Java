package com.abc;

import java.io.FileInputStream;
import java.io.ObjectInputStream;


public class Deserializationimpl {

	public static void main(String[] args) {
	
		try {
			FileInputStream fis= new FileInputStream("hello.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			A20 a1 = (A20)ois.readObject();
			ois.close();
			System.out.println("Value of object is :"+a1.x+" "+a1.y+" "+a1.z);
			System.out.println("Deserialization done.....");
		} catch (Exception e) {
			System.out.println("Exception "+e);
		}
	}

}
