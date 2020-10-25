package com.abc;

public class Employee {

	private String name;
	private int phone;
	private String email;
	private int id;
	
public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public String toString(){
		String s = "Emp Id :"+ id +"\n"+
				   "Emp name :"+ name +"\n"+
				   "Emp Phone :"+phone +"\n"+
				   "Emp email :"+email +"\n";
		return s;
	}
}
