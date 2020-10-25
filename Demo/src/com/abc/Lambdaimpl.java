package com.abc;
// without lambda
interface HelloInterface {
	public void displayHello();
}
class HelloInterfaceimpl implements HelloInterface{

	@Override
	public void displayHello() {
		System.out.println("Hello");
		
	}
	
}
public class Lambdaimpl {

	public static void main(String[] args) {
		HelloInterface hl = new HelloInterfaceimpl(); 
		hl.displayHello();
	}

}
