/**
 * 
 */
package com.ravi.data.search;

/**
 * @author yc05r2g
 *
 */
public class LinearSearch {
	/**
	 * 	DECLARE INTEGER i, srch = 72
		DECLARE INTEGER x [] = [ 20, 15, 12, 30, -5, 72, 456 ]
		FOR i = 0 TO LENGTH (x) - 1
    		IF x [i] IS srch THEN
       			PRINT "Found ", srch
       			END
    		END IF
		NEXT i
		PRINT "Did not find ", srch
		END
	 */

	/**
	 * Method to do a linear search on given array of data
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] myNumbers = {23, 45, 33, 56, 29, 584, 694, 23834};
		int searchNumber = 454;
		boolean found = false;
		
		a: for(int x = 0; x < myNumbers.length; x++){
			
			if(myNumbers[x] == searchNumber){
				System.out.println("The search number is found: "+searchNumber);
				found = true;
				break a;
			}
		}
		if(!found){
			System.out.println("Sorry! The search number was not found: "+searchNumber);	
		}

	}

}
