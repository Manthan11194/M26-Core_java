package Day21;

public class GenericClass<T> 
{
	T num;
	public void display()
	{
		System.out.println(num.getClass().getName());
		
	}
	

	
	public static void main(String[] args) {
		GenericClass<Integer>obj=new GenericClass<Integer>();
		obj.num=15;
		obj.display();
		
	}

}
