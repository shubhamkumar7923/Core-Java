package com.proj;

import java.io.Serializable;

public class Employee implements Serializable 
{
      String name;
      int age;
      double salary;
      String designation;
      
      public Employee(String name, int age, double salary, String designation) 
      {
            this.name = name;
            this.age = age;
            this.salary = salary;
            this.designation = designation;
        }
      
      
      public String toString() {
             return "Person{" +
                     "Name='" + name + '\'' +
                     ", Age='" + age + '\'' +
                     ", Designation='" + designation + '\'' +
                     ", Salary=" + salary +
                     "}\n";
         }
      
      
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
      
      
      
      
}

