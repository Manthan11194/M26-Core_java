package org.tnsindia.in;
import java.util.Scanner;
public class First_Add_Program {

	public static void main(String[] args) {
		

		Scanner obj= new Scanner(System.in);

		System.out.println("Please enter first Number-->"); 
		
		int num1=obj.nextInt();

		System.out.println("Please enter second Number-->"); 
		
		int num2=obj.nextInt();

		int sum=num1+num2; System.out.println("Sum of two Numbers-->"+sum);


	}

}
