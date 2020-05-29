package com.easy;

public class Qn14 {

	public static void main(String[] args) {

		System.out.println(longestCommonPrefix(new String[] {"flower", "flow", "flight"}));
	}
	
	public static String longestCommonPrefix(String[] strs) {
        String longestPrefix = new String("");
        if(strs.length == 0) return longestPrefix.toString();
        longestPrefix = strs[0]; //initialize with the first str in the array 
        
        for(int i=1; i<strs.length; i++){
            int index = 0;
            StringBuilder currentPrefix = new StringBuilder("");
            while(index < strs[i].length() && index < longestPrefix.length()){
            	if(Character.compare(strs[i].charAt(index), longestPrefix.charAt(index)) == 0) {
            		currentPrefix.append(strs[i].charAt(index));
            	}else break;
                index++;
            }
            if(currentPrefix.length() < longestPrefix.length()) {
            	longestPrefix = currentPrefix.toString();
            }
        }       
        return longestPrefix.toString();
    }
}
