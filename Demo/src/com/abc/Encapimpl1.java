package com.abc;

class Hello2{
	private int sid;
	private int sage;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getSage() {
		return sage;
	}
	public void setSage(int sage) {
		this.sage = sage;
	}
	
}
public class Encapimpl1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello2 ob = new Hello2();
		ob.setSage(22);
		ob.setSid(1);
		int num1=ob.getSage();
		int num2=ob.getSid();
		System.out.println(num1);
		System.out.println(num2);
	}

}
