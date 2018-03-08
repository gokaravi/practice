package com.ravi.data.impl;

public class MyHashMap<K, V> {
	
	private int DEFAULT_SIZE = 10;
	
	private MapEntry<K, V>[] hashTable;
	
	@SuppressWarnings("unchecked")
	public MyHashMap(){
		hashTable = new MapEntry[DEFAULT_SIZE];
	}
	
	@SuppressWarnings("unchecked")
	public MyHashMap(int limit){
		hashTable = new MapEntry[limit];
	}

	public V get(K key)  {

		if (null == key) {
			throw new IllegalArgumentException("null key not supported");
		}
		MapEntry<K, V> entry = hashTable[key.hashCode() & (hashTable.length - 1)];
		while (null != entry && !key.equals(entry.getKey()))
			entry = entry.getNext();
		return  null != entry ? entry.getValue() : null;
	}
	
	public void put(K key, V value) {

		if (null == key) {
			throw new IllegalArgumentException("null key not supported");
		}

		MapEntry<K, V> entry = hashTable[key.hashCode() & (hashTable.length - 1)];

		if (null != entry) {
			boolean done = false;
			while (!done) {
				if (key.equals(entry.getKey())) {
					entry.setValue(value);
					done = true;
				} else if (null == entry.getNext()) {
					entry.setNext(new MapEntry<K, V>(key, value));
					done = true;
				}
				entry = entry.getNext();
			}
		} else {
			hashTable[key.hashCode() & (hashTable.length - 1)] = new MapEntry<K, V>(key, value);
		}
	}
}
