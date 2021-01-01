package com.datastructure;

import java.util.Scanner;

public class Rotating 
{
	public static void main(String[] args)
	{
		Rotating obj = new Rotating();
		String[] arry = new String[5];
		arry[0] = "zero";
		arry[1] = "one";
		arry[2] = "two";
		arry[3] = "three";
		arry[4] = "four";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of rotation:");
		int k = scanner.nextInt();
		int n = arry.length;
		
		obj.leftrotate(arry, k, n);
		obj.printArray(arry, n);
		
		
	
	}
	public void leftrotate(String[] arry, int k, int n)
	{
		for(int i=0; i<k; i++)
		{
			rotatebyone(arry, n);
		}
	}
	void rotatebyone(String[] arry, int n)
	{
		int i;
		String temp = arry[0];
		for(i=0; i<n-1; i++)
			arry[i] = arry[i+1];
		arry[i] = temp;
		
	}
	
	void printArray(String[] arry, int n)
	{
		for(int i=0; i<n; i++)
			System.out.print(arry[i]+ " ");
	}
	
	

}
