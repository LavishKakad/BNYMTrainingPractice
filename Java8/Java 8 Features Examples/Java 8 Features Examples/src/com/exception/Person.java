package com.exception;

public class Person {
	String name;
	String addr;
	static String cityname="Pune";
	
	static {
		System.out.println("Static Block is executed....");
	}
	
	static void change() {
		cityname="Amravati";
	}
	void display() {
		System.out.println(name+" "+addr+" "+cityname);
	}
	//parametarized contructor...
	public Person(String name,String addr)
	{
		this.name=name;
		this.addr=addr;
	}
	
	public static void main(String[] args) {
		Person.change();
		
		Person p=new Person("SHubham", "Hinjewadi");
		Person p1=new Person("Ajay", "Karve");
		p.display();
		p1.display();
		
		
	}
	

}
