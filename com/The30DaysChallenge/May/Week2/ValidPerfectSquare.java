package com.The30DaysChallenge.May.Week2;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		
		System.out.println(isPerfectSquare(15));

	}
	
	public static boolean isPerfectSquare(int num) {
        
        long left = 1, right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (mid * mid == num) return true; // check if mid is perfect square
            if (mid * mid < num) { // mid is small -> go right to increase mid
                left = mid + 1;
            } else {
                right = mid - 1; // mid is large -> to left to decrease mid
            }
        }
        return false;
        
    }

}
