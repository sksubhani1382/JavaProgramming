package com.Winter_Oct2026;

import java.util.Scanner;

public class FactorsOfNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int fact=1;
		for(int i=0;i<n;i++)
		{
			fact+=fact*i;
		}
		System.out.println(fact);
	}

}
