package com.abc;

class Hello3{
	private int sid;
	private String sname;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	
}
public class Encapimpl2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hello3 ob = new Hello3();
		ob.setSid(1);
		ob.setSname("Shubham");
		int num1=ob.getSid();
		String name=ob.getSname();
		System.out.println(num1);
		System.out.println(name);
	}

}
