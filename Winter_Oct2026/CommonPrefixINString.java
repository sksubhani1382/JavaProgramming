package com.Winter_Oct2026;

import java.util.Scanner;

public class CommonPrefixINString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many string u want: ");
		int n=sc.nextInt();
		String str[]=new String[n];
		System.out.println("Enter the Strings: ");
		for(int i=0;i<n;i++)
		{
			str[i]=sc.next();
		}
		
		String prefix=str[0];
		for(int i=0;i<str.length;i++)
		{
			while(!str[i].startsWith(prefix))
			{
				prefix=prefix.substring(0,prefix.length()-1);
				
				if(prefix.isEmpty())
				{
					break;
				}
			}
		}
		if(prefix.isEmpty())
		{
			System.out.println("There is no common prefix!!!");
		}
		else
		{
			System.out.println("Common prefix is: "+prefix);
		}
	}
}
