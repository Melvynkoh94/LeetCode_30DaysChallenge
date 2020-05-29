package com.medium;

import java.util.LinkedList;
import java.util.List;

public class Qn17 {

	public static void main(String[] args) {
//		System.out.println(Integer.valueOf("23")%10);
		System.out.println(letterCombinations("23"));

	}
	
	public static List<String> letterCombinations(String digits) {
		
		LinkedList<String> resultList = new LinkedList<>();		
		if(digits.length() == 0 || digits == null) return resultList;
		
		final String[] keyMapper = new String[] {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
		resultList.add("");
		
		for(int i=0; i<digits.length(); i++) {
			// get string in keyMapper based on the digit
			String digit = keyMapper[Character.getNumericValue(digits.charAt(i))];
			while(resultList.peek().length() == i) {
				String prev = resultList.pop();				
				for(char ch : digit.toCharArray()) {
					resultList.add(prev+ch);
				}
								
			}
			
		}
		return resultList;       
    }
	
	
	
	

}
