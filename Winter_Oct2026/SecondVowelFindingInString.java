package com.Winter_Oct2026;

import java.util.Scanner;

public class SecondVowelFindingInString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' 
					|| str.charAt(i)=='u')
			{
				count++;
			}
			if(count==2)
			{
				System.out.println(str.charAt(i));
				break;
			}
		}
	}
}
