package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StoreEvenNumbersInNewList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(5,7,4,8,6,9,3));
		
		List<Integer>res=list.stream()
							 .filter(n->n%2==0)
							 .collect(Collectors.toList());
		System.out.print(res+" ");
		
	}
}
