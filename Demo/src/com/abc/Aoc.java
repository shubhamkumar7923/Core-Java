package com.abc;

public class Aoc {

	void arc(float r){
		double area=3.14*r*r;
		System.out.println("Area of circle "+area);
	}
	public static void main(String[] args) {
		Aoc ob = new Aoc();
		ob.arc(9.8f);
	}

}
