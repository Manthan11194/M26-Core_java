package Day6;

public class mj {

	public static void main(String[] args) {
	
		
	/*	String 	a="Ananya";
		int b=10, c=20, d=30;
			System.out.println(a+b+c+d);
		System.out.println(b+c+d+a);
		System.out.println(b+c+a+d);
		System.out.println(b+a+c+d); */
		
	/*	String s =new String ("manthan");
		s.concat("jadhav");//String object are immutable----cannot be changed
		System.out.println(s);*/
		
	/*	StringBuffer s =new StringBuffer("Manthan");
		s.append("Jadhav");//string Buffer object are mutable in anture
		System.out.println(s);  */
		
		String s="Manthan";
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		System.out.println(s.length());
		System.out.println(s.equals("manthan"));
		System.out.println(s.equalsIgnoreCase("MANTHAN"));
		System.out.println(s.replace('n', 'p'));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3,6));
		
	}

}
