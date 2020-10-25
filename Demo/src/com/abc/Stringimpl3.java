package com.abc;

public class Stringimpl3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="  ab c ";
		System.out.println("Value of s1"+s1);
		String s2=s1.trim();
		System.out.println("Value of s1"+s1);
		System.out.println("Value of s1"+s2);
		System.out.println("-------------------");
		String s3="Hello how are you";
		String a3[]=s3.split(" ");
		for(int i=0;i<a3.length;i++)
		{
			System.out.println(a3[i]);
		}
		System.out.println("-------------------");
		String s4="aBcd";
		String rep1=s4.replace('a','A');
		String rep2=s4.replaceAll("aB", "Ab");
		System.out.println(rep1);
		System.out.println(rep2);
		System.out.println("--------------------");
		String s5="Shubham";
		System.out.println(s5.startsWith("Sh"));
		System.out.println(s5.endsWith("m"));
		System.out.println("---------------------");
		String s6="HEllO";
		System.out.println("Lower case "+s6.toLowerCase());
		String s7="hello";
		System.out.println("Uppar case "+s7.toUpperCase());
		System.out.println("-----------------------");
		String s8="SHUBHAM";
		String s9="shubham";
		System.out.println(s8.equalsIgnoreCase(s9));
		System.out.println("----------------------");
	}

}
