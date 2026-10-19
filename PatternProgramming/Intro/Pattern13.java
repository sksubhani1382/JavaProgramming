package com.PatternProgramming.Intro;
import java.util.Scanner;
public class Pattern13 {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		
		
		for(int i=1;i<=n;i++)
		{
			
		
			for(int j=1;j<=m;j++)
			{
				
				if((i==1 && j==3) || (i==2 && j==2) || (i==2 && j==4))
				{
					System.out.print("*");
				}

				else if(i==3 || i==5 || i==n || (i==6 && j==2) || (i==6 && j==4) || (i==4 && j==1) || (i==4 && j==5) || (i==6 && j==1) || (i==6 && j==5))
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

	}

}



/*

for(int k=1;k<=n;k++)
{
	for(int m=1;m<=n;m++)
	{
		if((k==1 && m==3) || (k==2 && m==2) || (k==2 && m==4))
		{
			System.out.print("*");
		}
		else {
			System.out.print(" ");
		}
	}
	System.out.println();
}

*/
