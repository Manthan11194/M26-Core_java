package Day11;

public class ExceptionDemo {

	public static void main(String[] args) {
	int[] arr=new int[4];
	System.out.println("i am begining of the program");
	
	try {
			
		System.out.println(arr[4]);
		System.out.println("i am inside try block");
		}
	
	/*catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Exception caught- I am in catch block");
	} */
	
	finally
	{
		System.out.println("i am inside finally block");
	}
	System.out.println("i am rest of the program");
}
}
