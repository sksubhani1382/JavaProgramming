package com.PatternProgramming.Intro;
import java.util.Scanner;
public class MASTANVALI {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		//M
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==0 || j==(n-1) || (i==j && i<=(n-1)/2) ||(i+j==(n-1) && i<=(n-1)/2))
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
				if((i>0 && j==0) || (j==(n-1) && i>0) || i==(n-1)/2 || (i==0 && j<(n-1) && j>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//S
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<(n-1)) || (i==(n-1)/2 && j>0 && j<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) ||
						(j==0 && i<(n-1)/2 &&i>0) || (j==(n-1) && i>(n-1)/2 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print(" ");
			
			//T
			for(int j=0;j<n;j++)
			{
				if(i==0 || j==(n-1)/2)
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
				if((i>0 && j==0) || (j==(n-1) && i>0) || i==(n-1)/2 || (i==0 && j<(n-1) && j>0))
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
				if(j==0 || i==j || j==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			System.out.print("  ");
			
			//V
			for(int j=0;j<n;j++)
			{
				if((j==0 && i<(n-1)) || (j==(n-1) && i<(n-1)) || (i==(n-1) && j==(n-1)/2))
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
				if((i>0 && j==0) || (j==(n-1) && i>0) || i==(n-1)/2 || (i==0 && j<(n-1) && j>0))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//L
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==(n-1))
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
				if(i==0 || i==(n-1) || j==(n-1)/2)
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
