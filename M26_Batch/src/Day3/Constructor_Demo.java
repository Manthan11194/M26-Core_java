package Day3;

import Day3.Constructor_Demo;

public class Constructor_Demo {


	String name;
	int rollNo;
	
		//Parameterized Constructor
	public Constructor_Demo(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {

		Constructor_Demo sl=new  Constructor_Demo ("Manthan", 72176727);

		Constructor_Demo s2=new  Constructor_Demo ("XYZ", 72176728);

	System.out.println(sl.name+" "+sl.rollNo);

	System.out.println(s2.name+" "+s2.rollNo);

	}

}
