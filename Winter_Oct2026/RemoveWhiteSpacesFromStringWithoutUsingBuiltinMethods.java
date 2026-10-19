package com.Winter_Oct2026;

import java.util.Scanner;

public class RemoveWhiteSpacesFromStringWithoutUsingBuiltinMethods {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		//String str=" a b  c d e ";
		String str=sc.nextLine();
		String res="";
		char ch[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			if(ch[i]!=' ')
			{
				res+=ch[i];
			}
		}
		System.out.println(res);
	}
}
