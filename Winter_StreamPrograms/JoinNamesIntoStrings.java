package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinNamesIntoStrings {

	public static void main(String[] args) {
		List<String>list=new ArrayList<String>(Arrays.asList("shaik","subhani","king"));
		
		String res=list.stream()
						.collect(Collectors.joining(" "));
		System.out.println(res);
	}
}
