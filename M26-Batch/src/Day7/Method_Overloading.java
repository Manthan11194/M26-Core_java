package Day7;

public class Method_Overloading {

	public static void main(String[] args) {
		poly obj =new poly();
		/*obj.m();
		obj.m(23);
		obj.m(3.0);
		*/
		//Automatic promotion chart
		obj.m('A');
		obj.m(12334);
		obj.m(1.3f);
	}

}
class poly
{
	public void m()
	{
		System.out.println("no ar");
		
	}
	public void m(int i) 
	{
		System.out.println("interger argument");
		
	}
	public void m(double d)
	
	{
		System.out.println("double argument");
	}
}

