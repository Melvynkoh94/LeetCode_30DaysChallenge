package com.The30DaysChallenge.May.Week4;

import java.util.Arrays;
import java.util.stream.Stream;

public class CountingBits {

	public static void main(String[] args) {
		
		Stream.of(countBits(10)).forEach(x -> System.out.println(Arrays.toString(x)));
	}

   public static int[] countBits(int num) {
        
		if(num < 2) return (num==0) ? (new int[]{0}) : (new int[]{0,1});
		
		int[] result = new int[num+1];
		result[0] = 0; 
		result[1] = 1;
		
		// [2-3], [4-7], [8-15]
		int window_start = 2; // start of i
		int window_end = 2;
		int current = 2;
		while(current <= num) {
			window_end = (num < ((window_start*2) - 1)) ? num : ((window_start*2) - 1);
			for(int i=window_start; i<window_end+1; i++) {
				if(current == window_start) {
					result[i] = 1;
				}
				else {
					int difference = current - window_start;
					result[i] = result[window_start] + result[difference];
				}
				current++;							
			}
			window_start = current;
		}    
        return result;
    }
}
