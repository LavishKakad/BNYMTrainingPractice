package com.exception;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestSalary {
	List<EmployeeMaxSalary> list=new ArrayList<>();
	public static void main(String[] args) {
		List<EmployeeMaxSalary> list=new ArrayList<>();
		list.add(new EmployeeMaxSalary(1, "abc", 4000.0));
		list.add(new EmployeeMaxSalary(2, "pqr", 8000.0));
		list.add(new EmployeeMaxSalary(3, "xyz", 10000.0));
		list.add(new EmployeeMaxSalary(4, "mno", 15000.0));
		System.out.println("Salary Before Incremented....!!");
		System.out.println(list);
		
		List<EmployeeMaxSalary> collect = list.stream().map(emp->
		{
			if(emp.getEid()>2) {
				emp.setSalary(emp.getSalary()+emp.getSalary()*0.1);
			}
			return emp;
		}).collect(Collectors.toList());
		System.out.println("Salary After Incremented....!!");
		System.out.println(collect);
		
		
		Optional<EmployeeMaxSalary> collect2 = 
				list.stream().sorted(Comparator.comparingDouble(EmployeeMaxSalary::getSalary).reversed()).skip(1).findFirst();
		System.out.println("Second Highest Salary Of Employee :-  "+collect2.get().getSalary());
	}
	

}
