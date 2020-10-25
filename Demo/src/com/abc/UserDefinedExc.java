package com.abc;
class StudentNotFoundException extends Exception{
	String msg;
	 StudentNotFoundException(int sid){
		msg="Student id "+sid+" is not valid";
	}
	 public String toString(){
		 return msg;
	}

}
	
class Student1{
	void checkStudent(int id)throws StudentNotFoundException{
		if(id<50){
			System.out.println("Student id is :"+id);
		}else{
			throw new StudentNotFoundException(id);
		}
	}
}
public class UserDefinedExc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student1 ob = new Student1();
			ob.checkStudent(55);
		} catch (StudentNotFoundException e) {
			System.out.println("Exception "+e);
		}
	}

}
