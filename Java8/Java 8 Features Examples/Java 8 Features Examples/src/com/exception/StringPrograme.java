package com.exception;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StringPrograme {
	
	static void msg(String s11, String s1) {

		String[] split = s11.split(" ");
		String strr = "";
		for (String words : split) {

			if (!words.equals(s1)) {
				strr = strr + " " + words;
			}

		}
		System.out.println(strr);
	}
	
	public static void main(String[] args) {
		
		String ss="Aabbbccccdddd";
		String ss1 = ss.toLowerCase();
//		char[] array = ss1.toCharArray();
//		int count=1;
//		System.out.println(array);
//		
//		for (int i = 0; i < ss1.length(); i++) {
//			for (int j = 1; j > i; j++) {
//				
//				if(ss1.charAt(i)==ss1.charAt(j)) {
//					count=count+1;
//				}
//				
//			}
//			System.out.println(ss1.charAt(i)+" "+count);
//			
//		}
		List<String> s=new LinkedList<>();
		s.add("aa");
		s.add("bb");
		s.add("cc");
		s.add("aa");
		s.add("bb");

		List<String> newlist=new LinkedList<>();
		for (String string : s) {
			if(!newlist.contains(string)) {
				newlist.add(string);
				
			}
			
		}
		System.out.println(newlist);

		List<String> list = s.stream().distinct().collect(Collectors.toList());
//		System.out.println(list);
//		System.out.println(s);
		
		
		StringPrograme sp=new StringPrograme();
		sp.msg("I Love My Country", "My");
		
//		String str="ommm";
//		String str1="";
//		char ss;
//		String s="I Love My India";
//		String all = s.replaceAll("My", "");
//		System.out.println(all);
//		String all1 = s.replaceAll("I", "");
//		System.out.println(all1);
//		for (int i = 0; i < str.length(); i++) {
//			ss=str.charAt(i);
//			str1=ss+str1;
//			
//		}
//		if(str.equals(str1))
//		System.out.println("Palindrome");
//		else
//			System.out.println("Not an pindrome");
//		
//		String st="apple";
//		
		
		
	}

}
