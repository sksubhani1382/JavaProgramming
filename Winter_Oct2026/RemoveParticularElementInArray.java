package com.Winter_Oct2026;

import java.util.Scanner;
//LEET CODE PROGRAM
public class RemoveParticularElementInArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Removing value: ");
		int r=sc.nextInt();
		
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=r)
			{
				arr[k]=arr[i];
				k++;
			}
		}
		System.out.println("Remaining Elements are: ");
		for(int i=0;i<k;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
