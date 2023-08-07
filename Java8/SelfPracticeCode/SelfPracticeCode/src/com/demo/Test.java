package com.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
	public static void main(String[] args) {
		String ind="javailikejava";
		Map<Character, Integer> map=new HashMap<>();
		char[] array = ind.toCharArray();
		for (char c : array) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
			
		}
		for (Entry<Character, Integer> entry:map.entrySet()) {
//			if(entry.getValue()>1) {
//				System.out.println(entry.getKey()+" "+entry.getValue());
//			}
			System.out.println(entry.getKey()+" is repeated "+entry.getValue()+" times.");
			
		}
		
		Map<Character, Long> map2 = ind.chars().mapToObj(c->(char)c)
								.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(map2);
		map2.forEach((k,v)->{
			if(v>1) {
				System.out.println(k+" is repeated "+v +" times");
				
			}
		}); 
		
		List<Employee> emp=new LinkedList<>();
		emp.add(new Employee(22, "Shubham", 25000.0));
		emp.add(new Employee(33, "Anjinkya", 30000.0));
		emp.add(new Employee(28, "Vishal", 50000.0));
		emp.add(new Employee(35, "Lavish", 45000.0));
		
		System.out.println(emp);
		
		List<Employee> list2 = emp.stream().map(e->{
			if(e.getAge()>30) {
				e.setSalary(e.getSalary()*1.10);
				//e.setSalary(e.getSalary()+e.getSalary()*0.1));
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(list2);
		
//========================================================================================
		
		Optional<Employee> first = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
				.reversed())
				.skip(1)
				.findFirst();
		System.out.println(first.get().getSalary());
		
		
		
		 Stream<Employee> sorted = emp.stream().sorted(Comparator.comparingDouble(Employee::getSalary)
				.reversed());
		 
		 System.out.println(sorted.collect(Collectors.toList()));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
//		List<Integer> asList = Arrays.asList(1,2,3,3,2,4,4,5,6,7,8,22,11,44);
//		List<Integer> list2 = asList.stream().distinct().collect(Collectors.toList());
//		System.out.println(list2);
//		
//		List<Integer> collect2 = asList.stream().filter(e->e%2==0).collect(Collectors.toList());
//		System.out.println(collect2);
//		
//		asList.stream().filter(e->e%2==0).forEach(System.out::println);
		
		List<String> dup=new ArrayList<>();
		List<String> dup1=new ArrayList<>();
		String s1="the second second is first but first second was first";
		String[] strr = s1.split(" ");
		for (String string : strr) {

			if(!dup1.contains(string)) {
				dup1.add(string);
			}
		
		}
		System.out.println(dup1);
		System.out.println(dup);
		
		List<String> collect2 = dup.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
//===========================================================================================
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		String a = new String("abc");

		String b = "abc";
		System.out.println(a==b);
		System.out.println(a.equals(b));
		
		
		List<String> list=new ArrayList<>();
		String s="test test new string";
		
		String[] split = s.split(" ");
		
		for (String string : split) {
			list.add(string);
		}
		List<String> collect = list.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		for (int i = 0; i < split.length; i++) {
			//if(!split[i].equals(split[i+1]))
				if(split[i]!=split[i+1])
			{
				
				System.out.println(split[i+2]);
				break;
			}
			
		}
	}

}
