package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupOfNUmbersisEvenOrOdd {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(5,7,9,6,3,7,8,5,2));

		Map<Boolean, List<Integer>>res=list.stream()
								 .collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(res);
	}
}
