package com.datastructure;

import java.util.Scanner;

public class Deleting {

	public static void main(String[] args) 
	{
		Deleting obj = new Deleting();
		Scanner scanner = new Scanner(System.in);
		String[] arry = new String[5];
		arry[0] = "zero";
		arry[1] = "one";
		arry[2] = "two";
		arry[3] = "three";
		arry[4] = "four";
		
		int n = arry.length;
		
		obj.deleteFirst(arry, n);
		obj.printArray(arry, n);
	
	}
	void deleteFirst(String[] arry, int n)
	{
		int i;
		for(i=0; i<n-1; i++)
		{
			arry[i] = arry[i+1];
		}
		arry[i] = null;
	}
	void printArray(String[] arry, int n)
	{
		for(int i=0; i<n; i++)
		{
			System.out.print(arry[i]+ " ");
		}
	}

}
