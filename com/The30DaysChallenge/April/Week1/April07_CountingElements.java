package com.The30DaysChallenge.April.Week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class April07_CountingElements {

	public static void main(String[] args) {
		
		System.out.println(countElements(new int[] {1,2,3})); //2
		System.out.println(countElements(new int[] {1,1,3,3,5,5,7,7})); //0
		System.out.println(countElements(new int[] {1,3,2,3,5,0})); //3
		System.out.println(countElements(new int[] {1,1,2,2})); //2
		System.out.println(countElements(new int[] {1,1,2}));
		
	}
	
	public static int countElements(int[] arr) {
		
		Map<Integer, Integer> map = new HashMap<>();
		Arrays.sort(arr);
		int count = 0;
		for (int i : arr) {
			if(map.containsKey(i-1)) {
//				count++;
//				map.replace(i-1, map.get(i-1)-1);
//				if(map.get(i-1) == 0) map.remove(i-1);
				count += map.get(i-1);
				map.remove(i-1);
			}

			if(map.containsKey(i)) map.replace(i, map.get(i)+1);
			else map.put(i, 1);
		}		
		return count;	        
	}
}
