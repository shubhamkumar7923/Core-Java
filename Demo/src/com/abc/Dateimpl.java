package com.abc;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Dateimpl {

	public static void main(String[] args) {
		Locale l = new Locale("da","DK");
		DateFormat df = DateFormat.getDateInstance();
		System.out.println(df.format(new Date()));
		df = DateFormat.getDateInstance(DateFormat.DEFAULT,l);
		System.out.println(df.format(new Date()));
	}

}
