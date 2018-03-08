package com.ravi.data.linkedlist;

public class StackUnderflowException extends RuntimeException {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4288002422863466355L;
	String message;
	
	public StackUnderflowException(String message){
		super(message);
		this.message = message;		
	}


}
