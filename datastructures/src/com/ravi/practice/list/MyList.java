/**
 * 
 */
package com.ravi.practice.list;

import java.util.Arrays;

/**
 * @author Ravi Goka
 * @email ravikumargoka@gmail.com 
 * @date Aug 12, 2015
 */
public class MyList<E> {

	private int size;

	private int DEFAULT_SIZE = 6;

	private Object[] elements;

	public MyList() {
		elements = new Object[DEFAULT_SIZE];
	}

	public void add(E element) {
		if (size == elements.length) {
			increaseCapacity();
		}

		elements[size++] = element;
	}

	@SuppressWarnings("unchecked")
	public E get(int index){
		E value = null;
		if(null != elements && size > index){
			value = (E)elements[index];
		}
		return value;
	}
	
	public void remove(int index){
		if(null != elements && size > index){
			elements[index] = null;
			size--;
			decreaseCapacity(index);
		}
	}
	
	public int size(){
		return size;
	}
	
	private void increaseCapacity() {
		int newLength = elements.length * 2;
		elements = Arrays.copyOf(elements, newLength);
	}
	
	private void decreaseCapacity(int startIndex){
		if(null != elements && size > 0){
			for(int i = 0; i < size; i++){
				elements[i] = elements[i++];
			}
		}
	}

}
