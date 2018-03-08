package com.ravi.sort;

public class SortImpl {

	static int[] myNumbers = {5, 10, 9, -11, 55, 43, 2, 12, -31};
	
	public static void main(String[] args) {
		
		doSelectionSort();
		int length = myNumbers.length;
		System.out.print("{");
		for (int i = 0; i < length; i++) {
			System.out.print(myNumbers[i]);
			if (i != length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("}");

	}
	
	
	private static void doBubbleSort(){		
		for(int outer = myNumbers.length - 1; outer >= 0; outer --)	{		
			for(int inner = 0; inner < outer; inner++){
				if(myNumbers[outer] < myNumbers[inner]){
					swap(outer, inner);
				}
			}
		}
	}
	
	private static void doSelectionSort(){
		int out, min, inner;		
		for(out = 0; out < myNumbers.length - 1; out++){
			min = out;
			for(inner = out+1; inner < myNumbers.length; inner++)
				if(myNumbers[inner] < myNumbers[min])
					min = inner;
				swap(min, out);
			
			
		}
	}
	
	private static void swap(int one, int two){
		
		int temp = myNumbers[one];
		myNumbers[one] = myNumbers[two];
		myNumbers[two] = temp;
	}

}
