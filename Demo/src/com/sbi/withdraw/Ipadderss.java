package com.sbi.withdraw;

import java.net.InetAddress;

public class Ipadderss{

	public static void main(String[] args) throws Exception {
		InetAddress localhost = InetAddress.getLocalHost(); 
        System.out.println("System IP Address : " + 
                      (localhost.getHostAddress()).trim()); 
    } 
}
