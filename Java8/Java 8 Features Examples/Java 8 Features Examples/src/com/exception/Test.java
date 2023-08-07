package com.exception;

public class Test {
	public static void main(String[] args) {
		
		try {
			try {
				System.out.println(10/0);
			} catch (Exception e) {
				System.out.println("Shubham".charAt(10));
			}
			finally {
				int a[]= {1,2,3,4,4};
				System.out.println(a[5]);
			}
			
		} catch (Exception e) {
			System.out.println("All-Exception handle here.....");
		
		}
	}

}
