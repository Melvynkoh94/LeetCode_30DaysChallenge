package com.The30DaysChallenge.April.Week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class April06_GroupAnagrams {

	public static void main(String[] args) {
		String str = new String("Hello");
		char[] ch = new char[] {'c', 'p','y'};
		System.out.println(ch);
		System.out.println(new String(ch));
		
//		System.out.println(groupAnagrams(new String[] {"eat", "tea", "tan", "ate", "nat", "bat"}));
		

	}
	

	public static List<List<String>> groupAnagrams(String[] strs) {
		
		List<List<String>> anagramsResult = new ArrayList<List<String>>();		
		Map<String, String> uniqueWordsMap = new HashMap<String, String>();
		//KEY: unique sorted word,  VALUE: original word
		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String sortedWord = new String(ch);
			if(uniqueWordsMap.containsKey(sortedWord)) {
				for(List<String> list : anagramsResult) {
					if(list.contains(uniqueWordsMap.get(sortedWord))) list.add(str);
				}								
			}
			else {
				uniqueWordsMap.put(sortedWord, str);
				List<String> list = new ArrayList<String>(Arrays.asList(str));
				anagramsResult.add(list);
			}
		}
		
		return anagramsResult;
	        
	 }
	    
    public static String sortCharacters(String str){
        char[] ch = str.toCharArray();       
        Arrays.sort(ch);                  
		return Arrays.toString(ch);
    }
    
    public List<List<String>> groupAnagrams_FASTER(String[] strs) {
        int i;
        HashMap<String,ArrayList<String>> map = new HashMap<String,ArrayList<String>>();
        for(i = 0;i<strs.length;i++) {
            char[] tar = new char[strs[i].length()];
            tar = strs[i].toCharArray();
            Arrays.sort(tar);
            String key = new String(tar);
           if(map.containsKey(key)) {
               ArrayList<String> tl = map.get(key);
               tl.add(strs[i]);
               map.put(key,tl);
           } else {
               ArrayList<String> tl = new ArrayList<String>();
               tl.add(strs[i]);
               map.put(key,tl);
           }
        }
        
       return  new ArrayList<List<String>>(map.values());
    }

}
