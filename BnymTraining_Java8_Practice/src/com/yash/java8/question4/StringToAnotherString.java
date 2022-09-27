package com.yash.java8.question4;

import java.util.Arrays;
import java.util.List;

public class StringToAnotherString {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList("Lavish ", "kakad");

		StringBuilder sb = new StringBuilder();
		list.forEach(sb::append);
		 
		System.out.println(sb.insert(0, ""));

		System.out.println(sb);
		
	}

}
