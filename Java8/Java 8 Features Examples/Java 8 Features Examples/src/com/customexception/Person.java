package com.customexception;

import java.util.Scanner;

public class Person {
	
	static void personAge(int age) throws InvalidAgeException {
		if(age<18) {
			throw new InvalidAgeException("You are not eligible for voting....!!");
		}else {
			System.out.println("You are eligible for voting....!!");
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	while(true) {
	System.out.println("Enter Your age :");
	Scanner sc=new Scanner(System.in);
	int nextInt = sc.nextInt();
	try {
		Person.personAge(nextInt);
	} catch (InvalidAgeException e) {
		System.out.println(e.getMessage());
	}
		}
	}

}
