package org.tnsindia.entities;

public class Student {
	
	private int rollno;
	private String name;
	//private float percentage;
	
	//parameterized constructor
	public Student(int rollno, String name) {
		super();
		this.rollno = rollno;
		this.name = name;
		//this.percentage = percentage;
	}

	//Default constructor
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	//setters & getters method
	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + "]";
	}


}
