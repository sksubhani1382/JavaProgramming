package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverNamesToUppercase {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>(Arrays.asList("ravi","ram","raj"));
		
		List<String>res=list.stream()
							.map(String::toUpperCase)
							.collect(Collectors.toList());
		
		System.out.print(res+" ");
	}
}
