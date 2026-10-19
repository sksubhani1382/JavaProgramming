package com.Winter_Oct2026;

import java.util.Scanner;

public class FibnocciNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.print("Fibnocci number is: "+n1+" "+n2+" ");
		for(int i=2;i<n;i++)
		{
			int n3=n1+n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		}
	}
}
