package com.proj;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;


import java.util.Scanner;


public class EmpDetail {

	static LinkedList<Employee> employees = new LinkedList<>();
    
	static String name = "";
    static int age = 0;
    static double salary = 0.0;
    static String designation = "";
    static String  n = " ";
	
    static  void option()
	{
		System.out.println("Please select \n"+"1.Create\n"+"2.Display\n"+"3.Raisesalary\n"+"4.Exit");
		Scanner s1=new Scanner(System.in);
		
		
		    CharSequence e=s1.next();
		
		if((!Pattern.matches("^[1-4]", e)) )
		{
			System.out.println("Please enter a choice in 1 2 3 4");
			option();
		}
		
		int n=Integer.parseInt(e.toString());
		if(n==1)
		{
			one();
		}
		else if(n==2) 
		{
			
			System.out.println("The details are:");
			
			if (employees != null) 
		{
		    System.out.println(employees.size());
			System.out.println("-----------------------------------------------------------------------------");
            System.out.printf("%10s %10s  %20s", "NAME", "AGE", "SALARY");
            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");
			
            
            for (Employee employee : employees) 
            {
            	if(employee.designation.equalsIgnoreCase("TESTER")||employee.designation.equalsIgnoreCase("T"))
                {
                    employee.salary +=15000;
                }
            	
            	else if(employee.designation.equalsIgnoreCase("PROGRAMMER")||employee.designation.equalsIgnoreCase("P"))
                {
                    employee.salary +=20000;
                }
            	
            	else if(employee.designation.equalsIgnoreCase("MANAGER")||employee.designation.equalsIgnoreCase("M"))
                {
                    employee.salary +=25000;
                }
            	System.out.format("%10s %10s %20s",
                        employee.getName(), employee.getAge(), employee.salary);
                System.out.println();
            	
            }
            
            System.out.println("do you want to store the data in a file  \n1.Yes\n2.No");
            Scanner sc=new Scanner(System.in);
            int ch=sc.nextInt();
            if(ch==1)
            {
            	store();
            }
            else if(ch==2)
            {
            	option();
            }		
		}
		}
		
		else if(n==3)
		{
			if (employees != null) 
			{
			    System.out.println(employees.size());
				System.out.println("Sl.no\tName\t\tAge\tDesignation\tSalary");
				System.out.println("-----------------------------------------------------------------------------");
	            System.out.printf("%10s %10s %20s %20s", "NAME", "AGE", "DESIGNATION", "SALARY");
	            System.out.println();
	            System.out.println("-----------------------------------------------------------------------------");
					
		 	
		
			System.out.println("The Raised Salary is:");
			for (Employee employee : employees) 
            {
				if(employee.designation.equalsIgnoreCase("TESTER")||employee.designation.equalsIgnoreCase("T"))
				{
					employee.salary +=0.3*employee.salary;
				}
				
				else if(employee.designation.equalsIgnoreCase("PROGRAMMER")||employee.designation.equalsIgnoreCase("P"))
				{
					employee.salary +=0.3*employee.salary;
				}
				
				else if(employee.designation.equalsIgnoreCase("MANAGER")||employee.designation.equalsIgnoreCase("M"))
				{
					employee.salary +=0.3*employee.salary;
				}
				
				System.out.format("%10s %10s %20s %20s",
                        employee.getName(), employee.getAge(), employee.getDesignation(), employee.getSalary());
                System.out.println();
				
            }
			 option();
			System.out.println("-----------------------------------------------------------------------------");
			}	
		}
			
			
		else if(n==4)
		{
			System.exit(1);
		}
		else
		{
			System.out.println("Invalid input");
		}
	}
	
	
static	void one()
		{
			
			name();
			age();
			System.out.println("Enter designation programmer/p tester/t manager/m");
		    design();	
			System.out.println("Select an option\n"+"1.Yes\n"+"2.No");
			Scanner s41=new Scanner(System.in);
			
			Employee employee = new Employee(name, age, salary, designation);
            employees.add(new Employee(name, age, salary, designation));
            System.out.println("Employee details saved!");
            
			if(s41.nextInt()==1)
			{
				
                one();
			}
			
			else
			{	
				option();  
			}
		}
			
		
		
	static	 void name()
		{
		    	Scanner sc=new Scanner(System.in);
		    	String c;
		    	System.out.println("Enter name:");
			    int j=0;
			    name=sc.next();
			
	         int h=name.trim().split(" ").length;
	   
	        if(name.matches("[a-zA-Z][a-zA-Z ]+[a-zA-Z]$"))
	        {
	         for(int k=0;k<name.length();k++)
	         {
	        	 if(name.charAt(k)==' ')
	        	 {
	        		j++;
	        	 }
	         }
			 if(!(j<4))
			 {
				System.out.println("Very long name");
				name();
			   }
		     }
	        else
	        {
	        	System.out.println("Enter some Alphabetic name and a short name");
	        	name();
	        	
	        }
	        
		}
		    
		
		
		
		static void age()
		{
			
			System.out.println("Enter age:");
		
			Scanner sc=new Scanner(System.in);
			
			n=sc.next();
			try 
			{

				if( Integer.parseInt(n)==Integer.valueOf(n))
				{
				System.out.println(n);
				age=Integer.parseInt(n);
				  if(age<20||age>60)
				  {
					  System.out.println("Enter a valid age between 20 to 60");
					  age();
				  }
				}
					
					
				}
					  
				
             catch(NumberFormatException ex)
			    {
				System.out.println("You didn’t entered a Integer"+ex.getMessage());
				age();
			    }
		      
		}
		
		
		
	static void design()
	{
		Scanner sc=new Scanner(System.in);
		designation=sc.next();
		if( (designation.equalsIgnoreCase("PROGRAMMER")||designation.equalsIgnoreCase("P")||designation.equalsIgnoreCase("tester")||designation.equalsIgnoreCase("T")||designation.equalsIgnoreCase("manager")|| designation.equalsIgnoreCase("M")) && !designation.isEmpty() ){}
		else
		{
			System.out.println("Please enter a correct designation");
			design();
		}
		
		}
	
	
	static void store()
	{
		try{
            FileOutputStream writeData = new FileOutputStream("Emp.txt");
            ObjectOutputStream writeStream = new ObjectOutputStream(writeData);

            writeStream.writeObject(employees);
            System.out.println("Data stored");
            writeStream.flush();
            writeStream.close();

        }catch (IOException e) 
		{
            e.printStackTrace();
        }
    

        try{
            FileInputStream readData = new FileInputStream("Emp.txt");
            ObjectInputStream readStream = new ObjectInputStream(readData);

            LinkedList p = (LinkedList<Employee>) readStream.readObject();
            readStream.close();

            System.out.println(p.toString());
        }catch (IOException | ClassNotFoundException e) 
        {
            e.printStackTrace();
        }
        option();

	}
	public static void main(String[] args) {
		employees= new LinkedList<>();
		EmpDetail t = new EmpDetail(); 
		 t.option();
	}

}


