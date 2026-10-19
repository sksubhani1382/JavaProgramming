package com.Winter.UsingMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountEachCharInString_a3b2c1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		
		Map<Character, Integer>m=new HashMap<Character, Integer>();
		
		for(char ch:str.toCharArray())
		{
			m.put(ch, m.getOrDefault(ch,0)+1);
		}
		StringBuilder sb=new StringBuilder();
		for(Map.Entry<Character, Integer>e:m.entrySet())
		{
			sb.append(e.getKey()).append(e.getValue());
			
		}
		System.out.println(sb);
	}
}
