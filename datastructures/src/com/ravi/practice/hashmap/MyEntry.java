/**
 * 
 */
package com.ravi.practice.hashmap;

/**
 * @author yc05r2g
 * This class holds the key and value pair.
 * The object shall only be created with a key and value.
 * We can have a get value, set value methods.
 * These are needed to get or set values from/to an existing object
 * Also, we need to get the key of this object
 * so that we can do the update or delete operations.
 */
public class MyEntry<K, V>{
	
	private final K key;
	
	private V value;
	
	public MyEntry(K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public void setValue(V value){
		this.value = value;
	}
	
	public V getValue(K key){
		return value;
	}
	
	public K getKey(){
		return key;
	}

}
