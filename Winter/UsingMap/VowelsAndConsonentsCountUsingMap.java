package com.Winter.UsingMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class VowelsAndConsonentsCountUsingMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str=sc.next();
		
		Map<Character,Integer>m=new LinkedHashMap<Character, Integer>();
		
		for(char ch:str.toCharArray())
		{
			m.put(ch,m.getOrDefault(ch,0)+1);
		}
		System.out.println(m);
		
		int vcount=0;
		int ccount=0;
		for(Map.Entry<Character,Integer>e:m.entrySet())
		{
			if(e.getKey()=='a' || e.getKey()=='e' || e.getKey()=='i' || e.getKey()=='o'
					|| e.getKey()=='u')
			{
				vcount++;
			}
			else
			{
				ccount++;
			}
		}
		System.out.println("Vowels count: "+vcount);
		System.out.println("Consonents count: "+ccount);
	}
}
