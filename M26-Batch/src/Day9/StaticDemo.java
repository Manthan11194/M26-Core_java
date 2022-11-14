package Day9;

public class StaticDemo 
{
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
	
	public  StaticDemo (String name, int rollno)
	{
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public static void main(String[] args) 
	{
		StaticDemo s1=new StaticDemo("Manthan",1);
		StaticDemo s2=new StaticDemo("Ram",2);
		StaticDemo s3=new StaticDemo("Sham",3);
		modify();
		s1.display();
		s2.display();
		s3.display();

	}

}