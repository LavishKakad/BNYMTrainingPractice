package com.exception;

import java.util.Objects;

public class Animal {
	private String name;
	private String category;
	@Override
	public int hashCode() {
		return Objects.hash(category, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		return Objects.equals(category, other.category) && Objects.equals(name, other.name);
	}
	
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal a1=new Animal();
		System.out.println(a.hashCode());
		System.out.println(a1.hashCode());
		System.out.println(a.equals(a1));
		
	}

}
 