package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Qn15 {

	public static void main(String[] args) {
		System.out.println(threeSum(new int[] {-1, 0, 1, 2, -1, -4}));

	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
        
		List<List<Integer>> listResult = new ArrayList<>();
		Map<Integer, Integer> map = new HashMap<>();
		
		//store all elements into map first, with value as the index in the array
		for(int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		
		//compare each and every element 2 by 2
		for(int j=0; j<nums.length; j++) {
			for(int k=0; k<nums.length; k++) {
				if(k==j) continue;
				//if(nums[j] == nums[k]) continue;
				int temp= nums[j] + nums[k];
				if(map.containsKey(temp*-1) && map.get(temp*-1) != j && map.get(temp*-1) != k) {
					List<Integer> innerList = new ArrayList<>(Arrays.asList(nums[j], nums[k], nums[map.get(temp*-1)]));
					//List<Integer> sortedList = innerList.stream().sorted().collect(Collectors.toList());  
					Collections.sort(innerList);
					if(!listResult.contains(innerList)) {
						//System.out.println(innerList);
						listResult.add(innerList);
					}
				}							
			}
			
			
		}
		return listResult;
    } 

}
