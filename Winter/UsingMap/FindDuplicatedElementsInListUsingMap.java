package com.Winter.UsingMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FindDuplicatedElementsInListUsingMap {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>list=new ArrayList<Integer>();
		System.out.println("Enter size of list: ");
		int n=sc.nextInt();
		System.out.println("Enter the values in list: ");
		for(int i=0;i<n;i++)
		{
			int val=sc.nextInt();
			list.add(val);
		}
		System.out.println(list);
		Map<Integer, Integer>m=new HashMap<Integer, Integer>();
		
		for(int num:list)
		{
			m.put(num, m.getOrDefault(num, 0)+1);
		}
		System.out.println(m);
		
		
		boolean found=false;
		for(Map.Entry<Integer, Integer>m1:m.entrySet())
		{
			if(m1.getValue()>1)
			{
				System.out.print(m1.getKey()+" ");
				found=true;
			
			}
		}
		if(!found)
		{
			System.out.println("There is no duplicated values in list!!!");
		}
		
	}
}
