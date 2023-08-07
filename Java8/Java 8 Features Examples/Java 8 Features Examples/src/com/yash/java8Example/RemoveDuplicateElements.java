package com.yash.java8Example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		List<String> emp=new LinkedList<>();
		List<String> emp1=new LinkedList<>();
		List<Integer> list = Arrays.asList(1,2,3,4,5,3,2,4,5,5,2);
		List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
		System.out.println(list2);
		list.stream().filter(e->e%2==0).forEach(System.out::println);
		List<Integer> collect = list.stream().filter(e->e%2==0).collect(Collectors.toList());
		System.out.println(collect);
		
		emp.add("shubham");
		emp.add("Pankaj");
		emp.add("Sonu");
		emp.add("Suraj");
		emp.add("Ajay");
		emp.add("Pankaj");
		emp.add("Sonu");
		System.out.println(emp);
		for (String str : emp) {
			if(!emp1.contains(str)) {
				emp1.add(str);
			}
			
		}
		System.out.println(emp1);
		List<String> collect2 = emp1.stream().distinct().collect(Collectors.toList());
		System.out.println(collect2);
		
		String a="apple is my favorite friut";
		LinkedHashSet<Character> ss=new LinkedHashSet<>();
		char[] charArray = a.toCharArray();
		String[] split = a.split(" ");
		
		System.out.println(split);
		for (int i = 0; i < a.length(); i++) {
			
			char at = a.charAt(i);
			ss.add(at);
			
			
		}
		System.out.println(ss);
		
	}
	

}
