package com.customexception;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception {
	
public InvalidAgeException(String str) {
	super(str);
	
}
}
