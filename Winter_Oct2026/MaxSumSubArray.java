package com.Winter_Oct2026;

import java.util.Scanner;

public class MaxSumSubArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Array size: ");
		int s=sc.nextInt();
		int arr[]=new int[s];
		System.out.println("Enter the array Elements: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int maxsum=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			int cursum=0;
			for(int j=i;j<arr.length;j++)
			{
				cursum+=arr[j];
				if(cursum>maxsum)
				{
					maxsum=cursum;
				}
			}
		}
		System.out.println("Maxsum subarray is: "+maxsum);
		
	}
}
