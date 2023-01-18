package Day23;

class Parent1
{
	@Deprecated
	void print()
	{
		System.out.println("Hello Everyone");
	}
	@Deprecated
	void print1()
	{
		System.out.println("Cheers!");
	}
}
public class Example3Annotation {

	public static void main(String[] args) {
		Parent1 p=new Parent1();
		p.print1();
	}

}
