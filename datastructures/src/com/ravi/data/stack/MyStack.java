package com.ravi.data.stack;

import java.util.NoSuchElementException;

public class MyStack {
	
	private int size;
	
	private String[] elements;
	
	private int top;
	
	public MyStack(int size){
		this.size = size;		
		this.elements = new String[size];		
		this.top = -1;
	}
	
	public void push(String element){
		if (size == 0){
			 throw new IndexOutOfBoundsException("Underflow Exception");
		}
		
		else if(isFull()){
			throw new IndexOutOfBoundsException("Overflow Exception");
		}
		elements[++top] = element;		
	}
	
	public String pop (){
		if(isEmpty()){
			 throw new NoSuchElementException("Underflow Exception");
		}		
		return elements[top--];
	}
	
	public String peek(){
		if(!isEmpty()){
			return elements[top];
		}
		else{
			throw new NoSuchElementException("Underflow Exception");
		}
		
	}
	
	public boolean isEmpty(){
		
		return size <= 0;
	}
	
	public boolean isFull(){
		if(!isEmpty()){
			if(size == top+1){
				return true;
			}
		}		
			return false;		
	}
	
	public void display(){
		System.out.println("=================");
		if(isEmpty()){
			 throw new NoSuchElementException("Underflow Exception");
		}
		
		else{
			
			for(int i = 0; i <= top; i++){
				System.out.println(elements[i]+"\n");	
			}
			
		}
	}


}
