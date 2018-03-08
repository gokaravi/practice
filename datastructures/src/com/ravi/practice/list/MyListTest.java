/**
 * 
 */
package com.ravi.practice.list;

/**
 * @author Ravi Goka
 * @email rgoka@nisum.com
 * Aug 12, 2015
 */
public class MyListTest {

	public static void main(String[] args){
		
		MyList<String> myList = new MyList<String>();
		myList.add("Ravi");
		myList.add("Kumar");
		myList.add("Goka");
		myList.add("Nisum");
		
		String thirdElement = myList.get(2);
		System.out.println("The third element: "+thirdElement);
		myList.remove(2);
		System.out.println("The third element after delete: "+myList.get(2));
		System.out.println("The size of list: "+myList.size());
	}
}
