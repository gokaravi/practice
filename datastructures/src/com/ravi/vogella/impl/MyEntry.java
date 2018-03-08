/**
 * 
 */
package com.ravi.vogella.impl;

/**
 * @author yc05r2g
 *
 */
public class MyEntry<K, V> {

	private final K key;
	
	private V value;
	
	public MyEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	
	public void setValue(V value){
		this.value = value;
	}
	
	public V getValue(K key){
		return value;
	}
}
