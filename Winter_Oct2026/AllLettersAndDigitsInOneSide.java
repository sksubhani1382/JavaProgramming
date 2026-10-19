package com.Winter_Oct2026;

import java.util.Scanner;

public class AllLettersAndDigitsInOneSide {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		
		StringBuilder let=new StringBuilder();
		StringBuilder digi=new StringBuilder();
		
		for(Character ch:str.toCharArray())
		{
			if(Character.isLetter(ch))
			{
				let.append(ch);
			}
			else if(Character.isDigit(ch))
			{
				digi.append(ch);
			}
		}
		System.out.println("Letters and Sigits is: "+let+digi+" ");
	}
}
