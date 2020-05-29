package com.The30DaysChallenge.April.Week1;

import java.util.ArrayList;

public class April_5 {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5};
		System.out.println("Results: " + maxProfit(nums));


	}
	
	 public static int maxProfit(int[] prices) {	 
        //use windows
        int index = 0;
        int windowIndex = 0;
        int earnings = 0;
        while(index <= prices.length - 1){
            if((index+1 <= prices.length -1) && (prices[index+1] > prices[index])){
                windowIndex = index;
                while(true){ //Enters window checking
                    index++;
                    if(index+1 > prices.length - 1) {
                        earnings += (prices[index]-prices[windowIndex]);                      
                        break;
                    }
                    else if (prices[index] > prices[index+1]){
                        earnings += (prices[index]-prices[windowIndex]);                        
                        break;
                    }                    
                }
            }
            index++;
        }            
        return earnings;     
    }

}
