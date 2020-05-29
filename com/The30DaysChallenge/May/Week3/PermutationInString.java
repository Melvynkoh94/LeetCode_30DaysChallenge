package com.The30DaysChallenge.May.Week3;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

	public static void main(String[] args) {
		System.out.println(checkInclusion("ab", "eidboaoo"));

	}
	
	 public static boolean checkInclusion(String s1, String s2) {
         if(s2.contains(s1)) return true;
          
        Map<Character, Integer> s1_map = new HashMap<>();
        int s1_len = s1.length();
        for(int i=0; i<s1_len; i++) {
        	char key = s1.charAt(i);
        	if(s1_map.containsKey(key)) {       		
        		s1_map.put(key, (s1_map.get(key)+1));
        	}
        	else s1_map.put(key, 1);        	
        }
        
        int window_start = 0;
        Map<Character, Integer> subS2_map = new HashMap<>();
        while(window_start+s1_len <= s2.length()) {
        	if(!s1_map.containsKey(s2.charAt(window_start))) {
        		window_start++;
        		continue;
        	}
        	
        	for(int j=0; j<s1_len; j++) {
        		char s2_key = s2.charAt(window_start+j);
        		if(subS2_map.containsKey(s2_key)){
        			subS2_map.put(s2_key, (subS2_map.get(s2_key)+1));        			      			
        		}
        		else subS2_map.put(s2_key, 1);      		
        	}
        	
        	if(subS2_map.equals(s1_map)) return true;
        	
        	subS2_map.clear();
        	window_start++;
        	
        }       
        return false;
    }

}
