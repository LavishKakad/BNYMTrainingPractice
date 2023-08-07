package com.comparable_comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		List<Person> plist=new LinkedList<>();
		plist.add(new Person(11, "Abc", 27));
		plist.add(new Person(22, "Ankit", 28));
		plist.add(new Person(33, "Suraj", 25));
		plist.add(new Person(44, "Ajay", 27));
		//sorting by name
		System.out.println("sorting by name");
		System.out.println();
		Collections.sort(plist,new NameComparator());
		for (Person person : plist) {
			System.out.println(person.id+" "+person.name +" "+person.age);
		}
		System.out.println();
		//sorting by age
		System.out.println("sorting by age");
		System.out.println();
		Collections.sort(plist,new AgeComparator());
		for (Person person : plist) {
			System.out.println(person.id+" "+person.name +" "+person.age);
		}
		
	}
	

}
