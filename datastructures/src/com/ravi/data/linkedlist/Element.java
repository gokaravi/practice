package com.ravi.data.linkedlist;

public class Element<T extends Comparable<T>>  {
 
	private Element<T> next;
	private T data;
	
	public Element(Element<T> next, T data){
		this.next = next;
		this.data = data;
	}
	
	public void setNext(Element<T> next){
		this.next = next;
	}
	public Element<T> getNext(){
		return next;
	}
	
	public void setData(T data){
		this.data = data;
	}
	
	public T getData(){
		return data;
	}
	
}
