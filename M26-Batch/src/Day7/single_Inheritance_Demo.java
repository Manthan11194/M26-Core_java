package Day7;

public class single_Inheritance_Demo {

	public static void main(String[] args) {
		B obj = new B();
		obj.a=10;
		obj.b=20;
		obj.c=30;
		obj.show();
		obj.display();

	}

}
class A
{
	int a,b;
	 
	void display()
	{
		System.out.println(" i am commining parent class"+a+" "+b);
		
	}
}
class B extends A
{
	int c;
	void show()
	{
		
		System.out.println(" i am commining child class"+a+" "+b+" "+c);
	}
	
}