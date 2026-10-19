package com.Winter_Oct2026;

import java.util.Scanner;

public class WithoutUsingThirdVariableswapTwoStrings {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first string: ");
		String s1=sc.next();
		System.out.println("Enter the second number: ");
		String s2=sc.next();
		
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		
		System.out.println("After swap two strings is: "+s1+" "+s2);
	}
}
