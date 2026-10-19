package com.Winter_Oct2026;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseLastNElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println("Enter the how many NReverse Elements");
		int n=sc.nextInt();
		
		int s=arr.length-(n+1);
		int e=arr.length-1;
		for(int i=0;i<(n+1)/2;i++)
		{
			int temp=arr[s+i];
			arr[s+i]=arr[e-i];
			arr[e-i]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}
}
