package org.tnsindia.in;

public class ConstructorDemo {


	String name;
	int rollNo;
	
		//Parameterized Constructor
	public ConstructorDemo(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {

		ConstructorDemo sl=new  ConstructorDemo ("Manthan", 72176727);

		ConstructorDemo s2=new  ConstructorDemo ("XYZ", 72176728);

	System.out.println(sl.name+" "+sl.rollNo);

	System.out.println(s2.name+" "+s2.rollNo);

	}

}
