package com.The30daysChallenge.Week1;

public class April_5 {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,3};
		System.out.println("Results: " + removeDuplicates(nums));
		for(int i : nums) {
			System.out.println(i);
		}

	}
	
	public static int removeDuplicates(int[] nums) {
        int i = 0;
       for (int n : nums)
           if (i == 0 || n > nums[i-1])
               nums[i++] = n;
       return i;
       
   }

}
