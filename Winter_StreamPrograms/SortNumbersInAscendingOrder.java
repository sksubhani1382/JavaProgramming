package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumbersInAscendingOrder {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(10,55,4,6,88,2,33,44));
		
		List<Integer>res=list.stream()
							 .sorted()
							 .collect(Collectors.toList());
		
		System.out.print(res+" ");
	}
}
