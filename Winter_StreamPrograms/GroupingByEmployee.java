package com.Winter_StreamPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employe
{
	private int id;
	private String name;
	private String dept;
	private double salary;
	private String city;
	
	public Employe(int id,String name,String dept,double salary,String city)
	{
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.city=city;
	}
	
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public String getDept()
	{
		return dept;
	}
	public double getSalary()
	{
		return salary;
	}
	public String getCity()
	{
		return city;
	}
	@Override
	public String toString()
	{
		return name +"("+salary+")";
	}
	
}

public class GroupingByEmployee {

	public static void main(String[] args) {
		
		List<Employe>list=Arrays.asList(
				new Employe(1, "Ravi", "IT", 60000, "Bengaluru"),
	            new Employe(2, "Anu", "HR", 45000, "Chennai"),
	            new Employe(3, "Kiran", "IT", 75000, "Hyderabad"),
	            new Employe(4, "Divya", "HR", 50000, "Bengaluru"),
	            new Employe(5, "Manoj", "Sales", 40000, "Chennai"),
	            new Employe(6, "Sneha", "IT", 90000, "Bengaluru")
				);
		
		
	/*
	 	//1. Group employees by department
	 	Map<String, List<Employe>>res=list.stream()						
									.collect(Collectors.groupingBy(Employe::getDept));
		System.out.println(res);
	*/
		
	/*	
		//2. Count employees in each department
		Map<String, Long>res=list.stream()
							.collect(Collectors.groupingBy(Employe::getDept,
															Collectors.counting()));
		System.out.println(res);
	*/
		
	/*	
		//3. Find total salary by department
		Map<String, Double>res=list.stream()
								.collect(Collectors.groupingBy(Employe::getDept,
										Collectors.summingDouble(Employe::getSalary)));
		System.out.println(res);
	*/
		
	/*
		//4. Find average salary by department
			Map<String, Double>res=list.stream()
											.collect(Collectors.groupingBy(Employe::getDept,
													Collectors.averagingDouble(Employe::getSalary)));
		System.out.println(res);
	*/
		
	/*	
		//5. Find highest-paid employee in each department
			Map<String, Optional<Employe>>res=list.stream()
									.collect(Collectors.groupingBy(Employe::getDept,
							Collectors.maxBy(Comparator.comparingDouble(Employe::getSalary))
							));
			System.out.println(res);
	*/
		
	
	/*
		//6. Find employee names only, grouped by department
			Map<String, List<String>>res=list.stream()
										.collect(Collectors.groupingBy(Employe::getDept,
												Collectors.mapping(Employe::getName,Collectors.toList())));
			System.out.println(res);
	*/
		
	/*
		//7. Find second-highest salary
			Optional<Double>res=list.stream()
							.map(Employe::getSalary)
							.distinct()
							.sorted(Comparator.reverseOrder())
							.skip(1)
							.findFirst();
			System.out.println(res.orElse(null));
	*/
		
	/*
		//9. Find highest-paid employee in each department using a Map
			Map<String, Employe>res=list.stream()
									.collect(Collectors.toMap(Employe::getDept,e->e,
											(oldEmploye,newEmploye)->newEmploye.getSalary() > oldEmploye.getSalary()
											?newEmploye:oldEmploye));
			System.out.println(res);
	*/
		
	/*	
		//13. Find duplicate names
			List<String>names=Arrays.asList("ravi","ram","ravi","anu","anu","krishna","lapi");
			
			List<String>dup=names.stream()
								.collect(Collectors.groupingBy(name->name,Collectors.counting()))
								.entrySet()
								.stream() 
								.filter(entry->entry.getValue()>1)
								.map(Map.Entry::getKey)
								.collect(Collectors.toList());
			System.out.println(dup);
	*/
		
		//14. Find character frequency in a string
			String word="programming";
			Map<Character,Long>freq=word.chars()
					.mapToObj(c->(char) c)
					.collect(Collectors.groupingBy(c->c,Collectors.counting()));
			System.out.println(freq);
					
	}
}
