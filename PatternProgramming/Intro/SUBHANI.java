package com.PatternProgramming.Intro;
import java.util.Scanner;

public class SUBHANI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            // First character (curved S)    
            for (int j = 0; j < n; j++) {
                if ((i==0 && j>0 && j<(n-1)) || ( j>0 && i==(n-1)/2 && j<(n-1)) || (j>0 && i==(n-1) && j<(n-1)) ||
                		(j==0 && i>0 && i<(n-1)/2 ) || (j==(n-1) && i>(n-1)/2) && i<(n-1)) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }     //i == 0 || i == (n - 1) || i == (n - 1) / 2 ||(j == 0 && i < (n - 1) / 2) ||  (j == (n - 1) && i > (n - 1) / 2)

            System.out.print("  "); // spacing between letters

            // Second character (like 'U')
            for (int j = 0; j < n; j++) {
                if ((j==0 && i<(n-1)) || (j==(n-1) && i<(n-1)) || (j>0 && i==(n-1) && j<(n-1))) 
                {
                    System.out.print("*");
                } 
                else 
                {
                    System.out.print(" ");
                }
            }  //j == 0 || i == (n - 1) || j == (n - 1)

            System.out.print("  "); 
            
            //B
            for(int j=0;j<n;j++)
            {
                if(j==0 || (i==0 && j<(n-1)) || (i==(n-1)/2 && j<(n-1)) || (i==(n-1) && j<(n-1)) ||
                		(j==(n-1) && i<(n-1)/2 && i>0) || (i>(n-1)/2 && j==(n-1) && i<(n-1)))
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }   //j==0|| i==0|| j==(n-1) || i==(n-1) || (i==(n-1)/2)
            
            System.out.print("  ");
            //H
            for(int j=0;j<n;j++)
            {
            	if(j==0 || i==(n-1)/2 || j==(n-1))
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
        		if((i==(n-1)/2) || (j==0 && i>0) || (j==(n-1) && i>0) || (i==0 && j>0 && j<(n-1)))
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}  //i==0 || j==0 || j==(n-1) || i==(n-1)/2
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
        		if(i==0 || i==(n-1) || j==(n-1)/2 )
        		{
        			System.out.print("*");
        		}
        		else
        		{
        			System.out.print(" ");
        		}
        	}
        	System.out.println();	
        }
        sc.close();
    }
}



