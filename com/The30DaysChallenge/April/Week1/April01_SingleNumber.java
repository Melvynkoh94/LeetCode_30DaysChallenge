package com.The30DaysChallenge.April.Week1;

import java.util.ArrayList;
import java.util.List;

public class April01_SingleNumber {

//	public static void main(String[] args) {
////		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
//		
//		int test = 0;
//		int test2 = 10;
//		int test3 = 10;
//		System.out.println(5^6^7^5^6);
//		System.out.println(test^test2^test3);
//	}
	
	public static int singleNumber(int[] nums) {
        //assuming that we will always see 2 recurring numbers except for one
        List<Integer> singles_list = new ArrayList<>();
        for(int num : nums){
            if(!singles_list.contains(num)) {
                singles_list.add(num);
            }
            else{ //num has been seen before
                singles_list.remove(new Integer(num));               
            }           
        }
        
        return singles_list.get(0); //should always be left with one number      
        
    }

}
