package com.abc;

public class Staticimp {

	static{
		System.out.println("block");
	}
	{
		System.out.println("Instance block");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Staticimp ob = new Staticimp();
	}

}
