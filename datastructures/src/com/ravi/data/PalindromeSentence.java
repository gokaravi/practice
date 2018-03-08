/**
 * 
 */
package com.ravi.data;

/**
 * @author yc05r2g
 *
 */
public class PalindromeSentence {

    public static void main(String[] args){
    	
        String myString = "Ravi was I Ravi1 Ravi I was Ravi";
        
        String noSpaceString = myString.replaceAll("\\s", "");
        
        System.out.println(noSpaceString);

        String toLow = myString.toLowerCase();

        String[] myWords = toLow.split(" ");

        int totalWords = myWords.length;

        int upperIndex = totalWords - 1;

        boolean isOdd = true;

        int midIndex = totalWords/2;

        if(totalWords%2 == 0){
            isOdd = false;
        }

        int start = 0;


        if(isOdd){

            while(start < midIndex && upperIndex > midIndex){

                System.out.println("First element: ["+myWords[start]+"] :: Second element: ["+myWords[upperIndex]+"]");
                if(myWords[start].equals(myWords[upperIndex])) {

                    start++;
                    upperIndex--;
                }
                else{
                    System.out.println("The given string is not a palindrome: "+toLow);
                    return;
                }
            }
            System.out.println("The given string is a palindrome: "+toLow);



        }

        if(!isOdd){

            if(!myWords[midIndex -1].equals(myWords[midIndex])){
                System.out.println("The given string is not a palindrome: "+toLow);
                return;
            }

            while(start < midIndex - 2 && upperIndex > midIndex+1){

                System.out.println("First element: ["+myWords[start]+"] :: Second element: ["+myWords[upperIndex]+"]");
                if(myWords[start].equals(myWords[upperIndex])) {

                    start++;
                    upperIndex--;
                }
                else{
                    System.out.println("The given string is not a palindrome: "+toLow);
                    return;
                }
            }
            System.out.println("The given string is a palindrome: "+toLow);

        }

    }
}