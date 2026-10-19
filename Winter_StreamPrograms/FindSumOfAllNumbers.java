package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSumOfAllNumbers {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(10,50,40));
		
		int res=list.stream()
					.mapToInt(Integer::intValue)
					.sum();
		System.out.println(res);
	}
}
