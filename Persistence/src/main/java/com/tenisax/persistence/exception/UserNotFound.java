package com.tenisax.persistence.exception;

public class UserNotFound extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String userNotFound = "Excepción controlada";

	public UserNotFound(String error){
		this.userNotFound = error;
	}
	
	public String getUserNotFound() {
		return userNotFound;
	}

	public void setUserNotFound(String userNotFound) {
		this.userNotFound = userNotFound;
	}
	
	
	
}
