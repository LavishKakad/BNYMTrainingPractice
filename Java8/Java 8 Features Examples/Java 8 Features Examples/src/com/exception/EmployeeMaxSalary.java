package com.exception;

import java.util.Date;

public class EmployeeMaxSalary{
	private int eid;
	private String ename;
	private double salary;
	//private Date doj;
	
	
	public EmployeeMaxSalary(int eid, String ename, double salary, Date doj) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		//this.doj = doj;
	}
//	public Date getDoj() {
//		return doj;
//	}
//	public void setDoj(Date doj) {
//		this.doj = doj;
//	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double d) {
		this.salary = d;
	}
	public EmployeeMaxSalary(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		
	}
	@Override
	public String toString() {
		return "EmployeeMaxSalary [salary=" + salary + "]";
	}
	
	
	
	
	
}

