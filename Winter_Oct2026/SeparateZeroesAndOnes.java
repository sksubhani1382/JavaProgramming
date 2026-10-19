package com.Winter_Oct2026;

import java.util.Scanner;

public class SeparateZeroesAndOnes {

	public static void main(String[] args) {
		
		int arr[]= {1,1,1,0,1,0,1,0,1};
		
		System.out.println("Seperated Zeros and Ones: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
		for(int j=0;j<arr.length;j++)
		{
			if(arr[j]==1)
			{
				System.out.print(arr[j]+" ");
			}
		}
	}
}
