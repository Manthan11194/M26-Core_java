package Day10;

public class ThreadDemoImplement 
{

	public static void main(String[] args) 
	{
		Multi3 m1=new Multi3();
		Thread t1=new Thread(m1);
		
		Multi4 m2=new Multi4();
		Thread t2=new Thread(m2);
		t1.start();
		t2.start();

	}

}
//Thread 1
class Multi3 implements Runnable
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
class Multi4 implements Runnable
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
		
			System.out.println("Double Number" +(i*2));
		}
	}
}