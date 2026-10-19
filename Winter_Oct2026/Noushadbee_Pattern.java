package com.Winter_Oct2026;

import java.util.Scanner;

public class Noushadbee_Pattern {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter the Array size: ");
		 int n=sc.nextInt();
		 
		 //N
		 for(int i=0;i<n;i++)
		 {
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
			 System.out.print(" ");
		 
		 
		 //o
			 for(int j=0;j<n;j++)
			 {
				 if((i==0 && j>0 && j<(n-1))|| (j==0 && i>0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1))
						 || (j==(n-1) && i>0 && i<(n-1)))
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
			 
			 //u
			 for(int j=0;j<n;j++)
			 {
				 if((j==0 && i<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) || (j==(n-1) && i<(n-1)))
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
			 
			 //s
			 for(int j=0;j<n;j++)
			 {
				 if((i==0 && j>0 && j<(n-1)) || (j==0 && i>0 && i<(n-1)/2) || (i==(n-1)/2 && j>0 && j<(n-1))
						 || (j==(n-1) && i>(n-1)/2) && i<(n-1) || (i==(n-1) && j>0 && (j<(n-1))))
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
		 
			 //H
			 for(int j=0;j<n;j++)
			 {
				 if(j==0 || j==(n-1) || i==(n-1)/2) 
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
			 
			 //A
			 for(int j=0;j<n;j++)
			 {
				 if((i==0 && j>0 && j<(n-1)) || (j==0 && i>0) || (j==(n-1) && i>0) || i==(n-1)/2)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
			 
			 //D
			 for(int j=0;j<n;j++)
			 {
				 if(j==0 || (i==0 && j>0 && j<(n-1)) || (i==(n-1) && j>0 && j<(n-1)) || (j==(n-1) && i>0 && i<(n-1)))
				 {
					 System.out.print("*");
				 }
				 else 
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print("   ");
			 
			 //B
			 for(int j=0;j<n;j++)
			 {
				 if(j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (i==(n-1) && j<(n-1))
						 || (j==(n-1) && i>0 && i<(n-1)/2) || (j==(n-1) && i>(n-1)/2 && i<(n-1)) )
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");
				 }
			 }
			 System.out.print(" ");
			 
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
			 System.out.println(" ");
		 } 
	}
}
