package com.ravi.data.linkedlist;

public class StackOverflowException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1183811920233813384L;
	String message;
	
	public StackOverflowException(String message){
		super(message);
		this.message = message;		
	}

}
