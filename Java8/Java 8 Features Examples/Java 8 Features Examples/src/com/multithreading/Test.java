package com.multithreading;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		MyThread my=new MyThread();
		my.run();
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "abc");
		map.put(2, "pqr");
		map.put(1, "xyz");
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		Collection<String> values = map.values();
		System.out.println(values);
		Set<Entry<Integer,String>> entrySet = map.entrySet();
		for (Entry<Integer, String> string : entrySet) {
			
			System.out.println(string.getKey()+"  "+string.getValue());
//=========================================================================================
			
			
//			int a[]= {1,2,3,4,5,6,23,4,5,2};
//			int a1[]=new int[0];
//			for (int i = 0; i < a.length; i++) {
//			for (int j = 1; j>i; j++) {
//				if(a[i]!=a[j]) {
//					a1[0]=a[i];
//					
//			}	
//				System.out.println(a1[i]);
//			}
//				
//			}
			
		}
		List<Integer> i=new ArrayList<>();
		List<Integer> i1=new ArrayList<>();
		i.add(1);
		i.add(2);
		i.add(1);
		i.add(3);
		i.add(3);
		List<Integer> collect = i.stream().distinct().collect(Collectors.toList());
		System.out.println(collect);
		
		for (Integer integer : i) {
			if(!i1.contains(integer)) {
				i1.add(integer);
			}
			
		}
		System.out.println(i1);
//=========================================================================================
		List<String> ss=new LinkedList<>();
		List<String> ss1=new LinkedList<>();
		String s="the second first is good but second second is not bad";
		String[] split = s.split(" ");
		for (String string : split) {
			ss.add(string);
			if(!ss1.contains(string)) {
				ss1.add(string);
			}
		}
		System.out.println(ss);
		System.out.println(ss1);
	}

	

}
