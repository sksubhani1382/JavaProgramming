
package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintEvenNumbers {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(5,4,2,7,8,9));
		System.out.println(list);
		
		list.stream()
		.filter(n->n%2==0)
		.forEach(n->System.out.print(n+" "));
	}
}
