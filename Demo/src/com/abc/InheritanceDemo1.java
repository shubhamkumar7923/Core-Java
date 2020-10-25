package com.abc;

class Grandfather{
	void ASTHAMA(){
		System.out.println("Asthama problem");
	}
}
class Father extends Grandfather{
	void BP(){
		System.out.println("BP Problem");
	}
}
class Son extends Father{
	void SUGAR(){
		System.out.println("Sugar problem");
	}
}
public class InheritanceDemo1 {

	public static void main(String[] args) {
		Son ob = new Son();
		ob.ASTHAMA();
		ob.BP();
		ob.SUGAR();
	}

}
