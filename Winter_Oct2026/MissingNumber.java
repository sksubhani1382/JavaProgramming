package com.Winter_Oct2026;

public class MissingNumber {

	public static void main(String[] args) {
		int arr[]= {1,2,4,5,6};
		
		int n=arr.length+1;
		int totsum=n*(n+1)/2;
		int actsum=0;
		for(int i=0;i<arr.length;i++)
		{
			actsum+=arr[i];
		}
		int missnum=totsum-actsum;
		System.out.println("Missing number is: "+missnum);
	}
}
