package Day10;

public class ThreadDemoExtends 
{

	public static void main(String[] args) 
	{
		Thread1 t1=new Thread1();
		Thread2 t2=new Thread2();
		
		t1.start();
		t2.start();

	}

}
//Thread 1
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(2000);
				System.out.println("Square number" +(i*i));
			}
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
}
//Thread 2
class Thread2 extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Double Number" +(i*2));
		}
	}
}