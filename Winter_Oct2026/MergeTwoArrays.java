package com.Winter_Oct2026;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoArrays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array1 size: ");
		int s1=sc.nextInt();
		int arr1[]=new int[s1];
		
		System.out.println("Enter the array1 elements: ");
		for(int i=0;i<s1;i++)
		{
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Enter the array2 size: ");
		int s2=sc.nextInt();
		int arr2[]=new int[s2];
		
		System.out.println("Enter the array2 Elements: ");
		for(int i=0;i<s2;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		int m[]=new int[s1+s2];
		int i=0,j=0,k=0;
		
		while(i<s1)
		{
			m[k++]=arr1[i++];
		}
		while(j<s2)
		{
			m[k++]=arr2[j++];
		}
		Arrays.sort(m);
		System.out.println("Merge array is: "+Arrays.toString(m));
	}
}
