package com.Winter.UsingMap;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class EverestIMSQustion {

	public static void main(String[] args) {
		
		Map<Integer,String>m1=new HashMap<Integer, String>();
		m1.put(20, "ram");
		m1.put(30, "sita");
		m1.put(80, "hari");
		m1.put(50, "krishna");
		
		System.out.println(m1);
		int max=Integer.MIN_VALUE;
		String name="";
		for(Map.Entry<Integer, String>m2:m1.entrySet())
		{
			if(m2.getKey()>max)
			{
				max=m2.getKey();
				name=m2.getValue();
			}
		}
		System.out.println("Max marks and student name: "+max+" "+name);
	}
}
