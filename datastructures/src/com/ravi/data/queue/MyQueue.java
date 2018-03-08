package com.ravi.data.queue;

import java.lang.reflect.Array;

public class MyQueue<E> {
	
	private E[] queue;
	
	private int size;
	
	private int head;
	
	private int tail;
	
	@SuppressWarnings("unchecked")
	public MyQueue(Class<E> c, int size){
		queue = (E[])Array.newInstance(c, size);
		this.size = size;
		head = -1;
		tail = 0;
	}
	
	public boolean isEmpty(){
		if(tail == -1)
			return true;
		else
			return false;
		
	}
	
	public boolean isFull(){
		if(size - 1 == tail){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void enqueue(E element){		
		queue[tail] = element;
		tail++;
		head = 0;
	}
	
	public void dequeue(){
		
		for(int i = 1; i < tail - 1; i++){
			queue[i - 1] = queue[i];
		}
		/*E[] newQueue = (E[])new Object[size];
		int j = 0;
		for(int i = 1; i < size; i++){			
			newQueue[j] = queue[i];			
			j++;
		}		
		head = 0;
		tail = size -1;
		queue = newQueue;
		*/
	}
	
	public void display(){
		for(int i = 0; i < tail; i++){
			System.out.println(queue[i]);
		}
		System.out.println("\n");
	}

}
