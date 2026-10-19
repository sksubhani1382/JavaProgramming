package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesInList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(10,45,10,55,77,85,10,55,46,77));
		
		List<Integer>res=list.stream()
							 .distinct()
							 .collect(Collectors.toList());
		System.out.println(res);
	}
}
