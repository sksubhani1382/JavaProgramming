package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CheckAnyNumberIsGraterThan80 {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(50,62,40,81,33));

		boolean res=list.stream()
						.anyMatch(n->n>80);
		System.out.println(res);
	}
}

