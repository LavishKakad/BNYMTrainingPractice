package com.exception;

import java.io.IOException;

class SuperClass {

	void method() throws IOException {
		System.out.println("SuperClass");
	}
}

class SubClass extends SuperClass {

	void method() throws IOException {

		System.out.println("SubClass");
	}

	public static void main(String args[]) {
		SuperClass s = new SubClass();
		try {
			s.method();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}