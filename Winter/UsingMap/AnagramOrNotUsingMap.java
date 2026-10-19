package com.Winter.UsingMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramOrNotUsingMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String1: ");
		String s1=sc.next();
		System.out.println("Enter the String2: ");
		String s2=sc.next();
		
		if(s1.length()!=s2.length())
		{
			System.out.println("Not Anagram!!!");
			return;
		}
		
		Map<Character, Integer>m=new HashMap<Character, Integer>();
		
		for(char ch:s1.toCharArray())
		{
			m.put(ch,m.getOrDefault(ch,0)+1);
		}
		for(char ch1:s2.toCharArray())
		{
			m.put(ch1, m.getOrDefault(ch1,0)-1);
			
			if(m.get(ch1)<0)
			{
				System.out.println("Not Anagram!!");
				return;
			}
		}
		System.out.println("Anagram!!!!");
	}
}
