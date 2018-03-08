package com.ravi.data.search;


public class BinarySearchRecursion {

	public static void main(String[] args) {
		int searchNumber = 38;
		Integer[] numbers = {-2, 3, 13, 18, 21, 23, 31, 36, 38};
		Integer numberIndex = doBinarySearch(numbers, 0, numbers.length-1, searchNumber);
		
		System.out.println("The number index: "+numberIndex);
		
	}
	
	private static Integer doBinarySearch(Integer[] array, Integer start, Integer end, Integer target){
		Integer numberIndex = null;
		
		if(start > end){
			return -1;
		}
		Integer middle = (start+end)/2;
		
		if(target == array[middle]){
			return middle;
		}
		else if(target < array[middle]){
			return doBinarySearch(array, start, middle-1, target);
		}
		else if(target > array[middle]){
			return doBinarySearch(array, middle+1, end, target);
		}
		
		
		return numberIndex;
	}
	

}
