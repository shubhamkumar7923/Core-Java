package com.abc;

public class Stringimpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		String s3="hello";
		String s4="Hello";
		
		if(s1==s2){
			System.out.println("Refer to same object");
		} else{
			System.out.println("Refer to different object");
		}
		if(s1.equals(s2)){
			System.out.println("Have same value");
		} else {
			System.out.println("Have different value");
		}
		
		if(s3==s4){
			System.out.println("Refer to same object");
		} else{
			System.out.println("Refer to different object");
		}
		if(s3.equals(s4)){
			System.out.println("Have same value");
		} else {
			System.out.println("Have different value");
		}
	}

}
