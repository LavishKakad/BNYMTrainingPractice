package com.yash.java8.question2;

import java.util.Arrays;

public class charSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        String[] str = {"Taj is situated in Agra"};
        String find="ast";
        boolean anyMatch = Arrays.stream(str).anyMatch(s->s.contains("ast"));
        if(anyMatch==true) {
            System.out.println(find+" String found");
        }
        System.out.println(find+" String not found");

	}

}
