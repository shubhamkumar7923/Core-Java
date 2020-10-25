package com.abc;

interface Intface{
	public String Strconcat(String a, String b);
}
public class Lambdaimpl3 {

	public static void main(String[] args) {
		Intface in = (a,b)->(a+" "+b);
		String str = in.Strconcat("Shubham", "Kumar");
		System.out.println(str);
	}

}
