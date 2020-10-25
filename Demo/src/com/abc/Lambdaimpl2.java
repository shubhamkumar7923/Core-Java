package com.abc;

interface Addinterface{
	public int addtwono(int a, int b);
}
public class Lambdaimpl2 {

	public static void main(String[] args) {
		Addinterface ad = (a,b)->(a+b);
		int sum = ad.addtwono(10, 20);
		System.out.println("Sum of two no: "+sum);
	}

}
