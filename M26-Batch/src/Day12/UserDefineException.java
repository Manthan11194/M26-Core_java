
package Day12;
public class UserDefineException{

	public static void main(String[] args) {
		int age;
		System.out.println("enter aeg=");
			
		Scanner s = new Scanner();
		
		age=s.nextint();  
		
		if(age<18)
		{
			throw new cantVote("you cannot vote u underage");
		}
		else
		{
		 System.out.println("you can happly apply");	
		}
	}

}
class cantVote extends RuntimeException
{
	public cantVote(String msg)
	{
		super(msg);
	}
}