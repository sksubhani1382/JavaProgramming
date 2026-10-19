package com.Winter_Oct2026;

import java.util.Scanner;

public class AllZerosEnding {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int pos=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[pos]=arr[i];
				pos++;
			}
		}
		for(int i=pos;i<arr.length;i++)
		{
			arr[i]=0;
		}
		
		System.out.println("Ending zeros is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
