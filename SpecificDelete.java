package com.datastructure;

import java.util.Scanner;

public class SpecificDelete {

	public static void main(String[] args) 
	{
		SpecificDelete obj = new SpecificDelete();
		Scanner scanner = new Scanner(System.in);
		String[] arry = new String[5];
		arry[0] = "zero";
		arry[1] = "one";
		arry[2] = "two";
		arry[3] = "three";
		arry[4] = "four";
		
		int n = arry.length;
		System.out.println("enter a index value:");
		int index = scanner.nextInt();
		
		obj.delete(arry, index, n);
		obj.printArray(arry, n);
		

	}
	
	void delete(String[] arry, int index, int n)
	{
		int i;
		for(i=index; i<n-1; i++)
			arry[i] = arry[i+1];
		arry[i] = null;
		
	}
	
	void printArray(String[] arry, int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arry[i]+ " ");
	}

}
