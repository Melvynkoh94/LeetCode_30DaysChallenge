package com.The30DaysChallenge.April.Week1;

import java.util.HashSet;
import java.util.Set;

public class April02_HappyNumber {

//	public static void main(String[] args) {
//		
//		System.out.println(isHappy(222));	
////		System.out.println(2/10); //0
//
//	}
	
	public static boolean isHappy1(int number) {
		//HashSet contains only unique Integers, non-repeating Integers
		//seenNumbers is to detect any repeated patterns that might fall in an eternal loop
		Set<Integer> seenNumbers = new HashSet<Integer>();
        while(seenNumbers.add(number)){
            int digitsSum = 0;
            while(number > 0) {
                digitsSum += Math.pow(number % 10 , 2);
                number /= 10;
            }
            number = digitsSum;
            if(number == 1)
                return true;
        }
        return false;
	}
	
	public static boolean isHappy(int n) {
		
		
        int temp = 0;
        while (n%10 != n){ //check if n is only left with 1 digit
            int last_digit = n%10;  
            n = n/10;
            temp += last_digit*last_digit;            
        }
        temp += n*n;
        
        System.out.println(temp);
        
//        while (temp%)
        
		return true;
     
    }

}
