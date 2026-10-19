package com.Winter_Oct2026;

import java.util.Scanner;

public class StringIsPalindromOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next().toLowerCase();
		String s="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s+=str.charAt(i);
		}
		if(s.equals(str))
		{
			System.out.println("Palindrom");
		}
		else
		{
			System.out.println("Not Palindrom");
		}
	}
}
