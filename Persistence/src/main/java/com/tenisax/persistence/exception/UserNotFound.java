package com.tenisax.persistence.exception;

public class UserNotFound extends Exception{
	
	private String userNotFound = "User no encontrado";

	public String getUserNotFound() {
		return userNotFound;
	}

	public void setUserNotFound(String userNotFound) {
		this.userNotFound = userNotFound;
	}
	
	
	
}
