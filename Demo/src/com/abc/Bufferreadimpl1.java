package com.abc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bufferreadimpl1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("Please enter first value :");
			String s1 = br.readLine();
			int x1 = Integer.parseInt(s1);
			System.out.println("Please enter second value :");
			String s2 = br.readLine();
			int x2 = Integer.parseInt(s2);
			int z = x1+x2;
			System.out.println("x1 :"+x1);
			System.out.println("x2 :"+x2);
			System.out.println("z :"+z);

		} catch (IOException e) {
			System.out.println("inside exception");
			e.printStackTrace();
		}
	}

}
