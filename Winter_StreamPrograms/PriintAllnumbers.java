package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class PriintAllnumbers {

	public static void main(String[] args) {
		
		List<Integer>list=new ArrayList<Integer>();
		Collections.addAll(list, 10,20,40,50,70);
		
		list.stream()
			.forEach(n->System.out.print(n+" "));
	}
}
