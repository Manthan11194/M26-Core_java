package Day9;

public class StaticDemo {
	String name; //object bound
	int rollno;
	static String coll="ABC uni";//class bound 
	
	void display()
	{
		
		System.out.println(name+" "+rollno+" "+coll);
				
	}
	static void modify()
	{
		coll="xyz uni";
	}
	
	public StsticDemo(String name, int rollno)
	{
		super();
		this.name = name;
		this.rollno = roll;
	}

	public static void main(String[] args) {
		StaticDemo s1=new StaticDemo("Manthan",1);
		StaticDemo s1=new StaticDemo("Manthan",1);
		StaticDemo s1=new StaticDemo("Manthan",1);

	}

}
