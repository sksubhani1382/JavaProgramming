package com.Winter_Oct2026;

import java.util.Scanner;

public class RowWithMaxOneCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Row: ");
		int r=sc.nextInt();
		System.out.println("Enter the Column: ");
		int c=sc.nextInt();
		
		int arr[][]=new int[r][c];
		System.out.println("Enter the row and column values: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				arr[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.println("Display the array: ");
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		int rowmaxcount=0;
		int rowcount=0;
		
		for(int i=0;i<r;i++)
		{
			int count=0;
			for(int j=0;j<c;j++)
			{
				if(arr[i][j]==1)
				{
					count++;
				}
				if(count>rowmaxcount)
				{
					rowmaxcount=count;
					rowcount=i+1;
				}
			}
		}
		System.out.println("Maximum count in row is: "+rowcount+" row");
		
		
		
	}
}
