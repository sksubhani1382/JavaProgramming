package com.Winter_Oct2026;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseFirstNElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,6,7,8};
		System.out.println("Enter the how many Elements reverse: ");
		int n=sc.nextInt();
		for(int i=0;i<(n+1)/2;i++)
		{
			int temp=arr[i];
			arr[i]=arr[n-i];
			arr[n-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
