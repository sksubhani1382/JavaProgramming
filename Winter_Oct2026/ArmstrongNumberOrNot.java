package com.Winter_Oct2026;

import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		
		int dum=n;
		int len=String.valueOf(n).length();
		int res=0;
		
		while(n>0)
		{
			int rem=n%10;
			res+=Math.pow(rem,len);
			n/=10;
		}
		if(dum==res)
		{
			System.out.println("Armstrong NUmber!!!");
		}
		else
		{
			System.out.println("Not Armstrong!!!");
		}
	}
}
