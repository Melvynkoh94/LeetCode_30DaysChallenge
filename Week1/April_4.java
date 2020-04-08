package com.The30daysChallenge.Week1;

public class April_4 {

	public static void main(String[] args) {
		int[] nums = new int[] {0,1,0,3,12};
		moveZeroes(nums);
		for (int i : nums) {
			System.out.println(i);
		}
		

	}
	
	public static void moveZeroes(int[] nums) {
        
        int firstNonZeroIndex = 0;
        int firstZeroIndex = 0;        
        int zeroCounter = 0;
        
        for (int i=0; i<nums.length; i++){
            if(nums[i] == 0){
                zeroCounter++;
                if(zeroCounter == 1) firstZeroIndex = i;
            } 
            else{
                firstNonZeroIndex = i;
                
                //swap firstZero and firstNonZero
                if(zeroCounter > 0){
                    nums[firstZeroIndex] = nums[firstNonZeroIndex];
                    nums[firstNonZeroIndex] = 0;
                    firstZeroIndex += 1;
                }
            }
        }      
    }
}
