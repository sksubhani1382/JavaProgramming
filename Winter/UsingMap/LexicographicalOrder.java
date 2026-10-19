package com.Winter.UsingMap;

import java.util.Scanner;
import java.util.TreeSet;

public class LexicographicalOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		System.out.println("Enter the string length you want: ");
		int n=sc.nextInt();
		
		TreeSet<String>substr=new TreeSet<String>();
		for(int i=0;i<str.length()-n;i++)
		{
			substr.add(str.substring(i,i+n));
		}
		String smal=substr.first();
		String larg=substr.last();
		System.out.println("Smallest String is: "+smal);
		System.out.println("Largest String is: "+larg);
		
		
	}
}
