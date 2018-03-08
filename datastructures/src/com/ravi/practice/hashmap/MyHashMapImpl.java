/**
 * 
 */
package com.ravi.practice.hashmap;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author yc05r2g
 * This class is the actual implementation of HashMap
 * All we need to implement the common methods of HashMap
 * It should have put, get, remove keySet methods implemented.
 * The key for this implementation is defining the size of the Map.
 * As we keep on adding, the size has to be increased.
 * The size has to be decreased when we remove an entry.
 * When we remove an entry, the successive entries have be moved one index
 * back ward.
 */
public class MyHashMapImpl<K, V> {

	private int size;
	
	private int DEFAULT_SIZE = 15;
	
	@SuppressWarnings("unchecked")
	private MyEntry<K, V>[] values = new MyEntry[DEFAULT_SIZE];
	
	/**
	 * Method to get the value from MyEntry object based on the key passed.
	 * Returns null if no MyEntry object with the key found.
	 * @param key
	 * @return value
	 */
	public V get(K key){
		V value = null;
		if(null != values && values.length > 0){
			for(int i=0; i < size; i++){
				if(null != values[i] && key.equals(values[i].getKey())){
					value = values[i].getValue(key);
					break;
				}
			}
		}
		return value;
	}
	
	/**
	 * Method to put the key and value in MyEntry object
	 * If the same key is already existing, override the value.
	 * If the key is not existing, then create a new MyEntry object with 
	 * this key and value
	 * @param key
	 * @param value
	 */
	public void put(K key, V value){
		boolean expandSize = true;
		if(null != values && values.length > 0){
			for(int i=0; i < size; i++){
				if(null != values[i] && key.equals(values[i].getKey())){
					values[i].setValue(value); 
					expandSize = false;
					break;
				}
			}
		}
		
		if(expandSize){
			expandSize();
			values[size++] = new MyEntry<K, V>(key, value);
		}
		
	}
	
	/**
	 * Method to remove an entry based on the key.
	 * If the MyEntry object is present with the key, then make it null.
	 * As this position is pointing to null, bring all the successive elements
	 * one position backward starting from this null position index.
	 * @param key
	 */
	public void remove(K key){
		if(null != values && values.length > 0){
			for(int i=0; i < size; i++){
				if(null != values[i] && key.equals(values[i].getKey())){
					values[i] = null; 
					size--;
					condenseSize(i);
					break;
				}
			}
		}
		
	}
	
		
	/**
	 * Method to expand the size of the array.
	 * If the size same as array size, then double it.
	 * Copy all the entries to the new array with increased size.
	 */
	public void expandSize(){
		if(size == values.length){
			int newSize = values.length * 2;
			values = Arrays.copyOf(values, newSize);
		}
	}
	
	/**
	 * Method to return the size of the map
	 * @return
	 */
	public int size(){
		return size;
	}
	/**
	 * Method to condense the existing map. Beginning from the startIndex,
	 * all the successive elements are moved one position backward.
	 * @param startIndex
	 */
	private void condenseSize(int startIndex){
		if(null != values && values.length > 0){
			for(int i=0; i < size; i++){
				values[i] = values[i++];
				}
			}
		}
	
	/**
	 * Method to get all the keys from the Map
	 * @return keys
	 */
	public Set<K> keySet(){
		Set<K> keys = null;
		if(null != values && values.length > 0){
			keys = new HashSet<K>();
			for(int i=0; i < size; i++){
				keys.add(values[i].getKey());
			}
		}
		
		return keys;
	}
}
