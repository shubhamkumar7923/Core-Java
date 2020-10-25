package com.sbi.withdraw;

import java.io.IOException;

public class Notepad {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad");
		} catch (IOException e) {
			System.out.println("Exception "+e);
		}
	}

}
