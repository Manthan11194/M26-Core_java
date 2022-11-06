package Day8;

public class Multiple_Inheritance {

	public static void main(String[] args) {
		C obj=new C();
		obj.displayA();
		obj.displayB();

	}

}
interface A1
{
	void displayA();
}
interface B1
{
	void displayB();
}
class C implements A1,B1
{

	@Override
	public void displayB() {
		System.out.println("i am form B interface");
		
	}

	@Override
	public void displayA() {
		
		System.out.println("i am form A interface");
		
	}
	
}