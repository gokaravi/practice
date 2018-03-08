package com.ravi.search;

public class SearchImpl {
	
	static int[] myNumbers = {5, 10, 9, -11, 55, 43, 2, 12, -31};
	
	static int[] myOrderedNumbers = {-31, -11, 2, 5, 9, 10, 12, 23, 43, 55};

	public static void main(String[] args) {
		
		int index = doLinearSearch(43);
		System.out.println("The index of search number: "+index);
		
		int binaryIndex = doBinarySearch(55);
		System.out.println("The index of search number: "+binaryIndex);

	}
	
	private static int doLinearSearch(int number){
		int index = -1;
		for(int i = 0; i < myNumbers.length; i++){
			if(myNumbers[i] == number){
				return i;
			}			
		}		
		return index;		
	}
	
	private static int doBinarySearch(int number){
		
		int lowerBound = 0;
		int upperBound = myOrderedNumbers.length - 1;
		int cursor;
		
		while(true){
			cursor = (lowerBound + upperBound)/2;
			if(myOrderedNumbers[cursor] == number)
				return cursor;
			else if(lowerBound > upperBound)
				return -1;
			
			else{
				if(myOrderedNumbers[cursor] < number)
					lowerBound = cursor + 1;
				else
					upperBound = cursor - 1;
				
			}
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
