/**
 * 
 */
package com.ravi.vogella.impl;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yc05r2g
 *
 */
public class MyHashMap<K, V> {

	private int size;

	private int DEFAULT_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];

	public V get(K key) {
		V value = null;
		if (null != values && values.length > 0) {
			for (int i = 0; i < size; i++) {
				if (null != values[i] && key.equals(values[i].getKey())) {
					value = values[i].getValue(key);
					break;
				}
			}
		}

		return value;
	}

	public void put(K key, V value) {
		boolean increaseSize = true;
		for (int i = 0; i < size; i++) {
			if (key.equals(values[i].getKey())) {
				values[i].setValue(value);
				increaseSize = false;
				break;
			}

		}

		if (increaseSize) {
			expandSize();
			values[size++] = new MyEntry<K, V>(key, value);
		}
	}

	public void remove(K key) {
		for (int i = 0; i < size; i++) {
			if (key.equals(values[i].getKey())) {
				values[i] = null;
				size--;
				condenseSize(i);
				break;
			}
		}
	}
	
	public Set<K> keySet(){
		Set<K> keySet = null;
		if(null != values && values.length > 0){
			keySet = new HashSet<K>();
			for(int i = 0; i < size; i++){
				keySet.add(values[i].getKey());
			}
		}
		return keySet;
	}
	
	public int size(){
		return size;
	}

	private void expandSize() {
		if (size == values.length) {
			int newSize = values.length * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}

	private void condenseSize(int start) {
		for (int i = start; i < size; i++) {
			values[i] = values[i++];
		}
	}

}
