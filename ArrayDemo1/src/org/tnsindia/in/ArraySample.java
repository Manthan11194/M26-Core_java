
package org.tnsindia.in;
import java.util.Scanner;
public class ArraySample {

	public static void main(String[] args) {
		int size;
		System.out.println("enter the size of arry");
		
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt();
		
		int[] arr=new int[37];
		System.out.println("enter a element");
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt();
			
		}
		System.out.println("your array is here....");
		for(int i=0;i<size;i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
