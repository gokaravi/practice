package com.ravi.vogella.impl;

public class MyHashMapTest {

	public static void main(String[] args) {
		MyHashMap<String, Integer> myMap = new MyHashMap<String, Integer>();
		for(int i = 0; i < 5; i++){
			myMap.put(String.valueOf(i), i);
		}
		
		/*myMap.put("111", 111);
		
		myMap.remove("99");*/
		int size = myMap.size();
		System.out.println("The size of the map: "+size);
		/*Integer value  = myMap.get("99");
		
		System.out.println("The value is: "+value);*/
		
		
	}

}
