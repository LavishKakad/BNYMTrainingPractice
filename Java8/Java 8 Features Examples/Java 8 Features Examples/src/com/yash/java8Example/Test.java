package com.yash.java8Example;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

interface printsquare{
	 void num(int n);
	
}

public class Test {
	public static void main(String[] args) {
		
		//System.out.println("StringBuffer execution time.....");
		long starttime = System.currentTimeMillis();
		StringBuffer buffer=new StringBuffer();
		buffer.append("hello");
		buffer.append("String");
		buffer.append("Buffer");
		long endtime = System.currentTimeMillis();
		System.out.println(endtime-starttime +"ms");
		System.out.println("============================");
		//System.out.println("StringBuilder execution time.....");
		long starttime1 = System.currentTimeMillis();
		StringBuilder builder=new StringBuilder();
		builder.append("hello");
		builder.append("String");
		builder.append("Buffer");
		long endtime1 = System.currentTimeMillis();
		System.out.println(endtime1-starttime1 +"ms");
		
		int a[]= {1,2,3,4,5,6,7,89,4,5,33,55,};
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]%3!=0 && a[i]%5!=0) {
				System.out.println(a[i]);
			}
			
		}
		Map<Integer, String> map=new HashMap<>();
		map.put(1,"aaa");
		map.put(2,"bbb");
		map.put(3,"ccc");
		
		System.out.println(map);
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		
		Collection<String> values = map.values();
		System.out.println(values);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//	List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,1,2,3,4,5,8);
//		List<Integer> list=Arrays.asList(10,20,30,40,80,30,20);
//		
//		 String str = 
//		            "The first second was alright but the second second was tough.";
//		            
//		        str = Arrays.stream( str.split("\\s+")).distinct().collect(Collectors.joining(" ") );
//		        
//		        System.out.println(str);
		
//	StringBuffer buffer=new StringBuffer("Hi");
//	buffer.append(" java 8");
//	System.out.println("Output is :"+buffer);
//		        
		        
	//List<Integer> list2 = list.stream().distinct().collect(Collectors.toList());
	
	//System.out.println(split);
	
	
	
	
	
	
//	System.out.println("All Elements in List....");
//	list.stream().forEach(n->System.out.print(" "+n));
//	System.out.println();
//	System.out.println("=============");
//	System.out.println("Even Elements in List....");
//	Stream<Integer> filter = list.stream().filter(n->n%2==0);
//	System.out.println(filter);
//	
//	printsquare sqr=n->System.out.println("Square is:"+ n*n);
//	sqr.num(5);
	
	}

}
