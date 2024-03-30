package com.jsp.school_management_system.exception;

public class AdminIdNotFund extends RuntimeException {

	private String message="Admin Id not found in the DataBase";
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return "AdminIdNotFund [message=" + message + "]";
	}
	
}
