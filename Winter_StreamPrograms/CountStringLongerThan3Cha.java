package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountStringLongerThan3Cha {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>(Arrays.asList("ravi","ram","raju","cal","as"));
		
		long res=list.stream()	
							.filter(name->name.length()>3)
							.count();
		
		System.out.print(res+" ");
	}
}
