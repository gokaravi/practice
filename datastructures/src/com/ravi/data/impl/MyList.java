/**
 * 
 */
package com.ravi.data.impl;

/**
 * @author yc05r2g
 *
 */
public class MyList {

	private Object[] elements;

	private int initialSize = 5;

	public MyList() {
		elements = new Object[initialSize];
	}

	public void add(Object obj) {
		if (null == elements) {
			elements = new Object[initialSize];
		}

		if (elements.length == 0) {
			elements[0] = obj;
		}

		else {
			int totalLength = elements.length;
			boolean insert = false;
			if (totalLength < initialSize) {

				insert = insertElement(totalLength, obj);
			}

			if (!insert) {
				initialSize = initialSize + 5;
				Object[] extendedElements = new Object[initialSize];
				second: for (int x = 0; x < totalLength; x++) {
					if (null == elements[x]) {
						break second;
					}
					extendedElements[x] = elements[x];

				}

				elements = extendedElements;

				int newLength = elements.length;

				insert = insertElement(newLength, obj);

			}
		}

		cleanUp();

	}

	public void remove(int index) {

		boolean removed = false;
		if (index < elements.length) {

			if (null != elements[index]) {
				elements[index] = null;
				removed = true;
			}

			if (removed) {

				for (int x = index; x < elements.length - 1; x++) {
					if (null != elements[x]) {
						elements[x] = elements[x];
					}
				}
			}
		}

		cleanUp();
	}

	public void printMyList(MyList myList) {

		if (null != myList && elements.length > 0) {
			System.out.println("The size of the list is: " + elements.length);
			for (int x = 0; x < elements.length; x++) {
				if (null != elements[x]) {
					System.out
							.println("The element position: [" + x + "]"
									+ " :: The element value is: ["
									+ elements[x] + "]");
				}
			}

		}
	}
	
	@SuppressWarnings("unused")
	private void printMyList() {

		if (null != elements && elements.length > 0) {
			System.out.println("The size of the list is: " + elements.length);
			for (int x = 0; x < elements.length; x++) {
				if (null != elements[x]) {
					System.out
							.println("The element position: [" + x + "]"
									+ " :: The element value is: ["
									+ elements[x] + "]");
				}
			}

		}
	}

	private boolean insertElement(int size, Object obj) {
		boolean insert = false;
		first: for (int x = 0; x < size; x++) {
			if (null == elements[x]) {
				if (null != obj) {
					elements[x] = obj;
					insert = true;
					break first;
				}
			}
		}

		return insert;
	}

	private void cleanUp() {
		//printMyList();
		
		for (int x = 0; x < elements.length - 1; x++) {
			if (null == elements[x] && null != elements[x + 1]) {
				elements[x] = elements[x + 1];
			}
		}

		int index = 0;
		for (int x = 0; x < elements.length - 1; x++) {
			if (null == elements[x]) {
				index = x;
				break;
			}
		}

		if (index > 0) {
			Object[] newElements = new Object[index + 1];

			for (int x = 0; x <= index - 1; x++) {
				if (null != elements[x]) {
					newElements[x] = elements[x];
				}
			}

			elements = newElements;
		}

	}

}
