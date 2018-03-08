package com.ravi.practice.hashmap;

public class MyMapTest {
	public static void main(String[] args) {
		MyHashMapImpl<String, Integer> myMap = new MyHashMapImpl<String, Integer>();
		for (int i = 0; i < 100; i++) {
			myMap.put(String.valueOf(i), i);
		}

		myMap.put("111", 111);

		Integer value = myMap.get("99");

		System.out.println("The value is: " + value);

		myMap.remove("99");
		int size = myMap.size();
		System.out.println("The size of the map: " + size);
		Integer value1 = myMap.get("99");

		System.out.println("The value is: " + value1);

	}
}
