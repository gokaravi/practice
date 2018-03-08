package com.ravi.data.sort;

public class SelectionSort {

	public static void main(String[] args) {
		Integer[] myNumbers = { -5, 23, 44, 36, 67, -23, -45, 56, 89, 21, 32 };

		Integer[] sortedNumbers = doSelectionSort(myNumbers);

		int length = sortedNumbers.length;
		System.out.print("{");
		for (int i = 0; i < length; i++) {
			System.out.print(sortedNumbers[i]);
			if (i != length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

	}

	private static Integer[] doSelectionSort(Integer[] myNumbers) {

		for (int i = 0; i < myNumbers.length - 1; i++) {
			int index = i;
			for (int j = i; j < myNumbers.length; j++)
				if (myNumbers[j] < myNumbers[index]) {
					index = j;
				}
			int smallerNumber = myNumbers[index];
			myNumbers[index] = myNumbers[i];
			myNumbers[i] = smallerNumber;

		}

		return myNumbers;
	}

}
