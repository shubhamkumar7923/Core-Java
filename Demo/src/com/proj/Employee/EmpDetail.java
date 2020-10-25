package com.proj.Employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmpDetail {

	int i=0;
	String[] name=new String[5];
	int[] age=new int[5];
	String[] designation= new String[5];
	Double[]sal=new Double[5];
	
	void getdetails(){
		System.out.println("1. Create");
		System.out.println("2. Display");
		System.out.println("3. Raise Salary");
		System.out.println("4. Exit");
		System.out.println("Enter Choice :");
		try {
			Scanner sc = new Scanner(System.in);
			int input = sc.nextInt();
			switch(input){
			case 1: create(name,age);
			break;
			case 2: display(name,age);
			break;
			case 3: raisesal();
			break;
			case 4: exit();
			default:System.out.println("Invalid input");
			getdetails();
			}
		} catch (InputMismatchException e) {
			System.out.println("Exception "+e);
			getdetails();
		} 
	}
	void create(String[] name,int[] age){
		try {
			name();
			age();
			designation();	
			i++;
			System.out.println("Do you want to continue : Y/N");
			Scanner sc = new Scanner(System.in);
			char cont= sc.next().charAt(0);
			if(cont=='y'||cont=='Y'){
				create(name,age);
			}else{
				getdetails();
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception "+e);
			exit();
		}catch (Exception e) {
			System.out.println("Exception "+e);
			create(name,age);
		}
	}
	void name(){
		int word=1;
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name :");
			name[i]= sc.nextLine();
			name[i]=name[i].trim();
			for(int k=0;k<name[i].length();k++){	
	       	if(name[i].charAt(k)==' '){
	       		word++;
	       	 }
			if(word<4){
			}else{
				System.out.println("Very long name");
				name();
			}
		}
		} catch (InputMismatchException e) {
			System.out.println("Exception "+e);
			name();
		}
	}
	void age(){
		try {
			System.out.println("Enter Age :");
			Scanner sc= new Scanner(System.in);
			age[i]= sc.nextInt();
			if(age[i]>=20 &&(age[i]<=60)){}
			else{
				System.out.println("Enter valid age");
				System.out.println("Enter Age :");
				age[i]= sc.nextInt();
			}
		} catch (InputMismatchException e) {
			System.out.println("Exception "+e);
			age();
		}
	}
	void designation(){
		try {
			System.out.println("Enter Designation :");
			System.out.println("Programmer :");
			System.out.println("Tester :");
			System.out.println("Manager :");
			Scanner sc = new Scanner(System.in);
			designation[i]=sc.next();
			if(designation[i].equalsIgnoreCase("programmer")
				||designation[i].equalsIgnoreCase("tester")||
				designation[i].equalsIgnoreCase("manager")||
				designation[i].equalsIgnoreCase("m")||
				designation[i].equalsIgnoreCase("t")||
				designation[i].equalsIgnoreCase("p")){}
			else {
				System.out.println("Please enter correct designation");
				designation();
			}
			} catch (InputMismatchException e) {
				System.out.println("Exception "+e);
				designation();
				}		
	}
	void display(String[] name,int[] age){
		try {
			if(name[i]==null){
				System.out.println("No name to display");
				getdetails();
			}
			System.out.println("----------------------------");
			for(int j=0;j<i;j++)
			{
				if(name[j]!=null){
					System.out.println("Name :"+name[j]);
				}
				if(age[j]!=0)
				System.out.println("Age :"+age[j]);
				if(designation[j].equalsIgnoreCase("Manager")
						||designation[j].equalsIgnoreCase("m")){
					sal[j]=25000.00;
					System.out.println("Designation :"+designation[j]);
					System.out.println("Salary :"+sal[j]);
				}else if(designation[j].equalsIgnoreCase("Tester")||
						designation[j].equalsIgnoreCase("t")){
					sal[j]=15000.00;
					System.out.println("Designation :"+designation[j]);
					System.out.println("Salary :"+sal[j]);
				} else if(designation[j].equalsIgnoreCase("Programmer")
						||designation[j].equalsIgnoreCase("p")){
					sal[j]=20000.00;
				System.out.println("Designation :"+designation[j]);
				System.out.println("Salary :"+sal[j]);
			}
				System.out.println("-------------------------");
		} 
			System.out.println("\n");
			System.out.println("Do you want to continue : Y/N");
			Scanner sc= new Scanner(System.in);
			char cont= sc.next().charAt(0);
			if(cont=='y'||cont=='Y'){
				getdetails();
			}else{
				exit();
			}

		} catch (NullPointerException e) {
			System.out.println("Exception "+e);
			getdetails();
		}
	}		
	void raisesal(){
		if(sal[i]==null){
			System.out.println("No raised salary to display");
			getdetails();
		}
		System.out.println("Raised salary is :");
		for(int k=0;k<i;k++){
			if(designation[k].equalsIgnoreCase("Manager")||
					designation[k].equalsIgnoreCase("m")){
				sal[k]=25000+25000*(0.3);
			}else if(designation[k].equalsIgnoreCase("Tester")||
					designation[k].equalsIgnoreCase("t")){
				sal[k]=15000+15000*(0.3);
			} else if(designation[k].equalsIgnoreCase("Programmer")
					||designation[k].equalsIgnoreCase("p")){
				sal[k]=20000+20000*(0.3);
			}
			System.out.println("-----------------------");
			System.out.println("Name :"+name[k]);
			System.out.println("Age :"+age[k]);
			System.out.println("Designation :"+designation[k]);
			System.out.println("Salary :"+sal[k]);
			System.out.println("-----------------------");
		}
		System.out.println("Do you want to continue : Y/N");
		Scanner sc= new Scanner(System.in);
		char cont= sc.next().charAt(0);
		if(cont=='y'||cont=='Y'){
			getdetails();
		}else{
			exit();
		}
	}
	void exit(){
		System.exit(0);
	}
	
	public static void main(String[] args) {
		EmpDetail ob = new EmpDetail();
		ob.getdetails();
	}

}

