package com.PatternProgramming.Intro;

import java.util.Scanner;

public class SubhaniNAme {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n=sc.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if( (i==0 && j>0 && j<(n-1)) || (i==(n-1)/2 && j>0 && j<n-1) || (i==(n-1) && j>0 && j<(n-1)) 
						|| (j==0 && i>0 && i<(n-1)/2) || (j==(n-1) && i>(n-1)/2 && i<(n-1)) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}			
			}
			System.out.print("  ");
		
			//U
			for(int j=0;j<n;j++)
			{
				if( (j==0 && i<(n-1)) || (j==(n-1) && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//B
			for(int j=0;j<n;j++)
			{
				if( j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (i==(n-1) && j<(n-1)) 
						|| (j==(n-1) && i>0 && i<(n-1)/2) || (j==(n-1) && i>(n-1)/2 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			//H
			for(int j=0;j<n;j++)
			{
				if( j==0 || i==(n-1)/2 || j==(n-1) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//A
			for(int j=0;j<n;j++)
			{
				if( (i==0 && j>0 && j<(n-1)) || (i==(n-1)/2) || (j==0 && i>0) || (j==(n-1) && i>0) )
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//N
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || i==j)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//I
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2 || i==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println("  ");
			
		}
	}
}
