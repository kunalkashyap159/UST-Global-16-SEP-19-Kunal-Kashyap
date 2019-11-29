package com.ustglobal.exception.customizeduncheckedexception;

public class InvalidAgeException extends RuntimeException {
	
	String message = "Invalid age below 18 years not allowed";
	
    public InvalidAgeException() {
		}
	
	public InvalidAgeException(String message) {
		this.message = message;
	}
	
	// override either get message or toSting.........
	
	@Override
	public String getMessage() {
		return message;
	}

}
