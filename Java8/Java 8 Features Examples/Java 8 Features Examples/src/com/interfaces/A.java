package com.interfaces;

public class A implements I3{

	@Override
	public void m1() {
		System.out.println("m1----method");
		
	}

	@Override
	public void m2() {
		System.out.println("m2----method");
		
	}

	@Override
	public void m3() {
		System.out.println("m3----method");
		
	}
	public static void main(String[] args) {
		I1 i=new A();
		i.m1();
		A a=new A();
		a.m1();
		a.m2();
		a.m3();
		System.out.println(a instanceof A);
	}

}
