package com.Winter_Oct2026;

import java.util.Scanner;

public class TargetedValueSumIndex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Target value: ");
		int t=sc.nextInt();
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				if(sum==t)
				{
					System.out.println("Find Target value index is: "+i+" "+j);
				}
			}
			
		}
		
	}
}
