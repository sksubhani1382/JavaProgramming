package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverLIstOfNUmnbersToSquares {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(5,7,9,6,3,7,8,5,2));
		
		List<Integer>res=list.stream()
							.map(n->n*n)
							.collect(Collectors.toList());
		System.out.println(res);
	}
}
