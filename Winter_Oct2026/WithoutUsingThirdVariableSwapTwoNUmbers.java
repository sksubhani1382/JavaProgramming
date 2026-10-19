package com.Winter_Oct2026;

import java.util.Scanner;

public class WithoutUsingThirdVariableSwapTwoNUmbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number: ");
		int a=sc.nextInt();
		System.out.println("Enter the Second number: ");
		int b=sc.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After swap Two numbers is: "+"a= "+a+" "+"b= "+b);
	}
}
