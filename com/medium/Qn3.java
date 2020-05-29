package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class Qn3 {

	public static void main(String[] args) {
		
		System.out.println(1%1000);
		
		
//		System.out.println(lengthOfLongestSubstring("dvdf"));
		
//		List<List<Integer>> nestedList = new ArrayList<>();
//		nestedList.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
//		nestedList.add(new ArrayList<>(Arrays.asList(1,2,3,4)));
//
//		System.out.println(nestedList);
		
//		
//		List<Integer> list= new ArrayList<>();
//		list.add(6);
//		list.add(9);
//		list.add(1);
//		list.add(80);
//		list.add(15);
//		Collections.sort(list, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer num1, Integer num2) {
//				return num2-num1;
//			}
//		});
//		System.out.println(list);
//		
//		Collections.sort(list, (Integer num1, Integer num2) -> num1-num2);
//		System.out.println(list);
	}
	
	
	// *** CORRECT LOGIC ***
	public static int lengthOfLongestSubstring(String s) {
		
		if(s.length() == 0) return 0;
		if(s.length() == 1) return 1;
		
		// using a window with 2 pointers
		// right pointer (j) will traverse the whole string
		// left pointer (i) will move whenever the right pointer sees a repeated char		
		Map<Character, Integer> map = new HashMap<>();
		
		map.put(s.charAt(0), 0); //initialize with first char
		int start = 0;
		for(int j=1; j<s.length(); j++) {
			if(map.containsKey(s.charAt(j))) {
				start++;
			}
		
		}
		
		
		
		return 0;
		
	}
	
	
	// *** WRONG LOGIC ***
	 public static int lengthOfLongestSubstring_wrong(String s) {
		 if(s.length() == 0) return 0;
		 if(s.length() == 1) return 1;
		 
		 HashSet<Character> set = new HashSet<>();
		//PQ stores all the substrings
		// PQ based on longest string highest priority
		PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s2.length() - s1.length();
			}		
		});
		// OR use the lambda function
//		PriorityQueue<String> pq2 = new PriorityQueue<>((String s1, String s2) -> s2.length()-s1.length());
		
		 StringBuilder sb = new StringBuilder();
		 for(char ch : s.toCharArray()) {
			 if(!set.add(ch)) {
				 set.clear(); //clear HashSet
				 pq.add(sb.toString()); //store StringBuilder into PQ
				 sb.delete(0, sb.length());
				 set.add(ch); //add this current char to restart
			 }
			 System.out.println(set);
			 sb.append(ch);
		 }	        
		 System.out.println(pq.peek());
		 
	     return (pq.isEmpty()) ? sb.length() : ((sb.length() > pq.peek().length()) ? sb.length() : pq.peek().length());
	     
	 }

}
