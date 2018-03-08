package com.ravi.data.linkedlist;

public class Stack<T extends Comparable<T>> {
	
	private int MAX_SIZE = 4;
	
	private int size = 0;
	
	private Element<T> top;
	
	public void push(T data){
		
		if(size == MAX_SIZE){
			throw new StackOverflowException("The stack is full. Cannot insert any more elements.");
		}
		
		Element<T> element = new Element<T>(top, data);
		top = element;
		size++;
	}
	
	public T pop(){
		T data = null;
		if(size == 0){
			throw new StackUnderflowException("The stack is empty. Cannot pop any more elements.");
		}
	data = top.getData();
	top = top.getNext();
	size--;
	return data;
		
	}
	
	public T peek(){
		if(size == 0){
			throw new StackUnderflowException("The stack is empty. Cannot pop any more elements.");
		}
		return top.getData();	
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public boolean isFull(){
		return size == MAX_SIZE;
	}
	public int getSize(){
		return size;
	}

}
