package com.comparable_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee implements Comparable<Employee> {
	private int eid;
	private String ename;
	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	@Override
	public int compareTo(Employee emp) {
		if(eid==emp.eid)
		return 0;
		else if (eid>emp.eid)
			return 1;
		else
			return -1;
	}
	public static void main(String[] args) {
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(22, "Shubham"));
		list.add(new Employee(33, "Prafull"));
		list.add(new Employee(11, "Ajay"));
		list.add(new Employee(44, "Ankit"));
		Collections.sort(list);
	    for (Employee emp : list) {
			System.out.println(emp.eid+" "+emp.ename);
		}
	}
	
}
