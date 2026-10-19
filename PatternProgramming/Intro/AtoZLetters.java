package com.PatternProgramming.Intro;
import java.util.Scanner;
public class AtoZLetters {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		int n=sc.nextInt();
		
		//C
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0) || (i==(n-1) && j>0) || (j==0 && i>0 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//D
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0 && j<(n-1)) || (i==(n-1) && j<(n-1)) || (j==(n-1) && i>0 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//E
			
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 || i==(n-1)/2 || i==(n-1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//F
			for(int j=0;j<n;j++)
			{
				if(j==0 || i==0 || i==(n-1)/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//G
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0 && j<(n-1)) || (j==0 && i>0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) 
						|| (i==(n-1)/2 && j>1 && j<(n-1)) || (j==(n-2) && i>1))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//J
			for(int j=0;j<n;j++)
			{
				if(j==(n-1)/2 || (i==0 && j<(n-1)/2) || ( j==0 && i>(n-1)/2 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//K
			for(int j=0;j<n;j++)
			{
				if(j==0 || (i==0 && j==(n-1))|| (j>0 && i==(n-1)/2 && j<(n-1)/2) || (i>0 && j==(n-1)/2 && i<(n-1)/2) || (i==(n-1) && j==(n-1))
						|| (i>(n-1)/2 && j==(n-1)/2 && i<(n-1)))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.print("  ");
			
			//p
			for(int j=0;j<n;j++)
			{
				if((i==0 && j>0) || j==0 || i==(n-1)/2 || (j==(n-1) && i<(n-1)/2))
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
