package com.abc;

import java.io.File;

public class Fileimpl1 {

	public static void main(String[] args) {
		System.out.println("Begin main");
		File f = null;
		f = new File("hello.txt");
		System.out.println("Name of file is: "+f.getName());
		System.out.println("Absolute path of file is: "+f.getAbsolutePath());
		System.out.println("File is readable: "+f.canRead());
		System.out.println("File is writable: "+f.canWrite());
		System.out.println("File is present: "+f.exists());
		System.out.println("Length of file: "+f.length());
	}

}
