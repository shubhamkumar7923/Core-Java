package com.abc;

import java.io.PrintWriter;

public class PrintWriterimpl1 {

	public static void main(String[] args) {
		PrintWriter w = new PrintWriter(System.out,true);
		int i=10;
		w.println(i);
		String s= "hello";
		w.println(s);
		double d = 10.99;
		w.println(d);
	}

}
