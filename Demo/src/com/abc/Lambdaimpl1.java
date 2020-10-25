package com.abc;
// with lambda expression
interface HelloInterface1 {
	public void displayHello();
}
public class Lambdaimpl1 {

	public static void main(String[] args) {
		HelloInterface1 hl1 = ()->System.out.println("Hello");
		hl1.displayHello();
	}

}
