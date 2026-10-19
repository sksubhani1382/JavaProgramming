package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DescendingOrderInList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(10,7,66,55,48,33,24,15));
		
		List<Integer>res=list.stream()
							 .sorted((a,b)->b-a)
							 .collect(Collectors.toList());
		System.out.print(res+" ");
	}
}
