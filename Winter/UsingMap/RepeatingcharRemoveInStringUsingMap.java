package com.Winter.UsingMap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RepeatingcharRemoveInStringUsingMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		
		Map<Character, Integer>m=new LinkedHashMap<Character, Integer>();
		
		for(char ch:str.toCharArray())
		{
			m.put(ch, m.getOrDefault(ch,0)+1);
		}
		System.out.println(m);
		System.out.println("Unique char in string: ");
		for(Map.Entry<Character, Integer>e:m.entrySet())
		{
			if(e.getValue()<=1)
			{
				System.out.print(e.getKey());
			}
		}
		
	}
}
