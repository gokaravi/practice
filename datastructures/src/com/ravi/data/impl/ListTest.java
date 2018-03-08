/**
 * 
 */
package com.ravi.data.impl;

/**
 * @author yc05r2g
 *
 */
public class ListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		MyList myList = new MyList();
		
		myList.add("One");
		myList.add("Two");
		myList.add("three");
		myList.add("four");
		myList.add("five");
		myList.add("six");
		myList.add("seven");
		myList.add("eight");
		
		myList.remove(4);
		
		//myList.printMyList(myList);
		
		myList.add("nine");
		myList.add("ten");
		myList.add("eleven");
		myList.add("twelve");
		myList.add("thirteen");
		
		myList.remove(4);
		
		myList.add("fourteen");
		myList.add("fifteen");
		myList.add("sixteen");
		
		//myList.printMyList(myList);
		
		myList.remove(9);
		
		System.out.println("After removal.....");
		myList.printMyList(myList);

	}

}
