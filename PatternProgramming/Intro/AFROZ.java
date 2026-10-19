package com.PatternProgramming.Intro;
import java.util.Scanner;
public class AFROZ {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		//A
		for (int i = 0; i < n; i++) 
		{ 
            for (int j = 0; j < n; j++) 
			{
				if((j==0 && i>0)|| (j==(n-1) && i>0) || i==(n-1)/2 || (i==0 && j>0 && j<(n-1)) )
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
            
            //R
            for(int j=0;j<n;j++)
            {
            	if(j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (j==(n-1) && i<(n-1)/2 && i>0) ||
            			(j==(n-1)/2 && i>(n-1)/2 && i<(n-1)) || (j==(n-1) && i==(n-1) ))
            	{
            		System.out.print("*");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            System.out.print("  ");
            
            //O
            for(int j=0;j<n;j++)
            {
            	if((i==0 && j>0 && j<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) ||
            			(j==0 && i>0 && i<(n-1)) || (j==(n-1) && i>0 && i<(n-1)))
            	{
            		System.out.print("*");
            	}
            	else
            	{
            		System.out.print(" ");
            	}
            }
            System.out.print("  ");
            
            //Z
            for(int j=0;j<n;j++)
            {
            	if(i==0 || i+j==(n-1) || i==(n-1))
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
