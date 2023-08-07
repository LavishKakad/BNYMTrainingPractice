package com.exception;

public class Employee {
	int eid;
	String ename;
	String eaddr;
//	public Employee(int eid, String ename, String eaddr) {
//		super();
//		this.eid = eid;
//		this.ename = ename;
//		this.eaddr = eaddr;
//	}
//	Employee(Employee e){
//		eid=e.eid;
//		ename=e.ename;
//		eaddr=e.eaddr;
//	}
	//Instance Block
	{
		eid=11;
		ename="Shubham";
		eaddr="Amt";
		System.out.println("Instance Block--1");
	}
	{
		System.out.println("Instance Block--2");
	}
	{
		System.out.println("Instance Block--3");
	}
	//Static Block
	static {
		System.out.println("static block--1");
	}
	static {
		System.out.println("static block--2");
	}
	static {
		System.out.println("static block--3");
	}
	void display() {
		System.out.println(eid+" "+ename+" "+eaddr);
//		System.out.println(ename);
//		System.out.println(eaddr);
	}
	public static void main(String[] args) {
//		Employee e=new Employee(11,"Shubham","Karanja (Lad)");
//		Employee e2=new Employee(e);
//		Employee e3=new Employee(e);
//		Employee e4=new Employee(e);
//		e2.eid=e.eid;
//		e2.ename=e.ename;
//		e2.eaddr=e.eaddr;
		Employee e=new Employee();
		e.display();
		//e2.display();
	}
	
	
}
