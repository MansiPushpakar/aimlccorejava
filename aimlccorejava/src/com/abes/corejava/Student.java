package com.abes.corejava;

public class Student extends Object {

	
		// TODO Auto-generated method stub
       String name;//instance (objects)variables
	   long rollNumber;
	   String branch;
	   String college;
	   
	  public  Student(String name,long rollNumber,String branch,String college) {
		  this.name=name;
		  this.rollNumber=rollNumber;
		  this.branch=branch;
		  this.college=college;
		  
	  }
	  public void display() {
		  System.out.println("Name:"+name);
		  System.out.println("rollName:"+rollNumber);
		  System.out.println("branch:"+branch);
		  System.out.println("college"+college);
		  
	  }

}
