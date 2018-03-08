package com.ravi.data.impl;

public class MapEntry<K, V> {

	MapEntry<K, V> next;
	private V value;
	private final K key;
	
	//Constructor to create the object. We may not want to initialize the object
	//in any other way
	public MapEntry (K key, V value){
		this.key = key;
		this.value = value;
	}
	
	public K getKey(){
		return key;
	}
	
	public void setValue(V value){
		this.value = value;
	}
	
	public V getValue(){
		return value;
	}
	
	public void setNext(MapEntry<K, V> next){
		this.next = next;
	}
	
	public MapEntry<K, V> getNext(){
		return next;
	}
}
