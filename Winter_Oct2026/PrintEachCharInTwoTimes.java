package com.Winter_Oct2026;

import java.util.Scanner;

public class PrintEachCharInTwoTimes {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			System.out.print(ch+""+ch);
			
			if(i<str.length())
			{
				System.out.print(" ");
			}
		}
	}
}
