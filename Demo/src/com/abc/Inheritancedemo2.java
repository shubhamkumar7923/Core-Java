package com.abc;

class Grandfather1{
	void ASTHAMA(){
		System.out.println("Asthama problem");
	}
}
class Father1 extends Grandfather1{
	void BP(){
		System.out.println("BP Problem");
	}
}
class Son1 extends Grandfather1{
	void SUGAR(){
		System.out.println("Sugar problem");
	}
}
public class Inheritancedemo2 {

	public static void main(String[] args) {
		Son1 ob = new Son1();
		ob.ASTHAMA();
		Father ob1 = new Father();
		ob1.ASTHAMA();
	}

}
