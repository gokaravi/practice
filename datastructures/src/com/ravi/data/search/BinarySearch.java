/**
 * 
 */
package com.ravi.data.search;

/**
 * @author yc05r2g
 *
 */
public class BinarySearch {
	
	/** Binary Search Algorithm
	 * 	DECLARE INTEGER x [] = [ -5, 12, 15, 20, 30, 72, 456 ]
		DECLARE INTEGER loIndex = 0
		DECLARE INTEGER hiIndex = LENGTH (x) - 1
		DECLARE INTEGER midIndex, srch = 72
			WHILE loIndex <= hiIndex
   				midIndex = (loIndex + hiIndex) / 2
   				IF srch > x [midIndex] THEN
      				loIndex = midIndex + 1
   				ELSE
   				IF srch < x [midIndex] THEN
      				hiIndex = midIndex - 1
   				ELSE
      				EXIT WHILE
   				END IF
			END WHILE
		IF loIndex > hiIndex THEN
   			PRINT srch, " not found"
		ELSE
   			PRINT srch, " found"
		END IF
		END            
	 */
	
	static int[] myArray = {-5, 2, 5, 24, 35, 44, 56, 78, 89};

	/**
	 * @param args
	 */
	/*public static void main(String[] args) {
		
		int[] myNumbers = {-5, 2, 5, 24, 35, 44, 56, 78, 89};
		int searchNumber = -2;
		int loIndex = 0;
		int hiIndex = myNumbers.length - 1;
		
		int midIndex = (loIndex+hiIndex)/2;
		
		System.out.println("The middle index: " +midIndex);
		
		if(myNumbers[midIndex] == searchNumber){
			System.out.println("The search number is found in the middle index: " +searchNumber);
			return;
		}
		
		if(searchNumber < myNumbers[midIndex]){
			hiIndex = midIndex - 1;
			for(int x = 0; x <= hiIndex; x++){
				if(searchNumber == myNumbers[x]){
					System.out.println("The search number is found in the lower array: " +searchNumber);	
					return;
				}
			}
		}
		
		if(searchNumber > myNumbers[midIndex]){
			loIndex = midIndex + 1;
			for(int x = loIndex; x <= hiIndex; x++){
				if(searchNumber == myNumbers[x]){
					System.out.println("The search number is found in the upper array: " +searchNumber);
					return;
				}
			}
		}
		
		System.out.println("The search number is not found: " +searchNumber);
		
	}*/
	
	public static void main(String[] args){
		int index = doBinarySearch(35);
		System.out.println("The index is: "+index);
	}
	
	/**
	 * More optimal way of binary search
	 * @param searchNumber
	 * @return
	 */
	public static int doBinarySearch(int searchNumber){
	
		int lowerBound = 0;
		int upperBound = myArray.length - 1;
		
		int index;
		
		while(true){
			index = (lowerBound + upperBound)/2;
			
			if (myArray[index] == searchNumber)
				return index;
			else if (lowerBound > upperBound)
				return myArray.length;
			
			else{
				if(myArray[index] < searchNumber)
					lowerBound = index + 1;
				
				else
					upperBound = index - 1;
			}
			
		}
		
			
	}
}
