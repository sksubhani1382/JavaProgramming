package com.Winter_Oct2026;

import java.util.Scanner;

public class TargetedValuePrintIndexes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter the Array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the Targeted value: ");
		int t=sc.nextInt();
		boolean found=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				int sum=arr[i]+arr[j];
				
				if(t==sum)
				{
					System.out.println("Targeted value is found index is: "+i+" "+j);
					found=true;
					
				}
			}
		}
		if(!found)
		{
			System.out.println("Try Again...targeted value is not found in any index!!!");
		}
	}
}
