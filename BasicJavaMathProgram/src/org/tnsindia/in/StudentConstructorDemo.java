package org.tnsindia.in;

public class StudentConstructorDemo {

	String name;
	int rollNo;
	
		//Parameterized Constructor
	public StudentConstructorDemo(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {

	StudentConstructorDemo sl=new  StudentConstructorDemo ("Manthan", 72176727);

	 StudentConstructorDemo s2=new  StudentConstructorDemo ("XYZ", 72176728);

	System.out.println(sl.name+" "+sl.rollNo);

	System.out.println(s2.name+" "+s2.rollNo);


}
}
