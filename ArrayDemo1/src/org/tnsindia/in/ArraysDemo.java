package org.tnsindia.in;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		 int[] arr= {89,45,78,23,99,112,234,567,889,34,67,85,24,667,2,4,77,87765,23,6};
		 
		 Arrays.sort(arr);
		 for(int i:arr)

	{
			 System.out.println(i+ "  ");
	}
System.out.println("Length of Array is="+arr.length);
}
}