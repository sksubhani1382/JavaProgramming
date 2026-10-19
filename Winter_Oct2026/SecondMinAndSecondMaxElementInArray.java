package com.Winter_Oct2026;

import java.util.Arrays;

public class SecondMinAndSecondMaxElementInArray {

	public static void main(String[] args) {
		int arr[]= {5,7,55,77,44,22,30};
		Arrays.sort(arr);
		int max=arr[arr.length-1];
		int min=arr[0];
		int smax=0;
		int smin=0;
		
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]<max)
			{
				smax=arr[i];
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>min)
			{
				smin=arr[i];
				break;
			}
		}
		System.out.println("Second maximum: "+smax);
		System.out.println("Second minimum: "+smin);
		
	}
}
