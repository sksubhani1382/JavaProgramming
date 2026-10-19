package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindFirstEvenNumberInList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(5,7,9,6,3,7,8,5,2));
		
		Optional<Integer>res=list.stream()
							 .filter(n->n%2==0)
							 .findFirst();
		System.out.println("First Even number in list: "+res.orElse(-1));
	}
}
