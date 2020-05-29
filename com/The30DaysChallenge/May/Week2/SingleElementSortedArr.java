package com.The30DaysChallenge.May.Week2;

public class SingleElementSortedArr {

	public static void main(String[] args) {
		

	}
	
	public int singleNonDuplicate(int[] nums) {
        
        if(nums == null || nums.length == 0) {
		return 0;
	}
        
        int prevNum = nums[0];
        int result = 0;
        for(int i=0; i<nums.length; i++){
            result = result^nums[i];
        }
        
        return result;
        
      
    }

}
