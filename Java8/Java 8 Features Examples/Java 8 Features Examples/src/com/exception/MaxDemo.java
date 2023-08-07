package com.exception;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxDemo {
	public static void main(String[] args) {
		List<EmployeeMaxSalary> list=new LinkedList<>();
		EmployeeMaxSalary e=new EmployeeMaxSalary(11, "Shubham", 60000.0);
		EmployeeMaxSalary e1=new EmployeeMaxSalary(22, "Ankit", 46000.0);
		EmployeeMaxSalary e2=new EmployeeMaxSalary(33, "Gaju", 90000.0);
		EmployeeMaxSalary e3=new EmployeeMaxSalary(44, "Danny", 50000.0);
		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		System.out.println(list);
		
		long count = list.stream().filter(emp->emp.getEid()>11).count();
		System.out.println(count);
		
		List<EmployeeMaxSalary> collect = list.stream().filter(emp -> emp.getSalary()>50000).collect(Collectors.toList());
		System.out.println(collect);
		
		//Increment salary of employee whose eid>11
		
		List<EmployeeMaxSalary> collect2 = list.stream().map(emp->{
			if(emp.getEid()>11) {
				emp.setSalary(emp.getSalary()+emp.getSalary()*0.1);
			}
			return emp;
		}).collect(Collectors.toList());
		System.out.println(collect2);
		
		//Print second highest salary 
		
		Optional<EmployeeMaxSalary> findFirst = list.stream()
													.sorted(Comparator.comparingDouble(EmployeeMaxSalary::getSalary)
													.reversed())
													.skip(1)
													.findFirst();
		
		System.out.println(findFirst.get());
		
		Stream<EmployeeMaxSalary> find = list.stream()
				.sorted(Comparator.comparingDouble(EmployeeMaxSalary::getSalary)
				.reversed());
		System.out.println(find.collect(Collectors.toList()));
	}
	

}
