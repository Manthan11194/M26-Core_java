
package Day2;

public class Student_Constructor_Demo {

	String name;
	int rollNo;
	
		//Parameterized Constructor
	public Student_Constructor_Demo(String name, int rollNo) {
		super();
		this.name = name;
		this.rollNo = rollNo;
	}
	public static void main(String[] args) {

	Student_Constructor_Demo sl=new  Student_Constructor_Demo ("Manthan", 72176727);

	 Student_Constructor_Demo s2=new  Student_Constructor_Demo ("XYZ", 72176728);

	System.out.println(sl.name+" "+sl.rollNo);

	System.out.println(s2.name+" "+s2.rollNo);


}
}
