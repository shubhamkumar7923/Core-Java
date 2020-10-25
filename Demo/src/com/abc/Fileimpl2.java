package com.abc;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Fileimpl2 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("hello.txt");
			fw.write("I have written something in the file");
			fw.close();
			System.out.println("Successfully written in file");
		} catch (IOException e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
		try {
			File f = new File("hello.txt");
			Scanner s = new Scanner(f);
			while(s.hasNextLine()){
				String content = s.nextLine();
				System.out.println(content);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Exception Occured");
			e.printStackTrace();
		}
	}

}
