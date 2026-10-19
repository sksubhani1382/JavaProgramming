package com.Winter_Oct2026;

import java.util.Scanner;

public class TDimondPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int s=1;s<=n-i;s++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for(int i=2;i<=n;i++)
		{
			for(int s=1;s<i;s++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
