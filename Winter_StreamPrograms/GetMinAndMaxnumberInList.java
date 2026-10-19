package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetMinAndMaxnumberInList {

	public static void main(String[] args) {
		List<Integer>list=new ArrayList<Integer>(Arrays.asList(50,44,90,77,86,55));
		
		int min=list.stream()
					.mapToInt(Integer::intValue)
					.min()
					.getAsInt();
		System.out.println("Minimum value is: "+min);
		
		int max=list.stream()
					.mapToInt(Integer::intValue)
					.max()
					.getAsInt();
		System.out.println("Maximum value is: "+max);
	}
}
