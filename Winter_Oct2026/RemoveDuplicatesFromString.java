package com.Winter_Oct2026;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str=sc.next();
		
		Map<Character, Integer>m=new LinkedHashMap<Character, Integer>();
		for(Character ch:str.toCharArray())
		{
			m.put(ch, m.getOrDefault(ch,0)+1);
		}
		System.out.println(m);
		for(Map.Entry<Character, Integer>e:m.entrySet())
		{
			if(e.getValue()<=1)
			{
				System.out.print(e.getKey());
			}
		}
		
	}
}
